package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.e4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7534e4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f21996k4 = C7666fg.m31773k4("factor");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21997kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f21998x1;

    public C7534e4() {
        m30785kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m30785kk() {
        this.f21998x1 = f21996k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m30787k4() {
        return this.f21998x1;
    }

    public C7534e4(AbstractC13912i5 abstractC13912i5) {
        m30785kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.e4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7534e4.f21997kk.m27428k4(str) != 0) {
                    return false;
                }
                C7534e4.this.f21998x1 = C7666fg.m31773k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30788k4(int i) {
        this.f21998x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21998x1;
        if (i != f21996k4) {
            c3059ii.m12955x1("val", C7666fg.m31774k4(i));
        }
        c3059ii.mo21898jd();
    }
}
