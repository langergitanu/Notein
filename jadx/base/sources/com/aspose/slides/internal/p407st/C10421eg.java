package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.eg */
/* JADX INFO: loaded from: classes4.dex */
public class C10421eg {

    /* JADX INFO: renamed from: k4 */
    private long f36964k4;

    /* JADX INFO: renamed from: x1 */
    private long f36965x1;

    public C10421eg(long j, long j2) {
        this.f36964k4 = j;
        this.f36965x1 = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m50742k4() {
        return this.f36964k4;
    }

    public String toString() {
        return C14113y2.m67402k4("OfficeArtIDCL, dgid:{0}, cspidCur:{1}", Long.valueOf(this.f36964k4), Long.valueOf(this.f36965x1));
    }

    /* JADX INFO: renamed from: x1 */
    public int m50745x1() {
        return 8;
    }

    public C10421eg(C3134k4 c3134k4) {
        this.f36964k4 = c3134k4.m13384uz();
        this.f36965x1 = c3134k4.m13384uz();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50743k4(long j) {
        this.f36964k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50746x1(long j) {
        this.f36965x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50744k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36964k4);
        c3149x1.m13447k4(this.f36965x1 & 4294967295L);
    }
}
