package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class edw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22103kk = new C7017h4("draw:name", "draw:value");

    /* JADX INFO: renamed from: k4 */
    private String f22104k4;

    /* JADX INFO: renamed from: x1 */
    private String f22105x1;

    public edw() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m30920k4() {
        return this.f22104k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m30922x1() {
        return this.f22105x1;
    }

    public edw(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.edw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = edw.f22103kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    edw.this.f22104k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                edw.this.f22105x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30921k4(String str) {
        this.f22104k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30923x1(String str) {
        this.f22105x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f22104k4);
        String str3 = this.f22105x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:value", str3);
        }
        c3059ii.mo21898jd();
    }
}
