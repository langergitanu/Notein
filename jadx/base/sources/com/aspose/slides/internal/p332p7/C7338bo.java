package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bo */
/* JADX INFO: loaded from: classes4.dex */
public class C7338bo extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20643x1 = new C7017h4("m:val");

    /* JADX INFO: renamed from: k4 */
    private int f20644k4;

    public C7338bo() {
        m29017kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m29017kk() {
        this.f20644k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m29019k4() {
        return this.f20644k4;
    }

    public C7338bo(AbstractC13912i5 abstractC13912i5) {
        m29017kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7338bo.f20643x1.m27428k4(str) != 0) {
                    return false;
                }
                C7338bo.this.f20644k4 = C7618ez.m31463k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29020k4(int i) {
        this.f20644k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f20644k4;
        if (i != 0) {
            c3059ii.m12955x1("m:val", C7618ez.m31464k4(i));
        }
        c3059ii.mo21898jd();
    }
}
