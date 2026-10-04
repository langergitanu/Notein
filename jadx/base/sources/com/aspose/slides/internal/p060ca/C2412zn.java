package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.zn */
/* JADX INFO: loaded from: classes3.dex */
class C2412zn {

    /* JADX INFO: renamed from: k4 */
    protected C2317u4 f8358k4;

    /* JADX INFO: renamed from: x1 */
    protected int f8359x1 = -1;

    public C2412zn(C2317u4 c2317u4) {
        this.f8358k4 = c2317u4;
    }

    /* JADX INFO: renamed from: dy */
    public final C2317u4 m11829dy() {
        return this.f8358k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m11830h4() {
        if (this.f8359x1 >= this.f8358k4.m11477x1() - 1) {
            return false;
        }
        this.f8359x1++;
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m11831m9() {
        return this.f8359x1;
    }
}
