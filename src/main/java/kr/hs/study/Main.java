package kr.hs.study;

import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // testDAO 가져와서 dao 넣기
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        testDAO dao = ctx.getBean(testDAO.class);

        // testDTO 객체 bean1 만들어 (new로 만들어 자바에서 하는 식으로)
        testDTO bean1 = new testDTO();
        // set메서드로 1, kim 삽입
        bean1.setId(1);
        bean1.setName("kim");
        // dao의 insert 메서드 호출
        dao.insert(bean1);

        System.out.println("Inserted!!");
    }
}