package com.aspose.slides.internal.p297ne;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p478wl.C12139lr;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ne.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6884yj {

    /* JADX INFO: renamed from: k4 */
    public static final C11697x1 f18824k4 = new C11697x1("en-US");

    /* JADX INFO: renamed from: kk */
    private float f18825kk;

    /* JADX INFO: renamed from: x1 */
    private int f18826x1;

    public C6884yj(float f, int i) {
        this.f18825kk = f;
        this.f18826x1 = i;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C6884yj c6884yj = (C6884yj) C7019kk.m27452k4(obj, C6884yj.class);
        if (C14067j2.m66729x1(null, c6884yj)) {
            return false;
        }
        return m26947k4(c6884yj);
    }

    public int hashCode() {
        return (C14042ak.m66409k4(this.f18826x1) * 397) ^ C14064he.m66708k4(this.f18825kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m26946k4() {
        return this.f18826x1;
    }

    public String toString() {
        return C14113y2.m67391k4(f18824k4, "{0}{1}", Float.valueOf(m26948x1()), C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12139lr.class), m26946k4()));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m26948x1() {
        return this.f18825kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m26947k4(C6884yj c6884yj) {
        if (C14067j2.m66729x1(null, c6884yj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c6884yj)) {
            return true;
        }
        return C14067j2.m66728k4(Integer.valueOf(c6884yj.f18826x1), Integer.valueOf(this.f18826x1)) && C14064he.m66718x1(c6884yj.f18825kk, this.f18825kk);
    }
}
