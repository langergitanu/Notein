package com.aspose.slides.internal.p441ui;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.ui.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11316k4 {

    /* JADX INFO: renamed from: k4 */
    private C12014ne f38984k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f38985x1;

    public C11316k4() {
        this.f38984k4 = new C12014ne();
        this.f38985x1 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11316k4 m54470k4(int i, int i2, int i3, int i4) {
        return new C11316k4(C12014ne.m56654k4(i, i2, i3, i4).Clone());
    }

    /* JADX INFO: renamed from: kk */
    public static C11316k4 m54471kk() {
        return new C11316k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m54474x1() {
        return this.f38985x1;
    }

    public C11316k4(int i, int i2, int i3, int i4) {
        this(new C12014ne(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m54472k4() {
        return this.f38984k4;
    }

    public C11316k4(C12014ne c12014ne) {
        C12014ne c12014ne2 = new C12014ne();
        this.f38984k4 = c12014ne2;
        this.f38985x1 = false;
        c12014ne.CloneTo(c12014ne2);
        this.f38985x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54473k4(C12014ne c12014ne) {
        if (!m54474x1()) {
            throw new ArgumentException("Use constructor");
        }
        c12014ne.CloneTo(this.f38984k4);
    }
}
