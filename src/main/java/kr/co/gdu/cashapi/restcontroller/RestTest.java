package kr.co.gdu.cashapi.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {
	@GetMapping("/test")
	public Map<String, String> test() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "구디");
		map.put("address", "가산동");
		return map;
	}
}