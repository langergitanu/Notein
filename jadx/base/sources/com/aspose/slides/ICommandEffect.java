package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ICommandEffect extends IBehavior {
    String getCommandString();

    IShape getShapeTarget();

    byte getType();

    void setCommandString(String str);

    void setShapeTarget(IShape iShape);

    void setType(byte b);
}
