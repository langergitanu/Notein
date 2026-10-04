package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class x6o implements InterfaceC1225hv {

    /* JADX INFO: renamed from: kk */
    private C12007ix f49990kk;

    /* JADX INFO: renamed from: x1 */
    private C11909up f49992x1;

    /* JADX INFO: renamed from: to */
    private C12015qq f49991to = new C12015qq();

    /* JADX INFO: renamed from: k4 */
    private C11913yj f49989k4 = new C11913yj();

    public x6o(C12023wl c12023wl, double d, boolean z) {
        this.f49990kk = new C12007ix();
        float f = (float) ((d / 3.141592653589793d) * 180.0d);
        m73150k4(C12023wl.m56853k4(c12023wl).Clone(), f).CloneTo(this.f49991to);
        C12003du c12003duClone = C12003du.m56460uz().Clone();
        C12003du c12003duClone2 = C12003du.m56385i5().Clone();
        if (z) {
            C12003du[] c12003duArr = {c12003duClone};
            C12003du[] c12003duArr2 = {c12003duClone2};
            C3085sv.m13086k4(c12003duArr, c12003duArr2);
            c12003duArr[0].CloneTo(c12003duClone);
            c12003duArr2[0].CloneTo(c12003duClone2);
        }
        C11902kk c11902kk = new C11902kk(4);
        c11902kk.m55667k4(new C12003du[]{c12003duClone, c12003duClone, c12003duClone2, c12003duClone2});
        c11902kk.m55666k4(new float[]{0.0f, 0.33333334f, 0.6666667f, 1.0f});
        C12015qq c12015qq = this.f49991to;
        C12015qq c12015qqClone = C12015qq.m56688k4(C12015qq.m56688k4(c12015qq, c12015qq), this.f49991to).Clone();
        C11909up c11909upM55707k4 = C11909up.m55707k4(new C12007ix(C12025x6.f40591k4.Clone(), c12015qqClone.Clone()), c12003duClone, c12003duClone2, 0);
        this.f49992x1 = c11909upM55707k4;
        c11909upM55707k4.m55726k4(c11902kk);
        this.f49990kk = new C12007ix(C12025x6.f40591k4.Clone(), c12015qqClone.Clone());
        C12025x6 c12025x6 = new C12025x6(c12023wl.m56865x1() * 0.5f, c12023wl.m56862kk() * 0.5f);
        this.f49989k4.m55758dy();
        this.f49989k4.m55767k4(f, c12025x6.Clone(), 0);
        this.f49989k4.m55786x1(-((this.f49991to.m56699x1() / 2.0f) - c12025x6.m56897x1()), -((this.f49991to.m56697kk() / 2.0f) - c12025x6.m56895kk()), 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m73150k4(C12015qq c12015qq, float f) {
        C12015qq c12015qqClone = c12015qq.Clone();
        c12015qqClone.m56695k4(c12015qqClone.m56699x1() / 2.0f);
        c12015qqClone.m56700x1(c12015qqClone.m56697kk() / 2.0f);
        C12025x6[] c12025x6Arr = {new C12025x6(-c12015qqClone.m56699x1(), -c12015qqClone.m56697kk()), new C12025x6(c12015qqClone.m56699x1(), -c12015qqClone.m56697kk()), new C12025x6(c12015qqClone.m56699x1(), c12015qqClone.m56697kk()), new C12025x6(-c12015qqClone.m56699x1(), c12015qqClone.m56697kk())};
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55758dy();
        c11913yj.m55762k4(f);
        c11913yj.m55775k4(c12025x6Arr);
        C12025x6 c12025x6 = new C12025x6(Float.MAX_VALUE, Float.MAX_VALUE);
        C12025x6 c12025x62 = new C12025x6(-3.4028235E38f, -3.4028235E38f);
        for (int i = 0; i < 4; i++) {
            C12025x6 c12025x6Clone = c12025x6Arr[i].Clone();
            c12025x6.m56891k4(C14116yg.m67504x1(c12025x6.m56897x1(), c12025x6Clone.m56897x1()));
            c12025x6.m56898x1(C14116yg.m67504x1(c12025x6.m56895kk(), c12025x6Clone.m56895kk()));
            c12025x62.m56891k4(C14116yg.m67481k4(c12025x62.m56897x1(), c12025x6Clone.m56897x1()));
            c12025x62.m56898x1(C14116yg.m67481k4(c12025x62.m56895kk(), c12025x6Clone.m56895kk()));
        }
        return new C12015qq(c12025x62.m56897x1() - c12025x6.m56897x1(), c12025x62.m56895kk() - c12025x6.m56895kk());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f49992x1.dispose();
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        abstractC12008jd.mo17500k4(this.f49989k4, 0);
        abstractC12008jd.mo17585x1((this.f49991to.m56699x1() + this.f49991to.m56699x1()) * (-f), 0.0f, 0);
        abstractC12008jd.mo17593x1(this.f49992x1, this.f49990kk.Clone());
        abstractC12008jd.mo17475du();
    }
}
