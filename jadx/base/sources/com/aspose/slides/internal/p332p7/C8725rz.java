package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rz */
/* JADX INFO: loaded from: classes4.dex */
public class C8725rz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29796kk = new C7017h4("geoChildEntitiesQuery", "geoChildEntities");

    /* JADX INFO: renamed from: k4 */
    private C8188lj f29797k4;

    /* JADX INFO: renamed from: x1 */
    private C7795gt f29798x1;

    public C8725rz() {
    }

    public C8725rz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8725rz.f29796kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8725rz.this.f29797k4 = new C8188lj(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8725rz.this.f29798x1 = new C7795gt(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8188lj c8188lj = this.f29797k4;
        if (c8188lj != null) {
            c8188lj.mo6846k4("cx", c3059ii, "geoChildEntitiesQuery");
        }
        C7795gt c7795gt = this.f29798x1;
        if (c7795gt != null) {
            c7795gt.mo6846k4("cx", c3059ii, "geoChildEntities");
        }
        c3059ii.mo21898jd();
    }
}
