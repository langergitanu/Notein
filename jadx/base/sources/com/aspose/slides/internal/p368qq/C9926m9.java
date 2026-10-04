package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p217k4.C5587jd;
import com.aspose.slides.internal.p217k4.C5589kk;
import com.aspose.slides.internal.p217k4.C5598um;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.internal.p526yj.C12846kk;
import com.aspose.slides.internal.p526yj.C12847x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9926m9 {
    /* JADX INFO: renamed from: k4 */
    public final AbstractC5788h4 m48872k4(String str) {
        try {
            InterfaceC9933up interfaceC9933upM48871k4 = m48871k4(new C12846kk(new C5587jd(new C12847x1(new C5589kk(str)))).m59747c5());
            switch (interfaceC9933upM48871k4.mo48850k4()) {
                case 13:
                    return new C11531dy(interfaceC9933upM48871k4.mo48834du(), (short) 1);
                case 14:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 1);
                case 15:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 3);
                case 16:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 4);
                case 17:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 5);
                case 18:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 8);
                case 19:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 6);
                case 20:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 7);
                case 21:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 9);
                case 22:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 10);
                case 23:
                    return new C11531dy(interfaceC9933upM48871k4.mo48788h4(), (short) 2);
                default:
                    throw C9919h4.m48827k4(interfaceC9933upM48871k4.mo48850k4());
            }
        } catch (C5598um e) {
            throw new C9930to(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up m48871k4(InterfaceC12359fa interfaceC12359fa) {
        int iMo57924jd = interfaceC12359fa.mo57924jd();
        if (iMo57924jd == 44) {
            return AbstractC9922k4.m48848x1((InterfaceC9933up) null, interfaceC12359fa.mo57918ck());
        }
        if (iMo57924jd == 53) {
            return AbstractC9922k4.m48839k4((InterfaceC9933up) null, interfaceC12359fa.mo57918ck());
        }
        switch (iMo57924jd) {
            case 67:
            case 68:
            case 69:
                return AbstractC9922k4.m48845kk(null, interfaceC12359fa);
            default:
                if (interfaceC12359fa.mo57924jd() == 0) {
                    throw new C9936wl(interfaceC12359fa.mo57918ck());
                }
                throw C9919h4.m48823k4(interfaceC12359fa.mo57924jd(), interfaceC12359fa.mo57918ck());
        }
    }
}
