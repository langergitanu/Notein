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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.aw */
/* JADX INFO: loaded from: classes4.dex */
public class C7275aw extends AbstractC8986uz implements InterfaceC7649f9, InterfaceC7973j2, InterfaceC8800ss, InterfaceC9046vj {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f20236fa = new C7017h4("ofPieType", "varyColors", "ser", "dLbls", "gapWidth", "splitType", "splitPos", "custSplit", "secondPieSize", "serLines", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7470db f20237c5;

    /* JADX INFO: renamed from: ck */
    private C7683fo f20238ck;

    /* JADX INFO: renamed from: du */
    private C8274mm f20239du;

    /* JADX INFO: renamed from: dy */
    private C7260an f20240dy;

    /* JADX INFO: renamed from: h4 */
    private C9217xm f20241h4;

    /* JADX INFO: renamed from: jd */
    private List<C7571eh> f20242jd;

    /* JADX INFO: renamed from: k4 */
    private C7804gw f20243k4;

    /* JADX INFO: renamed from: kk */
    private List<C8178lf> f20244kk;

    /* JADX INFO: renamed from: m9 */
    private C7405cg f20245m9;

    /* JADX INFO: renamed from: to */
    private C9115wi f20246to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f20247x1;

    public C7275aw() {
        m28503ss();
        this.f20243k4 = new C7804gw();
    }

    /* JADX INFO: renamed from: ss */
    private void m28503ss() {
        this.f20244kk = new List<>();
        this.f20242jd = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ak */
    public C7260an mo28506ak() {
        if (this.f20240dy != null) {
            throw new Exception("Only one <custSplit> element can be added.");
        }
        C7260an c7260an = new C7260an();
        this.f20240dy = c7260an;
        return c7260an;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: bv */
    public C9217xm mo28507bv() {
        return this.f20241h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: c5 */
    public C9115wi mo28508c5() {
        return this.f20246to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ck */
    public C7804gw mo28509ck() {
        return this.f20243k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: dy */
    public AbstractC7414ck mo28510dy() {
        return this.f20238ck;
    }

    /* JADX INFO: renamed from: g8 */
    public final C7405cg m28511g8() {
        if (this.f20245m9 != null) {
            throw new Exception("Only one <splitPos> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f20245m9 = c7405cg;
        return c7405cg;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: kk */
    public AbstractC9120wl mo28513kk() {
        C8178lf c8178lf = new C8178lf();
        this.f20244kk.addItem(c8178lf);
        return c8178lf;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: ks */
    public C8274mm mo28514ks() {
        return this.f20239du;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7973j2
    /* JADX INFO: renamed from: lr */
    public final C8828t1 mo28515lr() {
        if (this.f20247x1 != null) {
            throw new Exception("Only one <varyColors> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f20247x1 = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC7649f9
    /* JADX INFO: renamed from: m9 */
    public final C8274mm mo28516m9() {
        if (this.f20239du != null) {
            throw new Exception("Only one <gapWidth> element can be added.");
        }
        C8274mm c8274mm = new C8274mm();
        this.f20239du = c8274mm;
        return c8274mm;
    }

    /* JADX INFO: renamed from: qm */
    public final C9217xm m28517qm() {
        if (this.f20241h4 != null) {
            throw new Exception("Only one <splitType> element can be added.");
        }
        C9217xm c9217xm = new C9217xm();
        this.f20241h4 = c9217xm;
        return c9217xm;
    }

    /* JADX INFO: renamed from: sv */
    public final C7470db m28518sv() {
        if (this.f20237c5 != null) {
            throw new Exception("Only one <secondPieSize> element can be added.");
        }
        C7470db c7470db = new C7470db();
        this.f20237c5 = c7470db;
        return c7470db;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC9046vj
    /* JADX INFO: renamed from: to */
    public final C7571eh mo28519to() {
        C7571eh c7571eh = new C7571eh();
        this.f20242jd.addItem(c7571eh);
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: um */
    public C7405cg mo28520um() {
        return this.f20245m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: up */
    public C8828t1 mo28521up() {
        return this.f20247x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: uz */
    public C7470db mo28522uz() {
        return this.f20237c5;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8800ss
    /* JADX INFO: renamed from: v4 */
    public final C9115wi mo28523v4() {
        if (this.f20246to != null) {
            throw new Exception("Only one <dLbls> element can be added.");
        }
        C9115wi c9115wi = new C9115wi();
        this.f20246to = c9115wi;
        return c9115wi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: wl */
    public C7571eh[] mo28524wl() {
        return this.f20242jd.toArray(new C7571eh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: wy */
    public C7260an mo28525wy() {
        return this.f20240dy;
    }

    public C7275aw(final AbstractC13912i5 abstractC13912i5) {
        m28503ss();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8178lf;
                List list;
                switch (C7275aw.f20236fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7275aw.this.f20243k4 = new C7804gw(abstractC13912i5);
                        return true;
                    case 1:
                        C7275aw.this.f20247x1 = new C8828t1(abstractC13912i5);
                        return true;
                    case 2:
                        c8178lf = new C8178lf(abstractC13912i5);
                        list = C7275aw.this.f20244kk;
                        break;
                    case 3:
                        C7275aw.this.f20246to = new C9115wi(abstractC13912i5);
                        return true;
                    case 4:
                        C7275aw.this.f20239du = new C8274mm(abstractC13912i5);
                        return true;
                    case 5:
                        C7275aw.this.f20241h4 = new C9217xm(abstractC13912i5);
                        return true;
                    case 6:
                        C7275aw.this.f20245m9 = new C7405cg(abstractC13912i5);
                        return true;
                    case 7:
                        C7275aw.this.f20240dy = new C7260an(abstractC13912i5);
                        return true;
                    case 8:
                        C7275aw.this.f20237c5 = new C7470db(abstractC13912i5);
                        return true;
                    case 9:
                        c8178lf = new C7571eh(abstractC13912i5);
                        list = C7275aw.this.f20242jd;
                        break;
                    case 10:
                        C7275aw.this.f20238ck = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8178lf);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: x1 */
    public AbstractC9120wl[] mo28526x1() {
        return this.f20244kk.toArray(new C8178lf[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8986uz
    /* JADX INFO: renamed from: k4 */
    public void mo28512k4(AbstractC7414ck abstractC7414ck) {
        this.f20238ck = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f20243k4.mo6846k4("c", c3059ii, "ofPieType");
        C8828t1 c8828t1 = this.f20247x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "varyColors");
        }
        List.Enumerator<C7571eh> it = this.f20244kk.iterator();
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
        C9115wi c9115wi = this.f20246to;
        if (c9115wi != null) {
            c9115wi.mo6846k4("c", c3059ii, "dLbls");
        }
        C8274mm c8274mm = this.f20239du;
        if (c8274mm != null) {
            c8274mm.mo6846k4("c", c3059ii, "gapWidth");
        }
        C9217xm c9217xm = this.f20241h4;
        if (c9217xm != null) {
            c9217xm.mo6846k4("c", c3059ii, "splitType");
        }
        C7405cg c7405cg = this.f20245m9;
        if (c7405cg != null) {
            c7405cg.mo6846k4("c", c3059ii, "splitPos");
        }
        C7260an c7260an = this.f20240dy;
        if (c7260an != null) {
            c7260an.mo6846k4("c", c3059ii, "custSplit");
        }
        C7470db c7470db = this.f20237c5;
        if (c7470db != null) {
            c7470db.mo6846k4("c", c3059ii, "secondPieSize");
        }
        it = this.f20242jd.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "serLines");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f20238ck;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
