package com.various.springorm;

import com.various.springorm.Repository.MemberRepository;
import com.various.springorm.Repository.MemoryMemberRepository;
import com.various.springorm.Service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
