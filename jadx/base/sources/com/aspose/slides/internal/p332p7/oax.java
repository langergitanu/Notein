package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class oax extends AbstractC7361bz {

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f27821x6 = new C7017h4("variable-decls", "sequence-decls", "user-field-decls", "dde-connection-decls", "alphabetical-index-auto-mark-file", "calculation-settings", "content-validations", "label-ranges", "header-decl", "footer-decl", "date-time-decl", "page", "settings", "named-expressions", "database-ranges", "data-pilot-tables", "consolidation", "dde-links");

    /* JADX INFO: renamed from: c5 */
    private List<C7394ca> f27822c5;

    /* JADX INFO: renamed from: ck */
    private i7n f27823ck;

    /* JADX INFO: renamed from: du */
    private au9 f27824du;

    /* JADX INFO: renamed from: dy */
    private bwt f27825dy;

    /* JADX INFO: renamed from: fa */
    private fam f27826fa;

    /* JADX INFO: renamed from: h4 */
    private a4u f27827h4;

    /* JADX INFO: renamed from: jd */
    private List<fre> f27828jd;

    /* JADX INFO: renamed from: k4 */
    private wyh f27829k4;

    /* JADX INFO: renamed from: kk */
    private ge7 f27830kk;

    /* JADX INFO: renamed from: ks */
    private scx f27831ks;

    /* JADX INFO: renamed from: m9 */
    private ozy f27832m9;

    /* JADX INFO: renamed from: rv */
    private vo4 f27833rv;

    /* JADX INFO: renamed from: to */
    private klp f27834to;

    /* JADX INFO: renamed from: up */
    private n7b f27835up;

    /* JADX INFO: renamed from: x1 */
    private ht5 f27836x1;

    /* JADX INFO: renamed from: yj */
    private tl4 f27837yj;

    public oax() {
        m38130du();
    }

    /* JADX INFO: renamed from: du */
    private void m38130du() {
        this.f27822c5 = new List<>();
        this.f27828jd = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final fre[] m38149kk() {
        return this.f27828jd.toArray(new fre[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m38150x1() {
        return this.f27822c5;
    }

    public oax(final AbstractC13912i5 abstractC13912i5) {
        m38130du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oax.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (oax.f27821x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        oax.this.f27829k4 = new wyh(abstractC13912i5);
                        return true;
                    case 1:
                        oax.this.f27836x1 = new ht5(abstractC13912i5);
                        return true;
                    case 2:
                        oax.this.f27830kk = new ge7(abstractC13912i5);
                        return true;
                    case 3:
                        oax.this.f27834to = new klp(abstractC13912i5);
                        return true;
                    case 4:
                        oax.this.f27824du = new au9(abstractC13912i5);
                        return true;
                    case 5:
                        oax.this.f27827h4 = new a4u(abstractC13912i5);
                        return true;
                    case 6:
                        oax.this.f27832m9 = new ozy(abstractC13912i5);
                        return true;
                    case 7:
                        oax.this.f27825dy = new bwt(abstractC13912i5);
                        return true;
                    case 8:
                        bvr bvrVar = new bvr(abstractC13912i5);
                        list = oax.this.f27822c5;
                        c7394ca = new C7394ca("header-decl", bvrVar);
                        break;
                    case 9:
                        yp7 yp7Var = new yp7(abstractC13912i5);
                        list = oax.this.f27822c5;
                        c7394ca = new C7394ca("footer-decl", yp7Var);
                        break;
                    case 10:
                        dac dacVar = new dac(abstractC13912i5);
                        list = oax.this.f27822c5;
                        c7394ca = new C7394ca("date-time-decl", dacVar);
                        break;
                    case 11:
                        oax.this.f27828jd.addItem(new fre(abstractC13912i5));
                        return true;
                    case 12:
                        oax.this.f27823ck = new i7n(abstractC13912i5);
                        return true;
                    case 13:
                        oax.this.f27826fa = new fam(abstractC13912i5);
                        return true;
                    case 14:
                        oax.this.f27835up = new n7b(abstractC13912i5);
                        return true;
                    case 15:
                        oax.this.f27837yj = new tl4(abstractC13912i5);
                        return true;
                    case 16:
                        oax.this.f27831ks = new scx(abstractC13912i5);
                        return true;
                    case 17:
                        oax.this.f27833rv = new vo4(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final fre m38148k4() {
        fre freVar = new fre();
        this.f27828jd.addItem(freVar);
        return freVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        wyh wyhVar = this.f27829k4;
        if (wyhVar != null) {
            wyhVar.mo6846k4("text", c3059ii, "variable-decls");
        }
        ht5 ht5Var = this.f27836x1;
        if (ht5Var != null) {
            ht5Var.mo6846k4("text", c3059ii, "sequence-decls");
        }
        ge7 ge7Var = this.f27830kk;
        if (ge7Var != null) {
            ge7Var.mo6846k4("text", c3059ii, "user-field-decls");
        }
        klp klpVar = this.f27834to;
        if (klpVar != null) {
            klpVar.mo6846k4("text", c3059ii, "dde-connection-decls");
        }
        au9 au9Var = this.f27824du;
        if (au9Var != null) {
            au9Var.mo6846k4("text", c3059ii, "alphabetical-index-auto-mark-file");
        }
        a4u a4uVar = this.f27827h4;
        if (a4uVar != null) {
            a4uVar.mo6846k4("table", c3059ii, "calculation-settings");
        }
        ozy ozyVar = this.f27832m9;
        if (ozyVar != null) {
            ozyVar.mo6846k4("table", c3059ii, "content-validations");
        }
        bwt bwtVar = this.f27825dy;
        if (bwtVar != null) {
            bwtVar.mo6846k4("table", c3059ii, "label-ranges");
        }
        List.Enumerator<C7394ca> it = this.f27822c5.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f27821x6.m27428k4(next.m29539k4())) {
                    case 8:
                        ((bvr) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((yp7) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((dac) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<fre> it2 = this.f27828jd.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("draw", c3059ii, "page");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        i7n i7nVar = this.f27823ck;
        if (i7nVar != null) {
            i7nVar.mo6846k4("presentation", c3059ii, "settings");
        }
        fam famVar = this.f27826fa;
        if (famVar != null) {
            famVar.mo6846k4("table", c3059ii, "named-expressions");
        }
        n7b n7bVar = this.f27835up;
        if (n7bVar != null) {
            n7bVar.mo6846k4("table", c3059ii, "database-ranges");
        }
        tl4 tl4Var = this.f27837yj;
        if (tl4Var != null) {
            tl4Var.mo6846k4("table", c3059ii, "data-pilot-tables");
        }
        scx scxVar = this.f27831ks;
        if (scxVar != null) {
            scxVar.mo6846k4("table", c3059ii, "consolidation");
        }
        vo4 vo4Var = this.f27833rv;
        if (vo4Var != null) {
            vo4Var.mo6846k4("table", c3059ii, "dde-links");
        }
        c3059ii.mo21898jd();
    }
}
