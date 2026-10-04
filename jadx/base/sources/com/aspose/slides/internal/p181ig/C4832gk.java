package com.aspose.slides.internal.p181ig;

import com.aspose.slides.internal.p213jw.C5536c5;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5556up;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p493x5.AbstractC12411j5;
import com.aspose.slides.internal.p517y2.InterfaceC12770jd;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.gk */
/* JADX INFO: loaded from: classes.dex */
public class C4832gk {

    /* JADX INFO: renamed from: c5 */
    private C4848m9 f13428c5;

    /* JADX INFO: renamed from: ck */
    private C4880y9 f13429ck;

    /* JADX INFO: renamed from: du */
    private AbstractC4830gf f13430du;

    /* JADX INFO: renamed from: dy */
    private C4823du f13431dy;

    /* JADX INFO: renamed from: jd */
    private C6765kp f13434jd;

    /* JADX INFO: renamed from: k4 */
    private C4879y2 f13435k4;

    /* JADX INFO: renamed from: m9 */
    private AbstractC4841k4 f13437m9;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12770jd f13439x1;

    /* JADX INFO: renamed from: to */
    private C6765kp f13438to = new C6765kp();

    /* JADX INFO: renamed from: h4 */
    private boolean f13433h4 = false;

    /* JADX INFO: renamed from: fa */
    private boolean f13432fa = true;

    /* JADX INFO: renamed from: kk */
    private AbstractC12411j5 f13436kk = AbstractC12411j5.f41416k4;

    public C4832gk(InterfaceC6311x1 interfaceC6311x1, InterfaceC12770jd interfaceC12770jd) {
        this.f13435k4 = new C4879y2(interfaceC6311x1);
        this.f13439x1 = interfaceC12770jd;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4841k4 m19956c5() {
        return this.f13437m9;
    }

    /* JADX INFO: renamed from: ck */
    public final C4848m9 m19957ck() {
        return this.f13428c5;
    }

    /* JADX INFO: renamed from: du */
    public final void m19958du() {
        m19966k4(this.f13431dy);
    }

    /* JADX INFO: renamed from: dy */
    public final void m19959dy() {
        this.f13434jd = new C6765kp();
    }

    /* JADX INFO: renamed from: fa */
    public final C6765kp m19960fa() {
        return this.f13434jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m19961h4() {
        this.f13428c5 = new C4848m9();
    }

    /* JADX INFO: renamed from: jd */
    public final C4823du m19962jd() {
        return this.f13431dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4830gf m19963k4() {
        if (!this.f13432fa) {
            m19980x1("Self closing flag is not acknowledged.");
            this.f13432fa = true;
        }
        while (!this.f13433h4) {
            this.f13436kk.mo58011k4(this, this.f13435k4);
        }
        if (this.f13438to.m26807x1() <= 0) {
            this.f13433h4 = false;
            return this.f13430du;
        }
        C4861to c4861to = new C4861to(this.f13438to.toString());
        C6765kp c6765kp = this.f13438to;
        c6765kp.m26809x1(0, c6765kp.m26807x1());
        return c4861to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19971kk() {
        this.f13437m9.m20092k4(this.f13439x1);
        m19966k4(this.f13437m9);
    }

    /* JADX INFO: renamed from: ks */
    public final void m19973ks() {
        this.f13432fa = true;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m19974m9() {
        m19966k4(this.f13428c5);
    }

    /* JADX INFO: renamed from: rv */
    public final void m19975rv() {
        this.f13435k4.m20167du();
    }

    /* JADX INFO: renamed from: to */
    public final void m19976to() {
        this.f13431dy = new C4823du();
    }

    /* JADX INFO: renamed from: up */
    public final C4879y2 m19977up() {
        return this.f13435k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19978x1() {
        this.f13435k4.m20169dy();
        this.f13436kk.mo58011k4(this, this.f13435k4);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m19981x6() {
        this.f13435k4.m20171h4();
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m19982yj() {
        if (this.f13429ck == null) {
            return false;
        }
        return C14113y2.m67363du(this.f13437m9.m20090k4(), this.f13429ck.m20090k4());
    }

    /* JADX INFO: renamed from: to */
    private void m19955to(String str) {
        InterfaceC12770jd interfaceC12770jd = this.f13439x1;
        if (interfaceC12770jd != null) {
            interfaceC12770jd.m59452k4(new C5536c5((byte) 2, C14113y2.m67402k4("Invalid character reference: {0}", str), "", null, null, new C5556up(-1L, -1L, this.f13435k4.m20174k4(), -1L, null, null)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4841k4 m19964k4(boolean z) {
        this.f13437m9 = z ? new C4880y9() : new C4839jd();
        return this.f13437m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19972kk(String str) {
        this.f13435k4.m20178k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19979x1(AbstractC12411j5 abstractC12411j5) {
        InterfaceC12770jd interfaceC12770jd = this.f13439x1;
        if (interfaceC12770jd != null) {
            interfaceC12770jd.m59452k4(new C5536c5((byte) 2, C14113y2.m67402k4("Unexpected character '{0}' in input state [{1}]", Integer.valueOf(this.f13435k4.m20174k4()), abstractC12411j5), "", null, null, new C5556up(-1L, -1L, this.f13435k4.m20174k4(), -1L, null, null)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19965k4(char c) {
        this.f13438to.m26780k4(c);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19980x1(String str) {
        InterfaceC12770jd interfaceC12770jd = this.f13439x1;
        if (interfaceC12770jd != null) {
            interfaceC12770jd.m59452k4(new C5536c5((byte) 1, str, "", null, null, new C5556up(-1L, -1L, this.f13435k4.m20174k4(), -1L, null, null)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19966k4(AbstractC4830gf abstractC4830gf) {
        this.f13430du = abstractC4830gf;
        this.f13433h4 = true;
        if (abstractC4830gf.m19946h4() != 0) {
            if (abstractC4830gf.m19946h4() == 1) {
            }
        } else {
            C4880y9 c4880y9 = (C4880y9) abstractC4830gf;
            this.f13429ck = c4880y9;
            if (c4880y9.m20102x1()) {
                this.f13432fa = false;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19967k4(AbstractC12411j5 abstractC12411j5) {
        this.f13436kk = abstractC12411j5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19968k4(String str) {
        this.f13438to.m26792k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19969k4(char[] cArr) {
        this.f13438to.m26798k4(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final char[] m19970k4(C14093tq<Character> c14093tq, boolean z) {
        int i;
        if (this.f13435k4.m20181kk()) {
            return null;
        }
        if ((C14093tq.m67296x1(c14093tq, null) && C14093tq.m67295k4(c14093tq, new C14093tq(Character.valueOf(this.f13435k4.m20190x1())))) || this.f13435k4.m20183kk('\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\f', ControlChar.SPACE_CHAR, '<', '&')) {
            return null;
        }
        this.f13435k4.m20166ck();
        if (this.f13435k4.m20182kk("#", true)) {
            boolean zM20172h4 = this.f13435k4.m20172h4("X");
            C4879y2 c4879y2 = this.f13435k4;
            String strM20189up = zM20172h4 ? c4879y2.m20189up() : c4879y2.m20195yj();
            if (strM20189up.length() != 0) {
                if (!this.f13435k4.m20188to(";")) {
                    m19955to("missing semicolon");
                }
                int[] iArr = {0};
                boolean z2 = !C14057f9.m66589k4(strM20189up, zM20172h4 ? 515 : 111, C5540dy.f15212x1, iArr) || ((i = iArr[0]) >= 55296 && i <= 57343) || i > 1114111;
                int i2 = iArr[0];
                if (!z2) {
                    return new char[]{(char) i2};
                }
                m19955to("character outside of valid range");
                return new char[]{65533};
            }
            m19955to("numeric reference with no numerals");
        } else {
            String strM20184ks = this.f13435k4.m20184ks();
            boolean zM20179k4 = this.f13435k4.m20179k4(';');
            char[][] cArr = {null};
            boolean zM19930k4 = C4821ck.m19930k4(strM20184ks, cArr);
            char[] cArr2 = cArr[0];
            if (!zM19930k4) {
                this.f13435k4.m20170fa();
                if (zM20179k4) {
                    m19955to(C14113y2.m67402k4("invalid named referenece '{0}'", strM20184ks));
                }
                return null;
            }
            if (!z || (!this.f13435k4.m20186rv() && !this.f13435k4.m20194x6() && !this.f13435k4.m20183kk('=', '-', '_'))) {
                if (!this.f13435k4.m20188to(";")) {
                    m19955to("missing semicolon");
                }
                return cArr2;
            }
        }
        this.f13435k4.m20170fa();
        return null;
    }
}
