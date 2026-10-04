package com.aspose.slides.internal.p329p4;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7189m9 extends C7179c5 {

    /* JADX INFO: renamed from: k4 */
    private static final C7189m9[] f19758k4 = new C7189m9[StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5];

    /* JADX INFO: renamed from: x1 */
    private long f19759x1;

    public C7189m9(long j) {
        super(j);
        m27823x1(j);
    }

    /* JADX INFO: renamed from: k4 */
    public static C7189m9 m27821k4() {
        return m27822k4(0L);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m27824x1() {
        return this.f19759x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7189m9 m27822k4(long j) {
        if (-100 > j || j > 256) {
            return new C7189m9(j);
        }
        int i = ((int) j) + 100;
        C7189m9[] c7189m9Arr = f19758k4;
        if (c7189m9Arr[i] == null) {
            c7189m9Arr[i] = new C7189m9(j);
        }
        return c7189m9Arr[i];
    }

    /* JADX INFO: renamed from: x1 */
    private void m27823x1(long j) {
        this.f19759x1 = j;
    }
}
