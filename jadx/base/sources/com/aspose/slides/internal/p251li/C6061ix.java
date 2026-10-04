package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C6061ix extends AbstractC6084u4 {

    /* JADX INFO: renamed from: du */
    private String f17173du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f17174h4;

    /* JADX INFO: renamed from: k4 */
    private int f17175k4;

    /* JADX INFO: renamed from: kk */
    private int f17176kk;

    /* JADX INFO: renamed from: to */
    private C4616ca f17177to;

    /* JADX INFO: renamed from: x1 */
    private int f17178x1;

    public C6061ix() {
        this.f17174h4 = new byte[0];
        m24449x1((short) 16412);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24518c5() {
        return this.f17178x1;
    }

    /* JADX INFO: renamed from: ck */
    public final C4616ca m24519ck() {
        return this.f17177to;
    }

    /* JADX INFO: renamed from: du */
    public final void m24520du(int i) {
        this.f17176kk = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m24521dy() {
        return this.f17175k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24527k4((C6061ix) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final String m24522fa() {
        return this.f17173du;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return (m24523jd() * 2) + this.f17177to.mo19017h4() + 12 + m24532up().length;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = ((((this.f17175k4 * 397) ^ this.f17178x1) * 397) ^ this.f17176kk) * 397;
        C4616ca c4616ca = this.f17177to;
        int iHashCode = (i ^ (c4616ca != null ? c4616ca.hashCode() : 0)) * 397;
        String str = this.f17173du;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr = this.f17174h4;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m24523jd() {
        return this.f17176kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24524k4(C4616ca c4616ca) {
        this.f17177to = c4616ca;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24528kk(int i) {
        this.f17175k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24530to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushId: {1}, FormatId: {2}, Length: {3}, LayoutRect: {4}, StringData: {5}, AlignmentPadding: {6}", super.toString(), Integer.valueOf(this.f17175k4), Integer.valueOf(this.f17178x1), Integer.valueOf(this.f17176kk), this.f17177to, this.f17173du, Integer.valueOf(this.f17174h4.length));
    }

    /* JADX INFO: renamed from: up */
    public final byte[] m24532up() {
        return this.f17174h4;
    }

    public C6061ix(C6045bz c6045bz) {
        super(c6045bz);
        this.f17174h4 = new byte[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24525k4(String str) {
        this.f17173du = str;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24529kk() {
        return m24433h4(15);
    }

    /* JADX INFO: renamed from: to */
    public final void m24531to(int i) {
        this.f17178x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24526k4(byte[] bArr) {
        this.f17174h4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24527k4(C6061ix c6061ix) {
        return this.f17175k4 == c6061ix.f17175k4 && this.f17178x1 == c6061ix.f17178x1 && this.f17176kk == c6061ix.f17176kk && C14067j2.m66728k4(this.f17177to, c6061ix.f17177to) && C14113y2.m67363du(this.f17173du, c6061ix.f17173du) && C12530dy.m58330k4(this.f17174h4, c6061ix.f17174h4);
    }
}
