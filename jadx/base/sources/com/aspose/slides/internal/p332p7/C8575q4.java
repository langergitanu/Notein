package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.q4 */
/* JADX INFO: loaded from: classes4.dex */
public class C8575q4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28740x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f28741k4;

    public C8575q4() {
        m39323kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m39323kk() {
        this.f28741k4 = 100;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m39325k4() {
        return this.f28741k4;
    }

    public C8575q4(AbstractC13912i5 abstractC13912i5) {
        m39323kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8575q4.f28740x1.m27428k4(str) != 0) {
                    return false;
                }
                C8575q4.this.f28741k4 = C13850af.m65150x6(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39326k4(int i) {
        this.f28741k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f28741k4;
        if ((65535 & i) != 100) {
            c3059ii.m12955x1("val", C13850af.m65146x1(i));
        }
        c3059ii.mo21898jd();
    }
}
