package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.AbstractC6760h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C3148wl extends AbstractC3151yd {

    /* JADX INFO: renamed from: k4 */
    static byte[] f9326k4;

    /* JADX INFO: renamed from: kk */
    static char[] f9327kk;

    /* JADX INFO: renamed from: c5 */
    private AbstractC6760h4 f9330c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC3150x6 f9331ck;

    /* JADX INFO: renamed from: dy */
    private AbstractC6747ar f9332dy;

    /* JADX INFO: renamed from: fa */
    private int f9333fa;

    /* JADX INFO: renamed from: h4 */
    private byte[] f9334h4;

    /* JADX INFO: renamed from: jd */
    private C6765kp f9335jd;

    /* JADX INFO: renamed from: ks */
    private int f9336ks;

    /* JADX INFO: renamed from: m9 */
    private char[] f9337m9;

    /* JADX INFO: renamed from: rv */
    private boolean f9338rv;

    /* JADX INFO: renamed from: up */
    private int f9339up;

    /* JADX INFO: renamed from: x6 */
    private boolean f9340x6;

    /* JADX INFO: renamed from: yj */
    private int f9341yj;

    /* JADX INFO: renamed from: x1 */
    static Object f9329x1 = new Object();

    /* JADX INFO: renamed from: to */
    public static C3148wl f9328to = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.wl$k4 */
    public static final class k4 extends C3148wl {
        public k4() {
            super();
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl, com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: du */
        public int mo13055du() {
            return -1;
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl, com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: dy */
        public String mo13427dy() {
            return C14113y2.f47374k4;
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl, com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: h4 */
        public int mo13056h4() {
            return -1;
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl, com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: k4 */
        public int mo13058k4(char[] cArr, int i, int i2) {
            return 0;
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl, com.aspose.slides.internal.p080dd.AbstractC3151yd
        /* JADX INFO: renamed from: m9 */
        public String mo13429m9() {
            return null;
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl
        /* JADX INFO: renamed from: x1 */
        public AbstractC6747ar mo13440x1() {
            return AbstractC6747ar.m26643rv();
        }

        @Override // com.aspose.slides.internal.p080dd.C3148wl
        /* JADX INFO: renamed from: k4 */
        public AbstractC3150x6 mo13437k4() {
            return AbstractC3150x6.Null;
        }
    }

    private C3148wl() {
    }

    /* JADX INFO: renamed from: c5 */
    private int m13433c5() {
        int i;
        int iMo26687k4;
        this.f9339up = 0;
        this.f9333fa = 0;
        do {
            int i2 = this.f9331ck.read(this.f9334h4, 0, this.f9341yj);
            if (i2 <= 0) {
                return 0;
            }
            this.f9338rv = i2 < this.f9341yj;
            if (this.f9336ks > 0) {
                AbstractC6747ar abstractC6747ar = this.f9332dy;
                int iM13436k4 = m13436k4(i2);
                if (abstractC6747ar != this.f9332dy) {
                    int iMo26627x1 = abstractC6747ar.mo26627x1(this.f9341yj) + 1;
                    int iMo26627x12 = this.f9332dy.mo26627x1(this.f9341yj) + 1;
                    if (iMo26627x1 != iMo26627x12) {
                        this.f9337m9 = new char[iMo26627x12];
                    }
                    this.f9330c5 = this.f9332dy.mo26628x1();
                }
                this.f9336ks = 0;
                i2 -= iM13436k4;
                i = iM13436k4;
            } else {
                i = 0;
            }
            iMo26687k4 = this.f9333fa + this.f9330c5.mo26687k4(this.f9334h4, i, i2, this.f9337m9, 0);
            this.f9333fa = iMo26687k4;
        } while (iMo26687k4 == 0);
        return iMo26687k4;
    }

    /* JADX INFO: renamed from: ck */
    private void m13434ck() {
        if (this.f9331ck == null) {
            throw new ObjectDisposedException("StreamReader", "Cannot read from a closed StreamReader");
        }
    }

    /* JADX INFO: renamed from: jd */
    private int m13435jd() {
        while (true) {
            int i = this.f9339up;
            if (i >= this.f9333fa) {
                return -1;
            }
            char c = this.f9337m9[i];
            boolean z = false;
            if (c == '\n') {
                this.f9339up = i + 1;
                if (this.f9340x6) {
                    i--;
                }
                if (i < 0) {
                    i = 0;
                }
                this.f9340x6 = false;
                return i;
            }
            if (this.f9340x6) {
                this.f9340x6 = false;
                if (i == 0) {
                    return -2;
                }
                return i - 1;
            }
            if (c == '\r') {
                z = true;
            }
            this.f9340x6 = z;
            this.f9339up = i + 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m13436k4(int i) {
        AbstractC6747ar abstractC6747arM26647uz;
        AbstractC6747ar abstractC6747arM26643rv;
        byte[] bArrMo26655dy;
        int length;
        if ((this.f9336ks & 2) == 2 && i >= (length = (bArrMo26655dy = this.f9332dy.mo26655dy()).length)) {
            int i2 = 0;
            while (i2 < length && this.f9334h4[i2] == bArrMo26655dy[i2]) {
                i2++;
            }
            if (i2 == length) {
                return i2;
            }
        }
        if ((this.f9336ks & 1) != 1 || i < 2) {
            return 0;
        }
        byte[] bArr = this.f9334h4;
        byte b = bArr[0];
        if ((b & 255) == 254 && (bArr[1] & 255) == 255) {
            abstractC6747arM26643rv = AbstractC6747ar.m26649x6();
        } else {
            if ((b & 255) != 255 || (bArr[1] & 255) != 254 || i >= 4) {
                if (i < 3) {
                    return 0;
                }
                if ((b & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
                    this.f9332dy = AbstractC6747ar.m26635ix();
                    return 3;
                }
                if (i >= 4) {
                    if (b != 0 || bArr[1] != 0 || (bArr[2] & 255) != 254 || (bArr[3] & 255) != 255) {
                        if ((b & 255) == 255 && (bArr[1] & 255) == 254) {
                            if (bArr[2] == 0 && bArr[3] == 0) {
                                abstractC6747arM26647uz = AbstractC6747ar.m26647uz();
                            }
                        }
                        return 0;
                    }
                    abstractC6747arM26647uz = AbstractC6747ar.m26648wl();
                    this.f9332dy = abstractC6747arM26647uz;
                    return 4;
                }
                if ((b & 255) != 255 || (bArr[1] & 255) != 254 || bArr[2] == 0) {
                    return 0;
                }
            }
            abstractC6747arM26643rv = AbstractC6747ar.m26643rv();
        }
        this.f9332dy = abstractC6747arM26643rv;
        return 2;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: du */
    public int mo13055du() {
        m13434ck();
        if (this.f9339up < this.f9333fa || m13433c5() != 0) {
            return this.f9337m9[this.f9339up];
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: dy */
    public String mo13427dy() {
        m13434ck();
        C6765kp c6765kp = new C6765kp();
        int length = this.f9337m9.length;
        char[] cArr = new char[length];
        while (true) {
            int iMo13058k4 = mo13058k4(cArr, 0, length);
            if (iMo13058k4 <= 0) {
                return c6765kp.toString();
            }
            c6765kp.m26799k4(cArr, 0, iMo13058k4);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: h4 */
    public int mo13056h4() {
        m13434ck();
        if (this.f9339up >= this.f9333fa && m13433c5() == 0) {
            return -1;
        }
        char[] cArr = this.f9337m9;
        int i = this.f9339up;
        this.f9339up = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: kk */
    public boolean m13439kk() {
        return mo13055du() < 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: m9 */
    public String mo13429m9() {
        int iM13435jd;
        m13434ck();
        if (this.f9339up >= this.f9333fa && m13433c5() == 0) {
            return null;
        }
        int i = this.f9339up;
        int iM13435jd2 = m13435jd();
        if (iM13435jd2 < this.f9333fa && iM13435jd2 >= i) {
            return C14113y2.m67406k4(this.f9337m9, i, iM13435jd2 - i);
        }
        if (iM13435jd2 == -2) {
            C6765kp c6765kp = this.f9335jd;
            return c6765kp.m26800k4(0, c6765kp.m26807x1());
        }
        C6765kp c6765kp2 = this.f9335jd;
        if (c6765kp2 == null) {
            this.f9335jd = new C6765kp();
        } else {
            c6765kp2.m26801k4(0);
        }
        do {
            if (this.f9340x6) {
                this.f9333fa--;
            }
            this.f9335jd.m26799k4(this.f9337m9, i, this.f9333fa - i);
            if (m13433c5() == 0) {
                if (this.f9335jd.m26778k4() <= 32768) {
                    C6765kp c6765kp3 = this.f9335jd;
                    return c6765kp3.m26800k4(0, c6765kp3.m26807x1());
                }
                C6765kp c6765kp4 = this.f9335jd;
                this.f9335jd = null;
                return c6765kp4.m26800k4(0, c6765kp4.m26807x1());
            }
            i = this.f9339up;
            iM13435jd = m13435jd();
            if (iM13435jd < this.f9333fa && iM13435jd >= i) {
                this.f9335jd.m26799k4(this.f9337m9, i, iM13435jd - i);
                if (this.f9335jd.m26778k4() <= 32768) {
                    C6765kp c6765kp5 = this.f9335jd;
                    return c6765kp5.m26800k4(0, c6765kp5.m26807x1());
                }
                C6765kp c6765kp6 = this.f9335jd;
                this.f9335jd = null;
                return c6765kp6.m26800k4(0, c6765kp6.m26807x1());
            }
        } while (iM13435jd != -2);
        C6765kp c6765kp7 = this.f9335jd;
        return c6765kp7.m26800k4(0, c6765kp7.m26807x1());
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: to */
    public void mo13059to() {
        mo13428k4(true);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC6747ar mo13440x1() {
        AbstractC6747ar abstractC6747ar = this.f9332dy;
        if (abstractC6747ar != null) {
            return abstractC6747ar;
        }
        throw new RuntimeException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: k4 */
    public int mo13058k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0");
        }
        if (i > cArr.length - i2) {
            throw new ArgumentException("index + count > buffer.Length");
        }
        m13434ck();
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            if (this.f9339up >= this.f9333fa && m13433c5() == 0) {
                if (i3 > 0) {
                    break;
                }
                return 0;
            }
            int iMin = Math.min(this.f9333fa - this.f9339up, i2);
            AbstractC14092to.m67229k4(this.f9337m9, this.f9339up, cArr, i, iMin);
            this.f9339up += iMin;
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
            if (this.f9338rv) {
                break;
            }
        }
        return i3;
    }

    public C3148wl(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, AbstractC6747ar.m26635ix(), true, 1024);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 mo13437k4() {
        return this.f9331ck;
    }

    public C3148wl(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar) {
        this(abstractC3150x6, abstractC6747ar, true, 1024);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13438k4(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar, boolean z, int i) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        if (!abstractC3150x6.canRead()) {
            throw new ArgumentException("Cannot read stream");
        }
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize", "The minimum size of the buffer must be positive");
        }
        if (i < 128) {
            i = 128;
        }
        int iMo26627x1 = abstractC6747ar.mo26627x1(i) + 1;
        if (i <= 1024 && f9326k4 != null) {
            synchronized (f9329x1) {
                try {
                    byte[] bArr = f9326k4;
                    if (bArr != null) {
                        this.f9334h4 = bArr;
                        f9326k4 = null;
                    }
                    char[] cArr = f9327kk;
                    if (cArr != null && iMo26627x1 <= cArr.length) {
                        this.f9337m9 = cArr;
                        f9327kk = null;
                    }
                } finally {
                }
            }
        }
        byte[] bArr2 = this.f9334h4;
        if (bArr2 == null) {
            this.f9334h4 = new byte[i];
        } else {
            AbstractC14092to.m67225k4(bArr2, 0, i);
        }
        char[] cArr2 = this.f9337m9;
        if (cArr2 == null) {
            this.f9337m9 = new char[iMo26627x1];
        } else {
            AbstractC14092to.m67228k4(cArr2, 0, iMo26627x1);
        }
        this.f9331ck = abstractC3150x6;
        this.f9341yj = i;
        this.f9332dy = abstractC6747ar;
        this.f9330c5 = abstractC6747ar.mo26628x1();
        byte[] bArrMo26655dy = abstractC6747ar.mo26655dy();
        this.f9336ks = z ? 1 : 0;
        this.f9336ks = (z ? 1 : 0) + (bArrMo26655dy.length == 0 ? 0 : 2);
        this.f9333fa = 0;
        this.f9339up = 0;
    }

    public C3148wl(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar, boolean z, int i) {
        m13438k4(abstractC3150x6, abstractC6747ar, z, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: k4 */
    public void mo13428k4(boolean z) {
        AbstractC3150x6 abstractC3150x6;
        if (z && (abstractC3150x6 = this.f9331ck) != null) {
            abstractC3150x6.close();
        }
        byte[] bArr = this.f9334h4;
        if (bArr != null && bArr.length == 1024 && f9326k4 == null) {
            synchronized (f9329x1) {
                try {
                    if (f9326k4 == null) {
                        f9326k4 = this.f9334h4;
                    }
                    if (f9327kk == null) {
                        f9327kk = this.f9337m9;
                    }
                } finally {
                }
            }
        }
        this.f9334h4 = null;
        this.f9337m9 = null;
        this.f9332dy = null;
        this.f9330c5 = null;
        this.f9331ck = null;
        super.mo13428k4(z);
    }

    public C3148wl(AbstractC3150x6 abstractC3150x6, boolean z) {
        this(abstractC3150x6, AbstractC6747ar.m26635ix(), z, 1024);
    }

    public C3148wl(String str) {
        this(str, AbstractC6747ar.m26635ix(), true, 4096);
    }

    public C3148wl(String str, AbstractC6747ar abstractC6747ar) {
        this(str, abstractC6747ar, true, 4096);
    }

    public C3148wl(String str, AbstractC6747ar abstractC6747ar, boolean z, int i) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (C14113y2.m67363du(C14113y2.f47374k4, str)) {
            throw new ArgumentException("Empty path not allowed");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize", "The minimum size of the buffer must be positive");
        }
        m13438k4(C3131h4.m13363to(str), abstractC6747ar, z, i);
    }

    public C3148wl(String str, boolean z) {
        this(str, AbstractC6747ar.m26635ix(), z, 4096);
    }
}
