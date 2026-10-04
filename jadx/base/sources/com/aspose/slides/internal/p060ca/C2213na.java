package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.na */
/* JADX INFO: loaded from: classes3.dex */
public class C2213na extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private C2227o9 f7659du;

    public C2213na(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("StartCharMetrics")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("EndCharMetrics\r\n"), AbstractC6747ar.m26650yj().mo26677to("EndCharMetrics\r"), AbstractC6747ar.m26650yj().mo26677to("EndCharMetrics\n")};
        m10978k4(new AbstractC2167ks[]{new C2393yo(c2120hx, this)});
    }

    /* JADX INFO: renamed from: k4 */
    public final C2227o9 m11167k4() {
        return this.f7659du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7659du = new C2227o9();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2393yo c2393yo = (C2393yo) C7019kk.m27452k4(obj, C2393yo.class);
        if (c2393yo != null) {
            C2295sq c2295sq = new C2295sq();
            c2295sq.m11422k4((Object) c2393yo.m11775k4());
            c2295sq.m11421k4(0);
            m11167k4().m11186k4().m11479k4(c2295sq);
        }
        super.mo10226k4(obj);
    }
}
