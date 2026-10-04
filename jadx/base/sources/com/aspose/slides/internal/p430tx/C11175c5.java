package com.aspose.slides.internal.p430tx;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11175c5 extends AbstractC11201lr {

    /* JADX INFO: renamed from: du */
    private boolean f38474du;

    /* JADX INFO: renamed from: h4 */
    private Object f38475h4;

    /* JADX INFO: renamed from: k4 */
    private int f38476k4;

    /* JADX INFO: renamed from: kk */
    private String f38477kk;

    /* JADX INFO: renamed from: to */
    private String f38478to;

    /* JADX INFO: renamed from: x1 */
    private String f38479x1;

    public C11175c5(C11212rv c11212rv) {
        Object objM53678k4;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        this.f38476k4 = c11186g8M53964to.m53734fa();
        this.f38479x1 = c11186g8M53964to.m53741ks();
        this.f38477kk = c11186g8M53964to.m53753yj();
        this.f38478to = c11186g8M53964to.m53745rv();
        this.f38474du = c11186g8M53964to.m53743ne();
        int i = this.f38476k4;
        if (i == 1) {
            objM53678k4 = C11230wy.m54082k4(this.f38477kk);
        } else if (i != 2) {
            return;
        } else {
            objM53678k4 = C11171b3.m53678k4(this.f38477kk);
        }
        this.f38475h4 = objM53678k4;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11201lr
    /* JADX INFO: renamed from: k4 */
    public void mo53683k4(C11212rv c11212rv) {
        C11208qm c11208qmM53923h4;
        if ((this.f38476k4 == 2 && this.f38479x1.length() == 0) || (c11208qmM53923h4 = c11212rv.m53923h4(this.f38479x1)) == null) {
            return;
        }
        this.f38479x1 = c11208qmM53923h4.f38626x1;
        String str = c11208qmM53923h4.f38624k4;
        if (str != null) {
            this.f38478to = str;
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11201lr
    /* JADX INFO: renamed from: k4 */
    public boolean mo53684k4(C11234xw c11234xw, C11231x1 c11231x1) {
        return c11234xw.m54189k4(this.f38476k4, this.f38478to, this.f38477kk, this.f38479x1, this.f38474du, this.f38475h4, false);
    }
}
