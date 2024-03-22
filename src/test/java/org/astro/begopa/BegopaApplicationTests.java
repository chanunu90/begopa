package org.astro.begopa;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class BegopaApplicationTests {

	@Test
	void contextLoads() {
	}



	@Test
	void today_cook(){
		String[] cookList = {
			"창신동매운족발" ,
			"장충통왕족발보쌈"
		};

		Random random = new Random();

		//랜덤돌려서 들어갈 음식
		String todayFoodName = cookList[random.nextInt(cookList.length)];


		System.out.println("오늘은 " + todayFoodName + " 이걸로 먹는닷");
		log.info(todayFoodName);


	}

}
