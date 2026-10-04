package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.C4711e0;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14111xk;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12838up extends AbstractC4723ix {

    /* JADX INFO: renamed from: c5 */
    private BigInteger f42711c5;

    /* JADX INFO: renamed from: ck */
    private BigInteger f42712ck;

    /* JADX INFO: renamed from: du */
    private boolean f42713du;

    /* JADX INFO: renamed from: dy */
    private BigInteger f42714dy;

    /* JADX INFO: renamed from: fa */
    private BigInteger f42715fa;

    /* JADX INFO: renamed from: h4 */
    private BigInteger f42716h4;

    /* JADX INFO: renamed from: jd */
    private BigInteger f42717jd;

    /* JADX INFO: renamed from: kk */
    public final AbstractC7018k4<k4> f42718kk;

    /* JADX INFO: renamed from: ks */
    private AbstractC4720he f42719ks;

    /* JADX INFO: renamed from: m9 */
    private BigInteger f42720m9;

    /* JADX INFO: renamed from: rv */
    private k4 f42721rv;

    /* JADX INFO: renamed from: to */
    private boolean f42722to;

    /* JADX INFO: renamed from: up */
    private int f42723up;

    /* JADX INFO: renamed from: yj */
    private boolean f42724yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yi.up$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo19765k4(Object obj, C14111xk c14111xk);
    }

    public C12838up() {
        this(1024);
    }

    /* JADX INFO: renamed from: du */
    private void m59694du() {
        m59699x1(super.mo19591k4());
        m59695h4();
        this.f42722to = true;
        if (this.f42718kk != null) {
            this.f42721rv.mo19765k4(this, null);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m59695h4() {
        while (true) {
            this.f42711c5 = C12826jd.m59630k4(160);
            if (!C12826jd.m59636k4(this.f42711c5, 0) && !C12826jd.m59639m9(this.f42711c5, this.f42720m9)) {
                this.f42717jd = this.f42714dy.modPow(this.f42711c5, this.f42716h4);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC4720he m59698m9() {
        if (this.f42719ks == null) {
            this.f42719ks = AbstractC4720he.m19622k4();
        }
        return this.f42719ks;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public int mo19591k4() {
        return this.f42722to ? this.f42716h4.bitLength() : super.mo19591k4();
    }

    /* JADX INFO: renamed from: to */
    public boolean m59701to() {
        return this.f42722to && this.f42711c5 == null;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: x1 */
    public C4762wl mo19633x1(boolean z) {
        if (this.f42713du) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        if (!this.f42722to) {
            m59694du();
        }
        if (z && this.f42711c5 == null) {
            throw new CryptographicException("no private key to export");
        }
        C4762wl c4762wl = new C4762wl();
        c4762wl.f13308to = m59700x1(C12826jd.m59637k4(this.f42716h4));
        c4762wl.f13302du = m59700x1(C12826jd.m59637k4(this.f42720m9));
        c4762wl.f13309x1 = m59700x1(C12826jd.m59637k4(this.f42714dy));
        c4762wl.f13303dy = m59700x1(C12826jd.m59637k4(this.f42717jd));
        if (!this.f42724yj) {
            c4762wl.f13306kk = m59700x1(C12826jd.m59637k4(this.f42712ck));
        }
        if (!C12826jd.m59636k4(this.f42715fa, 0)) {
            c4762wl.f13304h4 = m59700x1(C12826jd.m59637k4(this.f42715fa));
            c4762wl.f13305k4 = this.f42723up;
        }
        if (z) {
            byte[] bArrM59637k4 = C12826jd.m59637k4(this.f42711c5);
            if (bArrM59637k4.length == 20) {
                c4762wl.f13307m9 = m59700x1(bArrM59637k4);
            }
        }
        return c4762wl;
    }

    public C12838up(int i) {
        this.f42722to = false;
        this.f42713du = false;
        this.f42718kk = new C12844yj(this);
        this.f13133k4 = i;
        this.f13134x1 = new C4711e0[]{new C4711e0(512, 1024, 64)};
    }

    /* JADX INFO: renamed from: x1 */
    private void m59699x1(int i) {
        byte[] bArrM19588x1;
        boolean z;
        char c;
        int i2 = 20;
        byte[] bArr = new byte[20];
        byte[] bArrM19588x12 = new byte[20];
        byte[] bArr2 = new byte[20];
        AbstractC4739nv abstractC4739nvM19710du = AbstractC4739nv.m19710du();
        int i3 = i - 1;
        int i4 = i3 / 160;
        int i5 = i / 8;
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        boolean z2 = false;
        while (!z2) {
            while (true) {
                m59698m9().mo19624k4(bArr);
                bArrM19588x1 = abstractC4739nvM19710du.m19588x1(bArr);
                AbstractC14092to.m67226k4(bArr, i6, bArrM19588x12, i6, i2);
                z = true;
                m59697k4(bArrM19588x12, bArr, 1);
                bArrM19588x12 = abstractC4739nvM19710du.m19588x1(bArrM19588x12);
                int i7 = i6;
                while (i7 != i2) {
                    bArr2[i7] = (byte) ((bArrM19588x12[i7] & 255) ^ (bArrM19588x1[i7] & 255));
                    i7++;
                    i2 = 20;
                }
                bArr2[i6] = (byte) (bArr2[i6] | UnsignedBytes.MAX_POWER_OF_TWO);
                bArr2[19] = (byte) (bArr2[19] | 1);
                BigInteger bigIntegerM59634k4 = C12826jd.m59634k4(bArr2);
                this.f42720m9 = bigIntegerM59634k4;
                if (bigIntegerM59634k4.isProbablePrime(100)) {
                    break;
                } else {
                    i2 = 20;
                }
            }
            this.f42723up = i6;
            int i8 = 2;
            while (true) {
                boolean z3 = z;
                if (this.f42723up < 4096) {
                    int i9 = i6;
                    while (i9 < i4) {
                        m59697k4(bArrM19588x1, bArr, i8 + i9);
                        bArrM19588x1 = abstractC4739nvM19710du.m19588x1(bArrM19588x1);
                        i9++;
                        AbstractC14092to.m67226k4(bArrM19588x1, i6, bArr3, i5 - (bArrM19588x1.length * i9), bArrM19588x1.length);
                    }
                    m59697k4(bArrM19588x1, bArr, i8 + i4);
                    bArrM19588x1 = abstractC4739nvM19710du.m19588x1(bArrM19588x1);
                    AbstractC14092to.m67226k4(bArrM19588x1, bArrM19588x1.length - (i5 - (bArrM19588x1.length * i4)), bArr3, i6, i5 - (bArrM19588x1.length * i4));
                    bArr3[i6] = (byte) (bArr3[i6] | UnsignedBytes.MAX_POWER_OF_TWO);
                    BigInteger bigIntegerM59634k42 = C12826jd.m59634k4(bArr3);
                    boolean z4 = z2;
                    BigInteger bigIntegerM59644x1 = C12826jd.m59644x1(bigIntegerM59634k42, C12826jd.m59644x1(C12826jd.m59626du(bigIntegerM59634k42, C12826jd.m59632k4(this.f42720m9, 2L)), C12826jd.m59631k4(1L)));
                    this.f42716h4 = bigIntegerM59644x1;
                    if (bigIntegerM59644x1.testBit(i3)) {
                        c = 'd';
                        if (this.f42716h4.isProbablePrime(100)) {
                            z2 = z3;
                            break;
                        }
                    } else {
                        c = 'd';
                    }
                    this.f42723up++;
                    i8 += i4 + 1;
                    z = z3;
                    z2 = z4;
                    i6 = 0;
                }
            }
            i2 = 20;
            i6 = 0;
        }
        BigInteger bigIntegerM59640to = C12826jd.m59640to(C12826jd.m59644x1(this.f42716h4, C12826jd.m59631k4(1L)), this.f42720m9);
        while (true) {
            BigInteger bigIntegerM59630k4 = C12826jd.m59630k4(i);
            if (!C12826jd.m59625c5(bigIntegerM59630k4, C12826jd.m59631k4(1L)) && !C12826jd.m59639m9(bigIntegerM59630k4, C12826jd.m59644x1(this.f42716h4, C12826jd.m59631k4(1L)))) {
                BigInteger bigIntegerModPow = bigIntegerM59630k4.modPow(bigIntegerM59640to, this.f42716h4);
                this.f42714dy = bigIntegerModPow;
                if (!C12826jd.m59625c5(bigIntegerModPow, C12826jd.m59631k4(1L))) {
                    this.f42715fa = C12826jd.m59634k4(bArr);
                    this.f42712ck = C12826jd.m59640to(C12826jd.m59644x1(this.f42716h4, C12826jd.m59631k4(1L)), this.f42720m9);
                    return;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public void mo19593k4(boolean z) {
        if (!this.f42713du) {
            if (this.f42711c5 != null) {
                BigInteger bigInteger = BigInteger.ZERO;
                this.f42711c5 = null;
            }
            if (z) {
                if (this.f42716h4 != null) {
                    BigInteger bigInteger2 = BigInteger.ZERO;
                    this.f42716h4 = null;
                }
                if (this.f42720m9 != null) {
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    this.f42720m9 = null;
                }
                if (this.f42714dy != null) {
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    this.f42714dy = null;
                }
                if (this.f42712ck != null) {
                    BigInteger bigInteger5 = BigInteger.ZERO;
                    this.f42712ck = null;
                }
                if (this.f42715fa != null) {
                    BigInteger bigInteger6 = BigInteger.ZERO;
                    this.f42715fa = null;
                }
                if (this.f42717jd != null) {
                    BigInteger bigInteger7 = BigInteger.ZERO;
                    this.f42717jd = null;
                }
            }
        }
        this.f42713du = true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: x1 */
    public void mo19634x1(C4762wl c4762wl) {
        if (this.f42713du) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        byte[] bArr = c4762wl.f13308to;
        if (bArr == null || c4762wl.f13302du == null || c4762wl.f13309x1 == null) {
            throw new CryptographicException(C12825ix.m59623k4("Missing mandatory DSA parameters (P, Q or G)."));
        }
        if (c4762wl.f13307m9 == null && c4762wl.f13303dy == null) {
            throw new CryptographicException(C12825ix.m59623k4("Missing both public (Y) and private (X) keys."));
        }
        this.f42716h4 = C12826jd.m59634k4(bArr);
        this.f42720m9 = C12826jd.m59634k4(c4762wl.f13302du);
        this.f42714dy = C12826jd.m59634k4(c4762wl.f13309x1);
        byte[] bArr2 = c4762wl.f13307m9;
        this.f42711c5 = bArr2 != null ? C12826jd.m59634k4(bArr2) : null;
        byte[] bArr3 = c4762wl.f13303dy;
        this.f42717jd = bArr3 != null ? C12826jd.m59634k4(bArr3) : this.f42714dy.modPow(this.f42711c5, this.f42716h4);
        byte[] bArr4 = c4762wl.f13306kk;
        if (bArr4 != null) {
            this.f42712ck = C12826jd.m59634k4(bArr4);
        } else {
            this.f42712ck = C12826jd.m59640to(C12826jd.m59644x1(this.f42716h4, C12826jd.m59631k4(1L)), this.f42720m9);
            this.f42724yj = true;
        }
        byte[] bArr5 = c4762wl.f13304h4;
        if (bArr5 != null) {
            this.f42715fa = C12826jd.m59634k4(bArr5);
            this.f42723up = c4762wl.f13305k4;
        } else {
            this.f42715fa = C12826jd.m59631k4(0L);
        }
        this.f42722to = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m59697k4(byte[] bArr, byte[] bArr2, int i) {
        long j = ((long) ((bArr2[bArr2.length - 1] & 255) + i)) & 4294967295L;
        bArr[bArr2.length - 1] = (byte) j;
        long j2 = j >> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            long j3 = ((j2 & 4294967295L) + (((long) (bArr2[length] & 255)) & 4294967295L)) & 4294967295L;
            bArr[length] = (byte) j3;
            j2 = j3 >> 8;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m59700x1(byte[] bArr) {
        int length = bArr.length % 4;
        if (length <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[(bArr.length + 4) - length];
        AbstractC14092to.m67226k4(bArr, 0, bArr2, 4 - length, bArr.length);
        return bArr2;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo19630k4(byte[] bArr, byte[] bArr2) {
        if (this.f42713du) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        if (bArr == null) {
            throw new ArgumentNullException("rgbHash");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("rgbSignature");
        }
        if (bArr.length != 20) {
            throw new CryptographicException("invalid hash length");
        }
        if (bArr2.length != 40) {
            throw new CryptographicException("invalid signature length");
        }
        if (!this.f42722to) {
            return false;
        }
        try {
            BigInteger bigIntegerM59634k4 = C12826jd.m59634k4(bArr);
            byte[] bArr3 = new byte[20];
            AbstractC14092to.m67226k4(bArr2, 0, bArr3, 0, 20);
            BigInteger bigIntegerM59634k42 = C12826jd.m59634k4(bArr3);
            AbstractC14092to.m67226k4(bArr2, 20, bArr3, 0, 20);
            BigInteger bigIntegerM59634k43 = C12826jd.m59634k4(bArr3);
            if (!C12826jd.m59627dy(bigIntegerM59634k42, C12826jd.m59631k4(0L)) && !C12826jd.m59625c5(this.f42720m9, bigIntegerM59634k42) && !C12826jd.m59627dy(bigIntegerM59634k43, C12826jd.m59631k4(0L)) && !C12826jd.m59625c5(this.f42720m9, bigIntegerM59634k43)) {
                BigInteger bigIntegerModInverse = bigIntegerM59634k43.modInverse(this.f42720m9);
                return C12826jd.m59629jd(C12826jd.m59626du(C12826jd.m59626du(C12826jd.m59638kk(this.f42714dy.modPow(C12826jd.m59626du(C12826jd.m59638kk(bigIntegerM59634k4, bigIntegerModInverse), this.f42720m9), this.f42716h4), this.f42717jd.modPow(C12826jd.m59626du(C12826jd.m59638kk(bigIntegerM59634k42, bigIntegerModInverse), this.f42720m9), this.f42716h4)), this.f42716h4), this.f42720m9), bigIntegerM59634k42);
            }
            return false;
        } catch (RuntimeException unused) {
            throw new CryptographicException("couldn't compute signature verification");
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19631k4(byte[] bArr) {
        BigInteger bigIntegerM59630k4;
        if (this.f42713du) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        if (bArr == null) {
            throw new ArgumentNullException("rgbHash");
        }
        if (bArr.length != 20) {
            throw new CryptographicException("invalid hash length");
        }
        if (!this.f42722to) {
            m59694du();
        }
        if (this.f42711c5 == null) {
            throw new CryptographicException("no private key available for signature");
        }
        BigInteger bigIntegerM59634k4 = C12826jd.m59634k4(bArr);
        do {
            bigIntegerM59630k4 = C12826jd.m59630k4(160);
        } while (C12826jd.m59639m9(bigIntegerM59630k4, this.f42720m9));
        BigInteger bigIntegerM59626du = C12826jd.m59626du(this.f42714dy.modPow(bigIntegerM59630k4, this.f42716h4), this.f42720m9);
        BigInteger bigIntegerM59626du2 = C12826jd.m59626du(C12826jd.m59638kk(bigIntegerM59630k4.modInverse(this.f42720m9), C12826jd.m59633k4(bigIntegerM59634k4, C12826jd.m59638kk(this.f42711c5, bigIntegerM59626du))), this.f42720m9);
        byte[] bArr2 = new byte[40];
        byte[] bArrM59637k4 = C12826jd.m59637k4(bigIntegerM59626du);
        byte[] bArrM59637k42 = C12826jd.m59637k4(bigIntegerM59626du2);
        AbstractC14092to.m67226k4(bArrM59637k4, 0, bArr2, 20 - bArrM59637k4.length, bArrM59637k4.length);
        AbstractC14092to.m67226k4(bArrM59637k42, 0, bArr2, 40 - bArrM59637k42.length, bArrM59637k42.length);
        return bArr2;
    }
}
