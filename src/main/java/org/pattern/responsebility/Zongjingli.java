package org.pattern.responsebility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zongjingli extends Handler{


    protected Zongjingli(int numStart) {
        super(numStart);
    }

    protected Zongjingli(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    protected void handleLeve(LevelRequest levelRequest) {
        log.info("name:{},请假天数:{},事由:{}",
                levelRequest.getName(),
                levelRequest.getDay(),
                levelRequest.getReason());
        log.info("总经理审批通过!");
    }
}
