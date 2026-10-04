package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class BlobManagementOptions implements IBlobManagementOptions {

    /* JADX INFO: renamed from: k4 */
    private long f1226k4 = C7019kk.m27461m9(629145600, 9);

    /* JADX INFO: renamed from: x1 */
    private int f1229x1 = 0;

    /* JADX INFO: renamed from: kk */
    private boolean f1227kk = false;

    /* JADX INFO: renamed from: to */
    private String f1228to = C3141rv.m13402k4();

    @Override // com.aspose.slides.IBlobManagementOptions
    public final long getMaxBlobsBytesInMemory() {
        return this.f1226k4;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final int getPresentationLockingBehavior() {
        return this.f1229x1;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final String getTempFilesRootPath() {
        return this.f1228to;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final boolean isTemporaryFilesAllowed() {
        return this.f1227kk;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final void setMaxBlobsBytesInMemory(long j) {
        this.f1226k4 = j;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final void setPresentationLockingBehavior(int i) {
        this.f1229x1 = i;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final void setTempFilesRootPath(String str) {
        this.f1228to = str;
    }

    @Override // com.aspose.slides.IBlobManagementOptions
    public final void setTemporaryFilesAllowed(boolean z) {
        this.f1227kk = z;
    }
}
