package com.aspose.slides.internal.p329p4;

import com.aspose.slides.p559ms.System.C14051ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7192x1 extends C7185jd {

    /* JADX INFO: renamed from: k4 */
    private boolean f19769k4;

    private C7192x1(boolean z) {
        m27850k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public static C7192x1 m27848k4() {
        return new C7192x1(true);
    }

    /* JADX INFO: renamed from: x1 */
    public static C7192x1 m27851x1() {
        return new C7192x1(false);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m27852kk() {
        return this.f19769k4;
    }

    public String toString() {
        return C14051ck.m66557x1(m27852kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C7192x1 m27849k4(String str) {
        boolean[] zArr = {false};
        boolean zM66556k4 = C14051ck.m66556k4(str, zArr);
        boolean z = zArr[0];
        if (zM66556k4) {
            return z ? m27848k4() : m27851x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27850k4(boolean z) {
        this.f19769k4 = z;
    }
}
