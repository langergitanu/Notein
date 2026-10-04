package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.he */
/* JADX INFO: loaded from: classes3.dex */
class C3616he extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private byte f10047k4;

    /* JADX INFO: renamed from: x1 */
    private final List<AbstractC3598bs> f10048x1 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final byte m14744k4() {
        return this.f10047k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<AbstractC3598bs> m14746x1() {
        return this.f10048x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m14742x1(C3134k4 c3134k4) {
        AbstractC3598bs c3607dy;
        for (int i = 0; i < 8 && c3134k4.m13371ck().getPosition() != c3134k4.m13371ck().getLength(); i++) {
            if ((((this.f10047k4 & 255) >> i) & 1) == 0) {
                c3607dy = new C3648up();
                c3607dy.mo14692k4(c3134k4);
            } else {
                c3607dy = new C3607dy();
                c3607dy.mo14692k4(c3134k4);
            }
            this.f10048x1.addItem(c3607dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14745k4(byte b) {
        this.f10047k4 = b;
    }

    /* JADX INFO: renamed from: x1 */
    private void m14743x1(C3149x1 c3149x1) {
        List.Enumerator<AbstractC3598bs> it = this.f10048x1.iterator();
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

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10047k4 = c3134k4.m13387yj();
        m14742x1(c3134k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        c3149x1.m13443k4(this.f10047k4);
        m14743x1(c3149x1);
    }
}
