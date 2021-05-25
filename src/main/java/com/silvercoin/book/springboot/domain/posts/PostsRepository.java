package com.silvercoin.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
Database를 접근하게 해줄 JpaRepository
JpaRepository<엔티티 클래스, PK타입>
* */

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
