package com.aspose.slides.internal.p400sk;

import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p252lk.C6103h4;
import com.aspose.slides.internal.p404sp.C10306c5;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10309h4;
import com.aspose.slides.internal.p535yz.C13339du;
import com.aspose.slides.internal.p535yz.C13344kk;
import com.aspose.slides.internal.p535yz.C13346to;

/* JADX INFO: renamed from: com.aspose.slides.internal.sk.to */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10231to extends C3182du {

    /* JADX INFO: renamed from: c5 */
    private String f36670c5;

    /* JADX INFO: renamed from: dy */
    private int f36671dy;

    public AbstractC10231to() {
        m50097ck(0);
        m50098ck((String) null);
    }

    /* JADX INFO: renamed from: ak */
    public final C10309h4 m50092ak() {
        return C10309h4.m50273k4(this.f9461x1.get_Item("y"));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10309h4 m50093b3() {
        return C10309h4.m50273k4(this.f9461x1.get_Item("x"));
    }

    /* JADX INFO: renamed from: bz */
    public final String m50094bz() {
        return this.f36670c5;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m50095c5(int i) {
        this.f9461x1.set_Item("font-stretch", C13344kk.m62006k4(i));
    }

    /* JADX INFO: renamed from: c6 */
    public final int m50096c6() {
        return C13339du.m61993k4(this.f9461x1.get_Item("font-weight"));
    }

    /* JADX INFO: renamed from: ck */
    public final void m50097ck(int i) {
        this.f36671dy = i;
    }

    /* JADX INFO: renamed from: dq */
    public final C10309h4 m50099dq() {
        return C10309h4.m50273k4(this.f9461x1.get_Item("dy"));
    }

    /* JADX INFO: renamed from: dy */
    public final void m50100dy(int i) {
        this.f9461x1.set_Item("font-style", C13346to.m62008k4(i));
    }

    /* JADX INFO: renamed from: e0 */
    public final int m50101e0() {
        return this.f36671dy;
    }

    /* JADX INFO: renamed from: jd */
    public final void m50102jd(int i) {
        this.f9461x1.set_Item("text-decoration", C6103h4.m24737k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50104k4(boolean z) {
        this.f9461x1.set_Item("xml:space", z ? "preserve" : null);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50105kk(C10307du c10307du) {
        this.f9461x1.set_Item("font-size", c10307du.toString());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m50107m9(int i) {
        this.f9461x1.set_Item("font-weight", C13339du.m61994k4(i));
    }

    /* JADX INFO: renamed from: ts */
    public final int m50108ts() {
        return C13346to.m62007k4(this.f9461x1.get_Item("font-style"));
    }

    /* JADX INFO: renamed from: wy */
    public final C10309h4 m50109wy() {
        return C10309h4.m50273k4(this.f9461x1.get_Item("dx"));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50110x1(C10307du c10307du) {
        this.f9461x1.set_Item("textLength", c10307du.toString());
    }

    /* JADX INFO: renamed from: xk */
    public final C10306c5 m50112xk() {
        return C10306c5.m50260k4(this.f9461x1.get_Item("rotate"));
    }

    /* JADX INFO: renamed from: ck */
    public final void m50098ck(String str) {
        this.f36670c5 = str;
    }

    /* JADX INFO: renamed from: jd */
    public final void m50103jd(String str) {
        this.f9461x1.set_Item("font-family", str);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50106kk(C10309h4 c10309h4) {
        this.f9461x1.set_Item("y", c10309h4.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50111x1(C10309h4 c10309h4) {
        this.f9461x1.set_Item("x", c10309h4.toString());
    }
}
