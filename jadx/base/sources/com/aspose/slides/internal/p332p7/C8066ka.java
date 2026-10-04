package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ka */
/* JADX INFO: loaded from: classes4.dex */
public class C8066ka extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25531k4 = C8876tl.m41791k4("box");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25532kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f25533x1;

    public C8066ka() {
        m35217kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35217kk() {
        this.f25533x1 = f25531k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m35219k4() {
        return this.f25533x1;
    }

    public C8066ka(AbstractC13912i5 abstractC13912i5) {
        m35217kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ka.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8066ka.f25532kk.m27428k4(str) != 0) {
                    return false;
                }
                C8066ka.this.f25533x1 = C8876tl.m41791k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35220k4(int i) {
        this.f25533x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25533x1;
        if (i != f25531k4) {
            c3059ii.m12955x1("val", C8876tl.m41792k4(i));
        }
        c3059ii.mo21898jd();
    }
}
