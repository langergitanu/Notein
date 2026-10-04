package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ktl extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f25960c5;

    /* JADX INFO: renamed from: du */
    private String f25961du;

    /* JADX INFO: renamed from: dy */
    private int f25962dy;

    /* JADX INFO: renamed from: h4 */
    private String f25963h4;

    /* JADX INFO: renamed from: kk */
    private String f25964kk;

    /* JADX INFO: renamed from: m9 */
    private int f25965m9;

    /* JADX INFO: renamed from: to */
    private String f25966to;

    /* JADX INFO: renamed from: x1 */
    private String f25967x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f25959k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f25958jd = new C7017h4("draw:name", "draw:display-name", "svg:width", "svg:height", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate");

    public ktl() {
        m35711to();
    }

    public ktl(AbstractC13912i5 abstractC13912i5) {
        m35711to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ktl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ktl.f25958jd.m27428k4(str)) {
                    case 0:
                        ktl.this.f25967x1 = str2;
                        break;
                    case 1:
                        ktl.this.f25964kk = str2;
                        break;
                    case 2:
                        ktl.this.f25966to = str2;
                        break;
                    case 3:
                        ktl.this.f25961du = str2;
                        break;
                    case 4:
                        ktl.this.f25963h4 = str2;
                        break;
                    case 5:
                        ktl.this.f25965m9 = bhu.m28903k4(str2);
                        break;
                    case 6:
                        ktl.this.f25962dy = bdd.m28828k4(str2);
                        break;
                    case 7:
                        ktl.this.f25960c5 = qs5.m39644k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: to */
    private void m35711to() {
        this.f25965m9 = f25959k4;
        this.f25962dy = 0;
        this.f25960c5 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35714k4() {
        return this.f25967x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35716x1() {
        return this.f25963h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35715k4(String str) {
        this.f25967x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35717x1(String str) {
        this.f25963h4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f25967x1);
        String str3 = this.f25964kk;
        if (str3 != null) {
            c3059ii.m12955x1("draw:display-name", str3);
        }
        String str4 = this.f25966to;
        if (str4 != null) {
            c3059ii.m12955x1("svg:width", str4);
        }
        String str5 = this.f25961du;
        if (str5 != null) {
            c3059ii.m12955x1("svg:height", str5);
        }
        c3059ii.m12955x1("xlink:href", this.f25963h4);
        int i = this.f25965m9;
        if (i != f25959k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f25962dy;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f25960c5;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
