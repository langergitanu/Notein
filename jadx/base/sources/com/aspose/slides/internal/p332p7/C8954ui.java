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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ui */
/* JADX INFO: loaded from: classes4.dex */
public class C8954ui extends AbstractC8986uz implements InterfaceC7973j2, InterfaceC8118kp, InterfaceC8800ss, InterfaceC8838t6 {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f31283fa = new C7017h4("grouping", "varyColors", "ser", "dLbls", "dropLines", "hiLowLines", "upDownBars", RequestParameters.MARKER, "smooth", "axId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8828t1 f31284c5;

    /* JADX INFO: renamed from: ck */
    private C7683fo f31285ck;

    /* JADX INFO: renamed from: du */
    private C7571eh f31286du;

    /* JADX INFO: renamed from: dy */
    private C8828t1 f31287dy;

    /* JADX INFO: renamed from: h4 */
    private C7571eh f31288h4;

    /* JADX INFO: renamed from: jd */
    private List<C8827t0> f31289jd;

    /* JADX INFO: renamed from: k4 */
    private C9126wo f31290k4;

    /* JADX INFO: renamed from: kk */
    private List<C9316yv> f31291kk;

    /* JADX INFO: renamed from: m9 */
    private C8692ro f31292m9;

    /* JADX INFO: renamed from: to */
    private C9115wi f31293to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f31294x1;

    public C8954ui() {
        m42393sv();
        this.f31290k4 = new C9126wo();
        OooOOOO.OooO0O0(this.f31289jd);
        OooOOOO.OooO0O0(this.f31289jd);
    }

    /* JADX INFO: renamed from: sv */
    private void m42393sv() {
        this.f31291kk = new List<>();
        this.f31289jd = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0 ax_() {
        return this.f31289jd.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8692ro ay_() {
        return this.f31292m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: b3 */
    public C8828t1 mo42397b3() {
        return this.f31284c5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: bz */
    public C8828t1 mo42398bz() {
        return this.f31287dy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f31293to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f31285ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: h4 */
    public C8827t0 mo32253h4() {
        return this.f31289jd.get_Item(1);
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f31294x1 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f31294x1 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8838t6
    /* JADX INFO: renamed from: m9 */
    public final C8692ro mo39172m9() {
        if (this.f31292m9 != null) {
            throw new Exception("Only one <upDownBars> element can be added.");
        }
        C8692ro c8692ro = new C8692ro();
        this.f31292m9 = c8692ro;
        return c8692ro;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ne */
    public C7571eh mo39173ne() {
        return this.f31288h4;
    }

    /* JADX INFO: renamed from: qm */
    public final C9126wo m42399qm() {
        return this.f31290k4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8838t6
    /* JADX INFO: renamed from: to */
    public final C7571eh mo39174to() {
        if (this.f31288h4 != null) {
            throw new Exception("Only one <hiLowLines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f31288h4 = c7571eh;
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f31294x1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f31293to != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f31293to = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x6 */
    public C7571eh mo34548x6() {
        return this.f31286du;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8118kp
    /* JADX INFO: renamed from: k4 */
    public final C7571eh mo34546k4() {
        if (this.f31286du != null) {
            throw new Exception("Only one <dropLines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f31286du = c7571eh;
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C9316yv c9316yv = new C9316yv();
        this.f31291kk.addItem(c9316yv);
        return c9316yv;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f31291kk.toArray(new C9316yv[0]);
    }

    public C8954ui(final AbstractC13912i5 abstractC13912i5) {
        m42393sv();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ui.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c9316yv;
                List list;
                switch (C8954ui.f31283fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8954ui.this.f31290k4 = new C9126wo(abstractC13912i5);
                        return true;
                    case 1:
                        C8954ui.this.f31294x1 = new C8828t1(abstractC13912i5);
                        return true;
                    case 2:
                        c9316yv = new C9316yv(abstractC13912i5);
                        list = C8954ui.this.f31291kk;
                        break;
                    case 3:
                        C8954ui.this.f31293to = new C9115wi(abstractC13912i5);
                        return true;
                    case 4:
                        C8954ui.this.f31286du = new C7571eh(abstractC13912i5);
                        return true;
                    case 5:
                        C8954ui.this.f31288h4 = new C7571eh(abstractC13912i5);
                        return true;
                    case 6:
                        C8954ui.this.f31292m9 = new C8692ro(abstractC13912i5);
                        return true;
                    case 7:
                        C8954ui.this.f31287dy = new C8828t1(abstractC13912i5);
                        return true;
                    case 8:
                        C8954ui.this.f31284c5 = new C8828t1(abstractC13912i5);
                        return true;
                    case 9:
                        c9316yv = new C8827t0(abstractC13912i5);
                        list = C8954ui.this.f31289jd;
                        break;
                    case 10:
                        C8954ui.this.f31285ck = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c9316yv);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f31285ck = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f31290k4.mo6846k4("c", c3059ii, "grouping");
        C8828t1 c8828t1 = this.f31294x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C9316yv> it = this.f31291kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f31293to;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C7571eh c7571eh = this.f31286du;
        if (c7571eh != null) {
            c7571eh.mo6846k4("c", c3059ii, "dropLines");
        }
        C7571eh c7571eh2 = this.f31288h4;
        if (c7571eh2 != null) {
            c7571eh2.mo6846k4("c", c3059ii, "hiLowLines");
        }
        C8692ro c8692ro = this.f31292m9;
        if (c8692ro != null) {
            c8692ro.mo6846k4("c", c3059ii, "upDownBars");
        }
        C8828t1 c8828t12 = this.f31287dy;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, RequestParameters.MARKER);
        }
        C8828t1 c8828t13 = this.f31284c5;
        if (c8828t13 != null) {
            c8828t13.mo6846k4("c", c3059ii, "smooth");
        }
        ax_().mo6846k4("c", c3059ii, "axId");
        mo32253h4().mo6846k4("c", c3059ii, "axId");
        C7683fo c7683fo = this.f31285ck;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
