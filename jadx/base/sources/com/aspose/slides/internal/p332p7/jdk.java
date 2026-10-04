package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jdk extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25090du = new C7017h4("w_Val", "w_ThemeColor", "w_ThemeTint", "w_ThemeShade");

    /* JADX INFO: renamed from: k4 */
    private String f25091k4;

    /* JADX INFO: renamed from: kk */
    private String f25092kk;

    /* JADX INFO: renamed from: to */
    private String f25093to;

    /* JADX INFO: renamed from: x1 */
    private int f25094x1;

    public jdk() {
        m34657x1();
    }

    public jdk(AbstractC13912i5 abstractC13912i5) {
        m34657x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jdk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jdk.f25090du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jdk.this.f25091k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    jdk.this.f25094x1 = klb.m35480k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    jdk.this.f25092kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                jdk.this.f25093to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m34657x1() {
        this.f25094x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:val", this.f25091k4);
        int i = this.f25094x1;
        if (i != 0) {
            c3059ii.m12955x1("w:themeColor", klb.m35481k4(i));
        }
        String str3 = this.f25092kk;
        if (str3 != null) {
            c3059ii.m12955x1("w:themeTint", str3);
        }
        String str4 = this.f25093to;
        if (str4 != null) {
            c3059ii.m12955x1("w:themeShade", str4);
        }
        c3059ii.mo21898jd();
    }
}
