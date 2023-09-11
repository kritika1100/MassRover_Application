package com.example.demo.serviceimpl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiServiceImpl  {
	
	final static String API_KEY ="qeBxG13RhVxxDTYZHDeNejJR8egZsWOhMuKiiviJ";
	
	public MarsRoverApiResponse getRoverData(String cameraName, Integer solNum) {
		RestTemplate rt= new RestTemplate();
		ResponseEntity<MarsRoverApiResponse> response=rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+cameraName+"/photos?sol="+solNum+"&api_key="+API_KEY, MarsRoverApiResponse.class);
		//System.out.println(response.getBody());
		System.out.println(response.getBody().getPhotos().get(3).getImgSrc());
		return response.getBody();
	}

	}


