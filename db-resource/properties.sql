SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for properties
-- ----------------------------
DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
  `APPLICATION` varchar(255) DEFAULT NULL,
  `PROFILE` varchar(255) DEFAULT NULL,
  `LABEL` varchar(255) DEFAULT NULL,
  `KEY` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of properties
-- ----------------------------
BEGIN;
INSERT INTO `properties` VALUES ('DEMO-SERVICE', 'default', 'master', 'version', '1.0.0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
