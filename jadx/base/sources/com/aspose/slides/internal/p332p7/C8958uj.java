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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uj */
/* JADX INFO: loaded from: classes4.dex */
public class C8958uj extends AbstractC8986uz implements InterfaceC7973j2, InterfaceC8118kp, InterfaceC8800ss {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f31310dy = new C7017h4("grouping", "varyColors", "ser", "dLbls", "dropLines", "axId", "extLst");

    /* JADX INFO: renamed from: du */
    private C7571eh f31311du;

    /* JADX INFO: renamed from: h4 */
    private List<C8827t0> f31312h4;

    /* JADX INFO: renamed from: k4 */
    private C9126wo f31313k4;

    /* JADX INFO: renamed from: kk */
    private List<C8010jj> f31314kk;

    /* JADX INFO: renamed from: m9 */
    private C7683fo f31315m9;

    /* JADX INFO: renamed from: to */
    private C9115wi f31316to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f31317x1;

    public C8958uj() {
        m42427wp();
        OooOOOO.OooO0O0(this.f31312h4);
        OooOOOO.OooO0O0(this.f31312h4);
    }

    /* JADX INFO: renamed from: wp */
    private void m42427wp() {
        this.f31314kk = new List<>();
        this.f31312h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0 ax_() {
        return this.f31312h4.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f31316to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f31315m9;
    }

    /* JADX INFO: renamed from: g8 */
    public final C9126wo m42429g8() {
        return this.f31313k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: h4 */
    public C8827t0 mo32253h4() {
        return this.f31312h4.get_Item(1);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C8010jj c8010jj = new C8010jj();
        this.f31314kk.addItem(c8010jj);
        return c8010jj;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f31317x1 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f31317x1 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: qm */
    public final C9126wo m42430qm() {
        if (this.f31313k4 != null) {
            throw new Exception("Only one <grouping> element can be added.");
        }
        C9126wo c9126wo = new C9126wo();
        this.f31313k4 = c9126wo;
        return c9126wo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f31317x1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f31316to != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f31316to = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x6 */
    public C7571eh mo34548x6() {
        return this.f31311du;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8118kp
    /* JADX INFO: renamed from: k4 */
    public final C7571eh mo34546k4() {
        if (this.f31311du != null) {
            throw new Exception("Only one <dropLines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f31311du = c7571eh;
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f31314kk.toArray(new C8010jj[0]);
    }

    public C8958uj(final AbstractC13912i5 abstractC13912i5) {
        m42427wp();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8010jj;
                List list;
                switch (C8958uj.f31310dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8958uj.this.f31313k4 = new C9126wo(abstractC13912i5);
                        return true;
                    case 1:
                        C8958uj.this.f31317x1 = new C8828t1(abstractC13912i5);
                        return true;
                    case 2:
                        c8010jj = new C8010jj(abstractC13912i5);
                        list = C8958uj.this.f31314kk;
                        break;
                    case 3:
                        C8958uj.this.f31316to = new C9115wi(abstractC13912i5);
                        return true;
                    case 4:
                        C8958uj.this.f31311du = new C7571eh(abstractC13912i5);
                        return true;
                    case 5:
                        c8010jj = new C8827t0(abstractC13912i5);
                        list = C8958uj.this.f31312h4;
                        break;
                    case 6:
                        C8958uj.this.f31315m9 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8010jj);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f31315m9 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9126wo c9126wo = this.f31313k4;
        if (c9126wo != null) {
            c9126wo.mo6846k4("c", c3059ii, "grouping");
        }
        C8828t1 c8828t1 = this.f31317x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C8010jj> it = this.f31314kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f31316to;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C7571eh c7571eh = this.f31311du;
        if (c7571eh != null) {
            c7571eh.mo6846k4("c", c3059ii, "dropLines");
        }
        ax_().mo6846k4("c", c3059ii, "axId");
        mo32253h4().mo6846k4("c", c3059ii, "axId");
        C7683fo c7683fo = this.f31315m9;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
