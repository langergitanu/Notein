package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.td */
/* JADX INFO: loaded from: classes3.dex */
public class C2302td implements InterfaceC2371xl {

    /* JADX INFO: renamed from: k4 */
    private C2343w2 f7960k4;

    /* JADX INFO: renamed from: to */
    private InterfaceC2110h9 f7962to;

    /* JADX INFO: renamed from: x1 */
    private C2015bq f7963x1;

    /* JADX INFO: renamed from: du */
    private Object f7958du = new Object();

    /* JADX INFO: renamed from: h4 */
    private Object f7959h4 = new Object();

    /* JADX INFO: renamed from: kk */
    private C2254q3 f7961kk = new C2254q3();

    public C2302td(C2015bq c2015bq) {
        this.f7963x1 = c2015bq;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final int mo10986k4(AbstractC2220nx abstractC2220nx) {
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            return m11433x1().mo10660k4(c2319ub.m11480k4());
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C2343w2 m11432kk() {
        if (this.f7960k4 == null) {
            synchronized (this.f7959h4) {
                try {
                    if (this.f7960k4 == null) {
                        this.f7960k4 = new C2343w2();
                        for (int i = 0; i < 256; i++) {
                            if (m11430k4().m11258k4(i) != null && !this.f7960k4.m11585x1(m11430k4().m11258k4(i))) {
                                this.f7960k4.m11584x1(m11430k4().m11258k4(i), i);
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return this.f7960k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC2110h9 m11433x1() {
        if (this.f7962to == null) {
            synchronized (this.f7958du) {
                try {
                    if (this.f7962to == null) {
                        this.f7962to = C2107h4.f7286k4;
                    }
                } finally {
                }
            }
        }
        return this.f7962to;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final AbstractC2220nx mo10987k4(int i) {
        char c = (char) (i & 65535);
        int iMo10661k4 = m11433x1().mo10661k4(c);
        for (int i2 = 0; i2 < iMo10661k4; i2++) {
            String strMo10662k4 = m11433x1().mo10662k4(c, i2);
            if (m11432kk().m11585x1(strMo10662k4) && m11432kk().m11582k4(strMo10662k4) != 0) {
                return new C2319ub(strMo10662k4);
            }
        }
        return C2319ub.f8011k4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: x1 */
    public final AbstractC2220nx mo10989x1(int i) {
        return new C2319ub(m11430k4().m11258k4((char) (i & 65535)));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2254q3 m11430k4() {
        return this.f7961kk;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final void mo10988k4(int i, int i2) {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11431k4(InterfaceC2110h9 interfaceC2110h9) {
        this.f7962to = interfaceC2110h9;
    }
}
