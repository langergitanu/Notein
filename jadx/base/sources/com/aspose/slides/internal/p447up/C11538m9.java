package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11538m9 extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    private float f39029k4;

    /* JADX INFO: renamed from: x1 */
    private String f39030x1;

    public C11538m9(float f, String str) {
        super((short) 18);
        this.f39029k4 = f;
        this.f39030x1 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return C14113y2.m67408k4(C14064he.m66711k4(this.f39029k4, (InterfaceC14073kp) C6344m9.f18038k4), this.f39030x1);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: k4 */
    public float mo23699k4(short s) {
        return this.f39029k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11538m9 c11538m9 = (C11538m9) C7019kk.m27452k4((Object) abstractC5788h4, C11538m9.class);
        if (C14067j2.m66729x1(null, c11538m9)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11538m9)) {
            return true;
        }
        return C14088s7.m67181x1(m23417m9(), c11538m9.m23417m9()) && C14064he.m66718x1(this.f39029k4, c11538m9.f39029k4);
    }
}
