package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dr */
/* JADX INFO: loaded from: classes4.dex */
public class C7506dr extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21798x1 = new C7017h4("m:val");

    /* JADX INFO: renamed from: k4 */
    private int f21799k4;

    public C7506dr() {
        m30546kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m30546kk() {
        this.f21799k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m30548k4() {
        return this.f21799k4;
    }

    public C7506dr(AbstractC13912i5 abstractC13912i5) {
        m30546kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7506dr.f21798x1.m27428k4(str) != 0) {
                    return false;
                }
                C7506dr.this.f21799k4 = C7981j7.m34591k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30549k4(int i) {
        this.f21799k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("m:val", C7981j7.m34592k4(this.f21799k4));
        c3059ii.mo21898jd();
    }
}
