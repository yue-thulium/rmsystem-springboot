USE rmsystem;
-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.asphalt_pavement_table 结构
CREATE TABLE IF NOT EXISTS `asphalt_pavement_table` (
  `asphalt_pavement_code` int(11) NOT NULL COMMENT '沥青路面损坏编号',
  `worker_code` int(11) NOT NULL COMMENT '检查人员编号',
  `damage_code` int(11) NOT NULL COMMENT '路面损害记录编号',
  `d_type` varchar(15) NOT NULL COMMENT '损坏类型',
  `inspect_areas` float NOT NULL COMMENT '检查面积',
  `d_areas` float NOT NULL COMMENT '损坏面积',
  `d_density` float NOT NULL COMMENT '损坏密度',
  `single_point_deduction` float NOT NULL COMMENT '单项扣分值',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `inspect_date` date NOT NULL COMMENT '检查日期',
  PRIMARY KEY (`asphalt_pavement_code`),
  KEY `worker_code_asphalt` (`worker_code`),
  KEY `damage_code_asphalt` (`damage_code`),
  KEY `d_type_asphalt` (`d_type`),
  CONSTRAINT `d_type_asphalt` FOREIGN KEY (`d_type`) REFERENCES `damage_road_type` (`cement_type`),
  CONSTRAINT `damage_code_asphalt` FOREIGN KEY (`damage_code`) REFERENCES `road_damage_table` (`damage_code`),
  CONSTRAINT `worker_code_asphalt` FOREIGN KEY (`worker_code`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='沥青路面损坏调查表';

-- 正在导出表  道路.asphalt_pavement_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `asphalt_pavement_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `asphalt_pavement_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.cement_road_damage_table 结构
CREATE TABLE IF NOT EXISTS `cement_road_damage_table` (
  `cement_road_code` int(11) NOT NULL COMMENT '水泥混凝土路面损坏编号',
  `work_code` int(11) NOT NULL COMMENT '调查人员',
  `damage_code` int(11) NOT NULL COMMENT '损坏记录编号',
  `d_type` varchar(15) NOT NULL COMMENT '损坏类型',
  `inspect_arears` float NOT NULL COMMENT '检查面积',
  `damage_areas` float NOT NULL COMMENT '损坏面积',
  `d_density` float NOT NULL COMMENT '损坏密度',
  `single_point_deduction` float NOT NULL COMMENT '单项扣分值',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `check_date` date NOT NULL COMMENT '检查日期',
  PRIMARY KEY (`cement_road_code`),
  KEY `damage_code_cement` (`damage_code`),
  KEY `worker_code_cement` (`work_code`),
  KEY `d_type_cement` (`d_type`),
  CONSTRAINT `d_type_cement` FOREIGN KEY (`d_type`) REFERENCES `damage_road_type` (`cement_type`),
  CONSTRAINT `damage_code_cement` FOREIGN KEY (`damage_code`) REFERENCES `road_damage_table` (`damage_code`),
  CONSTRAINT `worker_code_cement` FOREIGN KEY (`work_code`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='水泥混凝土路面损坏调查表';

-- 正在导出表  道路.cement_road_damage_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cement_road_damage_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `cement_road_damage_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.damage_facilities_notice 结构
CREATE TABLE IF NOT EXISTS `damage_facilities_notice` (
  `notice_code` int(11) NOT NULL COMMENT '通知号',
  `facilities_name` varchar(10) NOT NULL COMMENT '设施名称',
  `damage_position` varchar(10) NOT NULL COMMENT '损坏部位',
  `damage_reason` varchar(20) NOT NULL COMMENT '损坏原因',
  `opinions` varchar(20) DEFAULT NULL COMMENT '处理意见',
  `repair_date` date DEFAULT NULL COMMENT '整修日期',
  `notice_date` date NOT NULL COMMENT '通知日期',
  `班` varchar(50) DEFAULT NULL COMMENT '班',
  `technical_person` int(11) DEFAULT NULL COMMENT '技术人员编号',
  `check_person` int(11) NOT NULL COMMENT '巡查人员编号',
  PRIMARY KEY (`notice_code`),
  KEY `technical_person_notice` (`technical_person`),
  KEY `check_person_notice` (`check_person`),
  CONSTRAINT `check_person_notice` FOREIGN KEY (`check_person`) REFERENCES `worker` (`worker_code`),
  CONSTRAINT `technical_person_notice` FOREIGN KEY (`technical_person`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='损坏设施通知表';

-- 正在导出表  道路.damage_facilities_notice 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `damage_facilities_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `damage_facilities_notice` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.damage_road_type 结构
CREATE TABLE IF NOT EXISTS `damage_road_type` (
  `cement_type` varchar(15) NOT NULL COMMENT '损坏类型',
  `d_shape` varchar(50) NOT NULL COMMENT '损坏形状',
  `caculating_method` varchar(50) DEFAULT NULL COMMENT '计算方法',
  PRIMARY KEY (`cement_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='损坏类型参照表';

-- 正在导出表  道路.damage_road_type 的数据：~21 rows (大约)
/*!40000 ALTER TABLE `damage_road_type` DISABLE KEYS */;
INSERT INTO `damage_road_type` (`cement_type`, `d_shape`, `caculating_method`) VALUES
	('其他类唧浆', '路表与检查井框顶面的相对高差(高或低)', '按实际面积计算。按长(m)X宽(m)计量'),
	('其他类泛油', '高温季节沥青被挤出，表面形成薄油层，行车出现轮迹', '按面积计算。按长(m) X宽(m)计量'),
	('其他类路框差', '路表与检查井框顶面的相对高差(高或低)', '按实际面积计算。按长(m)X宽(m)计量'),
	('其他类错台', '在接缝或裂缝两边出现高差', '高差大于或等于15mm。按错台板块的边长(m) X 1m计量'),
	('变形类沉陷', '路面局部下沉', '在3m直尺范围内沉陷深度大于10mm。按长(m) X宽(m)计量'),
	('变形类翻浆', '路面、路基湿软出现弹簧、破裂、冒泥浆现象', '按面积计算。按长(m) X宽(m)计量'),
	('变形类车辙', '在行车作用下沿车轮带形成的相对于两侧的凹槽', '以3m直尺横向测量。凹槽深大于15mm时，按车辙长度(m) X车道(轮迹)全宽(m)计量'),
	('接缝破坏类接缝料损坏', '填縫料剥落、挤出、老化和缝内无填缝料', '散失深度在表面下大于或等于5mm。按长度X1m计'),
	('接缝破坏类边角剥落', '临近接缝0. 6m内，或板角0.15m内，混凝土开裂或成碎块', '按其外边界长(m) X宽(m)计量'),
	('松散类剥落', '麻面、脱皮和松散等面层损失类', '面层材料散失深度不大于20mm。外围面积小于0.1m²不计。按散失范围长度(m) X宽度(m)计量'),
	('松散类啃边', '由于行车荷载作用致使路面边缘出现损坏', '路面边缘材料剥落破损或形成坑洞，凸凹差大于5mm。按长(m) X宽(m)计量'),
	('松散类坑槽', '路面材料散失后形成的凹坑', '路面材料散失形成坑洞，凹坑深度大于或等于20mm。按长(m) X宽(m)计量'),
	('表面破坏类坑洞', '面板表面出现直径为25mm~ 100mm,深为1l2mm~50mm的坑洞', '按外围面积计'),
	('表面破坏类层状剥落', '路面表面有层状剥落', '按一边平行于道路中心线的外接矩形面积计量'),
	('表面破坏类表面纹裂', '路面表面有网状浅而细的裂纹', '按一边平行于道路中心线的外接矩形面积计量'),
	('裂缝类交叉裂缝和破碎板', '裂缝将板分成三块或三块以上', '按其外边界长(m) X宽(m)计量'),
	('裂缝类板角断裂', '垂直贯穿整块板厚，与接缝相交的裂缝。板角到裂缝两端的距离小于或等于板长的一半', '按板角到裂缝两端的距离乘积计量'),
	('裂缝类线裂', '单根/条裂缝，包括横缝、纵缝以及斜缝等', '缝裂长度大于或等于1m，宽度大于或等于3mm。按缝裂长（m）×0.2（m）计量'),
	('裂缝类网裂', '交错裂缝，把路面分割成近似矩阵的块，网块直径小于3m', '按一边平行于道路中心线的外接矩形面积计量'),
	('裂缝类边角裂缝', '与接缝、自由边或线裂平行的新月形裂缝，细小裂缝处呈暗色', '按裂缝平行于接缝或自由边的外接矩形面积计量'),
	('裂缝类龟裂', '裂缝成片出现，缝间路面已裂成碎块，碎块直径小于0.5m。包括井边碎裂', '开裂成网格状，外围面积小于或等于1m²不计，井框面积不计。按其外边界长（m）×宽（m）计量');
/*!40000 ALTER TABLE `damage_road_type` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.divideer_band_table 结构
CREATE TABLE IF NOT EXISTS `divideer_band_table` (
  `divider_code` int(11) NOT NULL COMMENT '分隔带编号',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `divider_type` varchar(10) DEFAULT NULL COMMENT '分隔带类型',
  `length` float DEFAULT NULL,
  `width` float DEFAULT NULL,
  `height` float DEFAULT NULL,
  `areas` float DEFAULT NULL,
  PRIMARY KEY (`divider_code`),
  KEY `road_code_divider` (`road_code`),
  CONSTRAINT `road_code_divider` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分隔带信息';

-- 正在导出表  道路.divideer_band_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `divideer_band_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `divideer_band_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.facilities_table 结构
CREATE TABLE IF NOT EXISTS `facilities_table` (
  `facilities_code` int(11) NOT NULL COMMENT '设施编号',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `inlets_amount` int(11) DEFAULT NULL COMMENT '雨水口数量',
  `well_amount` int(11) DEFAULT NULL COMMENT '检查井口数量',
  `nameplates_amount` int(11) DEFAULT NULL COMMENT '路名牌数量',
  `signboards_amount` int(11) DEFAULT NULL COMMENT '标致牌数量',
  `treepool_area` float DEFAULT NULL COMMENT '树池面积',
  `other` varchar(50) DEFAULT NULL COMMENT '其他',
  PRIMARY KEY (`facilities_code`),
  KEY `road_code_facilities` (`road_code`),
  CONSTRAINT `road_code_facilities` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设施表';

-- 正在导出表  道路.facilities_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `facilities_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `facilities_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.facilities_yearly_report 结构
CREATE TABLE IF NOT EXISTS `facilities_yearly_report` (
  `check_date` date NOT NULL COMMENT '检查日期',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `evaluation_index` float NOT NULL COMMENT '评价综合指数PQI',
  `planeness` float NOT NULL COMMENT '平整度RQI',
  `damage_condition` varchar(50) DEFAULT NULL COMMENT '破损状况',
  PRIMARY KEY (`check_date`),
  KEY `road_code_report` (`road_code`),
  CONSTRAINT `road_code_report` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设施分类年报';

-- 正在导出表  道路.facilities_yearly_report 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `facilities_yearly_report` DISABLE KEYS */;
/*!40000 ALTER TABLE `facilities_yearly_report` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.regular_inspection_table 结构
CREATE TABLE IF NOT EXISTS `regular_inspection_table` (
  `regular_code` int(11) NOT NULL COMMENT '定期检查记录编号',
  `regular_date` date NOT NULL COMMENT '定期检查日期',
  `regular_type` varchar(10) NOT NULL COMMENT '检查类型',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`regular_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定期检查记录表';

-- 正在导出表  道路.regular_inspection_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `regular_inspection_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `regular_inspection_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.road_basic_table 结构
CREATE TABLE IF NOT EXISTS `road_basic_table` (
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `username` int(11) DEFAULT NULL COMMENT '片区账号',
  `road_name` varchar(10) NOT NULL COMMENT '道路名称',
  `road_trend` varchar(10) NOT NULL COMMENT '道路走向',
  `road_begin` varchar(10) NOT NULL COMMENT '道路起点',
  `road_end` varchar(10) NOT NULL COMMENT '道路终点',
  `design_unite` varchar(10) NOT NULL COMMENT '设计单位',
  `construction_unite` varchar(10) NOT NULL COMMENT '建造单位',
  `road_class` varchar(10) NOT NULL COMMENT '道路等级PQI',
  `pavement_class` varchar(4) NOT NULL COMMENT '路面等级RQI',
  `yanghu_class` varchar(10) NOT NULL COMMENT '养护等级',
  `road_width_range` varchar(10) DEFAULT NULL COMMENT '道路宽度范围',
  `road_length` float DEFAULT NULL COMMENT '道路长度',
  `road_area` float DEFAULT NULL COMMENT '道路面积',
  `AADT` float DEFAULT NULL,
  `traffic_class` varchar(4) DEFAULT NULL COMMENT '交通量等级',
  `town` varchar(10) NOT NULL COMMENT '所属乡镇',
  `manage_sort` varchar(10) DEFAULT NULL COMMENT '管理分类',
  `manage_unite` varchar(10) NOT NULL COMMENT '管理单位',
  `maintenance_unite` varchar(10) NOT NULL COMMENT '养护单位',
  `build_date` date NOT NULL COMMENT '建造年月',
  `table_unite` varchar(10) DEFAULT NULL COMMENT '制表单位',
  `auditor` varchar(10) DEFAULT NULL COMMENT '审核人',
  `table_maker` varchar(10) DEFAULT NULL COMMENT '制表人',
  `table_make_time` date DEFAULT NULL COMMENT '制表日期',
  `road_prevent` varchar(10) DEFAULT NULL COMMENT '道路预警',
  PRIMARY KEY (`road_code`),
  KEY `username_road` (`username`),
  CONSTRAINT `username_road` FOREIGN KEY (`username`) REFERENCES `admin` (`uername`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  道路.road_basic_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `road_basic_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `road_basic_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;


-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.road_car_table 结构
CREATE TABLE IF NOT EXISTS `road_car_table` (
  `car_code` int(11) NOT NULL COMMENT '车行道编号',
  `road_code` int(11) DEFAULT NULL COMMENT '道路编号',
  `pavement_type` varchar(10) NOT NULL COMMENT '路面类型',
  `pavement_thickness` varchar(10) DEFAULT NULL COMMENT '路面厚度',
  `grassroots_type` varchar(10) DEFAULT NULL COMMENT '基层类型',
  `grassroots_thickness` varchar(10) DEFAULT NULL COMMENT '基层厚度',
  `lanes` int(11) NOT NULL COMMENT '车道数',
  `direction` varchar(10) NOT NULL COMMENT '通行方向',
  `motorway_width_range` varchar(10) DEFAULT NULL COMMENT '机动车道宽度',
  `r_m_w_r` varchar(10) DEFAULT NULL COMMENT '右侧非机动车道宽度范围',
  `l_m_w_r` varchar(10) DEFAULT NULL COMMENT '左侧非机动车道宽度范围',
  `lane_areas` float DEFAULT NULL COMMENT '车行道面积',
  `lateral_rock_type` varchar(10) DEFAULT NULL COMMENT '侧石类型',
  `lateral_rock_length` float DEFAULT NULL COMMENT '侧石长度',
  `flat_rock_type` varchar(10) DEFAULT NULL COMMENT '平石类型',
  `flat_rock_length` float DEFAULT NULL COMMENT '平石长度',
  PRIMARY KEY (`car_code`),
  KEY `road_code_car` (`road_code`),
  CONSTRAINT `road_code_car` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车行道信息';

-- 正在导出表  道路.road_car_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `road_car_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `road_car_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.road_damage_table 结构
CREATE TABLE IF NOT EXISTS `road_damage_table` (
  `damage_code` int(11) NOT NULL COMMENT '路面损害记录编号',
  `worker_code` int(11) NOT NULL COMMENT '检查人员编号',
  `regular_code` int(11) NOT NULL COMMENT '检查记录编号',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `check_date` date NOT NULL COMMENT '检查日期',
  `begin_end` varchar(20) NOT NULL COMMENT '起止位置',
  `length` float NOT NULL COMMENT '长度',
  `width` float NOT NULL COMMENT '检查总宽',
  `damage_type` varchar(10) NOT NULL COMMENT '损坏类型',
  `d_lenth` float NOT NULL COMMENT '损坏长',
  `d_width` float NOT NULL COMMENT '损坏宽',
  `d_height` float NOT NULL COMMENT '损坏高',
  `d_position_description` varchar(50) DEFAULT NULL COMMENT '损坏位置及描述',
  `d_areas` float NOT NULL COMMENT '损坏面积',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `manage_unite` varchar(10) DEFAULT NULL COMMENT '管理单位',
  `make_date` date NOT NULL COMMENT '制表日期',
  PRIMARY KEY (`damage_code`),
  KEY `worker_code_damage` (`worker_code`),
  KEY `regular_code_damage` (`regular_code`),
  KEY `road_code_damage` (`road_code`),
  CONSTRAINT `regular_code_damage` FOREIGN KEY (`regular_code`) REFERENCES `regular_inspection_table` (`regular_code`),
  CONSTRAINT `road_code_damage` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`),
  CONSTRAINT `worker_code_damage` FOREIGN KEY (`worker_code`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='路面损害记录表';

-- 正在导出表  道路.road_damage_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `road_damage_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `road_damage_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.road_surface_table 结构
CREATE TABLE IF NOT EXISTS `road_surface_table` (
  `surface_code` int(11) NOT NULL COMMENT '路面平整度记录编号',
  `regular_code` int(11) NOT NULL COMMENT '检查记录编号',
  `worker_code` int(11) NOT NULL COMMENT '检查人员编号',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `road_name` int(11) NOT NULL COMMENT '道路名称',
  `check_date` date NOT NULL COMMENT '检查日期',
  `IRI` float NOT NULL COMMENT 'IRI',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`surface_code`),
  KEY `regular_code_surface` (`regular_code`),
  KEY `worker_code_surface` (`worker_code`),
  KEY `road_code_surface` (`road_code`),
  CONSTRAINT `regular_code_surface` FOREIGN KEY (`regular_code`) REFERENCES `regular_inspection_table` (`regular_code`),
  CONSTRAINT `road_code_surface` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`),
  CONSTRAINT `worker_code_surface` FOREIGN KEY (`worker_code`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='路面平整度记录表';

-- 正在导出表  道路.road_surface_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `road_surface_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `road_surface_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.routine_patrol 结构
CREATE TABLE IF NOT EXISTS `routine_patrol` (
  `patrol_code` int(11) NOT NULL COMMENT '巡查记录编号',
  `woker_code` int(11) DEFAULT NULL COMMENT '巡查人员编号',
  `road_code` int(11) DEFAULT NULL COMMENT '道路编号',
  `patrol_date` int(11) DEFAULT NULL COMMENT '巡查日期',
  `d_type` varchar(15) NOT NULL COMMENT '损坏类型',
  `d_position_description` varchar(50) NOT NULL COMMENT '损坏位置及情况描述',
  `remark` varchar(50) NOT NULL COMMENT '备注',
  `manage_unite` varchar(20) NOT NULL COMMENT '管理单位',
  PRIMARY KEY (`patrol_code`),
  KEY `worker_code_patrol` (`woker_code`),
  KEY `road_code_patrol` (`road_code`),
  KEY `d_type_routine` (`d_type`),
  CONSTRAINT `d_type_routine` FOREIGN KEY (`d_type`) REFERENCES `damage_road_type` (`cement_type`),
  CONSTRAINT `road_code_patrol` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`),
  CONSTRAINT `worker_code_patrol` FOREIGN KEY (`woker_code`) REFERENCES `worker` (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日常巡查记录';

-- 正在导出表  道路.routine_patrol 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `routine_patrol` DISABLE KEYS */;
/*!40000 ALTER TABLE `routine_patrol` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.sidewalk_table 结构
CREATE TABLE IF NOT EXISTS `sidewalk_table` (
  `sidewalk_code` int(11) NOT NULL COMMENT '人行道编号',
  `road_code` int(11) NOT NULL COMMENT '道路编号',
  `direction` varchar(10) NOT NULL COMMENT '方位',
  `pavement_type` varchar(10) DEFAULT NULL COMMENT '铺面类型',
  `sidewalk_length` float DEFAULT NULL COMMENT '人行道长度',
  `sidewalk_width_range` varchar(10) DEFAULT NULL COMMENT '人行道宽度范围',
  `sidewalk_areas` float DEFAULT NULL COMMENT '直线面积',
  `intersection_areas` float DEFAULT NULL COMMENT '交叉口面积',
  `blind_length` float DEFAULT NULL COMMENT '盲道长度',
  `Accessibility_areas` float DEFAULT NULL COMMENT '无障碍通道面积',
  `greenbelt_areas` float DEFAULT NULL COMMENT '绿化带面积',
  `lateral_rock_type` varchar(10) DEFAULT NULL COMMENT '侧石类型',
  `flat_rock_areas` float DEFAULT NULL COMMENT '平石类型',
  PRIMARY KEY (`sidewalk_code`),
  KEY `road_code_sidewalk` (`road_code`),
  CONSTRAINT `road_code_sidewalk` FOREIGN KEY (`road_code`) REFERENCES `road_basic_table` (`road_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人行道信息表';

-- 正在导出表  道路.sidewalk_table 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `sidewalk_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `sidewalk_table` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.worker 结构
CREATE TABLE IF NOT EXISTS `worker` (
  `worker_code` int(11) NOT NULL COMMENT '职工编号',
  `worker_password` int(11) DEFAULT NULL COMMENT '职工密码',
  `name` varchar(6) NOT NULL COMMENT '姓名',
  `age` varchar(3) NOT NULL COMMENT '年龄',
  `sex` char(2) NOT NULL DEFAULT '男' COMMENT '性别',
  `birthday` date NOT NULL COMMENT '出生日期',
  `join_date` date NOT NULL COMMENT '入职日期',
  PRIMARY KEY (`worker_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工表';

-- 正在导出表  道路.worker 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `worker` DISABLE KEYS */;
/*!40000 ALTER TABLE `worker` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.沥青路面损坏单项扣分表 结构
CREATE TABLE IF NOT EXISTS `沥青路面损坏单项扣分表` (
  `损坏类型` varchar(4) NOT NULL,
  `0.01` int(11) DEFAULT NULL,
  `0.1` int(11) DEFAULT NULL,
  `1` int(11) DEFAULT NULL,
  `10` int(11) DEFAULT NULL,
  `50` int(11) DEFAULT NULL,
  `100` int(11) DEFAULT NULL,
  PRIMARY KEY (`损坏类型`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  道路.沥青路面损坏单项扣分表 的数据：~13 rows (大约)
/*!40000 ALTER TABLE `沥青路面损坏单项扣分表` DISABLE KEYS */;
INSERT INTO `沥青路面损坏单项扣分表` (`损坏类型`, `0.01`, `0.1`, `1`, `10`, `50`, `100`) VALUES
	('剥落', 2, 5, 8, 15, 35, 45),
	('唧浆', 5, 10, 15, 25, 50, 80),
	('啃边', 2, 4, 8, 15, 30, 40),
	('坑槽', 10, 15, 25, 40, 65, 72),
	('拥包', 3, 10, 15, 30, 52, 65),
	('沉陷', 3, 5, 12, 25, 47, 63),
	('泛油', 2, 4, 8, 20, 40, 70),
	('线裂', 3, 5, 8, 16, 38, 48),
	('网裂', 5, 8, 10, 20, 45, 70),
	('翻浆', 10, 15, 20, 40, 65, 80),
	('路框差', 3, 8, 12, 12, 12, 12),
	('车辙', 2, 7, 12, 25, 45, 55),
	('龟裂', 8, 10, 15, 30, 55, 80);
/*!40000 ALTER TABLE `沥青路面损坏单项扣分表` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.16-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 道路.水泥混凝土路面损坏单项扣分表 结构
CREATE TABLE IF NOT EXISTS `水泥混凝土路面损坏单项扣分表` (
  `损坏类型` varchar(9) NOT NULL,
  `0.02` int(11) DEFAULT '0',
  `0.1` int(11) DEFAULT '0',
  `0.2` int(11) DEFAULT '0',
  `0.5` int(11) DEFAULT '0',
  `0.6` int(11) DEFAULT '0',
  `1.0` int(11) DEFAULT '0',
  `≥1.0` int(11) DEFAULT '0',
  `3.0` int(11) DEFAULT '0',
  `5.0` int(11) DEFAULT '0',
  `7.0` int(11) DEFAULT '0',
  `≥7.0` int(11) DEFAULT '0',
  `10` int(11) DEFAULT '0',
  `20` int(11) DEFAULT '0',
  `≥20` int(11) DEFAULT '0',
  `30` int(11) DEFAULT '0',
  `50` int(11) DEFAULT '0',
  `100` int(11) DEFAULT '0',
  PRIMARY KEY (`损坏类型`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  道路.水泥混凝土路面损坏单项扣分表 的数据：~7 rows (大约)
/*!40000 ALTER TABLE `水泥混凝土路面损坏单项扣分表` DISABLE KEYS */;
INSERT INTO `水泥混凝土路面损坏单项扣分表` (`损坏类型`, `0.02`, `0.1`, `0.2`, `0.5`, `0.6`, `1.0`, `≥1.0`, `3.0`, `5.0`, `7.0`, `≥7.0`, `10`, `20`, `≥20`, `30`, `50`, `100`) VALUES
	('交叉裂缝和破碎板', 0, 0, 0, 0, 0, 8, 0, 0, 17, 0, 0, 27, 0, 0, 55, 65, 75),
	('坑洞', 9, 19, 30, 0, 60, 70, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
	('接缝料损坏', 0, 1, 0, 0, 0, 3, 0, 0, 5, 0, 0, 7, 10, 12, 0, 0, 0),
	('板角断裂', 0, 0, 0, 12, 0, 25, 0, 33, 44, 55, 65, 0, 0, 0, 0, 0, 0),
	('表面纹裂', 0, 0, 0, 5, 0, 8, 0, 0, 10, 0, 0, 16, 0, 0, 0, 33, 42),
	('边角剥落', 0, 0, 0, 4, 0, 11, 0, 15, 21, 27, 35, 0, 0, 0, 0, 0, 0),
	('边角裂缝', 0, 0, 0, 5, 0, 12, 0, 17, 23, 29, 35, 0, 0, 0, 0, 0, 0);
/*!40000 ALTER TABLE `水泥混凝土路面损坏单项扣分表` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
