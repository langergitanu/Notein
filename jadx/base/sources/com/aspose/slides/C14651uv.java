package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p174hz.C4775yj;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p456v5.C11607k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.uv */
/* JADX INFO: loaded from: classes3.dex */
class C14651uv implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private byte[] f49394c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC4736my f49395ck;

    /* JADX INFO: renamed from: du */
    private byte[] f49396du;

    /* JADX INFO: renamed from: dy */
    private byte[] f49397dy;

    /* JADX INFO: renamed from: fa */
    private InterfaceC4752ts f49398fa;

    /* JADX INFO: renamed from: h4 */
    private byte[] f49399h4;

    /* JADX INFO: renamed from: jd */
    private AbstractC4739nv f49400jd;

    /* JADX INFO: renamed from: k4 */
    private byte[] f49401k4;

    /* JADX INFO: renamed from: kk */
    private long f49402kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f49403m9;

    /* JADX INFO: renamed from: to */
    private long f49404to;

    /* JADX INFO: renamed from: up */
    private InterfaceC4752ts f49405up;

    /* JADX INFO: renamed from: x1 */
    private long f49406x1;

    /* JADX INFO: renamed from: yj */
    private boolean f49407yj;

    public C14651uv(String str, int i) {
        this.f49401k4 = new byte[20];
        this.f49406x1 = 24L;
        this.f49402kk = 32772L;
        long j = 26126;
        this.f49404to = 26126L;
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(str);
        this.f49403m9 = bArrMo26677to;
        if (i != 128) {
            if (i == 192) {
                j = 26127;
            } else {
                if (i != 256) {
                    throw new PptxReadException("Do not support such  key length ");
                }
                j = 26128;
            }
        }
        this.f49404to = j;
        if (bArrMo26677to.length < 1 || bArrMo26677to == null) {
            throw new InvalidPasswordException("The password could not be null or empty ");
        }
        this.f49397dy = C14047bz.m66536x1().m66539k4();
        this.f49400jd = new C4772y9();
        this.f49401k4 = m71931k4(this.f49403m9, this.f49397dy);
    }

    /* JADX INFO: renamed from: kk */
    private void m71932kk(byte[] bArr, byte[] bArr2) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C4775yj c4775yj = new C4775yj(c3152yj, this.f49405up, 0);
            try {
                c4775yj.read(bArr2, 0, bArr.length);
            } finally {
                c4775yj.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m71936k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m71934k4(AbstractC3150x6 abstractC3150x6) {
        if (this.f49407yj) {
            throw new ObjectDisposedException(null);
        }
        m71930k4(this.f49401k4);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C3152yj c3152yj = new C3152yj((((int) (abstractC3150x6.getLength() / 16)) * 16) + 8);
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13450k4(new byte[]{(byte) (abstractC3150x6.getLength() & 255), (byte) ((abstractC3150x6.getLength() & 65280) >> 8), (byte) ((abstractC3150x6.getLength() & 16711680) >> 16), (byte) ((abstractC3150x6.getLength() & 4278190080L) >> 24), 0, 0, 0, 0});
        for (int i = 0; i < (abstractC3150x6.getLength() + 15) / 16; i++) {
            byte[] bArr = new byte[16];
            c3134k4.m13375k4(bArr, 0, 16);
            m71933x1(bArr, bArr);
            c3149x1.m13450k4(bArr);
        }
        c3152yj.seek(0L, 0);
        return c3152yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3152yj m71938x1() {
        if (this.f49407yj) {
            throw new ObjectDisposedException(null);
        }
        C3152yj c3152yj = new C3152yj(StyleIdentifier.LIGHT_GRID_ACCENT_6);
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        byte[] bArr = new byte[16];
        bArr[0] = 3;
        bArr[2] = 2;
        bArr[4] = 36;
        bArr[8] = -92;
        bArr[12] = 36;
        c3149x1.m13450k4(bArr);
        byte[] bArr2 = new byte[16];
        long j = this.f49404to;
        bArr2[4] = (byte) (j & 255);
        bArr2[5] = (byte) (((j & 65280) >> 8) & 4294967295L);
        bArr2[8] = 4;
        bArr2[9] = UnsignedBytes.MAX_POWER_OF_TWO;
        bArr2[12] = UnsignedBytes.MAX_POWER_OF_TWO;
        c3149x1.m13450k4(bArr2);
        byte[] bArr3 = new byte[16];
        bArr3[0] = (byte) (this.f49406x1 & 255);
        c3149x1.m13451k4(bArr3, 0, 12);
        c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)\u0000"));
        m71931k4(this.f49403m9, this.f49397dy);
        byte[] bArr4 = {0, 17, 17, 34, 34, PatternStyle.Vertical, PatternStyle.Cross, 67, 68, 84, 85, 69, 36, 60, 68, 4};
        byte[] bArr5 = new byte[4];
        bArr5[0] = 16;
        c3149x1.m13451k4(bArr5, 0, 4);
        c3149x1.m13450k4(this.f49397dy);
        this.f49399h4 = new byte[32];
        System.arraycopy(this.f49400jd.m19588x1(bArr4), 0, this.f49399h4, 0, 20);
        m71930k4(this.f49401k4);
        m71933x1(bArr4, bArr4);
        c3149x1.m13450k4(bArr4);
        byte[] bArr6 = new byte[4];
        bArr6[0] = 20;
        c3149x1.m13451k4(bArr6, 0, 4);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f49399h4, 0, bArr7, 0, 16);
        m71933x1(bArr7, bArr7);
        System.arraycopy(bArr7, 0, this.f49399h4, 0, 16);
        System.arraycopy(this.f49399h4, 16, bArr7, 0, 16);
        m71933x1(bArr7, bArr7);
        System.arraycopy(bArr7, 0, this.f49399h4, 16, 16);
        c3149x1.m13450k4(this.f49399h4);
        c3149x1.m13441k4(0, 0);
        return c3152yj;
    }

    public C14651uv(byte[] bArr, String str) {
        this.f49401k4 = new byte[20];
        this.f49406x1 = 24L;
        this.f49402kk = 32772L;
        this.f49404to = 26126L;
        int iM66765du = C14069jd.m66765du(bArr, 8);
        long jM66784x1 = C14069jd.m66784x1(bArr, 20);
        long jM66784x12 = C14069jd.m66784x1(bArr, 24);
        C14069jd.m66784x1(bArr, 28);
        long jM66784x13 = C14069jd.m66784x1(bArr, 32);
        AbstractC6747ar.m26643rv().mo26682x1(bArr, 44, iM66765du - 34);
        int iM66765du2 = C14069jd.m66765du(bArr, iM66765du + 12);
        int i = iM66765du + 16;
        byte[] bArr2 = new byte[iM66765du2];
        byte[] bArr3 = new byte[iM66765du2];
        System.arraycopy(bArr, i, bArr2, 0, iM66765du2);
        int i2 = i + iM66765du2;
        System.arraycopy(bArr, i2, bArr3, 0, iM66765du2);
        int i3 = i2 + iM66765du2 + 4;
        int length = bArr.length - i3;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(str);
        this.f49403m9 = bArrMo26677to;
        if (bArrMo26677to.length < 1 || bArrMo26677to == null) {
            throw new InvalidPasswordException("The password could not be null or empty ");
        }
        switch ((int) jM66784x1) {
            case 26126:
            case 26127:
            case 26128:
                this.f49404to = jM66784x1;
                this.f49406x1 = jM66784x13;
                this.f49402kk = jM66784x12;
                this.f49396du = bArr3;
                this.f49399h4 = bArr4;
                this.f49397dy = bArr2;
                this.f49400jd = new C4772y9();
                this.f49401k4 = m71931k4(this.f49403m9, this.f49397dy);
                return;
            default:
                throw new PptxReadException("Do not support such  keyAlgId ");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m71933x1(byte[] bArr, byte[] bArr2) {
        C3152yj c3152yj = new C3152yj(bArr2);
        try {
            C4775yj c4775yj = new C4775yj(c3152yj, this.f49398fa, 1);
            try {
                c4775yj.write(bArr, 0, bArr.length);
            } finally {
                c4775yj.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m71935k4(C3152yj c3152yj) {
        if (this.f49407yj) {
            throw new ObjectDisposedException(null);
        }
        m71930k4(this.f49401k4);
        C3134k4 c3134k4 = new C3134k4(c3152yj);
        byte[] bArr = new byte[8];
        c3152yj.read(bArr, 0, 8);
        long jM66767h4 = C14069jd.m66767h4(bArr, 0);
        C3152yj c3152yj2 = new C3152yj(((int) ((c3152yj.getLength() + 15) / 16)) * 16);
        C3149x1 c3149x1 = new C3149x1(c3152yj2);
        c3134k4.m13371ck().seek(8L, 0);
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < (c3152yj.getLength() + 15) / 16; i++) {
            c3134k4.m13375k4(bArr2, 0, 16);
            m71932kk(bArr2, bArr2);
            c3149x1.m13450k4(bArr2);
        }
        c3134k4.m13373fa();
        c3152yj2.seek(0L, 0);
        if (c3152yj2.getLength() > jM66767h4) {
            c3152yj2.setLength(jM66767h4);
        }
        return c3152yj2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m71936k4(boolean z) {
        if (this.f49407yj) {
            return;
        }
        if (z) {
            ((IDisposable) C7019kk.m27452k4((Object) this.f49395ck, IDisposable.class)).dispose();
            this.f49398fa.dispose();
            this.f49405up.dispose();
            ((IDisposable) C7019kk.m27452k4((Object) this.f49400jd, IDisposable.class)).dispose();
        }
        this.f49407yj = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m71930k4(byte[] bArr) {
        int i = 24;
        byte[] bArr2 = new byte[24];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        C4772y9 c4772y9 = new C4772y9();
        try {
            byte[] bArrM19588x1 = c4772y9.m19588x1(bArr2);
            byte[] bArr3 = new byte[64];
            for (int i2 = 0; i2 < 64; i2++) {
                bArr3[i2] = PatternStyle.DiagonalCross;
            }
            for (int i3 = 0; i3 < 20; i3++) {
                bArr3[i3] = (byte) ((bArr3[i3] & 255) ^ (bArrM19588x1[i3] & 255));
            }
            byte[] bArr4 = new byte[64];
            for (int i4 = 0; i4 < 64; i4++) {
                bArr4[i4] = 92;
            }
            for (int i5 = 0; i5 < 20; i5++) {
                bArr4[i5] = (byte) ((bArr4[i5] & 255) ^ (bArrM19588x1[i5] & 255));
            }
            byte[] bArr5 = new byte[40];
            System.arraycopy(c4772y9.m19588x1(bArr3), 0, bArr5, 0, 20);
            System.arraycopy(c4772y9.m19588x1(bArr4), 0, bArr5, 20, 20);
            long j = this.f49404to;
            if ((j & 4294967295L) == 26126) {
                i = 16;
            } else if ((j & 4294967295L) != 26127) {
                i = (j & 4294967295L) == 26128 ? 32 : 0;
            }
            if (i == 0) {
                throw new InvalidDataException("Key length id value is invalid.");
            }
            byte[] bArr6 = new byte[i];
            this.f49394c5 = bArr6;
            System.arraycopy(bArr5, 0, bArr6, 0, i);
            C11607k4 c11607k4 = new C11607k4();
            this.f49395ck = c11607k4;
            c11607k4.mo19609k4(i * 8);
            this.f49395ck.m19687kk(2);
            this.f49395ck.m19691to(1);
            this.f49398fa = this.f49395ck.mo19657k4(this.f49394c5, null);
            this.f49405up = this.f49395ck.mo19659x1(this.f49394c5, null);
            c4772y9.dispose();
        } catch (Throwable th) {
            c4772y9.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m71937k4() {
        if (this.f49407yj) {
            throw new ObjectDisposedException(null);
        }
        m71930k4(this.f49401k4);
        byte[] bArr = new byte[16];
        m71932kk(this.f49396du, bArr);
        byte[] bArrM19588x1 = this.f49400jd.m19588x1(bArr);
        byte[] bArr2 = this.f49399h4;
        m71932kk(bArr2, bArr2);
        for (int i = 0; i < 14; i++) {
            if ((this.f49399h4[i] & 255) != (bArrM19588x1[i] & 255)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m71931k4(byte[] bArr, byte[] bArr2) {
        if (this.f49407yj) {
            throw new ObjectDisposedException(null);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, bArr2.length, bArr.length);
        byte[] bArrM19588x1 = this.f49400jd.m19588x1(bArr3);
        byte[] bArr4 = new byte[24];
        for (long j = 0; (4294967295L & j) < 50000; j++) {
            System.arraycopy(C14069jd.m66776k4(j), 0, bArr4, 0, 4);
            System.arraycopy(bArrM19588x1, 0, bArr4, 4, 20);
            bArrM19588x1 = this.f49400jd.m19588x1(bArr4);
        }
        return bArrM19588x1;
    }
}
