package com.aspose.slides;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface IControl extends ISlideComponent {
    byte[] getActiveXControlBinary();

    UUID getClassId();

    IShapeFrame getFrame();

    String getName();

    int getPersistence();

    IControlPropertiesCollection getProperties();

    IPictureFillFormat getSubstitutePictureFormat();

    void setFrame(IShapeFrame iShapeFrame);

    void setName(String str);
}
