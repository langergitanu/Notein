package com.aspose.slides.internal.p430tx;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C11174bz extends AbstractC11201lr {

    /* JADX INFO: renamed from: k4 */
    private String f38472k4;

    /* JADX INFO: renamed from: x1 */
    private String f38473x1;

    public C11174bz(C11186g8 c11186g8) {
        this.f38472k4 = c11186g8.m53752x6();
        this.f38473x1 = c11186g8.m53753yj();
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11201lr
    /* JADX INFO: renamed from: k4 */
    public void mo53683k4(C11212rv c11212rv) {
        C11208qm c11208qmM53923h4;
        if (this.f38472k4.length() == 0 || (c11208qmM53923h4 = c11212rv.m53923h4(this.f38472k4)) == null) {
            return;
        }
        this.f38472k4 = c11208qmM53923h4.f38626x1;
        String str = c11208qmM53923h4.f38624k4;
        if (str != null) {
            this.f38473x1 = str;
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11201lr
    /* JADX INFO: renamed from: k4 */
    public boolean mo53684k4(C11234xw c11234xw, C11231x1 c11231x1) {
        c11234xw.m54188k4(3, null, this.f38473x1, this.f38472k4, false);
        c11234xw.m54163du(3);
        return true;
    }
}
