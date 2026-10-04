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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jj */
/* JADX INFO: loaded from: classes4.dex */
public class C8010jj extends AbstractC9120wl implements InterfaceC8885tq, InterfaceC9374zj {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25156up = new C7017h4("idx", "order", "tx", "spPr", "pictureOptions", "dPt", "dLbls", "trendline", "errBars", "cat", "val", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C8806su> f25157c5;

    /* JADX INFO: renamed from: ck */
    private C8262mg f25158ck;

    /* JADX INFO: renamed from: du */
    private C7547ec f25159du;

    /* JADX INFO: renamed from: dy */
    private List<C8037js> f25160dy;

    /* JADX INFO: renamed from: fa */
    private C7683fo f25161fa;

    /* JADX INFO: renamed from: h4 */
    private List<C8442oh> f25162h4;

    /* JADX INFO: renamed from: jd */
    private C7935ij f25163jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f25164k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f25165kk;

    /* JADX INFO: renamed from: m9 */
    private C9115wi f25166m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f25167to;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f25168x1;

    public C8010jj() {
        m34718xk();
        this.f25164k4 = new C8452ol();
        this.f25168x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: xk */
    private void m34718xk() {
        this.f25162h4 = new List<>();
        this.f25160dy = new List<>();
        this.f25157c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aG_() {
        return this.f25163jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aH_() {
        return this.f25158ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ar */
    public C8806su[] mo30755ar() {
        return this.f25157c5.toArray(new C8806su[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: bv */
    public C8806su mo30756bv() {
        C8806su c8806su = new C8806su();
        this.f25157c5.addItem(c8806su);
        return c8806su;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: ck */
    public final C8262mg mo34719ck() {
        if (this.f25158ck != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f25158ck = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f25161fa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f25165kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f25165kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: fa */
    public final C7935ij mo34720fa() {
        if (this.f25163jd != null) {
            throw new Exception("Only one <cat> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f25163jd = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f25161fa != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f25161fa = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f25162h4.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public C8452ol mo30763k4() {
        return this.f25164k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f25167to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f25165kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f25166m9 != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f25166m9 = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: qq */
    public C7547ec mo34722qq() {
        return this.f25159du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f25167to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f25167to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f25162h4.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: uz */
    public C8037js[] mo30773uz() {
        return this.f25160dy.toArray(new C8037js[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: wl */
    public C8037js mo30774wl() {
        C8037js c8037js = new C8037js();
        this.f25160dy.addItem(c8037js);
        return c8037js;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f25168x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f25166m9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r2.addItem(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[LOOP:1: B:8:0x0018->B:59:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8010jj(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz c8442oh;
        IGenericCollection iGenericCollection;
        m34718xk();
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
                    switch (f25156up.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 0:
                            this.f25164k4 = new C8452ol(abstractC13912i5);
                            break;
                        case 1:
                            this.f25168x1 = new C8452ol(abstractC13912i5);
                            break;
                        case 2:
                            this.f25165kk = new C9001v5(abstractC13912i5);
                            break;
                        case 3:
                            this.f25167to = new C8087kh(abstractC13912i5);
                            break;
                        case 4:
                            this.f25159du = new C7547ec(abstractC13912i5);
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                        case 5:
                            c8442oh = new C8442oh(abstractC13912i5);
                            iGenericCollection = this.f25162h4;
                            break;
                        case 6:
                            this.f25166m9 = new C9115wi(abstractC13912i5);
                            break;
                        case 7:
                            c8442oh = new C8037js(abstractC13912i5);
                            iGenericCollection = this.f25160dy;
                            break;
                        case 8:
                            c8442oh = new C8806su(abstractC13912i5);
                            iGenericCollection = this.f25157c5;
                            break;
                        case 9:
                            this.f25163jd = new C7935ij(abstractC13912i5);
                            break;
                        case 10:
                            this.f25158ck = new C8262mg(abstractC13912i5);
                            break;
                        case 11:
                            this.f25161fa = new C7683fo(abstractC13912i5);
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
        this.f25161fa = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9374zj
    /* JADX INFO: renamed from: k4 */
    public final void mo34721k4(C8290mt c8290mt) {
        this.f25159du = (C7547ec) c8290mt;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f25164k4.mo6846k4("c", c3059ii, "idx");
        this.f25168x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f25165kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f25167to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7547ec c7547ec = this.f25159du;
        if (c7547ec != null) {
            c7547ec.mo6846k4("c", c3059ii, "pictureOptions");
        }
        List.Enumerator<C8806su> it = this.f25162h4.iterator();
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
        C9115wi c9115wi = this.f25166m9;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        List.Enumerator<C8037js> it2 = this.f25160dy.iterator();
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
        it = this.f25157c5.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "errBars");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7935ij c7935ij = this.f25163jd;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "cat");
        }
        C8262mg c8262mg = this.f25158ck;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "val");
        }
        C7683fo c7683fo = this.f25161fa;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
