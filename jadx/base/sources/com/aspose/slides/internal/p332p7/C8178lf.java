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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lf */
/* JADX INFO: loaded from: classes4.dex */
public class C8178lf extends AbstractC9120wl implements InterfaceC8885tq {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f26232ck = new C7017h4("idx", "order", "tx", "spPr", "explosion", "dPt", "dLbls", "cat", "val", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8262mg f26233c5;

    /* JADX INFO: renamed from: du */
    private C8452ol f26234du;

    /* JADX INFO: renamed from: dy */
    private C7935ij f26235dy;

    /* JADX INFO: renamed from: h4 */
    private List<C8442oh> f26236h4;

    /* JADX INFO: renamed from: jd */
    private C7683fo f26237jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f26238k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f26239kk;

    /* JADX INFO: renamed from: m9 */
    private C9115wi f26240m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f26241to;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f26242x1;

    public C8178lf() {
        m36024c6();
        this.f26238k4 = new C8452ol();
        this.f26242x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: c6 */
    private void m36024c6() {
        this.f26236h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aG_() {
        return this.f26235dy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aH_() {
        return this.f26233c5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: ck */
    public final C8262mg mo34719ck() {
        if (this.f26233c5 != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f26233c5 = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f26237jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f26239kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f26239kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: fa */
    public final C7935ij mo34720fa() {
        if (this.f26235dy != null) {
            throw new Exception("Only one <cat> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f26235dy = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f26237jd != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f26237jd = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f26236h4.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f26241to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: lr */
    public C8452ol mo36036lr() {
        return this.f26234du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f26239kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f26240m9 != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f26240m9 = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f26241to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f26241to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f26236h4.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f26242x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f26240m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: yd */
    public C8452ol mo36037yd() {
        if (this.f26234du != null) {
            throw new Exception("Only one <explosion> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f26234du = c8452ol;
        return c8452ol;
    }

    public C8178lf(final AbstractC13912i5 abstractC13912i5) {
        m36024c6();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8178lf.f26232ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8178lf.this.f26238k4 = new C8452ol(abstractC13912i5);
                        return true;
                    case 1:
                        C8178lf.this.f26242x1 = new C8452ol(abstractC13912i5);
                        return true;
                    case 2:
                        C8178lf.this.f26239kk = new C9001v5(abstractC13912i5);
                        return true;
                    case 3:
                        C8178lf.this.f26241to = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C8178lf.this.f26234du = new C8452ol(abstractC13912i5);
                        return true;
                    case 5:
                        C8178lf.this.f26236h4.addItem(new C8442oh(abstractC13912i5));
                        return true;
                    case 6:
                        C8178lf.this.f26240m9 = new C9115wi(abstractC13912i5);
                        return true;
                    case 7:
                        C8178lf.this.f26235dy = new C7935ij(abstractC13912i5);
                        return true;
                    case 8:
                        C8178lf.this.f26233c5 = new C8262mg(abstractC13912i5);
                        return true;
                    case 9:
                        C8178lf.this.f26237jd = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public C8452ol mo30763k4() {
        return this.f26238k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public void mo30764k4(AbstractC7414ck abstractC7414ck) {
        this.f26237jd = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f26238k4.mo6846k4("c", c3059ii, "idx");
        this.f26242x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f26239kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f26241to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8452ol c8452ol = this.f26234du;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "explosion");
        }
        List.Enumerator<C8442oh> it = this.f26236h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "dPt");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f26240m9;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C7935ij c7935ij = this.f26235dy;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "cat");
        }
        C8262mg c8262mg = this.f26233c5;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "val");
        }
        C7683fo c7683fo = this.f26237jd;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
