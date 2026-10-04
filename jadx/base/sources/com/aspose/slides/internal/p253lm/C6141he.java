package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.he */
/* JADX INFO: loaded from: classes4.dex */
public final class C6141he extends C6116bs implements InterfaceC6145j2 {

    /* JADX INFO: renamed from: k4 */
    private String f17350k4;

    public C6141he(String str, C6116bs c6116bs) {
        super(c6116bs);
        this.f17350k4 = str;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m24844h4(String str) {
        if (str == null) {
            return false;
        }
        return TelemetryEventStrings.Value.TRUE.equals(str) || str.length() > 0;
    }

    /* JADX INFO: renamed from: m9 */
    public static double m24845m9(String str) {
        if (str == null) {
            return Double.NaN;
        }
        double[] dArr = {0.0d};
        boolean zM66435k4 = C14044b3.m66435k4(str, 32, C11697x1.m55250kk(), dArr);
        double d = dArr[0];
        if (zM66435k4) {
            return d;
        }
        return Double.NaN;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return this.f17350k4;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: ak */
    public String mo24790ak() {
        return this.f17350k4 == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : C14113y2.m67408k4("'", toString(), "'");
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: dy */
    public String mo24770dy() {
        return "string";
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    public int hashCode() {
        return this.f17350k4.hashCode();
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return m24844h4(this.f17350k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "String";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return this.f17350k4;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return m24845m9(this.f17350k4);
    }
}
