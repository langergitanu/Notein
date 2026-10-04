package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bk */
/* JADX INFO: loaded from: classes4.dex */
public class C7328bk extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f20599k4 = C9195xg.m44335k4("rel");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20600kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f20601x1;

    public C7328bk() {
        m28956kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28956kk() {
        this.f20601x1 = f20599k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m28958k4() {
        return this.f20601x1;
    }

    public C7328bk(AbstractC13912i5 abstractC13912i5) {
        m28956kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7328bk.f20600kk.m27428k4(str) != 0) {
                    return false;
                }
                C7328bk.this.f20601x1 = C9195xg.m44335k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20601x1;
        if (i != f20599k4) {
            c3059ii.m12955x1("val", C9195xg.m44336k4(i));
        }
        c3059ii.mo21898jd();
    }
}
