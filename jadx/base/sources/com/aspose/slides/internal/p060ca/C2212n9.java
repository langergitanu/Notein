package com.aspose.slides.internal.p060ca;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.n9 */
/* JADX INFO: loaded from: classes3.dex */
public class C2212n9 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f7657k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2011be f7658x1;

    public C2212n9(AbstractC2011be abstractC2011be) {
        this.f7657k4 = abstractC2011be.mo10245x1();
        this.f7658x1 = abstractC2011be;
    }

    /* JADX INFO: renamed from: c5 */
    public final short m11147c5() {
        return (short) m11151fa();
    }

    /* JADX INFO: renamed from: ck */
    public final byte m11148ck() {
        int i = this.f7657k4.readByte();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EndOfStreamException();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f7658x1.m10244to()) {
            this.f7657k4.close();
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m11149du() {
        return m11151fa();
    }

    /* JADX INFO: renamed from: dy */
    public final double m11150dy() {
        short sM11147c5 = m11147c5();
        return (((double) (sM11147c5 & 16383)) / 16384.0d) + ((double) (sM11147c5 >> 14));
    }

    /* JADX INFO: renamed from: fa */
    public final int m11151fa() {
        byte[] bArr = new byte[2];
        int i = this.f7657k4.read(bArr, 0, 2);
        if (i == 0 || i < 2) {
            throw new EndOfStreamException();
        }
        return (((bArr[0] & 255) << 8) + (bArr[1] & 255)) & 65535;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m11152h4() {
        return m11147c5();
    }

    /* JADX INFO: renamed from: jd */
    public final long m11153jd() {
        byte[] bArr = new byte[8];
        int i = this.f7657k4.read(bArr, 0, 8);
        if (i == 0 || i < 8) {
            throw new EndOfStreamException();
        }
        return (((long) (bArr[0] & 255)) << 56) + (((long) (bArr[1] & 255)) << 48) + (((long) (bArr[2] & 255)) << 40) + (((long) (bArr[3] & 255)) << 32) + (((long) (bArr[4] & 255)) << 24) + (((long) (bArr[5] & 255)) << 16) + (((long) (bArr[6] & 255)) << 8) + ((long) (bArr[7] & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public final long m11154k4() {
        return this.f7657k4.getPosition();
    }

    /* JADX INFO: renamed from: kk */
    public final byte m11161kk() {
        int i = this.f7657k4.readByte();
        if (i != -1) {
            return (byte) i;
        }
        throw new EndOfStreamException();
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m11162m9() {
        int iM11148ck = m11148ck() & 255;
        if (iM11148ck >= 127) {
            iM11148ck += InputDeviceCompat.SOURCE_ANY;
        }
        return (byte) iM11148ck;
    }

    /* JADX INFO: renamed from: to */
    public final float m11163to() {
        return m11147c5() + ((m11151fa() & 65535) / 65536);
    }

    /* JADX INFO: renamed from: up */
    public final long m11164up() {
        byte[] bArr = new byte[4];
        int i = this.f7657k4.read(bArr, 0, 4);
        if (i == 0 || i < 4) {
            throw new EndOfStreamException();
        }
        return ((long) (((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255))) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m11165x1() {
        return this.f7657k4.getLength();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14084qq m11155k4(boolean z) {
        long jM11153jd = m11153jd();
        C14084qq c14084qq = new C14084qq(1904, 1, 1);
        try {
            c14084qq.m67128du(jM11153jd).CloneTo(c14084qq);
            return c14084qq;
        } catch (ArgumentOutOfRangeException e) {
            if (z) {
                return c14084qq;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final String m11166x1(int i) {
        byte[] bArr = new byte[i];
        int i2 = this.f7657k4.read(bArr, 0, i);
        if (i2 == 0 || i2 < i) {
            throw new EndOfStreamException();
        }
        return AbstractC6747ar.m26650yj().m26681x1(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11156k4(int i, String str) {
        return m11157k4(i, str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11157k4(int i, String str, boolean z) {
        byte[] bArr = new byte[i];
        if (i != 0) {
            int i2 = this.f7657k4.read(bArr, 0, i);
            if (!z && (i2 == 0 || i2 < i)) {
                throw new EndOfStreamException();
            }
        }
        if (!"big5".equals(str)) {
            return C2266qq.m11310k4(str).m26681x1(bArr);
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = bArr[i4];
            if ((b & 255) != 0) {
                bArr2[i3] = b;
                i3++;
            }
        }
        return C2266qq.m11310k4(str).mo26682x1(bArr2, 0, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11158k4(int i, byte[] bArr, int i2) {
        if (this.f7657k4.read(bArr, i2, i) == -1) {
            throw new EndOfStreamException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11159k4(long j) {
        this.f7657k4.seek(j, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11160k4(int i) {
        byte[] bArr = new byte[i];
        m11158k4(i, bArr, 0);
        return bArr;
    }
}
