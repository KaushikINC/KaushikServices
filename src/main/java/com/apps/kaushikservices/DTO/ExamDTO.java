/**
 * 
 */
package com.apps.kaushikservices.DTO;

import java.sql.Date;
import java.util.List;

/**
 * @author Babita
 *
 */
public class ExamDTO {
	private int examId;
	private String name;
	private String type;
	private String format;
	private String classId;
	private String subjectId;
	private String chapterRange;
	private int maximumMarks;
	private Date startTime;
	private Date expiryTime;
	private double duration;
	private boolean sendEmail;
	private boolean showResultAfterExam;
	private boolean showQuestionScore;
	private boolean teacherCradentialRequire;
	private boolean emailOnStart;
	private boolean emailOnComplete;
	private List<ExamQuestionDTO> questions;
	private List<StudentExamScheduleDTO> studentList;
	private List<Integer> studentId;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
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
	 * @param type
	 *            the type to set
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
	 * @param format
	 *            the format to set
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
	 * @param classId
	 *            the classId to set
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
	 * @param subjectId
	 *            the subjectId to set
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
	 * @param chapterRange
	 *            the chapterRange to set
	 */
	public void setChapterRange(String chapterRange) {
		this.chapterRange = chapterRange;
	}

	/**
	 * @return the maximumMarks
	 */
	public int getMaximumMarks() {
		return maximumMarks;
	}

	/**
	 * @param maximumMarks
	 *            the maximumMarks to set
	 */
	public void setMaximumMarks(int maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	/**
	 * @return the questions
	 */
	public List<ExamQuestionDTO> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<ExamQuestionDTO> questions) {
		this.questions = questions;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the expiryTime
	 */
	public Date getExpiryTime() {
		return expiryTime;
	}

	/**
	 * @param expiryTime the expiryTime to set
	 */
	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}

	/**
	 * @return the sendEmail
	 */
	public boolean isSendEmail() {
		return sendEmail;
	}

	/**
	 * @param sendEmail the sendEmail to set
	 */
	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	/**
	 * @return the showResultAfterExam
	 */
	public boolean isShowResultAfterExam() {
		return showResultAfterExam;
	}

	/**
	 * @param showResultAfterExam the showResultAfterExam to set
	 */
	public void setShowResultAfterExam(boolean showResultAfterExam) {
		this.showResultAfterExam = showResultAfterExam;
	}

	/**
	 * @return the showQuestionScore
	 */
	public boolean isShowQuestionScore() {
		return showQuestionScore;
	}

	/**
	 * @param showQuestionScore the showQuestionScore to set
	 */
	public void setShowQuestionScore(boolean showQuestionScore) {
		this.showQuestionScore = showQuestionScore;
	}

	/**
	 * @return the teacherCradentialRequire
	 */
	public boolean isTeacherCradentialRequire() {
		return teacherCradentialRequire;
	}

	/**
	 * @param teacherCradentialRequire the teacherCradentialRequire to set
	 */
	public void setTeacherCradentialRequire(boolean teacherCradentialRequire) {
		this.teacherCradentialRequire = teacherCradentialRequire;
	}

	/**
	 * @return the emailOnStart
	 */
	public boolean isEmailOnStart() {
		return emailOnStart;
	}

	/**
	 * @param emailOnStart the emailOnStart to set
	 */
	public void setEmailOnStart(boolean emailOnStart) {
		this.emailOnStart = emailOnStart;
	}

	/**
	 * @return the emailOnComplete
	 */
	public boolean isEmailOnComplete() {
		return emailOnComplete;
	}

	/**
	 * @param emailOnComplete the emailOnComplete to set
	 */
	public void setEmailOnComplete(boolean emailOnComplete) {
		this.emailOnComplete = emailOnComplete;
	}

	/**
	 * @return the studentList
	 */
	public List<StudentExamScheduleDTO> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<StudentExamScheduleDTO> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @return the examId
	 */
	public int getExamId() {
		return examId;
	}

	/**
	 * @param examId the examId to set
	 */
	public void setExamId(int examId) {
		this.examId = examId;
	}

	/**
	 * @return the studentId
	 */
	public List<Integer> getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(List<Integer> studentId) {
		this.studentId = studentId;
	}

	

}
