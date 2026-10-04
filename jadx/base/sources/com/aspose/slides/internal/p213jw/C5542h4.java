package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5542h4 extends AbstractC5558v4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5535bv f15228k4;

    public C5542h4(AbstractC5535bv abstractC5535bv) {
        this.f15228k4 = abstractC5535bv;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, java.lang.Iterable
    public IGenericEnumerator<InterfaceC12777qq> iterator() {
        return new C5549m9(this.f15228k4);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public int mo20312k4() {
        int i = 0;
        for (AbstractC5535bv abstractC5535bvMo22653ss = this.f15228k4.mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12777qq mo20314k4(int i) {
        if (i < 0) {
            return null;
        }
        AbstractC5535bv abstractC5535bvMo22653ss = this.f15228k4.mo22653ss();
        while (abstractC5535bvMo22653ss != null) {
            if (i == 0) {
                return abstractC5535bvMo22653ss;
            }
            abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8();
            i--;
        }
        return null;
    }
}
