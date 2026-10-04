package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class xf2 implements InterfaceC1130g3 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f50069kk = new C7017h4("sin", "cos", "tan", "asin", "acos", "atan", "ln");

    /* JADX INFO: renamed from: k4 */
    public final String f50070k4;

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1130g3 f50071x1;

    public xf2(String str, InterfaceC1130g3 interfaceC1130g3) {
        this.f50070k4 = str;
        this.f50071x1 = interfaceC1130g3;
    }

    @Override // com.aspose.slides.InterfaceC1130g3
    /* JADX INFO: renamed from: k4 */
    public final float mo6404k4(kdz kdzVar) {
        double dM67495m9;
        float fMo6404k4 = this.f50071x1.mo6404k4(kdzVar);
        switch (f50069kk.m27428k4(this.f50070k4)) {
            case 0:
                dM67495m9 = C14116yg.m67495m9(fMo6404k4);
                break;
            case 1:
                dM67495m9 = C14116yg.m67470dy(fMo6404k4);
                break;
            case 2:
                dM67495m9 = C14116yg.m67466c5(fMo6404k4);
                break;
            case 3:
                dM67495m9 = C14116yg.m67467ck(fMo6404k4);
                break;
            case 4:
                dM67495m9 = C14116yg.m67473jd(fMo6404k4);
                break;
            case 5:
                dM67495m9 = C14116yg.m67471fa(fMo6404k4);
                break;
            case 6:
                dM67495m9 = C14116yg.m67511yj(fMo6404k4);
                break;
            default:
                throw new NotImplementedException();
        }
        return (float) dM67495m9;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73345k4(String str) {
        switch (f50069kk.m27428k4(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
