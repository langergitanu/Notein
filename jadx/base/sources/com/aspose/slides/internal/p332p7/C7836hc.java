package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hc */
/* JADX INFO: loaded from: classes4.dex */
public class C7836hc extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24025kk = new C7017h4("x", "y");

    /* JADX INFO: renamed from: k4 */
    private String f24026k4;

    /* JADX INFO: renamed from: x1 */
    private String f24027x1;

    public C7836hc() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33274k4() {
        return this.f24026k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33276x1() {
        return this.f24027x1;
    }

    public C7836hc(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7836hc.f24025kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7836hc.this.f24026k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7836hc.this.f24027x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33275k4(String str) {
        this.f24026k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33277x1(String str) {
        this.f24027x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("x", this.f24026k4);
        c3059ii.m12955x1("y", this.f24027x1);
        c3059ii.mo21898jd();
    }
}
