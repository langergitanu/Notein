package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zw */
/* JADX INFO: loaded from: classes4.dex */
public class C9408zw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f34187x1 = new C7017h4("m:val");

    /* JADX INFO: renamed from: k4 */
    private int f34188k4;

    public C9408zw() {
        m45979kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45979kk() {
        this.f34188k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m45981k4() {
        return this.f34188k4;
    }

    public C9408zw(AbstractC13912i5 abstractC13912i5) {
        m45979kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9408zw.f34187x1.m27428k4(str) != 0) {
                    return false;
                }
                C9408zw.this.f34188k4 = C7420cm.m29669k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45982k4(int i) {
        this.f34188k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f34188k4;
        if (i != 0) {
            c3059ii.m12955x1("m:val", C7420cm.m29670k4(i));
        }
        c3059ii.mo21898jd();
    }
}
