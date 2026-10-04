package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class xlm {

    /* JADX INFO: renamed from: k4 */
    private final ada f50152k4;

    /* JADX INFO: renamed from: kk */
    private final wxb f50153kk;

    /* JADX INFO: renamed from: x1 */
    private final Shape f50154x1;

    public xlm(ada adaVar, Shape shape, wxb wxbVar) {
        if (adaVar == null) {
            throw new ArgumentNullException("parser");
        }
        if (shape == null) {
            throw new ArgumentNullException("shape");
        }
        this.f50152k4 = adaVar;
        this.f50154x1 = shape;
        this.f50153kk = wxbVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m73481k4(double d) {
        return C14116yg.m67477k4(d * 57.29577951308232d, 2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m73487kk(String str) {
        if (this.f50152k4.f3885x1.f5055k4 > 0) {
            return;
        }
        this.f50153kk.m72957k4().m69954k4("ODP scewY transform is not implemented", 3);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73488x1(String str) {
        if (this.f50152k4.f3885x1.f5055k4 > 0) {
            return;
        }
        this.f50153kk.m72957k4().m69954k4("ODP scewX transform is not implemented", 3);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m73482k4(float f) {
        return f * 0.017453292f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73489x1(String str, String str2) {
        if (this.f50152k4.f3885x1.f5055k4 > 0) {
            return;
        }
        float x = this.f50154x1.getX();
        float y = this.f50154x1.getY();
        Shape shape = this.f50154x1;
        shape.setX(shape.getX() + ((float) wgi.m72703h4(str)));
        Shape shape2 = this.f50154x1;
        shape2.setY(shape2.getY() + ((float) wgi.m72703h4(str2)));
        if (this.f50154x1.getRotation() != 0.0f && x == 0.0f && y == 0.0f) {
            m73484k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m73483k4(C12025x6 c12025x6, C12025x6 c12025x62, float f) {
        double dM73482k4 = m73482k4(f);
        double dM67470dy = C14116yg.m67470dy(dM73482k4);
        double dM67495m9 = C14116yg.m67495m9(dM73482k4);
        double dM56897x1 = c12025x62.m56897x1() - c12025x6.m56897x1();
        double dM56895kk = c12025x62.m56895kk() - c12025x6.m56895kk();
        return new C12025x6((float) (((dM67470dy * dM56897x1) - (dM67495m9 * dM56895kk)) + ((double) c12025x6.m56897x1())), (float) ((dM67470dy * dM56895kk) + (dM67495m9 * dM56897x1) + ((double) c12025x6.m56895kk())));
    }

    /* JADX INFO: renamed from: k4 */
    private void m73484k4() {
        C12025x6 c12025x6Clone = m73483k4(new C12025x6(this.f50154x1.getFrame().getCenterX(), this.f50154x1.getFrame().getCenterY()), new C12025x6(this.f50154x1.getX(), this.f50154x1.getY()), this.f50154x1.getRotation() - 180.0f).Clone();
        this.f50154x1.setX(c12025x6Clone.m56897x1() - (this.f50154x1.getRotation() == 180.0f ? this.f50154x1.getWidth() / 2.0f : this.f50154x1.getWidth()));
        this.f50154x1.setY(c12025x6Clone.m56895kk() - (this.f50154x1.getRotation() == 180.0f ? this.f50154x1.getHeight() / 2.0f : this.f50154x1.getHeight()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73485k4(String str) {
        if (this.f50152k4.f3885x1.f5055k4 > 0) {
            return;
        }
        this.f50154x1.setRotation((float) m73481k4(C14044b3.m66428k4(str, C11697x1.m55250kk()) * (-1.0d)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73486k4(String str, String str2) {
        if (this.f50152k4.f3885x1.f5055k4 > 0) {
            return;
        }
        this.f50153kk.m72957k4().m69954k4("ODP scale transform is not implemented", 3);
    }
}
