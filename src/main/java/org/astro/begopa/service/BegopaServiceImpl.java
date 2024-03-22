package org.astro.begopa.service;

import org.astro.begopa.dto.BegopaDto;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import java.util.Random;

@Service
@Log4j2
public class BegopaServiceImpl implements BegopaService{

    @Override
    public BegopaDto getFoodName() {
        
		String[] cookList = {
			"창신동매운족발",
			"소불고기",
            "대방어",
			"회",
			"연어 무한리필",
			"삼겹살 무한리필",
            "순대 국밥",
			"이자카야",
			"장어",
			"스페인식",
			"중식"
		};

		Random random = new Random();

		//랜덤돌려서 들어갈 음식
		Integer cnt = random.nextInt(cookList.length);
		String todayFoodName = cookList[cnt];

		System.out.println("오늘은 " + todayFoodName + " 이걸로 먹는다");
		log.info(todayFoodName);

        return BegopaDto.builder().foodNo(cnt).foodName(todayFoodName).build();
    }
    
    
}
