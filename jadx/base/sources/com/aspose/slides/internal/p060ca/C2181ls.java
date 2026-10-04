package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ls */
/* JADX INFO: loaded from: classes3.dex */
public class C2181ls extends C2015bq implements InterfaceC2020bx, InterfaceC2049dk, InterfaceC2201mt, InterfaceC2257qb {

    /* JADX INFO: renamed from: du */
    private boolean f7586du;

    /* JADX INFO: renamed from: k4 */
    private C2015bq f7587k4;

    /* JADX INFO: renamed from: kk */
    private C2058dx f7588kk;

    /* JADX INFO: renamed from: to */
    private Object f7589to;

    /* JADX INFO: renamed from: x1 */
    private C2398z1 f7590x1;

    public C2181ls(C2015bq c2015bq) {
        super(c2015bq.mo10259ck());
        this.f7589to = new Object();
        m11081k4(c2015bq);
        C2398z1 c2398z1 = new C2398z1();
        this.f7590x1 = c2398z1;
        c2398z1.f8325k4.m11822k4(this);
        this.f7590x1.f8328x1.m11133k4(this);
        this.f7590x1.f8326kk.m11141k4(this);
        C2058dx c2058dx = new C2058dx();
        this.f7588kk = c2058dx;
        c2058dx.m10440kk();
    }

    /* JADX INFO: renamed from: to */
    private AbstractC2313tw m11080to() {
        if (!this.f7586du) {
            synchronized (this.f7589to) {
                try {
                    if (!this.f7586du) {
                        throw new NotImplementedException();
                    }
                } finally {
                }
            }
        }
        return this.f7587k4;
    }

    @Override // com.aspose.slides.internal.p060ca.C2015bq, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: h4 */
    public String mo10262h4() {
        return this.f7587k4.mo10262h4();
    }

    @Override // com.aspose.slides.internal.p060ca.C2015bq, com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public InterfaceC2371xl mo10263jd() {
        return this.f7587k4.mo10263jd();
    }

    @Override // com.aspose.slides.internal.p060ca.C2015bq, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10265k4(AbstractC2220nx abstractC2220nx) {
        if (mo10802up().m11785x1(abstractC2220nx)) {
            return super.mo10265k4(abstractC2220nx);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final C2058dx m11082kk() {
        return this.f7588kk;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2201mt
    /* JADX INFO: renamed from: up */
    public final C2398z1 mo10802up() {
        return this.f7590x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m11083x1(AbstractC2220nx abstractC2220nx) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 == null) {
            C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
            return c2319ub != null ? c2319ub.m11480k4() : C2319ub.f8011k4.m11480k4();
        }
        C2319ub c2319ub2 = (C2319ub) C7019kk.m27452k4((Object) mo10263jd().mo10989x1((char) c2334v6.m11556k4()), C2319ub.class);
        if (c2319ub2 != null) {
            return c2319ub2.m11480k4();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2201mt
    /* JADX INFO: renamed from: yj */
    public AbstractC2313tw mo10804yj() {
        return m11080to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11081k4(C2015bq c2015bq) {
        this.f7587k4 = c2015bq;
        this.f7586du = true;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2257qb
    /* JADX INFO: renamed from: k4 */
    public final void mo10801k4(Object obj) {
        try {
            this.f7588kk.m10441x1();
            this.f7588kk.m10438k4();
        } finally {
            this.f7588kk.m10440kk();
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2020bx
    /* JADX INFO: renamed from: k4 */
    public final void mo10282k4(Object obj, C2125i5 c2125i5) {
        try {
            this.f7588kk.m10441x1();
            this.f7588kk.m10439k4(m11083x1(c2125i5.f7332k4));
        } finally {
            this.f7588kk.m10440kk();
        }
    }
}
