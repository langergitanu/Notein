package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class xnd extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32975h4 = new C7017h4("horizontalCentered", "verticalCentered", "headings", "gridLines", "gridLinesSet");

    /* JADX INFO: renamed from: du */
    private boolean f32976du;

    /* JADX INFO: renamed from: k4 */
    private boolean f32977k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32978kk;

    /* JADX INFO: renamed from: to */
    private boolean f32979to;

    /* JADX INFO: renamed from: x1 */
    private boolean f32980x1;

    public xnd() {
        m44536x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44536x1() {
        this.f32977k4 = false;
        this.f32980x1 = false;
        this.f32978kk = false;
        this.f32979to = false;
        this.f32976du = true;
    }

    public xnd(AbstractC13912i5 abstractC13912i5) {
        m44536x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xnd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xnd.f32975h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    xnd.this.f32977k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    xnd.this.f32980x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    xnd.this.f32978kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    xnd.this.f32979to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                xnd.this.f32976du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32977k4;
        if (z) {
            c3059ii.m12955x1("horizontalCentered", z ? "1" : "0");
        }
        boolean z2 = this.f32980x1;
        if (z2) {
            c3059ii.m12955x1("verticalCentered", z2 ? "1" : "0");
        }
        boolean z3 = this.f32978kk;
        if (z3) {
            c3059ii.m12955x1("headings", z3 ? "1" : "0");
        }
        boolean z4 = this.f32979to;
        if (z4) {
            c3059ii.m12955x1("gridLines", z4 ? "1" : "0");
        }
        boolean z5 = this.f32976du;
        if (!z5) {
            c3059ii.m12955x1("gridLinesSet", z5 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
