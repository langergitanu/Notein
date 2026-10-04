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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7720g2 extends AbstractC8986uz implements InterfaceC7973j2, InterfaceC8800ss {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f23168jd = new C7017h4("varyColors", "ser", "dLbls", "bubble3D", "bubbleScale", "showNegBubbles", "sizeRepresents", "axId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7683fo f23169c5;

    /* JADX INFO: renamed from: du */
    private C7209a3 f23170du;

    /* JADX INFO: renamed from: dy */
    private List<C8827t0> f23171dy;

    /* JADX INFO: renamed from: h4 */
    private C8828t1 f23172h4;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f23173k4;

    /* JADX INFO: renamed from: kk */
    private C9115wi f23174kk;

    /* JADX INFO: renamed from: m9 */
    private C8975us f23175m9;

    /* JADX INFO: renamed from: to */
    private C8828t1 f23176to;

    /* JADX INFO: renamed from: x1 */
    private List<C8589qa> f23177x1;

    public C7720g2() {
        m32246ss();
        OooOOOO.OooO0O0(this.f23171dy);
        OooOOOO.OooO0O0(this.f23171dy);
    }

    /* JADX INFO: renamed from: ss */
    private void m32246ss() {
        this.f23177x1 = new List<>();
        this.f23171dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ar */
    public C8975us mo32250ar() {
        return this.f23175m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    public C8827t0 ax_() {
        return this.f23171dy.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f23174kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f23169c5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: e0 */
    public C8828t1 mo32251e0() {
        return this.f23176to;
    }

    /* JADX INFO: renamed from: g8 */
    public final C8828t1 m32252g8() {
        if (this.f23172h4 != null) {
            throw new Exception("Only one <showNegBubbles> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f23172h4 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: h4 */
    public C8827t0 mo32253h4() {
        return this.f23171dy.get_Item(1);
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f23173k4 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f23173k4 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: qm */
    public final C7209a3 m32254qm() {
        if (this.f23170du != null) {
            throw new Exception("Only one <bubbleScale> element can be added.");
        }
        C7209a3 c7209a3 = new C7209a3();
        this.f23170du = c7209a3;
        return c7209a3;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: qq */
    public C8828t1 mo32255qq() {
        return this.f23172h4;
    }

    /* JADX INFO: renamed from: sv */
    public final C8975us m32256sv() {
        if (this.f23175m9 != null) {
            throw new Exception("Only one <sizeRepresents> element can be added.");
        }
        C8975us c8975us = new C8975us();
        this.f23175m9 = c8975us;
        return c8975us;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f23173k4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f23174kk != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f23174kk = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: yd */
    public C7209a3 mo32257yd() {
        return this.f23170du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C8589qa c8589qa = new C8589qa();
        this.f23177x1.addItem(c8589qa);
        return c8589qa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f23177x1.toArray(new C8589qa[0]);
    }

    public C7720g2(final AbstractC13912i5 abstractC13912i5) {
        m32246ss();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8589qa;
                List list;
                switch (C7720g2.f23168jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7720g2.this.f23173k4 = new C8828t1(abstractC13912i5);
                        return true;
                    case 1:
                        c8589qa = new C8589qa(abstractC13912i5);
                        list = C7720g2.this.f23177x1;
                        break;
                    case 2:
                        C7720g2.this.f23174kk = new C9115wi(abstractC13912i5);
                        return true;
                    case 3:
                        C7720g2.this.f23176to = new C8828t1(abstractC13912i5);
                        return true;
                    case 4:
                        C7720g2.this.f23170du = new C7209a3(abstractC13912i5);
                        return true;
                    case 5:
                        C7720g2.this.f23172h4 = new C8828t1(abstractC13912i5);
                        return true;
                    case 6:
                        C7720g2.this.f23175m9 = new C8975us(abstractC13912i5);
                        return true;
                    case 7:
                        c8589qa = new C8827t0(abstractC13912i5);
                        list = C7720g2.this.f23171dy;
                        break;
                    case 8:
                        C7720g2.this.f23169c5 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8589qa);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f23169c5 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8828t1 c8828t1 = this.f23173k4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C8589qa> it = this.f23177x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ser");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9115wi c9115wi = this.f23174kk;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C8828t1 c8828t12 = this.f23176to;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, "bubble3D");
        }
        C7209a3 c7209a3 = this.f23170du;
        if (c7209a3 != null) {
            c7209a3.mo6846k4("c", c3059ii, "bubbleScale");
        }
        C8828t1 c8828t13 = this.f23172h4;
        if (c8828t13 != null) {
            c8828t13.mo6846k4("c", c3059ii, "showNegBubbles");
        }
        C8975us c8975us = this.f23175m9;
        if (c8975us != null) {
            c8975us.mo6846k4("c", c3059ii, "sizeRepresents");
        }
        ax_().mo6846k4("c", c3059ii, "axId");
        mo32253h4().mo6846k4("c", c3059ii, "axId");
        C7683fo c7683fo = this.f23169c5;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
