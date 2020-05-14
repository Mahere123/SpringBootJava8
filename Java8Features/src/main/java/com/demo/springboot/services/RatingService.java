package com.demo.springboot.services;

import java.util.List;

import com.demo.springboot.dto.RatingResponseDTO;

public interface RatingService {

	RatingResponseDTO save(RatingResponseDTO ratingResponseDTO);

	List<RatingResponseDTO> findOne(String movieId);

}
