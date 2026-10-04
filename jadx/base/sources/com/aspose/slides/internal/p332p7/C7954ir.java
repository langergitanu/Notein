package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ir */
/* JADX INFO: loaded from: classes4.dex */
public class C7954ir extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f24897ck = new C7017h4("mods", "lnRef", "lineWidthScale", "fillRef", "effectRef", "fontRef", "spPr", "defRPr", "bodyPr", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7360by f24898c5;

    /* JADX INFO: renamed from: du */
    private C8788sm f24899du;

    /* JADX INFO: renamed from: dy */
    private C9135ws f24900dy;

    /* JADX INFO: renamed from: h4 */
    private C8661ra f24901h4;

    /* JADX INFO: renamed from: jd */
    private C8397nz f24902jd;

    /* JADX INFO: renamed from: k4 */
    private String f24903k4;

    /* JADX INFO: renamed from: kk */
    private double f24904kk;

    /* JADX INFO: renamed from: m9 */
    private C8087kh f24905m9;

    /* JADX INFO: renamed from: to */
    private C8788sm f24906to;

    /* JADX INFO: renamed from: x1 */
    private C8788sm f24907x1;

    public C7954ir() {
        m34401c5();
        this.f24907x1 = new C8788sm();
        this.f24906to = new C8788sm();
        this.f24899du = new C8788sm();
        this.f24901h4 = new C8661ra();
    }

    /* JADX INFO: renamed from: c5 */
    private void m34401c5() {
        this.f24904kk = Double.NaN;
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m34413du() {
        return this.f24905m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9135ws m34414h4() {
        return this.f24900dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C8788sm m34416kk() {
        return this.f24899du;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7360by m34417m9() {
        return this.f24898c5;
    }

    /* JADX INFO: renamed from: to */
    public final C8661ra m34418to() {
        return this.f24901h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8788sm m34419x1() {
        return this.f24906to;
    }

    public C7954ir(final AbstractC13912i5 abstractC13912i5) {
        m34401c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ir.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7954ir.f24897ck.m27428k4(str) != 0) {
                    return false;
                }
                C7954ir.this.f24903k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ir.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C7954ir.f24897ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7954ir.this.f24907x1 = new C8788sm(abstractC13912i5);
                        return true;
                    case 2:
                        abstractC13912i5.mo65026h4();
                        C7954ir.this.f24904kk = AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv());
                        return true;
                    case 3:
                        C7954ir.this.f24906to = new C8788sm(abstractC13912i5);
                        return true;
                    case 4:
                        C7954ir.this.f24899du = new C8788sm(abstractC13912i5);
                        return true;
                    case 5:
                        C7954ir.this.f24901h4 = new C8661ra(abstractC13912i5);
                        return true;
                    case 6:
                        C7954ir.this.f24905m9 = new C8087kh(abstractC13912i5);
                        return true;
                    case 7:
                        C7954ir.this.f24900dy = new C9135ws(abstractC13912i5);
                        return true;
                    case 8:
                        C7954ir.this.f24898c5 = new C7360by(abstractC13912i5);
                        return true;
                    case 9:
                        C7954ir.this.f24902jd = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8788sm m34415k4() {
        return this.f24907x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7954ir c7954ir;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24903k4;
        if (str3 != null) {
            c3059ii.m12955x1("mods", str3);
        }
        this.f24907x1.mo6846k4(TranslateLanguage.CZECH, c3059ii, "lnRef");
        if (C14044b3.m66437kk(this.f24904kk)) {
            c7954ir = this;
            c3059ii2 = c3059ii;
        } else {
            c7954ir = this;
            c3059ii2 = c3059ii;
            c7954ir.m29301k4(TranslateLanguage.CZECH, c3059ii2, "lineWidthScale", C13850af.m65101k4(this.f24904kk), false);
        }
        c7954ir.f24906to.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "fillRef");
        c7954ir.f24899du.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "effectRef");
        c7954ir.f24901h4.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "fontRef");
        C8087kh c8087kh = c7954ir.f24905m9;
        if (c8087kh != null) {
            c8087kh.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "spPr");
        }
        C9135ws c9135ws = c7954ir.f24900dy;
        if (c9135ws != null) {
            c9135ws.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "defRPr");
        }
        C7360by c7360by = c7954ir.f24898c5;
        if (c7360by != null) {
            c7360by.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "bodyPr");
        }
        C8397nz c8397nz = c7954ir.f24902jd;
        if (c8397nz != null) {
            c8397nz.mo6846k4(TranslateLanguage.CZECH, c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}
