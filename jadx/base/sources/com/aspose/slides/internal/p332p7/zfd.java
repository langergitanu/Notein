package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class zfd extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f33872k4 = C9162x0.m44156k4("l");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33873kk = new C7017h4("dir");

    /* JADX INFO: renamed from: x1 */
    private int f33874x1;

    public zfd() {
        m45589kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45589kk() {
        this.f33874x1 = f33872k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m45591k4() {
        return this.f33874x1;
    }

    public zfd(AbstractC13912i5 abstractC13912i5) {
        m45589kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zfd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (zfd.f33873kk.m27428k4(str) != 0) {
                    return false;
                }
                zfd.this.f33874x1 = C9162x0.m44156k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45592k4(int i) {
        this.f33874x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33874x1;
        if (i != f33872k4) {
            c3059ii.m12955x1("dir", C9162x0.m44157k4(i));
        }
        c3059ii.mo21898jd();
    }
}
