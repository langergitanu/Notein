package com.aspose.slides.internal.p443ul;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ul.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11445kk {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f38999k4;

    /* JADX INFO: renamed from: x1 */
    private final int f39000x1;

    public C11445kk(byte[] bArr, int i) {
        this.f38999k4 = bArr;
        this.f39000x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11446to m54503k4(AbstractC3150x6 abstractC3150x6) {
        return new C11446to(abstractC3150x6, this.f38999k4, 0, this.f39000x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m54504k4(byte[] bArr) {
        C3152yj c3152yj = new C3152yj();
        try {
            m54503k4(c3152yj).write(bArr, 0, bArr.length);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }
}
