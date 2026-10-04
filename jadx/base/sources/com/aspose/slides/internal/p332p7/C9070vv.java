package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vv */
/* JADX INFO: loaded from: classes4.dex */
public class C9070vv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32043kk = new C7017h4(C18437z2.f56754h, "ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C8219lw f32044k4;

    /* JADX INFO: renamed from: x1 */
    private C7782go f32045x1;

    public C9070vv() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m43326k4() {
        if (this.f32045x1 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f32045x1 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C7782go m43328kk() {
        return this.f32045x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8219lw m43329x1() {
        return this.f32044k4;
    }

    public C9070vv(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9070vv.f32043kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9070vv.this.f32044k4 = new C8219lw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9070vv.this.f32045x1 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43327k4(C8219lw c8219lw) {
        this.f32044k4 = c8219lw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8219lw c8219lw = this.f32044k4;
        if (c8219lw != null) {
            c8219lw.mo6846k4("m", c3059ii, C18437z2.f56754h);
        }
        C7782go c7782go = this.f32045x1;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
