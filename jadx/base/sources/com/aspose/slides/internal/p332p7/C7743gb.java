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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gb */
/* JADX INFO: loaded from: classes4.dex */
public class C7743gb extends AbstractC8986uz implements InterfaceC7973j2, InterfaceC8800ss {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23311m9 = new C7017h4("scatterStyle", "varyColors", "ser", "dLbls", "axId", "extLst");

    /* JADX INFO: renamed from: du */
    private List<C8827t0> f23312du;

    /* JADX INFO: renamed from: h4 */
    private C7683fo f23313h4;

    /* JADX INFO: renamed from: k4 */
    private C8780sk f23314k4;

    /* JADX INFO: renamed from: kk */
    private List<C7531e3> f23315kk;

    /* JADX INFO: renamed from: to */
    private C9115wi f23316to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f23317x1;

    public C7743gb() {
        m32381g8();
        this.f23314k4 = new C8780sk();
        OooOOOO.OooO0O0(this.f23312du);
        OooOOOO.OooO0O0(this.f23312du);
    }

    /* JADX INFO: renamed from: g8 */
    private void m32381g8() {
        this.f23315kk = new List<>();
        this.f23312du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0 ax_() {
        return this.f23312du.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f23316to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f23313h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: h4 */
    public C8827t0 mo32253h4() {
        return this.f23312du.get_Item(1);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C7531e3 c7531e3 = new C7531e3();
        this.f23315kk.addItem(c7531e3);
        return c7531e3;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f23317x1 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f23317x1 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f23317x1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f23316to != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f23316to = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: xk */
    public C8780sk mo32389xk() {
        return this.f23314k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f23315kk.toArray(new C7531e3[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f23313h4 = (C7683fo) abstractC7414ck;
    }

    public C7743gb(final AbstractC13912i5 abstractC13912i5) {
        m32381g8();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c7531e3;
                List list;
                int iM27428k4 = C7743gb.f23311m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7743gb.this.f23314k4 = new C8780sk(abstractC13912i5);
                } else if (iM27428k4 != 1) {
                    if (iM27428k4 == 2) {
                        c7531e3 = new C7531e3(abstractC13912i5);
                        list = C7743gb.this.f23315kk;
                    } else if (iM27428k4 == 3) {
                        C7743gb.this.f23316to = new C9115wi(abstractC13912i5);
                    } else if (iM27428k4 == 4) {
                        c7531e3 = new C8827t0(abstractC13912i5);
                        list = C7743gb.this.f23312du;
                    } else {
                        if (iM27428k4 != 5) {
                            return false;
                        }
                        C7743gb.this.f23313h4 = new C7683fo(abstractC13912i5);
                    }
                    list.addItem(c7531e3);
                } else {
                    C7743gb.this.f23317x1 = new C8828t1(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f23314k4.mo6846k4("c", c3059ii, "scatterStyle");
        C8828t1 c8828t1 = this.f23317x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C7531e3> it = this.f23315kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f23316to;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        ax_().mo6846k4("c", c3059ii, "axId");
        mo32253h4().mo6846k4("c", c3059ii, "axId");
        C7683fo c7683fo = this.f23313h4;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
