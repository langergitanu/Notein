package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6270du;
import com.aspose.slides.internal.p260ly.C6273h4;
import com.aspose.slides.internal.p260ly.C6281qq;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.rs */
/* JADX INFO: loaded from: classes4.dex */
public class C9699rs {

    /* JADX INFO: renamed from: k4 */
    private C6281qq[] f35079k4;

    /* JADX INFO: renamed from: kk */
    private C6273h4[] f35080kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35081to;

    /* JADX INFO: renamed from: x1 */
    private C6270du[] f35082x1;

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
        return m47618k4((C9699rs) obj);
    }

    public int hashCode() {
        C6281qq[] c6281qqArr = this.f35079k4;
        int iHashCode = (c6281qqArr != null ? AbstractC14092to.m67208k4((Object) c6281qqArr).hashCode() : 0) * 397;
        C6270du[] c6270duArr = this.f35082x1;
        int iHashCode2 = (iHashCode ^ (c6270duArr != null ? AbstractC14092to.m67208k4((Object) c6270duArr).hashCode() : 0)) * 397;
        C6273h4[] c6273h4Arr = this.f35080kk;
        int iHashCode3 = (iHashCode2 ^ (c6273h4Arr != null ? AbstractC14092to.m67208k4((Object) c6273h4Arr).hashCode() : 0)) * 397;
        byte[] bArr = this.f35081to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47614k4(byte[] bArr) {
        this.f35081to = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final C6273h4[] m47620kk() {
        return this.f35080kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47621to() {
        return this.f35081to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6270du[] m47622x1() {
        return this.f35082x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47615k4(C6270du[] c6270duArr) {
        this.f35082x1 = c6270duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47616k4(C6273h4[] c6273h4Arr) {
        this.f35080kk = c6273h4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47617k4(C6281qq[] c6281qqArr) {
        this.f35079k4 = c6281qqArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47618k4(C9699rs c9699rs) {
        return C12530dy.m58334k4(this.f35079k4, c9699rs.f35079k4) && C12530dy.m58334k4(this.f35082x1, c9699rs.f35082x1) && C12530dy.m58334k4(this.f35080kk, c9699rs.f35080kk) && C12530dy.m58330k4(this.f35081to, c9699rs.f35081to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6281qq[] m47619k4() {
        return this.f35079k4;
    }
}
