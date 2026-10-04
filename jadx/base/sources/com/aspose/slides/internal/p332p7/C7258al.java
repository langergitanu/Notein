package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.al */
/* JADX INFO: loaded from: classes4.dex */
public class C7258al extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20111kk = new C7017h4("cx", TranslateLanguage.WELSH);

    /* JADX INFO: renamed from: k4 */
    private double f20112k4;

    /* JADX INFO: renamed from: x1 */
    private double f20113x1;

    public C7258al() {
        m28294to();
    }

    /* JADX INFO: renamed from: to */
    private void m28294to() {
        this.f20112k4 = Double.NaN;
        this.f20113x1 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m28296k4() {
        return this.f20112k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m28298x1() {
        return this.f20113x1;
    }

    public C7258al(AbstractC13912i5 abstractC13912i5) {
        m28294to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.al.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7258al.f20111kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7258al.this.f20112k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7258al.this.f20113x1 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28297k4(double d) {
        this.f20112k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28299x1(double d) {
        this.f20113x1 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("cx", C22238OooO0oO.OooO00o(this.f20112k4, 12700.0d, 14));
        c3059ii.m12955x1(TranslateLanguage.WELSH, C22238OooO0oO.OooO00o(this.f20113x1, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
