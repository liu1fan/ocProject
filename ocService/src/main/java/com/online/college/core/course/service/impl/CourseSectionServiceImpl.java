package com.online.college.core.course.service.impl;

import com.online.college.common.page.TailPage;
import com.online.college.core.course.dao.CourseSectionDao;
import com.online.college.core.course.domain.CourseSection;
import com.online.college.core.course.service.ICourseSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseSectionServiceImpl implements ICourseSectionService {

	@Autowired
	private CourseSectionDao entityDao;

	public CourseSection getById(Long id){
		return entityDao.getById(id);
	}

	public List<CourseSection> queryAll(CourseSection queryEntity){
		return entityDao.queryAll(queryEntity);
	}
	
	/**
	 * 获取课程章最大的sort
	 */
	public Integer getMaxSort(Long courseId){
		return entityDao.getMaxSort(courseId);
	}

	public TailPage<CourseSection> queryPage(CourseSection queryEntity , TailPage<CourseSection> page){
		Integer itemsTotalCount = entityDao.getTotalItemsCount(queryEntity);
		List<CourseSection> items = entityDao.queryPage(queryEntity,page);
		page.setItemsTotalCount(itemsTotalCount);
		page.setItems(items);
		return page;
	}

	public void createSelectivity(CourseSection entity){
		entityDao.createSelectivity(entity);
	}
	
	/**
	*批量创建
	**/
	public void createList(List<CourseSection> entityList){
		entityDao.createList(entityList);
	}

	public void update(CourseSection entity){
		entityDao.update(entity);
	}

	public void updateSelectivity(CourseSection entity){
		entityDao.updateSelectivity(entity);
	}

	public void delete(CourseSection entity){
		entityDao.delete(entity);
	}

	public void deleteLogic(CourseSection entity){
		entityDao.deleteLogic(entity);
	}



}

