/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.joysim.wx.activy.spring.dao.sys;

import java.util.List;

import com.joysim.wx.activy.spring.common.persistence.CrudDao;
import com.joysim.wx.activy.spring.common.persistence.annotation.MyBatisDao;
import com.joysim.wx.activy.spring.module.sys.entity.Menu;

/**
 * 菜单DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {

	public List<Menu> findByParentIdsLike(Menu menu);

	public List<Menu> findByUserId(Menu menu);
	
	public int updateParentIds(Menu menu);
	
	public int updateSort(Menu menu);
	
}
