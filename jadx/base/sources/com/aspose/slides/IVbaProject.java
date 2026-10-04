package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IVbaProject {
    IVbaModuleCollection getModules();

    String getName();

    IVbaReferenceCollection getReferences();

    boolean isPasswordProtected();

    byte[] toBinary();
}
