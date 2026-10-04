package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p396sc.C10176c6;
import com.aspose.slides.internal.p411sz.C10802k4;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C6045bz extends C12535to {

    /* JADX INFO: renamed from: du */
    private int f17145du;

    /* JADX INFO: renamed from: h4 */
    private long f17146h4;

    /* JADX INFO: renamed from: k4 */
    private C10802k4 f17147k4;

    /* JADX INFO: renamed from: kk */
    private short f17148kk;

    /* JADX INFO: renamed from: to */
    private int f17149to;

    /* JADX INFO: renamed from: x1 */
    private short f17150x1;

    public C6045bz() {
    }

    /* JADX INFO: renamed from: G_ */
    public short mo24431G_() {
        return this.f17148kk;
    }

    /* JADX INFO: renamed from: H_ */
    public int mo24432H_() {
        return this.f17145du;
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
        return m24438k4((C6045bz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        throw new NotSupportedException("Should be overridden in inheritors");
    }

    public int hashCode() {
        C10802k4 c10802k4 = this.f17147k4;
        return ((((((((c10802k4 != null ? c10802k4.hashCode() : 0) * 397) ^ this.f17150x1) * 397) ^ C14088s7.m67172k4(this.f17148kk)) * 397) ^ this.f17149to) * 397) ^ this.f17145du;
    }

    /* JADX INFO: renamed from: ix */
    public final byte m24434ix() {
        return (byte) ((this.f17148kk & 65280) >> 8);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24435k4(int i) {
        this.f17145du = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24439kk(byte b) {
        this.f17148kk = (short) ((b & 255) | ((short) (this.f17148kk & (-256))));
    }

    /* JADX INFO: renamed from: m9 */
    public int mo24441m9() {
        return this.f17149to;
    }

    /* JADX INFO: renamed from: ne */
    public final byte m24442ne() {
        return (byte) (this.f17148kk & 255);
    }

    /* JADX INFO: renamed from: rv */
    public final C10802k4 m24443rv() {
        return this.f17147k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m24444to(byte b) {
        this.f17148kk = (short) ((b & 255) | ((short) (this.f17148kk & (-256))));
    }

    public String toString() {
        return C14113y2.m67402k4("Type: {0}, Flags: {1}, Size: {2}, DataSize: {3}, Offset: {4}", C14042ak.m66410k4(C10176c6.class, this.f17150x1), Short.valueOf(this.f17148kk), Integer.valueOf(this.f17149to), Integer.valueOf(this.f17145du), Long.valueOf(this.f17146h4));
    }

    /* JADX INFO: renamed from: u4 */
    public final int m24445u4() {
        int iMo24416h4 = mo24416h4();
        int i = iMo24416h4 % 4;
        if (i != 0) {
            iMo24416h4 += 4 - i;
        }
        return iMo24416h4 + 12;
    }

    /* JADX INFO: renamed from: uz */
    public final void m24446uz() {
        mo24448x1(m24445u4());
        mo24435k4(mo24441m9() - 12);
    }

    /* JADX INFO: renamed from: wl */
    public final byte m24447wl() {
        return (byte) (this.f17148kk & 255);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo24448x1(int i) {
        this.f17149to = i;
    }

    /* JADX INFO: renamed from: x6 */
    public final short m24450x6() {
        return this.f17150x1;
    }

    public C6045bz(C6045bz c6045bz) {
        this(c6045bz.m24443rv());
        m24449x1(c6045bz.m24450x6());
        this.f17148kk = c6045bz.mo24431G_();
        this.f17149to = c6045bz.mo24441m9();
        this.f17145du = c6045bz.mo24432H_();
        this.f17146h4 = c6045bz.f17146h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m24433h4(int i) {
        int i2 = 1 << i;
        return (this.f17148kk & i2) == i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24436k4(int i, boolean z) {
        int i2 = 1 << i;
        short sMo24431G_ = mo24431G_();
        this.f17148kk = (short) (z ? i2 | sMo24431G_ : (~i2) & sMo24431G_);
    }

    /* JADX INFO: renamed from: kk */
    public final void m24440kk(long j) {
        this.f17146h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24449x1(short s) {
        this.f17150x1 = s;
    }

    public C6045bz(C10802k4 c10802k4) {
        this.f17147k4 = c10802k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24437k4(short s) {
        this.f17148kk = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24438k4(C6045bz c6045bz) {
        return this.f17150x1 == c6045bz.f17150x1 && this.f17148kk == c6045bz.f17148kk && this.f17149to == c6045bz.f17149to && this.f17145du == c6045bz.f17145du;
    }
}
