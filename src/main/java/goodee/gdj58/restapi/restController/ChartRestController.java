package goodee.gdj58.restapi.restController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartRestController {
	
	@GetMapping("/scoreData")
	public List<Map<String, Integer>> scoreData() {
		List<Map<String, Integer>> list = new ArrayList<>();
		
		Map<String, Integer> map1 = new TreeMap<>();
		// 첫번째 학생112월 성적
		for(int i = 1; i<13; i++) {
			String m = i+"월";
			if(i < 10) {
			 m = "0"+m;
			}
			map1.put(m, (int)(Math.random()*100));
		}
		list.add(map1);
		
		Map<String, Integer> map2 = new TreeMap<>();
		for(int i = 1; i<13; i++) {
			String m = i+"월";
			if(i < 10) {
			 m = "0"+m;
			}
			map2.put(m, (int)(Math.random()*100));
		}
		list.add(map2);
		
		Map<String, Integer> map3 = new TreeMap<>();
		for(int i = 1; i<13; i++) {
			String m = i+"월";
			if(i < 10) {
			 m = "0"+m;
			}
			map3.put(m, (int)(Math.random()*100));
		}
		list.add(map3);
		
		return list;
	}
	
	
	@GetMapping("/monthData")
	public Map<Integer,Integer> monthData() {
		
		// Service에서 넘겨받는 모델값 대신 mock data 생성 
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i<13; i++) {
			map.put(i, (int)(Math.random()*100));
		}
		return map; 
		// chart.js 막대차트에 모델값으로 사용할 거라면 front layer에서  
		// ajax 반환값 json 객체를 두개의 배열(키배열, 값배열)로 변환
		// {} -> [], []
	}
}
