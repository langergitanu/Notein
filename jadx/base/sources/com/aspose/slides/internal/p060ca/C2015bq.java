package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.bq */
/* JADX INFO: loaded from: classes3.dex */
public class C2015bq extends AbstractC2313tw {

    /* JADX INFO: renamed from: kk */
    private C2288sa f7012kk;

    /* JADX INFO: renamed from: to */
    private C2033cj f7014to;

    /* JADX INFO: renamed from: x1 */
    private C2302td f7015x1;

    /* JADX INFO: renamed from: m9 */
    private Object f7013m9 = new Object();

    /* JADX INFO: renamed from: dy */
    private Object f7008dy = new Object();

    /* JADX INFO: renamed from: c5 */
    private Object f7006c5 = new Object();

    /* JADX INFO: renamed from: jd */
    private Object f7010jd = new Object();

    /* JADX INFO: renamed from: k4 */
    private C2342vz f7011k4 = new C2342vz();

    /* JADX INFO: renamed from: du */
    private C2317u4 f7007du = new C2317u4();

    /* JADX INFO: renamed from: h4 */
    private List<Double> f7009h4 = new List<>();

    public C2015bq(C2033cj c2033cj) {
        this.f7014to = c2033cj;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: c5 */
    public InterfaceC2030c9 mo10258c5() {
        if (this.f7012kk == null) {
            synchronized (this.f7010jd) {
                try {
                    if (this.f7012kk == null) {
                        this.f7012kk = new C2288sa(this);
                    }
                } finally {
                }
            }
        }
        return this.f7012kk;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: ck */
    public C2033cj mo10259ck() {
        return this.f7014to;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: du */
    public int mo10260du() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: fa */
    public InterfaceC2201mt mo10261fa() {
        if (C7019kk.m27469x1(this, C2113hg.class)) {
            throw new C2279rs("Requested font type subsetting is not supported.");
        }
        return new C2181ls(this);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: h4 */
    public String mo10262h4() {
        return mo10267k4().m11576kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public InterfaceC2371xl mo10263jd() {
        if (this.f7015x1 == null) {
            synchronized (this.f7006c5) {
                try {
                    if (this.f7015x1 == null) {
                        this.f7015x1 = new C2302td(this);
                    }
                } finally {
                }
            }
        }
        return this.f7015x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m10264k4(int i) {
        C2357wz c2357wz = mo10267k4().m11569dy().f8003k4[i];
        C2068ei c2068ei = new C2068ei();
        C2072eo c2072eo = new C2072eo(mo10267k4().m11578m9().m10769k4());
        c2072eo.m10366k4(new C2399z2(c2072eo, this, c2068ei));
        try {
            this.f7007du.m11475k4(c2357wz.m11632x1());
            c2072eo.mo10372x1(this.f7007du);
            return c2068ei;
        } finally {
            this.f7007du.m11474k4();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final List<Double> m10268x1() {
        return this.f7009h4;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10265k4(AbstractC2220nx abstractC2220nx) {
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            return mo10266k4(c2319ub.m11480k4());
        }
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            return m10264k4(c2334v6.m11556k4());
        }
        throw new C2147jm("Integer Glyph ID is not supported for this font type.");
    }

    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10266k4(String str) {
        if (mo10267k4().m11569dy().f8004x1.containsKey(str)) {
            return m10264k4(((Integer) C7019kk.m27464to(mo10267k4().m11569dy().f8004x1.get_Item(str), Integer.TYPE)).intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C2342vz mo10267k4() {
        return this.f7011k4;
    }
}
