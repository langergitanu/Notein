package com.aspose.slides.internal.p019ac;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C1360yj extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private int f5912k4;

    /* JADX INFO: renamed from: kk */
    private C1347ks[] f5913kk;

    /* JADX INFO: renamed from: to */
    private int[] f5914to;

    /* JADX INFO: renamed from: x1 */
    private int f5915x1;

    /* JADX INFO: renamed from: to */
    private void m8054to() {
        this.f5913kk = new C1347ks[this.f5914to.length];
        int i = 0;
        while (true) {
            C1347ks[] c1347ksArr = this.f5913kk;
            if (i >= c1347ksArr.length) {
                return;
            }
            c1347ksArr[i] = new C1347ks(this.f5914to[i]);
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
        return m8058k4((C1360yj) obj);
    }

    public int hashCode() {
        int iM67061k4 = ((C14081nv.m67061k4(this.f5912k4) * 397) ^ C14081nv.m67061k4(this.f5915x1)) * 397;
        C1347ks[] c1347ksArr = this.f5913kk;
        int iHashCode = (iM67061k4 ^ (c1347ksArr != null ? AbstractC14092to.m67208k4((Object) c1347ksArr).hashCode() : 0)) * 397;
        int[] iArr = this.f5914to;
        return iHashCode ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8055k4() {
        return this.f5915x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C1347ks[] m8059kk() {
        if (this.f5913kk == null) {
            m8054to();
        }
        return this.f5913kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8060x1(int i) {
        this.f5915x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8056k4(int i) {
        if ((65535 & i) != 768) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f5912k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m8061x1() {
        return this.f5914to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8057k4(int[] iArr) {
        if (this.f5914to != iArr) {
            this.f5913kk = null;
        }
        this.f5914to = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8058k4(C1360yj c1360yj) {
        return this.f5912k4 == c1360yj.f5912k4 && this.f5915x1 == c1360yj.f5915x1 && C14067j2.m66728k4(this.f5913kk, c1360yj.f5913kk) && C14067j2.m66728k4(this.f5914to, c1360yj.f5914to);
    }
}
