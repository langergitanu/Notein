package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p472w8.C11901k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6892k4 extends C6893kk {
    @Override // com.aspose.slides.internal.p298nh.C6893kk
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m27006k4((C6892k4) obj);
    }

    @Override // com.aspose.slides.internal.p298nh.C6893kk
    public int hashCode() {
        return this.f18841k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27005k4() {
        return ((C11901k4) this.f18841k4).m55665x1();
    }

    /* JADX INFO: renamed from: kk */
    public final float m27007kk() {
        return ((C11901k4) this.f18841k4).m55661kk();
    }

    /* JADX INFO: renamed from: to */
    public final float m27008to() {
        return ((C11901k4) this.f18841k4).m55663to();
    }

    public String toString() {
        return C14113y2.m67402k4("Filled: {0}, Height: {1}, MiddleInset: {2}, Width: {3}", Boolean.valueOf(m27005k4()), Float.valueOf(m27009x1()), Float.valueOf(m27007kk()), Float.valueOf(m27008to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m27009x1() {
        return ((C11901k4) this.f18841k4).m55658k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27006k4(C6892k4 c6892k4) {
        return this.f18841k4.equals(c6892k4.f18841k4);
    }
}
