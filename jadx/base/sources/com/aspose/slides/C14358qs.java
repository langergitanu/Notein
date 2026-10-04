package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p456v5.C11607k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;

/* JADX INFO: renamed from: com.aspose.slides.qs */
/* JADX INFO: loaded from: classes3.dex */
class C14358qs {

    /* JADX INFO: renamed from: c5 */
    private byte[] f48377c5;

    /* JADX INFO: renamed from: ck */
    private byte[] f48378ck;

    /* JADX INFO: renamed from: du */
    private final C13810lu f48379du;

    /* JADX INFO: renamed from: dy */
    private byte[] f48380dy;

    /* JADX INFO: renamed from: fa */
    private int f48381fa;

    /* JADX INFO: renamed from: h4 */
    private final byte[] f48382h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f48383jd;

    /* JADX INFO: renamed from: m9 */
    private byte[] f48384m9;

    /* JADX INFO: renamed from: to */
    private final AbstractC13901ga f48385to;

    /* JADX INFO: renamed from: up */
    private byte[] f48386up;

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f48373k4 = {-2, -89, -46, 118, 59, 75, -98, 121};

    /* JADX INFO: renamed from: x1 */
    private static final byte[] f48375x1 = {-41, -86, 15, 109, PatternStyle.Wave, 97, PatternStyle.DownwardDiagonal, 78};

    /* JADX INFO: renamed from: kk */
    private static final byte[] f48374kk = {20, 110, 11, -25, -85, -84, -48, -42};

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f48376yj = new C7017h4("ChainingModeCFB", "ChainingModeCBC");

    public C14358qs(String str, AbstractC13901ga abstractC13901ga, byte[] bArr) {
        C13810lu c13810lu = new C13810lu();
        this.f48379du = c13810lu;
        if (abstractC13901ga == null) {
            throw new ArgumentNullException("encryptionDataNode");
        }
        this.f48385to = abstractC13901ga;
        c13810lu.m64593k4(str);
        this.f48382h4 = bArr;
        m69740kk();
        m69742to();
        m69727du();
        m69728h4();
    }

    /* JADX INFO: renamed from: du */
    private void m69727du() {
        byte[] bArr = (byte[]) this.f48380dy.clone();
        InterfaceC4752ts interfaceC4752tsM69735k4 = m69735k4(f48373k4, false);
        try {
            m69736k4(interfaceC4752tsM69735k4, bArr, 0, bArr.length);
            if (interfaceC4752tsM69735k4 != null) {
                interfaceC4752tsM69735k4.dispose();
            }
            AbstractC4705c6 abstractC4705c6M69741m9 = m69741m9();
            try {
                int iM19587up = abstractC4705c6M69741m9.m19587up() / 8;
                int iM69729k4 = m69729k4(iM19587up, this.f48379du.m64596kk() / 8);
                byte[] bArr2 = new byte[iM69729k4];
                abstractC4705c6M69741m9.mo19564k4(bArr, 0, bArr.length);
                C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) abstractC4705c6M69741m9.m19584fa()), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, iM19587up);
                abstractC4705c6M69741m9.dispose();
                interfaceC4752tsM69735k4 = m69735k4(f48375x1, true);
                try {
                    m69736k4(interfaceC4752tsM69735k4, bArr2, 0, iM69729k4);
                    this.f48386up = bArr2;
                } finally {
                    if (interfaceC4752tsM69735k4 != null) {
                        interfaceC4752tsM69735k4.dispose();
                    }
                }
            } catch (Throwable th) {
                if (abstractC4705c6M69741m9 != null) {
                    abstractC4705c6M69741m9.dispose();
                }
                throw th;
            }
        } finally {
            if (interfaceC4752tsM69735k4 != null) {
                interfaceC4752tsM69735k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m69728h4() {
        byte[] bArr = (byte[]) this.f48383jd.clone();
        InterfaceC4752ts interfaceC4752tsM69735k4 = m69735k4(f48374kk, false);
        try {
            m69736k4(interfaceC4752tsM69735k4, bArr, 0, bArr.length);
            this.f48378ck = bArr;
        } finally {
            if (interfaceC4752tsM69735k4 != null) {
                interfaceC4752tsM69735k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m69729k4(int i, int i2) {
        return i2 == 0 ? i2 : (((i + i2) - 1) / i2) * i2;
    }

    /* JADX INFO: renamed from: kk */
    private int m69739kk(AbstractC13901ga abstractC13901ga) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(abstractC13901ga.getAttributes().m65165k4("blockSize").getValue(), iArr);
        int i = iArr[0];
        if (zM66590k4) {
            return i * 8;
        }
        return 128;
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC4705c6 m69741m9() {
        return m69732k4(this.f48379du.m64598to());
    }

    /* JADX INFO: renamed from: to */
    private void m69742to() {
        AbstractC4705c6 abstractC4705c6M69741m9 = m69741m9();
        try {
            abstractC4705c6M69741m9.mo19562k4(this.f48379du.m64595k4(), 0, this.f48379du.m64595k4().length, null, 0);
            byte[] bArr = this.f48382h4;
            abstractC4705c6M69741m9.mo19564k4(bArr, 0, bArr.length);
            byte[] bArrM19584fa = abstractC4705c6M69741m9.m19584fa();
            for (int i = 0; i < this.f48381fa; i++) {
                byte[] bArrM66785x1 = C14069jd.m66785x1(i);
                abstractC4705c6M69741m9.mo18846c5();
                abstractC4705c6M69741m9.mo19562k4(bArrM66785x1, 0, bArrM66785x1.length, null, 0);
                abstractC4705c6M69741m9.mo19564k4(bArrM19584fa, 0, bArrM19584fa.length);
                bArrM19584fa = abstractC4705c6M69741m9.m19584fa();
            }
            this.f48384m9 = bArrM19584fa;
            abstractC4705c6M69741m9.dispose();
        } catch (Throwable th) {
            if (abstractC4705c6M69741m9 != null) {
                abstractC4705c6M69741m9.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m69743x1(AbstractC13901ga abstractC13901ga) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(abstractC13901ga.getAttributes().m65165k4("keyBits").getValue(), iArr);
        int i = iArr[0];
        if (zM66590k4) {
            return i;
        }
        return 128;
    }

    /* JADX INFO: renamed from: k4 */
    private int m69730k4(C3152yj c3152yj, C3152yj c3152yj2, byte[] bArr, long j) {
        long length = j / ((long) bArr.length);
        c3152yj.setPosition(m69731k4(((long) bArr.length) * length));
        int i = c3152yj.read(bArr, 0, bArr.length);
        InterfaceC4752ts interfaceC4752tsM69734k4 = m69734k4(m69745x1(), C14069jd.m66785x1((int) length), false);
        try {
            m69736k4(interfaceC4752tsM69734k4, bArr, 0, i);
            c3152yj2.write(bArr, 0, bArr.length);
            return i;
        } finally {
            if (interfaceC4752tsM69734k4 != null) {
                interfaceC4752tsM69734k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m69740kk() {
        C13981tl c13981tl = this.f48385to.get_Item("keyEncryptors");
        if (c13981tl == null) {
            throw new InvalidOperationException();
        }
        C13981tl c13981tl2 = c13981tl.get_Item("keyEncryptor");
        if (c13981tl2 == null) {
            throw new InvalidOperationException();
        }
        C13981tl c13981tl3 = c13981tl2.get_Item("p:encryptedKey");
        m69737k4(c13981tl3);
        this.f48379du.m64592k4(m69743x1(c13981tl3));
        this.f48379du.m64600x1(m69739kk(c13981tl3));
        this.f48379du.m64594k4(C14080ne.m66934jd(c13981tl3.getAttributes().m65165k4("saltValue").getValue()));
        this.f48379du.m64601x1(c13981tl3.getAttributes().m65165k4("cipherAlgorithm").getValue());
        this.f48379du.m64597kk(c13981tl3.getAttributes().m65165k4("cipherChaining").getValue());
        this.f48380dy = C14080ne.m66934jd(c13981tl3.getAttributes().m65165k4("encryptedVerifierHashInput").getValue());
        this.f48377c5 = C14080ne.m66934jd(c13981tl3.getAttributes().m65165k4("encryptedVerifierHashValue").getValue());
        this.f48383jd = C14080ne.m66934jd(c13981tl3.getAttributes().m65165k4("encryptedKeyValue").getValue());
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC4736my m69744x1(String str) {
        return AbstractC4736my.m19679x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    private long m69731k4(long j) {
        return j + ((long) C7019kk.m27441k4(11));
    }

    /* JADX INFO: renamed from: x1 */
    private C13810lu m69745x1() {
        C13810lu c13810lu = new C13810lu();
        C13981tl c13981tl = this.f48385to.get_Item("keyData");
        c13810lu.m64594k4(C14080ne.m66934jd(c13981tl.getAttributes().m65165k4("saltValue").getValue()));
        c13810lu.m64601x1(c13981tl.getAttributes().m65165k4("cipherAlgorithm").getValue());
        c13810lu.m64597kk(c13981tl.getAttributes().m65165k4("cipherChaining").getValue());
        c13810lu.m64593k4(c13981tl.getAttributes().m65165k4("hashAlgorithm").getValue());
        c13810lu.m64592k4(m69743x1(c13981tl));
        c13810lu.m64600x1(m69739kk(c13981tl));
        return c13810lu;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m69746k4(C3152yj c3152yj) {
        int iM69730k4;
        C3152yj c3152yj2 = new C3152yj();
        byte[] bArr = new byte[4096];
        int iM69730k42 = m69730k4(c3152yj, c3152yj2, bArr, 0L);
        while (true) {
            long j = iM69730k42;
            if (j >= c3152yj.getLength() || (iM69730k4 = m69730k4(c3152yj, c3152yj2, bArr, j)) == 0) {
                break;
            }
            iM69730k42 += iM69730k4;
        }
        return c3152yj2;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4705c6 m69732k4(String str) {
        return AbstractC4705c6.m19582kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4736my m69733k4(C13810lu c13810lu) {
        AbstractC4736my abstractC4736myM69744x1 = m69744x1(c13810lu.m64590du());
        if (abstractC4736myM69744x1 == null && C14113y2.m67363du(C14113y2.m67358c5(c13810lu.m64590du()), AES256KeyLoader.AES_ALGORITHM)) {
            abstractC4736myM69744x1 = new C11607k4();
        }
        if (abstractC4736myM69744x1 == null) {
            throw new NullReferenceException("Algorithm couldn't be empty.");
        }
        abstractC4736myM69744x1.m19695x1(c13810lu.m64596kk());
        abstractC4736myM69744x1.mo19609k4(c13810lu.m64599x1());
        abstractC4736myM69744x1.m19691to(1);
        int iM27428k4 = f48376yj.m27428k4(c13810lu.m64591h4());
        if (iM27428k4 == 0) {
            abstractC4736myM69744x1.m19687kk(4);
            return abstractC4736myM69744x1;
        }
        if (iM27428k4 != 1) {
            throw new InvalidOperationException();
        }
        abstractC4736myM69744x1.m19687kk(1);
        return abstractC4736myM69744x1;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4752ts m69734k4(C13810lu c13810lu, byte[] bArr, boolean z) {
        AbstractC4705c6 abstractC4705c6M69732k4 = m69732k4(c13810lu.m64598to());
        abstractC4705c6M69732k4.mo19562k4(c13810lu.m64595k4(), 0, c13810lu.m64595k4().length, null, 0);
        abstractC4705c6M69732k4.mo19564k4(bArr, 0, bArr.length);
        byte[] bArrM69738k4 = m69738k4(abstractC4705c6M69732k4.m19584fa(), c13810lu.m64596kk() / 8, PatternStyle.DiagonalCross);
        AbstractC4736my abstractC4736myM69733k4 = m69733k4(c13810lu);
        return z ? abstractC4736myM69733k4.mo19657k4(this.f48378ck, bArrM69738k4) : abstractC4736myM69733k4.mo19659x1(this.f48378ck, bArrM69738k4);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4752ts m69735k4(byte[] bArr, boolean z) {
        AbstractC4705c6 abstractC4705c6M69741m9 = m69741m9();
        try {
            byte[] bArr2 = this.f48384m9;
            abstractC4705c6M69741m9.mo19562k4(bArr2, 0, bArr2.length, null, 0);
            abstractC4705c6M69741m9.mo19564k4(bArr, 0, bArr.length);
            byte[] bArrM69738k4 = m69738k4(abstractC4705c6M69741m9.m19584fa(), this.f48379du.m64599x1() / 8, PatternStyle.DiagonalCross);
            byte[] bArrM69738k42 = m69738k4(this.f48379du.m64595k4(), this.f48379du.m64596kk() / 8, PatternStyle.DiagonalCross);
            AbstractC4736my abstractC4736myM69733k4 = m69733k4(this.f48379du);
            try {
                InterfaceC4752ts interfaceC4752tsMo19657k4 = z ? abstractC4736myM69733k4.mo19657k4(bArrM69738k4, bArrM69738k42) : abstractC4736myM69733k4.mo19659x1(bArrM69738k4, bArrM69738k42);
                if (abstractC4736myM69733k4 != null) {
                    abstractC4736myM69733k4.dispose();
                }
                abstractC4705c6M69741m9.dispose();
                return interfaceC4752tsMo19657k4;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69736k4(InterfaceC4752ts interfaceC4752ts, byte[] bArr, int i, int i2) {
        if (i2 != 0 && i2 != interfaceC4752ts.mo19562k4(bArr, i, i2, bArr, i)) {
            throw new InvalidOperationException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m69737k4(AbstractC13901ga abstractC13901ga) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(abstractC13901ga.getAttributes().m65165k4("spinCount").getValue(), iArr);
        int i = iArr[0];
        if (zM66590k4) {
            this.f48381fa = i;
        } else {
            this.f48381fa = 100000;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69747k4() {
        byte[] bArr = this.f48386up;
        byte[] bArr2 = this.f48377c5;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.f48386up;
            if (i >= bArr3.length) {
                return true;
            }
            if ((bArr3[i] & 255) != (this.f48377c5[i] & 255)) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m69738k4(byte[] bArr, int i, byte b) {
        byte[] bArr2 = new byte[i];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, C14116yg.m67507x1(bArr.length, i));
        for (int length = bArr.length; length < i; length++) {
            bArr2[length] = b;
        }
        return bArr2;
    }
}
