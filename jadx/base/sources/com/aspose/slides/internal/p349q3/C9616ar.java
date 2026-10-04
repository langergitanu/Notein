package com.aspose.slides.internal.p349q3;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p488x0.C12349up;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C9616ar extends AbstractC9629ca {

    /* JADX INFO: renamed from: du */
    private byte[] f34773du;

    /* JADX INFO: renamed from: k4 */
    private long f34774k4;

    /* JADX INFO: renamed from: kk */
    private long f34775kk;

    /* JADX INFO: renamed from: to */
    private long f34776to;

    /* JADX INFO: renamed from: x1 */
    private C12349up f34777x1;

    public C9616ar(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m46956k4((C9616ar) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m46950h4() {
        return this.f34773du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f34774k4)) * 397;
        C12349up c12349up = this.f34777x1;
        int iHashCode2 = (((((iHashCode ^ (c12349up != null ? c12349up.hashCode() : 0)) * 397) ^ ((int) this.f34775kk)) * 397) ^ ((int) this.f34776to)) * 397;
        byte[] bArr = this.f34773du;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m46951k4() {
        return this.f34774k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m46957kk() {
        return this.f34775kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m46959to() {
        return this.f34776to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12349up m46960x1() {
        return this.f34777x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m46952k4(C3585h4 c3585h4) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public final void m46958kk(long j) {
        this.f34776to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46961x1(long j) {
        this.f34775kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46953k4(long j) {
        this.f34774k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46954k4(C12349up c12349up) {
        this.f34777x1 = c12349up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46955k4(byte[] bArr) {
        this.f34773du = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46956k4(C9616ar c9616ar) {
        return m47765k4((C9723vw) c9616ar) && this.f34774k4 == c9616ar.f34774k4 && C14067j2.m66728k4(this.f34777x1, c9616ar.f34777x1) && this.f34775kk == c9616ar.f34775kk && this.f34776to == c9616ar.f34776to && C12530dy.m58330k4(this.f34773du, c9616ar.f34773du);
    }
}
