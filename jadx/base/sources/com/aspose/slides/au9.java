package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10376bv;

/* JADX INFO: loaded from: classes3.dex */
class au9 {

    /* JADX INFO: renamed from: du */
    private uz3 f3953du;

    /* JADX INFO: renamed from: k4 */
    protected Object f3954k4;

    /* JADX INFO: renamed from: kk */
    protected z9q f3955kk;

    /* JADX INFO: renamed from: to */
    private boolean f3956to;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC10376bv f3957x1;

    public au9(z9q z9qVar) {
        z9q z9qVar2;
        m3742k4(true);
        this.f3955kk = z9qVar;
        m3741k4((uz3) null);
        if (C7019kk.m27469x1(this.f3955kk, r9q.class) || (z9qVar2 = this.f3955kk) == null) {
            return;
        }
        z9qVar2.m74354fa().addItem(this);
    }

    /* JADX INFO: renamed from: du */
    public final rpo m3738du() {
        return mo3743kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m3739h4() {
        z9q z9qVar = this.f3955kk;
        if (z9qVar == null) {
            return true;
        }
        return z9qVar.m74358up();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo3740k4() {
    }

    /* JADX INFO: renamed from: kk */
    public rpo mo3743kk() {
        z9q z9qVar = this.f3955kk;
        if (z9qVar != null) {
            return z9qVar.m3738du();
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m3744m9() {
        return this.f3956to;
    }

    /* JADX INFO: renamed from: to */
    public final z9q m3745to() {
        return this.f3955kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10376bv m3746x1() {
        if (this.f3957x1 == null) {
            mo3740k4();
        }
        AbstractC10376bv abstractC10376bv = this.f3957x1;
        if (abstractC10376bv != null) {
            return abstractC10376bv;
        }
        throw new NullReferenceException("TargetConteiner for shape serialization is not created!");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3741k4(uz3 uz3Var) {
        this.f3953du = uz3Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3742k4(boolean z) {
        this.f3956to = z;
    }
}
