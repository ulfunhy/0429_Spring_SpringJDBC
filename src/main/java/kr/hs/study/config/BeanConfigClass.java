package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.dto","kr.hs.study.dao"})
public class BeanConfigClass {


    //Datasource
    @Bean
    public BasicDataSource source() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("oracle.jdbc.OracleDriver");
        source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        source.setUsername("scott");
        source.setPassword("tiger");

        return source;
    }


    @Bean   // 실제 쿼리 날리는 애
    public JdbcTemplate db(BasicDataSource source) {
        JdbcTemplate db = new JdbcTemplate(source);
        return db;
    }
}
