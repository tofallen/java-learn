package self.licw.simpleframework.mvc.render.impl;

import self.licw.simpleframework.mvc.RequestProcessorChain;
import self.licw.simpleframework.mvc.render.ResultRender;

/**
 * 内部异常处理器
 */
public class InternalErrorResultRender implements ResultRender {
    private String msg;

    public InternalErrorResultRender(String msg) {
        this.msg = msg;
    }


    @Override
    public void render(RequestProcessorChain requestProcessorChain) throws Exception {

    }
}
