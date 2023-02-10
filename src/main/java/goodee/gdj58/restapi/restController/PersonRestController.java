package goodee.gdj58.restapi.restController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import goodee.gdj58.restapi.service.PersonService;

@RestController
@CrossOrigin
public class PersonRestController {
	@Autowired PersonService personService;
	
	// RestController의 리턴타입은 JSON문자열 모델객체 ->RestController 애노테이션에서 JSON 문자열로 변경
	@GetMapping("/personList")
	public List personList() {
		return personService.getPersonList(); // 리턴값이 RestController 애노테이션에서 JSON 문자열로 변경
	}
}
