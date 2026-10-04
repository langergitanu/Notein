package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.va */
/* JADX INFO: loaded from: classes4.dex */
public final class C9013va extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31643k4 = C7333bm.m28994k4("days");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31644kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f31645x1;

    public C9013va() {
        this.f31645x1 = f31643k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m42838k4() {
        return this.f31645x1;
    }

    public C9013va(AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.va.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9013va.f31644kk.m27428k4(str) != 0) {
                    return false;
                }
                C9013va.this.f31645x1 = C7333bm.m28994k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42839k4(int i) {
        this.f31645x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C7333bm.m28995k4(this.f31645x1));
        c3059ii.mo21898jd();
    }
}
