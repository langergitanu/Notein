package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11533h4 extends AbstractC5788h4 {

    /* JADX INFO: renamed from: k4 */
    private short f39024k4;

    /* JADX INFO: renamed from: x1 */
    private String f39025x1;

    public C11533h4(InterfaceC9933up interfaceC9933up) {
        super((short) 3);
        this.f39024k4 = interfaceC9933up.mo48850k4();
        this.f39025x1 = interfaceC9933up.mo48784c5();
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return this.f39025x1;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 9);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11533h4 c11533h4 = (C11533h4) C7019kk.m27452k4((Object) abstractC5788h4, C11533h4.class);
        if (C14067j2.m66729x1(null, c11533h4)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11533h4)) {
            return true;
        }
        short s = this.f39024k4;
        return C14088s7.m67181x1(s, s);
    }
}
