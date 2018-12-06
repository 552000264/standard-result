package com.clsaa.rest.result.spi.impl;


import com.clsaa.rest.result.RestResult;
import com.clsaa.rest.result.spi.RestResultProvider;

/**
 * 默认实现
 */
public class DefaultRestResultProvider implements RestResultProvider {

    @Override
    public boolean support(Object source) {
        return source instanceof RestResult;
    }

    @Override
    public RestResult produce(Object source) {
        return (RestResult) source;
    }

}
