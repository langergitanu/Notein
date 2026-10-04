package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1503v4;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p399si.C10228k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.xw */
/* JADX INFO: loaded from: classes5.dex */
public final class C13425xw extends AbstractC13365c6 {

    /* JADX INFO: renamed from: du */
    private byte[] f44913du;

    /* JADX INFO: renamed from: h4 */
    private short f44914h4;

    /* JADX INFO: renamed from: k4 */
    private long f44915k4;

    /* JADX INFO: renamed from: kk */
    private C13407to[] f44916kk;

    /* JADX INFO: renamed from: to */
    private C13407to[] f44917to;

    /* JADX INFO: renamed from: x1 */
    private short f44918x1;

    /* JADX INFO: renamed from: c5 */
    public final C11896dy m62467c5() {
        byte[] bArr = new byte[m62468du().length];
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), m62474kk().length));
        for (int i = 0; i < m62468du().length; i++) {
            bArr[i] = (byte) ((C13400qw) m62468du()[i]).m62311x1();
        }
        for (int i2 = 0; i2 < m62474kk().length; i2++) {
            m62474kk()[i2].mo62092k4().CloneTo(c12025x6Arr[i2]);
        }
        C11896dy c11896dy = new C11896dy(c12025x6Arr, bArr);
        c11896dy.m55537k4(C10228k4.m50091k4(m62477x1(), 13) ? 1 : 0);
        return c11896dy;
    }

    /* JADX INFO: renamed from: du */
    public final C13407to[] m62468du() {
        return this.f44917to;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13425xw.class) && m62466k4((C13425xw) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        int length = 12;
        if ((this.f44915k4 & 4294967295L) > 0) {
            C13407to[] c13407toArr = this.f44916kk;
            if (c13407toArr.length > 0) {
                length = 12 + (C7019kk.m27469x1(c13407toArr[0], C13372em.class) ? this.f44916kk.length * 4 : this.f44916kk.length * 8);
            }
        }
        C13407to[] c13407toArr2 = this.f44917to;
        if (c13407toArr2 != null && c13407toArr2.length > 0) {
            if (C7019kk.m27469x1(c13407toArr2[0], C13400qw.class)) {
                length += this.f44917to.length;
            } else if (C7019kk.m27469x1(this.f44917to[0], C13408tq.class)) {
                length += this.f44917to.length * 2;
            }
        }
        int i = length % 4;
        if (i == 0) {
            return length;
        }
        byte[] bArr = new byte[4 - i];
        this.f44913du = bArr;
        return length + bArr.length;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f44915k4)) * 397) ^ this.f44918x1) * 397;
        C13407to[] c13407toArr = this.f44916kk;
        int iHashCode2 = (iHashCode ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0)) * 397;
        C13407to[] c13407toArr2 = this.f44917to;
        int iHashCode3 = (iHashCode2 ^ (c13407toArr2 != null ? AbstractC14092to.m67208k4((Object) c13407toArr2).hashCode() : 0)) * 397;
        byte[] bArr = this.f44913du;
        return ((iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397) ^ C14088s7.m67172k4(this.f44914h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62469k4() {
        return this.f44915k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13407to[] m62474kk() {
        return this.f44916kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m62475m9() {
        return this.f44913du;
    }

    /* JADX INFO: renamed from: to */
    public final short m62476to() {
        return this.f44914h4;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m62474kk() != null) {
            for (C13407to c13407to : m62474kk()) {
                c6765kp.m26796k4("{0},", c13407to);
            }
        }
        C6765kp c6765kp2 = new C6765kp();
        if (this.f44917to != null) {
            for (C13407to c13407to2 : m62468du()) {
                c6765kp2.m26796k4("{0},", c13407to2.toString());
            }
        }
        return C14113y2.m67402k4("{0}, PathPointCount: {1}, PathPointFlags: {2}, PathPoints: [{3}], PathPointTypes: [{4}], AlignmentPadding: {5}, Reserved: {6}", super.toString(), Long.valueOf(this.f44915k4), C14042ak.m66410k4(C1503v4.class, this.f44918x1), c6765kp, c6765kp2, this.f44913du, Short.valueOf(this.f44914h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m62477x1() {
        return this.f44918x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62470k4(long j) {
        this.f44915k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62478x1(short s) {
        this.f44914h4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62471k4(short s) {
        this.f44918x1 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62479x1(C13407to[] c13407toArr) {
        this.f44917to = c13407toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62472k4(byte[] bArr) {
        this.f44913du = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62473k4(C13407to[] c13407toArr) {
        this.f44916kk = c13407toArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62466k4(C13425xw c13425xw) {
        return m62059k4((AbstractC13365c6) c13425xw) && this.f44915k4 == c13425xw.f44915k4 && this.f44918x1 == c13425xw.f44918x1 && C3022m9.m12723k4(this.f44916kk, c13425xw.f44916kk) && C3022m9.m12723k4(this.f44917to, c13425xw.f44917to) && C3022m9.m12719k4(this.f44913du, c13425xw.f44913du) && this.f44914h4 == c13425xw.f44914h4;
    }
}
