package com.silvercoin.book.springboot.web;

import com.silvercoin.book.springboot.service.PostsService;
import com.silvercoin.book.springboot.web.dto.PostsResponseDto;
import com.silvercoin.book.springboot.web.dto.PostsSaveRequestDto;
import com.silvercoin.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor                        // final이 선언된 모든 필드를 인자값 생성
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
