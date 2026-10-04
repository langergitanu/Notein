package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.p8 */
/* JADX INFO: loaded from: classes3.dex */
class C14270p8 {

    /* JADX INFO: renamed from: du */
    private int f48010du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f48011h4;

    /* JADX INFO: renamed from: k4 */
    private byte[] f48012k4;

    /* JADX INFO: renamed from: kk */
    private int f48013kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f48014m9;

    /* JADX INFO: renamed from: to */
    private int f48015to;

    /* JADX INFO: renamed from: x1 */
    private int f48016x1;

    public C14270p8(AbstractC3150x6 abstractC3150x6, boolean z) {
        this.f48011h4 = abstractC3150x6;
        this.f48014m9 = z;
        if (abstractC3150x6.canSeek()) {
            int length = (int) this.f48011h4.getLength();
            this.f48015to = length;
            this.f48013kk = C14116yg.m67507x1(length, 65536);
            this.f48016x1 = Integer.MAX_VALUE;
        } else {
            this.f48016x1 = 0;
            this.f48013kk = 0;
            this.f48015to = 0;
        }
        int i = this.f48013kk;
        this.f48012k4 = new byte[i <= 0 ? 1024 : i];
        if (this.f48015to > 0) {
            m68970k4(0);
        } else {
            this.f48010du = 0;
        }
        if (this.f48013kk == this.f48015to && this.f48011h4.canSeek()) {
            m68969k4();
        }
    }

    /* JADX INFO: renamed from: du */
    private int m68968du() {
        byte[] bArr = this.f48012k4;
        int length = bArr.length;
        int i = this.f48013kk;
        int i2 = length - i;
        if (i2 == 0) {
            byte[] bArr2 = new byte[i * 2];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), this.f48013kk);
            this.f48012k4 = bArr2;
            i2 = this.f48013kk;
        }
        int i3 = this.f48011h4.read(this.f48012k4, this.f48013kk, i2);
        if (i3 <= 0) {
            return 0;
        }
        int i4 = this.f48013kk + i3;
        this.f48013kk = i4;
        this.f48015to = i4;
        return i3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68969k4() {
        AbstractC3150x6 abstractC3150x6;
        if (this.f48014m9 || (abstractC3150x6 = this.f48011h4) == null) {
            return;
        }
        abstractC3150x6.close();
        this.f48011h4 = null;
    }

    /* JADX INFO: renamed from: kk */
    public final int m68971kk() {
        int iM68972to = m68972to();
        int iMo68973x1 = mo68973x1();
        m68970k4(iM68972to);
        return iMo68973x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m68972to() {
        return this.f48010du + this.f48016x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo68973x1() {
        byte b;
        int i = this.f48010du;
        if (i < this.f48013kk) {
            byte[] bArr = this.f48012k4;
            this.f48010du = i + 1;
            b = bArr[i];
        } else if (m68972to() < this.f48015to) {
            m68970k4(m68972to());
            byte[] bArr2 = this.f48012k4;
            int i2 = this.f48010du;
            this.f48010du = i2 + 1;
            b = bArr2[i2];
        } else {
            AbstractC3150x6 abstractC3150x6 = this.f48011h4;
            if (abstractC3150x6 == null || abstractC3150x6.canSeek() || m68968du() <= 0) {
                return 65536;
            }
            byte[] bArr3 = this.f48012k4;
            int i3 = this.f48010du;
            this.f48010du = i3 + 1;
            b = bArr3[i3];
        }
        return b & 255;
    }

    public C14270p8(C14270p8 c14270p8) {
        this.f48012k4 = c14270p8.f48012k4;
        this.f48016x1 = c14270p8.f48016x1;
        this.f48013kk = c14270p8.f48013kk;
        this.f48015to = c14270p8.f48015to;
        this.f48010du = c14270p8.f48010du;
        this.f48011h4 = c14270p8.f48011h4;
        c14270p8.f48011h4 = null;
        this.f48014m9 = c14270p8.f48014m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68970k4(int i) {
        int i2;
        AbstractC3150x6 abstractC3150x6;
        if (i >= this.f48015to && (abstractC3150x6 = this.f48011h4) != null && !abstractC3150x6.canSeek()) {
            while (i >= this.f48015to && m68968du() > 0) {
            }
        }
        if (i < 0 || i > (i2 = this.f48015to)) {
            throw new C1166gy(C14113y2.m67408k4("buffer out of bounds access, position: ", C14057f9.m66591x1(i)));
        }
        int i3 = this.f48016x1;
        if (i >= i3 && i < this.f48013kk + i3) {
            this.f48010du = i - i3;
            return;
        }
        AbstractC3150x6 abstractC3150x62 = this.f48011h4;
        if (abstractC3150x62 == null) {
            this.f48010du = i2 - i3;
            return;
        }
        abstractC3150x62.seek(i, 0);
        AbstractC3150x6 abstractC3150x63 = this.f48011h4;
        byte[] bArr = this.f48012k4;
        this.f48013kk = abstractC3150x63.read(bArr, 0, bArr.length);
        this.f48016x1 = i;
        this.f48010du = 0;
    }
}
