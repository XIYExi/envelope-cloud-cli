package com.envelope.common.excel.core;

import java.util.List;

/**
 * excel返回结果类
 */
public interface ExcelResult<T> {
    /**
     * 对象列表
     * @return
     */
    List<T> getList();

    /**
     * 错误列表
     * @return
     */
    List<String> getErrorList();

    /**
     * 导入回执
     * @return
     */
    String getAnalysis();

}
