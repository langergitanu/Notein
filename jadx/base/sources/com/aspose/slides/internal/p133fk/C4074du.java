package com.aspose.slides.internal.p133fk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fk.du */
/* JADX INFO: loaded from: classes.dex */
public class C4074du {

    /* JADX INFO: renamed from: k4 */
    private C12007ix f11133k4;

    /* JADX INFO: renamed from: kk */
    private C11913yj f11134kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC4077to f11135to;

    /* JADX INFO: renamed from: x1 */
    private C11913yj f11136x1;

    public C4074du(C11906rv c11906rv, C11896dy c11896dy, C11913yj c11913yj) {
        C12007ix c12007ixMo8355dy = c11896dy.m55568ne().mo8355dy();
        this.f11133k4 = new C12007ix(c12007ixMo8355dy.m56557jd(), c12007ixMo8355dy.m56551ck(), c12007ixMo8355dy.m56550c5(), c12007ixMo8355dy.m56575x1());
        this.f11136x1 = c11913yj;
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        this.f11134kk = c11913yjM55760h4;
        c11913yjM55760h4.m55780m9();
        this.f11135to = m16229k4(c11906rv);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4077to m16229k4(C11906rv c11906rv) {
        int iM55700up = c11906rv.m55700up();
        if (iM55700up == 0) {
            return new C4076kk(this.f11133k4);
        }
        if (iM55700up == 1) {
            return new C4078x1(this.f11133k4, true, false);
        }
        if (iM55700up == 2) {
            return new C4078x1(this.f11133k4, false, true);
        }
        if (iM55700up == 3) {
            return new C4078x1(this.f11133k4, true, true);
        }
        if (iM55700up == 4) {
            return new C4075k4();
        }
        throw new ArgumentOutOfRangeException("brush.WrapMode");
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m16230k4(C12025x6 c12025x6) {
        C12025x6 c12025x6M46525k4 = C9467to.m46525k4(c12025x6, this.f11134kk);
        C12025x6 c12025x62 = new C12025x6();
        this.f11135to.mo16231k4(c12025x6M46525k4, c12025x62);
        return C9467to.m46525k4(c12025x62, this.f11136x1);
    }
}
