package com.aspose.slides.internal.p118ex;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p174hz.C4754u4;
import com.aspose.slides.internal.p174hz.C4756up;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10938jd;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p525yi.C12824h4;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3823m9 extends C3817h4 {

    /* JADX INFO: renamed from: c5 */
    private C3827to f10423c5;

    /* JADX INFO: renamed from: ck */
    private C10945x1 f10424ck;

    /* JADX INFO: renamed from: du */
    private String f10425du;

    /* JADX INFO: renamed from: dy */
    private C3827to f10426dy;

    /* JADX INFO: renamed from: h4 */
    private String f10427h4;

    /* JADX INFO: renamed from: jd */
    private C4763wp f10428jd;

    /* JADX INFO: renamed from: kk */
    private boolean f10429kk;

    /* JADX INFO: renamed from: m9 */
    private C3820k4 f10430m9;

    /* JADX INFO: renamed from: to */
    private C3831uz f10431to;

    /* JADX INFO: renamed from: fa */
    private static String f10419fa = C14113y2.m67402k4("Certificate instance is empty.", new Object[0]);

    /* JADX INFO: renamed from: k4 */
    static byte[] f10420k4 = {85, 4, 3};

    /* JADX INFO: renamed from: x1 */
    static byte[] f10422x1 = {PatternStyle.Plaid, -122, 72, -122, -9, 13, 1, 9, 1};

    /* JADX INFO: renamed from: up */
    private static byte[] f10421up = {PatternStyle.Plaid, -122, 72, -122, -9, 13, 1, 7, 2};

    public C3823m9() {
        this.f10425du = C14113y2.f47374k4;
        this.f10424ck = null;
    }

    /* JADX INFO: renamed from: k4 */
    private C12842x1 m15308k4(byte[] bArr, C12842x1 c12842x1) {
        C12842x1 c12842x1M59710k4;
        if (c12842x1.m59709k4() == 0) {
            return null;
        }
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(i);
            for (int i2 = 0; i2 < c12842x1M59710k42.m59709k4(); i2++) {
                C12842x1 c12842x1M59710k43 = c12842x1M59710k42.m59710k4(i2);
                if (c12842x1M59710k43.m59709k4() == 2 && (c12842x1M59710k4 = c12842x1M59710k43.m59710k4(0)) != null && c12842x1M59710k4.m59719x1(bArr)) {
                    return c12842x1M59710k43;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ar */
    public int m15313ar() {
        C10945x1 c10945x1 = this.f10424ck;
        if (c10945x1 != null) {
            return c10945x1.m52841rv();
        }
        throw new CryptographicException(f10419fa);
    }

    /* JADX INFO: renamed from: bv */
    public C10945x1 m15314bv() {
        return this.f10424ck;
    }

    /* JADX INFO: renamed from: ix */
    public byte[] m15315ix() {
        if (this.f10424ck != null) {
            return super.m15278ck();
        }
        throw new CryptographicException(f10419fa);
    }

    @Override // com.aspose.slides.internal.p118ex.C3817h4
    /* JADX INFO: renamed from: kk */
    public void mo15289kk() {
        this.f10424ck = null;
        this.f10429kk = false;
        this.f10431to = null;
        this.f10425du = C14113y2.f47374k4;
        this.f10427h4 = null;
        this.f10430m9 = null;
        this.f10426dy = null;
        this.f10423c5 = null;
        this.f10428jd = null;
        super.mo15289kk();
    }

    /* JADX INFO: renamed from: ks */
    public C14084qq m15318ks() {
        C10945x1 c10945x1 = this.f10424ck;
        if (c10945x1 != null) {
            return c10945x1.m52838ks().m67145ne();
        }
        throw new CryptographicException(f10419fa);
    }

    /* JADX INFO: renamed from: ne */
    public C3820k4 m15319ne() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10430m9 == null) {
            try {
                this.f10430m9 = new C3820k4(this.f10424ck);
            } catch (RuntimeException e) {
                throw new CryptographicException(C14113y2.m67402k4("Unable to decode public key.", new Object[0]), e);
            }
        }
        return this.f10430m9;
    }

    /* JADX INFO: renamed from: qq */
    public String m15320qq() {
        return super.m15279du();
    }

    /* JADX INFO: renamed from: rv */
    public C14084qq m15321rv() {
        C10945x1 c10945x1 = this.f10424ck;
        if (c10945x1 != null) {
            return c10945x1.m52849yj().m67145ne();
        }
        throw new CryptographicException(f10419fa);
    }

    @Override // com.aspose.slides.internal.p118ex.C3817h4
    public String toString() {
        return this.f10424ck == null ? "System.Security.Cryptography.X509Certificates.X509Certificate2" : super.mo15285k4(true);
    }

    /* JADX INFO: renamed from: u4 */
    public String m15322u4() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10427h4 == null) {
            C6765kp c6765kp = new C6765kp();
            byte[] bArrM52830jd = this.f10424ck.m52830jd();
            for (int length = bArrM52830jd.length - 1; length >= 0; length--) {
                c6765kp.m26792k4(C14098up.m67320k4(bArrM52830jd[length], "X2"));
            }
            this.f10427h4 = c6765kp.toString();
        }
        return this.f10427h4;
    }

    /* JADX INFO: renamed from: um */
    public boolean m15323um() {
        if (this.f10424ck != null) {
            return ((C3813ck) C4756up.m19759k4(C3813ck.class.getName())).m15254k4(this);
        }
        throw new CryptographicException(f10419fa);
    }

    /* JADX INFO: renamed from: up */
    public C3831uz m15324up() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10431to == null) {
            this.f10431to = new C3831uz(this.f10424ck);
        }
        return this.f10431to;
    }

    /* JADX INFO: renamed from: uz */
    public C4763wp m15325uz() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10428jd == null) {
            this.f10428jd = new C4763wp(this.f10424ck.m52827fa());
        }
        return this.f10428jd;
    }

    /* JADX INFO: renamed from: wl */
    public C3827to m15326wl() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10423c5 == null) {
            this.f10423c5 = new C3827to(this.f10424ck.m52843u4().m59708du());
        }
        return this.f10423c5;
    }

    /* JADX INFO: renamed from: x6 */
    public AbstractC4709du m15327x6() {
        C10945x1 c10945x1 = this.f10424ck;
        if (c10945x1 == null) {
            throw new CryptographicException(f10419fa);
        }
        if (c10945x1.m52826dy() == null) {
            if (this.f10424ck.m52831k4() != null) {
                C4754u4 c4754u4 = (C4754u4) C7019kk.m27452k4((Object) this.f10424ck.m52831k4(), C4754u4.class);
                if (c4754u4 == null) {
                    this.f10424ck.m52831k4().mo19633x1(true);
                    return this.f10424ck.m52831k4();
                }
                if (c4754u4.m19758to()) {
                    return null;
                }
                return c4754u4;
            }
            return null;
        }
        C4724j2 c4724j2 = (C4724j2) C7019kk.m27452k4((Object) this.f10424ck.m52826dy(), C4724j2.class);
        if (c4724j2 != null) {
            if (c4724j2.m19641to()) {
                return null;
            }
            return c4724j2;
        }
        C12824h4 c12824h4 = (C12824h4) C7019kk.m27452k4((Object) this.f10424ck.m52826dy(), C12824h4.class);
        if (c12824h4 == null) {
            this.f10424ck.m52826dy().mo19642x1(true);
            return this.f10424ck.m52826dy();
        }
        if (c12824h4.m59622to()) {
            return null;
        }
        return c12824h4;
    }

    /* JADX INFO: renamed from: yj */
    public C3827to m15328yj() {
        if (this.f10424ck == null) {
            throw new CryptographicException(f10419fa);
        }
        if (this.f10426dy == null) {
            this.f10426dy = new C3827to(this.f10424ck.m52829ix().m59708du());
        }
        return this.f10426dy;
    }

    public C3823m9(C3817h4 c3817h4) {
        super(c3817h4);
        this.f10425du = C14113y2.f47374k4;
        this.f10424ck = new C10945x1(super.m15278ck());
    }

    /* JADX INFO: renamed from: k4 */
    public String m15316k4(int i, boolean z) {
        if (i == 0) {
            C10945x1 c10945x1 = this.f10424ck;
            if (c10945x1 == null) {
                throw new CryptographicException(f10419fa);
            }
            C12842x1 c12842x1M52829ix = z ? c10945x1.m52829ix() : c10945x1.m52843u4();
            C12842x1 c12842x1M15308k4 = m15308k4(f10420k4, c12842x1M52829ix);
            if (c12842x1M15308k4 != null) {
                return m15309k4(c12842x1M15308k4);
            }
            if (c12842x1M52829ix.m59709k4() == 0) {
                return C14113y2.f47374k4;
            }
            C12842x1 c12842x1M59710k4 = c12842x1M52829ix.m59710k4(c12842x1M52829ix.m59709k4() - 1);
            return c12842x1M59710k4.m59709k4() == 0 ? C14113y2.f47374k4 : m15309k4(c12842x1M59710k4.m59710k4(0));
        }
        if (i == 1) {
            C12842x1 c12842x1M15308k42 = m15308k4(f10422x1, z ? this.f10424ck.m52829ix() : this.f10424ck.m52843u4());
            return c12842x1M15308k42 != null ? m15309k4(c12842x1M15308k42) : C14113y2.f47374k4;
        }
        if (i == 2) {
            return C14113y2.f47374k4;
        }
        if (i != 3) {
            if (i != 4 && i != 5) {
                throw new ArgumentException("nameType");
            }
            return C14113y2.f47374k4;
        }
        C10945x1 c10945x12 = this.f10424ck;
        if (c10945x12 == null) {
            throw new NullReferenceException();
        }
        C12842x1 c12842x1M15308k43 = m15308k4(f10420k4, z ? c10945x12.m52829ix() : c10945x12.m52843u4());
        return c12842x1M15308k43 != null ? m15309k4(c12842x1M15308k43) : C14113y2.f47374k4;
    }

    public C3823m9(String str, String str2) {
        this.f10425du = C14113y2.f47374k4;
        mo15286k4(str, str2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private String m15309k4(C12842x1 c12842x1) {
        if (c12842x1.m59709k4() != 2) {
            return C14113y2.f47374k4;
        }
        C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(1);
        if (c12842x1M59710k4.m59717to() == null || c12842x1M59710k4.m59716kk() == 0) {
            return C14113y2.f47374k4;
        }
        if (C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59718x1()), 6) != 30) {
            return AbstractC6747ar.m26635ix().m26681x1(c12842x1M59710k4.m59717to());
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 1; i < c12842x1M59710k4.m59717to().length; i += 2) {
            c6765kp.m26780k4(C7019kk.m27434ck(Byte.valueOf(c12842x1M59710k4.m59717to()[i]), 6));
        }
        return c6765kp.toString();
    }

    public C3823m9(byte[] bArr) {
        this.f10425du = C14113y2.f47374k4;
        mo15287k4(bArr, (String) null, 0);
    }

    @Override // com.aspose.slides.internal.p118ex.C3817h4
    /* JADX INFO: renamed from: k4 */
    public String mo15285k4(boolean z) {
        if (this.f10424ck == null) {
            return "System.Security.Cryptography.X509Certificates.X509Certificate2";
        }
        if (!z) {
            return super.mo15285k4(true);
        }
        String strM66570kk = C14052dq.m66570kk();
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[Version]{0}  V{1}{0}{0}", strM66570kk, C7019kk.m27466x1(m15313ar()));
        c6765kp.m26796k4("[Subject]{0}  {1}{0}{0}", strM66570kk, m15292x1());
        c6765kp.m26796k4("[Issuer]{0}  {1}{0}{0}", strM66570kk, m15284k4());
        c6765kp.m26796k4("[Serial Number]{0}  {1}{0}{0}", strM66570kk, m15281fa());
        c6765kp.m26796k4("[Not Before]{0}  {1}{0}{0}", strM66570kk, C7019kk.m27451k4(m15321rv()));
        c6765kp.m26796k4("[Not After]{0}  {1}{0}{0}", strM66570kk, C7019kk.m27451k4(m15318ks()));
        c6765kp.m26796k4("[Thumbprint]{0}  {1}{0}{0}", strM66570kk, m15320qq());
        c6765kp.m26796k4("[Signature Algorithm]{0}  {1}({2}){0}{0}", strM66570kk, m15325uz().m19794k4(), m15325uz().m19795x1());
        AbstractC4709du abstractC4709duM15300kk = m15319ne().m15300kk();
        c6765kp.m26796k4("[Public Key]{0}  Algorithm: ", strM66570kk);
        c6765kp.m26792k4(C7019kk.m27469x1(abstractC4709duM15300kk, AbstractC4751tq.class) ? AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA : C7019kk.m27469x1(abstractC4709duM15300kk, AbstractC4723ix.class) ? "DSA" : abstractC4709duM15300kk.toString());
        c6765kp.m26796k4("{0}  Length: {1}{0}  Key Blob: ", strM66570kk, C7019kk.m27466x1(abstractC4709duM15300kk.mo19591k4()));
        m15310k4(c6765kp, m15319ne().m15299k4().m19736x1());
        c6765kp.m26796k4("{0}  Parameters: ", strM66570kk);
        m15310k4(c6765kp, m15319ne().m15301x1().m19736x1());
        c6765kp.m26792k4(strM66570kk);
        return c6765kp.toString();
    }

    public C3823m9(byte[] bArr, String str) {
        this.f10425du = C14113y2.f47374k4;
        mo15287k4(bArr, str, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15317k4(AbstractC4709du abstractC4709du) {
        C10945x1 c10945x1 = this.f10424ck;
        if (c10945x1 == null) {
            throw new CryptographicException(f10419fa);
        }
        if (abstractC4709du == null) {
            c10945x1.m52833k4((AbstractC4751tq) null);
            this.f10424ck.m52832k4((AbstractC4723ix) null);
        } else if (C7019kk.m27469x1(abstractC4709du, AbstractC4751tq.class)) {
            this.f10424ck.m52833k4((AbstractC4751tq) abstractC4709du);
        } else {
            if (!C7019kk.m27469x1(abstractC4709du, AbstractC4723ix.class)) {
                throw new NotSupportedException();
            }
            this.f10424ck.m52832k4((AbstractC4723ix) abstractC4709du);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15310k4(C6765kp c6765kp, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            c6765kp.m26792k4(C14098up.m67320k4(bArr[i], "x2"));
            if (i < bArr.length - 1) {
                c6765kp.m26792k4(" ");
            }
        }
    }

    @Override // com.aspose.slides.internal.p118ex.C3817h4
    /* JADX INFO: renamed from: k4 */
    public void mo15286k4(String str, String str2, int i) {
        mo15287k4(m15312k4(str), str2, i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15311k4(byte[] bArr, String str) {
        C10938jd c10938jd = str == null ? new C10938jd(bArr) : new C10938jd(bArr, str);
        this.f10424ck = c10938jd.m52749kk().size() > 0 ? c10938jd.m52749kk().get_Item(0) : null;
        if (c10938jd.m52751x1().size() > 0) {
            this.f10424ck.m52833k4((AbstractC4751tq) C7019kk.m27452k4(c10938jd.m52751x1().get_Item(0), AbstractC4751tq.class));
            this.f10424ck.m52832k4((AbstractC4723ix) C7019kk.m27452k4(c10938jd.m52751x1().get_Item(0), AbstractC4723ix.class));
        }
    }

    @Override // com.aspose.slides.internal.p118ex.C3817h4
    /* JADX INFO: renamed from: k4 */
    public void mo15287k4(byte[] bArr, String str, int i) {
        super.mo15287k4(bArr, str, i);
        if (str != null) {
            try {
                m15311k4(bArr, str);
            } catch (RuntimeException unused) {
                this.f10424ck = new C10945x1(bArr);
            }
        } else {
            try {
                this.f10424ck = new C10945x1(bArr);
            } catch (RuntimeException unused2) {
                try {
                    m15311k4(bArr, (String) null);
                } catch (RuntimeException e) {
                    throw new CryptographicException(C14113y2.m67402k4("Unable to decode certificate.", new Object[0]), e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m15312k4(String str) {
        C3130fa c3130faM13363to = C3131h4.m13363to(str);
        try {
            int length = (int) c3130faM13363to.getLength();
            byte[] bArr = new byte[length];
            c3130faM13363to.read(bArr, 0, length);
            c3130faM13363to.close();
            c3130faM13363to.dispose();
            return bArr;
        } catch (Throwable th) {
            if (c3130faM13363to != null) {
                c3130faM13363to.dispose();
            }
            throw th;
        }
    }
}
