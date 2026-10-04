package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xe */
/* JADX INFO: loaded from: classes4.dex */
public class C9191xe extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32795k4 = C8563q0.m39216k4("outer");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32796kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f32797x1;

    public C9191xe() {
        m44303kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m44303kk() {
        this.f32797x1 = f32795k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m44305k4() {
        return this.f32797x1;
    }

    public C9191xe(AbstractC13912i5 abstractC13912i5) {
        m44303kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9191xe.f32796kk.m27428k4(str) != 0) {
                    return false;
                }
                C9191xe.this.f32797x1 = C8563q0.m39216k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44306k4(int i) {
        this.f32797x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32797x1;
        if (i != f32795k4) {
            c3059ii.m12955x1("val", C8563q0.m39217k4(i));
        }
        c3059ii.mo21898jd();
    }
}
