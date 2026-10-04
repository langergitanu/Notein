package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4742qq;
import com.aspose.slides.internal.p174hz.C4744ri;
import com.aspose.slides.internal.p174hz.C4748sv;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p525yi.AbstractC12839uz;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14118yn;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.up */
/* JADX INFO: loaded from: classes4.dex */
public class C10944up {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f38103ck = new C7017h4("1.2.840.10040.4.3", "1.2.840.113549.1.1.2", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5");

    /* JADX INFO: renamed from: c5 */
    private byte[] f38104c5;

    /* JADX INFO: renamed from: du */
    private ArrayList f38105du;

    /* JADX INFO: renamed from: dy */
    private C10937h4 f38106dy;

    /* JADX INFO: renamed from: h4 */
    private String f38107h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f38108jd;

    /* JADX INFO: renamed from: k4 */
    private String f38109k4;

    /* JADX INFO: renamed from: m9 */
    private byte[] f38111m9;

    /* JADX INFO: renamed from: x1 */
    private byte f38113x1;

    /* JADX INFO: renamed from: kk */
    private C14084qq f38110kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private C14084qq f38112to = new C14084qq();

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.up$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private byte[] f38114k4;

        /* JADX INFO: renamed from: kk */
        private C10937h4 f38115kk;

        /* JADX INFO: renamed from: x1 */
        private C14084qq f38116x1;

        public k4(C12842x1 c12842x1) {
            this.f38116x1 = new C14084qq();
            byte[] bArrM59717to = c12842x1.m59710k4(0).m59717to();
            this.f38114k4 = bArrM59717to;
            C14118yn.m67556k4(bArrM59717to);
            this.f38116x1 = C12828kk.m59651kk(c12842x1.m59710k4(1));
            this.f38115kk = new C10937h4(c12842x1.m59710k4(2));
        }

        /* JADX INFO: renamed from: k4 */
        public byte[] m52817k4() {
            return (byte[]) this.f38114k4.clone();
        }

        /* JADX INFO: renamed from: kk */
        public C10937h4 m52818kk() {
            return this.f38115kk;
        }

        /* JADX INFO: renamed from: x1 */
        public C14084qq m52819x1() {
            return this.f38116x1;
        }
    }

    public C10944up(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("crl");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.f38104c5 = bArr2;
        m52807x1(bArr2);
    }

    /* JADX INFO: renamed from: du */
    private String m52805du() {
        Class cls;
        int iM27428k4 = f38103ck.m27428k4(this.f38107h4);
        if (iM27428k4 == 0) {
            cls = C4772y9.class;
        } else if (iM27428k4 == 1) {
            cls = AbstractC12839uz.class;
        } else if (iM27428k4 != 2) {
            if (iM27428k4 != 3) {
                throw new CryptographicException(C14113y2.m67408k4("Unsupported hash algorithm: ", this.f38107h4));
            }
            cls = C4772y9.class;
        } else {
            cls = C4748sv.class;
        }
        return cls.getName();
    }

    /* JADX INFO: renamed from: x1 */
    private void m52807x1(byte[] bArr) {
        int i;
        try {
            C12842x1 c12842x1 = new C12842x1(this.f38104c5);
            if (c12842x1.m59718x1() != 48 || c12842x1.m59709k4() != 3) {
                throw new CryptographicException("Input data cannot be coded as a valid CRL.");
            }
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
            if (c12842x1M59710k4.m59718x1() != 48 || c12842x1M59710k4.m59709k4() < 3) {
                throw new CryptographicException("Input data cannot be coded as a valid CRL.");
            }
            if (c12842x1M59710k4.m59710k4(0).m59718x1() == 2) {
                this.f38113x1 = (byte) (c12842x1M59710k4.m59710k4(0).m59717to()[0] + 1);
                i = 1;
            } else {
                this.f38113x1 = (byte) 1;
                i = 0;
            }
            this.f38107h4 = C12828kk.m59652x1(c12842x1M59710k4.m59710k4(i).m59710k4(0));
            this.f38109k4 = C10936fa.m52725k4(c12842x1M59710k4.m59710k4(i + 1));
            this.f38110kk = C12828kk.m59651kk(c12842x1M59710k4.m59710k4(i + 2));
            int i2 = i + 4;
            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(i + 3);
            if (c12842x1M59710k42.m59718x1() == 23 || c12842x1M59710k42.m59718x1() == 24) {
                this.f38112to = C12828kk.m59651kk(c12842x1M59710k42);
                c12842x1M59710k42 = c12842x1M59710k4.m59710k4(i2);
                i2 = i + 5;
            }
            this.f38105du = new ArrayList();
            if (c12842x1M59710k42 == null || c12842x1M59710k42.m59718x1() != 48) {
                i2--;
            } else {
                for (int i3 = 0; i3 < c12842x1M59710k42.m59709k4(); i3++) {
                    this.f38105du.addItem(new k4(c12842x1M59710k42.m59710k4(i3)));
                }
            }
            C12842x1 c12842x1M59710k43 = c12842x1M59710k4.m59710k4(i2);
            if (c12842x1M59710k43 != null && (c12842x1M59710k43.m59718x1() & 255) == 160 && c12842x1M59710k43.m59709k4() == 1) {
                this.f38106dy = new C10937h4(c12842x1M59710k43.m59710k4(0));
            } else {
                this.f38106dy = new C10937h4(null);
            }
            if (!C14113y2.m67363du(this.f38107h4, C12828kk.m59652x1(c12842x1.m59710k4(1).m59710k4(0)))) {
                throw new CryptographicException(C14113y2.m67408k4("Input data cannot be coded as a valid CRL.", " [Non-matching signature algorithms in CRL]"));
            }
            byte[] bArrM59717to = c12842x1.m59710k4(2).m59717to();
            byte[] bArr2 = new byte[bArrM59717to.length - 1];
            this.f38111m9 = bArr2;
            C14058fa.m66596k4(bArrM59717to, 1, bArr2, 0, bArr2.length);
        } catch (Exception unused) {
            throw new CryptographicException("Input data cannot be coded as a valid CRL.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C10937h4 m52808k4() {
        return this.f38106dy;
    }

    /* JADX INFO: renamed from: kk */
    public String m52814kk() {
        return this.f38109k4;
    }

    /* JADX INFO: renamed from: to */
    public C14084qq m52815to() {
        return this.f38112to;
    }

    /* JADX INFO: renamed from: k4 */
    public k4 m52809k4(C10945x1 c10945x1) {
        if (c10945x1 != null) {
            return m52810k4(c10945x1.m52830jd());
        }
        throw new ArgumentNullException("x509");
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m52816x1() {
        if (this.f38108jd == null) {
            this.f38108jd = AbstractC4705c6.m19582kk(m52805du()).m19588x1(new C12842x1(this.f38104c5).m59710k4(0).m59708du());
        }
        return this.f38108jd;
    }

    /* JADX INFO: renamed from: k4 */
    public k4 m52810k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("serialNumber");
        }
        for (int i = 0; i < this.f38105du.size(); i++) {
            k4 k4Var = (k4) this.f38105du.get_Item(i);
            if (m52806k4(bArr, k4Var.m52817k4())) {
                return k4Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m52811k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("aa");
        }
        if (abstractC4709du instanceof AbstractC4751tq) {
            return m52813k4((AbstractC4751tq) abstractC4709du);
        }
        if (abstractC4709du instanceof AbstractC4723ix) {
            return m52812k4((AbstractC4723ix) abstractC4709du);
        }
        throw new NotSupportedException(C14113y2.m67408k4("Unknown Asymmetric Algorithm ", abstractC4709du.toString()));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m52812k4(AbstractC4723ix abstractC4723ix) {
        if (!"1.2.840.10040.4.3".equals(this.f38107h4)) {
            throw new CryptographicException(C14113y2.m67408k4("Unsupported hash algorithm: ", this.f38107h4));
        }
        C4742qq c4742qq = new C4742qq(abstractC4723ix);
        c4742qq.mo19596k4(C4772y9.class.getName());
        C12842x1 c12842x1 = new C12842x1(this.f38111m9);
        if (c12842x1.m59709k4() != 2) {
            return false;
        }
        byte[] bArrM59717to = c12842x1.m59710k4(0).m59717to();
        byte[] bArrM59717to2 = c12842x1.m59710k4(1).m59717to();
        byte[] bArr = new byte[40];
        int iM67483k4 = C14116yg.m67483k4(0, bArrM59717to.length - 20);
        C14058fa.m66596k4(bArrM59717to, iM67483k4, bArr, C14116yg.m67483k4(0, 20 - bArrM59717to.length), bArrM59717to.length - iM67483k4);
        int iM67483k42 = C14116yg.m67483k4(0, bArrM59717to2.length - 20);
        C14058fa.m66596k4(bArrM59717to2, iM67483k42, bArr, C14116yg.m67483k4(20, 40 - bArrM59717to2.length), bArrM59717to2.length - iM67483k42);
        return c4742qq.mo19597k4(m52816x1(), bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m52813k4(AbstractC4751tq abstractC4751tq) {
        C4744ri c4744ri = new C4744ri(abstractC4751tq);
        c4744ri.mo19596k4(m52805du());
        return c4744ri.mo19597k4(m52816x1(), this.f38111m9);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52806k4(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
