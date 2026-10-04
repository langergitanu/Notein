package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sk */
/* JADX INFO: loaded from: classes4.dex */
public class C8780sk extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f30190k4 = C8915u2.m42064k4(RequestParameters.MARKER);

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30191kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f30192x1;

    public C8780sk() {
        m41077kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m41077kk() {
        this.f30192x1 = f30190k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m41079k4() {
        return this.f30192x1;
    }

    public C8780sk(AbstractC13912i5 abstractC13912i5) {
        m41077kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8780sk.f30191kk.m27428k4(str) != 0) {
                    return false;
                }
                C8780sk.this.f30192x1 = C8915u2.m42064k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41080k4(int i) {
        this.f30192x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f30192x1;
        if (i != f30190k4) {
            c3059ii.m12955x1("val", C8915u2.m42065k4(i));
        }
        c3059ii.mo21898jd();
    }
}
