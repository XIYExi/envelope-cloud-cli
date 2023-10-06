package com.envelope.common.core.exception.file;

/**
 * 文件大小限制异常类
 */
public class FileSizeLimitExceededException extends FileException{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(String defaultMaxSize) {
        super("upload.exceed.maxSize", new Object[]{defaultMaxSize});
    }

}
