package com.nowcoder.community.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author Bai Hongfei
 **/
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int score;
}
