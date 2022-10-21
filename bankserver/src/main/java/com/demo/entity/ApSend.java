package com.demo.entity;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

@Data
@Builder
public class ApSend implements Serializable,Cloneable{

    private Integer id;


    private String dQksId;

    private Integer maxThr;

    private Integer minThr;

    private String poolUuid;

    private Long rPtr;

    private String sQksId;

    private Byte type;

    private Long wPtr;

    private static final long serialVersionUID = 1L;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}