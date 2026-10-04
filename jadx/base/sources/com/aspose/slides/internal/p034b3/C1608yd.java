package com.aspose.slides.internal.p034b3;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C1608yd extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    private C12007ix f6218c5;

    /* JADX INFO: renamed from: dy */
    private C1593lr f6219dy;

    /* JADX INFO: renamed from: jd */
    private boolean f6220jd;

    public C1608yd(C12007ix c12007ix) {
        C12007ix c12007ix2 = new C12007ix();
        this.f6218c5 = c12007ix2;
        this.f6220jd = false;
        c12007ix.CloneTo(c12007ix2);
        m8667k4(32, Boolean.TRUE);
    }

    public final Object clone() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8475k4(InterfaceC1380to interfaceC1380to) {
        C1593lr c1593lr = this.f6219dy;
        if (c1593lr != null) {
            c1593lr.mo8475k4(interfaceC1380to);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final C1593lr m8684u4() {
        return this.f6219dy;
    }

    /* JADX INFO: renamed from: uz */
    public final C12007ix m8685uz() {
        return this.f6220jd ? new C12007ix(0.0f, 0.0f, m8678x1(), mo8658e_()) : C12007ix.f40519k4;
    }

    /* JADX INFO: renamed from: wl */
    public final C12007ix m8686wl() {
        return this.f6218c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8687x1(boolean z) {
        this.f6220jd = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8683k4(C1593lr c1593lr) {
        this.f6219dy = c1593lr;
    }
}
