
/**
 * 
 */
package com.apps.kaushikservices.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apps.kaushikservices.DTO.ClassDTO;
import com.apps.kaushikservices.DTO.ExamDTO;
import com.apps.kaushikservices.DTO.ExamQuestionDTO;
import com.apps.kaushikservices.DTO.StudentDTO;
import com.apps.kaushikservices.DTO.StudentExamScheduleDTO;
import com.apps.kaushikservices.DTO.SubjectDTO;
import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.ExamDomain;
import com.apps.kaushikservices.domain.ExamQuestionDomain;
import com.apps.kaushikservices.domain.StudentDomain;
import com.apps.kaushikservices.domain.StudentExamScheduleDomain;
import com.apps.kaushikservices.domain.SubjectDomain;
import com.apps.kaushikservices.service.SetUpExamService;

/**
 * @author Babita
 *
 */
@Controller
public class HomeController {
	@Autowired
	SetUpExamService setUpExamService;

	@RequestMapping(value = ("/getClass"), produces = ("application/json"), method = RequestMethod.GET)
	public @ResponseBody List<ClassDTO> getAllClass() {
		System.out.println("HomeController.getAllClass123::Enter");
		List<ClassDomain> classListDomain = new ArrayList();
		classListDomain = setUpExamService.getAllClass();
		Iterator itr = classListDomain.iterator();
		System.out.println(classListDomain.size());

		while (itr.hasNext()) {
			ClassDomain domain = (ClassDomain) itr.next();
			System.out.println(domain.getClassId());
			System.out.println(domain.getName());
			System.out.println();
			List<SubjectDomain> subjectList = domain.getSubjectList();
			for (SubjectDomain subject : subjectList) {
				System.out.println(subject.getSubjectId());
				System.out.println(subject.getName());
				System.out.println(subject.getNoOfChapters());
				System.out.println(subject.getClassId());
				System.out.println();
			}
			List<StudentDomain> studentList = domain.getStudentList();
			for (StudentDomain student : studentList) {
				System.out.println(student.getStudentId());
				System.out.println(student.getName());
				System.out.println(student.getClassId());
				System.out.println();
				System.out.println();
			}
		}

		/*
		 * Iterator itr1 = classListDomain.iterator(); while(itr1.hasNext()){
		 * ClassDomain domain = (ClassDomain) itr1.next(); List<SubjectDomain>
		 * subjectList = domain.getSubjectList(); for(SubjectDomain subject
		 * :subjectList){ System.out.println(subject.getSubjectId());
		 * System.out.println(subject.getName());
		 * System.out.println(subject.getNoOfChapters());
		 * System.out.println(subject.getClassId()); System.out.println();
		 * System.out.println(); }
		 * 
		 * 
		 * } Iterator itr2 = classListDomain.iterator(); while(itr2.hasNext()){
		 * ClassDomain domain = (ClassDomain) itr2.next(); List<StudentDomain>
		 * studentList = domain.getStudentList(); for(StudentDomain student
		 * :studentList){ System.out.println(student.getStudentId());
		 * System.out.println(student.getName());
		 * System.out.println(student.getClassId()); System.out.println();
		 * System.out.println(); }
		 * 
		 * }
		 */
		List<ClassDTO> classList = new ArrayList();

		for (ClassDomain classDomain : classListDomain) {
			ClassDTO classDTO = new ClassDTO();
			BeanUtils.copyProperties(classDomain, classDTO);

			classList.add(classDTO);
		}

		System.out.println("HomeController.getAllClass::Exit");
		return classList;

	}

	@RequestMapping(value = "/allSubject", method = RequestMethod.POST, consumes = ("application/json"), produces = ("application/json"))
	public @ResponseBody List<SubjectDTO> getAllSubject(@RequestBody ClassDTO classDTO, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("HomeController.getAllSubject466::Enter");
		// classDTO.setClassId(1);
		List<SubjectDTO> subjectList = new ArrayList();
		ClassDomain classDomain = new ClassDomain();
		BeanUtils.copyProperties(classDTO, classDomain);

		List<SubjectDomain> subjectListDomain = setUpExamService.getAllSubject(classDomain);

		for (SubjectDomain subjectDomain : subjectListDomain) {
			SubjectDTO subjectDTO = new SubjectDTO();

			BeanUtils.copyProperties(subjectDomain, subjectDTO);

			subjectList.add(subjectDTO);
		}
		System.out.println("HomeController.getAllSubject::Exit");
		return subjectList;
	}

	@RequestMapping(value = "/allStudent", method = RequestMethod.POST, consumes = ("application/json"), produces = ("application/json"))
	public @ResponseBody List<StudentDTO> getAllStudent(@RequestBody ClassDTO classDTO, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("HomeController.getAllStudent2233::Enter");

		List<StudentDTO> studentList = new ArrayList();
		ClassDomain classDomain = new ClassDomain();

		BeanUtils.copyProperties(classDTO, classDomain);

		List<StudentDomain> studentListDomain = setUpExamService.getAllStudent(classDomain);

		for (StudentDomain studentDomain : studentListDomain) {
			StudentDTO studentDTO = new StudentDTO();
			BeanUtils.copyProperties(studentDomain, studentDTO);

			studentList.add(studentDTO);
		}
		System.out.println("HomeController.getAllStudent3t4334::Exit");
		return studentList;
	}

	@RequestMapping(value = "/saveExamData", method = RequestMethod.POST, consumes = ("application/json"), produces = ("application/json"))
	public @ResponseBody Map saveExamData(@RequestBody ExamDTO examDTO, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("HomeController.saveExamData::Enter");
		System.out.println("Maximumm marks in DTO =" + examDTO.getMaximumMarks());
		ExamDomain examDomain = new ExamDomain();
		List<ExamQuestionDTO> listDTO = examDTO.getQuestions();
		List<ExamQuestionDomain> questionsList = new ArrayList();

		for (ExamQuestionDTO examQuestionDTO : listDTO) {
			ExamQuestionDomain examQuestionDomain = new ExamQuestionDomain();

			// BeanUtils.copyProperties(examQuestionDomain, examQuestionDTO);
			BeanUtils.copyProperties(examQuestionDTO, examQuestionDomain, "examQuestionId", "examId");

			questionsList.add(examQuestionDomain);
		}

		BeanUtils.copyProperties(examDTO, examDomain);

		examDomain.setQuestions(questionsList);
		System.out.println("Maximumm marks in Domain =" + examDomain.getMaximumMarks());
		int examId = setUpExamService.saveExamData(examDomain);
		/*
		 * System.out.println(examDTO.getName());
		 * System.out.println(examDTO.getType());
		 * System.out.println(examDTO.getFormat());
		 * System.out.println(examDTO.getClassId());
		 * System.out.println(examDTO.getSubjectId());
		 * System.out.println(examDTO.getChapterRange());
		 * System.out.println(examDTO.getMaximumMarks()); List
		 * <ExamQuestionDTO>quest = examDTO.getQuestions(); for(ExamQuestionDTO
		 * value:quest){ System.out.println(value.getMarks());
		 * System.out.println(value.getNumberOfQuestions());
		 * 
		 * }
		 * 
		 * int examId = 1;
		 */
		Map map = new HashMap();
		map.put("examId", examId);

		System.out.println("HomeController.saveExamData::Exit");
		return map;
	}

	@RequestMapping(value = "/saveTargetInformation", method = RequestMethod.POST, consumes = ("application/json"), produces = ("application/json"))
	public @ResponseBody Map saveTargetInformation(@RequestBody ExamDTO examDTO, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("HomeController.saveTargetInformation::Enter");
		System.out.println(examDTO.getExamId());
		System.out.println(examDTO.getStartTime());
		System.out.println(examDTO.getExpiryTime());
		System.out.println(examDTO.getDuration());
		System.out.println(examDTO.isSendEmail());
		System.out.println(examDTO.isShowQuestionScore());
		System.out.println(examDTO.isShowResultAfterExam());
		System.out.println(examDTO.isTeacherCradentialRequire());
		System.out.println(examDTO.isEmailOnStart());
		System.out.println(examDTO.isEmailOnComplete());
		
		ExamDomain examDomain = new ExamDomain();
		
		List<StudentExamScheduleDomain> studentExamScheduleDomainList = new ArrayList();
		BeanUtils.copyProperties(examDTO, examDomain);
		List<Integer> studentIdList = examDTO.getStudentId();
		int examId = examDTO.getExamId();
		for(int studentId:studentIdList){
			StudentExamScheduleDomain studentExamScheduleDomain = new StudentExamScheduleDomain();
			studentExamScheduleDomain.setStudentId(studentId);
			studentExamScheduleDomain.setExamId(examId);
			studentExamScheduleDomainList.add(studentExamScheduleDomain);
			
		}
		

		SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String newDate = sf.format(examDTO.getStartTime());
		System.out.println("New date : " + newDate);
		List<StudentExamScheduleDTO> studentList = examDTO.getStudentList();
		/*for (StudentExamScheduleDTO value : studentList) {
			System.out.println(value.getStudentId());

		}*/
		
		Boolean status = setUpExamService.updateTargetInformation(examDomain, studentExamScheduleDomainList);

		Map map = new HashMap();
		map.put("status", status);

		System.out.println("HomeController.saveTargetInformation::Exit");
		return map;
	}

	/**
	 * @param setUpExamService
	 *            the setUpExamService to set
	 */
	public void setSetUpExamService(SetUpExamService setUpExamService) {
		this.setUpExamService = setUpExamService;
	}
}
