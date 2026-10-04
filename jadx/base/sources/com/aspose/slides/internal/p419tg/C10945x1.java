package com.aspose.slides.internal.p419tg;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4718gk;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.AbstractC4765wz;
import com.aspose.slides.internal.p174hz.AbstractC4777yo;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p174hz.C4737na;
import com.aspose.slides.internal.p174hz.C4742qq;
import com.aspose.slides.internal.p174hz.C4744ri;
import com.aspose.slides.internal.p174hz.C4748sv;
import com.aspose.slides.internal.p174hz.C4753u1;
import com.aspose.slides.internal.p174hz.C4754u4;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.internal.p174hz.C4767x5;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p525yi.AbstractC12835to;
import com.aspose.slides.internal.p525yi.AbstractC12839uz;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14118yn;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10945x1 {

    /* JADX INFO: renamed from: c5 */
    private C12842x1 f38119c5;

    /* JADX INFO: renamed from: ck */
    private byte[] f38120ck;

    /* JADX INFO: renamed from: du */
    private C12842x1 f38121du;

    /* JADX INFO: renamed from: dy */
    private byte[] f38122dy;

    /* JADX INFO: renamed from: fa */
    private byte[] f38123fa;

    /* JADX INFO: renamed from: h4 */
    private String f38124h4;

    /* JADX INFO: renamed from: ix */
    private byte[] f38125ix;

    /* JADX INFO: renamed from: jd */
    private String f38126jd;

    /* JADX INFO: renamed from: k4 */
    private C12842x1 f38127k4;

    /* JADX INFO: renamed from: ks */
    private byte[] f38129ks;

    /* JADX INFO: renamed from: m9 */
    private String f38130m9;

    /* JADX INFO: renamed from: ne */
    private int f38131ne;

    /* JADX INFO: renamed from: rv */
    private AbstractC4751tq f38132rv;

    /* JADX INFO: renamed from: u4 */
    private byte[] f38134u4;

    /* JADX INFO: renamed from: up */
    private String f38135up;

    /* JADX INFO: renamed from: uz */
    private byte[] f38136uz;

    /* JADX INFO: renamed from: wl */
    private C10937h4 f38137wl;

    /* JADX INFO: renamed from: x1 */
    private byte[] f38138x1;

    /* JADX INFO: renamed from: x6 */
    private AbstractC4723ix f38139x6;

    /* JADX INFO: renamed from: yj */
    private byte[] f38140yj;

    /* JADX INFO: renamed from: qq */
    private static String f38118qq = C14113y2.m67402k4("Input data cannot be coded as a valid certificate.", new Object[0]);

    /* JADX INFO: renamed from: ar */
    private static final C7017h4 f38117ar = new C7017h4("1.2.840.113549.1.1.2", "1.2.840.113549.1.1.3", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5", "1.3.14.3.2.29", "1.2.840.10040.4.3", "1.2.840.113549.1.1.11", "1.2.840.113549.1.1.12", "1.2.840.113549.1.1.13");

    /* JADX INFO: renamed from: kk */
    private C14084qq f38128kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private C14084qq f38133to = new C14084qq();

    public C10945x1(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0 && bArr[0] != 48) {
                try {
                    bArr = m52820k4("CERTIFICATE", bArr);
                } catch (Exception e) {
                    throw new CryptographicException(f38118qq, e);
                }
            }
            m52822x1(bArr);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public byte[] m52823c5() {
        byte[] bArr = this.f38138x1;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ck */
    public byte[] m52824ck() {
        if (this.f38123fa == null) {
            return null;
        }
        switch (f38117ar.m27428k4(this.f38135up)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return (byte[]) this.f38123fa.clone();
            case 5:
                C12842x1 c12842x1 = new C12842x1(this.f38123fa);
                if (c12842x1.m59709k4() != 2) {
                    return null;
                }
                byte[] bArrM59717to = c12842x1.m59710k4(0).m59717to();
                byte[] bArrM59717to2 = c12842x1.m59710k4(1).m59717to();
                byte[] bArr = new byte[40];
                int iM67483k4 = C14116yg.m67483k4(0, bArrM59717to.length - 20);
                C14058fa.m66596k4(bArrM59717to, iM67483k4, bArr, C14116yg.m67483k4(0, 20 - bArrM59717to.length), bArrM59717to.length - iM67483k4);
                int iM67483k42 = C14116yg.m67483k4(0, bArrM59717to2.length - 20);
                C14058fa.m66596k4(bArrM59717to2, iM67483k42, bArr, C14116yg.m67483k4(20, 40 - bArrM59717to2.length), bArrM59717to2.length - iM67483k42);
                return bArr;
            default:
                throw new CryptographicException(C14113y2.m67408k4("Unsupported hash algorithm: ", this.f38135up));
        }
    }

    /* JADX INFO: renamed from: du */
    public String m52825du() {
        return this.f38130m9;
    }

    /* JADX INFO: renamed from: dy */
    public AbstractC4751tq m52826dy() {
        if (this.f38132rv == null) {
            C4701bs c4701bs = new C4701bs();
            C12842x1 c12842x1 = new C12842x1(this.f38120ck);
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
            if (c12842x1M59710k4 == null || c12842x1M59710k4.m59718x1() != 2) {
                return null;
            }
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(1);
            if (c12842x1M59710k42.m59718x1() != 2) {
                return null;
            }
            c4701bs.f13121m9 = m52821kk(c12842x1M59710k4.m59717to());
            c4701bs.f13117dy = c12842x1M59710k42.m59717to();
            C4724j2 c4724j2 = new C4724j2(c4701bs.f13121m9.length << 3);
            this.f38132rv = c4724j2;
            c4724j2.mo19639k4(c4701bs.Clone());
        }
        return this.f38132rv;
    }

    /* JADX INFO: renamed from: fa */
    public String m52827fa() {
        return this.f38135up;
    }

    /* JADX INFO: renamed from: h4 */
    public byte[] m52828h4() {
        byte[] bArr = this.f38122dy;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ix */
    public C12842x1 m52829ix() {
        return this.f38121du;
    }

    /* JADX INFO: renamed from: jd */
    public byte[] m52830jd() {
        byte[] bArr = this.f38125ix;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4723ix m52831k4() {
        if (this.f38122dy == null) {
            throw new CryptographicException("Missing key algorithm parameters.");
        }
        if (this.f38139x6 == null) {
            C4762wl c4762wl = new C4762wl();
            C12842x1 c12842x1 = new C12842x1(this.f38120ck);
            if (c12842x1.m59718x1() != 2) {
                return null;
            }
            c4762wl.f13303dy = m52821kk(c12842x1.m59717to());
            C12842x1 c12842x12 = new C12842x1(this.f38122dy);
            if (c12842x12.m59718x1() != 48 || c12842x12.m59709k4() < 3 || c12842x12.m59710k4(0).m59718x1() != 2 || c12842x12.m59710k4(1).m59718x1() != 2 || c12842x12.m59710k4(2).m59718x1() != 2) {
                return null;
            }
            c4762wl.f13308to = m52821kk(c12842x12.m59710k4(0).m59717to());
            c4762wl.f13302du = m52821kk(c12842x12.m59710k4(1).m59717to());
            c4762wl.f13309x1 = m52821kk(c12842x12.m59710k4(2).m59717to());
            C4754u4 c4754u4 = new C4754u4(c4762wl.f13303dy.length << 3);
            this.f38139x6 = c4754u4;
            c4754u4.mo19634x1(c4762wl.Clone());
        }
        return this.f38139x6;
    }

    /* JADX INFO: renamed from: kk */
    public byte[] m52837kk() {
        AbstractC4705c6 abstractC4705c6M59702du;
        if (this.f38129ks == null) {
            switch (f38117ar.m27428k4(this.f38135up)) {
                case 0:
                    abstractC4705c6M59702du = AbstractC12839uz.m59702du();
                    break;
                case 1:
                    abstractC4705c6M59702du = AbstractC12835to.m59678du();
                    break;
                case 2:
                    abstractC4705c6M59702du = AbstractC4715g8.m19610du();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC4705c6M59702du = AbstractC4739nv.m19710du();
                    break;
                case 6:
                    abstractC4705c6M59702du = AbstractC4718gk.m19620du();
                    break;
                case 7:
                    abstractC4705c6M59702du = AbstractC4777yo.m19835du();
                    break;
                case 8:
                    abstractC4705c6M59702du = AbstractC4765wz.m19796du();
                    break;
                default:
                    return null;
            }
            C12842x1 c12842x1 = this.f38127k4;
            if (c12842x1 == null || c12842x1.m59709k4() < 1) {
                return null;
            }
            byte[] bArrM59708du = this.f38127k4.m59710k4(0).m59708du();
            this.f38129ks = abstractC4705c6M59702du.m19586kk(bArrM59708du, 0, bArrM59708du.length);
        }
        return (byte[]) this.f38129ks.clone();
    }

    /* JADX INFO: renamed from: ks */
    public C14084qq m52838ks() {
        return this.f38133to;
    }

    /* JADX INFO: renamed from: m9 */
    public byte[] m52839m9() {
        byte[] bArr = this.f38120ck;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ne */
    public boolean m52840ne() {
        if (!C14113y2.m67363du(this.f38124h4, this.f38126jd)) {
            return false;
        }
        if (m52826dy() != null) {
            return m52847x1(m52826dy());
        }
        if (m52831k4() != null) {
            return m52846x1(m52831k4());
        }
        return false;
    }

    /* JADX INFO: renamed from: rv */
    public int m52841rv() {
        return this.f38131ne;
    }

    /* JADX INFO: renamed from: to */
    public String m52842to() {
        return this.f38124h4;
    }

    /* JADX INFO: renamed from: u4 */
    public C12842x1 m52843u4() {
        return this.f38119c5;
    }

    /* JADX INFO: renamed from: up */
    public String m52844up() {
        return this.f38126jd;
    }

    /* JADX INFO: renamed from: x1 */
    public C10937h4 m52845x1() {
        return this.f38137wl;
    }

    /* JADX INFO: renamed from: x6 */
    public boolean m52848x6() {
        return m52836k4(C14084qq.m67074c5().Clone());
    }

    /* JADX INFO: renamed from: yj */
    public C14084qq m52849yj() {
        return this.f38128kk;
    }

    /* JADX INFO: renamed from: kk */
    private byte[] m52821kk(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        C14058fa.m66596k4(bArr, 1, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m52822x1(byte[] bArr) {
        int i;
        try {
            C12842x1 c12842x1 = new C12842x1(bArr);
            this.f38127k4 = c12842x1;
            if (c12842x1.m59718x1() != 48) {
                throw new CryptographicException(f38118qq);
            }
            C12842x1 c12842x1M59710k4 = this.f38127k4.m59710k4(0).m59718x1() != 48 ? this.f38127k4 : this.f38127k4.m59710k4(0);
            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(0);
            this.f38131ne = 1;
            if ((c12842x1M59710k42.m59718x1() & 255) != 160 || c12842x1M59710k42.m59709k4() <= 0) {
                i = 0;
            } else {
                this.f38131ne += c12842x1M59710k42.m59710k4(0).m59717to()[0];
                i = 1;
            }
            C12842x1 c12842x1M59710k43 = c12842x1M59710k4.m59710k4(i);
            if (c12842x1M59710k43.m59718x1() != 2) {
                throw new CryptographicException(f38118qq);
            }
            byte[] bArrM59717to = c12842x1M59710k43.m59717to();
            this.f38125ix = bArrM59717to;
            C14118yn.m67557k4(bArrM59717to, 0, bArrM59717to.length);
            C12842x1 c12842x1M59711k4 = c12842x1M59710k4.m59711k4(i + 2, PatternStyle.Wave);
            this.f38121du = c12842x1M59711k4;
            this.f38124h4 = C10936fa.m52725k4(c12842x1M59711k4);
            C12842x1 c12842x1M59711k42 = c12842x1M59710k4.m59711k4(i + 3, PatternStyle.Wave);
            this.f38128kk = C12828kk.m59651kk(c12842x1M59711k42.m59710k4(0));
            this.f38133to = C12828kk.m59651kk(c12842x1M59711k42.m59710k4(1));
            C12842x1 c12842x1M59711k43 = c12842x1M59710k4.m59711k4(i + 4, PatternStyle.Wave);
            this.f38119c5 = c12842x1M59711k43;
            this.f38126jd = C10936fa.m52725k4(c12842x1M59711k43);
            int i2 = i + 6;
            C12842x1 c12842x1M59711k44 = c12842x1M59710k4.m59711k4(i + 5, PatternStyle.Wave);
            C12842x1 c12842x1M59711k45 = c12842x1M59711k44.m59711k4(0, PatternStyle.Wave);
            this.f38130m9 = C12828kk.m59652x1(c12842x1M59711k45.m59711k4(0, (byte) 6));
            this.f38122dy = c12842x1M59711k45.m59709k4() > 1 ? c12842x1M59711k45.m59710k4(1).m59708du() : null;
            C12842x1 c12842x1M59711k46 = c12842x1M59711k44.m59711k4(1, (byte) 3);
            int iM59716kk = c12842x1M59711k46.m59716kk() - 1;
            this.f38120ck = new byte[iM59716kk];
            C14058fa.m66596k4(c12842x1M59711k46.m59717to(), 1, this.f38120ck, 0, iM59716kk);
            byte[] bArrM59717to2 = this.f38127k4.m59710k4(2).m59717to();
            byte[] bArr2 = new byte[bArrM59717to2.length - 1];
            this.f38123fa = bArr2;
            C14058fa.m66596k4(bArrM59717to2, 1, bArr2, 0, bArr2.length);
            if (this.f38127k4.m59710k4(0).m59718x1() == 48) {
                C12842x1 c12842x1M59710k44 = this.f38127k4.m59710k4(1);
                this.f38135up = C12828kk.m59652x1(c12842x1M59710k44.m59711k4(0, (byte) 6));
                C12842x1 c12842x1M59710k45 = c12842x1M59710k44.m59710k4(1);
                if (c12842x1M59710k45 != null) {
                    this.f38140yj = c12842x1M59710k45.m59708du();
                } else {
                    this.f38140yj = null;
                }
            }
            C12842x1 c12842x1M59711k47 = c12842x1M59710k4.m59711k4(i2, (byte) -127);
            if (c12842x1M59711k47 != null) {
                i2 = i + 7;
                this.f38134u4 = c12842x1M59711k47.m59717to();
            }
            C12842x1 c12842x1M59711k48 = c12842x1M59710k4.m59711k4(i2, (byte) -126);
            if (c12842x1M59711k48 != null) {
                i2++;
                this.f38136uz = c12842x1M59711k48.m59717to();
            }
            C12842x1 c12842x1M59711k49 = c12842x1M59710k4.m59711k4(i2, (byte) -93);
            if (c12842x1M59711k49 == null || c12842x1M59711k49.m59709k4() != 1) {
                this.f38137wl = new C10937h4(null);
            } else {
                this.f38137wl = new C10937h4(c12842x1M59711k49.m59710k4(0));
            }
            this.f38138x1 = (byte[]) bArr.clone();
        } catch (Exception e) {
            throw new CryptographicException(f38118qq, e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m52832k4(AbstractC4723ix abstractC4723ix) {
        this.f38139x6 = abstractC4723ix;
        if (abstractC4723ix != null) {
            this.f38132rv = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m52833k4(AbstractC4751tq abstractC4751tq) {
        if (abstractC4751tq != null) {
            this.f38139x6 = null;
        }
        this.f38132rv = abstractC4751tq;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m52846x1(AbstractC4723ix abstractC4723ix) {
        C4742qq c4742qq = new C4742qq(abstractC4723ix);
        c4742qq.mo19596k4(C4772y9.class.getName());
        return c4742qq.mo19597k4(m52837kk(), m52824ck());
    }

    /* JADX INFO: renamed from: k4 */
    public void m52834k4(byte[] bArr) {
        this.f38122dy = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m52847x1(AbstractC4751tq abstractC4751tq) {
        Class cls;
        C4744ri c4744ri = new C4744ri(abstractC4751tq);
        switch (f38117ar.m27428k4(this.f38135up)) {
            case 0:
                cls = AbstractC12839uz.class;
                break;
            case 1:
                cls = AbstractC12835to.class;
                break;
            case 2:
                cls = C4748sv.class;
                break;
            case 3:
            case 4:
                cls = C4772y9.class;
                break;
            case 5:
                return false;
            case 6:
                cls = C4767x5.class;
                break;
            case 7:
                cls = C4737na.class;
                break;
            case 8:
                cls = C4753u1.class;
                break;
            default:
                throw new CryptographicException(C14113y2.m67408k4("Unsupported hash algorithm: ", this.f38135up));
        }
        c4744ri.mo19596k4(cls.getName());
        return c4744ri.mo19597k4(m52837kk(), m52824ck());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m52835k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("aa");
        }
        if (abstractC4709du instanceof AbstractC4751tq) {
            return m52847x1((AbstractC4751tq) abstractC4709du);
        }
        if (abstractC4709du instanceof AbstractC4723ix) {
            return m52846x1((AbstractC4723ix) abstractC4709du);
        }
        throw new NotSupportedException(C14113y2.m67408k4("Unknown Asymmetric Algorithm ", abstractC4709du.toString()));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m52836k4(C14084qq c14084qq) {
        return C14084qq.m67094k4(c14084qq, m52849yj()) && C14084qq.m67116to(c14084qq, m52838ks());
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m52820k4(String str, byte[] bArr) {
        String strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(bArr);
        String strM67402k4 = C14113y2.m67402k4("-----BEGIN {0}-----", str);
        String strM67402k42 = C14113y2.m67402k4("-----END {0}-----", str);
        int length = strM67402k4.length() + C14113y2.m67364dy(strM26681x1, strM67402k4);
        return C14080ne.m66934jd(C14113y2.m67443x1(strM26681x1, length, C14113y2.m67378k4(strM26681x1, strM67402k42, length) - length));
    }
}
