package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.h0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10459h0 extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private C10423ek f37029k4;

    /* JADX INFO: renamed from: x1 */
    private C10614qx f37030x1;

    public C10459h0() {
        super(61440);
        this.f37029k4 = null;
        this.f37030x1 = null;
        m51409um().m51920k4((short) 0);
    }

    /* JADX INFO: renamed from: du */
    public final C10534m3 m50866du() {
        return (C10534m3) C7019kk.m27452k4((Object) m50508kk(61451), C10534m3.class);
    }

    /* JADX INFO: renamed from: dy */
    public final C10439fh m50867dy() {
        return (C10439fh) C7019kk.m27452k4((Object) m50508kk(61726), C10439fh.class);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10711xc m50868h4() {
        return (C10711xc) C7019kk.m27452k4((Object) m50508kk(61730), C10711xc.class);
    }

    /* JADX INFO: renamed from: m9 */
    public final C10377bx m50869m9() {
        return (C10377bx) C7019kk.m27452k4((Object) m50508kk(61722), C10377bx.class);
    }

    /* JADX INFO: renamed from: to */
    public final C10423ek m50870to() {
        C10423ek c10423ek = this.f37029k4;
        if (c10423ek != null) {
            return c10423ek;
        }
        C10423ek c10423ek2 = (C10423ek) C7019kk.m27452k4((Object) m50508kk(61441), C10423ek.class);
        this.f37029k4 = c10423ek2;
        if (c10423ek2 == null) {
            C10423ek c10423ek3 = new C10423ek();
            this.f37029k4 = c10423ek3;
            c10423ek3.m51409um().m51920k4((short) 0);
            if (m50513yj().size() > 1) {
                m50513yj().insertItem(1, this.f37029k4);
            } else {
                m50513yj().addItem(this.f37029k4);
            }
        }
        return this.f37029k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10614qx m50871x1() {
        C10614qx c10614qx = this.f37030x1;
        if (c10614qx != null) {
            return c10614qx;
        }
        C10614qx c10614qx2 = (C10614qx) C7019kk.m27452k4((Object) m50508kk(61446), C10614qx.class);
        this.f37030x1 = c10614qx2;
        if (c10614qx2 == null && m50505fa()) {
            this.f37030x1 = new C10614qx();
            m50513yj().insertItem(0, this.f37030x1);
        }
        return this.f37030x1;
    }
}
