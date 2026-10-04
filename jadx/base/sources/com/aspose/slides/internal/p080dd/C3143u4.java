package com.aspose.slides.internal.p080dd;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p395sa.AbstractC10169x1;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14115yd;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.u4 */
/* JADX INFO: loaded from: classes3.dex */
class C3143u4 extends AbstractC10169x1 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ byte[] f9308k4;

    /* JADX INFO: renamed from: kk */
    final /* synthetic */ int f9309kk;

    /* JADX INFO: renamed from: to */
    final /* synthetic */ AbstractC3150x6.k4 f9310to;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ int f9311x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3143u4(AbstractC3150x6.k4 k4Var, AbstractC14115yd abstractC14115yd, AbstractC14078m9 abstractC14078m9, Object obj, byte[] bArr, int i, int i2) {
        super(abstractC14115yd, abstractC14078m9, obj);
        this.f9310to = k4Var;
        this.f9308k4 = bArr;
        this.f9311x1 = i;
        this.f9309kk = i2;
    }

    @Override // com.aspose.slides.internal.p395sa.AbstractC10169x1
    public void beginInvoke() {
        AbstractC3150x6.k4 k4Var = this.f9310to;
        k4Var.pushResult(Integer.valueOf(k4Var.mo13394k4(this.f9308k4, this.f9311x1, this.f9309kk)));
    }
}
