INSERT INTO `webhome`.`sys_menu` ( `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`) VALUES ( '497', '会员总数量', NULL, 'userstatistics:userstatistics:sumInsertUserNumber,userstatistics:userstatistics:weekInsertUserNumber,userstatistics:userstatistics:yesterdayInsertUserNumber,userstatistics:userstatistics:todayInsertUserNumber', '2', NULL, '0');
INSERT INTO `webhome`.`sys_menu` ( `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`) VALUES ( '731', '首页统计', NULL, 'rechargestatistics:rechargestatistics:sumRechargeAmount,rechargestatistics:rechargestatistics:sumThirdRechargeAmount,rechargestatistics:rechargestatistics:sumBankRechargeAmount,rechargestatistics:rechargestatistics:sumTodayRechargeAmount,rechargestatistics:rechargestatistics:sumYesterdayRechargeAmount,rechargestatistics:rechargestatistics:sumWeekRechargeAmount', '2', NULL, '0');
INSERT INTO `webhome`.`sys_menu` ( `parent_id`, `name`, `url`, `perms`, `type`, `icon`, `order_num`) VALUES ( '18', '在线人数', NULL, 'userstatistics:userstatistics:getLoginCountByDeviceType', '2', NULL, '0');