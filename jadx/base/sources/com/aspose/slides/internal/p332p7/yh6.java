package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class yh6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33384kk = new C7017h4("manifest:algorithm-name", "manifest:initialisation-vector");

    /* JADX INFO: renamed from: k4 */
    private String f33385k4;

    /* JADX INFO: renamed from: x1 */
    private String f33386x1;

    public yh6() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45007k4() {
        return this.f33385k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m45009x1() {
        return this.f33386x1;
    }

    public yh6(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yh6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yh6.f33384kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    yh6.this.f33385k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                yh6.this.f33386x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45008k4(String str) {
        this.f33385k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45010x1(String str) {
        this.f33386x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("manifest:algorithm-name", this.f33385k4);
        c3059ii.m12955x1("manifest:initialisation-vector", this.f33386x1);
        c3059ii.mo21898jd();
    }
}
