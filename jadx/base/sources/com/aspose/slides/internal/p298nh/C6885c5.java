package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3984kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6885c5 implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: x1 */
    private int f18829x1;

    /* JADX INFO: renamed from: kk */
    private C12003du f18828kk = new C12003du();

    /* JADX INFO: renamed from: k4 */
    private C3976c5 f18827k4 = new C3976c5();

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        C6885c5 c6885c5 = new C6885c5();
        c6885c5.f18827k4 = (C3976c5) this.f18827k4.deepClone();
        return c6885c5;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f18827k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m26949k4() {
        return this.f18829x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C3976c5 m26951kk() {
        return this.f18827k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m26952x1() {
        return this.f18828kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26950k4(C3984kk c3984kk) {
        this.f18827k4.m15666k4(c3984kk);
    }
}
