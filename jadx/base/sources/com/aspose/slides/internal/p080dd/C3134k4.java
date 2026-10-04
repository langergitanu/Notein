package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.AbstractC6760h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3134k4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f9281k4 = true;

    /* JADX INFO: renamed from: du */
    private AbstractC6760h4 f9282du;

    /* JADX INFO: renamed from: h4 */
    private char[] f9283h4;

    /* JADX INFO: renamed from: kk */
    private AbstractC6747ar f9284kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f9285m9;

    /* JADX INFO: renamed from: to */
    private byte[] f9286to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 f9287x1;

    public C3134k4(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, AbstractC6747ar.m26635ix());
    }

    /* JADX INFO: renamed from: c5 */
    public char[] m13370c5(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
        }
        if (i == 0) {
            return new char[0];
        }
        char[] cArr = new char[i];
        int iM13376k4 = m13376k4(cArr, 0, i);
        if (iM13376k4 == 0) {
            throw new EndOfStreamException();
        }
        if (iM13376k4 == i) {
            return cArr;
        }
        char[] cArr2 = new char[iM13376k4];
        AbstractC14092to.m67229k4(cArr, 0, cArr2, 0, iM13376k4);
        return cArr2;
    }

    /* JADX INFO: renamed from: ck */
    public AbstractC3150x6 m13371ck() {
        return this.f9287x1;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m13377k4(true);
    }

    /* JADX INFO: renamed from: dy */
    public byte[] m13372dy(int i) {
        if (this.f9287x1 == null) {
            if (this.f9285m9) {
                throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
            }
            throw new IOException("Stream is invalid");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.f9287x1.read(bArr, i2, i - i2);
            if (i3 == 0) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        C14058fa.m66596k4(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: fa */
    public void m13373fa() {
        m13377k4(true);
        this.f9285m9 = true;
    }

    /* JADX INFO: renamed from: ix */
    public float m13374ix() {
        return Float.intBitsToFloat(m13386x6());
    }

    /* JADX INFO: renamed from: k4 */
    public int m13375k4(byte[] bArr, int i, int i2) {
        AbstractC3150x6 abstractC3150x6 = this.f9287x1;
        if (abstractC3150x6 == null) {
            if (this.f9285m9) {
                throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
            }
            throw new IOException("Stream is invalid");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer is null");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index is less than 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
        }
        if (bArr.length - i >= i2) {
            return abstractC3150x6.read(bArr, i, i2);
        }
        throw new ArgumentException("buffer is too small");
    }

    /* JADX INFO: renamed from: ks */
    public char m13378ks() {
        char[] cArrM13370c5 = m13370c5(1);
        if (f9281k4 || cArrM13370c5.length == 1) {
            return cArrM13370c5[0];
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: m9 */
    public void m13379m9(int i) {
        if (i > this.f9286to.length) {
            throw new ArgumentOutOfRangeException("numBytes");
        }
        if (this.f9285m9) {
            throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
        }
        if (this.f9287x1 == null) {
            throw new IOException("Stream is invalid");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.f9287x1.read(this.f9286to, i2, i - i2);
            if (i3 == 0) {
                throw new EndOfStreamException();
            }
            i2 += i3;
        }
    }

    /* JADX INFO: renamed from: ne */
    public long m13380ne() {
        return m13384uz() | (m13384uz() << 32);
    }

    /* JADX INFO: renamed from: rv */
    public short m13381rv() {
        m13379m9(2);
        byte[] bArr = this.f9286to;
        return (short) (((bArr[1] & 255) << 8) | (bArr[0] & 255));
    }

    /* JADX INFO: renamed from: u4 */
    public int m13382u4() {
        m13379m9(2);
        byte[] bArr = this.f9286to;
        return ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    /* JADX INFO: renamed from: up */
    public boolean m13383up() {
        return m13387yj() != 0;
    }

    /* JADX INFO: renamed from: uz */
    public long m13384uz() {
        return ((long) m13386x6()) & 4294967295L;
    }

    /* JADX INFO: renamed from: wl */
    public long m13385wl() {
        m13379m9(8);
        byte[] bArr = this.f9286to;
        return ((((long) (((((bArr[5] & 255) << 8) | (bArr[4] & 255)) | ((bArr[6] & 255) << 16)) | ((bArr[7] & 255) << 24))) & 4294967295L) << 32) | (((bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24)) & 4294967295L);
    }

    /* JADX INFO: renamed from: x6 */
    public int m13386x6() {
        m13379m9(4);
        byte[] bArr = this.f9286to;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    /* JADX INFO: renamed from: yj */
    public byte m13387yj() {
        m13379m9(1);
        return this.f9286to[0];
    }

    public C3134k4(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar) {
        if (abstractC3150x6 == null || abstractC6747ar == null) {
            throw new ArgumentNullException("Input or Encoding is a null reference.");
        }
        if (!abstractC3150x6.canRead()) {
            throw new ArgumentException("The stream doesn't support reading.");
        }
        this.f9287x1 = abstractC3150x6;
        this.f9284kk = abstractC6747ar;
        this.f9282du = abstractC6747ar.mo26628x1();
        this.f9286to = new byte[Math.max(16, abstractC6747ar.mo26620k4(1))];
    }

    /* JADX INFO: renamed from: k4 */
    public int m13376k4(char[] cArr, int i, int i2) {
        if (this.f9287x1 == null) {
            if (this.f9285m9) {
                throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
            }
            throw new IOException("Stream is invalid");
        }
        if (cArr == null) {
            throw new ArgumentNullException("buffer is null");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index is less than 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
        }
        if (cArr.length - i >= i2) {
            return m13368k4(cArr, i, i2, new int[]{0});
        }
        throw new ArgumentException("buffer is too small");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r1 = r1 + 1;
        r11 = r7;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m13368k4(char[] cArr, int i, int i2, int[] iArr) {
        iArr[0] = 0;
        int i3 = 0;
        loop0: while (i3 < i2) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                m13369k4(i5);
                int i6 = this.f9287x1.readByte();
                if (i6 == -1) {
                    break loop0;
                }
                byte[] bArr = this.f9286to;
                bArr[i4] = (byte) i6;
                iArr[0] = iArr[0] + 1;
                int i7 = i + i3;
                char[] cArr2 = cArr;
                int iMo26661k4 = this.f9284kk.mo26661k4(bArr, 0, i5, cArr2, i7);
                if (!(iMo26661k4 == 1 && cArr2[i7] == 65533) && iMo26661k4 > 0) {
                    break;
                }
                i4 = i5;
                cArr = cArr2;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m13369k4(int i) {
        byte[] bArr = this.f9286to;
        if (bArr.length <= i) {
            byte[] bArr2 = new byte[i];
            C14058fa.m66596k4(bArr, 0, bArr2, 0, bArr.length);
            this.f9286to = bArr2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m13377k4(boolean z) {
        AbstractC3150x6 abstractC3150x6;
        if (z && (abstractC3150x6 = this.f9287x1) != null) {
            abstractC3150x6.close();
        }
        this.f9285m9 = true;
        this.f9286to = null;
        this.f9284kk = null;
        this.f9287x1 = null;
        this.f9283h4 = null;
    }
}
