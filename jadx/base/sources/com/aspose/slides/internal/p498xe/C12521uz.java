package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C12521uz extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private int f41927k4;

    /* JADX INFO: renamed from: kk */
    private int f41928kk;

    /* JADX INFO: renamed from: to */
    private int f41929to;

    /* JADX INFO: renamed from: x1 */
    private int f41930x1;

    /* JADX INFO: renamed from: c5 */
    public final C12007ix m58248c5() {
        return C12007ix.m56544k4(m58249dy());
    }

    /* JADX INFO: renamed from: dy */
    public final C12014ne m58249dy() {
        return C12014ne.m56654k4(this.f41927k4, this.f41930x1, this.f41928kk, this.f41929to);
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
        return m58253k4((C12521uz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m58250h4() {
        return this.f41928kk - this.f41927k4;
    }

    public int hashCode() {
        return (((((this.f41927k4 * 397) ^ this.f41930x1) * 397) ^ this.f41928kk) * 397) ^ this.f41929to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58251k4() {
        return this.f41927k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m58254kk() {
        return this.f41928kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m58256m9() {
        return this.f41929to - this.f41930x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m58257to() {
        return this.f41929to;
    }

    public String toString() {
        return C14113y2.m67402k4("[Left: {0}, Top: {1}, Right: {2}, Bottom: {3}]", Integer.valueOf(this.f41927k4), Integer.valueOf(this.f41930x1), Integer.valueOf(this.f41928kk), Integer.valueOf(this.f41929to));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58259x1() {
        return this.f41930x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58252k4(int i) {
        this.f41927k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58255kk(int i) {
        this.f41928kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m58258to(int i) {
        this.f41929to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58260x1(int i) {
        this.f41930x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58253k4(C12521uz c12521uz) {
        return this.f41927k4 == c12521uz.f41927k4 && this.f41930x1 == c12521uz.f41930x1 && this.f41928kk == c12521uz.f41928kk && this.f41929to == c12521uz.f41929to;
    }
}
