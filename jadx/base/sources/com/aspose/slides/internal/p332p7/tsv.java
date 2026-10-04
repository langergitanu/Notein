package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tsv extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f30864jd = new C7017h4("w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade", "w_Fill", "w_ThemeFill", "w_ThemeFillTint", "w_ThemeFillShade");

    /* JADX INFO: renamed from: c5 */
    private String f30865c5;

    /* JADX INFO: renamed from: du */
    private String f30866du;

    /* JADX INFO: renamed from: dy */
    private String f30867dy;

    /* JADX INFO: renamed from: h4 */
    private String f30868h4;

    /* JADX INFO: renamed from: k4 */
    private int f30869k4;

    /* JADX INFO: renamed from: kk */
    private int f30870kk;

    /* JADX INFO: renamed from: m9 */
    private int f30871m9;

    /* JADX INFO: renamed from: to */
    private String f30872to;

    /* JADX INFO: renamed from: x1 */
    private String f30873x1;

    public tsv() {
        m41890x1();
    }

    public tsv(AbstractC13912i5 abstractC13912i5) {
        m41890x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tsv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (tsv.f30864jd.m27428k4(str)) {
                    case 0:
                        tsv.this.f30869k4 = r3y.m39861k4(str2);
                        break;
                    case 1:
                        tsv.this.f30873x1 = str2;
                        break;
                    case 2:
                        tsv.this.f30870kk = klb.m35480k4(str2);
                        break;
                    case 3:
                        tsv.this.f30872to = str2;
                        break;
                    case 4:
                        tsv.this.f30866du = str2;
                        break;
                    case 5:
                        tsv.this.f30868h4 = str2;
                        break;
                    case 6:
                        tsv.this.f30871m9 = klb.m35480k4(str2);
                        break;
                    case 7:
                        tsv.this.f30867dy = str2;
                        break;
                    case 8:
                        tsv.this.f30865c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41890x1() {
        this.f30869k4 = 0;
        this.f30870kk = 0;
        this.f30871m9 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:val", r3y.m39862k4(this.f30869k4));
        String str3 = this.f30873x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:color", str3);
        }
        int i = this.f30870kk;
        if (i != 0) {
            c3059ii.m12955x1("w:themeColor", klb.m35481k4(i));
        }
        String str4 = this.f30872to;
        if (str4 != null) {
            c3059ii.m12955x1("w:themeTint", str4);
        }
        String str5 = this.f30866du;
        if (str5 != null) {
            c3059ii.m12955x1("w:themeShade", str5);
        }
        String str6 = this.f30868h4;
        if (str6 != null) {
            c3059ii.m12955x1("w:fill", str6);
        }
        int i2 = this.f30871m9;
        if (i2 != 0) {
            c3059ii.m12955x1("w:themeFill", klb.m35481k4(i2));
        }
        String str7 = this.f30867dy;
        if (str7 != null) {
            c3059ii.m12955x1("w:themeFillTint", str7);
        }
        String str8 = this.f30865c5;
        if (str8 != null) {
            c3059ii.m12955x1("w:themeFillShade", str8);
        }
        c3059ii.mo21898jd();
    }
}
