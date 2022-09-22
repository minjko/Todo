package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
    private String id;      // 객체 id
    private String userId;  // 객체를 생성한 사용자의 id
    private String title;   // Todo 타이틀(ex. 운동하기)
    private boolean done;   // true - todo를 완료한 경우(checked)
}
