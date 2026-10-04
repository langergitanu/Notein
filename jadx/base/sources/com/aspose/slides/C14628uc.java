package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.uc */
/* JADX INFO: loaded from: classes3.dex */
class C14628uc {

    /* JADX INFO: renamed from: k4 */
    private double f49302k4;

    /* JADX INFO: renamed from: x1 */
    private double f49303x1;

    public C14628uc(double d) {
        if (d <= 0.0d) {
            throw new ArgumentOutOfRangeException("frameRatePeriod");
        }
        m71649x1(d);
        this.f49302k4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71649x1(double d) {
        this.f49303x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m71650k4() {
        return this.f49303x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m71651k4(double d) {
        int i = 0;
        if (d < 0.0d) {
            return 0;
        }
        while (true) {
            double dM71650k4 = (this.f49302k4 + d) - (m71650k4() * ((double) i));
            if (m71650k4() >= dM71650k4) {
                this.f49302k4 = dM71650k4;
                return i;
            }
            i++;
        }
    }
}
