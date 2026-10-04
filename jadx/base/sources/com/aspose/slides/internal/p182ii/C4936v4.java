package com.aspose.slides.internal.p182ii;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C4936v4 extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f13511dy = new C7017h4("checkbox", "button", "file", "color", "date", "datetime", "datetime-local", "email", "hidden", "image", "month", "number", "password", "radio", "range", "reset", FirebaseAnalytics.Event.SEARCH, "submit", "tel", "text", "time", "url", "week");

    /* JADX INFO: renamed from: du */
    private boolean f13512du;

    /* JADX INFO: renamed from: h4 */
    private boolean f13513h4;

    /* JADX INFO: renamed from: kk */
    private C4918ne f13514kk;

    /* JADX INFO: renamed from: m9 */
    private String f13515m9;

    /* JADX INFO: renamed from: to */
    private boolean f13516to;

    public C4936v4(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: gf */
    private void m20633gf() {
        if (this.f13516to) {
            return;
        }
        this.f13513h4 = m20660tq();
        this.f13516to = true;
    }

    /* JADX INFO: renamed from: y9 */
    private void m20634y9() {
        if (this.f13512du) {
            return;
        }
        this.f13515m9 = m20657qw();
        this.f13512du = true;
    }

    /* JADX INFO: renamed from: ai */
    public final boolean m20635ai() {
        m20633gf();
        return this.f13513h4;
    }

    /* JADX INFO: renamed from: ar */
    public final void m20636ar(String str) {
        mo22708k4("accesskey", str);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m20637b3(String str) {
        mo22708k4("usemap", str);
    }

    /* JADX INFO: renamed from: bs */
    public final String m20638bs() {
        return m59490c5("name", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: bv */
    public final void m20639bv(String str) {
        mo22708k4("alt", str);
    }

    /* JADX INFO: renamed from: ca */
    public final int m20640ca() {
        return ((Short) m59497k4("maxlength", Short.MAX_VALUE, (Class<short>) Short.class)).shortValue();
    }

    /* JADX INFO: renamed from: du */
    public final void m20641du(boolean z) {
        m8444kk("readonly", z);
    }

    /* JADX INFO: renamed from: em */
    public final String m20642em() {
        return m59490c5("align", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: he */
    public final boolean m20643he() {
        return mo22698c5("readonly");
    }

    /* JADX INFO: renamed from: j2 */
    public final C4918ne m20644j2() {
        if (this.f13514kk == null) {
            this.f13514kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13514kk;
    }

    /* JADX INFO: renamed from: j5 */
    public final String m20645j5() {
        return m59490c5("usemap", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: jw */
    public final int m20646jw() {
        return ((Integer) m59497k4("size", 20, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20647k4(int i) {
        m59500k4("maxlength", i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m20649kk(int i) {
        m59500k4("tabindex", i);
    }

    /* JADX INFO: renamed from: lr */
    public final void m20651lr(String str) {
        mo22708k4("src", str);
    }

    /* JADX INFO: renamed from: m2 */
    public final String m20652m2() {
        return m59490c5(C18437z2.f56754h, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: m4 */
    public final int m20653m4() {
        return ((Integer) m59497k4("tabindex", 0, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: nv */
    public final String m20654nv() {
        m20634y9();
        return this.f13515m9;
    }

    /* JADX INFO: renamed from: os */
    public final String m20655os() {
        return m59490c5("accesskey", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: qq */
    public final void m20656qq(String str) {
        mo22708k4("accept", str);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20657qw() {
        return m59490c5("value", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: ri */
    public final boolean m20658ri() {
        return mo22698c5("disabled");
    }

    /* JADX INFO: renamed from: to */
    public final void m20659to(boolean z) {
        m8444kk("disabled", z);
    }

    /* JADX INFO: renamed from: tq */
    public final boolean m20660tq() {
        return mo22698c5("checked");
    }

    /* JADX INFO: renamed from: um */
    public final void m20661um(String str) {
        mo22708k4("align", str);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m20662v4(String str) {
        mo22708k4("name", str);
    }

    /* JADX INFO: renamed from: w6 */
    public final String m20663w6() {
        return m59490c5("accept", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: wl */
    public final void m20664wl(String str) {
        m20634y9();
        mo22708k4("value", str);
    }

    /* JADX INFO: renamed from: wy */
    public final void m20665wy(String str) {
        this.f13515m9 = str;
        this.f13512du = true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20666x1(int i) {
        m59500k4("size", i);
    }

    /* JADX INFO: renamed from: y2 */
    public final String m20667y2() {
        return m59490c5("src", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: yd */
    public final void m20668yd(String str) {
        mo22708k4(C18437z2.f56754h, str);
    }

    /* JADX INFO: renamed from: zj */
    public final String m20669zj() {
        return m59490c5("alt", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        switch (f13511dy.m27428k4(C14113y2.m67368h4(m20652m2()))) {
            case 0:
                interfaceC1566du.mo8426x1(this);
                break;
            case 1:
            case 2:
                interfaceC1566du.mo8393k4(this);
                break;
            case 3:
                interfaceC1566du.mo8402ks(this);
                break;
            case 4:
                interfaceC1566du.mo8360c5(this);
                break;
            case 5:
                interfaceC1566du.mo8364dy(this);
                break;
            case 6:
                interfaceC1566du.mo8411up(this);
                break;
            case 7:
                interfaceC1566du.mo8403m9(this);
                break;
            case 10:
                interfaceC1566du.mo8370jd(this);
                break;
            case 11:
                interfaceC1566du.mo8434yj(this);
                break;
            case 12:
                interfaceC1566du.mo8406rv(this);
                break;
            case 13:
                interfaceC1566du.mo8432x6(this);
                break;
            case 14:
                interfaceC1566du.mo8400kk(this);
                break;
            case 15:
                interfaceC1566du.mo8393k4(this);
                break;
            case 16:
                interfaceC1566du.mo8363du(this);
                break;
            case 17:
                interfaceC1566du.mo8393k4(this);
                break;
            case 18:
                interfaceC1566du.mo8408to(this);
                break;
            case 19:
                interfaceC1566du.mo8406rv(this);
                break;
            case 20:
                interfaceC1566du.mo8366fa(this);
                break;
            case 21:
                interfaceC1566du.mo8367h4(this);
                break;
            case 22:
                interfaceC1566du.mo8362ck(this);
                break;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m20650kk(boolean z) {
        this.f13513h4 = z;
        this.f13516to = true;
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13514kk = c4918ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20648k4(boolean z) {
        m20633gf();
        m8444kk("checked", z);
    }
}
