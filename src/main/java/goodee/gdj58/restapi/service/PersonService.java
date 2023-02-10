package goodee.gdj58.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import goodee.gdj58.restapi.vo.Person;

@Service
@Transactional
public class PersonService {
	public List<Person> getPersonList() {
		// 원래는 Mapper or Repository Layer에서 가져와야하는데 직접만듬
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "홍길동"));
		list.add(new Person(2, "마이클"));
		return list;
	}
}
