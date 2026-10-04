package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ep */
/* JADX INFO: loaded from: classes3.dex */
class C0959ep implements Comparable<C0959ep> {

    /* JADX INFO: renamed from: k4 */
    private String f4842k4;

    /* JADX INFO: renamed from: kk */
    private int f4843kk;

    /* JADX INFO: renamed from: x1 */
    private int f4844x1;

    public C0959ep(String str, int i) {
        this.f4842k4 = str;
        this.f4844x1 = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0959ep)) {
            return C14113y2.m67363du(m5609k4(), ((C0959ep) obj).m5609k4());
        }
        return false;
    }

    public int hashCode() {
        return this.f4842k4.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0959ep c0959ep) {
        if (c0959ep.m5612x1() == m5612x1()) {
            return 0;
        }
        return c0959ep.m5612x1() > m5612x1() ? 1 : -1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m5611kk() {
        return this.f4843kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m5612x1() {
        return this.f4844x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m5609k4() {
        return this.f4842k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5613x1(int i) {
        this.f4843kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5610k4(int i) {
        this.f4844x1 = i;
    }
}
