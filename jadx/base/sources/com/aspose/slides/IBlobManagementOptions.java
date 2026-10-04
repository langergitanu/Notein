package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBlobManagementOptions {
    long getMaxBlobsBytesInMemory();

    int getPresentationLockingBehavior();

    String getTempFilesRootPath();

    boolean isTemporaryFilesAllowed();

    void setMaxBlobsBytesInMemory(long j);

    void setPresentationLockingBehavior(int i);

    void setTempFilesRootPath(String str);

    void setTemporaryFilesAllowed(boolean z);
}
