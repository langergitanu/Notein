package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p299ni.InterfaceC6907kk;
import com.aspose.slides.internal.p550zi.C13604kk;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C10142ks {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f36470k4 = {256, 512, 1024, 2048, 4096, 8192, 16384, 32768};

    /* JADX INFO: renamed from: du */
    private long f36472du;

    /* JADX INFO: renamed from: dy */
    private boolean f36473dy;

    /* JADX INFO: renamed from: kk */
    private final boolean f36475kk;

    /* JADX INFO: renamed from: m9 */
    private C10135du f36476m9;

    /* JADX INFO: renamed from: to */
    private C13618wy f36477to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6907kk f36478x1;

    /* JADX INFO: renamed from: h4 */
    private byte[] f36474h4 = new byte[4];

    /* JADX INFO: renamed from: c5 */
    private boolean f36471c5 = true;

    public C10142ks(InterfaceC6907kk interfaceC6907kk, boolean z) {
        this.f36478x1 = interfaceC6907kk;
        this.f36475kk = z;
    }

    /* JADX INFO: renamed from: kk */
    private C13621xk m49897kk(byte[] bArr, int i, int i2) {
        C13621xk c13621xk = new C13621xk();
        c13621xk.f45230x1 = this.f36476m9.m49809k4(bArr, i, i2 - i);
        c13621xk.f45228k4 = true;
        return c13621xk;
    }

    /* JADX INFO: renamed from: x1 */
    private C13621xk m49898x1(byte[] bArr, int i, int i2) {
        this.f36472du = 1L;
        if (this.f36477to.m62852k4(this.f36474h4, 0, 2) != 2) {
            throw new EndOfStreamException("Can't read the header bytes.");
        }
        byte[] bArr2 = this.f36474h4;
        byte b = bArr2[0];
        int i3 = b & 255;
        byte b2 = (byte) (b & 15);
        byte b3 = (byte) ((b & 240) >> 4);
        byte b4 = bArr2[1];
        int i4 = b4 & 255;
        byte b5 = (byte) ((b4 & 16) >> 4);
        if (((i3 << 8) | i4) % 31 != 0) {
            throw new InvalidOperationException("DeflateCompressorException: Check bits for CMF and FLG error");
        }
        boolean z = (b5 & 255) > 0;
        this.f36473dy = z;
        if (z && !this.f36471c5) {
            throw new NotSupportedException("Preset dictionary not supported.");
        }
        C13621xk c13621xk = new C13621xk();
        int i5 = b2 & 255;
        if (i5 != 8) {
            if (i5 != 15) {
                throw new InvalidOperationException("DeflateCompressorException: Unknown compression method.");
            }
            throw new NotSupportedException("CM (Compression method) = 15 is reserved.");
        }
        int i6 = b3 & 255;
        if (i6 > 7) {
            throw new InvalidOperationException("DeflateCompressorException: Window size value must be less than or equal to 7.");
        }
        int i7 = f36470k4[i6];
        int iM49809k4 = this.f36476m9.m49809k4(bArr, i, i2 - i);
        if (!this.f36476m9.m49810k4()) {
            c13621xk.f45228k4 = false;
            return c13621xk;
        }
        this.f36472du = C10140k4.m49893k4(this.f36472du, bArr, i, iM49809k4);
        c13621xk.f45230x1 = iM49809k4 - i;
        if (this.f36477to.m62852k4(this.f36474h4, 0, 4) != 4) {
            throw new EndOfStreamException("Can't read the Adler-32 checksum bytes.");
        }
        long j = this.f36472du;
        if (((int) (j & 255)) != (this.f36474h4[3] & 255) || ((j >> 8) & 255) != (r9[2] & 255) || ((j >> 16) & 255) != (r9[1] & 255) || ((j >> 24) & 255) != (r9[0] & 255)) {
            throw new InvalidOperationException("DeflateCompressorException: Incorrect checksum.");
        }
        c13621xk.f45228k4 = true;
        return c13621xk;
    }

    /* JADX INFO: renamed from: k4 */
    public C13621xk m49899k4(byte[] bArr, int i, int i2) {
        C13604kk c13604kkClone = this.f36478x1.mo27039h4().Clone();
        if (c13604kkClone.f45170kk != 0) {
            C13621xk c13621xk = new C13621xk();
            c13621xk.f45228k4 = false;
            c13621xk.f45229kk = c13604kkClone.f45171to;
            return c13621xk;
        }
        C13618wy c13618wy = new C13618wy(new C3152yj(c13604kkClone.f45169k4, 0, c13604kkClone.f45172x1));
        this.f36477to = c13618wy;
        C10135du c10135du = new C10135du(c13618wy);
        this.f36476m9 = c10135du;
        c10135du.m49811x1();
        return this.f36475kk ? m49898x1(bArr, i, i2) : m49897kk(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49900k4() {
    }
}
