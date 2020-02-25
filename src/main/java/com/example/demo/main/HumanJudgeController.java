
package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CreatureDTO;

@RestController//とりあえず付与しておけばjsonの送受信が可能
public class HumanJudgeController {

	@RequestMapping(value = "/judge",method= {RequestMethod.POST})//クライアントからPOST通信でのアクセス時にマッチする
	//@RequestBodyは送られてきた内容を取得して指定された型に値を注入する。
	public List<CreatureDTO> jydgeHuman(@RequestBody List<CreatureDTO> creature){

		List<CreatureDTO> resultList = new ArrayList<CreatureDTO>();
		for(int i = 0;i < creature.size();i++) {
			if(creature.get(i).getType().equals("human")) {
				resultList.add(creature.get(i));
			}
		}

		return resultList;
	}

}
