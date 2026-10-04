package com.aspose.slides.internal.p123f5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.f5.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3857k4 {

    /* JADX INFO: renamed from: k4 */
    private C12014ne f10570k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f10571x1;

    public C3857k4() {
        this.f10570k4 = new C12014ne();
        this.f10571x1 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3857k4 m15542k4(int i, int i2, int i3, int i4) {
        return new C3857k4(C12014ne.m56654k4(i, i2, i3, i4).Clone());
    }

    /* JADX INFO: renamed from: kk */
    public static C3857k4 m15543kk() {
        return new C3857k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m15546x1() {
        return this.f10571x1;
    }

    public C3857k4(int i, int i2, int i3, int i4) {
        this(new C12014ne(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m15544k4() {
        return this.f10570k4;
    }

    public C3857k4(C12014ne c12014ne) {
        C12014ne c12014ne2 = new C12014ne();
        this.f10570k4 = c12014ne2;
        this.f10571x1 = false;
        c12014ne.CloneTo(c12014ne2);
        this.f10571x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15545k4(C12014ne c12014ne) {
        if (!m15546x1()) {
            throw new ArgumentException("Use constructor");
        }
        c12014ne.CloneTo(this.f10570k4);
    }
}
