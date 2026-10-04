package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p407st.C10399dd;
import com.aspose.slides.internal.p407st.C10542mh;
import com.aspose.slides.internal.p407st.C10668un;

/* JADX INFO: loaded from: classes3.dex */
class kiv {

    /* JADX INFO: renamed from: c5 */
    private boolean f45739c5 = false;

    /* JADX INFO: renamed from: du */
    private boolean f45740du;

    /* JADX INFO: renamed from: dy */
    private Placeholder f45741dy;

    /* JADX INFO: renamed from: h4 */
    private uz3 f45742h4;

    /* JADX INFO: renamed from: k4 */
    private int f45743k4;

    /* JADX INFO: renamed from: kk */
    private int f45744kk;

    /* JADX INFO: renamed from: m9 */
    private uz3 f45745m9;

    /* JADX INFO: renamed from: to */
    private int f45746to;

    /* JADX INFO: renamed from: x1 */
    private int f45747x1;

    public kiv(uz3 uz3Var) {
        this.f45745m9 = uz3Var;
        m63905k4(false);
        m63904k4((uz3) null);
        this.f45741dy = (Placeholder) uz3Var.mo64936jd().getPlaceholder();
        m63903k4(0);
        m63907kk(-1);
        m63910to(this.f45741dy.getSize());
        m63897jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m63897jd() {
        this.f45745m9.m3738du().m70222ks().addItem(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final uz3 m63898c5() {
        return this.f45742h4;
    }

    /* JADX INFO: renamed from: du */
    public final int m63899du() {
        return this.f45747x1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m63900dy() {
        return this.f45740du;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m63901h4() {
        return this.f45744kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63902k4() {
        if (this.f45739c5) {
            return;
        }
        this.f45739c5 = true;
        hi8.m7175k4(this);
        int iM63909to = m63909to();
        if (iM63909to != 0) {
            if (iM63909to != 1) {
                if (iM63909to == 2) {
                    throw new NotImplementedException("No case for NewPlaceholder container type!");
                }
                return;
            }
            C10542mh c10542mhM50436x6 = m63911x1().m72007um().m50436x6();
            if (c10542mhM50436x6 == null) {
                c10542mhM50436x6 = new C10542mh();
                m63911x1().m72007um().m50507k4(c10542mhM50436x6);
            }
            c10542mhM50436x6.m51285k4(m63899du());
            return;
        }
        C10668un c10668unM50424c5 = m63911x1().m72007um().m50424c5();
        if (c10668unM50424c5 == null) {
            c10668unM50424c5 = new C10668un();
            m63911x1().m72007um().m50507k4(c10668unM50424c5);
        }
        c10668unM50424c5.m51814x1(m63899du());
        c10668unM50424c5.m51809k4(m63901h4());
        c10668unM50424c5.m51811kk(m63908m9());
        if (this.f45745m9.m3738du().m70220kk() == 4 && m63899du() == 26) {
            c10668unM50424c5.m51814x1(19);
            C10399dd c10399dd = new C10399dd();
            c10399dd.m50670k4(26);
            m63911x1().m72007um().m50507k4(c10399dd);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final Placeholder m63906kk() {
        return this.f45741dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m63908m9() {
        return this.f45746to;
    }

    /* JADX INFO: renamed from: to */
    public final int m63909to() {
        return this.f45743k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final uz3 m63911x1() {
        return this.f45745m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63903k4(int i) {
        this.f45743k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m63907kk(int i) {
        this.f45744kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m63910to(int i) {
        this.f45746to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63912x1(int i) {
        this.f45747x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63904k4(uz3 uz3Var) {
        this.f45742h4 = uz3Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63905k4(boolean z) {
        this.f45740du = z;
    }
}
