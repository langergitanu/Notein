package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C12350uz extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private int f41303k4;

    /* JADX INFO: renamed from: kk */
    private int f41304kk;

    /* JADX INFO: renamed from: to */
    private int f41305to;

    /* JADX INFO: renamed from: x1 */
    private int f41306x1;

    public C12350uz() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C12007ix m57841c5() {
        return C12007ix.m56544k4(m57842dy());
    }

    /* JADX INFO: renamed from: dy */
    public final C12014ne m57842dy() {
        return C12014ne.m56654k4(this.f41303k4, this.f41306x1, this.f41304kk, this.f41305to);
    }

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
        return m57846k4((C12350uz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m57843h4() {
        return this.f41304kk - this.f41303k4;
    }

    public int hashCode() {
        return (((((this.f41303k4 * 397) ^ this.f41306x1) * 397) ^ this.f41304kk) * 397) ^ this.f41305to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57844k4() {
        return this.f41303k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57847kk() {
        return this.f41304kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m57849m9() {
        return this.f41305to - this.f41306x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m57850to() {
        return this.f41305to;
    }

    public String toString() {
        return C14113y2.m67402k4("[Left: {0}, Top: {1}, Right: {2}, Bottom: {3}]", Integer.valueOf(this.f41303k4), Integer.valueOf(this.f41306x1), Integer.valueOf(this.f41304kk), Integer.valueOf(this.f41305to));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57852x1() {
        return this.f41306x1;
    }

    public C12350uz(int i, int i2, int i3, int i4) {
        this.f41303k4 = i;
        this.f41306x1 = i2;
        this.f41304kk = i3;
        this.f41305to = i4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57845k4(int i) {
        this.f41303k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57848kk(int i) {
        this.f41304kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m57851to(int i) {
        this.f41305to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57853x1(int i) {
        this.f41306x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57846k4(C12350uz c12350uz) {
        return this.f41303k4 == c12350uz.f41303k4 && this.f41306x1 == c12350uz.f41306x1 && this.f41304kk == c12350uz.f41304kk && this.f41305to == c12350uz.f41305to;
    }
}
