package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zp */
/* JADX INFO: loaded from: classes4.dex */
public class C9391zp extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f34093kk = new C7017h4("x", "y");

    /* JADX INFO: renamed from: k4 */
    private double f34094k4;

    /* JADX INFO: renamed from: x1 */
    private double f34095x1;

    public C9391zp() {
        m45887to();
    }

    /* JADX INFO: renamed from: to */
    private void m45887to() {
        this.f34094k4 = Double.NaN;
        this.f34095x1 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m45889k4() {
        return this.f34094k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m45891x1() {
        return this.f34095x1;
    }

    public C9391zp(AbstractC13912i5 abstractC13912i5) {
        m45887to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9391zp.f34093kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9391zp.this.f34094k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9391zp.this.f34095x1 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45890k4(double d) {
        this.f34094k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45892x1(double d) {
        this.f34095x1 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("x", C22238OooO0oO.OooO00o(this.f34094k4, 12700.0d, 14));
        c3059ii.m12955x1("y", C22238OooO0oO.OooO00o(this.f34095x1, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
