package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class skp extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f30198jd = new C7017h4("w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade", "w_Sz", "w_Space", "w_Shadow", "w_Frame");

    /* JADX INFO: renamed from: c5 */
    private int f30199c5;

    /* JADX INFO: renamed from: du */
    private String f30200du;

    /* JADX INFO: renamed from: dy */
    private int f30201dy;

    /* JADX INFO: renamed from: h4 */
    private long f30202h4;

    /* JADX INFO: renamed from: k4 */
    private int f30203k4;

    /* JADX INFO: renamed from: kk */
    private int f30204kk;

    /* JADX INFO: renamed from: m9 */
    private long f30205m9;

    /* JADX INFO: renamed from: to */
    private String f30206to;

    /* JADX INFO: renamed from: x1 */
    private String f30207x1;

    public skp() {
        m41095x1();
    }

    public skp(AbstractC13912i5 abstractC13912i5) {
        m41095x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.skp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (skp.f30198jd.m27428k4(str)) {
                    case 0:
                        skp.this.f30203k4 = hp5.m33569k4(str2);
                        break;
                    case 1:
                        skp.this.f30207x1 = str2;
                        break;
                    case 2:
                        skp.this.f30204kk = klb.m35480k4(str2);
                        break;
                    case 3:
                        skp.this.f30206to = str2;
                        break;
                    case 4:
                        skp.this.f30200du = str2;
                        break;
                    case 5:
                        skp.this.f30202h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        skp.this.f30205m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        skp.this.f30201dy = vn6.m43185k4(str2);
                        break;
                    case 8:
                        skp.this.f30199c5 = vn6.m43185k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41095x1() {
        this.f30203k4 = 0;
        this.f30204kk = 0;
        this.f30202h4 = 4294967295L;
        this.f30205m9 = 4294967295L;
        this.f30201dy = 0;
        this.f30199c5 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:val", hp5.m33570k4(this.f30203k4));
        String str3 = this.f30207x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:color", str3);
        }
        int i = this.f30204kk;
        if (i != 0) {
            c3059ii.m12955x1("w:themeColor", klb.m35481k4(i));
        }
        String str4 = this.f30206to;
        if (str4 != null) {
            c3059ii.m12955x1("w:themeTint", str4);
        }
        String str5 = this.f30200du;
        if (str5 != null) {
            c3059ii.m12955x1("w:themeShade", str5);
        }
        long j = this.f30202h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("w:sz", C13850af.m65147x1(j));
        }
        long j2 = this.f30205m9;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("w:space", C13850af.m65147x1(j2));
        }
        int i2 = this.f30201dy;
        if (i2 != 0) {
            c3059ii.m12955x1("w:shadow", vn6.m43186k4(i2));
        }
        int i3 = this.f30199c5;
        if (i3 != 0) {
            c3059ii.m12955x1("w:frame", vn6.m43186k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
