package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zs */
/* JADX INFO: loaded from: classes4.dex */
public class C9398zs extends AbstractC9120wl implements InterfaceC8885tq, InterfaceC9238xw, InterfaceC9374zj {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f34131ks = new C7017h4("idx", "order", "tx", "spPr", "invertIfNegative", "pictureOptions", "dPt", "dLbls", "trendline", "errBars", "cat", "val", "shape", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C8037js> f34132c5;

    /* JADX INFO: renamed from: ck */
    private C7935ij f34133ck;

    /* JADX INFO: renamed from: du */
    private C8828t1 f34134du;

    /* JADX INFO: renamed from: dy */
    private C9115wi f34135dy;

    /* JADX INFO: renamed from: fa */
    private C8262mg f34136fa;

    /* JADX INFO: renamed from: h4 */
    private C7547ec f34137h4;

    /* JADX INFO: renamed from: jd */
    private C8806su f34138jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f34139k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f34140kk;

    /* JADX INFO: renamed from: m9 */
    private List<C8442oh> f34141m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f34142to;

    /* JADX INFO: renamed from: up */
    private C8066ka f34143up;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f34144x1;

    /* JADX INFO: renamed from: yj */
    private C7683fo f34145yj;

    public C9398zs() {
        m45936xk();
        this.f34139k4 = new C8452ol();
        this.f34144x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: xk */
    private void m45936xk() {
        this.f34141m9 = new List<>();
        this.f34132c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aG_() {
        return this.f34133ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aH_() {
        return this.f34136fa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: b3 */
    public C8066ka mo43744b3() {
        return this.f34143up;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: bv */
    public C8806su mo30756bv() {
        if (this.f34138jd != null) {
            throw new Exception("Only one <errBars> element can be added.");
        }
        C8806su c8806su = new C8806su();
        this.f34138jd = c8806su;
        return c8806su;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: ck */
    public final C8262mg mo34719ck() {
        if (this.f34136fa != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f34136fa = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f34145yj;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f34140kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f34140kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: fa */
    public final C7935ij mo34720fa() {
        if (this.f34133ck != null) {
            throw new Exception("Only one <cat> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f34133ck = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f34145yj != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f34145yj = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f34141m9.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public C8452ol mo30763k4() {
        return this.f34139k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f34142to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f34140kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f34135dy != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f34135dy = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: qq */
    public C7547ec mo34722qq() {
        return this.f34137h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f34142to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f34142to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f34141m9.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: um */
    public C8806su mo43745um() {
        return this.f34138jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: uz */
    public C8037js[] mo30773uz() {
        return this.f34132c5.toArray(new C8037js[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: v4 */
    public C8828t1 mo39414v4() {
        return this.f34134du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: wl */
    public C8037js mo30774wl() {
        C8037js c8037js = new C8037js();
        this.f34132c5.addItem(c8037js);
        return c8037js;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: wy */
    public C8066ka mo43746wy() {
        if (this.f34143up != null) {
            throw new Exception("Only one <shape> element can be added.");
        }
        C8066ka c8066ka = new C8066ka();
        this.f34143up = c8066ka;
        return c8066ka;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f34144x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f34135dy;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9238xw
    /* JADX INFO: renamed from: yj */
    public final C8828t1 mo39416yj() {
        if (this.f34134du != null) {
            throw new Exception("Only one <invertIfNegative> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f34134du = c8828t1;
        return c8828t1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r2.addItem(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:1: B:8:0x0018->B:66:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9398zs(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz c8442oh;
        IGenericCollection iGenericCollection;
        m45936xk();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f34131ks.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 0:
                            this.f34139k4 = new C8452ol(abstractC13912i5);
                            break;
                        case 1:
                            this.f34144x1 = new C8452ol(abstractC13912i5);
                            break;
                        case 2:
                            this.f34140kk = new C9001v5(abstractC13912i5);
                            break;
                        case 3:
                            this.f34142to = new C8087kh(abstractC13912i5);
                            break;
                        case 4:
                            this.f34134du = new C8828t1(abstractC13912i5);
                            break;
                        case 5:
                            this.f34137h4 = new C7547ec(abstractC13912i5);
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                        case 6:
                            c8442oh = new C8442oh(abstractC13912i5);
                            iGenericCollection = this.f34141m9;
                            break;
                        case 7:
                            this.f34135dy = new C9115wi(abstractC13912i5);
                            break;
                        case 8:
                            c8442oh = new C8037js(abstractC13912i5);
                            iGenericCollection = this.f34132c5;
                            break;
                        case 9:
                            this.f34138jd = new C8806su(abstractC13912i5);
                            break;
                        case 10:
                            this.f34133ck = new C7935ij(abstractC13912i5);
                            break;
                        case 11:
                            this.f34136fa = new C8262mg(abstractC13912i5);
                            break;
                        case 12:
                            this.f34143up = new C8066ka(abstractC13912i5);
                            break;
                        case 13:
                            this.f34145yj = new C7683fo(abstractC13912i5);
                            break;
                        default:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public void mo30764k4(AbstractC7414ck abstractC7414ck) {
        this.f34145yj = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9374zj
    /* JADX INFO: renamed from: k4 */
    public final void mo34721k4(C8290mt c8290mt) {
        this.f34137h4 = (C7547ec) c8290mt;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f34139k4.mo6846k4("c", c3059ii, "idx");
        this.f34144x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f34140kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f34142to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8828t1 c8828t1 = this.f34134du;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "invertIfNegative");
        }
        C7547ec c7547ec = this.f34137h4;
        if (c7547ec != null) {
            c7547ec.mo6846k4("c", c3059ii, "pictureOptions");
        }
        List.Enumerator<C8037js> it = this.f34141m9.iterator();
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
        C9115wi c9115wi = this.f34135dy;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        it = this.f34132c5.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "trendline");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8806su c8806su = this.f34138jd;
        if (c8806su != null) {
            c8806su.mo6846k4("c", c3059ii, "errBars");
        }
        C7935ij c7935ij = this.f34133ck;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "cat");
        }
        C8262mg c8262mg = this.f34136fa;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "val");
        }
        C8066ka c8066ka = this.f34143up;
        if (c8066ka != null) {
            c8066ka.mo6846k4("c", c3059ii, "shape");
        }
        C7683fo c7683fo = this.f34145yj;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
