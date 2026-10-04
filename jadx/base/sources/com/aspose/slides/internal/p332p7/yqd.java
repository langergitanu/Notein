package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class yqd extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33475kk = new C7017h4("builtInGroupCount", "functionGroup");

    /* JADX INFO: renamed from: k4 */
    private long f33476k4;

    /* JADX INFO: renamed from: x1 */
    private vij f33477x1;

    public yqd() {
        m45099x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45099x1() {
        this.f33476k4 = 16L;
    }

    public yqd(final AbstractC13912i5 abstractC13912i5) {
        m45099x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yqd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (yqd.f33475kk.m27428k4(str) != 0) {
                    return false;
                }
                yqd.this.f33476k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yqd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (yqd.f33475kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                yqd.this.f33477x1 = new vij(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f33476k4;
        if ((4294967295L & j) != 16) {
            c3059ii.m12955x1("builtInGroupCount", C13850af.m65147x1(j));
        }
        vij vijVar = this.f33477x1;
        if (vijVar != null) {
            vijVar.mo6846k4("ssml", c3059ii, "functionGroup");
        }
        c3059ii.mo21898jd();
    }
}
