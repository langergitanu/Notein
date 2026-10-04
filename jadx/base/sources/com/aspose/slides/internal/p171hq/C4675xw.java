package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p047bu.C1853kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10205v4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.xw */
/* JADX INFO: loaded from: classes.dex */
public final class C4675xw extends AbstractC4615c6 {

    /* JADX INFO: renamed from: du */
    private byte[] f13060du;

    /* JADX INFO: renamed from: h4 */
    private short f13061h4;

    /* JADX INFO: renamed from: k4 */
    private long f13062k4;

    /* JADX INFO: renamed from: kk */
    private C4657to[] f13063kk;

    /* JADX INFO: renamed from: to */
    private C4657to[] f13064to;

    /* JADX INFO: renamed from: x1 */
    private short f13065x1;

    /* JADX INFO: renamed from: du */
    public final C4657to[] m19485du() {
        return this.f13064to;
    }

    /* JADX INFO: renamed from: dy */
    public final C11896dy m19486dy() {
        byte[] bArr = new byte[m19485du().length];
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), m19492kk().length));
        for (int i = 0; i < m19485du().length; i++) {
            bArr[i] = (byte) ((C4650qw) m19485du()[i]).m19318x1();
        }
        for (int i2 = 0; i2 < m19492kk().length; i2++) {
            m19492kk()[i2].mo19089k4().CloneTo(c12025x6Arr[i2]);
        }
        C11896dy c11896dy = new C11896dy(c12025x6Arr, bArr);
        c11896dy.m55537k4(C1853kk.m9663k4(m19495x1(), 13) ? 1 : 0);
        return c11896dy;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4675xw.class) && m19484k4((C4675xw) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        int length = 12;
        if ((this.f13062k4 & 4294967295L) > 0) {
            C4657to[] c4657toArr = this.f13063kk;
            if (c4657toArr.length > 0) {
                length = 12 + (C7019kk.m27469x1(c4657toArr[0], C4622em.class) ? this.f13063kk.length * 4 : this.f13063kk.length * 8);
            }
        }
        C4657to[] c4657toArr2 = this.f13064to;
        if (c4657toArr2 != null && c4657toArr2.length > 0) {
            if (C7019kk.m27469x1(c4657toArr2[0], C4650qw.class)) {
                length += this.f13064to.length;
            } else if (C7019kk.m27469x1(this.f13064to[0], C4658tq.class)) {
                length += this.f13064to.length * 2;
            }
        }
        int i = length % 4;
        if (i == 0) {
            return length;
        }
        byte[] bArr = new byte[4 - i];
        this.f13060du = bArr;
        return length + bArr.length;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f13062k4)) * 397) ^ this.f13065x1) * 397;
        C4657to[] c4657toArr = this.f13063kk;
        int iHashCode2 = (iHashCode ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0)) * 397;
        C4657to[] c4657toArr2 = this.f13064to;
        int iHashCode3 = (iHashCode2 ^ (c4657toArr2 != null ? AbstractC14092to.m67208k4((Object) c4657toArr2).hashCode() : 0)) * 397;
        byte[] bArr = this.f13060du;
        return ((iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397) ^ C14088s7.m67172k4(this.f13061h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19487k4() {
        return this.f13062k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4657to[] m19492kk() {
        return this.f13063kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m19493m9() {
        return this.f13060du;
    }

    /* JADX INFO: renamed from: to */
    public final short m19494to() {
        return this.f13061h4;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m19492kk() != null) {
            for (C4657to c4657to : m19492kk()) {
                c6765kp.m26796k4("{0},", c4657to);
            }
        }
        C6765kp c6765kp2 = new C6765kp();
        if (this.f13064to != null) {
            for (C4657to c4657to2 : m19485du()) {
                c6765kp2.m26796k4("{0},", c4657to2.toString());
            }
        }
        return C14113y2.m67402k4("{0}, PathPointCount: {1}, PathPointFlags: {2}, PathPoints: [{3}], PathPointTypes: [{4}], AlignmentPadding: {5}, Reserved: {6}", super.toString(), Long.valueOf(this.f13062k4), C14042ak.m66410k4(C10205v4.class, this.f13065x1), c6765kp, c6765kp2, this.f13060du, Short.valueOf(this.f13061h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m19495x1() {
        return this.f13065x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19488k4(long j) {
        this.f13062k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19496x1(short s) {
        this.f13061h4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19489k4(short s) {
        this.f13065x1 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19497x1(C4657to[] c4657toArr) {
        this.f13064to = c4657toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19490k4(byte[] bArr) {
        this.f13060du = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19491k4(C4657to[] c4657toArr) {
        this.f13063kk = c4657toArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19484k4(C4675xw c4675xw) {
        return m19055k4((AbstractC4615c6) c4675xw) && this.f13062k4 == c4675xw.f13062k4 && this.f13065x1 == c4675xw.f13065x1 && C12530dy.m58334k4(this.f13063kk, c4675xw.f13063kk) && C12530dy.m58334k4(this.f13064to, c4675xw.f13064to) && C12530dy.m58330k4(this.f13060du, c4675xw.f13060du) && this.f13061h4 == c4675xw.f13061h4;
    }
}
