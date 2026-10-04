package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xm */
/* JADX INFO: loaded from: classes4.dex */
public class C9217xm extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32949k4 = C7455d3.m30017k4("auto");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32950kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f32951x1;

    public C9217xm() {
        m44506kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m44506kk() {
        this.f32951x1 = f32949k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m44508k4() {
        return this.f32951x1;
    }

    public C9217xm(AbstractC13912i5 abstractC13912i5) {
        m44506kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9217xm.f32950kk.m27428k4(str) != 0) {
                    return false;
                }
                C9217xm.this.f32951x1 = C7455d3.m30017k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44509k4(int i) {
        this.f32951x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32951x1;
        if (i != f32949k4) {
            c3059ii.m12955x1("val", C7455d3.m30018k4(i));
        }
        c3059ii.mo21898jd();
    }
}
