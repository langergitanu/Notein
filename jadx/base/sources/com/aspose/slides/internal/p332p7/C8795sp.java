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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sp */
/* JADX INFO: loaded from: classes4.dex */
public class C8795sp extends AbstractC9120wl implements InterfaceC8885tq {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f30279ck = new C7017h4("idx", "order", "tx", "spPr", RequestParameters.MARKER, "dPt", "dLbls", "cat", "val", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8262mg f30280c5;

    /* JADX INFO: renamed from: du */
    private C8453om f30281du;

    /* JADX INFO: renamed from: dy */
    private C7935ij f30282dy;

    /* JADX INFO: renamed from: h4 */
    private List<C8442oh> f30283h4;

    /* JADX INFO: renamed from: jd */
    private C7683fo f30284jd;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f30285k4;

    /* JADX INFO: renamed from: kk */
    private C9001v5 f30286kk;

    /* JADX INFO: renamed from: m9 */
    private C9115wi f30287m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f30288to;

    /* JADX INFO: renamed from: x1 */
    private C8452ol f30289x1;

    public C8795sp() {
        m41198c6();
        this.f30285k4 = new C8452ol();
        this.f30289x1 = new C8452ol();
    }

    /* JADX INFO: renamed from: c6 */
    private void m41198c6() {
        this.f30283h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8453om aF_() {
        return this.f30281du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C7935ij aG_() {
        return this.f30282dy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    public C8262mg aH_() {
        return this.f30280c5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: ck */
    public final C8262mg mo34719ck() {
        if (this.f30280c5 != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f30280c5 = c8262mg;
        return c8262mg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo30758du() {
        return this.f30284jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: dy */
    public C9001v5 mo30759dy() {
        if (this.f30286kk != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C9001v5 c9001v5 = new C9001v5();
        this.f30286kk = c9001v5;
        return c9001v5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8885tq
    /* JADX INFO: renamed from: fa */
    public final C7935ij mo34720fa() {
        if (this.f30282dy != null) {
            throw new Exception("Only one <cat> element can be added.");
        }
        C7935ij c7935ij = new C7935ij();
        this.f30282dy = c7935ij;
        return c7935ij;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: h4 */
    public AbstractC7414ck mo30760h4() {
        if (this.f30284jd != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f30284jd = c7683fo;
        return c7683fo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ix */
    public C8442oh[] mo30761ix() {
        return this.f30283h4.toArray(new C8442oh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: kk */
    public C8087kh mo30765kk() {
        return this.f30288to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ks */
    public C8453om mo30766ks() {
        if (this.f30281du != null) {
            throw new Exception("Only one <marker> element can be added.");
        }
        C8453om c8453om = new C8453om();
        this.f30281du = c8453om;
        return c8453om;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: m9 */
    public C9001v5 mo30767m9() {
        return this.f30286kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: ne */
    public C9115wi mo30768ne() {
        if (this.f30287m9 != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f30287m9 = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: to */
    public C8087kh mo30770to() {
        if (this.f30288to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f30288to = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: u4 */
    public C8442oh mo30771u4() {
        C8442oh c8442oh = new C8442oh();
        this.f30283h4.addItem(c8442oh);
        return c8442oh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x1 */
    public C8452ol mo30775x1() {
        return this.f30289x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: x6 */
    public C9115wi mo30776x6() {
        return this.f30287m9;
    }

    public C8795sp(final AbstractC13912i5 abstractC13912i5) {
        m41198c6();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8795sp.f30279ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8795sp.this.f30285k4 = new C8452ol(abstractC13912i5);
                        return true;
                    case 1:
                        C8795sp.this.f30289x1 = new C8452ol(abstractC13912i5);
                        return true;
                    case 2:
                        C8795sp.this.f30286kk = new C9001v5(abstractC13912i5);
                        return true;
                    case 3:
                        C8795sp.this.f30288to = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C8795sp.this.f30281du = new C8453om(abstractC13912i5);
                        return true;
                    case 5:
                        C8795sp.this.f30283h4.addItem(new C8442oh(abstractC13912i5));
                        return true;
                    case 6:
                        C8795sp.this.f30287m9 = new C9115wi(abstractC13912i5);
                        return true;
                    case 7:
                        C8795sp.this.f30282dy = new C7935ij(abstractC13912i5);
                        return true;
                    case 8:
                        C8795sp.this.f30280c5 = new C8262mg(abstractC13912i5);
                        return true;
                    case 9:
                        C8795sp.this.f30284jd = new C7683fo(abstractC13912i5);
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
        return this.f30285k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9120wl
    /* JADX INFO: renamed from: k4 */
    public void mo30764k4(AbstractC7414ck abstractC7414ck) {
        this.f30284jd = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f30285k4.mo6846k4("c", c3059ii, "idx");
        this.f30289x1.mo6846k4("c", c3059ii, "order");
        C9001v5 c9001v5 = this.f30286kk;
        if (c9001v5 != null) {
            c9001v5.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f30288to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8453om c8453om = this.f30281du;
        if (c8453om != null) {
            c8453om.mo6846k4("c", c3059ii, RequestParameters.MARKER);
        }
        List.Enumerator<C8442oh> it = this.f30283h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "dPt");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f30287m9;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C7935ij c7935ij = this.f30282dy;
        if (c7935ij != null) {
            c7935ij.mo6846k4("c", c3059ii, "cat");
        }
        C8262mg c8262mg = this.f30280c5;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "val");
        }
        C7683fo c7683fo = this.f30284jd;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
