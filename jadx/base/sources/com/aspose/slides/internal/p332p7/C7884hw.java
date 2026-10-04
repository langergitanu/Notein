package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hw */
/* JADX INFO: loaded from: classes4.dex */
public class C7884hw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24312kk = new C7017h4(C18437z2.f56754h, "extLst");

    /* JADX INFO: renamed from: k4 */
    private int f24313k4;

    /* JADX INFO: renamed from: x1 */
    private C7249ah f24314x1;

    public C7884hw() {
        m33637to();
    }

    /* JADX INFO: renamed from: to */
    private void m33637to() {
        this.f24313k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m33638k4() {
        return this.f24313k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7249ah m33641x1() {
        return this.f24314x1;
    }

    public C7884hw(final AbstractC13912i5 abstractC13912i5) {
        m33637to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7884hw.f24312kk.m27428k4(str) != 0) {
                    return false;
                }
                C7884hw.this.f24313k4 = C7904i4.m33842k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7884hw.f24312kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7884hw.this.f24314x1 = new C7249ah(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33639k4(int i) {
        this.f24313k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33640k4(C7249ah c7249ah) {
        this.f24314x1 = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24313k4;
        if (i != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, C7904i4.m33843k4(i));
        }
        C7249ah c7249ah = this.f24314x1;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
