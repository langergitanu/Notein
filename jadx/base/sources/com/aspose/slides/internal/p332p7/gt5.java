package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class gt5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f23717ck = new C7017h4("differentOddEven", "differentFirst", "scaleWithDoc", "alignWithMargins", "oddHeader", "oddFooter", "evenHeader", "evenFooter", "firstHeader", "firstFooter");

    /* JADX INFO: renamed from: c5 */
    private String f23718c5;

    /* JADX INFO: renamed from: du */
    private String f23719du;

    /* JADX INFO: renamed from: dy */
    private String f23720dy;

    /* JADX INFO: renamed from: h4 */
    private String f23721h4;

    /* JADX INFO: renamed from: jd */
    private String f23722jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f23723k4;

    /* JADX INFO: renamed from: kk */
    private boolean f23724kk;

    /* JADX INFO: renamed from: m9 */
    private String f23725m9;

    /* JADX INFO: renamed from: to */
    private boolean f23726to;

    /* JADX INFO: renamed from: x1 */
    private boolean f23727x1;

    public gt5() {
        m32898x1();
    }

    public gt5(final AbstractC13912i5 abstractC13912i5) {
        m32898x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gt5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gt5.f23717ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    gt5.this.f23723k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    gt5.this.f23727x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    gt5.this.f23724kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                gt5.this.f23726to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gt5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (gt5.f23717ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        gt5.this.f23719du = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var = gt5.this;
                            gt5Var.f23719du = C14113y2.m67400k4(gt5Var.f23719du, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 5:
                        gt5.this.f23721h4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var2 = gt5.this;
                            gt5Var2.f23721h4 = C14113y2.m67400k4(gt5Var2.f23721h4, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 6:
                        gt5.this.f23725m9 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var3 = gt5.this;
                            gt5Var3.f23725m9 = C14113y2.m67400k4(gt5Var3.f23725m9, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 7:
                        gt5.this.f23720dy = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var4 = gt5.this;
                            gt5Var4.f23720dy = C14113y2.m67400k4(gt5Var4.f23720dy, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 8:
                        gt5.this.f23718c5 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var5 = gt5.this;
                            gt5Var5.f23718c5 = C14113y2.m67400k4(gt5Var5.f23718c5, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 9:
                        gt5.this.f23722jd = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            gt5 gt5Var6 = gt5.this;
                            gt5Var6.f23722jd = C14113y2.m67400k4(gt5Var6.f23722jd, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32898x1() {
        this.f23723k4 = false;
        this.f23727x1 = false;
        this.f23724kk = true;
        this.f23726to = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        gt5 gt5Var;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23723k4;
        if (z) {
            c3059ii.m12955x1("differentOddEven", z ? "1" : "0");
        }
        boolean z2 = this.f23727x1;
        if (z2) {
            c3059ii.m12955x1("differentFirst", z2 ? "1" : "0");
        }
        boolean z3 = this.f23724kk;
        if (!z3) {
            c3059ii.m12955x1("scaleWithDoc", z3 ? "1" : "0");
        }
        boolean z4 = this.f23726to;
        if (!z4) {
            c3059ii.m12955x1("alignWithMargins", z4 ? "1" : "0");
        }
        String str3 = this.f23719du;
        if (str3 != null) {
            m29301k4("ssml", c3059ii, "oddHeader", str3, true);
            gt5Var = this;
            c3059ii2 = c3059ii;
        } else {
            gt5Var = this;
            c3059ii2 = c3059ii;
        }
        String str4 = gt5Var.f23721h4;
        if (str4 != null) {
            gt5Var.m29301k4("ssml", c3059ii2, "oddFooter", str4, true);
        }
        String str5 = gt5Var.f23725m9;
        if (str5 != null) {
            gt5Var.m29301k4("ssml", c3059ii2, "evenHeader", str5, true);
        }
        String str6 = gt5Var.f23720dy;
        if (str6 != null) {
            gt5Var.m29301k4("ssml", c3059ii2, "evenFooter", str6, true);
        }
        String str7 = gt5Var.f23718c5;
        if (str7 != null) {
            gt5Var.m29301k4("ssml", c3059ii2, "firstHeader", str7, true);
        }
        String str8 = gt5Var.f23722jd;
        if (str8 != null) {
            gt5Var.m29301k4("ssml", c3059ii2, "firstFooter", str8, true);
        }
        c3059ii2.mo21898jd();
    }
}
