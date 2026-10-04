package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tf */
/* JADX INFO: loaded from: classes3.dex */
public class C2303tf extends C2132iq implements InterfaceC2020bx, InterfaceC2049dk, InterfaceC2201mt, InterfaceC2257qb {

    /* JADX INFO: renamed from: du */
    private boolean f7964du;

    /* JADX INFO: renamed from: k4 */
    private C2132iq f7965k4;

    /* JADX INFO: renamed from: kk */
    private C2104gx f7966kk;

    /* JADX INFO: renamed from: to */
    private Object f7967to;

    /* JADX INFO: renamed from: x1 */
    private C2398z1 f7968x1;

    public C2303tf(C2132iq c2132iq) {
        super(c2132iq.mo10259ck(), C2092fz.m10544k4(c2132iq.m10758x1()));
        this.f7967to = new Object();
        m11436k4(c2132iq);
        C2398z1 c2398z1 = new C2398z1();
        this.f7968x1 = c2398z1;
        c2398z1.f8325k4.m11822k4(this);
        this.f7968x1.f8328x1.m11133k4(this);
        this.f7968x1.f8326kk.m11141k4(this);
        C2104gx c2104gx = new C2104gx();
        this.f7966kk = c2104gx;
        c2104gx.m10653kk();
        if (m10758x1().m10574m9() != null) {
            ((C1994a8) m10758x1().m10574m9()).m10131k4(this);
        }
        if (m10758x1().m10550h4() != null) {
            ((C2247pm) m10758x1().m10550h4()).m11247k4(this);
        }
    }

    /* JADX INFO: renamed from: u4 */
    private AbstractC2313tw m11434u4() {
        if (!this.f7964du) {
            synchronized (this.f7967to) {
                try {
                    if (!this.f7964du) {
                        throw new NotImplementedException();
                    }
                } finally {
                }
            }
        }
        return this.f7965k4;
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq
    /* JADX INFO: renamed from: dy */
    public int mo10738dy() {
        return this.f7965k4.mo10738dy();
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: h4 */
    public String mo10262h4() {
        return this.f7965k4.mo10262h4();
    }

    /* JADX INFO: renamed from: ix */
    public final C2104gx m11435ix() {
        return this.f7966kk;
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq, com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public InterfaceC2371xl mo10263jd() {
        return this.f7965k4.mo10263jd();
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10265k4(AbstractC2220nx abstractC2220nx) {
        if (mo10802up().m11785x1(abstractC2220nx)) {
            return super.mo10265k4(abstractC2220nx);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq
    /* JADX INFO: renamed from: m9 */
    public String mo10752m9() {
        return this.f7965k4.mo10752m9();
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq
    /* JADX INFO: renamed from: rv */
    public C2038cx mo10754rv() {
        return this.f7965k4.mo10754rv();
    }

    @Override // com.aspose.slides.internal.p060ca.C2132iq
    /* JADX INFO: renamed from: to */
    public String mo10755to() {
        return this.f7965k4.mo10755to();
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2201mt
    /* JADX INFO: renamed from: up */
    public final C2398z1 mo10802up() {
        return this.f7968x1;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2201mt
    /* JADX INFO: renamed from: yj */
    public AbstractC2313tw mo10804yj() {
        return m11434u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11436k4(C2132iq c2132iq) {
        this.f7965k4 = c2132iq;
        this.f7964du = true;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2257qb
    /* JADX INFO: renamed from: k4 */
    public final void mo10801k4(Object obj) {
        try {
            this.f7966kk.m10654x1();
            this.f7966kk.m10651k4();
        } finally {
            this.f7966kk.m10653kk();
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2020bx
    /* JADX INFO: renamed from: k4 */
    public final void mo10282k4(Object obj, C2125i5 c2125i5) {
        try {
            this.f7966kk.m10654x1();
            this.f7966kk.m10652k4(m10757x1(c2125i5.f7332k4));
        } finally {
            this.f7966kk.m10653kk();
        }
    }
}
