package com.example.demos.vo.req;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dingsong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestOneReq {
    @ExcelProperty(value = "姓名")
    private String name;
    @ExcelProperty(value = "性别")
    private String sex;
}
