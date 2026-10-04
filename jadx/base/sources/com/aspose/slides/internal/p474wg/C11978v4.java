package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.v4 */
/* JADX INFO: loaded from: classes5.dex */
class C11978v4 extends AbstractC11979vh {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11998zj f40434k4;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ C11975um f40435x1;

    public C11978v4(C11975um c11975um, C11998zj c11998zj) {
        this.f40435x1 = c11975um;
        this.f40434k4 = c11998zj;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11979vh
    /* JADX INFO: renamed from: k4 */
    public void mo55973k4(C11971tq c11971tq) {
        boolean zM56125m9 = c11971tq.m56125m9();
        if (c11971tq.m56120dy()) {
            this.f40434k4.m56123k4(zM56125m9, c11971tq.m56118c5());
            this.f40434k4.m56292ck();
            return;
        }
        if (this.f40435x1.f40411u4) {
            Exception exception = this.f40435x1.f40416vh;
            if (this.f40435x1.f40388g8 != null) {
                if (exception == null) {
                    this.f40434k4.m56299k4(zM56125m9, this.f40435x1.f40388g8);
                } else {
                    this.f40434k4.m56123k4(zM56125m9, exception);
                }
                this.f40434k4.m56292ck();
                return;
            }
            if (exception != null) {
                this.f40434k4.m56123k4(zM56125m9, exception);
                this.f40434k4.m56292ck();
                return;
            }
        }
        if (this.f40435x1.f40419wl) {
            return;
        }
        this.f40435x1.f40419wl = true;
        this.f40435x1.f40405s7 = 0;
        C11975um c11975um = this.f40435x1;
        c11975um.f40384e0 = c11975um.m56236wl();
        C11975um c11975um2 = this.f40435x1;
        C11934f9 c11934f9 = c11975um2.f40384e0;
        C11975um c11975um3 = this.f40435x1;
        c11975um2.f40406ss = c11934f9.m55949k4(c11975um3, c11975um3.f40426yj);
    }
}
