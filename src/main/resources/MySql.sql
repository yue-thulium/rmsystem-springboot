DROP DATABASE rmsystem;
CREATE DATABASE rmsystem;

USE rmsystem;

/*管理系统登录表
 *enable 默认值为1，表示可用
 *locked 默认值为0，表示未锁定
*/
CREATE TABLE rm
(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户编号',
	NAME VARCHAR(32) NOT NULL COMMENT '用户姓名',
	username VARCHAR(32) NOT NULL COMMENT '用户名',
	PASSWORD VARCHAR(100) NOT NULL COMMENT '密码',
	ENABLE TINYINT NOT NULL DEFAULT 1 COMMENT '有效状态',
	locked TINYINT NOT NULL DEFAULT 0 COMMENT '锁定状态'
);

INSERT INTO rm VALUES(DEFAULT,'系统管理员','admin','$2a$10$ySG2lkvjFHY5O0./CPIE1OI8VJsuKYEzOYzqIa7AJR6sEgSzUFOAm',DEFAULT,DEFAULT);
INSERT INTO rm VALUES(3,'李柏','libai','$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.',DEFAULT,DEFAULT);
/*权限表
 *name 以 ROLE_ 开头代表的权限
 *nameZH 权限对应名称
*/
CREATE TABLE role
(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '权限编号',
	NAME VARCHAR(32) NOT NULL COMMENT '用户权限',
	nameZH VARCHAR(32) NOT NULL COMMENT '权限名称'
);

INSERT INTO role VALUES(DEFAULT,'ROLE_dba','数据库管理员');
INSERT INTO role VALUES(DEFAULT,'ROLE_admin','系统管理员');
INSERT INTO role VALUES(DEFAULT,'ROLE_user','用户');

/*权限分配表
 *通过rm及role的id作为外键
*/
CREATE TABLE rm_role
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	rmid INT NOT NULL,
	roleid INT NOT NULL,
	CONSTRAINT FOREIGN KEY(rmid) REFERENCES rm(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FOREIGN KEY(roleid) REFERENCES role(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO rm_role VALUES(DEFAULT,1,1);
INSERT INTO rm_role VALUES(DEFAULT,3,3);

/*菜单表
 *url 请求路径规则
 *path 路由path
 *component 组件名称
 *name 组件名
 *iconCls 菜单图标
 *keepAlive 菜单切换时是否保活
 *requireAuth 是否登陆后才能访问
 *parentId 外键，父菜单id
 *enable 是否可用，默认值为1表示可用
*/
CREATE TABLE `menu` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`url` VARCHAR(64) NULL DEFAULT NULL,
	`path` VARCHAR(64) NULL DEFAULT NULL,
	`component` VARCHAR(64) NULL DEFAULT NULL,
	`name` VARCHAR(64) NULL DEFAULT NULL,
	`iconCls` VARCHAR(64) NULL DEFAULT NULL,
	`keepAlive` TINYINT(1) NULL DEFAULT NULL,
	`requireAuth` TINYINT(1) NULL DEFAULT NULL,
	`parentId` INT(11) NULL DEFAULT NULL,
	`enabled` TINYINT(1) NULL DEFAULT '1',
	PRIMARY KEY (`id`),
	INDEX `parentId` (`parentId`),
	CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parentId`) REFERENCES `menu` (`id`) ON UPDATE CASCADE ON DELETE CASCADE
);

/*主菜单根目录节点*/
INSERT INTO menu VALUES(DEFAULT,'/',NULL,NULL,'所有',NULL,NULL,NULL,NULL,'1');
INSERT INTO menu VALUES(DEFAULT,'/','/home','Home','主页',NULL,NULL,'1','1','1');
/*INSERT INTO roadcheck_menu VALUES(DEFAULT,'/',NULL,NULL,'所有',NULL,NULL,NULL,NULL,'1');*/
INSERT INTO menu VALUES(DEFAULT,'/','/RoadCheck','RoadCheck','日常巡查',NULL,NULL,'1','1','1');
INSERT INTO menu VALUES(DEFAULT,'/','/RoadCheck','RoadCheck','定期检查',NULL,NULL,'1','1','1');
INSERT INTO menu VALUES(DEFAULT,'/','/RoadCheck','RoadCheck','特殊检测',NULL,NULL,'1','1','1');
/*日常巡逻/dailyPatrol*/
INSERT INTO menu VALUES(DEFAULT,'/dailyPatrol/classIRoad/**','/dp/c1r','dpclassIRoad','I类道路',NULL,NULL,'1','3','1');
INSERT INTO menu VALUES(DEFAULT,'/dailyPatrol/classIIRoad/**','/dp/c2r','dpclassIIRoad','II类道路',NULL,NULL,'1','3','1');
INSERT INTO menu VALUES(DEFAULT,'/dailyPatrol/classIIIRoad/**','/dp/c3r','dpclassIIIRoad','III类道路',NULL,NULL,'1','3','1');
/*定期检查/regularInspection*/
INSERT INTO menu VALUES(DEFAULT,'/regularInspection/conventionalDetection/**','/ri/cd','riconventionalDetection','常规检查',NULL,NULL,'1','4','1');
INSERT INTO menu VALUES(DEFAULT,'/regularInspection/structDetection/**','/ri/sd','ristructDetection','结构强度检测',NULL,NULL,'1','4','1');
/*定期检查/specialTest*/
INSERT INTO menu VALUES(DEFAULT,'/specialTest/unknow1','/st/un1','stunknow1','第一段',NULL,NULL,'1','5','1');
INSERT INTO menu VALUES(DEFAULT,'/specialTest/unknow2','/st/un2','stunknow2','第二段',NULL,NULL,'1','5','1');
INSERT INTO menu VALUES(DEFAULT,'/specialTest/unknow3','/st/un3','stunknow3','第三段',NULL,NULL,'1','5','1');

/*菜单角色关联表
 *mid 菜单id
 *rid 角色id
*/
CREATE TABLE `menu_role` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`mid` INT(11) NULL DEFAULT NULL,
	`rid` INT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `mid` (`mid`),
	INDEX `rid` (`rid`),
	CONSTRAINT `menu_role_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `menu` (`id`) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT `menu_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`) ON UPDATE CASCADE ON DELETE CASCADE
);

USE rmsystem;
INSERT INTO menu_role VALUES(DEFAULT,6,3);
INSERT INTO menu_role VALUES(DEFAULT,7,3);
INSERT INTO menu_role VALUES(DEFAULT,8,3);
INSERT INTO menu_role VALUES(DEFAULT,9,3);
INSERT INTO menu_role VALUES(DEFAULT,10,3);
INSERT INTO menu_role VALUES(DEFAULT,11,3);
INSERT INTO menu_role VALUES(DEFAULT,12,3);
INSERT INTO menu_role VALUES(DEFAULT,13,3);

USE rmsystem;
SELECT * FROM menu;
SELECT * FROM menu_role;
SELECT * FROM rm;
SELECT * FROM rm_role;
SELECT * FROM role;

select r.* from role r,rm_role rr where r.id=rr.roleid and rr.rmid=3;