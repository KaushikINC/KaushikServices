
/**
 * 
 */
package com.apps.kaushikservices.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apps.kaushikservices.DTO.ClassDTO;
import com.apps.kaushikservices.DTO.StudentDTO;
import com.apps.kaushikservices.DTO.SubjectDTO;
import com.apps.kaushikservices.domain.ClassDomain;
import com.apps.kaushikservices.domain.StudentDomain;
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
		System.out.println("HomeController.getAllClass::Enter");
		List<ClassDomain> classListDomain = new ArrayList();
		classListDomain = setUpExamService.getAllClass();
		Iterator itr = classListDomain.iterator();
		System.out.println(classListDomain.size());
		
		while(itr.hasNext()){
			ClassDomain domain = (ClassDomain) itr.next();
			System.out.println(domain.getClassId());
			System.out.println(domain.getName());
			System.out.println();
			List<SubjectDomain> subjectList = domain.getSubjectList();
			for(SubjectDomain subject :subjectList){
				System.out.println(subject.getSubjectId());
				System.out.println(subject.getName());
				System.out.println(subject.getNoOfChapter());
				System.out.println(subject.getClassId());
				System.out.println();
			}
			List<StudentDomain> studentList = domain.getStudentList();
			for(StudentDomain student :studentList){
				System.out.println(student.getStudentId());
				System.out.println(student.getName());
				System.out.println(student.getClassId());
				System.out.println();
				System.out.println();
			}
		}
		
		/*Iterator itr1 = classListDomain.iterator();
		while(itr1.hasNext()){
			ClassDomain domain = (ClassDomain) itr1.next();
			List<SubjectDomain> subjectList = domain.getSubjectList();
			for(SubjectDomain subject :subjectList){
				System.out.println(subject.getSubjectId());
				System.out.println(subject.getName());
				System.out.println(subject.getNoOfChapter());
				System.out.println(subject.getClassId());
				System.out.println();
				System.out.println();
			}
			
			
		}
		Iterator itr2 = classListDomain.iterator();
		while(itr2.hasNext()){
			ClassDomain domain = (ClassDomain) itr2.next();
			List<StudentDomain> studentList = domain.getStudentList();
			for(StudentDomain student :studentList){
				System.out.println(student.getStudentId());
				System.out.println(student.getName());
				System.out.println(student.getClassId());
				System.out.println();
				System.out.println();
			}
			
		}*/
		List<ClassDTO> classList = new ArrayList();
		

		 for (ClassDomain classDomain: classListDomain ) {
		        ClassDTO classDTO= new ClassDTO();
		        try {
					BeanUtils.copyProperties(classDTO , classDomain);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        classList.add(classDTO);
		     }
		
		System.out.println("HomeController.getAllClass::Exit");
		return classList;

	}
	@RequestMapping(value="/allSubject", method=RequestMethod.POST, consumes=("application/json"), produces=("application/json"))
	public @ResponseBody List<SubjectDTO> getAllSubject(@RequestBody ClassDTO classDTO,HttpServletRequest request,HttpServletResponse response){
		System.out.println("HomeController.getAllSubject::Enter");
		//classDTO.setClassId(1);
		List<SubjectDTO> subjectList = new ArrayList();
		 ClassDomain classDomain = new ClassDomain();
		 try {
			BeanUtils.copyProperties(classDomain, classDTO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<SubjectDomain> subjectListDomain =  setUpExamService.getAllSubject(classDomain);
		
		for(SubjectDomain subjectDomain:subjectListDomain){
			SubjectDTO subjectDTO = new SubjectDTO();
			try {
				BeanUtils.copyProperties(subjectDTO, subjectDomain);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			subjectList.add(subjectDTO);
		}
		System.out.println("HomeController.getAllSubject::Exit");
		 return subjectList;
	}
	
	
	@RequestMapping(value="/allStudent", method=RequestMethod.POST, consumes=("application/json"), produces=("application/json"))
	public @ResponseBody List<StudentDTO> getAllStudent(@RequestBody ClassDTO classDTO,HttpServletRequest request,HttpServletResponse response){
		System.out.println("HomeController.getAllStudent::Enter");
		
		List<StudentDTO> studentList = new ArrayList();
		 ClassDomain classDomain = new ClassDomain();
		 try {
			BeanUtils.copyProperties(classDomain, classDTO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<StudentDomain> studentListDomain =  setUpExamService.getAllStudent(classDomain);
		
		for(StudentDomain studentDomain:studentListDomain){
			StudentDTO studentDTO = new StudentDTO();
			try {
				BeanUtils.copyProperties(studentDTO, studentDomain);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			studentList.add(studentDTO);
		}
		System.out.println("HomeController.getAllStudent::Exit");
		 return studentList;
	}
	
	
	

	/**
	 * @param setUpExamService
	 *            the setUpExamService to set
	 */
	public void setSetUpExamService(SetUpExamService setUpExamService) {
		this.setUpExamService = setUpExamService;
	}
}
