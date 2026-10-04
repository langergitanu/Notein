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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.t9 */
/* JADX INFO: loaded from: classes4.dex */
public class C8845t9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f30618dy = new C7017h4("legendPos", "legendEntry", "layout", "overlay", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8087kh f30619du;

    /* JADX INFO: renamed from: h4 */
    private C8952ug f30620h4;

    /* JADX INFO: renamed from: k4 */
    private C7334bn f30621k4;

    /* JADX INFO: renamed from: kk */
    private C7943in f30622kk;

    /* JADX INFO: renamed from: m9 */
    private C7683fo f30623m9;

    /* JADX INFO: renamed from: to */
    private C8828t1 f30624to;

    /* JADX INFO: renamed from: x1 */
    private List<C8450ok> f30625x1;

    public C8845t9() {
        m41591ks();
    }

    /* JADX INFO: renamed from: ks */
    private void m41591ks() {
        this.f30625x1 = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final C7943in m41593c5() {
        return this.f30622kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C8087kh m41594ck() {
        return this.f30619du;
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m41595du() {
        if (this.f30619du != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f30619du = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: dy */
    public final C8450ok[] m41596dy() {
        return this.f30625x1.toArray(new C8450ok[0]);
    }

    /* JADX INFO: renamed from: fa */
    public final C8952ug m41597fa() {
        return this.f30620h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8952ug m41598h4() {
        if (this.f30620h4 != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f30620h4 = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: jd */
    public final C8828t1 m41599jd() {
        return this.f30624to;
    }

    /* JADX INFO: renamed from: kk */
    public final C7943in m41601kk() {
        if (this.f30622kk != null) {
            throw new Exception("Only one <layout> element can be added.");
        }
        C7943in c7943in = new C7943in();
        this.f30622kk = c7943in;
        return c7943in;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7334bn m41602m9() {
        return this.f30621k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8828t1 m41603to() {
        if (this.f30624to != null) {
            throw new Exception("Only one <overlay> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30624to = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC7414ck m41604up() {
        return this.f30623m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8450ok m41605x1() {
        C8450ok c8450ok = new C8450ok();
        this.f30625x1.addItem(c8450ok);
        return c8450ok;
    }

    public C8845t9(final AbstractC13912i5 abstractC13912i5) {
        m41591ks();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.t9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8845t9.f30618dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8845t9.this.f30621k4 = new C7334bn(abstractC13912i5);
                        return true;
                    case 1:
                        C8845t9.this.f30625x1.addItem(new C8450ok(abstractC13912i5));
                        return true;
                    case 2:
                        C8845t9.this.f30622kk = new C7943in(abstractC13912i5);
                        return true;
                    case 3:
                        C8845t9.this.f30624to = new C8828t1(abstractC13912i5);
                        return true;
                    case 4:
                        C8845t9.this.f30619du = new C8087kh(abstractC13912i5);
                        return true;
                    case 5:
                        C8845t9.this.f30620h4 = new C8952ug(abstractC13912i5);
                        return true;
                    case 6:
                        C8845t9.this.f30623m9 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7334bn m41600k4() {
        if (this.f30621k4 != null) {
            throw new Exception("Only one <legendPos> element can be added.");
        }
        C7334bn c7334bn = new C7334bn();
        this.f30621k4 = c7334bn;
        return c7334bn;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7334bn c7334bn = this.f30621k4;
        if (c7334bn != null) {
            c7334bn.mo6846k4("c", c3059ii, "legendPos");
        }
        List.Enumerator<C8450ok> it = this.f30625x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "legendEntry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7943in c7943in = this.f30622kk;
        if (c7943in != null) {
            c7943in.mo6846k4("c", c3059ii, "layout");
        }
        C8828t1 c8828t1 = this.f30624to;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "overlay");
        }
        C8087kh c8087kh = this.f30619du;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f30620h4;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        C7683fo c7683fo = this.f30623m9;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
