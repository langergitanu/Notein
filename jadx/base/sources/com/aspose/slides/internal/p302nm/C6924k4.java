package com.aspose.slides.internal.p302nm;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6924k4 {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f18866k4;

    /* JADX INFO: renamed from: kk */
    private final int f18867kk;

    /* JADX INFO: renamed from: to */
    private final int f18868to;

    /* JADX INFO: renamed from: x1 */
    private final int f18869x1;

    public C6924k4(C3983k4 c3983k4) {
        this.f18868to = c3983k4.m15722x1();
        this.f18869x1 = c3983k4.m15716k4();
        this.f18867kk = c3983k4.m15715du();
        int iM15716k4 = c3983k4.m15716k4() * c3983k4.m15715du();
        byte[] bArr = new byte[iM15716k4];
        this.f18866k4 = bArr;
        C3914k4.m15618k4(c3983k4.m15721to(), bArr, 0, iM15716k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m27139k4() {
        return this.f18866k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m27140kk() {
        return this.f18869x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m27141to() {
        return this.f18867kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m27142x1() {
        return this.f18868to;
    }
}
