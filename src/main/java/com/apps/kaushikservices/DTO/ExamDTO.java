/**
 * 
 */
package com.apps.kaushikservices.DTO;

import java.util.List;

/**
 * @author Babita
 *
 */
public class ExamDTO {
private String name;
private String type;
private String format;
private String classId;
private String subjectId;
private String chapterRange;
private String maximumMarks;
private List <ExamQuestionDTO> questions;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
/**
 * @return the format
 */
public String getFormat() {
	return format;
}
/**
 * @param format the format to set
 */
public void setFormat(String format) {
	this.format = format;
}
/**
 * @return the classId
 */
public String getClassId() {
	return classId;
}
/**
 * @param classId the classId to set
 */
public void setClassId(String classId) {
	this.classId = classId;
}
/**
 * @return the subjectId
 */
public String getSubjectId() {
	return subjectId;
}
/**
 * @param subjectId the subjectId to set
 */
public void setSubjectId(String subjectId) {
	this.subjectId = subjectId;
}
/**
 * @return the chapterRange
 */
public String getChapterRange() {
	return chapterRange;
}
/**
 * @param chapterRange the chapterRange to set
 */
public void setChapterRange(String chapterRange) {
	this.chapterRange = chapterRange;
}
/**
 * @return the maximumMarks
 */
public String getMaximumMarks() {
	return maximumMarks;
}
/**
 * @param maximumMarks the maximumMarks to set
 */
public void setMaximumMarks(String maximumMarks) {
	this.maximumMarks = maximumMarks;
}
/**
 * @return the questions
 */
public List<ExamQuestionDTO> getQuestions() {
	return questions;
}
/**
 * @param questions the questions to set
 */
public void setQuestions(List<ExamQuestionDTO> questions) {
	this.questions = questions;
}
	
}
