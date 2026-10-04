package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7467d9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f21561k4 = C7801gu.m32925k4("norm");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21562kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f21563x1;

    public C7467d9() {
        m30244kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m30244kk() {
        this.f21563x1 = f21561k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m30246k4() {
        return this.f21563x1;
    }

    public C7467d9(AbstractC13912i5 abstractC13912i5) {
        m30244kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.d9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7467d9.f21562kk.m27428k4(str) != 0) {
                    return false;
                }
                C7467d9.this.f21563x1 = C7801gu.m32925k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30247k4(int i) {
        this.f21563x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21563x1;
        if (i != f21561k4) {
            c3059ii.m12955x1("val", C7801gu.m32926k4(i));
        }
        c3059ii.mo21898jd();
    }
}
