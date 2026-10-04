package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lv */
/* JADX INFO: loaded from: classes4.dex */
public class C8213lv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26518kk = new C7017h4("name", "fmla");

    /* JADX INFO: renamed from: k4 */
    private String f26519k4;

    /* JADX INFO: renamed from: x1 */
    private String f26520x1;

    public C8213lv() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36442k4() {
        return this.f26519k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m36444x1() {
        return this.f26520x1;
    }

    public C8213lv(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8213lv.f26518kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8213lv.this.f26519k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8213lv.this.f26520x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36443k4(String str) {
        this.f26519k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36445x1(String str) {
        this.f26520x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f26519k4);
        c3059ii.m12955x1("fmla", this.f26520x1);
        c3059ii.mo21898jd();
    }
}
