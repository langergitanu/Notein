package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ud9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f31218c5;

    /* JADX INFO: renamed from: du */
    private int f31219du;

    /* JADX INFO: renamed from: dy */
    private String f31220dy;

    /* JADX INFO: renamed from: h4 */
    private int f31221h4;

    /* JADX INFO: renamed from: jd */
    private C14077m4 f31222jd = new C14077m4();

    /* JADX INFO: renamed from: kk */
    private long f31223kk;

    /* JADX INFO: renamed from: m9 */
    private String f31224m9;

    /* JADX INFO: renamed from: to */
    private long f31225to;

    /* JADX INFO: renamed from: x1 */
    private String f31226x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f31217k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f31216ck = new C7017h4("table:name", "table:last-column-spanned", "table:last-row-spanned", "xlink:type", "xlink:actuate", "xlink:href", "table:filter-name", "table:filter-options", "table:refresh-delay");

    public ud9() {
        m42329x1();
    }

    public ud9(AbstractC13912i5 abstractC13912i5) {
        m42329x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ud9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ud9.f31216ck.m27428k4(str)) {
                    case 0:
                        ud9.this.f31226x1 = str2;
                        break;
                    case 1:
                        ud9.this.f31223kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        ud9.this.f31225to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        ud9.this.f31219du = bhu.m28903k4(str2);
                        break;
                    case 4:
                        ud9.this.f31221h4 = x2a.m44176k4(str2);
                        break;
                    case 5:
                        ud9.this.f31224m9 = str2;
                        break;
                    case 6:
                        ud9.this.f31220dy = str2;
                        break;
                    case 7:
                        ud9.this.f31218c5 = str2;
                        break;
                    case 8:
                        AbstractC7361bz.m29294ks(str2).CloneTo(ud9.this.f31222jd);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42329x1() {
        this.f31219du = f31217k4;
        this.f31221h4 = 0;
        C14077m4.f47265kk.CloneTo(this.f31222jd);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f31226x1);
        c3059ii.m12955x1("table:last-column-spanned", C13850af.m65147x1(this.f31223kk));
        c3059ii.m12955x1("table:last-row-spanned", C13850af.m65147x1(this.f31225to));
        int i = this.f31219du;
        if (i != f31217k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f31221h4;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        c3059ii.m12955x1("xlink:href", this.f31224m9);
        String str3 = this.f31220dy;
        if (str3 != null) {
            c3059ii.m12955x1("table:filter-name", str3);
        }
        String str4 = this.f31218c5;
        if (str4 != null) {
            c3059ii.m12955x1("table:filter-options", str4);
        }
        c3059ii.m12955x1("table:refresh-delay", AbstractC7361bz.m29288k4(this.f31222jd.Clone()));
        c3059ii.mo21898jd();
    }
}
