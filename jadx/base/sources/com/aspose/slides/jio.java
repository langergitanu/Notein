package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10752zi;

/* JADX INFO: loaded from: classes3.dex */
final class jio {

    /* JADX INFO: renamed from: du */
    private boolean f45487du;

    /* JADX INFO: renamed from: h4 */
    private boolean f45488h4;

    /* JADX INFO: renamed from: k4 */
    private int f45489k4;

    /* JADX INFO: renamed from: kk */
    private m4c f45490kk;

    /* JADX INFO: renamed from: m9 */
    private TextStyle f45491m9;

    /* JADX INFO: renamed from: to */
    private C10752zi[] f45492to;

    /* JADX INFO: renamed from: x1 */
    private a3u f45493x1;

    public jio(C10536m5 c10536m5, a3u a3uVar) {
        this.f45492to = new C10752zi[5];
        this.f45487du = false;
        this.f45488h4 = false;
        this.f45493x1 = a3uVar;
        this.f45489k4 = c10536m5.m51409um().m51922kk();
        this.f45493x1.m3197wl().addItem(Integer.valueOf(this.f45489k4), this);
        m63332k4(c10536m5);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m63326c5() {
        return this.f45488h4;
    }

    /* JADX INFO: renamed from: du */
    public final C10752zi[] m63327du() {
        return this.f45492to;
    }

    /* JADX INFO: renamed from: dy */
    public final int m63328dy() {
        int i = this.f45489k4;
        if (i < 5) {
            return -1;
        }
        return i == 6 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m63329h4() {
        return this.f45489k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63330k4() {
        if (this.f45487du) {
            return;
        }
        for (int i = 4; i > 0; i--) {
            if (this.f45492to[i] != null) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C10752zi[] c10752ziArr = this.f45492to;
                    C10752zi c10752zi = c10752ziArr[i2];
                    if (c10752zi != null) {
                        c10752ziArr[i].m52150k4(c10752zi);
                    }
                }
            }
        }
        this.f45487du = true;
    }

    /* JADX INFO: renamed from: kk */
    public final m4c m63334kk() {
        return this.f45490kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final TextStyle m63335m9() {
        return this.f45491m9;
    }

    /* JADX INFO: renamed from: to */
    public final a3u m63336to() {
        return this.f45493x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63337x1() {
        if (this.f45491m9 == null) {
            this.f45491m9 = new TextStyle(this.f45490kk.m64735up());
        }
        jha.m63318k4(this);
        this.f45488h4 = true;
    }

    public jio(C10536m5 c10536m5, m4c m4cVar) {
        this.f45492to = new C10752zi[5];
        this.f45487du = false;
        this.f45488h4 = false;
        this.f45490kk = m4cVar;
        this.f45493x1 = m4cVar.m64712du();
        this.f45489k4 = c10536m5.m51409um().m51922kk();
        this.f45490kk.m64745yj()[this.f45489k4] = this;
        m63332k4(c10536m5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63331k4(TextStyle textStyle) {
        this.f45491m9 = textStyle;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63332k4(C10536m5 c10536m5) {
        if (c10536m5 == null) {
            return;
        }
        this.f45492to = new C10752zi[5];
        for (int i = 0; i < c10536m5.m51276to().size(); i++) {
            this.f45492to[i] = new C10752zi();
            this.f45492to[i].m52150k4(c10536m5.m51276to().get_Item(i));
        }
        this.f45487du = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63333k4(jio jioVar) {
        if (jioVar == null) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (this.f45492to[i] != null) {
                int i2 = i;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    if (jioVar.m63327du()[i2] != null) {
                        this.f45492to[i].m52150k4(jioVar.m63327du()[i2]);
                        break;
                    }
                    i2--;
                }
                if (i2 < 0) {
                    return;
                }
            }
        }
    }
}
