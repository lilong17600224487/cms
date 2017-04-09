package com.xlyg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xlyg.model.Text;

public interface MainListDao {
	/**
	 * 查询全部文章的列表
	 */
	public List<Text> findTextList();
	/**
	 * 根据传入的文章id查询文章
	 * @param id
	 * @return
	 */
	public Text findText(@Param("id")Integer id);
	/**
	 * 添加文章
	 * @param text
	 */
	public void createText(@Param("p")Text text);
	/**
	 * 修改文章
	 * @param text
	 */
	public void updateText(@Param("p")Text text);

}
