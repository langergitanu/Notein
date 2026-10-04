package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p060ca.C2232oo;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.pm */
/* JADX INFO: loaded from: classes3.dex */
public class C2247pm extends C2232oo implements InterfaceC2020bx, InterfaceC2049dk, InterfaceC2257qb {

    /* JADX INFO: renamed from: du */
    private C2232oo f7736du;

    /* JADX INFO: renamed from: k4 */
    private C2303tf f7737k4;

    /* JADX INFO: renamed from: kk */
    private boolean f7738kk;

    /* JADX INFO: renamed from: to */
    private C2232oo.k4 f7739to;

    /* JADX INFO: renamed from: x1 */
    private Object f7740x1;

    public C2247pm(C2232oo c2232oo) {
        super(c2232oo.m11223yd(), 0L, 0L, 0L);
        this.f7740x1 = new Object();
        this.f7738kk = true;
        this.f7739to = new C2232oo.k4(c2232oo.mo11195k4().m11196k4());
        for (int i = 0; i < c2232oo.mo11195k4().m11196k4(); i++) {
            this.f7739to.m11200x1(0);
        }
        this.f7736du = c2232oo;
    }

    /* JADX INFO: renamed from: x1 */
    private void m11246x1() {
        if (this.f7738kk) {
            synchronized (this.f7740x1) {
                try {
                    if (this.f7738kk) {
                        long jM11197k4 = 0;
                        for (int i = 0; i < this.f7739to.m11196k4(); i++) {
                            this.f7739to.m11198k4(i, jM11197k4);
                            if (this.f7737k4.m11435ix().m10655x1(i)) {
                                this.f7739to.m11198k4(i, jM11197k4);
                                jM11197k4 = ((jM11197k4 & 4294967295L) + (((this.f7736du.mo11195k4().m11197k4(i + 1) & 4294967295L) - (this.f7736du.mo11195k4().m11197k4(i) & 4294967295L)) & 4294967295L)) & 4294967295L;
                            }
                        }
                        this.f7738kk = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2232oo
    /* JADX INFO: renamed from: k4 */
    public C2232oo.k4 mo11195k4() {
        m11246x1();
        return this.f7739to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11247k4(C2303tf c2303tf) {
        this.f7737k4 = c2303tf;
        c2303tf.mo10802up().f8325k4.m11822k4(this);
        c2303tf.mo10802up().f8328x1.m11133k4(this);
        c2303tf.mo10802up().f8326kk.m11141k4(this);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2257qb
    /* JADX INFO: renamed from: k4 */
    public final void mo10801k4(Object obj) {
        this.f7738kk = true;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2020bx
    /* JADX INFO: renamed from: k4 */
    public final void mo10282k4(Object obj, C2125i5 c2125i5) {
        this.f7738kk = true;
    }
}
