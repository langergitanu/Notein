package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class egt extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22229kk = new C7017h4("name", "val");

    /* JADX INFO: renamed from: k4 */
    private String f22230k4;

    /* JADX INFO: renamed from: x1 */
    private String f22231x1;

    public egt() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m31076k4() {
        return this.f22230k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m31078x1() {
        return this.f22231x1;
    }

    public egt(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.egt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = egt.f22229kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    egt.this.f22230k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                egt.this.f22231x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31077k4(String str) {
        this.f22230k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31079x1(String str) {
        this.f22231x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22230k4;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        String str4 = this.f22231x1;
        if (str4 != null) {
            c3059ii.m12955x1("val", str4);
        }
        c3059ii.mo21898jd();
    }
}
