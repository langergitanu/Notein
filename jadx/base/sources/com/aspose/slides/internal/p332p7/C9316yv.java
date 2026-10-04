package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yv */
/* JADX INFO: loaded from: classes4.dex */
public class C9316yv extends AbstractC9120wl implements InterfaceC8885tq, InterfaceC9040vh {

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f33534yj = new C7017h4("idx", "order", "tx", "spPr", RequestParameters.MARKER, "dPt", "dLbls", "trendline", "errBars", "cat", "val", "smooth", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8806su f33535c5;

    /* JADX INFO: renamed from: ck */
    private C8262mg f33536ck;

    /* JADX INFO: renamed from: du */
    private C8453om f33537du;

    /* JADX INFO: renamed from: dy */
    private List<C8037js> f33538dy;

    /* JADX INFO: renamed from: fa */
    private C8828t1 f33539fa;

    /* JADX INFO: renamed from: h4 */
    private List<C8442oh> f33540h4;

    /* JADX INFO: renamed from: jd */
    private C7935ij f33541jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f33542k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f33543kk;

    /* JADX INFO: renamed from: m9 */
    private C9115wi f33544m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f33545to;

    /* JADX INFO: renamed from: up */
    private C7683fo f33546up;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f33547x1;

    public C9316yv() {
        m45173c6();
        this.f33542k4 = new C8452ol();
        this.f33547x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: c6 */
    private void m45173c6() {
        this.f33540h4 = new List<>();
        this.f33538dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8453om aF_() {
        return this.f33537du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aG_() {
        return this.f33541jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aH_() {
        return this.f33536ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: bv */
    public C8806su mo30756bv() {
        if (this.f33535c5 != null) {
            throw new Exception("Only one <errBars> element can be added.");
        }
        C8806su c8806su = new C8806su();
        this.f33535c5 = c8806su;
        return c8806su;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: ck */
    public final C8262mg mo34719ck() {
        if (this.f33536ck != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f33536ck = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f33546up;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f33543kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f33543kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: fa */
    public final C7935ij mo34720fa() {
        if (this.f33541jd != null) {
            throw new Exception("Only one <cat> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f33541jd = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f33546up != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f33546up = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f33540h4.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f33545to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ks */
    public C8453om mo30766ks() {
        if (this.f33537du != null) {
            throw new Exception("Only one <marker> element can be added.");
        }
        C8453om c8453om = new C8453om();
        this.f33537du = c8453om;
        return c8453om;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f33543kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f33544m9 != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f33544m9 = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: rv */
    public C8828t1 mo30769rv() {
        return this.f33539fa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f33545to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f33545to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f33540h4.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: um */
    public C8806su mo43745um() {
        return this.f33535c5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9040vh
    /* JADX INFO: renamed from: up */
    public final C8828t1 mo30772up() {
        if (this.f33539fa != null) {
            throw new Exception("Only one <smooth> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f33539fa = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: uz */
    public C8037js[] mo30773uz() {
        return this.f33538dy.toArray(new C8037js[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: wl */
    public C8037js mo30774wl() {
        C8037js c8037js = new C8037js();
        this.f33538dy.addItem(c8037js);
        return c8037js;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f33544m9;
    }

    public C9316yv(final AbstractC13912i5 abstractC13912i5) {
        m45173c6();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8442oh;
                List list;
                switch (C9316yv.f33534yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9316yv.this.f33542k4 = new C8452ol(abstractC13912i5);
                        return true;
                    case 1:
                        C9316yv.this.f33547x1 = new C8452ol(abstractC13912i5);
                        return true;
                    case 2:
                        C9316yv.this.f33543kk = new C9001v5(abstractC13912i5);
                        return true;
                    case 3:
                        C9316yv.this.f33545to = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C9316yv.this.f33537du = new C8453om(abstractC13912i5);
                        return true;
                    case 5:
                        c8442oh = new C8442oh(abstractC13912i5);
                        list = C9316yv.this.f33540h4;
                        break;
                    case 6:
                        C9316yv.this.f33544m9 = new C9115wi(abstractC13912i5);
                        return true;
                    case 7:
                        c8442oh = new C8037js(abstractC13912i5);
                        list = C9316yv.this.f33538dy;
                        break;
                    case 8:
                        C9316yv.this.f33535c5 = new C8806su(abstractC13912i5);
                        return true;
                    case 9:
                        C9316yv.this.f33541jd = new C7935ij(abstractC13912i5);
                        return true;
                    case 10:
                        C9316yv.this.f33536ck = new C8262mg(abstractC13912i5);
                        return true;
                    case 11:
                        C9316yv.this.f33539fa = new C8828t1(abstractC13912i5);
                        return true;
                    case 12:
                        C9316yv.this.f33546up = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8442oh);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f33547x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public C8452ol mo30763k4() {
        return this.f33542k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public void mo30764k4(AbstractC7414ck abstractC7414ck) {
        this.f33546up = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f33542k4.mo6846k4("c", c3059ii, "idx");
        this.f33547x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f33543kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f33545to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8453om c8453om = this.f33537du;
        if (c8453om != null) {
            c8453om.mo6846k4("c", c3059ii, RequestParameters.MARKER);
        }
        List.Enumerator<C8037js> it = this.f33540h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "dPt");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C9115wi c9115wi = this.f33544m9;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        it = this.f33538dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "trendline");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8806su c8806su = this.f33535c5;
        if (c8806su != null) {
            c8806su.mo6846k4("c", c3059ii, "errBars");
        }
        C7935ij c7935ij = this.f33541jd;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "cat");
        }
        C8262mg c8262mg = this.f33536ck;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "val");
        }
        C8828t1 c8828t1 = this.f33539fa;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "smooth");
        }
        C7683fo c7683fo = this.f33546up;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
