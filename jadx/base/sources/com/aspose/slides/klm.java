package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class klm extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private boolean f45762du;

    /* JADX INFO: renamed from: k4 */
    private final C0886d8 f45763k4;

    /* JADX INFO: renamed from: kk */
    private C12025x6 f45764kk = new C12025x6();

    /* JADX INFO: renamed from: to */
    private C12025x6 f45765to = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    private final List<C12025x6> f45766x1 = new List<>();

    public klm(C0886d8 c0886d8) {
        this.f45763k4 = c0886d8;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63968k4(C11896dy c11896dy) {
        C13847mr c13847mrM5012up = this.f45763k4.m5012up();
        im9.m7694k4(c13847mrM5012up.m64941c5().m69834fa().m506k4(c13847mrM5012up.m64941c5().m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone(), C12003du.f40505to.Clone(), c13847mrM5012up.m64941c5(), c11896dy, (LineFormat) ((DataLabelCollection) c13847mrM5012up.m64945h4().getLabels()).getLeaderLinesFormat().getLine(), (FillFormat) null, (IEffectFormat) null);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return m63976to();
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6 m63971dy() {
        return this.f45765to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12025x6 m63975m9() {
        return this.f45764kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m63976to() {
        return this.f45762du;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C11896dy c11896dy = new C11896dy();
        if (this.f45766x1.size() > 1) {
            C12025x6 c12025x6Clone = C14873z5.m74322k4(this.f45766x1.get_Item(0).Clone(), m73227xk(), m73206c6()).Clone();
            for (int i = 1; i < this.f45766x1.size(); i++) {
                C12025x6 c12025x6Clone2 = C14873z5.m74322k4(this.f45766x1.get_Item(i).Clone(), m73227xk(), m73206c6()).Clone();
                c11896dy.m55547k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone());
                c12025x6Clone2.CloneTo(c12025x6Clone);
            }
        }
        m63968k4(c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63972k4(boolean z) {
        this.f45762du = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63973k4(C12007ix c12007ix, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2) {
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr3 = {c12025x6};
        C12025x6[] c12025x6Arr4 = {c12025x62};
        boolean zM63974k4 = m63974k4(c12007ix.Clone(), c12025x6Arr, c12025x6Arr2, false, c12025x6Arr3, c12025x6Arr4);
        c12025x6Arr3[0].CloneTo(c12025x6);
        c12025x6Arr4[0].CloneTo(c12025x62);
        return zM63974k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63974k4(C12007ix c12007ix, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2, boolean z, C12025x6[] c12025x6Arr3, C12025x6[] c12025x6Arr4) {
        boolean zM63969k4;
        C12025x6 c12025x6;
        List<C12025x6> list;
        C12025x6 c12025x62;
        this.f45766x1.clear();
        C12025x6.f40591k4.CloneTo(c12025x6Arr3[0]);
        C12025x6.f40591k4.CloneTo(c12025x6Arr4[0]);
        jjy jjyVar = new jjy(c12007ix.Clone());
        double d = Double.MAX_VALUE;
        for (C12025x6 c12025x63 : c12025x6Arr) {
            if (!jjyVar.m63361x1(c12025x63.Clone())) {
                for (C12025x6 c12025x64 : c12025x6Arr2) {
                    float fM56897x1 = c12025x64.m56897x1() - c12025x63.m56897x1();
                    float fM56895kk = c12025x64.m56895kk() - c12025x63.m56895kk();
                    double dM67496rv = C14116yg.m67496rv((fM56895kk * fM56895kk) + (fM56897x1 * fM56897x1));
                    if (d > dM67496rv) {
                        c12025x64.CloneTo(c12025x6Arr4[0]);
                        c12025x63.CloneTo(c12025x6Arr3[0]);
                        d = dM67496rv;
                    }
                }
            }
        }
        if (!C12025x6.m56888x1(c12025x6Arr4[0], C12025x6.f40591k4) || !C12025x6.m56888x1(c12025x6Arr3[0], C12025x6.f40591k4)) {
            return false;
        }
        this.f45766x1.addItem(c12025x6Arr3[0].Clone());
        C12025x6 c12025x65 = new C12025x6();
        C12025x6[] c12025x6Arr5 = {c12025x65};
        if (z) {
            zM63969k4 = m63970k4(c12025x6Arr3[0].Clone(), jjyVar.m63359to().Clone(), c12025x6Arr5);
            c12025x6 = c12025x6Arr5[0];
        } else {
            zM63969k4 = m63969k4(c12025x6Arr3[0].Clone(), jjyVar.m63359to().Clone(), 4.0f, c12025x6Arr5);
            c12025x6 = c12025x6Arr5[0];
        }
        c12025x6.CloneTo(c12025x65);
        if (zM63969k4) {
            c12025x65.CloneTo(c12025x6Arr4[0]);
            list = this.f45766x1;
            c12025x62 = c12025x6Arr4[0];
        } else {
            if (C14116yg.m67480k4(jjyVar.m63352du().m56897x1() - c12025x6Arr4[0].m56897x1()) > 4.0f) {
                float f = jjyVar.m63352du().m56897x1() - c12025x6Arr4[0].m56897x1() > 0.0f ? -4.0f : 4.0f;
                C12025x6 c12025x6Clone = c12025x6Arr4[0].Clone();
                C12025x6 c12025x66 = new C12025x6(c12025x6Arr4[0].m56897x1() + f, c12025x6Arr4[0].m56895kk());
                c12025x6Arr4[0] = c12025x66;
                this.f45766x1.addItem(c12025x66.Clone());
                this.f45766x1.addItem(c12025x6Clone.Clone());
                c12025x6Arr3[0].CloneTo(this.f45764kk);
                c12025x6Arr4[0].CloneTo(this.f45765to);
                return true;
            }
            list = this.f45766x1;
            c12025x62 = c12025x6Arr4[0];
        }
        list.addItem(c12025x62.Clone());
        c12025x6Arr3[0].CloneTo(this.f45764kk);
        c12025x6Arr4[0].CloneTo(this.f45765to);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63969k4(C12025x6 c12025x6, C12007ix c12007ix, float f, C12025x6[] c12025x6Arr) {
        C12025x6.f40591k4.CloneTo(c12025x6Arr[0]);
        float fM56571to = c12007ix.m56571to() - f;
        float fM56556h4 = c12007ix.m56556h4() + f;
        if (c12025x6.m56897x1() < fM56571to || c12025x6.m56897x1() > fM56556h4) {
            return false;
        }
        float fOooO00o = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
        if (c12025x6.m56895kk() < c12007ix.m56554dy()) {
            c12025x6Arr[0] = new C12025x6(fOooO00o, c12007ix.m56554dy());
            return true;
        }
        c12025x6Arr[0] = new C12025x6(fOooO00o, c12007ix.m56558k4());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63970k4(C12025x6 c12025x6, C12007ix c12007ix, C12025x6[] c12025x6Arr) {
        C12025x6.f40591k4.CloneTo(c12025x6Arr[0]);
        if (c12025x6.m56897x1() < c12007ix.m56571to() || c12025x6.m56897x1() > c12007ix.m56556h4()) {
            return false;
        }
        if (c12025x6.m56895kk() < c12007ix.m56554dy()) {
            c12025x6Arr[0] = new C12025x6(c12025x6.m56897x1(), c12007ix.m56554dy());
            return true;
        }
        c12025x6Arr[0] = new C12025x6(c12025x6.m56897x1(), c12007ix.m56558k4());
        return true;
    }
}
