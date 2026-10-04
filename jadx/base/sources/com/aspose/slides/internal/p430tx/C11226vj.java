package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.vj */
/* JADX INFO: loaded from: classes4.dex */
public final class C11226vj {

    /* JADX INFO: renamed from: c5 */
    private int f38714c5;

    /* JADX INFO: renamed from: ck */
    private int f38715ck;

    /* JADX INFO: renamed from: du */
    private C11199kp f38716du;

    /* JADX INFO: renamed from: h4 */
    private C11213s7 f38719h4;

    /* JADX INFO: renamed from: k4 */
    private int f38721k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC11225vh f38722kk;

    /* JADX INFO: renamed from: ks */
    private int f38723ks;

    /* JADX INFO: renamed from: rv */
    private int f38725rv;

    /* JADX INFO: renamed from: to */
    private AbstractC13883dt f38726to;

    /* JADX INFO: renamed from: up */
    private C11195jd f38727up;

    /* JADX INFO: renamed from: x1 */
    private C11226vj f38728x1;

    /* JADX INFO: renamed from: yj */
    private boolean f38729yj;

    /* JADX INFO: renamed from: m9 */
    private C11195jd f38724m9 = new C11195jd();

    /* JADX INFO: renamed from: dy */
    private ArrayList f38717dy = new ArrayList();

    /* JADX INFO: renamed from: jd */
    private ArrayList f38720jd = new ArrayList();

    /* JADX INFO: renamed from: fa */
    private C11195jd f38718fa = new C11195jd();

    public C11226vj(InterfaceC11225vh interfaceC11225vh, AbstractC13883dt abstractC13883dt) {
        this.f38722kk = interfaceC11225vh;
        abstractC13883dt = abstractC13883dt == null ? new C13963qw() : abstractC13883dt;
        this.f38726to = abstractC13883dt;
        C11199kp c11199kp = new C11199kp(abstractC13883dt);
        this.f38716du = c11199kp;
        this.f38719h4 = new C11213s7(this.f38726to, c11199kp);
    }

    /* JADX INFO: renamed from: c5 */
    private void m54028c5() {
        C11188gi c11188giM53996x1 = this.f38719h4.m53996x1();
        this.f38727up.m53823k4(15);
        this.f38727up.m53830kk(c11188giM53996x1.m53797to());
        this.f38727up.m53825k4(c11188giM53996x1.m53799x1());
        this.f38727up.m53836x1(c11188giM53996x1.m53794kk());
        this.f38727up.m53835x1(this.f38725rv);
    }

    /* JADX INFO: renamed from: ck */
    private void m54029ck() {
        this.f38727up.m53823k4(8);
        this.f38727up.m53835x1(this.f38725rv);
    }

    /* JADX INFO: renamed from: du */
    private int m54030du(int i) {
        if ((i & 16384) == 0) {
            this.f38723ks = 1;
            return 0;
        }
        this.f38723ks = 2;
        m54046ne();
        m54045m9(i);
        return this.f38722kk.mo53837k4(this);
    }

    /* JADX INFO: renamed from: fa */
    private void m54032fa() {
        if (this.f38729yj) {
            this.f38719h4.m53995kk();
            this.f38729yj = false;
        }
    }

    /* JADX INFO: renamed from: ix */
    private int m54034ix() {
        if (this.f38715ck >= this.f38720jd.size()) {
            this.f38720jd.addItem(new C11195jd());
        }
        int i = this.f38715ck;
        this.f38715ck = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: jd */
    private int m54035jd() {
        if (this.f38714c5 >= this.f38717dy.size()) {
            this.f38717dy.addItem(new C11195jd());
        }
        int i = this.f38714c5;
        this.f38714c5 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: kk */
    private static int m54042kk(String str) {
        if ("default".equals(str)) {
            return 1;
        }
        return "preserve".equals(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: ks */
    private void m54044ks() {
        for (int i = this.f38715ck - 1; i >= 0; i--) {
            ((C11195jd) this.f38717dy.get_Item(m54035jd())).m53824k4((C11195jd) this.f38720jd.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m54046ne() {
        int iM53820du = this.f38724m9.m53820du();
        if (iM53820du == 1) {
            int i = this.f38714c5;
            m54054yj();
            m54031dy(i);
            m54049up();
            m54044ks();
            return;
        }
        if (iM53820du == 7) {
            m54053x6();
        } else {
            if (iM53820du != 8) {
                return;
            }
            m54047rv();
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m54047rv() {
        String strM53832to = this.f38724m9.m53832to();
        C6765kp c6765kp = null;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < strM53832to.length(); i2++) {
            if (strM53832to.charAt(i2) != '-') {
                z = false;
            } else {
                if (z) {
                    if (c6765kp == null) {
                        c6765kp = new C6765kp(strM53832to, i, i2, strM53832to.length() * 2);
                    } else {
                        c6765kp.m26793k4(strM53832to, i, i2 - i);
                    }
                    c6765kp.m26792k4(" -");
                    i = i2 + 1;
                }
                z = true;
            }
        }
        if (c6765kp == null) {
            if (z) {
                this.f38724m9.m53827k4(" ", false);
            }
        } else {
            if (i < strM53832to.length()) {
                c6765kp.m26793k4(strM53832to, i, strM53832to.length() - i);
            }
            if (z) {
                c6765kp.m26792k4(" ");
            }
            this.f38724m9.m53833to(c6765kp.toString());
        }
    }

    /* JADX INFO: renamed from: up */
    private void m54049up() {
        for (int i = 0; i < this.f38714c5; i++) {
            C11195jd c11195jd = (C11195jd) this.f38717dy.get_Item(i);
            if (C13851ai.m65152k4(c11195jd.m53829kk(), this.f38716du.m53842du())) {
                C11188gi c11188giM53996x1 = this.f38719h4.m53996x1();
                if (C13851ai.m65152k4(c11195jd.m53822k4(), this.f38716du.m53848x1())) {
                    c11188giM53996x1.m53798to(c11195jd.m53832to());
                } else if (C13851ai.m65152k4(c11195jd.m53822k4(), this.f38716du.m53845kk())) {
                    c11188giM53996x1.m53791k4(m54042kk(c11195jd.m53832to()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m54053x6() {
        String strM53832to = this.f38724m9.m53832to();
        C6765kp c6765kp = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < strM53832to.length(); i2++) {
            char cCharAt = strM53832to.charAt(i2);
            if (cCharAt != '>') {
                if (cCharAt == '?') {
                    z = true;
                }
            } else if (z) {
                if (c6765kp == null) {
                    c6765kp = new C6765kp(strM53832to, i, i2, strM53832to.length() * 2);
                } else {
                    c6765kp.m26793k4(strM53832to, i, i2 - i);
                }
                c6765kp.m26792k4(" >");
                i = i2 + 1;
            }
            z = false;
        }
        if (c6765kp != null) {
            if (i < strM53832to.length()) {
                c6765kp.m26793k4(strM53832to, i, strM53832to.length() - i);
            }
            this.f38724m9.m53833to(c6765kp.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX INFO: renamed from: yj */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m54054yj() {
        if (C13851ai.m65152k4(this.f38724m9.m53834x1(), this.f38716du.m53844k4())) {
            this.f38724m9.m53830kk(this.f38716du.m53844k4());
        }
        if (!C13851ai.m65152k4(this.f38724m9.m53829kk(), this.f38716du.m53844k4())) {
            boolean[] zArr = {false};
            String strM53991k4 = this.f38719h4.m53991k4(this.f38724m9.m53829kk(), zArr);
            boolean z = zArr[0];
            if (strM53991k4 != null) {
                if (!C13851ai.m65152k4(this.f38724m9.m53834x1(), strM53991k4)) {
                    if (z) {
                        C11195jd c11195jd = this.f38724m9;
                        c11195jd.m53830kk(m54062k4(c11195jd.m53834x1()));
                    }
                }
            }
        } else if (!C13851ai.m65152k4(this.f38724m9.m53834x1(), this.f38719h4.m53989k4())) {
            m54051x1(this.f38724m9.m53834x1(), this.f38724m9.m53829kk());
        }
        this.f38719h4.m53996x1().m53795kk(this.f38724m9.m53829kk());
    }

    /* JADX INFO: renamed from: dy */
    public final void m54056dy() {
        if (this.f38723ks == 1) {
            this.f38723ks = 2;
            m54046ne();
            this.f38722kk.mo53837k4(this);
        }
        this.f38722kk.mo53839x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m54057h4() {
        return this.f38714c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54058k4() {
        return this.f38721k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m54066m9() {
        if (this.f38723ks == 2) {
            this.f38723ks = 0;
        }
    }

    /* JADX INFO: renamed from: to */
    public final C11195jd m54067to() {
        return this.f38724m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11226vj m54068x1() {
        return this.f38728x1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r4 != false) goto L10;
     */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m54031dy(int i) {
        String strM54062k4;
        for (int i2 = 0; i2 < i; i2++) {
            C11195jd c11195jd = (C11195jd) this.f38717dy.get_Item(i2);
            if (C13851ai.m65152k4(c11195jd.m53834x1(), this.f38716du.m53844k4())) {
                strM54062k4 = this.f38716du.m53844k4();
            } else {
                if (!C13851ai.m65152k4(c11195jd.m53829kk(), this.f38716du.m53844k4())) {
                    boolean[] zArr = {false};
                    String strM53991k4 = this.f38719h4.m53991k4(c11195jd.m53829kk(), zArr);
                    boolean z = zArr[0];
                    if (strM53991k4 == null) {
                        m54051x1(c11195jd.m53834x1(), c11195jd.m53829kk());
                    } else if (C13851ai.m65152k4(c11195jd.m53834x1(), strM53991k4)) {
                    }
                }
                strM54062k4 = m54062k4(c11195jd.m53834x1());
            }
            c11195jd.m53830kk(strM54062k4);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private int m54033h4(int i) {
        if ((i & 16384) == 0) {
            return 0;
        }
        this.f38723ks = 2;
        m54046ne();
        m54045m9(i);
        return this.f38722kk.mo53837k4(this);
    }

    /* JADX INFO: renamed from: m9 */
    private void m54045m9(int i) {
        if ((i & 1024) != 0) {
            this.f38724m9.m53828k4(false);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m54048to(int i) {
        if ((i & 8192) != 0) {
            this.f38714c5 = 0;
            this.f38715ck = 0;
            C11195jd c11195jd = this.f38724m9;
            this.f38727up = c11195jd;
            c11195jd.m53826k4(this.f38716du.m53844k4(), this.f38716du.m53844k4(), this.f38716du.m53844k4());
            this.f38727up.m53823k4(0);
            this.f38727up.m53828k4(false);
            C11195jd c11195jd2 = this.f38727up;
            c11195jd2.f38589to = null;
            c11195jd2.f38581du = null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private String m54050x1(String str) {
        String strM53997x1 = this.f38719h4.m53997x1("xp_{0}");
        m54051x1(str, strM53997x1);
        return strM53997x1;
    }

    /* JADX INFO: renamed from: du */
    public final ArrayList m54055du() {
        return this.f38717dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54059k4(int i, int i2) {
        if (!m54052x1(i)) {
            return 2;
        }
        m54043kk(i);
        m54032fa();
        this.f38729yj = (65536 & i) != 0;
        if ((i & 4096) != 0 && this.f38724m9.m53831m9()) {
            return 0;
        }
        m54048to(i);
        if ((i & 8192) != 0 && i2 == 1) {
            m54028c5();
        }
        return m54033h4(i);
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC11225vh m54065kk() {
        return this.f38722kk;
    }

    /* JADX INFO: renamed from: kk */
    private void m54043kk(int i) {
        int i2;
        int i3 = i & ViewUtils.EDGE_TO_EDGE_FLAGS;
        if (i3 == 256) {
            i2 = this.f38725rv + 1;
        } else if (i3 != 512) {
            return;
        } else {
            i2 = this.f38725rv - 1;
        }
        this.f38725rv = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m54051x1(String str, String str2) {
        C11195jd c11195jd = (C11195jd) this.f38720jd.get_Item(m54034ix());
        if (C14113y2.m67363du(str2, this.f38716du.m53844k4())) {
            c11195jd.m53826k4(this.f38716du.m53844k4(), this.f38716du.m53847to(), this.f38716du.m53846m9());
        } else {
            c11195jd.m53826k4(this.f38716du.m53847to(), str2, this.f38716du.m53846m9());
        }
        c11195jd.m53835x1(this.f38725rv);
        c11195jd.m53823k4(2);
        c11195jd.m53833to(str);
        this.f38719h4.m53992k4(str2, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54060k4(int i, int i2, String str, String str2, String str3, boolean z, Object obj, boolean z2) {
        if (!m54052x1(i)) {
            return 2;
        }
        m54043kk(i);
        m54048to(i);
        m54032fa();
        String strMo65266k4 = str != null ? this.f38726to.mo65266k4(str) : this.f38716du.m53844k4();
        String strMo65266k42 = str2 != null ? this.f38726to.mo65266k4(str2) : this.f38716du.m53844k4();
        String strMo65266k43 = str3 != null ? this.f38726to.mo65266k4(str3) : this.f38716du.m53844k4();
        if (i2 == 1) {
            this.f38724m9.f38589to = (C11230wy) C7019kk.m27452k4(obj, C11230wy.class);
            this.f38724m9.f38587kk = z2;
            m54039k4(strMo65266k4, strMo65266k42, strMo65266k43, z);
        } else if (i2 == 2) {
            m54038k4(strMo65266k4, strMo65266k42, strMo65266k43, obj, z2);
        } else if (i2 == 3) {
            m54037k4(strMo65266k42, strMo65266k43);
        } else if (i2 != 7) {
            if (i2 == 8) {
                m54029ck();
            }
        } else if (!m54041k4(strMo65266k4, strMo65266k42, strMo65266k43)) {
            return 3;
        }
        return m54030du(i);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m54052x1(int i) {
        if (this.f38723ks == 0 || (i & 8192) == 0) {
            return true;
        }
        this.f38723ks = 2;
        m54046ne();
        m54045m9(i);
        return this.f38722kk.mo53837k4(this) == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54061k4(int i, String str, boolean z) {
        if (!m54052x1(i)) {
            return 2;
        }
        m54043kk(i);
        m54048to(i);
        m54032fa();
        if ((i & 8192) != 0) {
            this.f38727up.m53835x1(this.f38725rv);
            this.f38727up.m53823k4(3);
        }
        m54040k4(str, z);
        return m54030du(i);
    }

    /* JADX INFO: renamed from: k4 */
    private int m54036k4(String str, String str2, String[] strArr) {
        for (int i = 0; i < this.f38714c5; i++) {
            C11195jd c11195jd = (C11195jd) this.f38717dy.get_Item(i);
            if (C13851ai.m65152k4(c11195jd.m53822k4(), str)) {
                if (C13851ai.m65152k4(c11195jd.m53834x1(), str2)) {
                    return i;
                }
                if (C13851ai.m65152k4(c11195jd.m53829kk(), strArr[0])) {
                    strArr[0] = C14113y2.f47374k4;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m54062k4(String str) {
        String[] strArr = {null};
        return this.f38719h4.m53994k4(str, strArr) ? strArr[0] : m54050x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54063k4(int i) {
        this.f38721k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54064k4(C11226vj c11226vj) {
        this.f38728x1 = c11226vj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m54037k4(String str, String str2) {
        if (!C13851ai.m65152k4(str, this.f38716du.m53844k4())) {
            boolean[] zArr = {false};
            String strM53991k4 = this.f38719h4.m53991k4(str, zArr);
            boolean z = zArr[0];
            if (strM53991k4 == null || (!C13851ai.m65152k4(str2, strM53991k4) && !z)) {
            }
        } else if (!C13851ai.m65152k4(str2, this.f38719h4.m53989k4()) && !C13851ai.m65152k4(this.f38724m9.m53834x1(), this.f38716du.m53844k4())) {
            m54051x1(str2, str);
        }
        C11195jd c11195jd = this.f38718fa;
        this.f38727up = c11195jd;
        c11195jd.m53823k4(2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54038k4(String str, String str2, String str3, Object obj, boolean z) {
        String[] strArr = {str};
        int iM54036k4 = m54036k4(str2, str3, strArr);
        String str4 = strArr[0];
        if (iM54036k4 == -1) {
            iM54036k4 = m54035jd();
        }
        C11195jd c11195jd = (C11195jd) this.f38717dy.get_Item(iM54036k4);
        c11195jd.m53826k4(str4, str2, str3);
        c11195jd.m53835x1(this.f38725rv);
        c11195jd.m53823k4(2);
        c11195jd.f38581du = (C11171b3) C7019kk.m27452k4(obj, C11171b3.class);
        c11195jd.f38587kk = z;
        this.f38727up = c11195jd;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54039k4(String str, String str2, String str3, boolean z) {
        this.f38727up.m53823k4(1);
        this.f38727up.m53830kk(str);
        this.f38727up.m53825k4(str2);
        this.f38727up.m53836x1(str3);
        this.f38727up.m53835x1(this.f38725rv);
        this.f38727up.m53828k4(z);
        this.f38719h4.m53993k4(str2, str3, str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54040k4(String str, boolean z) {
        this.f38727up.m53827k4(str, z);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m54041k4(String str, String str2, String str3) {
        this.f38727up.m53823k4(7);
        this.f38727up.m53830kk(str);
        this.f38727up.m53825k4(str2);
        this.f38727up.m53836x1(str3);
        this.f38727up.m53835x1(this.f38725rv);
        return true;
    }
}
