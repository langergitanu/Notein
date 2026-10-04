package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class rzi extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f29801fa = new C7017h4("id", "on", C18437z2.f56754h, "obscured", "color", "opacity", "offset", "color2", "offset2", "origin", "matrix");

    /* JADX INFO: renamed from: c5 */
    private String f29802c5;

    /* JADX INFO: renamed from: ck */
    private String f29803ck;

    /* JADX INFO: renamed from: du */
    private String f29804du;

    /* JADX INFO: renamed from: dy */
    private String f29805dy;

    /* JADX INFO: renamed from: h4 */
    private String f29806h4;

    /* JADX INFO: renamed from: jd */
    private String f29807jd;

    /* JADX INFO: renamed from: k4 */
    private String f29808k4;

    /* JADX INFO: renamed from: kk */
    private int f29809kk;

    /* JADX INFO: renamed from: m9 */
    private String f29810m9;

    /* JADX INFO: renamed from: to */
    private int f29811to;

    /* JADX INFO: renamed from: x1 */
    private int f29812x1;

    public rzi() {
        m40647x1();
    }

    public rzi(AbstractC13912i5 abstractC13912i5) {
        m40647x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rzi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (rzi.f29801fa.m27428k4(str)) {
                    case 0:
                        rzi.this.f29808k4 = str2;
                        break;
                    case 1:
                        rzi.this.f29812x1 = m9s.m36733k4(str2);
                        break;
                    case 2:
                        rzi.this.f29809kk = xnq.m44538k4(str2);
                        break;
                    case 3:
                        rzi.this.f29811to = m9s.m36733k4(str2);
                        break;
                    case 4:
                        rzi.this.f29804du = str2;
                        break;
                    case 5:
                        rzi.this.f29806h4 = str2;
                        break;
                    case 6:
                        rzi.this.f29810m9 = str2;
                        break;
                    case 7:
                        rzi.this.f29805dy = str2;
                        break;
                    case 8:
                        rzi.this.f29802c5 = str2;
                        break;
                    case 9:
                        rzi.this.f29807jd = str2;
                        break;
                    case 10:
                        rzi.this.f29803ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m40647x1() {
        this.f29812x1 = 0;
        this.f29809kk = 0;
        this.f29811to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29808k4;
        if (str3 != null) {
            c3059ii.m12955x1("id", str3);
        }
        int i = this.f29812x1;
        if (i != 0) {
            c3059ii.m12955x1("on", m9s.m36734k4(i));
        }
        int i2 = this.f29809kk;
        if (i2 != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, xnq.m44539k4(i2));
        }
        int i3 = this.f29811to;
        if (i3 != 0) {
            c3059ii.m12955x1("obscured", m9s.m36734k4(i3));
        }
        String str4 = this.f29804du;
        if (str4 != null) {
            c3059ii.m12955x1("color", str4);
        }
        String str5 = this.f29806h4;
        if (str5 != null) {
            c3059ii.m12955x1("opacity", str5);
        }
        String str6 = this.f29810m9;
        if (str6 != null) {
            c3059ii.m12955x1("offset", str6);
        }
        String str7 = this.f29805dy;
        if (str7 != null) {
            c3059ii.m12955x1("color2", str7);
        }
        String str8 = this.f29802c5;
        if (str8 != null) {
            c3059ii.m12955x1("offset2", str8);
        }
        String str9 = this.f29807jd;
        if (str9 != null) {
            c3059ii.m12955x1("origin", str9);
        }
        String str10 = this.f29803ck;
        if (str10 != null) {
            c3059ii.m12955x1("matrix", str10);
        }
        c3059ii.mo21898jd();
    }
}
