package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wo */
/* JADX INFO: loaded from: classes4.dex */
public class C9126wo extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32436k4 = C9181x9.m44256k4("standard");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32437kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f32438x1;

    public C9126wo() {
        m43836kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m43836kk() {
        this.f32438x1 = f32436k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43838k4() {
        return this.f32438x1;
    }

    public C9126wo(AbstractC13912i5 abstractC13912i5) {
        m43836kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9126wo.f32437kk.m27428k4(str) != 0) {
                    return false;
                }
                C9126wo.this.f32438x1 = C9181x9.m44256k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43839k4(int i) {
        this.f32438x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32438x1;
        if (i != f32436k4) {
            c3059ii.m12955x1("val", C9181x9.m44257k4(i));
        }
        c3059ii.mo21898jd();
    }
}
