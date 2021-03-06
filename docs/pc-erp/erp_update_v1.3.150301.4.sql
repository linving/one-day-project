SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE  TABLE IF NOT EXISTS `sys_login_remember` (
  `id` INT(20) NOT NULL AUTO_INCREMENT ,
  `uid` INT(20) NOT NULL ,
  `remember_token` VARCHAR(45) NOT NULL ,
  `gmt_expired` DATETIME NULL DEFAULT NULL COMMENT '过期时间' ,
  `gmt_refresh` DATETIME NULL DEFAULT NULL COMMENT '刷新时间' ,
  `gmt_created` VARCHAR(45) NULL DEFAULT NULL ,
  `gmt_modified` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `idx_uid` (`uid` ASC) ,
  UNIQUE INDEX `remember_token_UNIQUE` (`remember_token` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
COMMENT = '登录记忆';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
