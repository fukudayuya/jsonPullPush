package com.example.demo.main;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class MainController {

	@RequestMapping(value="/index",method= {RequestMethod.POST})
	@ResponseBody//@RespinseBodyを付与したメソッドは戻り値がそのままレスポンスのコンテンツになる。
	public Syain output1(@RequestBody Syain syain) {//送られてきたjsonの値をSyainクラスにセット
		System.out.println(syain.getBangou());
		System.out.println(syain.getName());

		return syain;//Syainオブジェクトを画面に返す。JSON形式でかえる。
	}
}
