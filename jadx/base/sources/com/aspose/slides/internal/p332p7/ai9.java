package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ai9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f20083ck = new C7017h4("sqref", "evalError", "twoDigitTextYear", "numberStoredAsText", "formula", "formulaRange", "unlockedFormula", "emptyCellReference", "listDataValidation", "calculatedColumn");

    /* JADX INFO: renamed from: c5 */
    private boolean f20084c5;

    /* JADX INFO: renamed from: du */
    private boolean f20085du;

    /* JADX INFO: renamed from: dy */
    private boolean f20086dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f20087h4;

    /* JADX INFO: renamed from: jd */
    private boolean f20088jd;

    /* JADX INFO: renamed from: k4 */
    private String f20089k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20090kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f20091m9;

    /* JADX INFO: renamed from: to */
    private boolean f20092to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20093x1;

    public ai9() {
        m28277x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28277x1() {
        this.f20093x1 = false;
        this.f20090kk = false;
        this.f20092to = false;
        this.f20085du = false;
        this.f20087h4 = false;
        this.f20091m9 = false;
        this.f20086dy = false;
        this.f20084c5 = false;
        this.f20088jd = false;
    }

    public ai9(AbstractC13912i5 abstractC13912i5) {
        m28277x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ai9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ai9.f20083ck.m27428k4(str)) {
                    case 0:
                        ai9.this.f20089k4 = str2;
                        break;
                    case 1:
                        ai9.this.f20093x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        ai9.this.f20090kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        ai9.this.f20092to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        ai9.this.f20085du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        ai9.this.f20087h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        ai9.this.f20091m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        ai9.this.f20086dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        ai9.this.f20084c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        ai9.this.f20088jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("sqref", this.f20089k4);
        boolean z = this.f20093x1;
        if (z) {
            c3059ii.m12955x1("evalError", z ? "1" : "0");
        }
        boolean z2 = this.f20090kk;
        if (z2) {
            c3059ii.m12955x1("twoDigitTextYear", z2 ? "1" : "0");
        }
        boolean z3 = this.f20092to;
        if (z3) {
            c3059ii.m12955x1("numberStoredAsText", z3 ? "1" : "0");
        }
        boolean z4 = this.f20085du;
        if (z4) {
            c3059ii.m12955x1("formula", z4 ? "1" : "0");
        }
        boolean z5 = this.f20087h4;
        if (z5) {
            c3059ii.m12955x1("formulaRange", z5 ? "1" : "0");
        }
        boolean z6 = this.f20091m9;
        if (z6) {
            c3059ii.m12955x1("unlockedFormula", z6 ? "1" : "0");
        }
        boolean z7 = this.f20086dy;
        if (z7) {
            c3059ii.m12955x1("emptyCellReference", z7 ? "1" : "0");
        }
        boolean z8 = this.f20084c5;
        if (z8) {
            c3059ii.m12955x1("listDataValidation", z8 ? "1" : "0");
        }
        boolean z9 = this.f20088jd;
        if (z9) {
            c3059ii.m12955x1("calculatedColumn", z9 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
