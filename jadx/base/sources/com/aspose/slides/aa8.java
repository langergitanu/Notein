package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Stack;

/* JADX INFO: loaded from: classes3.dex */
class aa8 {

    /* JADX INFO: renamed from: k4 */
    private int f3868k4;

    /* JADX INFO: renamed from: kk */
    private Stack<Boolean> f3869kk = new Stack<>();

    /* JADX INFO: renamed from: x1 */
    private boolean f3870x1;

    /* JADX INFO: renamed from: k4 */
    public final int m3458k4() {
        return this.f3868k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m3461kk() {
        return this.f3869kk.pop().booleanValue();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m3462to() {
        return this.f3870x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3463x1(boolean z) {
        this.f3870x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3459k4(int i) {
        this.f3868k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m3464x1() {
        return this.f3869kk.peek().booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3460k4(boolean z) {
        this.f3869kk.push(Boolean.valueOf(z));
    }
}
