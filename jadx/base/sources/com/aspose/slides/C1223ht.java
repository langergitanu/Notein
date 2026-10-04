package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.ht */
/* JADX INFO: loaded from: classes3.dex */
class C1223ht {

    /* JADX INFO: renamed from: k4 */
    private Shape f5571k4;

    /* JADX INFO: renamed from: x1 */
    private you f5572x1;

    public C1223ht(Shape shape, float f) {
        if (shape == null) {
            throw new ArgumentNullException("shape");
        }
        m7286k4(new you(f, true));
        m7287x1(shape);
    }

    /* JADX INFO: renamed from: k4 */
    public final Shape m7288k4() {
        return this.f5571k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final you m7290x1() {
        return this.f5572x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m7286k4(you youVar) {
        this.f5572x1 = youVar;
    }

    /* JADX INFO: renamed from: x1 */
    private void m7287x1(Shape shape) {
        this.f5571k4 = shape;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7289k4(Shape shape) {
        if (shape != m7288k4() || m7290x1() == null) {
            return false;
        }
        m7290x1().m73965kk();
        m7286k4((you) null);
        return true;
    }
}
