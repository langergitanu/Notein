package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8165l8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26161k4 = C7840hf.m33308k4("none");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26162kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f26163x1;

    public C8165l8() {
        m35939kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35939kk() {
        this.f26163x1 = f26161k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m35941k4() {
        return this.f26163x1;
    }

    public C8165l8(AbstractC13912i5 abstractC13912i5) {
        m35939kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8165l8.f26162kk.m27428k4(str) != 0) {
                    return false;
                }
                C8165l8.this.f26163x1 = C7840hf.m33308k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26163x1;
        if (i != f26161k4) {
            c3059ii.m12955x1("val", C7840hf.m33309k4(i));
        }
        c3059ii.mo21898jd();
    }
}
