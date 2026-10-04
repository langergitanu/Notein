package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.us */
/* JADX INFO: loaded from: classes4.dex */
public class C8975us extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31405k4 = C7540e8.m30809k4("area");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31406kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f31407x1;

    public C8975us() {
        m42542kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m42542kk() {
        this.f31407x1 = f31405k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m42544k4() {
        return this.f31407x1;
    }

    public C8975us(AbstractC13912i5 abstractC13912i5) {
        m42542kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.us.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8975us.f31406kk.m27428k4(str) != 0) {
                    return false;
                }
                C8975us.this.f31407x1 = C7540e8.m30809k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42545k4(int i) {
        this.f31407x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31407x1;
        if (i != f31405k4) {
            c3059ii.m12955x1("val", C7540e8.m30810k4(i));
        }
        c3059ii.mo21898jd();
    }
}
