package com.aspose.slides.internal.p390s1;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p154gr.C4378x1;
import com.aspose.slides.internal.p226kf.InterfaceC5669k4;
import com.aspose.slides.internal.p226kf.InterfaceC5671to;
import com.aspose.slides.internal.p226kf.InterfaceC5672x1;
import com.aspose.slides.internal.p228kh.C5674k4;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p334pa.C9435kk;
import com.aspose.slides.internal.p334pa.C9436x1;
import com.aspose.slides.internal.p361qh.C9878du;
import com.aspose.slides.internal.p361qh.C9880kk;
import com.aspose.slides.internal.p361qh.C9881to;
import com.aspose.slides.internal.p361qh.C9882x1;
import com.aspose.slides.internal.p373qy.C9965x1;
import com.aspose.slides.internal.p373qy.InterfaceC9964k4;
import com.aspose.slides.internal.p390s1.C10129kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.s1.to */
/* JADX INFO: loaded from: classes4.dex */
public final class C10130to {

    /* JADX INFO: renamed from: du */
    private static final C11913yj f36303du;

    /* JADX INFO: renamed from: to */
    private static String f36304to;

    /* JADX INFO: renamed from: c5 */
    private final C12019um f36305c5;

    /* JADX INFO: renamed from: ck */
    private final String f36306ck;

    /* JADX INFO: renamed from: dy */
    private final boolean f36307dy;

    /* JADX INFO: renamed from: fa */
    private C10129kk f36308fa;

    /* JADX INFO: renamed from: h4 */
    private final float f36309h4;

    /* JADX INFO: renamed from: ix */
    private float f36310ix;

    /* JADX INFO: renamed from: jd */
    private final InterfaceC5669k4 f36311jd;

    /* JADX INFO: renamed from: k4 */
    protected final C12013m9 f36312k4;

    /* JADX INFO: renamed from: kk */
    protected final AbstractC12008jd f36313kk;

    /* JADX INFO: renamed from: ks */
    private InterfaceC9964k4 f36314ks;

    /* JADX INFO: renamed from: m9 */
    private final float f36315m9;

    /* JADX INFO: renamed from: u4 */
    private float f36318u4;

    /* JADX INFO: renamed from: up */
    private InterfaceC10127du f36319up;

    /* JADX INFO: renamed from: uz */
    private float f36320uz;

    /* JADX INFO: renamed from: wl */
    private float f36321wl;

    /* JADX INFO: renamed from: x1 */
    protected final C12013m9 f36322x1;

    /* JADX INFO: renamed from: yj */
    private InterfaceC5671to f36324yj;

    /* JADX INFO: renamed from: rv */
    private final boolean f36317rv = false;

    /* JADX INFO: renamed from: x6 */
    private List<InterfaceC10128k4> f36323x6 = new ArrayList();

    /* JADX INFO: renamed from: ne */
    private int f36316ne = 0;

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static {
        /*
            r0 = 1070141403(0x3fc90fdb, float:1.5707964)
            com.aspose.slides.internal.w8.yj r0 = com.aspose.slides.internal.p472w8.C11913yj.m55754x1(r0)
            com.aspose.slides.internal.p390s1.C10130to.f36303du = r0
            java.lang.String r0 = com.aspose.slides.p559ms.System.C14052dq.f47188k4
            if (r0 == 0) goto L1c
            int r1 = r0.length()
            if (r1 == 0) goto L1c
            r1 = 1
            void r1 = org.json.JSONObject.<init>()
            r2 = 10
            if (r1 != r2) goto L1e
        L1c:
            java.lang.String r0 = "\n"
        L1e:
            com.aspose.slides.internal.p390s1.C10130to.f36304to = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.internal.p390s1.C10130to.<clinit>():void");
    }

    public C10130to(AbstractC12008jd abstractC12008jd, String str, C12013m9 c12013m9, C12013m9 c12013m92, InterfaceC5669k4 interfaceC5669k4, C12019um c12019um, float f, float f2) {
        if (c12013m9 == null) {
            throw new ArgumentNullException("Value of 'font' cannot be null");
        }
        this.f36313kk = abstractC12008jd;
        this.f36306ck = str != null ? str.replaceAll("\uffff", "\ufffe") : "";
        this.f36312k4 = c12013m9;
        this.f36322x1 = c12013m92;
        this.f36311jd = interfaceC5669k4;
        this.f36307dy = c12019um == null;
        this.f36305c5 = c12019um == null ? new C12019um() : c12019um;
        this.f36309h4 = f;
        this.f36315m9 = f2;
        m49743rv();
    }

    /* JADX INFO: renamed from: ar */
    private void m49734ar() {
        C12013m9 c12013m9 = m49749x6() ? this.f36322x1 : null;
        InterfaceC5672x1 interfaceC5672x1Mo67640k4 = AbstractC14124to.m67614jd().mo67640k4(this.f36306ck, new C10131x1(this.f36306ck, this.f36312k4, c12013m9), this.f36311jd);
        this.f36324yj = interfaceC5672x1Mo67640k4.mo23086k4();
        if (m49740k4(this.f36312k4, this.f36306ck)) {
            this.f36314ks = new C9965x1(this.f36306ck, this.f36312k4, c12013m9);
        } else {
            this.f36314ks = interfaceC5672x1Mo67640k4.mo23087x1();
        }
    }

    /* JADX INFO: renamed from: ix */
    private float m49736ix() {
        float fM49752du = m49752du(this.f36321wl);
        return this.f36308fa.f36299yj > 1 ? ((r1 - 1) * this.f36321wl) + this.f36320uz + fM49752du : fM49752du;
    }

    /* JADX INFO: renamed from: ne */
    private float m49741ne() {
        int i = this.f36308fa.f36299yj;
        return i == 1 ? (this.f36305c5.m56803ck() || this.f36305c5.m56818ks() || m49749x6()) ? this.f36321wl : this.f36321wl - this.f36320uz : i * this.f36321wl;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX INFO: renamed from: qq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C10129kk m49742qq() {
        boolean z = true;
        C10129kk c10129kk = new C10129kk();
        c10129kk.f36293k4 = this.f36306ck;
        c10129kk.f36298x1 = this.f36312k4;
        C12019um c12019um = this.f36305c5;
        c10129kk.f36294kk = c12019um;
        if (c12019um.m56803ck()) {
            c10129kk.f36288du = this.f36309h4;
            c10129kk.f36296to = this.f36315m9;
        } else {
            c10129kk.f36296to = this.f36309h4;
            c10129kk.f36288du = this.f36315m9;
        }
        if (this.f36307dy) {
            c10129kk.f36295m9 = 0.0f;
            c10129kk.f36289dy = C4378x1.m17688x1(this.f36313kk, this.f36312k4);
        } else {
            float[] fArr = {0.0f};
            c10129kk.f36289dy = this.f36305c5.m56815k4(fArr);
            c10129kk.f36295m9 = fArr[0];
        }
        if (this.f36306ck.contains("\t")) {
            float[] fArr2 = c10129kk.f36289dy;
            if (fArr2.length <= 1 && (fArr2.length != 1 || fArr2[0] == 0.0f)) {
                z = false;
            }
        }
        c10129kk.f36291h4 = z;
        c10129kk.f36286c5 = f36304to;
        c10129kk.f36292jd = 0;
        c10129kk.f36287ck = 0;
        return c10129kk;
    }

    /* JADX INFO: renamed from: rv */
    private void m49743rv() {
        C12013m9 c12013m9M49747wl = m49747wl();
        this.f36310ix = C7035kk.m27492k4(c12013m9M49747wl);
        this.f36318u4 = C7035kk.m27501x1(c12013m9M49747wl);
        this.f36320uz = C7035kk.m27500to(c12013m9M49747wl);
        this.f36321wl = C7035kk.m27499kk(c12013m9M49747wl);
        if (this.f36306ck.length() > 0) {
            m49734ar();
        }
        C10129kk c10129kkM49742qq = m49742qq();
        this.f36308fa = c10129kkM49742qq;
        this.f36319up = c10129kkM49742qq.f36291h4 ? this.f36305c5.m56809jd() ? new C9880kk(this, this.f36308fa) : new C9881to(this, this.f36308fa) : this.f36305c5.m56809jd() ? new C9882x1(this, this.f36308fa) : new C9878du(this, this.f36308fa);
        while (true) {
            InterfaceC10128k4 interfaceC10128k4M49744u4 = m49744u4();
            if (interfaceC10128k4M49744u4 == null) {
                return;
            } else {
                this.f36323x6.add(interfaceC10128k4M49744u4);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    private InterfaceC10128k4 m49744u4() {
        C10129kk c10129kk = this.f36308fa;
        if (c10129kk == null || c10129kk.f36287ck >= c10129kk.f36293k4.length() || this.f36308fa.f36296to < 0.0f || !m49746uz()) {
            return null;
        }
        C10129kk c10129kk2 = this.f36308fa;
        c10129kk2.f36292jd = c10129kk2.f36287ck;
        this.f36319up.mo48690k4();
        C10129kk c10129kk3 = this.f36308fa;
        int i = c10129kk3.f36287ck;
        int i2 = c10129kk3.f36292jd;
        if (i <= i2) {
            return null;
        }
        c10129kk3.f36297up = c10129kk3.f36293k4.substring(i2, i);
        return m49739k4(this.f36308fa);
    }

    /* JADX INFO: renamed from: um */
    private boolean m49745um() {
        return false;
    }

    /* JADX INFO: renamed from: uz */
    private boolean m49746uz() {
        return m49762k4(false);
    }

    /* JADX INFO: renamed from: wl */
    private C12013m9 m49747wl() {
        C12013m9 c12013m9 = this.f36322x1;
        return c12013m9 != null ? c12013m9 : this.f36312k4;
    }

    /* JADX INFO: renamed from: x6 */
    private boolean m49749x6() {
        return (this.f36322x1 == null || this.f36312k4.m56648m9().equals(this.f36322x1.m56648m9())) ? false : true;
    }

    /* JADX INFO: renamed from: c5 */
    public float m49750c5() {
        return this.f36310ix;
    }

    /* JADX INFO: renamed from: ck */
    public float m49751ck() {
        return this.f36320uz;
    }

    /* JADX INFO: renamed from: du */
    public float m49752du(float f) {
        if (m49764kk().m56820ne()) {
            return f;
        }
        int i = this.f36308fa.f36299yj;
        return i == 0 ? f * 1.11f : (i == 1 && (m49764kk().m56803ck() || m49764kk().m56818ks())) ? f * 1.11f : m49745um() ? (f - this.f36320uz) * 1.11f : this.f36320uz == 0.0f ? f * 1.11f : f * 1.08f;
    }

    /* JADX INFO: renamed from: dy */
    public InterfaceC10128k4 m49754dy() {
        if (this.f36316ne >= this.f36323x6.size()) {
            return null;
        }
        List<InterfaceC10128k4> list = this.f36323x6;
        int i = this.f36316ne;
        this.f36316ne = i + 1;
        return list.get(i);
    }

    /* JADX INFO: renamed from: fa */
    public float m49755fa() {
        return this.f36321wl;
    }

    /* JADX INFO: renamed from: h4 */
    public float m49756h4() {
        Iterator<InterfaceC10128k4> it = this.f36323x6.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float fMo46215kk = it.next().mo46215kk();
            if (fMo46215kk > f) {
                f = fMo46215kk;
            }
        }
        return m49763kk(f) + f;
    }

    /* JADX INFO: renamed from: jd */
    public float m49757jd() {
        return this.f36318u4;
    }

    /* JADX INFO: renamed from: k4 */
    public float m49758k4() {
        return this.f36309h4;
    }

    /* JADX INFO: renamed from: kk */
    public float m49763kk(float f) {
        return (m49737k4(this.f36313kk, this.f36305c5, this.f36312k4) * 2.0f) + m49735h4(f);
    }

    /* JADX INFO: renamed from: ks */
    public C11913yj m49765ks() {
        if (m49764kk().m56825x1() == 0) {
            return null;
        }
        float fM49769up = m49769up();
        if (C14064he.m66703du(fM49769up)) {
            fM49769up = 0.0f;
        }
        float fM49736ix = fM49769up - m49736ix();
        if (fM49769up > 0.0f && fM49736ix <= 0.0f) {
            return null;
        }
        if (m49764kk().m56825x1() == 1) {
            fM49736ix /= 2.0f;
        } else if (m49764kk().m56803ck() && m49764kk().m56818ks()) {
            return null;
        }
        return m49764kk().m56803ck() ? C11913yj.m55753to(fM49736ix, 0.0f) : C11913yj.m55753to(0.0f, fM49736ix);
    }

    /* JADX INFO: renamed from: m9 */
    public float m49766m9() {
        return this.f36305c5.m56820ne() ? m49741ne() : m49736ix();
    }

    /* JADX INFO: renamed from: to */
    public float m49767to(float f) {
        return (f - (m49737k4(this.f36313kk, this.f36305c5, this.f36312k4) * 2.0f)) / (m49748x1(true) + 1.0f);
    }

    /* JADX INFO: renamed from: up */
    public float m49769up() {
        float fM49758k4 = this.f36305c5.m56803ck() ? m49758k4() : m49770x1();
        this.f36305c5.m56820ne();
        return fM49758k4;
    }

    /* JADX INFO: renamed from: x1 */
    public float m49770x1() {
        return this.f36315m9;
    }

    /* JADX INFO: renamed from: yj */
    public C11913yj m49772yj() {
        return m49764kk().m56803ck() ? f36303du : C11913yj.f40121k4;
    }

    /* JADX INFO: renamed from: h4 */
    private float m49735h4(float f) {
        return m49748x1(this.f36308fa.f36299yj > 1) * f;
    }

    /* JADX INFO: renamed from: du */
    public int m49753du() {
        return this.f36308fa.f36299yj;
    }

    /* JADX INFO: renamed from: k4 */
    public float m49759k4(float f) {
        return m49737k4(this.f36313kk, this.f36305c5, this.f36312k4);
    }

    /* JADX INFO: renamed from: kk */
    public C12019um m49764kk() {
        return this.f36305c5;
    }

    /* JADX INFO: renamed from: to */
    public int m49768to() {
        return this.f36308fa.f36287ck;
    }

    /* JADX INFO: renamed from: x1 */
    public float m49771x1(float f) {
        return m49737k4(this.f36313kk, this.f36305c5, this.f36312k4) + m49735h4(f);
    }

    /* JADX INFO: renamed from: x1 */
    private float m49748x1(boolean z) {
        if (this.f36305c5.m56820ne()) {
            return 0.0f;
        }
        return z ? 0.003f : 0.03f;
    }

    /* JADX INFO: renamed from: k4 */
    public float m49760k4(int i, int i2) {
        return this.f36314ks.mo23081k4(i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m49737k4(AbstractC12008jd abstractC12008jd, C12019um c12019um, C12013m9 c12013m9) {
        if (c12019um.m56820ne()) {
            return 0.0f;
        }
        return C7035kk.m27490k4(c12013m9.m56639dy(), c12013m9.m56640fa(), abstractC12008jd) * 0.16666667f;
    }

    /* JADX INFO: renamed from: k4 */
    public int m49761k4(int i, float f) {
        return this.f36314ks.mo23082k4(i, f);
    }

    /* JADX INFO: renamed from: k4 */
    private C9435kk m49738k4(C10129kk.k4 k4Var, float f) {
        return new C9435kk(this, new C5674k4(this.f36324yj, k4Var.f36300k4, k4Var.f36302x1), this.f36314ks, k4Var.f36301kk, f, k4Var.f36300k4, k4Var.f36302x1, this.f36306ck.substring(k4Var.f36300k4, k4Var.f36302x1));
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC10128k4 m49739k4(C10129kk c10129kk) {
        InterfaceC10128k4 interfaceC10128k4M49738k4;
        float f = this.f36321wl * c10129kk.f36299yj;
        if (c10129kk.f36290fa.isEmpty()) {
            return null;
        }
        if (c10129kk.f36290fa.size() == 1) {
            interfaceC10128k4M49738k4 = m49738k4(c10129kk.f36290fa.poll(), f);
        } else {
            C9436x1 c9436x1 = new C9436x1(this, c10129kk.f36292jd, c10129kk.f36287ck, this.f36308fa.f36297up);
            for (C10129kk.k4 k4Var : c10129kk.f36290fa) {
                c9436x1.m46223k4(m49738k4(k4Var, f), k4Var.f36301kk);
            }
            c10129kk.m49732k4();
            interfaceC10128k4M49738k4 = c9436x1;
        }
        c10129kk.f36299yj++;
        return interfaceC10128k4M49738k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m49740k4(C12013m9 c12013m9, String str) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m49762k4(boolean z) {
        float fM49769up = m49769up();
        float fM49766m9 = 0.0f;
        boolean z2 = true;
        if (fM49769up <= 0.0f || fM49769up >= 2.1474836E9f) {
            return true;
        }
        int i = (this.f36308fa.f36294kk.m56824up() && this.f36308fa.f36294kk.m56828yj() && this.f36308fa.f36294kk.m56821rv()) ? 1 : 0;
        int i2 = z ? i + 1 : i;
        try {
            C10129kk c10129kk = this.f36308fa;
            int i3 = c10129kk.f36299yj + i2;
            c10129kk.f36299yj = i3;
            if (i3 != 0) {
                fM49766m9 = m49766m9();
            }
            if (i == 0 ? fM49766m9 >= fM49769up : fM49766m9 > fM49769up) {
                z2 = false;
            }
            return z2;
        } finally {
            this.f36308fa.f36299yj -= i2;
        }
    }
}
