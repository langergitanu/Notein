package com.aspose.slides.internal.p253lm;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.up */
/* JADX INFO: loaded from: classes4.dex */
public final class C6189up extends C6116bs implements InterfaceC6145j2 {

    /* JADX INFO: renamed from: k4 */
    private boolean f17503k4;

    public C6189up(boolean z, C6116bs c6116bs) {
        super(c6116bs);
        this.f17503k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m25071k4(boolean z) {
        return z ? 1.0d : 0.0d;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return Boolean.valueOf(this.f17503k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: dy */
    public String mo24770dy() {
        return "boolean";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Boolean";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return this.f17503k4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return m25071k4(this.f17503k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return this.f17503k4;
    }
}
