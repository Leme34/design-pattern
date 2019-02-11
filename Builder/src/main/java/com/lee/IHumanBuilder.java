package com.lee;

public interface IHumanBuilder {
    ManBuilder buildHead();
    ManBuilder buildBody();
    ManBuilder buildHand();
    ManBuilder buildFoot();
    Human build();
}
