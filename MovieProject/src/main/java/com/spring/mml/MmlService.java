package com.spring.mml;

public interface MmlService {
	public Mml_ContentVO getMmlContent(int mml_num); //mmlContent 가져오기
	public int insertMml(Mml_ContentVO mmlContentVO);	//mmlContent 등록하기
}
