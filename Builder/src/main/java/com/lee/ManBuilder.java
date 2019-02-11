package com.lee;

public class ManBuilder implements IHumanBuilder {

    private Human human;

    public ManBuilder() {
        human = new Human();
    }

    @Override
    public ManBuilder buildHead() {
        human.setHead("智商180的头脑");
        return this;
    }

    @Override
    public ManBuilder buildBody() {
        human.setBody("高高的身体");
        return this;
    }

    @Override
    public ManBuilder buildHand() {
        human.setHand("长长的手");
        return this;
    }

    @Override
    public ManBuilder buildFoot() {
        human.setFoot("细细的脚");
        return this;
    }

    @Override
    public Human build() {
        return human;
    }

}
