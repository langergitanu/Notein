package com.aspose.slides;

import com.aspose.slides.internal.p046bs.C1847du;
import com.aspose.slides.internal.p046bs.C1850to;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: loaded from: classes3.dex */
class rsv implements InterfaceC1849kk {

    /* JADX INFO: renamed from: k4 */
    private final C13845mp f48687k4;

    public rsv(C13845mp c13845mp) {
        this.f48687k4 = c13845mp;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1849kk
    /* JADX INFO: renamed from: k4 */
    public final C1847du mo9646k4(Object obj, C1850to c1850to) {
        AbstractC3150x6 abstractC3150x6M64934k4;
        C13845mp c13845mp = this.f48687k4;
        if (c13845mp != null && (abstractC3150x6M64934k4 = c13845mp.m64934k4(c1850to.m9647k4())) != null) {
            C3152yj c3152yj = new C3152yj();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = abstractC3150x6M64934k4.read(bArr, 0, 1024);
                    if (i <= 0) {
                        C1847du c1847du = new C1847du(c3152yj.toArray());
                        c3152yj.dispose();
                        return c1847du;
                    }
                    c3152yj.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
        return new C1847du(null);
    }
}
