/*
Navicat MySQL Data Transfer

Source Server         : 华庭
Source Server Version : 50560
Source Host           : 47.92.114.198:3306
Source Database       : wuye

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-07-23 10:24:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `plate_config`
-- ----------------------------
DROP TABLE IF EXISTS `plate_config`;
CREATE TABLE `plate_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `dev_district_id` int(11) NOT NULL DEFAULT '0' COMMENT '设备小区id',
  `dev_district_model` char(1) NOT NULL DEFAULT '0' COMMENT '小区运行模式(0普通模式1封闭模式)',
  `car_number` int(11) NOT NULL DEFAULT '0' COMMENT '车位数量',
  `foreign_control` char(1) NOT NULL DEFAULT '0' COMMENT '没车位时是否控制外来车辆(0没车位也允许1没车位时不允许)',
  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车牌识别配置表';





/**********************  logback 日志异步数据库中 *******************************/

BEGIN;
DROP TABLE IF EXISTS logging_event_property;
DROP TABLE IF EXISTS logging_event_exception;
DROP TABLE IF EXISTS logging_event;
COMMIT;


BEGIN;
CREATE TABLE logging_event
  (
    timestmp         BIGINT NOT NULL,
    formatted_message  TEXT NOT NULL,
    logger_name       VARCHAR(254) NOT NULL,
    level_string      VARCHAR(254) NOT NULL,
    thread_name       VARCHAR(254),
    reference_flag    SMALLINT,
    arg0              VARCHAR(254),
    arg1              VARCHAR(254),
    arg2              VARCHAR(254),
    arg3              VARCHAR(254),
    caller_filename   VARCHAR(254) NOT NULL,
    caller_class      VARCHAR(254) NOT NULL,
    caller_method     VARCHAR(254) NOT NULL,
    caller_line       CHAR(4) NOT NULL,
    event_id          BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
  )ENGINE=INNODB DEFAULT CHARSET=utf8 ;
COMMIT;

BEGIN;
CREATE TABLE logging_event_property
  (
    event_id          BIGINT NOT NULL,
    mapped_key        VARCHAR(254) NOT NULL,
    mapped_value      TEXT,
    PRIMARY KEY(event_id, mapped_key),
    FOREIGN KEY (event_id) REFERENCES logging_event(event_id)
  )ENGINE=INNODB DEFAULT CHARSET=utf8 ;
COMMIT;

BEGIN;
CREATE TABLE logging_event_exception
  (
    event_id         BIGINT NOT NULL,
    i                SMALLINT NOT NULL,
    trace_line       VARCHAR(254) NOT NULL,
    PRIMARY KEY(event_id, i),
    FOREIGN KEY (event_id) REFERENCES logging_event(event_id)
  )ENGINE=INNODB DEFAULT CHARSET=utf8 ;
COMMIT;

/**********************  logback 自定义 *******************************/

DROP TABLE IF EXISTS `logging`;
CREATE TABLE `logging` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `message` longtext NULL  COMMENT '详情',
  `level_string` VARCHAR(254) NOT NULL COMMENT '级别',
  `created_time` DATETIME NOT NULL COMMENT '时间',
  `logger_name` VARCHAR(300) NOT NULL COMMENT '全类名',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='自定义日志记录表'

/**********************  logback 自定义 *******************************/


/**********************  logback 日志异步数据库中 *******************************/

-- ----------------------------
-- Records of plate_config
-- ----------------------------

-- ----------------------------
-- Table structure for `plate_device`
-- ----------------------------
DROP TABLE IF EXISTS `plate_device`;
CREATE TABLE `plate_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `company_id` int(11) NOT NULL DEFAULT '0' COMMENT '公司id(总后台分配)',
  `he_id` int(11) NOT NULL DEFAULT '0' COMMENT '项目id(总后台分配)',
  `dev_district_id` int(11) NOT NULL DEFAULT '0' COMMENT '物联小区id',
  `device_name` varchar(50) NOT NULL DEFAULT '' COMMENT '设备名称',
  `device_desc` varchar(200) NOT NULL DEFAULT '' COMMENT '说明',
  `device_serial` varchar(50) NOT NULL DEFAULT '' COMMENT '设备序列号',
  `ip` varchar(20) NOT NULL COMMENT '车牌设备ip',
  `port` int(10) NOT NULL DEFAULT '0' COMMENT '车牌设备端口',
  `serialno` varchar(20) NOT NULL COMMENT '车牌设备序列号',
  `user_name` varchar(20) NOT NULL COMMENT '车牌设备用户名',
  `pass_wd` varchar(20) NOT NULL COMMENT '车牌设备密码',
  `channel_num` int(11) NOT NULL DEFAULT '0' COMMENT '车牌设备序通道号',
  `heart_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '心跳时间',
  `in_out` int(11) NOT NULL DEFAULT '0' COMMENT '标明设备是进口还是出口 1：进 2 出',
  `longitude` decimal(15,10) NOT NULL DEFAULT '0.0000000000' COMMENT '经度',
  `latitude` decimal(15,10) NOT NULL DEFAULT '0.0000000000' COMMENT '纬度',
  `online` char(1) DEFAULT '0' COMMENT '在线状态 1在线 0不在线',
  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车牌识别设备表';


-- ----------------------------
DROP TABLE IF EXISTS `plate_device_log`;
CREATE TABLE `plate_device_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `device_id` int(11) NOT NULL DEFAULT '0' COMMENT '车牌识别设备id',
  `log_type` varchar(10) NOT NULL DEFAULT '' COMMENT '车牌识别日志类型 onLine上线 offLine下线',
  `log_desc` varchar(200) NOT NULL DEFAULT '' COMMENT '说明',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车牌识别设备日志';


-- ----------------------------
-- Records of plate_device
-- ----------------------------

-- ----------------------------
-- Table structure for `plate_fees_config`
-- ----------------------------
DROP TABLE IF EXISTS `plate_fees_config`;
CREATE TABLE `plate_fees_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `dev_district_id` int(11) NOT NULL DEFAULT '0' COMMENT '设备小区id',
  `min_time` int(11) NOT NULL DEFAULT '0' COMMENT '区域时间最小小时数',
  `max_time` int(11) NOT NULL DEFAULT '0' COMMENT '区域时间最大小时数',
  `money` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '区域金额',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序 0前 999后',
  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收费规则表';

-- ----------------------------
-- Records of plate_fees_config
-- ----------------------------

/**************************  车位租赁 ************************************/
DROP TABLE IF EXISTS `plate_lease_config`;
CREATE TABLE `plate_lease_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `item_id` int(11) NOT NULL DEFAULT 0 COMMENT '项目id',
  `lease_model` char(1) NOT NULL DEFAULT 'D' COMMENT '租赁模式（ D天  W星期 M月 S季 Y年）',
  `money` decimal(20,2) NOT NULL DEFAULT 0.00 COMMENT '区域金额',

  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0正常 1删除）',
  `version` int(11) NOT NULL DEFAULT 0 COMMENT '版本控制(乐观锁)',
  `create_userid` int(11) NOT NULL DEFAULT 0 COMMENT '创建人id',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT 0 COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='租赁规则表';


DROP TABLE IF EXISTS `plate_car_lease`;
CREATE TABLE `plate_car_lease` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `lease_no` varchar(50) NOT NULL DEFAULT '' COMMENT '租赁单号',
  `uid` int(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `item_id` int(11) NOT NULL DEFAULT 0 COMMENT '项目id',
  `license` varchar(20) NOT NULL DEFAULT '' COMMENT '车牌号',
  `lease_model` char(1) NOT NULL DEFAULT 'D' COMMENT '租赁模式（ D天  W星期 M月 S季 Y年）',
  `start_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '开始时间',
  `end_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '过期时间',
  `lease_status` char(1) NOT NULL DEFAULT '0' COMMENT '租赁状态（0等待 1成功）',

  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0正常 1删除）',
  `version` int(11) NOT NULL DEFAULT 0 COMMENT '版本控制(乐观锁)',
  `create_userid` int(11) NOT NULL DEFAULT 0 COMMENT '创建人id',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT 0 COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='车牌租赁信息表';


DROP TABLE IF EXISTS `plate_order`;
CREATE TABLE `plate_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `order_no` varchar(50) NOT NULL DEFAULT '' COMMENT '订单号',
  `lease_no` varchar(50) NOT NULL DEFAULT '' COMMENT '租赁单号',
  `item_id` int(11) NOT NULL DEFAULT 0 COMMENT '项目id',
  `pay_type` char(1) NOT NULL DEFAULT 'W' COMMENT '支付类型( W微信支付  /  Z支付宝支付  /  Y余额支付)',
  `pay_no` varchar(50) NOT NULL DEFAULT '' COMMENT '支付单号(微信/支付宝)',
  `payment` decimal(12,2) NOT NULL DEFAULT 0.00 COMMENT '充值金额/支付金额',
  `pay_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '支付时间',
  `pay_callback_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '支付回调时间',

  `reserve_one` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段1',
  `reserve_two` varchar(20) NOT NULL DEFAULT '' COMMENT '备用字段2',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0正常 1删除）',
  `version` int(11) NOT NULL DEFAULT 0 COMMENT '版本控制(乐观锁)',
  `create_userid` int(11) NOT NULL DEFAULT 0 COMMENT '创建人id',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT 0 COMMENT '修改人id',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='订单列表';

/**************************  车位租赁 ************************************/

-- ----------------------------
-- Table structure for `plate_owner_car_number`
-- ----------------------------
DROP TABLE IF EXISTS `plate_owner_car_number`;
CREATE TABLE `plate_owner_car_number` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `car_number` varchar(20) NOT NULL DEFAULT '' COMMENT '车牌ID',
  `car_type` int(2) NOT NULL DEFAULT '0' COMMENT '车牌类型 0：未知车牌:、1：蓝牌小汽车、2：:黑牌小汽车、3：单排黄牌、4：双排黄牌、 5：警车车牌、6：武警车牌、7：个性化车牌、8：单排军车牌、9：双排军车牌、10：使馆车牌、11：香港进出中国大陆车牌、12：农用车牌、13：教练车牌、14：澳门进出中国大陆车牌、15：双层武警车牌、16：武警总队车牌、17：双层武警总队车牌、18：民航车牌、19：新能源车牌',
  `plate_color` int(2) NOT NULL DEFAULT '0' COMMENT '车牌颜色 0：未知、1：蓝色、2：黄色、3：白色、4：黑色、5：绿色',
  `car_color` int(2) NOT NULL DEFAULT '0' COMMENT '车身颜色 预留',
  `vip_type` int(2) NOT NULL DEFAULT '0' COMMENT 'vip类型 0：普通车牌 1：月租车 2：星租车 3：季租车 4：年租车',
  `start_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '开始时间',
  `end_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '过期时间',
  `member_id` int(11) NOT NULL DEFAULT '0' COMMENT 'app用户id',
  `mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '车主电话号码',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '车主姓名',
  `he_id` int(11) NOT NULL DEFAULT '0' COMMENT '小区ID',
  `company_id` int(11) NOT NULL DEFAULT '0' COMMENT '公司ID',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `is_del` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人ID',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人ID',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业主车牌信息表';

-- ----------------------------
-- Records of plate_owner_car_number
-- ----------------------------

-- ----------------------------
-- Table structure for `plate_record`
-- ----------------------------
DROP TABLE IF EXISTS `plate_record`;
CREATE TABLE `plate_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `license` varchar(20) NOT NULL DEFAULT '' COMMENT '车牌号',
  `vip` varchar(20) NOT NULL DEFAULT '' COMMENT 'vip 名称',
  `i_serialno` varchar(20) NOT NULL DEFAULT '' COMMENT '入口设备序列号',
  `o_serialno` varchar(20) NOT NULL DEFAULT '' COMMENT '出口设备序列号',
  `i_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入口时间',
  `o_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '出口时间',
  `money` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '支付金额',
  `in_out` char(1) NOT NULL DEFAULT '0' COMMENT '状态（1进口 2出口 3异常, 4待支付 5已支付）',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `is_del` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最新动态时间',
  `pay_no` varchar(50) NOT NULL DEFAULT '' COMMENT '支付记录id',
  `he_id` int(11) NOT NULL DEFAULT '0' COMMENT '小区id',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  `company_id` int(11) NOT NULL DEFAULT '0' COMMENT '公司ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆进出记录';

-- ----------------------------
-- Records of plate_record
-- ----------------------------

-- ----------------------------
-- Table structure for `plate_visitor_car_number`
-- ----------------------------
DROP TABLE IF EXISTS `plate_visitor_car_number`;
CREATE TABLE `plate_visitor_car_number` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `he_id` int(11) NOT NULL DEFAULT '0' COMMENT '小区ID',
  `company_id` int(11) NOT NULL DEFAULT '0' COMMENT '公司ID',
  `car_number` varchar(20) NOT NULL DEFAULT '' COMMENT '车牌ID',
  `start_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '开始时间',
  `end_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '过期时间',
  `member_id` int(11) NOT NULL DEFAULT '0' COMMENT 'app用户id',
  `mobile` varchar(11) NOT NULL DEFAULT '' COMMENT '车主电话号码',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '车主姓名',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `is_del` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除（0存在 1删除）',
  `build_userid` int(11) NOT NULL DEFAULT '0' COMMENT '创建人ID',
  `build_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_userid` int(11) NOT NULL DEFAULT '0' COMMENT '修改人ID',
  `update_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `remark` varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='访客车牌信息表';

-- ----------------------------
-- Records of plate_visitor_car_number
-- ----------------------------
