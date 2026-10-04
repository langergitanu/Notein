package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.np */
/* JADX INFO: loaded from: classes4.dex */
public class C8367np extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f27514c5 = new C7017h4("idx", "pos", "numFmt", "spPr", "txPr", "visibility", "separator", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f27515du;

    /* JADX INFO: renamed from: dy */
    private C7249ah f27516dy;

    /* JADX INFO: renamed from: h4 */
    private C7752ge f27517h4;

    /* JADX INFO: renamed from: k4 */
    private long f27518k4;

    /* JADX INFO: renamed from: kk */
    private C7314bd f27519kk;

    /* JADX INFO: renamed from: m9 */
    private String f27520m9;

    /* JADX INFO: renamed from: to */
    private C8087kh f27521to;

    /* JADX INFO: renamed from: x1 */
    private int f27522x1;

    public C8367np() {
        m37786yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m37786yj() {
        this.f27522x1 = 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8952ug m37787c5() {
        return this.f27515du;
    }

    /* JADX INFO: renamed from: ck */
    public final String m37788ck() {
        return this.f27520m9;
    }

    /* JADX INFO: renamed from: du */
    public final long m37789du() {
        return this.f27518k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C8087kh m37790dy() {
        return this.f27521to;
    }

    /* JADX INFO: renamed from: fa */
    public final C7249ah m37791fa() {
        return this.f27516dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m37792h4() {
        return this.f27522x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C7752ge m37793jd() {
        return this.f27517h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8952ug m37799kk() {
        if (this.f27515du != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f27515du = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7314bd m37800m9() {
        return this.f27519kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7752ge m37801to() {
        if (this.f27517h4 != null) {
            throw new Exception("Only one <visibility> element can be added.");
        }
        C7752ge c7752ge = new C7752ge();
        this.f27517h4 = c7752ge;
        return c7752ge;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m37802x1() {
        if (this.f27521to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f27521to = c8087kh;
        return c8087kh;
    }

    public C8367np(final AbstractC13912i5 abstractC13912i5) {
        m37786yj();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.np.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8367np.f27514c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8367np.this.f27518k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8367np.this.f27522x1 = C8899tv.m41945k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.np.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8367np.f27514c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        C8367np.this.f27519kk = new C7314bd(abstractC13912i5);
                        return true;
                    case 3:
                        C8367np.this.f27521to = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C8367np.this.f27515du = new C8952ug(abstractC13912i5);
                        return true;
                    case 5:
                        C8367np.this.f27517h4 = new C7752ge(abstractC13912i5);
                        return true;
                    case 6:
                        C8367np.this.f27520m9 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8367np c8367np = C8367np.this;
                            c8367np.f27520m9 = C14113y2.m67400k4(c8367np.f27520m9, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 7:
                        C8367np.this.f27516dy = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7314bd m37794k4() {
        if (this.f27519kk != null) {
            throw new Exception("Only one <numFmt> element can be added.");
        }
        C7314bd c7314bd = new C7314bd();
        this.f27519kk = c7314bd;
        return c7314bd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37795k4(int i) {
        this.f27522x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37796k4(long j) {
        this.f27518k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37797k4(C7249ah c7249ah) {
        this.f27516dy = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37798k4(String str) {
        this.f27520m9 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C8367np c8367np;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f27518k4));
        int i = this.f27522x1;
        if (i != 0) {
            c3059ii.m12955x1("pos", C8899tv.m41946k4(i));
        }
        C7314bd c7314bd = this.f27519kk;
        if (c7314bd != null) {
            c7314bd.mo6846k4("cx", c3059ii, "numFmt");
        }
        C8087kh c8087kh = this.f27521to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f27515du;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7752ge c7752ge = this.f27517h4;
        if (c7752ge != null) {
            c7752ge.mo6846k4("cx", c3059ii, "visibility");
        }
        String str3 = this.f27520m9;
        if (str3 != null) {
            c8367np = this;
            c3059ii2 = c3059ii;
            c8367np.m29301k4("cx", c3059ii2, "separator", str3, false);
        } else {
            c8367np = this;
            c3059ii2 = c3059ii;
        }
        C7249ah c7249ah = c8367np.f27516dy;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
