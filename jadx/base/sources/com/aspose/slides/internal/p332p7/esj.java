package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class esj extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f22401c5 = new C7017h4("id", "style", "on", "fitshape", "fitpath", "trim", "xscale", "string");

    /* JADX INFO: renamed from: du */
    private int f22402du;

    /* JADX INFO: renamed from: dy */
    private String f22403dy;

    /* JADX INFO: renamed from: h4 */
    private int f22404h4;

    /* JADX INFO: renamed from: k4 */
    private String f22405k4;

    /* JADX INFO: renamed from: kk */
    private int f22406kk;

    /* JADX INFO: renamed from: m9 */
    private int f22407m9;

    /* JADX INFO: renamed from: to */
    private int f22408to;

    /* JADX INFO: renamed from: x1 */
    private String f22409x1;

    public esj() {
        m31289x1();
    }

    public esj(AbstractC13912i5 abstractC13912i5) {
        m31289x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.esj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (esj.f22401c5.m27428k4(str)) {
                    case 0:
                        esj.this.f22405k4 = str2;
                        break;
                    case 1:
                        esj.this.f22409x1 = str2;
                        break;
                    case 2:
                        esj.this.f22406kk = m9s.m36733k4(str2);
                        break;
                    case 3:
                        esj.this.f22408to = m9s.m36733k4(str2);
                        break;
                    case 4:
                        esj.this.f22402du = m9s.m36733k4(str2);
                        break;
                    case 5:
                        esj.this.f22404h4 = m9s.m36733k4(str2);
                        break;
                    case 6:
                        esj.this.f22407m9 = m9s.m36733k4(str2);
                        break;
                    case 7:
                        esj.this.f22403dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m31289x1() {
        this.f22406kk = 0;
        this.f22408to = 0;
        this.f22402du = 0;
        this.f22404h4 = 0;
        this.f22407m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22405k4;
        if (str3 != null) {
            c3059ii.m12955x1("id", str3);
        }
        String str4 = this.f22409x1;
        if (str4 != null) {
            c3059ii.m12955x1("style", str4);
        }
        int i = this.f22406kk;
        if (i != 0) {
            c3059ii.m12955x1("on", m9s.m36734k4(i));
        }
        int i2 = this.f22408to;
        if (i2 != 0) {
            c3059ii.m12955x1("fitshape", m9s.m36734k4(i2));
        }
        int i3 = this.f22402du;
        if (i3 != 0) {
            c3059ii.m12955x1("fitpath", m9s.m36734k4(i3));
        }
        int i4 = this.f22404h4;
        if (i4 != 0) {
            c3059ii.m12955x1("trim", m9s.m36734k4(i4));
        }
        int i5 = this.f22407m9;
        if (i5 != 0) {
            c3059ii.m12955x1("xscale", m9s.m36734k4(i5));
        }
        String str5 = this.f22403dy;
        if (str5 != null) {
            c3059ii.m12955x1("string", str5);
        }
        c3059ii.mo21898jd();
    }
}
