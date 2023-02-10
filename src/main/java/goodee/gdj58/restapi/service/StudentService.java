package goodee.gdj58.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import goodee.gdj58.restapi.mapper.StudentMapper;

@Service
@Transactional
public class StudentService {
	@Autowired StudentMapper studentMapper;
	
	public String getStudentId(String studentId) {
		// 아이디가 사용할 수 없으면 NO 출력
		String resultStr = "NO";
		
		// 아이디를 사용할 수 있으면 YES 출력
		if(studentMapper.selectStudentId(studentId) == null) {
			resultStr = "YES";
		}
		
		return resultStr;
	}
}
