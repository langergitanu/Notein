package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class w7b extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32200x1 = new C7017h4("dir");

    /* JADX INFO: renamed from: k4 */
    private int f32201k4;

    public w7b() {
        m43530kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m43530kk() {
        this.f32201k4 = 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43532k4() {
        return this.f32201k4;
    }

    public w7b(AbstractC13912i5 abstractC13912i5) {
        m43530kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w7b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (w7b.f32200x1.m27428k4(str) != 0) {
                    return false;
                }
                w7b.this.f32201k4 = C8052k2.m35081k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43533k4(int i) {
        this.f32201k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("dir", C8052k2.m35082k4(this.f32201k4));
        c3059ii.mo21898jd();
    }
}
