package com.silvercoin.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor        // final 필드가 포함된 생성자 생성(final이 없는 필드는 생성자에서 제외)
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
