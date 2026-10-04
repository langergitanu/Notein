package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C4660u4 extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private byte[] f13008k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13009kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13010to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13011x1;

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
        return m19366k4((C4660u4) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 1024;
    }

    public int hashCode() {
        return ((((((m19367k4() != null ? AbstractC14092to.m67208k4((Object) m19367k4()).hashCode() : 0) * 397) ^ (m19373x1() != null ? AbstractC14092to.m67208k4((Object) m19373x1()).hashCode() : 0)) * 397) ^ (m19369kk() != null ? AbstractC14092to.m67208k4((Object) m19369kk()).hashCode() : 0)) * 397) ^ (m19371to() != null ? AbstractC14092to.m67208k4((Object) m19371to()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19365k4(byte[] bArr) {
        this.f13008k4 = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19368kk(byte[] bArr) {
        this.f13009kk = bArr;
    }

    /* JADX INFO: renamed from: to */
    public final void m19370to(byte[] bArr) {
        this.f13010to = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19372x1(byte[] bArr) {
        this.f13011x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19366k4(C4660u4 c4660u4) {
        return C12530dy.m58330k4(m19367k4(), c4660u4.m19367k4()) && C12530dy.m58330k4(m19373x1(), c4660u4.m19373x1()) && C12530dy.m58330k4(m19369kk(), c4660u4.m19369kk()) && C12530dy.m58330k4(m19371to(), c4660u4.m19371to());
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m19369kk() {
        return this.f13009kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m19371to() {
        return this.f13010to;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m19373x1() {
        return this.f13011x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m19367k4() {
        return this.f13008k4;
    }
}
