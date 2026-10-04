package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p054c3.C1940k4;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ar */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13591ar extends AbstractC13613um {
    public AbstractC13591ar() {
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16381k4(int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public void m62706k4(C1940k4 c1940k4) {
        m62805k4((InterfaceC6900ck) c1940k4);
        if (c1940k4 != null) {
            mo16381k4(c1940k4.mo10012up(), c1940k4.mo10009jd());
        }
        m62707ks();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: kk */
    public final void mo10011kk() {
        mo10010k4(C12014ne.f40546k4.Clone(), (int[]) null);
    }

    /* JADX INFO: renamed from: ks */
    public void m62707ks() {
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public final boolean mo10014x1() {
        return C7019kk.m27469x1(m62815wl(), C1940k4.class);
    }

    public AbstractC13591ar(InterfaceC6901du interfaceC6901du) {
        super(interfaceC6901du);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: k4 */
    public void mo24303k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
        if (C7019kk.m27469x1(m62815wl(), C1940k4.class)) {
            ((C1940k4) C7019kk.m27452k4((Object) m62815wl(), C1940k4.class)).m62759k4(interfaceC6901du2);
        }
        super.mo24303k4(interfaceC6901du, interfaceC6901du2);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: k4 */
    public final void mo10010k4(C12014ne c12014ne, int[] iArr) {
        C12014ne c12014neClone;
        if (C7019kk.m27469x1(m62815wl(), C1940k4.class)) {
            if (iArr != null) {
                ((C1940k4) C7019kk.m27452k4((Object) m62815wl(), C1940k4.class)).m62816x1(c12014ne.Clone(), iArr);
                return;
            }
            return;
        }
        C1940k4 c1940k4 = null;
        try {
            C1940k4 c1940k42 = new C1940k4(mo10012up(), mo10009jd());
            try {
                c1940k42.m62759k4(m62755ck());
                if (!C12014ne.m56658kk(c12014ne, m62756dy()) || iArr == null) {
                    m62809kk(m62756dy().Clone(), new C13615uz(c1940k42));
                    if (iArr != null) {
                        c12014neClone = c12014ne.Clone();
                    }
                    m62706k4(c1940k42);
                }
                c12014neClone = c12014ne.Clone();
                c1940k42.m62816x1(c12014neClone, iArr);
                m62706k4(c1940k42);
            } catch (RuntimeException e) {
                e = e;
                c1940k4 = c1940k42;
                if (c1940k4 != null) {
                    c1940k4.dispose();
                }
                throw e;
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }
}
