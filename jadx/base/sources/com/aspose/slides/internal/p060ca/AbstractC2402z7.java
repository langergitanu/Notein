package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.z7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2402z7 implements InterfaceC2030c9 {

    /* JADX INFO: renamed from: du */
    private long f8340du;

    /* JADX INFO: renamed from: h4 */
    private double f8341h4;

    /* JADX INFO: renamed from: kk */
    private boolean f8343kk;

    /* JADX INFO: renamed from: m9 */
    private C2372xo f8344m9;

    /* JADX INFO: renamed from: to */
    private C2054dt f8345to;

    /* JADX INFO: renamed from: k4 */
    public Dictionary<AbstractC2220nx, C2014bp> f8342k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    public C2218nm f8346x1 = new C2218nm();

    /* JADX INFO: renamed from: k4 */
    public double mo11394k4() {
        return this.f8341h4;
    }

    /* JADX INFO: renamed from: kk */
    public abstract int mo11397kk(AbstractC2220nx abstractC2220nx);

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: kk */
    public C2372xo mo10316kk() {
        return this.f8344m9;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: to */
    public long mo10317to() {
        return this.f8340du;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: x1 */
    public double mo10318x1(AbstractC2220nx abstractC2220nx) {
        if (this.f8342k4.containsKey(abstractC2220nx)) {
            return this.f8342k4.get_Item(abstractC2220nx).f7004k4;
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: k4 */
    public double mo10314k4(double d) {
        return (mo11394k4() / (mo10317to() & 4294967295L)) * d;
    }

    /* JADX INFO: renamed from: x1 */
    public C2054dt mo11402x1() {
        return this.f8345to;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: k4 */
    public double mo10315k4(AbstractC2220nx abstractC2220nx, AbstractC2220nx abstractC2220nx2) {
        Dictionary[] dictionaryArr = {null};
        this.f8346x1.tryGetValue(Integer.valueOf(mo11397kk(abstractC2220nx)), dictionaryArr);
        Dictionary dictionary = dictionaryArr[0];
        if (dictionary == null) {
            return 0.0d;
        }
        int iMo11397kk = mo11397kk(abstractC2220nx2);
        if (dictionary.containsKey(Integer.valueOf(iMo11397kk))) {
            return ((C2233op) dictionary.get_Item(Integer.valueOf(iMo11397kk))).f7698x1;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo11395k4(C2054dt c2054dt) {
        this.f8345to = c2054dt;
    }

    /* JADX INFO: renamed from: k4 */
    public void m11814k4(AbstractC2220nx abstractC2220nx, double d, C2054dt c2054dt) {
        C2014bp c2014bp = new C2014bp();
        c2014bp.f7004k4 = d;
        c2014bp.f7005x1 = c2054dt;
        this.f8342k4.set_Item(abstractC2220nx, c2014bp);
    }

    /* JADX INFO: renamed from: k4 */
    public void m11815k4(AbstractC2220nx abstractC2220nx, AbstractC2220nx abstractC2220nx2, double d) {
        C2233op c2233op = new C2233op();
        c2233op.f7697k4 = mo11397kk(abstractC2220nx2);
        c2233op.f7698x1 = d;
        this.f8346x1.m11179k4(mo11397kk(abstractC2220nx), c2233op);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11816k4(boolean z) {
        this.f8343kk = z;
    }
}
