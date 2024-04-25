package com.various.springorm;

import com.various.springorm.Repository.*;
import com.various.springorm.Service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    // private final DataSource dataSource; // for JDBC, JDBCTemplate, Spring JPA
    // private final EntityManager em; // for Spring JPA
    private final MemberRepository memberRepository; // form Spring Data JPA

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    // Not necessary in Spring Data JPA, automatically registered Spring Bean
//    @Bean
//    public MemberRepository memberRepository() {
//        // return new MemoryMemberRepository();
//        // return new JDBCMemberRepository(dataSource);
//        // return new JDBCTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
