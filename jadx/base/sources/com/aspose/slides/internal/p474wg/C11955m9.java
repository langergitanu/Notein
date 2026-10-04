package com.aspose.slides.internal.p474wg;

import androidx.core.content.OooO0O0;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.m9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11955m9 {

    /* JADX INFO: renamed from: c5 */
    private boolean f40317c5;

    /* JADX INFO: renamed from: ck */
    private String f40318ck;

    /* JADX INFO: renamed from: du */
    private C14062gk f40319du;

    /* JADX INFO: renamed from: dy */
    private C14084qq f40320dy;

    /* JADX INFO: renamed from: fa */
    private String f40321fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f40322h4;

    /* JADX INFO: renamed from: jd */
    private String f40323jd;

    /* JADX INFO: renamed from: ks */
    private C14084qq f40324ks;

    /* JADX INFO: renamed from: m9 */
    private String f40325m9;

    /* JADX INFO: renamed from: ne */
    private boolean f40326ne;

    /* JADX INFO: renamed from: rv */
    private String f40327rv;

    /* JADX INFO: renamed from: to */
    private String f40328to;

    /* JADX INFO: renamed from: up */
    private int[] f40329up;

    /* JADX INFO: renamed from: x6 */
    private int f40330x6;

    /* JADX INFO: renamed from: yj */
    private boolean f40331yj;

    /* JADX INFO: renamed from: k4 */
    static char[] f40314k4 = {ControlChar.SPACE_CHAR, '=', ';', ',', '\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\t'};

    /* JADX INFO: renamed from: x1 */
    static char[] f40316x1 = {'\"', ','};

    /* JADX INFO: renamed from: kk */
    static String f40315kk = "()<>@,;:\\\"/[]?={} \t";

    public C11955m9() {
        this.f40320dy = new C14084qq();
        this.f40324ks = new C14084qq();
        C14084qq.f47299x1.CloneTo(this.f40320dy);
        C14084qq.m67081jd().CloneTo(this.f40324ks);
        String str = C14113y2.f47374k4;
        this.f40325m9 = str;
        this.f40323jd = str;
        this.f40327rv = str;
        this.f40328to = str;
        this.f40321fa = str;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m56048k4(int i, int i2, int i3, int i4, int i5) {
        return (((i ^ ((i2 >> 19) | (i2 << 13))) ^ ((i3 << 26) | (i3 >> 6))) ^ ((i4 << 7) | (i4 >> 25))) ^ ((i5 << 20) | (i5 >> 12));
    }

    /* JADX INFO: renamed from: c5 */
    public String m56049c5() {
        return this.f40323jd;
    }

    /* JADX INFO: renamed from: ck */
    public String m56050ck() {
        return this.f40321fa;
    }

    /* JADX INFO: renamed from: du */
    public void m56051du(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f40321fa = C14113y2.f47374k4;
            return;
        }
        if (str.charAt(0) != '\"' || OooO0O0.OooO00o(1, str) != '\"') {
            throw new C11946jd(C14113y2.m67408k4("The 'Port'='", str, "' part of the cookie is invalid. Port must be enclosed by double quotes."));
        }
        this.f40321fa = str;
        String[] strArrM67369h4 = C14113y2.m67369h4(str, f40316x1);
        this.f40329up = new int[AbstractC14092to.m67208k4((Object) strArrM67369h4).m67265du()];
        for (int i = 0; i < AbstractC14092to.m67208k4((Object) this.f40329up).m67265du(); i++) {
            this.f40329up[i] = Integer.MIN_VALUE;
            if (strArrM67369h4[i].length() != 0) {
                try {
                    this.f40329up[i] = C14057f9.m66582k4(strArrM67369h4[i]);
                } catch (Exception e) {
                    throw new C11946jd(C14113y2.m67408k4("The 'Port'='", str, "' part of the cookie is invalid. Invalid value: ", strArrM67369h4[i]), e);
                }
            }
        }
        m56059k4(1);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m56053dy() {
        return this.f40317c5;
    }

    public boolean equals(Object obj) {
        C11955m9 c11955m9 = (C11955m9) C7019kk.m27452k4(obj, C11955m9.class);
        return c11955m9 != null && C14113y2.m67383k4(this.f40323jd, c11955m9.f40323jd, true, C11697x1.m55250kk()) == 0 && C14113y2.m67383k4(this.f40327rv, c11955m9.f40327rv, false, C11697x1.m55250kk()) == 0 && C14113y2.m67383k4(m56057jd(), c11955m9.m56057jd(), false, C11697x1.m55250kk()) == 0 && C14113y2.m67383k4(this.f40325m9, c11955m9.f40325m9, true, C11697x1.m55250kk()) == 0 && this.f40330x6 == c11955m9.f40330x6;
    }

    /* JADX INFO: renamed from: fa */
    public int[] m56054fa() {
        return this.f40329up;
    }

    /* JADX INFO: renamed from: h4 */
    public void m56055h4(String str) {
        if (str == null) {
            this.f40327rv = C14113y2.f47374k4;
        } else {
            this.f40327rv = str;
        }
    }

    public int hashCode() {
        return m56048k4(CaseInsensitiveHashCodeProvider.getDefaultInvariant().hashCode(this.f40323jd), this.f40327rv.hashCode(), m56057jd().hashCode(), CaseInsensitiveHashCodeProvider.getDefaultInvariant().hashCode(this.f40325m9), this.f40330x6);
    }

    /* JADX INFO: renamed from: jd */
    public String m56057jd() {
        String str = this.f40318ck;
        return str == null ? C14113y2.f47374k4 : str;
    }

    /* JADX INFO: renamed from: kk */
    public void m56065kk(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new C11946jd("Name cannot be empty");
        }
        if (str.charAt(0) == '$' || C14113y2.m67384k4(str, f40314k4) != -1) {
            this.f40323jd = C14113y2.f47374k4;
            throw new C11946jd("Name contains invalid characters");
        }
        this.f40323jd = str;
    }

    /* JADX INFO: renamed from: ks */
    public String m56068ks() {
        return this.f40327rv;
    }

    /* JADX INFO: renamed from: m9 */
    public C14084qq m56069m9() {
        return this.f40320dy;
    }

    /* JADX INFO: renamed from: rv */
    public int m56070rv() {
        return this.f40330x6;
    }

    /* JADX INFO: renamed from: to */
    public String m56071to() {
        return this.f40325m9;
    }

    public String toString() {
        return m56076x1((C14062gk) null);
    }

    /* JADX INFO: renamed from: up */
    public boolean m56074up() {
        return this.f40331yj;
    }

    /* JADX INFO: renamed from: x1 */
    public C14062gk m56075x1() {
        return this.f40319du;
    }

    /* JADX INFO: renamed from: yj */
    public C14084qq m56079yj() {
        return this.f40324ks;
    }

    public C11955m9(String str, String str2) {
        this();
        m56065kk(str);
        m56055h4(str2);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m56056h4() {
        return C14084qq.m67116to(this.f40320dy, C14084qq.m67081jd()) && C14084qq.m67078dy(this.f40320dy, C14084qq.f47299x1);
    }

    /* JADX INFO: renamed from: k4 */
    public String m56058k4() {
        return this.f40328to;
    }

    /* JADX INFO: renamed from: kk */
    public void m56066kk(boolean z) {
        this.f40317c5 = z;
    }

    /* JADX INFO: renamed from: to */
    public void m56072to(String str) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f40318ck = str;
    }

    /* JADX INFO: renamed from: x1 */
    public String m56076x1(C14062gk c14062gk) {
        if (this.f40323jd.length() == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp(64);
        if (this.f40330x6 > 0) {
            c6765kp.m26792k4("$Version=").m26805kk(this.f40330x6).m26792k4("; ");
        }
        c6765kp.m26792k4(this.f40323jd).m26792k4("=").m26792k4(this.f40327rv);
        if (this.f40330x6 == 0) {
            return c6765kp.toString();
        }
        if (!C14113y2.m67411k4(this.f40318ck)) {
            c6765kp.m26792k4("; $Path=").m26792k4(this.f40318ck);
        }
        if ((c14062gk == null || !C14113y2.m67363du(c14062gk.m66678du(), this.f40325m9)) && !C14113y2.m67411k4(this.f40325m9)) {
            c6765kp.m26792k4("; $Domain=").m26792k4(this.f40325m9);
        }
        String str = this.f40321fa;
        if (str != null && str.length() != 0) {
            c6765kp.m26792k4("; $Port=").m26792k4(this.f40321fa);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56059k4(int i) {
        if (i < 0 || i > 10) {
            this.f40330x6 = 0;
        } else {
            this.f40330x6 = i;
        }
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56067kk() {
        return this.f40322h4;
    }

    /* JADX INFO: renamed from: to */
    public void m56073to(boolean z) {
        this.f40331yj = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56077x1(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f40325m9 = C14113y2.f47374k4;
            m56078x1(false);
            return;
        }
        this.f40325m9 = str;
        if (C11972ts.m56134k4(str, new C11972ts[]{null})) {
            m56078x1(false);
        } else {
            m56078x1(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56060k4(C14062gk c14062gk) {
        this.f40319du = c14062gk;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56078x1(boolean z) {
        this.f40326ne = z;
    }

    /* JADX INFO: renamed from: du */
    public boolean m56052du() {
        return this.f40326ne;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56061k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f40320dy);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56062k4(String str) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f40328to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56063k4(boolean z) {
        this.f40322h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56064k4(int[] iArr) {
        this.f40329up = iArr;
    }
}
