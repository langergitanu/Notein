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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.io */
/* JADX INFO: loaded from: classes4.dex */
public class C7945io extends AbstractC8986uz implements InterfaceC7649f9, InterfaceC7973j2, InterfaceC8800ss, InterfaceC9046vj {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f24839ck = new C7017h4("barDir", "grouping", "varyColors", "ser", "dLbls", "gapWidth", "overlap", "serLines", "axId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C8827t0> f24840c5;

    /* JADX INFO: renamed from: du */
    private C9115wi f24841du;

    /* JADX INFO: renamed from: dy */
    private List<C7571eh> f24842dy;

    /* JADX INFO: renamed from: h4 */
    private C8274mm f24843h4;

    /* JADX INFO: renamed from: jd */
    private C7683fo f24844jd;

    /* JADX INFO: renamed from: k4 */
    private C8170lc f24845k4;

    /* JADX INFO: renamed from: kk */
    private C8828t1 f24846kk;

    /* JADX INFO: renamed from: m9 */
    private C9060vq f24847m9;

    /* JADX INFO: renamed from: to */
    private List<C9398zs> f24848to;

    /* JADX INFO: renamed from: x1 */
    private C7716g0 f24849x1;

    public C7945io() {
        m34339ss();
        this.f24845k4 = new C8170lc();
        OooOOOO.OooO0O0(this.f24840c5);
        OooOOOO.OooO0O0(this.f24840c5);
    }

    /* JADX INFO: renamed from: ss */
    private void m34339ss() {
        this.f24848to = new List<>();
        this.f24842dy = new List<>();
        this.f24840c5 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8170lc aw_() {
        return this.f24845k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0 ax_() {
        return this.f24840c5.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f24841du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f24844jd;
    }

    /* JADX INFO: renamed from: g8 */
    public final C9060vq m34342g8() {
        if (this.f24847m9 != null) {
            throw new Exception("Only one <overlap> element can be added.");
        }
        C9060vq c9060vq = new C9060vq();
        this.f24847m9 = c9060vq;
        return c9060vq;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: h4 */
    public C8827t0 mo32253h4() {
        return this.f24840c5.get_Item(1);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ks */
    public C8274mm mo28514ks() {
        return this.f24843h4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f24846kk != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f24846kk = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7649f9
    /* JADX INFO: renamed from: m9 */
    public final C8274mm mo28516m9() {
        if (this.f24843h4 != null) {
            throw new Exception("Only one <gapWidth> element can be added.");
        }
        C8274mm c8274mm = new C8274mm();
        this.f24843h4 = c8274mm;
        return c8274mm;
    }

    /* JADX INFO: renamed from: qm */
    public final C7716g0 m34343qm() {
        if (this.f24849x1 != null) {
            throw new Exception("Only one <grouping> element can be added.");
        }
        C7716g0 c7716g0 = new C7716g0();
        this.f24849x1 = c7716g0;
        return c7716g0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: rv */
    public C9060vq mo34344rv() {
        return this.f24847m9;
    }

    /* JADX INFO: renamed from: sv */
    public final C7716g0 m34345sv() {
        return this.f24849x1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9046vj
    /* JADX INFO: renamed from: to */
    public final C7571eh mo28519to() {
        C7571eh c7571eh = new C7571eh();
        this.f24842dy.addItem(c7571eh);
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f24846kk;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f24841du != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f24841du = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: wl */
    public C7571eh[] mo28524wl() {
        return this.f24842dy.toArray(new C7571eh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C9398zs c9398zs = new C9398zs();
        this.f24848to.addItem(c9398zs);
        return c9398zs;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f24848to.toArray(new C9398zs[0]);
    }

    public C7945io(final AbstractC13912i5 abstractC13912i5) {
        m34339ss();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.io.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c9398zs;
                List list;
                switch (C7945io.f24839ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7945io.this.f24845k4 = new C8170lc(abstractC13912i5);
                        return true;
                    case 1:
                        C7945io.this.f24849x1 = new C7716g0(abstractC13912i5);
                        return true;
                    case 2:
                        C7945io.this.f24846kk = new C8828t1(abstractC13912i5);
                        return true;
                    case 3:
                        c9398zs = new C9398zs(abstractC13912i5);
                        list = C7945io.this.f24848to;
                        break;
                    case 4:
                        C7945io.this.f24841du = new C9115wi(abstractC13912i5);
                        return true;
                    case 5:
                        C7945io.this.f24843h4 = new C8274mm(abstractC13912i5);
                        return true;
                    case 6:
                        C7945io.this.f24847m9 = new C9060vq(abstractC13912i5);
                        return true;
                    case 7:
                        c9398zs = new C7571eh(abstractC13912i5);
                        list = C7945io.this.f24842dy;
                        break;
                    case 8:
                        c9398zs = new C8827t0(abstractC13912i5);
                        list = C7945io.this.f24840c5;
                        break;
                    case 9:
                        C7945io.this.f24844jd = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c9398zs);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f24844jd = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24845k4.mo6846k4("c", c3059ii, "barDir");
        C7716g0 c7716g0 = this.f24849x1;
        if (c7716g0 != null) {
            c7716g0.mo6846k4("c", c3059ii, "grouping");
        }
        C8828t1 c8828t1 = this.f24846kk;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C7571eh> it = this.f24848to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C9115wi c9115wi = this.f24841du;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C8274mm c8274mm = this.f24843h4;
        if (c8274mm != null) {
            c8274mm.mo6846k4("c", c3059ii, "gapWidth");
        }
        C9060vq c9060vq = this.f24847m9;
        if (c9060vq != null) {
            c9060vq.mo6846k4("c", c3059ii, "overlap");
        }
        it = this.f24842dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "serLines");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        ax_().mo6846k4("c", c3059ii, "axId");
        mo32253h4().mo6846k4("c", c3059ii, "axId");
        C7683fo c7683fo = this.f24844jd;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
