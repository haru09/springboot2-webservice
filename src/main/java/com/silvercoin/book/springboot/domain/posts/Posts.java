package com.silvercoin.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor          // 기본 생성자 자동추가(public Posts(){} 와 같은 기능
@Entity                     // 테이블과링크될 클래스를 나타냄
public class Posts {        // 실제 DB의 테이블과 매칭되는 테이블 클래스(엔티티 클래스)
    
    @Id                                                     // 해달 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // PK 생성규칙
    private Long id;

    /*
    * 컬럼을 나타냄, 굳이 선언하지 않아도 클래스 내에 필드는 모두 컬럼이 됨.
    * */
    @Column(length = 500, nullable = false)
    private String title;
    
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    
    private String author;
    
    // 빌더 패턴 글래스를 생성
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
