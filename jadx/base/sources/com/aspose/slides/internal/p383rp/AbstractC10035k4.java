package com.aspose.slides.internal.p383rp;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p236kq.InterfaceC5899kk;
import com.aspose.slides.internal.p236kq.InterfaceC5900x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p313oa.C6992k4;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13590ak;
import com.aspose.slides.internal.p550zi.C13598dy;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10035k4 {

    /* JADX INFO: renamed from: k4 */
    private final C6740x1 f36086k4;

    /* JADX INFO: renamed from: kk */
    private final int f36087kk;

    /* JADX INFO: renamed from: to */
    private final int f36088to;

    /* JADX INFO: renamed from: x1 */
    private final int f36089x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$ar */
    public static class ar extends qq {

        /* JADX INFO: renamed from: du */
        private byte f36090du;

        /* JADX INFO: renamed from: kk */
        private byte f36091kk;

        /* JADX INFO: renamed from: to */
        private byte f36092to;

        /* JADX INFO: renamed from: x1 */
        private byte f36093x1;

        public ar(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36093x1 = (byte) 0;
            this.f36091kk = (byte) 0;
            this.f36092to = (byte) 0;
            this.f36090du = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36093x1 = (byte) ((bArr[i] & 255) + (this.f36093x1 & 255));
                this.f36091kk = (byte) ((bArr[i + 1] & 255) + (this.f36091kk & 255));
                this.f36092to = (byte) ((bArr[i + 2] & 255) + (this.f36092to & 255));
                this.f36090du = (byte) ((bArr[i + 3] & 255) + (this.f36090du & 255));
                i += ((qq) this).f36137k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.qq, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = (byte) ((bArr[i] & 255) + (this.f36093x1 & 255));
                this.f36093x1 = b;
                byte b2 = (byte) ((bArr[i + 1] & 255) + (this.f36091kk & 255));
                this.f36091kk = b2;
                byte b3 = (byte) ((bArr[i + 2] & 255) + (this.f36092to & 255));
                this.f36092to = b3;
                byte b4 = (byte) ((bArr[i + 3] & 255) + (this.f36090du & 255));
                this.f36090du = b4;
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = ((b & 255) << 16) | ((b4 & 255) << 24) | ((b2 & 255) << 8) | (b3 & 255);
                i += ((qq) this).f36137k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$bv */
    public static class bv extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36094k4;

        public bv(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36094k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                byte b = bArr[i4 + 3];
                if (b == 0) {
                    int i6 = iArr2[0];
                    iArr2[0] = i6 + 1;
                    iArr[i6] = 0;
                } else {
                    int i7 = b & 255;
                    double d = 255.0d / ((double) i7);
                    int i8 = (int) ((((double) (bArr[i4] & 255)) * d) + 0.5d);
                    int i9 = (int) ((((double) (bArr[i4 + 1] & 255)) * d) + 0.5d);
                    int i10 = (int) ((((double) (bArr[i4 + 2] & 255)) * d) + 0.5d);
                    if (i8 > 255) {
                        i8 = 255;
                    }
                    if (i9 > 255) {
                        i9 = 255;
                    }
                    int i11 = i10 <= 255 ? i10 : 255;
                    int i12 = iArr2[0];
                    iArr2[0] = i12 + 1;
                    iArr[i12] = (i7 << 24) | (i8 << 16) | (i9 << 8) | i11;
                }
                i4 += this.f36094k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$c5 */
    public static class c5 extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36095k4;

        public c5(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36095k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                double d = (1.0d - (((double) (bArr[i4] & 255)) / 255.0d)) * 255.0d;
                byte b = bArr[i4 + 3];
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = ((((byte) ((1.0d - (((double) (b & 255)) / 255.0d)) * d)) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((((byte) ((1.0d - (((double) (b & 255)) / 255.0d)) * ((1.0d - (((double) (bArr[i4 + 1] & 255)) / 255.0d)) * 255.0d))) & 255) << 8) | (((byte) ((1.0d - (((double) (b & 255)) / 255.0d)) * (1.0d - (((double) (bArr[i4 + 2] & 255)) / 255.0d)) * 255.0d)) & 255);
                i4 += this.f36095k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$ck */
    public static class ck extends fa {

        /* JADX INFO: renamed from: k4 */
        protected C6986dy f36096k4;

        public ck(int i, int i2, int i3, C12014ne c12014ne, byte[] bArr) {
            super(i, i2, i3, c12014ne);
            C6992k4 c6992k4 = new C6992k4();
            this.f36096k4 = c6992k4;
            c6992k4.m27336k4(C13623yj.m62875k4().m14472k4());
            this.f36096k4.m27336k4(C13623yj.m62876x1().m14472k4());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            char c = 2;
            char c2 = 1;
            int i4 = 0;
            while (true) {
                int i5 = i;
                if (i4 >= i3) {
                    return;
                }
                double d = ((double) (bArr[i5] & 255)) / 255.0d;
                double d2 = ((double) (bArr[i5 + 1] & 255)) / 255.0d;
                char c3 = c;
                char c4 = c2;
                double d3 = ((double) (bArr[i5 + 2] & 255)) / 255.0d;
                i = i5 + 4;
                double d4 = ((double) (bArr[i5 + 3] & 255)) / 255.0d;
                double[] dArr = new double[4];
                dArr[0] = d;
                dArr[c4] = d2;
                dArr[c3] = d3;
                dArr[3] = d4;
                this.f36096k4.mo27338k4(dArr, new double[3]);
                byte b = (byte) (r2[0] * 255.0d);
                byte b2 = (byte) (r2[c4] * 255.0d);
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = (((byte) (r2[c3] * 255.0d)) & 255) | ((b & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((b2 & 255) << 8);
                i4++;
                c = c3;
                c2 = c4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$du */
    public static class du extends to {

        /* JADX INFO: renamed from: kk */
        private byte f36097kk;

        /* JADX INFO: renamed from: to */
        private byte f36098to;

        /* JADX INFO: renamed from: x1 */
        private byte f36099x1;

        public du(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36099x1 = (byte) 0;
            this.f36097kk = (byte) 0;
            this.f36098to = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36099x1 = (byte) ((bArr[i] & 255) + (this.f36099x1 & 255));
                this.f36097kk = (byte) ((bArr[i + 1] & 255) + (this.f36097kk & 255));
                this.f36098to = (byte) ((bArr[i + 2] & 255) + (this.f36098to & 255));
                i += ((to) this).f36140k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.to, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                this.f36099x1 = (byte) ((bArr[i4] & 255) + (this.f36099x1 & 255));
                byte b = (byte) ((bArr[i4 + 1] & 255) + (this.f36097kk & 255));
                this.f36097kk = b;
                byte b2 = (byte) ((bArr[i4 + 2] & 255) + (this.f36098to & 255));
                this.f36098to = b2;
                C10052k4.m49680k4(new byte[]{(byte) (((((double) (r1 & 255)) * 100.0d) / 255.0d) + 0.5d), b, b2}, 0, new byte[3], 0, 3);
                C12003du c12003duM49346k4 = super.m49346k4(r4[0], r4[1], r4[2]);
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = C13598dy.m62724k4(c12003duM49346k4);
                i4 += ((to) this).f36140k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$dy */
    public static class dy extends fa {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC5900x1 f36100k4;

        public dy(int i, int i2, int i3, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36100k4 = interfaceC5900x1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36100k4.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36100k4.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            char c = 0;
            int i4 = 0;
            while (true) {
                int i5 = i;
                if (i4 >= i3) {
                    return;
                }
                int[] iArr3 = {i5};
                byte[] bArrMo23762k4 = this.f36100k4.mo23762k4(bArr, iArr3);
                int i6 = iArr3[c];
                byte b = bArrMo23762k4[c];
                byte b2 = bArrMo23762k4[1];
                byte b3 = bArrMo23762k4[2];
                char c2 = c;
                i = i6;
                double d = 1.0d - (((double) (bArrMo23762k4[3] & 255)) / 255.0d);
                int i7 = iArr2[c2];
                iArr2[c2] = i7 + 1;
                iArr[i7] = (((byte) ((1.0d - (((double) (b3 & 255)) / 255.0d)) * 255.0d * d)) & 255) | ((((byte) (((1.0d - (((double) (b & 255)) / 255.0d)) * 255.0d) * d)) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((((byte) (((1.0d - (((double) (b2 & 255)) / 255.0d)) * 255.0d) * d)) & 255) << 8);
                i4++;
                c = c2;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$fa */
    public static abstract class fa implements InterfaceC5899kk {

        /* JADX INFO: renamed from: c5 */
        private int f36101c5;

        /* JADX INFO: renamed from: ck */
        private int f36102ck;

        /* JADX INFO: renamed from: du */
        private final long f36103du;

        /* JADX INFO: renamed from: dy */
        private int f36104dy;

        /* JADX INFO: renamed from: fa */
        private long f36105fa;

        /* JADX INFO: renamed from: h4 */
        private byte[] f36106h4;

        /* JADX INFO: renamed from: jd */
        private long f36107jd;

        /* JADX INFO: renamed from: k4 */
        private final int f36108k4;

        /* JADX INFO: renamed from: kk */
        private final int f36109kk;

        /* JADX INFO: renamed from: ks */
        private long f36110ks;

        /* JADX INFO: renamed from: m9 */
        private int f36111m9;

        /* JADX INFO: renamed from: to */
        private final long f36112to;

        /* JADX INFO: renamed from: up */
        private C12014ne f36113up;

        /* JADX INFO: renamed from: x1 */
        private final int f36114x1;

        /* JADX INFO: renamed from: yj */
        private int f36115yj;

        public fa(int i, int i2, int i3, C12014ne c12014ne) {
            C12014ne c12014ne2 = new C12014ne();
            this.f36113up = c12014ne2;
            this.f36114x1 = i2;
            this.f36109kk = i3;
            this.f36103du = (8 - ((i2 * i) % 8)) % 8;
            long j = (((i2 * i) + 7) / 8) * 8;
            this.f36112to = j;
            this.f36108k4 = i;
            c12014ne.CloneTo(c12014ne2);
            this.f36102ck = (int) ((((long) this.f36113up.m56666dy()) * j) / 8);
        }

        /* JADX INFO: renamed from: k4 */
        private int m49333k4(long j, long j2, long j3, int i) {
            return C14116yg.m67507x1((int) ((((j2 - j) * 8) - j3) / ((long) this.f36108k4)), this.f36113up.m56668h4() - i);
        }

        /* JADX INFO: renamed from: k4 */
        public abstract void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3);

        /* JADX INFO: renamed from: kk */
        public int m49337kk() {
            return this.f36108k4;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: to */
        public boolean mo23758to() {
            return this.f36106h4 != null;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: x1 */
        public int mo23759x1() {
            return this.f36115yj;
        }

        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: k4 */
        public void mo23754k4(int i) {
            long j = i;
            this.f36110ks = this.f36112to * j;
            this.f36102ck = (int) (((((long) this.f36113up.m56666dy()) - j) * this.f36112to) / 8);
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: k4 */
        public void mo23755k4(int i, int i2) {
            this.f36110ks = (((long) i) * ((long) this.f36108k4)) + (((long) i2) * this.f36112to);
            this.f36102ck = 0;
        }

        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: k4 */
        private void m49334k4(byte[] bArr, int i, int i2, int i3, long j, int i4, int i5) {
            if (i2 == i) {
                this.f36106h4 = null;
                this.f36111m9 = 0;
                this.f36104dy = 0;
                this.f36101c5 = 0;
                this.f36107jd = 0L;
                return;
            }
            int i6 = this.f36108k4;
            if (j >= i6) {
                if (j >= i6) {
                    this.f36111m9 = i2;
                    this.f36106h4 = bArr;
                    this.f36104dy = i;
                    this.f36101c5 = i3;
                    this.f36107jd = j;
                    return;
                }
                return;
            }
            if (!this.f36113up.m56679kk() && !this.f36113up.m56675k4(i4, i5) && (i5 < this.f36113up.m56666dy() || i5 >= this.f36113up.m56670k4() || i4 >= this.f36113up.m56668h4())) {
                long j2 = this.f36110ks + j;
                this.f36110ks = j2;
                long j3 = this.f36112to;
                this.f36102ck = (int) ((j3 - (j2 % j3)) / 8);
                this.f36106h4 = null;
                this.f36111m9 = 0;
                this.f36104dy = 0;
                this.f36101c5 = 0;
                this.f36107jd = 0L;
                return;
            }
            int i7 = (int) (((long) i2) - ((long) i));
            this.f36111m9 = i7;
            this.f36106h4 = new byte[i7];
            int i8 = 0;
            while (i8 < this.f36111m9) {
                this.f36106h4[i8] = bArr[i];
                i8++;
                i++;
            }
            this.f36104dy = 0;
            this.f36101c5 = i3;
            this.f36107jd = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: k4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo23756k4(byte[] bArr, int i, int[] iArr, int[] iArr2) {
            int i2;
            int iM67507x1;
            if (iArr == null) {
                throw new ArgumentNullException("colors");
            }
            if (iArr.length - iArr2[0] <= 0) {
                throw new ArgumentOutOfRangeException("colors", "Cannot fill colors. Check the incoming array.");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException("endOffset", "Expected positive integer.");
            }
            int i3 = this.f36102ck;
            if (i3 > 0) {
                iM67507x1 = C14116yg.m67507x1(i, i3);
                this.f36110ks += (long) (iM67507x1 * 8);
                this.f36102ck -= iM67507x1;
            } else if (this.f36106h4 != null) {
                long j = this.f36107jd;
                int i4 = this.f36108k4;
                if (j >= i4) {
                    throw new InvalidOperationException("The method Convert was called incorrectly. Method FillLeftValues should be called first as there is some data pending to fill.");
                }
                long j2 = ((((long) i4) - j) + 7) / 8;
                long jM67492kk = C14116yg.m67492kk(i, j2);
                long j3 = ((long) this.f36111m9) + jM67492kk;
                byte[] bArr2 = new byte[(int) j3];
                int i5 = 0;
                while (i5 < this.f36111m9) {
                    bArr2[i5] = this.f36106h4[i5];
                    i5++;
                }
                int i6 = 0;
                while (i5 < j3) {
                    bArr2[i5] = bArr[i6];
                    this.f36111m9++;
                    i5++;
                    i6++;
                }
                this.f36106h4 = bArr2;
                long j4 = (jM67492kk * 8) + this.f36107jd;
                this.f36107jd = j4;
                if (jM67492kk == j2) {
                    long j5 = this.f36110ks;
                    long j6 = this.f36112to;
                    int i7 = (int) (j5 / j6);
                    long j7 = j5 % j6;
                    int i8 = this.f36108k4;
                    int i9 = (int) (j7 / ((long) i8));
                    int iM67507x12 = C14116yg.m67507x1((this.f36113up.m56679kk() ? this.f36114x1 : this.f36113up.m56668h4()) - i9, (int) (j4 / ((long) i8)));
                    if (i9 == 0) {
                        mo49330k4();
                    }
                    if (i9 < this.f36113up.m56681to()) {
                        int iM67507x13 = C14116yg.m67507x1(this.f36113up.m56681to() - i9, iM67507x12);
                        mo49331k4(bArr2, this.f36104dy, this.f36101c5, iM67507x13);
                        this.f36110ks += (long) (iM67507x13 * this.f36108k4);
                    } else {
                        int iM67507x14 = C14116yg.m67507x1(iM67507x12, iArr.length - iArr2[0]);
                        mo49332k4(iArr, iArr2, bArr2, this.f36104dy, this.f36101c5, iM67507x14);
                        this.f36110ks = i9 + iM67507x14 == this.f36114x1 ? ((long) (i7 + 1)) * this.f36112to : this.f36110ks + ((long) (this.f36108k4 * iM67507x14));
                    }
                    if (this.f36110ks % 8 > 0) {
                        i6--;
                    }
                    this.f36106h4 = null;
                    this.f36104dy = 0;
                    this.f36111m9 = 0;
                    this.f36101c5 = 0;
                    this.f36107jd = 0L;
                }
                iM67507x1 = i6;
            } else {
                i2 = 0;
                if (i2 < i) {
                    m49336k4(iArr, iArr2, bArr, i2, i);
                }
                this.f36115yj += i;
            }
            i2 = iM67507x1;
            if (i2 < i) {
            }
            this.f36115yj += i;
        }

        /* JADX INFO: renamed from: k4 */
        private void m49335k4(byte[] bArr, int[] iArr, long j, int[] iArr2, int[] iArr3) {
            int iM56666dy;
            long jM56681to;
            if (this.f36113up.m56675k4(iArr2[0], iArr3[0])) {
                this.f36105fa = this.f36110ks;
                return;
            }
            if (this.f36110ks >= this.f36105fa) {
                if (iArr3[0] < this.f36113up.m56666dy()) {
                    iM56666dy = this.f36113up.m56666dy();
                } else {
                    if (iArr3[0] < this.f36113up.m56670k4()) {
                        if (iArr2[0] < this.f36113up.m56681to()) {
                            iM56666dy = iArr3[0];
                        } else if (iArr3[0] + 1 != this.f36113up.m56670k4()) {
                            iM56666dy = iArr3[0] + 1;
                        }
                    }
                    jM56681to = ((long) this.f36109kk) * this.f36112to;
                    this.f36105fa = jM56681to;
                }
                jM56681to = (((long) iM56666dy) * this.f36112to) + ((long) (this.f36113up.m56681to() * this.f36108k4));
                this.f36105fa = jM56681to;
            }
            long j2 = this.f36110ks;
            long j3 = this.f36112to;
            long jM67492kk = C14116yg.m67492kk(((j / j3) * j3) + j2, this.f36105fa);
            long j4 = j - (jM67492kk - this.f36110ks);
            long j5 = this.f36112to;
            if ((jM67492kk % j5) + j4 >= j5) {
                long jM67492kk2 = C14116yg.m67492kk((j5 - (jM67492kk % j5)) + jM67492kk, this.f36105fa);
                j4 -= jM67492kk2 - jM67492kk;
                jM67492kk = jM67492kk2;
            }
            int i = this.f36108k4;
            long jM67492kk3 = C14116yg.m67492kk(((j4 / ((long) i)) * ((long) i)) + jM67492kk, this.f36105fa);
            long j6 = this.f36112to;
            int i2 = (int) (jM67492kk3 / j6);
            int i3 = (int) ((jM67492kk3 % j6) / ((long) this.f36108k4));
            int i4 = (int) ((jM67492kk3 / 8) - (this.f36110ks / 8));
            iArr[0] = iArr[0] + i4;
            if (i2 >= this.f36113up.m56666dy() && i2 < this.f36113up.m56670k4() && i3 < this.f36113up.m56668h4() && i3 > 0) {
                if (iArr3[0] < i2) {
                    int i5 = (int) ((jM67492kk3 - (((long) i2) * this.f36112to)) / 8);
                    mo49330k4();
                    mo49331k4(bArr, iArr[0] - i5, 0, i3);
                } else {
                    if (iArr2[0] == 0) {
                        mo49330k4();
                    }
                    mo49331k4(bArr, iArr[0] - i4, (int) (this.f36110ks % 8), i3 - iArr2[0]);
                }
            }
            iArr2[0] = i3;
            iArr3[0] = i2;
            this.f36110ks = jM67492kk3;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5899kk
        /* JADX INFO: renamed from: k4 */
        public void mo23757k4(int[] iArr, int[] iArr2) {
            byte[] bArr = this.f36106h4;
            if (bArr == null || this.f36107jd < this.f36108k4) {
                return;
            }
            m49336k4(iArr, iArr2, bArr, this.f36104dy, this.f36111m9);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
        /* JADX INFO: renamed from: k4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void m49336k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int iM49333k4;
            int i5;
            int i6;
            int i7;
            int iM67507x1;
            fa faVar = this;
            int[] iArr3 = iArr;
            long j = faVar.f36110ks;
            long j2 = faVar.f36112to;
            int i8 = (int) (j / j2);
            int i9 = (int) ((j % j2) / ((long) faVar.f36108k4));
            if (i8 >= faVar.f36109kk || i9 >= faVar.f36114x1) {
                return;
            }
            long j3 = 8;
            int i10 = (int) (j % 8);
            long j4 = i2;
            int i11 = i;
            long j5 = ((j4 - ((long) i11)) * 8) - ((long) i10);
            int i12 = i10;
            while (true) {
                long j6 = j3;
                if (j5 < faVar.f36108k4 || iArr2[0] >= iArr3.length) {
                    break;
                }
                if (faVar.f36113up.m56679kk()) {
                    i3 = 0;
                    iM49333k4 = C14116yg.m67507x1(faVar.f36114x1 - i9, (int) (j5 / ((long) faVar.f36108k4)));
                    i6 = i11;
                    i4 = i8;
                    i5 = i12;
                } else {
                    i3 = 0;
                    int[] iArr4 = {i11};
                    int i13 = i8;
                    int[] iArr5 = {i9};
                    int[] iArr6 = {i13};
                    faVar.m49335k4(bArr, iArr4, j5, iArr5, iArr6);
                    int i14 = iArr4[0];
                    int i15 = iArr5[0];
                    i4 = iArr6[0];
                    long j7 = faVar.f36110ks;
                    if (j7 == faVar.f36105fa) {
                        int i16 = (int) (j7 % j6);
                        i7 = i15;
                        iM49333k4 = faVar.m49333k4(i14, j4, i16, i7);
                        i6 = i14;
                        i5 = i16;
                        iM67507x1 = C14116yg.m67507x1(iM49333k4, iArr3.length - iArr2[i3]);
                        if (iM67507x1 <= 0) {
                            if (i7 == 0) {
                                mo49330k4();
                            }
                            faVar = this;
                            faVar.mo49332k4(iArr3, iArr2, bArr, i6, i5, iM67507x1);
                            int i17 = faVar.f36108k4;
                            i11 = (((iM67507x1 * i17) + i5) / 8) + i6;
                            i7 += iM67507x1;
                            long j8 = faVar.f36110ks + ((long) (iM67507x1 * i17));
                            faVar.f36110ks = j8;
                            if (i7 == faVar.f36114x1) {
                                i4++;
                                long j9 = faVar.f36103du;
                                if (j9 > 0) {
                                    i11++;
                                    faVar.f36110ks = j8 + j9;
                                }
                                i9 = i3;
                            }
                            i8 = i4;
                            i12 = (int) (faVar.f36110ks % j6);
                            j5 = ((i2 - i11) * 8) - i12;
                            iArr3 = iArr;
                            j3 = j6;
                        } else {
                            faVar = this;
                            i11 = i6;
                        }
                        i9 = i7;
                        i8 = i4;
                        i12 = (int) (faVar.f36110ks % j6);
                        j5 = ((i2 - i11) * 8) - i12;
                        iArr3 = iArr;
                        j3 = j6;
                    } else {
                        i9 = i15;
                        iM49333k4 = 0;
                        i5 = i12;
                        i6 = i14;
                    }
                }
                i7 = i9;
                iM67507x1 = C14116yg.m67507x1(iM49333k4, iArr3.length - iArr2[i3]);
                if (iM67507x1 <= 0) {
                }
                i9 = i7;
                i8 = i4;
                i12 = (int) (faVar.f36110ks % j6);
                j5 = ((i2 - i11) * 8) - i12;
                iArr3 = iArr;
                j3 = j6;
            }
            faVar.m49334k4(bArr, i11, i2, i12, j5, i9, i8);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$h4 */
    public static class h4 extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36116k4;

        public h4(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36116k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6 = 0;
            int i7 = i;
            int i8 = 0;
            while (i8 < i3) {
                byte b = bArr[i7 + 4];
                if (b == 0) {
                    int i9 = iArr2[i6];
                    iArr2[i6] = i9 + 1;
                    iArr[i9] = i6;
                    i4 = i6;
                    i5 = i7;
                } else {
                    int i10 = b & 255;
                    int i11 = bArr[i7] & 255;
                    int i12 = bArr[i7 + 1] & 255;
                    int i13 = bArr[i7 + 2] & 255;
                    double d = (255.0d / ((double) i10)) * 255.0d;
                    i4 = i6;
                    i5 = i7;
                    double d2 = 1.0d - (((double) (bArr[i7 + 3] & 255)) / 255.0d);
                    int i14 = (int) ((1.0d - (((double) i11) / 255.0d)) * d * d2);
                    int i15 = (int) ((1.0d - (((double) i12) / 255.0d)) * d * d2);
                    int i16 = (int) (d2 * (1.0d - (((double) i13) / 255.0d)) * d);
                    if (i14 > 255) {
                        i14 = 255;
                    }
                    if (i15 > 255) {
                        i15 = 255;
                    }
                    if (i16 > 255) {
                        i16 = 255;
                    }
                    int i17 = iArr2[i4];
                    iArr2[i4] = i17 + 1;
                    iArr[i17] = (i16 & 255) | (i10 << 24) | ((i14 & 255) << 16) | ((i15 & 255) << 8);
                }
                i7 = i5 + this.f36116k4;
                i8++;
                i6 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$ix */
    public static class ix extends fa {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC5900x1 f36117k4;

        public ix(int i, int i2, int i3, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36117k4 = interfaceC5900x1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36117k4.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36117k4.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr3 = {i};
                byte[] bArrMo23762k4 = this.f36117k4.mo23762k4(bArr, iArr3);
                i = iArr3[0];
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = (bArrMo23762k4[2] & 255) | ((bArrMo23762k4[0] & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArrMo23762k4[1] & 255) << 8);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$jd */
    public static class jd extends c5 {

        /* JADX INFO: renamed from: du */
        private byte f36118du;

        /* JADX INFO: renamed from: kk */
        private byte f36119kk;

        /* JADX INFO: renamed from: to */
        private byte f36120to;

        /* JADX INFO: renamed from: x1 */
        private byte f36121x1;

        public jd(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36121x1 = (byte) 0;
            this.f36119kk = (byte) 0;
            this.f36120to = (byte) 0;
            this.f36118du = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36121x1 = (byte) ((bArr[i] & 255) + (this.f36121x1 & 255));
                this.f36119kk = (byte) ((bArr[i + 1] & 255) + (this.f36119kk & 255));
                this.f36120to = (byte) ((bArr[i + 2] & 255) + (this.f36120to & 255));
                this.f36118du = (byte) ((bArr[i + 3] & 255) + (this.f36118du & 255));
                i += ((c5) this).f36095k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.c5, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                this.f36121x1 = (byte) ((bArr[i4] & 255) + (this.f36121x1 & 255));
                this.f36119kk = (byte) ((bArr[i4 + 1] & 255) + (this.f36119kk & 255));
                this.f36120to = (byte) ((bArr[i4 + 2] & 255) + (this.f36120to & 255));
                this.f36118du = (byte) ((bArr[i4 + 3] & 255) + (this.f36118du & 255));
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = ((((byte) ((1.0d - (((double) (r7 & 255)) / 255.0d)) * ((1.0d - (((double) (r4 & 255)) / 255.0d)) * 255.0d))) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((((byte) ((1.0d - (((double) (r7 & 255)) / 255.0d)) * ((1.0d - (((double) (r5 & 255)) / 255.0d)) * 255.0d))) & 255) << 8) | (((byte) ((1.0d - (((double) (r7 & 255)) / 255.0d)) * (1.0d - (((double) (r6 & 255)) / 255.0d)) * 255.0d)) & 255);
                i4 += ((c5) this).f36095k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$k4 */
    public static class k4 implements InterfaceC5900x1 {

        /* JADX INFO: renamed from: du */
        private int f36122du;

        /* JADX INFO: renamed from: h4 */
        private int f36123h4;

        /* JADX INFO: renamed from: k4 */
        private final int[] f36124k4;

        /* JADX INFO: renamed from: kk */
        private int f36125kk;

        /* JADX INFO: renamed from: to */
        private int f36126to;

        /* JADX INFO: renamed from: x1 */
        private final double[] f36127x1;

        public k4(int[] iArr, double[] dArr) {
            if (iArr.length != dArr.length) {
                throw new ArgumentException("The channelBits and channelConversionFunction lengths are different.");
            }
            this.f36124k4 = iArr;
            this.f36127x1 = dArr;
            for (int i : iArr) {
                this.f36125kk += i & 65535;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public int mo49338k4(int i) {
            return 0;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: x1 */
        public int[] mo23763x1() {
            return this.f36124k4;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: k4 */
        public void mo23760k4() {
            this.f36126to = 0;
            this.f36122du = 0;
            this.f36123h4 = 0;
        }

        /* JADX INFO: renamed from: k4 */
        public void mo49339k4(int i, byte b) {
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: k4 */
        public void mo23761k4(byte[] bArr, int i, int i2, int i3) {
            this.f36123h4 = ((i3 * this.f36125kk) + i2) % 8;
        }

        /* JADX INFO: renamed from: k4 */
        public void m49340k4(byte[] bArr, byte[] bArr2, int[] iArr, int i, int i2) {
            int i3 = (1 << (8 - i)) - 1;
            int i4 = i2 * this.f36125kk;
            while (i4 > 0) {
                int i5 = 0;
                while (true) {
                    int[] iArr2 = this.f36124k4;
                    if (i5 < iArr2.length) {
                        int i6 = iArr2[i5] & 65535;
                        while (this.f36126to < i6) {
                            int i7 = 8 - i;
                            int i8 = this.f36122du << i7;
                            this.f36122du = i8;
                            this.f36122du = (i3 & bArr2[iArr[0]] & 255) | i8;
                            int iM67507x1 = C14116yg.m67507x1(i7, i4);
                            i += iM67507x1;
                            if (i < 8) {
                                this.f36122du >>= i7 - iM67507x1;
                            }
                            this.f36126to += iM67507x1;
                            i4 -= iM67507x1;
                            if (i == 8) {
                                iArr[0] = iArr[0] + 1;
                                i = 0;
                                i3 = 255;
                            } else {
                                i3 = (1 << (8 - i)) - 1;
                            }
                        }
                        while (true) {
                            int i9 = this.f36126to;
                            if (i9 >= i6) {
                                byte bMo49338k4 = (byte) (((int) ((this.f36127x1[i5] * ((double) ((this.f36122du >> (i9 - i6)) & ((1 << i6) - 1)))) + 0.5d)) + mo49338k4(i5));
                                mo49339k4(i5, bMo49338k4);
                                if (bArr != null) {
                                    bArr[i5] = bMo49338k4;
                                }
                                i5++;
                                this.f36126to -= i6;
                                int[] iArr3 = this.f36124k4;
                                if (i5 == iArr3.length) {
                                    break;
                                } else {
                                    i6 = iArr3[i5] & 65535;
                                }
                            }
                        }
                    }
                }
            }
            this.f36123h4 = i;
        }

        @Override // com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: k4 */
        public byte[] mo23762k4(byte[] bArr, int[] iArr) {
            byte[] bArr2 = new byte[this.f36124k4.length];
            m49340k4(bArr2, bArr, iArr, this.f36123h4, 1);
            return bArr2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$kk */
    public static class kk extends fa {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC5900x1 f36128k4;

        /* JADX INFO: renamed from: x1 */
        private double[] f36129x1;

        public kk(int i, int i2, int i3, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36128k4 = interfaceC5900x1;
        }

        /* JADX INFO: renamed from: k4 */
        private C12003du m49341k4(double d, double d2, double d3) {
            m49343x1(d, d2, d3);
            double[] dArr = this.f36129x1;
            return m49342kk(dArr[0], dArr[1], dArr[2]);
        }

        /* JADX INFO: renamed from: kk */
        private C12003du m49342kk(double d, double d2, double d3) {
            double d4 = d / 100.0d;
            double d5 = d2 / 100.0d;
            double d6 = d3 / 100.0d;
            double d7 = ((-0.4986d) * d6) + ((-1.5372d) * d5) + (3.2406d * d4);
            double d8 = (0.0415d * d6) + (1.8758d * d5) + ((-0.9689d) * d4);
            double d9 = (d6 * 1.057d) + (d5 * (-0.204d)) + (d4 * 0.0557d);
            double dM67469du = (d7 > 0.0031308d ? (C14116yg.m67469du(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d;
            double dM67469du2 = (d8 > 0.0031308d ? (C14116yg.m67469du(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d;
            double dM67469du3 = (d9 > 0.0031308d ? (C14116yg.m67469du(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d;
            if (dM67469du >= 255.0d) {
                dM67469du = 255.0d;
            }
            if (dM67469du2 >= 255.0d) {
                dM67469du2 = 255.0d;
            }
            double d10 = dM67469du3 < 255.0d ? dM67469du3 : 255.0d;
            if (dM67469du < 0.0d) {
                dM67469du = 0.0d;
            }
            if (dM67469du2 < 0.0d) {
                dM67469du2 = 0.0d;
            }
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            return C13598dy.m62725k4(((byte) dM67469du) & 255, ((byte) dM67469du2) & 255, ((byte) d10) & 255);
        }

        /* JADX INFO: renamed from: x1 */
        private void m49343x1(double d, double d2, double d3) {
            double d4 = (d + 16.0d) / 116.0d;
            double d5 = (d2 / 500.0d) + d4;
            double d6 = d4 - (d3 / 200.0d);
            this.f36129x1 = new double[]{(C14116yg.m67469du(d5, 3.0d) > 0.008856d ? C14116yg.m67469du(d5, 3.0d) : (d5 - 0.13793103448275862d) / 7.787d) * 95.047d, (C14116yg.m67469du(d4, 3.0d) > 0.008856d ? C14116yg.m67469du(d4, 3.0d) : (d4 - 0.13793103448275862d) / 7.787d) * 100.0d, (C14116yg.m67469du(d6, 3.0d) > 0.008856d ? C14116yg.m67469du(d6, 3.0d) : (d6 - 0.13793103448275862d) / 7.787d) * 108.883d};
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36128k4.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36128k4.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                int[] iArr3 = {i4};
                byte[] bArrMo23762k4 = this.f36128k4.mo23762k4(bArr, iArr3);
                i4 = iArr3[0];
                bArrMo23762k4[0] = (byte) (((((double) (bArrMo23762k4[0] & 255)) * 100.0d) / 255.0d) + 0.5d);
                C10052k4.m49680k4(bArrMo23762k4, 0, new byte[bArrMo23762k4.length], 0, bArrMo23762k4.length);
                C12003du c12003duM49341k4 = m49341k4(r6[0], r6[1], r6[2]);
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = C13598dy.m62724k4(c12003duM49341k4);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$ks */
    public static class ks extends fa {

        /* JADX INFO: renamed from: k4 */
        private final int[][] f36130k4;

        public ks(int i, int i2, int i3, int[][] iArr, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36130k4 = iArr;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr3 = this.f36130k4[((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) & 65535];
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = iArr3[0];
                i += 2;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$m9 */
    public static class m9 extends h4 {

        /* JADX INFO: renamed from: du */
        private byte f36131du;

        /* JADX INFO: renamed from: h4 */
        private byte f36132h4;

        /* JADX INFO: renamed from: kk */
        private byte f36133kk;

        /* JADX INFO: renamed from: to */
        private byte f36134to;

        /* JADX INFO: renamed from: x1 */
        private byte f36135x1;

        public m9(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36131du = (byte) 0;
            this.f36135x1 = (byte) 0;
            this.f36133kk = (byte) 0;
            this.f36134to = (byte) 0;
            this.f36132h4 = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36135x1 = (byte) ((bArr[i] & 255) + (this.f36135x1 & 255));
                this.f36133kk = (byte) ((bArr[i + 1] & 255) + (this.f36133kk & 255));
                this.f36134to = (byte) ((bArr[i + 2] & 255) + (this.f36134to & 255));
                this.f36131du = (byte) ((bArr[i + 3] & 255) + (this.f36131du & 255));
                this.f36132h4 = (byte) ((bArr[i + 4] & 255) + (this.f36132h4 & 255));
                i += ((h4) this).f36116k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.h4, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                byte b = (byte) ((bArr[i4] & 255) + (this.f36135x1 & 255));
                this.f36135x1 = b;
                byte b2 = (byte) ((bArr[i4 + 1] & 255) + (this.f36133kk & 255));
                this.f36133kk = b2;
                byte b3 = (byte) ((bArr[i4 + 2] & 255) + (this.f36134to & 255));
                this.f36134to = b3;
                byte b4 = (byte) ((bArr[i4 + 3] & 255) + (this.f36131du & 255));
                this.f36131du = b4;
                byte b5 = (byte) ((bArr[i4 + 4] & 255) + (this.f36132h4 & 255));
                this.f36132h4 = b5;
                double d = b5 != 0 ? 255.0d / ((double) (b5 & 255)) : 0.0d;
                int i6 = i4;
                int i7 = (int) ((1.0d - (((double) (b4 & 255)) / 255.0d)) * (1.0d - (((double) (b & 255)) / 255.0d)) * 255.0d * d);
                int i8 = (int) ((1.0d - (((double) (b4 & 255)) / 255.0d)) * (1.0d - (((double) (b2 & 255)) / 255.0d)) * 255.0d * d);
                int i9 = (int) ((1.0d - (((double) (b4 & 255)) / 255.0d)) * (1.0d - (((double) (b3 & 255)) / 255.0d)) * 255.0d * d);
                if (i7 > 255) {
                    i7 = 255;
                }
                if (i8 > 255) {
                    i8 = 255;
                }
                if (i9 > 255) {
                    i9 = 255;
                }
                int i10 = iArr2[0];
                iArr2[0] = i10 + 1;
                iArr[i10] = ((i7 & 255) << 16) | ((b5 & 255) << 24) | ((i8 & 255) << 8) | (i9 & 255);
                i4 = i6 + ((h4) this).f36116k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$ne */
    public static class ne extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36136k4;

        public ne(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne);
            this.f36136k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = 0;
                while (i5 < this.f36136k4) {
                    int i6 = iArr2[0];
                    iArr[i6] = ((bArr[i] & 255) << (24 - (i5 * 8))) | iArr[i6];
                    i5++;
                    i++;
                }
                iArr2[0] = iArr2[0] + 1;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$qq */
    public static class qq extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36137k4;

        public qq(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36137k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = ((bArr[i + 3] & 255) << 24) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
                i += this.f36137k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$rv */
    public static class rv extends fa {

        /* JADX INFO: renamed from: k4 */
        private final int[] f36138k4;

        /* JADX INFO: renamed from: x1 */
        private int f36139x1;

        public rv(int i, int i2, int i3, int[] iArr, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36138k4 = iArr;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36139x1 = 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36139x1 = (this.f36139x1 & 65535) + ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
                i += 2;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = (this.f36139x1 & 65535) + ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
                this.f36139x1 = i5;
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = this.f36138k4[i5 & 65535];
                i += 2;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$to */
    public static class to extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36140k4;

        /* JADX INFO: renamed from: x1 */
        private double[] f36141x1;

        public to(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36140k4 = i / 8;
        }

        /* JADX INFO: renamed from: kk */
        private C12003du m49344kk(double d, double d2, double d3) {
            double d4 = d / 100.0d;
            double d5 = d2 / 100.0d;
            double d6 = d3 / 100.0d;
            double d7 = ((-0.4986d) * d6) + ((-1.5372d) * d5) + (3.2406d * d4);
            double d8 = (0.0415d * d6) + (1.8758d * d5) + ((-0.9689d) * d4);
            double d9 = (d6 * 1.057d) + (d5 * (-0.204d)) + (d4 * 0.0557d);
            double dM67469du = (d7 > 0.0031308d ? (C14116yg.m67469du(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d;
            double dM67469du2 = (d8 > 0.0031308d ? (C14116yg.m67469du(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d;
            double dM67469du3 = (d9 > 0.0031308d ? (C14116yg.m67469du(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d;
            if (dM67469du >= 255.0d) {
                dM67469du = 255.0d;
            }
            if (dM67469du2 >= 255.0d) {
                dM67469du2 = 255.0d;
            }
            double d10 = dM67469du3 < 255.0d ? dM67469du3 : 255.0d;
            if (dM67469du < 0.0d) {
                dM67469du = 0.0d;
            }
            if (dM67469du2 < 0.0d) {
                dM67469du2 = 0.0d;
            }
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            return C13598dy.m62725k4(((byte) dM67469du) & 255, ((byte) dM67469du2) & 255, ((byte) d10) & 255);
        }

        /* JADX INFO: renamed from: x1 */
        private void m49345x1(double d, double d2, double d3) {
            double d4 = (d + 16.0d) / 116.0d;
            double d5 = (d2 / 500.0d) + d4;
            double d6 = d4 - (d3 / 200.0d);
            this.f36141x1 = new double[]{(C14116yg.m67469du(d5, 3.0d) > 0.008856d ? C14116yg.m67469du(d5, 3.0d) : (d5 - 0.13793103448275862d) / 7.787d) * 95.047d, (C14116yg.m67469du(d4, 3.0d) > 0.008856d ? C14116yg.m67469du(d4, 3.0d) : (d4 - 0.13793103448275862d) / 7.787d) * 100.0d, (C14116yg.m67469du(d6, 3.0d) > 0.008856d ? C14116yg.m67469du(d6, 3.0d) : (d6 - 0.13793103448275862d) / 7.787d) * 108.883d};
        }

        /* JADX INFO: renamed from: k4 */
        public C12003du m49346k4(double d, double d2, double d3) {
            m49345x1(d, d2, d3);
            double[] dArr = this.f36141x1;
            return m49344kk(dArr[0], dArr[1], dArr[2]);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                byte b = (byte) (((((double) (bArr[i4] & 255)) * 100.0d) / 255.0d) + 0.5d);
                bArr[i4] = b;
                C10052k4.m49680k4(new byte[]{b, bArr[i4 + 1], bArr[i4 + 2]}, 0, new byte[3], 0, 3);
                C12003du c12003duM49346k4 = m49346k4(r8[0], r8[1], r8[2]);
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = C13598dy.m62724k4(c12003duM49346k4);
                i4 += this.f36140k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$u4 */
    public static class u4 extends fa {

        /* JADX INFO: renamed from: k4 */
        protected final int f36142k4;

        public u4(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36142k4 = i / 8;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = ((bArr[i] & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
                i += this.f36142k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$um */
    public static class um extends fa {

        /* JADX INFO: renamed from: k4 */
        private final double f36143k4;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC5900x1 f36144x1;

        public um(int i, int i2, int i3, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36144x1 = interfaceC5900x1;
            this.f36143k4 = (1 << (interfaceC5900x1.mo23763x1()[3] & 65535)) - 1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36144x1.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36144x1.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = i;
                if (i6 >= i3) {
                    return;
                }
                int[] iArr3 = {i7};
                byte[] bArrMo23762k4 = this.f36144x1.mo23762k4(bArr, iArr3);
                int i8 = iArr3[i5];
                byte b = bArrMo23762k4[3];
                if (b == 0) {
                    int i9 = iArr2[i5];
                    iArr2[i5] = i9 + 1;
                    iArr[i9] = i5;
                    i4 = i5;
                    i = i8;
                } else {
                    int i10 = b & 255;
                    double d = this.f36143k4 / ((double) i10);
                    int i11 = (int) ((((double) (bArrMo23762k4[i5] & 255)) * d) + 0.5d);
                    int i12 = (int) ((((double) (bArrMo23762k4[1] & 255)) * d) + 0.5d);
                    i4 = i5;
                    i = i8;
                    int i13 = (int) ((((double) (bArrMo23762k4[2] & 255)) * d) + 0.5d);
                    if (i11 > 255) {
                        i11 = 255;
                    }
                    if (i12 > 255) {
                        i12 = 255;
                    }
                    if (i13 > 255) {
                        i13 = 255;
                    }
                    if (i10 > 255) {
                        b = -1;
                    }
                    int i14 = iArr2[i4];
                    iArr2[i4] = i14 + 1;
                    iArr[i14] = i13 | ((b & 255) << 24) | (i11 << 16) | (i12 << 8);
                }
                i6++;
                i5 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$up */
    public static class up extends fa {

        /* JADX INFO: renamed from: k4 */
        private final int[] f36145k4;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC5900x1 f36146x1;

        public up(int i, int i2, int i3, int[] iArr, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36145k4 = iArr;
            this.f36146x1 = interfaceC5900x1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36146x1.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36146x1.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr3 = {i};
                byte[] bArrMo23762k4 = this.f36146x1.mo23762k4(bArr, iArr3);
                i = iArr3[0];
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = this.f36145k4[bArrMo23762k4[0] & 255];
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$uz */
    public static class uz extends u4 {

        /* JADX INFO: renamed from: kk */
        private byte f36147kk;

        /* JADX INFO: renamed from: to */
        private byte f36148to;

        /* JADX INFO: renamed from: x1 */
        private byte f36149x1;

        public uz(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36149x1 = (byte) 0;
            this.f36147kk = (byte) 0;
            this.f36148to = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36149x1 = (byte) ((bArr[i] & 255) + (this.f36149x1 & 255));
                this.f36147kk = (byte) ((bArr[i + 1] & 255) + (this.f36147kk & 255));
                this.f36148to = (byte) ((bArr[i + 2] & 255) + (this.f36148to & 255));
                i += ((u4) this).f36142k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.u4, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = (byte) ((bArr[i] & 255) + (this.f36149x1 & 255));
                this.f36149x1 = b;
                byte b2 = (byte) ((bArr[i + 1] & 255) + (this.f36147kk & 255));
                this.f36147kk = b2;
                byte b3 = (byte) ((bArr[i + 2] & 255) + (this.f36148to & 255));
                this.f36148to = b3;
                int i5 = iArr2[0];
                iArr2[0] = i5 + 1;
                iArr[i5] = ((b & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((b2 & 255) << 8) | (b3 & 255);
                i += ((u4) this).f36142k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$v4 */
    public static class v4 extends bv {

        /* JADX INFO: renamed from: du */
        private byte f36150du;

        /* JADX INFO: renamed from: kk */
        private byte f36151kk;

        /* JADX INFO: renamed from: to */
        private byte f36152to;

        /* JADX INFO: renamed from: x1 */
        private byte f36153x1;

        public v4(int i, int i2, int i3, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36150du = (byte) 0;
            this.f36153x1 = (byte) 0;
            this.f36151kk = (byte) 0;
            this.f36152to = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f36150du = (byte) ((bArr[i + 3] & 255) + (this.f36150du & 255));
                this.f36153x1 = (byte) ((bArr[i] & 255) + (this.f36153x1 & 255));
                this.f36151kk = (byte) ((bArr[i + 1] & 255) + (this.f36151kk & 255));
                this.f36152to = (byte) ((bArr[i + 2] & 255) + (this.f36152to & 255));
                i += ((bv) this).f36094k4;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.bv, com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = i;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = 255;
                byte b = (byte) ((bArr[i4 + 3] & 255) + (this.f36150du & 255));
                this.f36150du = b;
                byte b2 = (byte) ((bArr[i4] & 255) + (this.f36153x1 & 255));
                this.f36153x1 = b2;
                byte b3 = (byte) ((bArr[i4 + 1] & 255) + (this.f36151kk & 255));
                this.f36151kk = b3;
                byte b4 = (byte) ((bArr[i4 + 2] & 255) + (this.f36152to & 255));
                this.f36152to = b4;
                double d = b != 0 ? 255.0d / ((double) (b & 255)) : 0.0d;
                int i7 = (int) ((((double) (b2 & 255)) * d) + 0.5d);
                int i8 = (int) ((((double) (b3 & 255)) * d) + 0.5d);
                int i9 = (int) ((((double) (b4 & 255)) * d) + 0.5d);
                if (i7 > 255) {
                    i7 = 255;
                }
                if (i8 > 255) {
                    i8 = 255;
                }
                if (i9 <= 255) {
                    i6 = i9;
                }
                int i10 = iArr2[0];
                iArr2[0] = i10 + 1;
                iArr[i10] = ((b & 255) << 24) | (i7 << 16) | (i8 << 8) | i6;
                i4 += ((bv) this).f36094k4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$wl */
    public static class wl extends fa {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC5900x1 f36154k4;

        public wl(int i, int i2, int i3, C12014ne c12014ne, InterfaceC5900x1 interfaceC5900x1) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36154k4 = interfaceC5900x1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36154k4.mo23760k4();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            this.f36154k4.mo23761k4(bArr, i, i2, i3);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr3 = {i};
                byte[] bArrMo23762k4 = this.f36154k4.mo23762k4(bArr, iArr3);
                i = iArr3[0];
                int i5 = bArrMo23762k4[3] & 255;
                int i6 = bArrMo23762k4[0] & 255;
                int i7 = bArrMo23762k4[1] & 255;
                int i8 = bArrMo23762k4[2] & 255;
                int i9 = iArr2[0];
                iArr2[0] = i9 + 1;
                iArr[i9] = i8 | (i5 << 24) | (i6 << 16) | (i7 << 8);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$x1 */
    public static class x1 extends k4 {

        /* JADX INFO: renamed from: k4 */
        private final byte[] f36155k4;

        public x1(int[] iArr, double[] dArr) {
            super(iArr, dArr);
            this.f36155k4 = new byte[iArr.length];
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.k4
        /* JADX INFO: renamed from: k4 */
        public int mo49338k4(int i) {
            return this.f36155k4[i] & 255;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.k4, com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: k4 */
        public void mo23760k4() {
            int i = 0;
            while (true) {
                byte[] bArr = this.f36155k4;
                if (i >= bArr.length) {
                    super.mo23760k4();
                    return;
                } else {
                    bArr[i] = 0;
                    i++;
                }
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.k4
        /* JADX INFO: renamed from: k4 */
        public void mo49339k4(int i, byte b) {
            this.f36155k4[i] = b;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.k4, com.aspose.slides.internal.p236kq.InterfaceC5900x1
        /* JADX INFO: renamed from: k4 */
        public void mo23761k4(byte[] bArr, int i, int i2, int i3) {
            m49340k4(null, bArr, new int[]{i}, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$x6 */
    public static class x6 extends fa {

        /* JADX INFO: renamed from: k4 */
        private byte f36156k4;

        /* JADX INFO: renamed from: kk */
        private final int[] f36157kk;

        /* JADX INFO: renamed from: x1 */
        private final byte f36158x1;

        public x6(int i, int i2, int i3, int[] iArr, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36158x1 = (byte) ((1 << i) - 1);
            this.f36157kk = iArr;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49330k4() {
            this.f36156k4 = (byte) 0;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49331k4(byte[] bArr, int i, int i2, int i3) {
            int iM49337kk = m49337kk();
            while (i3 > 0) {
                int i4 = 8 - i2;
                int iM67507x1 = C14116yg.m67507x1(i3, i4 / iM49337kk);
                int i5 = bArr[i];
                for (int i6 = 1; i6 <= iM67507x1; i6++) {
                    byte b = this.f36158x1;
                    this.f36156k4 = (byte) (((byte) ((this.f36156k4 & 255) + (((byte) (((i5 & 255) >> (i4 - (i6 * iM49337kk))) & b & 255)) & 255))) & b);
                }
                int i7 = (iM67507x1 * iM49337kk) + i2;
                if (i7 == 8) {
                    i++;
                    i2 = 0;
                } else {
                    i2 = i7;
                }
                i3 -= iM67507x1;
            }
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int iM49337kk = m49337kk();
            while (i3 > 0) {
                int i4 = 8 - i2;
                int iM67507x1 = C14116yg.m67507x1(i3, i4 / iM49337kk);
                int i5 = bArr[i];
                for (int i6 = 1; i6 <= iM67507x1; i6++) {
                    byte b = this.f36158x1;
                    byte b2 = (byte) (((byte) ((this.f36156k4 & 255) + (((byte) (((i5 & 255) >> (i4 - (i6 * iM49337kk))) & b & 255)) & 255))) & b);
                    this.f36156k4 = b2;
                    int i7 = iArr2[0];
                    iArr2[0] = i7 + 1;
                    iArr[i7] = this.f36157kk[b2 & 255];
                }
                int i8 = (iM67507x1 * iM49337kk) + i2;
                if (i8 == 8) {
                    i++;
                    i2 = 0;
                } else {
                    i2 = i8;
                }
                i3 -= iM67507x1;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.k4$yj */
    public static class yj extends fa {

        /* JADX INFO: renamed from: k4 */
        private final int[][] f36159k4;

        public yj(int i, int i2, int i3, int[][] iArr, C12014ne c12014ne) {
            super(i, i2, i3, c12014ne.Clone());
            this.f36159k4 = iArr;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10035k4.fa
        /* JADX INFO: renamed from: k4 */
        public void mo49332k4(int[] iArr, int[] iArr2, byte[] bArr, int i, int i2, int i3) {
            int i4 = 0;
            while (i4 < i3) {
                int iM67507x1 = C14116yg.m67507x1(i3 - i4, (8 - i2) / m49337kk());
                int[] iArr3 = this.f36159k4[bArr[i] & 255];
                int iM49337kk = i2 / m49337kk();
                int i5 = 0;
                while (i5 < iM67507x1) {
                    int i6 = iArr2[0];
                    iArr2[0] = i6 + 1;
                    iArr[i6] = iArr3[iM49337kk];
                    i5++;
                    iM49337kk++;
                }
                i4 += iM67507x1;
                int iM49337kk2 = (m49337kk() * iM67507x1) + i2;
                if (iM49337kk2 == 8) {
                    i++;
                    i2 = 0;
                } else {
                    i2 = iM49337kk2;
                }
            }
        }
    }

    public AbstractC10035k4(C6740x1 c6740x1, int i, int i2) {
        if (c6740x1 == null) {
            throw new ArgumentNullException("options");
        }
        if (c6740x1.m26556ar() == 0) {
            throw new IllegalArgumentException("The bits per sample are not defined.");
        }
        if (c6740x1.m26559ck() != 1) {
            throw new IllegalArgumentException("Only contiguous planar configuration is supported at the moment.");
        }
        this.f36089x1 = c6740x1.m26560du();
        this.f36086k4 = c6740x1;
        this.f36087kk = i;
        this.f36088to = i2;
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC5899kk m49318kk(C6740x1 c6740x1, C12014ne c12014ne) {
        int[] iArrM26586to = c6740x1.m26586to();
        if (iArrM26586to.length < 3 || c6740x1.m26580m9() != 0) {
            return null;
        }
        int iM26556ar = c6740x1.m26556ar();
        return (iM26556ar >= 24 && iM26556ar % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (65535 & iArrM26586to[2]) == 8) ? c6740x1.m26567ix() == 2 ? new du(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new to(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new kk(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, m49317k4(iArrM26586to)));
    }

    /* JADX INFO: renamed from: du */
    public int m49324du() {
        return m49313k4(this.f36086k4);
    }

    /* JADX INFO: renamed from: k4 */
    public int m49325k4() {
        return this.f36087kk;
    }

    /* JADX INFO: renamed from: to */
    public int m49328to() {
        return this.f36089x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m49329x1() {
        return this.f36088to;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m49313k4(C6740x1 c6740x1) {
        int iM26587u4 = (int) (c6740x1.m26587u4() & 4294967295L);
        long jM26564fa = c6740x1.m26564fa() & 4294967295L;
        int i = jM26564fa > 2147483647L ? Integer.MAX_VALUE : (int) jM26564fa;
        return (i == 0 || i > iM26587u4) ? iM26587u4 : i;
    }

    /* JADX INFO: renamed from: to */
    private static int[][] m49320to(C6740x1 c6740x1) {
        int i;
        int i2;
        int i3;
        double d;
        int i4;
        int iM26556ar = c6740x1.m26556ar();
        int iM67469du = (int) C14116yg.m67469du(2.0d, iM26556ar);
        int i5 = 8 / iM26556ar;
        if (iM26556ar == 16) {
            i3 = 65536;
            i = 65536;
            d = 257.0d;
            i2 = 1;
            i4 = 16;
        } else {
            i = 256;
            i2 = i5;
            i3 = 255;
            d = 1.0d;
            i4 = 8;
        }
        int[] iArr = new int[iM67469du];
        double d2 = (-(255.0d * d)) / ((double) (iM67469du - 1));
        if (c6740x1.m26568jd() == 1) {
            d2 *= -1.0d;
            i3 = 0;
        }
        int i6 = i2;
        double d3 = i3;
        for (int i7 = 0; i7 < iM67469du; i7++) {
            int i8 = (int) ((d3 / d) + 0.5d);
            iArr[i7] = i8 | (i8 << 8) | (i8 << 16) | ViewCompat.MEASURED_STATE_MASK;
            d3 += d2;
        }
        boolean z = iM26556ar == 1 || iM26556ar == 2 || iM26556ar == 4 || iM26556ar == 8 || iM26556ar == 16;
        if (c6740x1.m26567ix() == 2 || !z) {
            return new int[][]{iArr};
        }
        int[][] iArr2 = new int[i][];
        int i9 = (1 << iM26556ar) - 1;
        int i10 = 0;
        while (i10 < i) {
            int i11 = i6;
            iArr2[i10] = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr2[i10][i12] = iArr[(i10 >> (i4 - (i13 * iM26556ar))) & i9];
                i12 = i13;
            }
            i10++;
            i6 = i11;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5899kk m49321x1(C6740x1 c6740x1, C12014ne c12014ne) {
        int[] iArrM26586to = c6740x1.m26586to();
        if (c6740x1.m26580m9() != 1 || iArrM26586to.length < 4) {
            if (iArrM26586to.length < 4 || c6740x1.m26580m9() != 0) {
                return null;
            }
            int iM26556ar = c6740x1.m26556ar();
            return (iM26556ar >= 32 && iM26556ar % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8 && (iArrM26586to[3] & 65535) == 8) ? c6740x1.m26567ix() == 2 ? new jd(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new ck(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone(), c6740x1.m26591wl()) : new dy(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, m49317k4(iArrM26586to)));
        }
        int iM26556ar2 = c6740x1.m26556ar();
        if (iM26556ar2 >= 32 && iM26556ar2 % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8 && (iArrM26586to[3] & 65535) == 8) {
            return c6740x1.m26567ix() == 2 ? new m9(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new h4(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone());
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public C6740x1 m49327kk() {
        return this.f36086k4;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC5899kk m49314k4(C6740x1 c6740x1, C12014ne c12014ne) {
        int[] iArrM26586to = c6740x1.m26586to();
        int iM26556ar = c6740x1.m26556ar();
        if (c6740x1.m26580m9() == 1 && iArrM26586to.length >= 4) {
            return (iM26556ar >= 32 && iM26556ar % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8 && (iArrM26586to[3] & 65535) == 8) ? c6740x1.m26567ix() == 2 ? new v4(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new bv(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new um(iM26556ar, this.f36087kk, this.f36088to, c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, m49317k4(iArrM26586to)));
        }
        if (iArrM26586to.length >= 4 && c6740x1.m26580m9() == 2) {
            return (iM26556ar >= 32 && iM26556ar % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8 && (iArrM26586to[3] & 65535) == 8) ? c6740x1.m26567ix() == 2 ? new ar(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new qq(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new wl(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, m49317k4(iArrM26586to)));
        }
        if (iArrM26586to.length >= 3) {
            return (iM26556ar >= 24 && iM26556ar % 8 == 0 && (iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8) ? c6740x1.m26567ix() == 2 ? new uz(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new u4(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : new ix(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, m49317k4(iArrM26586to)));
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public static int[][] m49319kk(C6740x1 c6740x1) {
        int i;
        int i2;
        int i3;
        int iM26556ar = c6740x1.m26556ar();
        int i4 = 8 / iM26556ar;
        if (iM26556ar == 16) {
            i2 = 65536;
            i = 1;
            i3 = 16;
        } else {
            i = i4;
            i2 = 256;
            i3 = 8;
        }
        int iM67469du = (int) C14116yg.m67469du(2.0d, iM26556ar);
        InterfaceC6901du interfaceC6901duMo26569k4 = c6740x1.mo26569k4();
        if (interfaceC6901duMo26569k4 == null) {
            throw new InvalidOperationException("The color map is not defined in the palettized image.");
        }
        if (interfaceC6901duMo26569k4.mo27029k4() != iM67469du) {
            throw new InvalidOperationException("Color map entries must contain 2**(bits per sample) values.");
        }
        int[] iArrMo27032x1 = interfaceC6901duMo26569k4.mo27032x1();
        boolean z = iM26556ar == 1 || iM26556ar == 2 || iM26556ar == 4 || iM26556ar == 8 || iM26556ar == 16;
        if (c6740x1.m26567ix() == 2 || !z) {
            int[][] iArr = {new int[iM67469du]};
            for (int i5 = 0; i5 < iM67469du; i5++) {
                iArr[0][i5] = iArrMo27032x1[i5];
            }
            return iArr;
        }
        int[][] iArr2 = new int[i2][];
        int i6 = (1 << iM26556ar) - 1;
        for (int i7 = 0; i7 < i2; i7++) {
            iArr2[i7] = new int[i];
            int i8 = 0;
            while (i8 < i) {
                int i9 = i8 + 1;
                iArr2[i7][i8] = iArrMo27032x1[(i7 >> (i3 - (i9 * iM26556ar))) & i6];
                i8 = i9;
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5899kk m49322x1(C6740x1 c6740x1, int[][] iArr, C12014ne c12014ne) {
        if (iArr == null) {
            throw new ArgumentNullException("lut");
        }
        if (c6740x1.m26556ar() == 16) {
            return c6740x1.m26567ix() == 2 ? new rv(c6740x1.m26556ar(), this.f36087kk, this.f36088to, iArr[0], c12014ne.Clone()) : new ks(c6740x1.m26556ar(), this.f36087kk, this.f36088to, iArr, c12014ne.Clone());
        }
        if (c6740x1.m26556ar() == 1 || c6740x1.m26556ar() == 2 || c6740x1.m26556ar() == 4 || c6740x1.m26556ar() == 8) {
            return c6740x1.m26567ix() == 2 ? new x6(c6740x1.m26556ar(), this.f36087kk, this.f36088to, iArr[0], c12014ne.Clone()) : new yj(c6740x1.m26556ar(), this.f36087kk, this.f36088to, iArr, c12014ne.Clone());
        }
        int[] iArrM26586to = c6740x1.m26586to();
        if (iArrM26586to.length == 1) {
            return new up(c6740x1.m26556ar(), this.f36087kk, this.f36088to, iArr[0], c12014ne.Clone(), m49315k4(c6740x1, iArrM26586to, new double[]{1.0d}));
        }
        throw new InvalidOperationException(C14113y2.m67407k4("The grayscale color converter supports only single channel. Found ", Integer.valueOf(iArrM26586to.length), " channels instead."));
    }

    /* JADX INFO: renamed from: x1 */
    public static int[][] m49323x1(C6740x1 c6740x1) {
        int iM26568jd = c6740x1.m26568jd();
        if (iM26568jd == 0 || iM26568jd == 1) {
            return m49320to(c6740x1);
        }
        if (iM26568jd != 3) {
            return null;
        }
        return m49319kk(c6740x1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5899kk m49326k4(C6740x1 c6740x1, int[][] iArr, C12014ne c12014ne) {
        InterfaceC5899kk interfaceC5899kkM49322x1;
        int iM26568jd = c6740x1.m26568jd();
        if (iM26568jd == 0 || iM26568jd == 1) {
            interfaceC5899kkM49322x1 = m49322x1(c6740x1, iArr, c12014ne.Clone());
        } else if (iM26568jd == 2) {
            interfaceC5899kkM49322x1 = m49314k4(c6740x1, c12014ne.Clone());
        } else if (iM26568jd != 3) {
            if (iM26568jd != 5) {
                interfaceC5899kkM49322x1 = iM26568jd != 8 ? null : m49318kk(c6740x1, c12014ne.Clone());
            } else if (c6740x1.m26558c5() == null) {
                interfaceC5899kkM49322x1 = m49321x1(c6740x1, c12014ne.Clone());
            }
        }
        return interfaceC5899kkM49322x1 == null ? new ne(c6740x1.m26556ar(), this.f36087kk, this.f36088to, c12014ne.Clone()) : interfaceC5899kkM49322x1;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC5900x1 m49315k4(C6740x1 c6740x1, int[] iArr, double[] dArr) {
        return c6740x1.m26567ix() == 2 ? new x1(iArr, dArr) : new k4(iArr, dArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49316k4(byte[] bArr, int i, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            bArr[i] = C13590ak.f45144k4[bArr[i] & 255];
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private double[] m49317k4(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = 255.0d / (C14116yg.m67469du(2.0d, iArr[i]) - 1.0d);
        }
        return dArr;
    }
}
