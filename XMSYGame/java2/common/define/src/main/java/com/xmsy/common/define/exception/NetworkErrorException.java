package com.xmsy.common.define.exception;

import com.xmsy.common.define.constant.ResultDef;

/**
 * 
 * .网络错误
 *
 * @author chenjisi
 * @date 2017年12月1日 下午2:34:03
 * @Description: TODO
 */
public class NetworkErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private static final String EXCEPTION = ResultDef.NETWORK_ERROR_MSG;

	private String msg = ResultDef.NETWORK_ERROR_MSG;

	private Integer code = ResultDef.NETWORK_ERROR_CODE;

	public NetworkErrorException() {
		super(EXCEPTION);
	}

	public NetworkErrorException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public NetworkErrorException(Integer code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public NetworkErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public NetworkErrorException(Throwable cause) {
		super(cause);
	}

	public NetworkErrorException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public String getMsg() {
		return msg;
	}

	public Integer getCode() {
		return code;
	}
}