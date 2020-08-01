package com.xmsy.server.zxyy.manager.modules.app.share;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xmsy.server.zxyy.manager.common.exception.RRException;
import com.xmsy.server.zxyy.manager.common.utils.ErrorCode;
import com.xmsy.server.zxyy.manager.common.utils.R;
import com.xmsy.server.zxyy.manager.modules.app.share.param.ShareParam;
import com.xmsy.server.zxyy.manager.modules.manager.sharerecord.service.ShareRecordService;
import com.xmsy.server.zxyy.manager.modules.manager.user.entity.UserEntity;
import com.xmsy.server.zxyy.manager.modules.manager.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("V1.0/App")
public class AppShareController {
	
	@Autowired
	private ShareRecordService shareRecordService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 分享APP一次奖励（奖励金币）
	 * 
	 * @throws Exception
	 */
	@PostMapping("/Share")
	public R updateUserInformation(@RequestHeader("token") String token, @RequestBody ShareParam param)
			throws Exception {
		log.info("[分享App一次奖励金币] token {} param {}", token, param);
		UserEntity entity = userService.selectUserForToken(token);
		if (entity == null || entity.getId() == null) {
			throw new RRException(ErrorCode.UserErrorCode.TOKEN_INVALID_LOSE.getErrMsg(),
					ErrorCode.UserErrorCode.TOKEN_INVALID_LOSE.getCode());
		}
		shareRecordService.shareAppGetCoin(param,entity);
		return R.ok();
	}

}