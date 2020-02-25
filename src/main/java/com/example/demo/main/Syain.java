package com.example.demo.main;

import java.io.Serializable;

import lombok.Data;

//jsonの値がセットされるクラス
//json配列を入れ込むbyte配列に変換することができるSerializableインターフェースを実装している
@Data
public class Syain implements Serializable {

	private static final long serialVersionUID = 1L;

	//jsonの値がセットされるクラス。jsonのキーと同じ
	private String bangou;
	private String name;

}
