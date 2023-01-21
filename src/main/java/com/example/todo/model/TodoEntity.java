package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data  // Getter, Setter
@Entity  // @Entity("TodoEntity") 테이블&Entity 이름 = TodoEntity
@Table(name = "Todo")  // 테이블&Entity 이름 = Todo, @Table 테이블&Entity 이름 = TodoEntity
public class TodoEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String id;      // 객체 id

    private String userId;  // 객체를 생성한 사용자의 id

    private String title;   // Todo 타이틀(ex. 운동하기)

    private boolean done;   // true - todo를 완료한 경우(checked)

    @ManyToOne
    @JoinColumn(name="categoryId")
    private CategoryEntity categoryEntity;

}
