package com.example.demo.ai;

import org.springframework.ai.client.Generation;

import java.util.List;

/**
 * Created by User: Vu
 * Date: 21.12.2023
 * Time: 22:36
 */
public class AiResponse {

    private final List<Generation> generations;

    public AiResponse(List<Generation> generations) {
        this.generations = generations;
    }
    // other methods omitted
}