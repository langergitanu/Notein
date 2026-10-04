package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.qq */
/* JADX INFO: loaded from: classes.dex */
public class C5355qq extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "border-image";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 41;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        C11068dy<AbstractC5788h4> c11068dyMo15596du = ((AbstractC3905m9) c6344m9.m26001m9(45)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15588du = ((AbstractC3901jd) c6344m9.m26001m9(44)).mo15588du();
        C11068dy<AbstractC5788h4> c11068dyMo15588du2 = ((AbstractC3901jd) c6344m9.m26001m9(46)).mo15588du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du2 = ((AbstractC3905m9) c6344m9.m26001m9(43)).mo15596du();
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        List list4 = new List();
        List list5 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        int i = 1;
        while (it.hasNext()) {
            InterfaceC9933up next = it.next();
            short sMo48850k4 = next.mo48850k4();
            IGenericEnumerator<InterfaceC9933up> iGenericEnumerator = it;
            if (sMo48850k4 == 4) {
                if (!iGenericEnumerator.hasNext()) {
                    throw m15602k4(next.mo48850k4());
                }
                InterfaceC9933up next2 = iGenericEnumerator.next();
                switch (next2.mo48850k4()) {
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        list3.addItem(next2);
                        break;
                    default:
                        throw m15602k4(next2.mo48850k4());
                }
            } else if (sMo48850k4 == 27) {
                list.addItem(next);
            } else if (sMo48850k4 != 35) {
                switch (sMo48850k4) {
                    case 12:
                        list.addItem(next);
                        list2.addItem(next);
                        list3.addItem(next);
                        list4.addItem(next);
                        list5.addItem(next);
                        break;
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        if (i == 2) {
                            list2.addItem(next);
                        } else if (i == 3) {
                            list3.addItem(next);
                        } else if (i == 4) {
                            list4.addItem(next);
                        }
                        break;
                    case 24:
                        break;
                    default:
                        throw m15602k4(next.mo48850k4());
                }
            } else {
                String strM67361du = C14113y2.m67361du(next.mo48784c5());
                if (c11068dyMo15596du.m53498k4(strM67361du) == null) {
                    if (c11068dyMo15588du.m53498k4(strM67361du) == null) {
                        if (c11068dyMo15588du2.m53498k4(strM67361du) == null) {
                            if (c11068dyMo15596du2.m53498k4(strM67361du) == null) {
                                throw m15602k4(next.mo48850k4());
                            }
                            list5.addItem(next);
                        }
                        list3.addItem(next);
                    }
                    list2.addItem(next);
                }
                list.addItem(next);
            }
            i++;
            it = iGenericEnumerator;
        }
        m15610k4(interfaceC9938x6, "border-image-source", list, z);
        m15610k4(interfaceC9938x6, "border-image-slice", list2, z);
        m15610k4(interfaceC9938x6, "border-image-width", list3, z);
        m15610k4(interfaceC9938x6, "border-image-outset", list4, z);
        m15610k4(interfaceC9938x6, "border-image-repeat", list5, z);
    }
}
