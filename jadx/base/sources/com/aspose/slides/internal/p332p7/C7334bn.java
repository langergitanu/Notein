package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bn */
/* JADX INFO: loaded from: classes4.dex */
public class C7334bn extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f20627k4 = C9256y4.m44789k4("r");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20628kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f20629x1;

    public C7334bn() {
        m28997kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28997kk() {
        this.f20629x1 = f20627k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m28999k4() {
        return this.f20629x1;
    }

    public C7334bn(AbstractC13912i5 abstractC13912i5) {
        m28997kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7334bn.f20628kk.m27428k4(str) != 0) {
                    return false;
                }
                C7334bn.this.f20629x1 = C9256y4.m44789k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29000k4(int i) {
        this.f20629x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20629x1;
        if (i != f20627k4) {
            c3059ii.m12955x1("val", C9256y4.m44790k4(i));
        }
        c3059ii.mo21898jd();
    }
}
