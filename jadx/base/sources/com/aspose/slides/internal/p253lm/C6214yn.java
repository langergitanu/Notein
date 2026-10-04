package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.yn */
/* JADX INFO: loaded from: classes4.dex */
public final class C6214yn extends C6116bs implements InterfaceC6145j2 {

    /* JADX INFO: renamed from: k4 */
    private double f17582k4;

    public C6214yn(double d, C6116bs c6116bs) {
        super(c6116bs);
        this.f17582k4 = d;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return Double.valueOf(this.f17582k4);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: D_ */
    public Object mo24789D_() {
        return Double.valueOf(this.f17582k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: dy */
    public String mo24770dy() {
        return "number";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return m25192k4(this.f17582k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Number";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67368h4(C14044b3.m66432k4(this.f17582k4, (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return this.f17582k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m25192k4(double d) {
        return d != 0.0d;
    }
}
