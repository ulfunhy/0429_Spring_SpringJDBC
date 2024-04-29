package kr.hs.study.dao;

// 실제 database에 접속하는 애
// 실제 쿼리 날려주는 애: jdbcTemplate

import kr.hs.study.dto.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testDAO {
    @Autowired
    private JdbcTemplate jdbc;

    //저장
    public void insert(testDTO dto) {
        String sql = "insert into test values(?,?)";
        jdbc.update(sql, dto.getId(), dto.getName());
    }
}
