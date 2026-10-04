package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vk */
/* JADX INFO: loaded from: classes4.dex */
public class C9048vk extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31896kk = new C7017h4("fov", "extLst");

    /* JADX INFO: renamed from: k4 */
    private float f31897k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f31898x1;

    public C9048vk() {
        m43135x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43135x1() {
        this.f31897k4 = 45.0f;
    }

    public C9048vk(final AbstractC13912i5 abstractC13912i5) {
        m43135x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9048vk.f31896kk.m27428k4(str) != 0) {
                    return false;
                }
                C9048vk.this.f31897k4 = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9048vk.f31896kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C9048vk.this.f31898x1 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        OooO00o.OooO00o(this.f31897k4 * 60000.0f, 14, c3059ii, "fov");
        C8397nz c8397nz = this.f31898x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
