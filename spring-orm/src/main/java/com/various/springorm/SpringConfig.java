package com.various.springorm;

import com.various.springorm.Repository.JDBCMemberRepository;
import com.various.springorm.Repository.MemberRepository;
import com.various.springorm.Repository.MemoryMemberRepository;
import com.various.springorm.Service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        return new JDBCMemberRepository(dataSource);
    }
}
