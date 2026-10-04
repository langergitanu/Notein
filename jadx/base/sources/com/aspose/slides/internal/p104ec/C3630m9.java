package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.m9 */
/* JADX INFO: loaded from: classes3.dex */
class C3630m9 extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private byte f10063k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C3643to> f10064x1 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private void m14778x1(C3134k4 c3134k4) {
        C3643to c3643to;
        if ((this.f10063k4 & 255) != 1) {
            throw new InvalidOperationException();
        }
        do {
            c3643to = new C3643to();
            c3643to.mo14692k4(c3134k4);
            this.f10064x1.addItem(c3643to);
        } while (m14777k4(c3134k4, c3643to));
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C3643to> m14780k4() {
        return this.f10064x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m14779x1(C3149x1 c3149x1) {
        List.Enumerator<C3643to> it = this.f10064x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo14697k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14781k4(byte b) {
        this.f10063k4 = b;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10063k4 = c3134k4.m13387yj();
        m14778x1(c3134k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        c3149x1.m13443k4((byte) 1);
        m14779x1(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m14777k4(C3134k4 c3134k4, C3643to c3643to) {
        return ((c3643to.m14800k4().m14737k4() & 4294967295L) == 4095 && c3134k4.m13371ck().getPosition() != c3134k4.m13371ck().getLength()) || c3134k4.m13371ck().getPosition() < c3134k4.m13371ck().getLength();
    }
}
