package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.rv */
/* JADX INFO: loaded from: classes5.dex */
class C11965rv {

    /* JADX INFO: renamed from: k4 */
    static AbstractC4720he f40340k4 = AbstractC4720he.m19622k4();

    /* JADX INFO: renamed from: du */
    private C11951ks f40341du;

    /* JADX INFO: renamed from: h4 */
    private String f40342h4;

    /* JADX INFO: renamed from: to */
    private AbstractC4705c6 f40344to;

    /* JADX INFO: renamed from: x1 */
    private C14084qq f40345x1 = new C14084qq();

    /* JADX INFO: renamed from: kk */
    private int f40343kk = 1;

    public C11965rv() {
        C14084qq.m67081jd().CloneTo(this.f40345x1);
    }

    /* JADX INFO: renamed from: du */
    public String m56101du() {
        return this.f40341du.m56007du();
    }

    /* JADX INFO: renamed from: h4 */
    public String m56102h4() {
        if (this.f40342h4 == null) {
            byte[] bArr = new byte[15];
            f40340k4.mo19624k4(bArr);
            this.f40342h4 = C14080ne.m66952k4(bArr);
            AbstractC14092to.m67225k4(bArr, 0, 15);
        }
        return this.f40342h4;
    }

    /* JADX INFO: renamed from: k4 */
    public C11986x1 m56103k4(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        String strM56003x1;
        if (this.f40341du == null) {
            throw new InvalidOperationException();
        }
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class);
        if (c11975um == null) {
            return null;
        }
        C14084qq.m67081jd().CloneTo(this.f40345x1);
        C11950kp c11950kpMo55894k4 = interfaceC11926c6.mo55894k4(c11975um.mo56240yj(), "digest");
        if (c11950kpMo55894k4 == null || (strM56003x1 = c11950kpMo55894k4.m56003x1()) == null || "".equals(strM56003x1)) {
            return null;
        }
        String strM56002kk = c11950kpMo55894k4.m56002kk();
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("Digest username=\"{0}\", ", strM56003x1);
        c6765kp.m26796k4("realm=\"{0}\", ", m56109x1());
        c6765kp.m26796k4("nonce=\"{0}\", ", m56106kk());
        c6765kp.m26796k4("uri=\"{0}\", ", c11975um.m56209k4().m66680fa());
        if (m56104k4() != null) {
            c6765kp.m26796k4("algorithm=\"{0}\", ", m56104k4());
        }
        c6765kp.m26796k4("response=\"{0}\", ", m56099k4(strM56003x1, strM56002kk, c11975um));
        if (m56101du() != null) {
            c6765kp.m26796k4("qop=\"{0}\", ", m56101du());
        }
        synchronized (this) {
            try {
                if (m56101du() != null) {
                    c6765kp.m26796k4("nc={0:X8}, ", C7019kk.m27466x1(this.f40343kk));
                    this.f40343kk++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m56102h4() != null) {
            c6765kp.m26796k4("cnonce=\"{0}\", ", m56102h4());
        }
        if (m56108to() != null) {
            c6765kp.m26796k4("opaque=\"{0}\", ", m56108to());
        }
        c6765kp.m26801k4(c6765kp.m26807x1() - 2);
        return new C11986x1(c6765kp.toString());
    }

    /* JADX INFO: renamed from: kk */
    public String m56106kk() {
        return this.f40341du.m56010kk();
    }

    /* JADX INFO: renamed from: m9 */
    public C14084qq m56107m9() {
        return this.f40345x1;
    }

    /* JADX INFO: renamed from: to */
    public String m56108to() {
        return this.f40341du.m56012x1();
    }

    /* JADX INFO: renamed from: x1 */
    public String m56109x1() {
        return this.f40341du.m56009k4();
    }

    /* JADX INFO: renamed from: x1 */
    private String m56100x1(String str) {
        AbstractC4705c6 abstractC4705c6 = this.f40344to;
        if (abstractC4705c6 == null) {
            return null;
        }
        abstractC4705c6.mo18846c5();
        byte[] bArrM19588x1 = this.f40344to.m19588x1(AbstractC6747ar.m26650yj().mo26677to(str));
        C6765kp c6765kp = new C6765kp();
        for (byte b : bArrM19588x1) {
            c6765kp.m26792k4(C14098up.m67320k4(b, "x2"));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public String m56104k4() {
        return this.f40341du.m56011to();
    }

    /* JADX INFO: renamed from: k4 */
    private String m56097k4(C11975um c11975um) {
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}", c11975um.mo56204fa(), c11975um.mo56240yj().m66680fa());
        "auth-int".equals(m56101du());
        return m56100x1(strM67402k4);
    }

    /* JADX INFO: renamed from: k4 */
    private String m56098k4(String str, String str2) {
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}:{2}", str, m56109x1(), str2);
        if (m56104k4() != null && "md5-sess".equals(C14113y2.m67368h4(m56104k4()))) {
            strM67402k4 = C14113y2.m67402k4("{0}:{1}:{2}", m56100x1(strM67402k4), m56106kk(), m56102h4());
        }
        return m56100x1(strM67402k4);
    }

    /* JADX INFO: renamed from: k4 */
    private String m56099k4(String str, String str2, C11975um c11975um) {
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}:", m56098k4(str, str2), m56106kk());
        if (m56101du() != null) {
            strM67402k4 = C14113y2.m67400k4(strM67402k4, C14113y2.m67402k4("{0}:{1}:{2}:", C14057f9.m66587k4(this.f40343kk, "X8"), m56102h4(), m56101du()));
        }
        return m56100x1(C14113y2.m67400k4(strM67402k4, m56097k4(c11975um)));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56105k4(String str) {
        C11951ks c11951ks = new C11951ks(str);
        this.f40341du = c11951ks;
        if (!c11951ks.m56008h4()) {
            return false;
        }
        if (this.f40341du.m56011to() != null && !C14113y2.m67448x1(C14113y2.m67358c5(this.f40341du.m56011to()), "MD5")) {
            return true;
        }
        this.f40344to = AbstractC4715g8.m19610du();
        return true;
    }
}
