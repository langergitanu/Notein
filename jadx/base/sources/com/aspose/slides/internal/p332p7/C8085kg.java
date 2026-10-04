package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kg */
/* JADX INFO: loaded from: classes4.dex */
public class C8085kg extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25647x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f25648k4;

    public C8085kg() {
    }

    /* JADX INFO: renamed from: k4 */
    public final int m35351k4() {
        return this.f25648k4;
    }

    public C8085kg(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8085kg.f25647x1.m27428k4(str) != 0) {
                    return false;
                }
                C8085kg.this.f25648k4 = C9282yg.m44991k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35352k4(int i) {
        this.f25648k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C9282yg.m44992k4(this.f25648k4));
        c3059ii.mo21898jd();
    }
}
