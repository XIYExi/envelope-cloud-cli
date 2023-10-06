package com.envelope.common.core.exception.file;

import com.envelope.common.core.exception.base.BaseException;

/**
 * 文件异常
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }
}
