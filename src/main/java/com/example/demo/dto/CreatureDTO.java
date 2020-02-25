package com.example.demo.dto;

import lombok.Data;

//受け取ったデータを格納するためのクラス
//jsonのキーと同じにする
@Data
public class CreatureDTO {

	private String name;
	private String type;

}
