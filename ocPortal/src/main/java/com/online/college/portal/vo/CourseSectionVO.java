package com.online.college.portal.vo;

import com.online.college.core.course.domain.CourseSection;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程章节
 */
public class CourseSectionVO extends CourseSection{
	private static final long serialVersionUID = 180753077428934254L;

	//小节
	private List<CourseSection> sections = new ArrayList<CourseSection>();

	
	public List<CourseSection> getSections() {
		return sections;
	}

	public void setSections(List<CourseSection> sections) {
		this.sections = sections;
	}
	
}
