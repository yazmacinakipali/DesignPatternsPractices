package com.designpatterns.strategy;

public class JsonSerializable implements SerializableI {

	@Override
	public void Serialize(String s) {
		System.out.println(s+"JSON Serialized");
	}

	@Override
	public void DeSerialize(String s) {
		System.out.println(s+"=JSON Serialized");
	}

}
