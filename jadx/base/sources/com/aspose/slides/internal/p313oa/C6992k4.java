package com.aspose.slides.internal.p313oa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6992k4 extends C6986dy {

    /* JADX INFO: renamed from: k4 */
    private Map<k4, double[]> f19028k4 = new HashMap();

    /* JADX INFO: renamed from: com.aspose.slides.internal.oa.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public double[] f19029k4;

        private k4(double[] dArr) {
            double[] dArr2 = new double[dArr.length];
            this.f19029k4 = dArr2;
            System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f19029k4, ((k4) obj).f19029k4);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f19029k4);
        }
    }

    @Override // com.aspose.slides.internal.p313oa.C6986dy
    /* JADX INFO: renamed from: k4 */
    public void mo27338k4(double[] dArr, double[] dArr2) {
        k4 k4Var = new k4(dArr);
        double[] dArr3 = this.f19028k4.get(k4Var);
        if (dArr3 != null) {
            System.arraycopy(dArr3, 0, dArr2, 0, dArr3.length);
            return;
        }
        super.mo27338k4(dArr, dArr2);
        double[] dArr4 = new double[dArr2.length];
        System.arraycopy(dArr2, 0, dArr4, 0, dArr2.length);
        this.f19028k4.put(k4Var, dArr4);
    }

    @Override // com.aspose.slides.internal.p313oa.C6986dy
    /* JADX INFO: renamed from: k4 */
    public void mo27339k4(float[] fArr, float[] fArr2) {
        super.mo27339k4(fArr, fArr2);
    }
}
