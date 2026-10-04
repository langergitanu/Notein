package com.aspose.slides.internal.p213jw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12787x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C5562x6 extends AbstractC5535bv implements InterfaceC12787x6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5535bv f15317k4;

    public C5562x6(C5552rv c5552rv) {
        if (c5552rv == null) {
            throw new ArgumentException();
        }
        super.m22629du((AbstractC5535bv) c5552rv);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 11;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: k4 */
    public void mo22639k4(AbstractC5535bv abstractC5535bv) {
        this.f15317k4 = abstractC5535bv;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return mo22660v4().f15275kk;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: um */
    public AbstractC5535bv mo22658um() {
        return this.f15317k4;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        return mo22660v4().m22798ks();
    }
}
