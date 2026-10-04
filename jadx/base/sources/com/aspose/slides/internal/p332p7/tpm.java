package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tpm extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30831h4 = new C7017h4("w_Val", "w_Color", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade");

    /* JADX INFO: renamed from: du */
    private String f30832du;

    /* JADX INFO: renamed from: k4 */
    private int f30833k4;

    /* JADX INFO: renamed from: kk */
    private int f30834kk;

    /* JADX INFO: renamed from: to */
    private String f30835to;

    /* JADX INFO: renamed from: x1 */
    private String f30836x1;

    public tpm() {
        m41844x1();
    }

    public tpm(AbstractC13912i5 abstractC13912i5) {
        m41844x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tpm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tpm.f30831h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    tpm.this.f30833k4 = iim.m34162k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tpm.this.f30836x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    tpm.this.f30834kk = klb.m35480k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    tpm.this.f30835to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                tpm.this.f30832du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41844x1() {
        this.f30833k4 = 0;
        this.f30834kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f30833k4;
        if (i != 0) {
            c3059ii.m12955x1("w:val", iim.m34163k4(i));
        }
        String str3 = this.f30836x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:color", str3);
        }
        int i2 = this.f30834kk;
        if (i2 != 0) {
            c3059ii.m12955x1("w:themeColor", klb.m35481k4(i2));
        }
        String str4 = this.f30835to;
        if (str4 != null) {
            c3059ii.m12955x1("w:themeTint", str4);
        }
        String str5 = this.f30832du;
        if (str5 != null) {
            c3059ii.m12955x1("w:themeShade", str5);
        }
        c3059ii.mo21898jd();
    }
}
