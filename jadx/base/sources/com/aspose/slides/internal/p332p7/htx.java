package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class htx extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24297du = new C7017h4("table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name");

    /* JADX INFO: renamed from: k4 */
    private String f24298k4;

    /* JADX INFO: renamed from: kk */
    private String f24299kk;

    /* JADX INFO: renamed from: to */
    private String f24300to;

    /* JADX INFO: renamed from: x1 */
    private String f24301x1;

    public htx() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33625k4() {
        return this.f24298k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33626x1() {
        return this.f24299kk;
    }

    public htx(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.htx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = htx.f24297du.m27428k4(str);
                if (iM27428k4 == 0) {
                    htx.this.f24298k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    htx.this.f24301x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    htx.this.f24299kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                htx.this.f24300to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:style-name", this.f24298k4);
        c3059ii.m12955x1("table:paragraph-style-name", this.f24301x1);
        c3059ii.m12955x1("text:style-name", this.f24299kk);
        c3059ii.m12955x1("text:paragraph-style-name", this.f24300to);
        c3059ii.mo21898jd();
    }
}
