package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lz */
/* JADX INFO: loaded from: classes4.dex */
public class C8229lz extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26601x1 = new C7017h4("ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C7782go f26602k4;

    public C8229lz() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m36528k4() {
        if (this.f26602k4 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f26602k4 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7782go m36529x1() {
        return this.f26602k4;
    }

    public C8229lz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8229lz.f26601x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8229lz.this.f26602k4 = new C7782go(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7782go c7782go = this.f26602k4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
