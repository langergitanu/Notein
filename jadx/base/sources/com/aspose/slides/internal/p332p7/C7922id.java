package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.id */
/* JADX INFO: loaded from: classes4.dex */
public class C7922id extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24594jd = new C7017h4("pos", "numFmt", "spPr", "txPr", "visibility", "separator", "dataLabel", "dataLabelHidden", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7249ah f24595c5;

    /* JADX INFO: renamed from: du */
    private C7752ge f24596du;

    /* JADX INFO: renamed from: dy */
    private List<C9091w7> f24597dy;

    /* JADX INFO: renamed from: h4 */
    private String f24598h4;

    /* JADX INFO: renamed from: k4 */
    private int f24599k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f24600kk;

    /* JADX INFO: renamed from: m9 */
    private List<C8367np> f24601m9;

    /* JADX INFO: renamed from: to */
    private C8952ug f24602to;

    /* JADX INFO: renamed from: x1 */
    private C7314bd f24603x1;

    public C7922id() {
        m34018x6();
    }

    /* JADX INFO: renamed from: x6 */
    private void m34018x6() {
        this.f24599k4 = 0;
        this.f24601m9 = new List<>();
        this.f24597dy = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final C8087kh m34019c5() {
        return this.f24600kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C7752ge m34020ck() {
        return this.f24596du;
    }

    /* JADX INFO: renamed from: du */
    public final C8367np m34021du() {
        C8367np c8367np = new C8367np();
        this.f24601m9.addItem(c8367np);
        return c8367np;
    }

    /* JADX INFO: renamed from: dy */
    public final C7314bd m34022dy() {
        return this.f24603x1;
    }

    /* JADX INFO: renamed from: fa */
    public final String m34023fa() {
        return this.f24598h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9091w7 m34024h4() {
        C9091w7 c9091w7 = new C9091w7();
        this.f24597dy.addItem(c9091w7);
        return c9091w7;
    }

    /* JADX INFO: renamed from: jd */
    public final C8952ug m34025jd() {
        return this.f24602to;
    }

    /* JADX INFO: renamed from: ks */
    public final C7249ah m34031ks() {
        return this.f24595c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m34032m9() {
        return this.f24599k4;
    }

    /* JADX INFO: renamed from: to */
    public final C7752ge m34033to() {
        if (this.f24596du != null) {
            throw new Exception("Only one <visibility> element can be added.");
        }
        C7752ge c7752ge = new C7752ge();
        this.f24596du = c7752ge;
        return c7752ge;
    }

    /* JADX INFO: renamed from: up */
    public final C8367np[] m34034up() {
        return this.f24601m9.toArray(new C8367np[0]);
    }

    /* JADX INFO: renamed from: yj */
    public final C9091w7[] m34036yj() {
        return this.f24597dy.toArray(new C9091w7[0]);
    }

    public C7922id(final AbstractC13912i5 abstractC13912i5) {
        m34018x6();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.id.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7922id.f24594jd.m27428k4(str) != 0) {
                    return false;
                }
                C7922id.this.f24599k4 = C8899tv.m41945k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.id.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8367np;
                List list;
                switch (C7922id.f24594jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7922id.this.f24603x1 = new C7314bd(abstractC13912i5);
                        return true;
                    case 2:
                        C7922id.this.f24600kk = new C8087kh(abstractC13912i5);
                        return true;
                    case 3:
                        C7922id.this.f24602to = new C8952ug(abstractC13912i5);
                        return true;
                    case 4:
                        C7922id.this.f24596du = new C7752ge(abstractC13912i5);
                        return true;
                    case 5:
                        C7922id.this.f24598h4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7922id c7922id = C7922id.this;
                            c7922id.f24598h4 = C14113y2.m67400k4(c7922id.f24598h4, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 6:
                        c8367np = new C8367np(abstractC13912i5);
                        list = C7922id.this.f24601m9;
                        break;
                    case 7:
                        c8367np = new C9091w7(abstractC13912i5);
                        list = C7922id.this.f24597dy;
                        break;
                    case 8:
                        C7922id.this.f24595c5 = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8367np);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C8952ug m34030kk() {
        if (this.f24602to != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f24602to = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m34035x1() {
        if (this.f24600kk != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f24600kk = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7314bd m34026k4() {
        if (this.f24603x1 != null) {
            throw new Exception("Only one <numFmt> element can be added.");
        }
        C7314bd c7314bd = new C7314bd();
        this.f24603x1 = c7314bd;
        return c7314bd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34027k4(int i) {
        this.f24599k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34028k4(C7249ah c7249ah) {
        this.f24595c5 = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34029k4(String str) {
        this.f24598h4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7922id c7922id;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24599k4;
        if (i != 0) {
            c3059ii.m12955x1("pos", C8899tv.m41946k4(i));
        }
        C7314bd c7314bd = this.f24603x1;
        if (c7314bd != null) {
            c7314bd.mo6846k4("cx", c3059ii, "numFmt");
        }
        C8087kh c8087kh = this.f24600kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f24602to;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7752ge c7752ge = this.f24596du;
        if (c7752ge != null) {
            c7752ge.mo6846k4("cx", c3059ii, "visibility");
        }
        String str3 = this.f24598h4;
        if (str3 != null) {
            c7922id = this;
            c3059ii2 = c3059ii;
            c7922id.m29301k4("cx", c3059ii2, "separator", str3, false);
        } else {
            c7922id = this;
            c3059ii2 = c3059ii;
        }
        List.Enumerator<C9091w7> it = c7922id.f24601m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii2, "dataLabel");
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = c7922id.f24597dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii2, "dataLabelHidden");
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C7249ah c7249ah = c7922id.f24595c5;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
