/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.joysim.wx.activy.spring.dao.sys;

import com.joysim.wx.activy.spring.common.persistence.TreeDao;
import com.joysim.wx.activy.spring.common.persistence.annotation.MyBatisDao;
import com.joysim.wx.activy.spring.module.sys.entity.Office;

/**
 * 机构DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
