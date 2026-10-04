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
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.qn */
/* JADX INFO: loaded from: classes.dex */
public class C5354qn extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 113;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        C11068dy<AbstractC5788h4> c11068dy;
        C11068dy<AbstractC5788h4> c11068dy2;
        C11068dy<AbstractC5788h4> c11068dy3;
        List list;
        C11068dy<AbstractC5788h4> c11068dy4;
        List list2;
        C11068dy<AbstractC5788h4> c11068dy5;
        C11068dy<AbstractC5788h4> c11068dy6;
        C11068dy<AbstractC5788h4> c11068dyMo15596du = ((AbstractC3905m9) c6344m9.m26001m9(119)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du2 = ((AbstractC3905m9) c6344m9.m26001m9(126)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du3 = ((AbstractC3905m9) c6344m9.m26001m9(121)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du4 = ((AbstractC3905m9) c6344m9.m26001m9(122)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du5 = ((AbstractC3905m9) c6344m9.m26001m9(123)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du6 = ((AbstractC3905m9) c6344m9.m26001m9(124)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du7 = ((AbstractC3905m9) c6344m9.m26001m9(125)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15588du = ((AbstractC3901jd) c6344m9.m26001m9(127)).mo15588du();
        C11068dy<AbstractC5788h4> c11068dyMo15596du8 = ((AbstractC3905m9) c6344m9.m26001m9(118)).mo15596du();
        C11068dy<AbstractC5788h4> c11068dyMo15588du2 = ((AbstractC3901jd) c6344m9.m26001m9(116)).mo15588du();
        C11068dy<AbstractC5788h4> c11068dyMo15588du3 = ((AbstractC3901jd) c6344m9.m26001m9(153)).mo15588du();
        List list3 = new List();
        List list4 = new List();
        List list5 = new List();
        List list6 = new List();
        C11068dy<AbstractC5788h4> c11068dy7 = c11068dyMo15588du3;
        List list7 = new List();
        C11068dy<AbstractC5788h4> c11068dy8 = c11068dyMo15588du2;
        List list8 = new List();
        List list9 = new List();
        IGenericEnumerator<InterfaceC9933up> it = AbstractC9922k4.m48835k4(interfaceC9933up).iterator();
        while (true) {
            List list10 = list9;
            if (!it.hasNext()) {
                List list11 = list8;
                m15610k4(interfaceC9938x6, "font-style", list3, z);
                m15610k4(interfaceC9938x6, "font-variant", list4, z);
                if (list7.size() != 0 && list11.size() != 0 && list5.size() == 0) {
                    list5.addItem(AbstractC9922k4.m48848x1((InterfaceC9933up) null, "normal"));
                }
                m15610k4(interfaceC9938x6, "font-weight", list5, z);
                m15610k4(interfaceC9938x6, "font-stretch", list6, z);
                m15610k4(interfaceC9938x6, "font-size", list7, z);
                m15610k4(interfaceC9938x6, "font-family", list11, z);
                if (list10.size() != 0) {
                    m15610k4(interfaceC9938x6, "line-height", list10, z);
                    return;
                }
                return;
            }
            InterfaceC9933up next = it.next();
            C11068dy<AbstractC5788h4> c11068dy9 = c11068dyMo15596du8;
            short sMo48850k4 = next.mo48850k4();
            if (sMo48850k4 != 0) {
                C11068dy<AbstractC5788h4> c11068dy10 = c11068dyMo15588du;
                C11068dy<AbstractC5788h4> c11068dy11 = c11068dyMo15596du7;
                if (sMo48850k4 != 4) {
                    if (sMo48850k4 == 35) {
                        String strM67361du = C14113y2.m67361du(next.mo48784c5());
                        if (list3.size() != 0 || c11068dyMo15596du.m53498k4(strM67361du) == null) {
                            if (c11068dyMo15596du2.m53498k4(strM67361du) == null && c11068dyMo15596du3.m53498k4(strM67361du) == null && c11068dyMo15596du4.m53498k4(strM67361du) == null && c11068dyMo15596du5.m53498k4(strM67361du) == null && c11068dyMo15596du6.m53498k4(strM67361du) == null) {
                                c11068dy2 = c11068dy11;
                                if (c11068dy2.m53498k4(strM67361du) != null) {
                                    c11068dy = c11068dy10;
                                } else {
                                    c11068dy = c11068dy10;
                                    if (c11068dy.m53498k4(strM67361du) != null) {
                                        list5.addItem(next);
                                        c11068dy3 = c11068dyMo15596du;
                                    } else {
                                        c11068dy3 = c11068dyMo15596du;
                                        if (c11068dy9.m53498k4(strM67361du) != null) {
                                            list6.addItem(next);
                                            c11068dy9 = c11068dy9;
                                        } else {
                                            c11068dy9 = c11068dy9;
                                            C11068dy<AbstractC5788h4> c11068dy12 = c11068dy8;
                                            if (c11068dy12.m53498k4(strM67361du) != null) {
                                                list7.addItem(next);
                                                c11068dy8 = c11068dy12;
                                            } else {
                                                c11068dy8 = c11068dy12;
                                                if (c6344m9.m25983dy().m25909k4(strM67361du)) {
                                                    C12013m9 c12013m9M25910x1 = c6344m9.m25983dy().m25910x1(strM67361du);
                                                    list = list8;
                                                    list.addItem(AbstractC9922k4.m48839k4((InterfaceC9933up) null, c12013m9M25910x1.m56651x1().m56527du()));
                                                    c11068dy4 = c11068dyMo15596du2;
                                                    list7.addItem(AbstractC9922k4.m48841k4((InterfaceC9933up) null, (short) 21, c12013m9M25910x1.m56636c5()));
                                                } else {
                                                    list = list8;
                                                    c11068dy4 = c11068dyMo15596du2;
                                                    list.addItem(next);
                                                }
                                            }
                                        }
                                    }
                                    list = list8;
                                }
                            } else {
                                c11068dy = c11068dy10;
                                c11068dy2 = c11068dy11;
                            }
                            c11068dy3 = c11068dyMo15596du;
                            list = list8;
                            c11068dy4 = c11068dyMo15596du2;
                            list4.addItem(next);
                        } else {
                            list3.addItem(next);
                            list = list8;
                            c11068dy = c11068dy10;
                            c11068dy2 = c11068dy11;
                            c11068dy3 = c11068dyMo15596du;
                        }
                    } else if (sMo48850k4 != 36) {
                        switch (sMo48850k4) {
                            case 12:
                                list3.addItem(next);
                                list4.addItem(next);
                                list5.addItem(next);
                                list6.addItem(next);
                                list7.addItem(next);
                                list = list8;
                                c11068dy = c11068dy10;
                                c11068dy2 = c11068dy11;
                                c11068dy3 = c11068dyMo15596du;
                                break;
                            case 13:
                                int iMo48834du = next.mo48834du();
                                if (iMo48834du == 100 || iMo48834du == 200 || iMo48834du == 300 || iMo48834du == 400 || iMo48834du == 500 || iMo48834du == 600 || iMo48834du == 700 || iMo48834du == 800 || iMo48834du == 900) {
                                    list5.addItem(next);
                                }
                                list = list8;
                                c11068dy = c11068dy10;
                                c11068dy2 = c11068dy11;
                                c11068dy3 = c11068dyMo15596du;
                                break;
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
                                list7.addItem(next);
                                list = list8;
                                c11068dy = c11068dy10;
                                c11068dy2 = c11068dy11;
                                c11068dy3 = c11068dyMo15596du;
                                break;
                            default:
                                throw m15602k4(next.mo48850k4());
                        }
                    } else {
                        c11068dy = c11068dy10;
                        c11068dy2 = c11068dy11;
                    }
                    c11068dy4 = c11068dyMo15596du2;
                } else {
                    c11068dy = c11068dy10;
                    c11068dy2 = c11068dy11;
                    c11068dy3 = c11068dyMo15596du;
                    list = list8;
                    c11068dy4 = c11068dyMo15596du2;
                    if (!it.hasNext()) {
                        throw m15602k4(next.mo48850k4());
                    }
                    InterfaceC9933up next2 = it.next();
                    short sMo48850k42 = next2.mo48850k4();
                    if (sMo48850k42 != 35) {
                        switch (sMo48850k42) {
                            case 12:
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
                                list2 = list10;
                                list2.addItem(next2);
                                break;
                        }
                        c11068dy5 = c11068dyMo15596du3;
                        c11068dy6 = c11068dy7;
                        List list12 = list;
                        list9 = list2;
                        c11068dyMo15596du2 = c11068dy4;
                        list8 = list12;
                        c11068dy7 = c11068dy6;
                        c11068dyMo15596du7 = c11068dy2;
                        c11068dyMo15588du = c11068dy;
                        c11068dyMo15596du8 = c11068dy9;
                        c11068dyMo15596du3 = c11068dy5;
                        c11068dyMo15596du = c11068dy3;
                    } else {
                        list2 = list10;
                        c11068dy5 = c11068dyMo15596du3;
                        c11068dy6 = c11068dy7;
                        if (c11068dy6.m53498k4(C14113y2.m67361du(next2.mo48784c5())) == null) {
                            throw m15602k4(next2.mo48850k4());
                        }
                        list2.addItem(next2);
                        List list122 = list;
                        list9 = list2;
                        c11068dyMo15596du2 = c11068dy4;
                        list8 = list122;
                        c11068dy7 = c11068dy6;
                        c11068dyMo15596du7 = c11068dy2;
                        c11068dyMo15588du = c11068dy;
                        c11068dyMo15596du8 = c11068dy9;
                        c11068dyMo15596du3 = c11068dy5;
                        c11068dyMo15596du = c11068dy3;
                    }
                }
                list2 = list10;
                c11068dy5 = c11068dyMo15596du3;
                c11068dy6 = c11068dy7;
                List list1222 = list;
                list9 = list2;
                c11068dyMo15596du2 = c11068dy4;
                list8 = list1222;
                c11068dy7 = c11068dy6;
                c11068dyMo15596du7 = c11068dy2;
                c11068dyMo15588du = c11068dy;
                c11068dyMo15596du8 = c11068dy9;
                c11068dyMo15596du3 = c11068dy5;
                c11068dyMo15596du = c11068dy3;
            } else {
                c11068dy = c11068dyMo15588du;
                c11068dy2 = c11068dyMo15596du7;
            }
            c11068dy3 = c11068dyMo15596du;
            list = list8;
            c11068dy4 = c11068dyMo15596du2;
            list2 = list10;
            c11068dy5 = c11068dyMo15596du3;
            c11068dy6 = c11068dy7;
            list.addItem(next);
            List list12222 = list;
            list9 = list2;
            c11068dyMo15596du2 = c11068dy4;
            list8 = list12222;
            c11068dy7 = c11068dy6;
            c11068dyMo15596du7 = c11068dy2;
            c11068dyMo15588du = c11068dy;
            c11068dyMo15596du8 = c11068dy9;
            c11068dyMo15596du3 = c11068dy5;
            c11068dyMo15596du = c11068dy3;
        }
    }
}
