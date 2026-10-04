package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p517y2.InterfaceC12762bv;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C5534b3 extends AbstractC5535bv implements InterfaceC12762bv {

    /* JADX INFO: renamed from: k4 */
    private String f15188k4;

    /* JADX INFO: renamed from: x1 */
    private String f15189x1;

    public C5534b3(String str, String str2, C5552rv c5552rv) {
        super(c5552rv);
        this.f15189x1 = str;
        this.f15188k4 = str2;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return mo22612m9();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 7;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22615k4() {
        return this.f15189x1;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        String str = this.f15189x1;
        return str != null ? str : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        return mo22660v4().m22786k4(this.f15189x1, this.f15188k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22616k4(String str) {
        this.f15188k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22617x1() {
        return this.f15188k4;
    }
}
