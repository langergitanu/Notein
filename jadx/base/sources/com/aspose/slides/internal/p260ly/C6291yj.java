package com.aspose.slides.internal.p260ly;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6291yj extends AbstractC6280ne {

    /* JADX INFO: renamed from: k4 */
    private int f17898k4;

    /* JADX INFO: renamed from: kk */
    private C6278ks[] f17899kk;

    /* JADX INFO: renamed from: to */
    private int[] f17900to;

    /* JADX INFO: renamed from: x1 */
    private int f17901x1;

    /* JADX INFO: renamed from: h4 */
    private void m25729h4() {
        this.f17899kk = new C6278ks[this.f17900to.length];
        int i = 0;
        while (true) {
            C6278ks[] c6278ksArr = this.f17899kk;
            if (i >= c6278ksArr.length) {
                return;
            }
            c6278ksArr[i] = new C6278ks(this.f17900to[i]);
            i++;
        }
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
        return m25733k4((C6291yj) obj);
    }

    public int hashCode() {
        int iM67061k4 = ((C14081nv.m67061k4(this.f17898k4) * 397) ^ C14081nv.m67061k4(this.f17901x1)) * 397;
        C6278ks[] c6278ksArr = this.f17899kk;
        int iHashCode = (iM67061k4 ^ (c6278ksArr != null ? AbstractC14092to.m67208k4((Object) c6278ksArr).hashCode() : 0)) * 397;
        int[] iArr = this.f17900to;
        return iHashCode ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25730k4() {
        return this.f17898k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m25734kk() {
        return this.f17900to;
    }

    /* JADX INFO: renamed from: to */
    public final C6278ks[] m25735to() {
        if (this.f17899kk == null) {
            m25729h4();
        }
        return this.f17899kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m25736x1() {
        return this.f17901x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25731k4(int i) {
        if ((65535 & i) != 768) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17898k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25737x1(int i) {
        this.f17901x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25732k4(int[] iArr) {
        if (this.f17900to != iArr) {
            this.f17899kk = null;
        }
        this.f17900to = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25733k4(C6291yj c6291yj) {
        return this.f17898k4 == c6291yj.f17898k4 && this.f17901x1 == c6291yj.f17901x1 && C14067j2.m66728k4(this.f17899kk, c6291yj.f17899kk) && C14067j2.m66728k4(this.f17900to, c6291yj.f17900to);
    }
}
