package org.pattern.responsebility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zuzhang extends Handler{

    public Zuzhang(int numStart) {
        super(numStart);
    }

    public Zuzhang(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    public void handleLeve(LevelRequest levelRequest) {
        log.info("name:{},请假天数:{},事由:{}",
                levelRequest.getName(),
                levelRequest.getDay(),
                levelRequest.getReason());
        log.info("小组长审批通过!");
    }
}
