package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class rtq extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29731m9 = new C7017h4("w_EdGrp", "w_Ed", "w_ColFirst", "w_ColLast", "w_Id", "w_DisplacedByCustomXml");

    /* JADX INFO: renamed from: du */
    private String f29732du;

    /* JADX INFO: renamed from: h4 */
    private int f29733h4;

    /* JADX INFO: renamed from: k4 */
    private int f29734k4;

    /* JADX INFO: renamed from: kk */
    private int f29735kk;

    /* JADX INFO: renamed from: to */
    private int f29736to;

    /* JADX INFO: renamed from: x1 */
    private String f29737x1;

    public rtq() {
        m40547x1();
    }

    public rtq(AbstractC13912i5 abstractC13912i5) {
        m40547x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rtq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rtq.f29731m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    rtq.this.f29734k4 = sv1.m41363k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rtq.this.f29737x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    rtq.this.f29735kk = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    rtq.this.f29736to = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    rtq.this.f29732du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                rtq.this.f29733h4 = ges.m32492k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m40547x1() {
        this.f29734k4 = 0;
        this.f29735kk = 0;
        this.f29736to = 0;
        this.f29733h4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29734k4;
        if (i != 0) {
            c3059ii.m12955x1("w:edGrp", sv1.m41364k4(i));
        }
        String str3 = this.f29737x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:ed", str3);
        }
        int i2 = this.f29735kk;
        if (i2 != 0) {
            c3059ii.m12955x1("w:colFirst", C13850af.m65103k4(i2));
        }
        int i3 = this.f29736to;
        if (i3 != 0) {
            c3059ii.m12955x1("w:colLast", C13850af.m65103k4(i3));
        }
        c3059ii.m12955x1("w:id", this.f29732du);
        int i4 = this.f29733h4;
        if (i4 != 0) {
            c3059ii.m12955x1("w:displacedByCustomXml", ges.m32493k4(i4));
        }
        c3059ii.mo21898jd();
    }
}
