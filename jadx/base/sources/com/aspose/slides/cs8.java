package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class cs8 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private z0w f4434k4;

    /* JADX INFO: renamed from: x1 */
    private zsm f4435x1;

    public cs8(zsm zsmVar) {
        this.f4435x1 = zsmVar;
        zsmVar.m74792m9().m74307kk().getDisplayEquation();
        if (this.f4435x1.m74792m9().m74307kk().getDisplayRSquaredValue()) {
            z0w z0wVar = new z0w(zsmVar);
            this.f4434k4 = z0wVar;
            m73215k4(z0wVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4804k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return "";
        }
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        int length = str.length() - 1;
        do {
            char cCharAt = str.charAt(length);
            if (cCharAt != '0' && cCharAt != cM67042x1) {
                break;
            }
            length--;
        } while (length >= 0);
        return C14113y2.m67443x1(str, 0, length + 1);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        z0w z0wVar = this.f4434k4;
        if (z0wVar != null) {
            z0wVar.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        z0w z0wVar = this.f4434k4;
        if (z0wVar != null) {
            z0wVar.m73210fa(c14713vw);
            m73217kk(C14116yg.m67481k4(m73225wy(), this.f4434k4.m73225wy()));
            m73222to(m73203ak() + this.f4434k4.m73203ak());
        }
    }
}
