package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kw */
/* JADX INFO: loaded from: classes4.dex */
public class C8142kw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26001kk = new C7017h4("rad", "grow");

    /* JADX INFO: renamed from: k4 */
    private double f26002k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f26003x1;

    public C8142kw() {
        m35755to();
    }

    /* JADX INFO: renamed from: to */
    private void m35755to() {
        this.f26002k4 = 0.0d;
        this.f26003x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m35756k4() {
        return this.f26002k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m35759x1() {
        return this.f26003x1;
    }

    public C8142kw(AbstractC13912i5 abstractC13912i5) {
        m35755to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8142kw.f26001kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8142kw.this.f26002k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8142kw.this.f26003x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35757k4(double d) {
        this.f26002k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f26002k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        boolean z = this.f26003x1;
        if (!z) {
            c3059ii.m12955x1("grow", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35758k4(boolean z) {
        this.f26003x1 = z;
    }
}
