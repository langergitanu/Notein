package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.jk */
/* JADX INFO: loaded from: classes3.dex */
class C13689jk {

    /* JADX INFO: renamed from: k4 */
    private final String f45506k4;

    /* JADX INFO: renamed from: x1 */
    private int f45507x1 = 0;

    public C13689jk(String str) {
        this.f45506k4 = C14113y2.m67440x1(str);
    }

    /* JADX INFO: renamed from: du */
    public final void m63364du() {
        while (C14117yj.m67534ks(m63370to()) && !m63371x1()) {
            m63365h4();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m63365h4() {
        if (m63371x1()) {
            return;
        }
        this.f45507x1++;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m63366k4(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new ArgumentException("start");
        }
        if (i2 <= this.f45506k4.length()) {
            return C14113y2.m67443x1(this.f45506k4, i, i2 - i);
        }
        throw new ArgumentException("end");
    }

    /* JADX INFO: renamed from: kk */
    public final int m63369kk() {
        return this.f45507x1;
    }

    /* JADX INFO: renamed from: to */
    public final char m63370to() {
        return this.f45506k4.charAt(this.f45507x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m63371x1() {
        return this.f45507x1 >= this.f45506k4.length();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63367k4(char c) {
        m63363k4(c, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m63363k4(char c, boolean z) {
        while (!m63371x1() && m63370to() != c) {
            m63365h4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63368k4() {
        return C14113y2.m67411k4(this.f45506k4);
    }
}
