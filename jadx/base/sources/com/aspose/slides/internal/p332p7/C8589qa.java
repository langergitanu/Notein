package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qa */
/* JADX INFO: loaded from: classes4.dex */
public class C8589qa extends AbstractC9120wl implements InterfaceC8466os, InterfaceC9088w6, InterfaceC9238xw {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f28801ks = new C7017h4("idx", "order", "tx", "spPr", "invertIfNegative", "dPt", "dLbls", "trendline", "errBars", "xVal", "yVal", "bubbleSize", "bubble3D", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C8806su> f28802c5;

    /* JADX INFO: renamed from: ck */
    private C8262mg f28803ck;

    /* JADX INFO: renamed from: du */
    private C8828t1 f28804du;

    /* JADX INFO: renamed from: dy */
    private List<C8037js> f28805dy;

    /* JADX INFO: renamed from: fa */
    private C8262mg f28806fa;

    /* JADX INFO: renamed from: h4 */
    private List<C8442oh> f28807h4;

    /* JADX INFO: renamed from: jd */
    private C7935ij f28808jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f28809k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f28810kk;

    /* JADX INFO: renamed from: m9 */
    private C9115wi f28811m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f28812to;

    /* JADX INFO: renamed from: up */
    private C8828t1 f28813up;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f28814x1;

    /* JADX INFO: renamed from: yj */
    private C7683fo f28815yj;

    public C8589qa() {
        m39407ts();
        this.f28809k4 = new C8452ol();
        this.f28814x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: ts */
    private void m39407ts() {
        this.f28807h4 = new List<>();
        this.f28805dy = new List<>();
        this.f28802c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aB_() {
        return this.f28808jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aC_() {
        return this.f28803ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aL_() {
        return this.f28806fa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ak */
    public C8828t1 mo39412ak() {
        return this.f28813up;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ar */
    public C8806su[] mo30755ar() {
        return this.f28802c5.toArray(new C8806su[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: bv */
    public C8806su mo30756bv() {
        C8806su c8806su = new C8806su();
        this.f28802c5.addItem(c8806su);
        return c8806su;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9088w6
    /* JADX INFO: renamed from: c5 */
    public final C7935ij mo30757c5() {
        if (this.f28808jd != null) {
            throw new Exception("Only one <xVal> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f28808jd = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dq */
    public C8828t1 mo39413dq() {
        if (this.f28813up != null) {
            throw new Exception("Only one <bubble3D> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f28813up = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f28815yj;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f28810kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f28810kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f28815yj != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f28815yj = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f28807h4.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8466os
    /* JADX INFO: renamed from: jd */
    public final C8262mg mo30762jd() {
        if (this.f28803ck != null) {
            throw new Exception("Only one <yVal> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f28803ck = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f28810kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f28811m9 != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f28811m9 = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f28812to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f28812to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f28807h4.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: uz */
    public C8037js[] mo30773uz() {
        return this.f28805dy.toArray(new C8037js[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: v4 */
    public C8828t1 mo39414v4() {
        return this.f28804du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: wl */
    public C8037js mo30774wl() {
        C8037js c8037js = new C8037js();
        this.f28805dy.addItem(c8037js);
        return c8037js;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f28811m9;
    }

    /* JADX INFO: renamed from: xk */
    public final C8262mg m39415xk() {
        if (this.f28806fa != null) {
            throw new Exception("Only one <bubbleSize> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f28806fa = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9238xw
    /* JADX INFO: renamed from: yj */
    public final C8828t1 mo39416yj() {
        if (this.f28804du != null) {
            throw new Exception("Only one <invertIfNegative> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f28804du = c8828t1;
        return c8828t1;
    }

    public C8589qa(final AbstractC13912i5 abstractC13912i5) {
        m39407ts();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8442oh;
                List list;
                switch (C8589qa.f28801ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8589qa.this.f28809k4 = new C8452ol(abstractC13912i5);
                        return true;
                    case 1:
                        C8589qa.this.f28814x1 = new C8452ol(abstractC13912i5);
                        return true;
                    case 2:
                        C8589qa.this.f28810kk = new C9001v5(abstractC13912i5);
                        return true;
                    case 3:
                        C8589qa.this.f28812to = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C8589qa.this.f28804du = new C8828t1(abstractC13912i5);
                        return true;
                    case 5:
                        c8442oh = new C8442oh(abstractC13912i5);
                        list = C8589qa.this.f28807h4;
                        break;
                    case 6:
                        C8589qa.this.f28811m9 = new C9115wi(abstractC13912i5);
                        return true;
                    case 7:
                        c8442oh = new C8037js(abstractC13912i5);
                        list = C8589qa.this.f28805dy;
                        break;
                    case 8:
                        c8442oh = new C8806su(abstractC13912i5);
                        list = C8589qa.this.f28802c5;
                        break;
                    case 9:
                        C8589qa.this.f28808jd = new C7935ij(abstractC13912i5);
                        return true;
                    case 10:
                        C8589qa.this.f28803ck = new C8262mg(abstractC13912i5);
                        return true;
                    case 11:
                        C8589qa.this.f28806fa = new C8262mg(abstractC13912i5);
                        return true;
                    case 12:
                        C8589qa.this.f28813up = new C8828t1(abstractC13912i5);
                        return true;
                    case 13:
                        C8589qa.this.f28815yj = new C7683fo(abstractC13912i5);
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
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f28812to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f28814x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public C8452ol mo30763k4() {
        return this.f28809k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public void mo30764k4(AbstractC7414ck abstractC7414ck) {
        this.f28815yj = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f28809k4.mo6846k4("c", c3059ii, "idx");
        this.f28814x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f28810kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f28812to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8828t1 c8828t1 = this.f28804du;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "invertIfNegative");
        }
        List.Enumerator<C8806su> it = this.f28807h4.iterator();
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
        C9115wi c9115wi = this.f28811m9;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        List.Enumerator<C8037js> it2 = this.f28805dy.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("c", c3059ii, "trendline");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = this.f28802c5.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "errBars");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7935ij c7935ij = this.f28808jd;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "xVal");
        }
        C8262mg c8262mg = this.f28803ck;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "yVal");
        }
        C8262mg c8262mg2 = this.f28806fa;
        if (c8262mg2 != null) {
            c8262mg2.mo6846k4("c", c3059ii, "bubbleSize");
        }
        C8828t1 c8828t12 = this.f28813up;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, "bubble3D");
        }
        C7683fo c7683fo = this.f28815yj;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
