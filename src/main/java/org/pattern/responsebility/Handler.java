package org.pattern.responsebility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Handler {

    protected final static int DAY_ONE = 1;
    protected final static int DAY_THREE = 3;
    protected final static int DAY_SEVEN = 7;

    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    protected Handler(int numEnd){
        this.numEnd = numEnd;
    }

    protected Handler(int numStart,int numEnd){
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeve(LevelRequest levelRequest);

    public final void submit(LevelRequest levelRequest){
        log.info("leve request:{}",levelRequest);
        handleLeve(levelRequest);
        if(this.nextHandler!=null && levelRequest.getDay()>numEnd){
            this.nextHandler.submit(levelRequest);
        }
    }
}
