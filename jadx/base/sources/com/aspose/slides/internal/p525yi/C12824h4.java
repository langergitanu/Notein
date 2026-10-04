package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p174hz.C4711e0;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14111xk;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12824h4 extends AbstractC4751tq {

    /* JADX INFO: renamed from: c5 */
    private BigInteger f42659c5;

    /* JADX INFO: renamed from: ck */
    private BigInteger f42660ck;

    /* JADX INFO: renamed from: du */
    private boolean f42661du;

    /* JADX INFO: renamed from: dy */
    private BigInteger f42662dy;

    /* JADX INFO: renamed from: fa */
    private BigInteger f42663fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f42664h4;

    /* JADX INFO: renamed from: jd */
    private BigInteger f42665jd;

    /* JADX INFO: renamed from: kk */
    public final AbstractC7018k4<k4> f42666kk;

    /* JADX INFO: renamed from: ks */
    private BigInteger f42667ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f42668m9;

    /* JADX INFO: renamed from: rv */
    private k4 f42669rv;

    /* JADX INFO: renamed from: to */
    private boolean f42670to;

    /* JADX INFO: renamed from: up */
    private BigInteger f42671up;

    /* JADX INFO: renamed from: yj */
    private BigInteger f42672yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yi.h4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo19789k4(Object obj, C14111xk c14111xk);
    }

    public C12824h4() {
        this(1024);
    }

    /* JADX INFO: renamed from: h4 */
    private void m59618h4() {
        BigInteger bigIntegerM59643x1;
        int iMo19591k4 = (mo19591k4() + 1) >> 1;
        int iMo19591k42 = mo19591k4() - iMo19591k4;
        this.f42667ks = C12826jd.m59631k4(17L);
        do {
            bigIntegerM59643x1 = C12826jd.m59643x1(iMo19591k4);
            this.f42659c5 = bigIntegerM59643x1;
        } while (C12826jd.m59642x1(bigIntegerM59643x1, 17L) == 1);
        while (true) {
            BigInteger bigIntegerM59643x12 = C12826jd.m59643x1(iMo19591k42);
            this.f42665jd = bigIntegerM59643x12;
            if (C12826jd.m59642x1(bigIntegerM59643x12, 17L) != 1 && !C12826jd.m59629jd(this.f42659c5, this.f42665jd)) {
                BigInteger bigIntegerM59638kk = C12826jd.m59638kk(this.f42659c5, this.f42665jd);
                this.f42672yj = bigIntegerM59638kk;
                if (bigIntegerM59638kk.bitLength() == mo19591k4()) {
                    break;
                } else if (C12826jd.m59627dy(this.f42659c5, this.f42665jd)) {
                    this.f42659c5 = this.f42665jd;
                }
            }
        }
        BigInteger bigIntegerM59644x1 = C12826jd.m59644x1(this.f42659c5, C12826jd.m59631k4(1L));
        BigInteger bigIntegerM59644x12 = C12826jd.m59644x1(this.f42665jd, C12826jd.m59631k4(1L));
        BigInteger bigIntegerModInverse = this.f42667ks.modInverse(C12826jd.m59638kk(bigIntegerM59644x1, bigIntegerM59644x12));
        this.f42662dy = bigIntegerModInverse;
        this.f42660ck = C12826jd.m59626du(bigIntegerModInverse, bigIntegerM59644x1);
        this.f42663fa = C12826jd.m59626du(this.f42662dy, bigIntegerM59644x12);
        this.f42671up = this.f42665jd.modInverse(this.f42659c5);
        this.f42664h4 = true;
        this.f42670to = true;
        if (this.f42666kk != null) {
            this.f42669rv.mo19789k4(this, null);
        }
    }

    /* JADX INFO: renamed from: du */
    public boolean m59621du() {
        return !this.f42664h4 || this.f42670to;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public int mo19591k4() {
        if (!this.f42664h4) {
            return super.mo19591k4();
        }
        int iBitLength = this.f42672yj.bitLength();
        int i = iBitLength & 7;
        return i != 0 ? (8 - i) + iBitLength : iBitLength;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: kk */
    public String mo19739kk(boolean z) {
        StringBuilder sb = new StringBuilder("<RSAKeyValue><Modulus>");
        C4701bs c4701bsClone = mo19642x1(z).Clone();
        try {
            sb.append(C14080ne.m66952k4(c4701bsClone.f13121m9));
            sb.append("</Modulus><Exponent>");
            sb.append(C14080ne.m66952k4(c4701bsClone.f13117dy));
            sb.append("</Exponent>");
            if (z) {
                if (c4701bsClone.f13119k4 != null) {
                    sb.append("<P>");
                    sb.append(C14080ne.m66952k4(c4701bsClone.f13119k4));
                    sb.append("</P>");
                }
                if (c4701bsClone.f13123x1 != null) {
                    sb.append("<Q>");
                    sb.append(C14080ne.m66952k4(c4701bsClone.f13123x1));
                    sb.append("</Q>");
                }
                if (c4701bsClone.f13122to != null) {
                    sb.append("<DP>");
                    sb.append(C14080ne.m66952k4(c4701bsClone.f13122to));
                    sb.append("</DP>");
                }
                if (c4701bsClone.f13116du != null) {
                    sb.append("<DQ>");
                    sb.append(C14080ne.m66952k4(c4701bsClone.f13116du));
                    sb.append("</DQ>");
                }
                if (c4701bsClone.f13118h4 != null) {
                    sb.append("<InverseQ>");
                    sb.append(C14080ne.m66952k4(c4701bsClone.f13118h4));
                    sb.append("</InverseQ>");
                }
                sb.append("<D>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13120kk));
                sb.append("</D>");
            }
            sb.append("</RSAKeyValue>");
            return sb.toString();
        } catch (Exception e) {
            byte[] bArr = c4701bsClone.f13119k4;
            if (bArr != null) {
                AbstractC14092to.m67225k4(bArr, 0, bArr.length);
            }
            byte[] bArr2 = c4701bsClone.f13123x1;
            if (bArr2 != null) {
                AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
            }
            byte[] bArr3 = c4701bsClone.f13122to;
            if (bArr3 != null) {
                AbstractC14092to.m67225k4(bArr3, 0, bArr3.length);
            }
            byte[] bArr4 = c4701bsClone.f13116du;
            if (bArr4 != null) {
                AbstractC14092to.m67225k4(bArr4, 0, bArr4.length);
            }
            byte[] bArr5 = c4701bsClone.f13118h4;
            if (bArr5 != null) {
                AbstractC14092to.m67225k4(bArr5, 0, bArr5.length);
            }
            byte[] bArr6 = c4701bsClone.f13120kk;
            if (bArr6 != null) {
                AbstractC14092to.m67225k4(bArr6, 0, bArr6.length);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: to */
    public boolean m59622to() {
        if (this.f42664h4) {
            return this.f42662dy == null || this.f42672yj == null;
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: x1 */
    public C4701bs mo19642x1(boolean z) {
        if (this.f42668m9) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        if (!this.f42664h4) {
            m59618h4();
        }
        C4701bs c4701bs = new C4701bs();
        c4701bs.f13117dy = C12826jd.m59637k4(this.f42667ks);
        c4701bs.f13121m9 = C12826jd.m59637k4(this.f42672yj);
        if (z) {
            BigInteger bigInteger = this.f42662dy;
            if (bigInteger == null) {
                throw new CryptographicException("Missing private key");
            }
            byte[] bArrM59637k4 = C12826jd.m59637k4(bigInteger);
            c4701bs.f13120kk = bArrM59637k4;
            int length = bArrM59637k4.length;
            byte[] bArr = c4701bs.f13121m9;
            if (length != bArr.length) {
                int length2 = bArr.length;
                byte[] bArr2 = new byte[length2];
                C14058fa.m66596k4(bArrM59637k4, 0, bArr2, length2 - bArrM59637k4.length, bArrM59637k4.length);
                c4701bs.f13120kk = bArr2;
            }
            if (this.f42659c5 != null && this.f42665jd != null && this.f42660ck != null && this.f42663fa != null && this.f42671up != null) {
                int iMo19591k4 = mo19591k4() >> 4;
                c4701bs.f13119k4 = m59620k4(this.f42659c5, iMo19591k4);
                c4701bs.f13123x1 = m59620k4(this.f42665jd, iMo19591k4);
                c4701bs.f13122to = m59620k4(this.f42660ck, iMo19591k4);
                c4701bs.f13116du = m59620k4(this.f42663fa, iMo19591k4);
                c4701bs.f13118h4 = m59620k4(this.f42671up, iMo19591k4);
                return c4701bs;
            }
        }
        return c4701bs;
    }

    public C12824h4(int i) {
        this.f42670to = false;
        this.f42661du = true;
        this.f42664h4 = false;
        this.f42668m9 = false;
        this.f42666kk = new C12840v4(this);
        this.f13134x1 = new C4711e0[]{new C4711e0(384, 16384, 8)};
        super.m19592k4(i);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: x1 */
    public byte[] mo19643x1(byte[] bArr) {
        BigInteger bigIntegerM59630k4;
        BigInteger bigIntegerModPow;
        if (this.f42668m9) {
            throw new ObjectDisposedException("private key");
        }
        if (!this.f42664h4) {
            m59618h4();
        }
        BigInteger bigIntegerM59634k4 = C12826jd.m59634k4(bArr);
        if (this.f42661du) {
            bigIntegerM59630k4 = C12826jd.m59630k4(this.f42672yj.bitLength());
            bigIntegerM59634k4 = C12826jd.m59626du(C12826jd.m59638kk(bigIntegerM59630k4.modPow(this.f42667ks, this.f42672yj), bigIntegerM59634k4), this.f42672yj);
        } else {
            bigIntegerM59630k4 = null;
        }
        if (this.f42670to) {
            BigInteger bigIntegerModPow2 = bigIntegerM59634k4.modPow(this.f42660ck, this.f42659c5);
            BigInteger bigIntegerModPow3 = bigIntegerM59634k4.modPow(this.f42663fa, this.f42665jd);
            bigIntegerModPow = C12826jd.m59633k4(bigIntegerModPow3, C12826jd.m59638kk(this.f42665jd, C12826jd.m59628h4(bigIntegerModPow3, bigIntegerModPow2) ? C12826jd.m59644x1(this.f42659c5, C12826jd.m59626du(C12826jd.m59638kk(C12826jd.m59644x1(bigIntegerModPow3, bigIntegerModPow2), this.f42671up), this.f42659c5)) : C12826jd.m59626du(C12826jd.m59638kk(C12826jd.m59644x1(bigIntegerModPow2, bigIntegerModPow3), this.f42671up), this.f42659c5)));
        } else {
            if (m59622to()) {
                throw new CryptographicException(C12825ix.m59623k4("Missing private key to decrypt value."));
            }
            bigIntegerModPow = bigIntegerM59634k4.modPow(this.f42662dy, this.f42672yj);
        }
        if (this.f42661du) {
            bigIntegerModPow = C12826jd.m59626du(C12826jd.m59638kk(bigIntegerModPow, bigIntegerM59630k4.modInverse(this.f42672yj)), this.f42672yj);
            BigInteger bigInteger = BigInteger.ZERO;
        }
        byte[] bArrM59620k4 = m59620k4(bigIntegerModPow, mo19591k4() >> 3);
        BigInteger bigInteger2 = BigInteger.ZERO;
        return bArrM59620k4;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: k4 */
    public void mo19639k4(C4701bs c4701bs) {
        if (this.f42668m9) {
            throw new ObjectDisposedException(C12825ix.m59623k4("Keypair was disposed"));
        }
        byte[] bArr = c4701bs.f13117dy;
        if (bArr == null) {
            throw new CryptographicException(C12825ix.m59623k4("Missing Exponent"));
        }
        if (c4701bs.f13121m9 == null) {
            throw new CryptographicException(C12825ix.m59623k4("Missing Modulus"));
        }
        this.f42667ks = C12826jd.m59634k4(bArr);
        this.f42672yj = C12826jd.m59634k4(c4701bs.f13121m9);
        byte[] bArr2 = c4701bs.f13120kk;
        if (bArr2 != null) {
            this.f42662dy = C12826jd.m59634k4(bArr2);
        }
        byte[] bArr3 = c4701bs.f13122to;
        if (bArr3 != null) {
            this.f42660ck = C12826jd.m59634k4(bArr3);
        }
        byte[] bArr4 = c4701bs.f13116du;
        if (bArr4 != null) {
            this.f42663fa = C12826jd.m59634k4(bArr4);
        }
        byte[] bArr5 = c4701bs.f13118h4;
        if (bArr5 != null) {
            this.f42671up = C12826jd.m59634k4(bArr5);
        }
        byte[] bArr6 = c4701bs.f13119k4;
        if (bArr6 != null) {
            this.f42659c5 = C12826jd.m59634k4(bArr6);
        }
        byte[] bArr7 = c4701bs.f13123x1;
        if (bArr7 != null) {
            this.f42665jd = C12826jd.m59634k4(bArr7);
        }
        this.f42664h4 = true;
        BigInteger bigInteger = this.f42659c5;
        boolean z = (bigInteger == null || this.f42665jd == null || this.f42660ck == null) ? false : true;
        this.f42670to = (!z || this.f42663fa == null || this.f42671up == null) ? false : true;
        if (z) {
            boolean zM59629jd = C12826jd.m59629jd(this.f42672yj, C12826jd.m59638kk(bigInteger, this.f42665jd));
            if (zM59629jd) {
                BigInteger bigIntegerM59644x1 = C12826jd.m59644x1(this.f42659c5, C12826jd.m59631k4(1L));
                BigInteger bigIntegerM59644x12 = C12826jd.m59644x1(this.f42665jd, C12826jd.m59631k4(1L));
                BigInteger bigIntegerModInverse = this.f42667ks.modInverse(C12826jd.m59638kk(bigIntegerM59644x1, bigIntegerM59644x12));
                boolean zM59629jd2 = C12826jd.m59629jd(this.f42662dy, bigIntegerModInverse);
                if (zM59629jd2 || !this.f42670to) {
                    zM59629jd = zM59629jd2;
                } else {
                    zM59629jd = C12826jd.m59629jd(this.f42660ck, C12826jd.m59626du(bigIntegerModInverse, bigIntegerM59644x1)) && C12826jd.m59629jd(this.f42663fa, C12826jd.m59626du(bigIntegerModInverse, bigIntegerM59644x12)) && C12826jd.m59629jd(this.f42671up, this.f42665jd.modInverse(this.f42659c5));
                }
            }
            if (!zM59629jd) {
                throw new CryptographicException(C12825ix.m59623k4("Private/public key mismatch"));
            }
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public void mo19593k4(boolean z) {
        if (!this.f42668m9) {
            if (this.f42662dy != null) {
                BigInteger bigInteger = BigInteger.ZERO;
                this.f42662dy = null;
            }
            if (this.f42659c5 != null) {
                BigInteger bigInteger2 = BigInteger.ZERO;
                this.f42659c5 = null;
            }
            if (this.f42665jd != null) {
                BigInteger bigInteger3 = BigInteger.ZERO;
                this.f42665jd = null;
            }
            if (this.f42660ck != null) {
                BigInteger bigInteger4 = BigInteger.ZERO;
                this.f42660ck = null;
            }
            if (this.f42663fa != null) {
                BigInteger bigInteger5 = BigInteger.ZERO;
                this.f42663fa = null;
            }
            if (this.f42671up != null) {
                BigInteger bigInteger6 = BigInteger.ZERO;
                this.f42671up = null;
            }
            if (z) {
                if (this.f42667ks != null) {
                    BigInteger bigInteger7 = BigInteger.ZERO;
                    this.f42667ks = null;
                }
                if (this.f42672yj != null) {
                    BigInteger bigInteger8 = BigInteger.ZERO;
                    this.f42672yj = null;
                }
            }
        }
        this.f42668m9 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m59620k4(BigInteger bigInteger, int i) {
        byte[] bArrM59637k4 = C12826jd.m59637k4(bigInteger);
        if (bArrM59637k4.length >= i) {
            return bArrM59637k4;
        }
        byte[] bArr = new byte[i];
        C14058fa.m66596k4(bArrM59637k4, 0, bArr, i - bArrM59637k4.length, bArrM59637k4.length);
        AbstractC14092to.m67225k4(bArrM59637k4, 0, bArrM59637k4.length);
        return bArr;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19640k4(byte[] bArr) {
        if (this.f42668m9) {
            throw new ObjectDisposedException("public key");
        }
        if (!this.f42664h4) {
            m59618h4();
        }
        byte[] bArrM59620k4 = m59620k4(C12826jd.m59634k4(bArr).modPow(this.f42667ks, this.f42672yj), mo19591k4() >> 3);
        BigInteger bigInteger = BigInteger.ZERO;
        return bArrM59620k4;
    }
}
