package com.aspose.slides.internal.p393s7;

import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.C3513ck;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p409sv.C10768c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10149c5 {
    /* JADX INFO: renamed from: k4 */
    private static C10161to m49922k4(char c, AbstractC3511c5 abstractC3511c5, C4279jd c4279jd, InterfaceC1981h4 interfaceC1981h4) {
        C10159m9 c10159m9Mo14168c_ = abstractC3511c5.mo14107n_().mo14168c_();
        C10155jd[] c10155jdArrM17246k4 = c4279jd.m17246k4(c10159m9Mo14168c_);
        for (C10155jd c10155jd : c10155jdArrM17246k4) {
            C10161to c10161toM49955k4 = c10159m9Mo14168c_.m49955k4(c10155jd, c4279jd.f11682k4.mo9886x1(interfaceC1981h4), c4279jd.m17248x1());
            if (c10161toM49955k4.m49978k4(c)) {
                return c10161toM49955k4;
            }
        }
        return c10159m9Mo14168c_.m49955k4(c10155jdArrM17246k4[0], c4279jd.f11682k4.mo9886x1(interfaceC1981h4), c4279jd.m17248x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C10161to m49923k4(char c, C3513ck c3513ck, InterfaceC1981h4 interfaceC1981h4) {
        return m49922k4(c, c3513ck, c3513ck.m14136bv(), interfaceC1981h4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r0 = "Gulim";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        r0 = "Sylfaen";
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10161to m49924k4(InterfaceC1858du interfaceC1858du, int i, int i2, C3513ck c3513ck, InterfaceC1981h4 interfaceC1981h4) {
        String str;
        String str2;
        C10159m9 c10159m9Mo14168c_ = c3513ck.mo14107n_().mo14168c_();
        C4279jd c4279jdM14136bv = c3513ck.m14136bv();
        C10155jd[] c10155jdArrM17246k4 = c4279jdM14136bv.m17246k4(c10159m9Mo14168c_);
        int length = c10155jdArrM17246k4.length;
        C10161to[] c10161toArr = new C10161to[length];
        int[] iArr = new int[length];
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (i3 >= length) {
                if (!z) {
                    switch (c4279jdM14136bv.m17245k4()) {
                        case 164:
                            str = "italic";
                            break;
                        case 165:
                            str = "oblique";
                            break;
                        case 166:
                            str = "backslant";
                            break;
                        default:
                            str = "normal";
                            break;
                    }
                    int i4 = i;
                    while (true) {
                        if (i4 >= i2) {
                            str2 = null;
                        } else {
                            char cMo9716to = interfaceC1858du.mo9716to(i4);
                            if (cMo9716to >= 19968 && cMo9716to <= 40869) {
                                str2 = "ms pgothic";
                            } else if (cMo9716to < 12353 || cMo9716to > 13277) {
                                if ((cMo9716to < 1329 || cMo9716to > 1418) && (cMo9716to < 4304 || cMo9716to > 4347)) {
                                    if (cMo9716to < 44032 || cMo9716to > 55203) {
                                        if (cMo9716to >= 2305 && cMo9716to <= 2431) {
                                            str2 = "mangal";
                                        } else if (cMo9716to >= 4608 && cMo9716to <= 5017) {
                                            str2 = "nyala";
                                        } else if (cMo9716to >= 2433 && cMo9716to <= 2554) {
                                            str2 = "Vrinda";
                                        } else if (cMo9716to >= 2689 && cMo9716to <= 2801) {
                                            str2 = "Shruti";
                                        } else if (cMo9716to >= 3202 && cMo9716to <= 3314) {
                                            str2 = "Tunga";
                                        } else if (cMo9716to >= 2561 && cMo9716to <= 2676) {
                                            str2 = "Raavi";
                                        } else if (cMo9716to >= 3458 && cMo9716to <= 3572) {
                                            str2 = "Iskoola Pota";
                                        } else if (cMo9716to >= 2946 && cMo9716to <= 3066) {
                                            str2 = "Latha";
                                        } else if (cMo9716to >= 3073 && cMo9716to <= 3183) {
                                            str2 = "Gautami";
                                        } else if (cMo9716to >= 3585 && cMo9716to <= 3663) {
                                            str2 = "Tahoma";
                                        } else if (cMo9716to >= 1792 && cMo9716to <= 1871) {
                                            str2 = "Estrangelo Edessa";
                                        } else if (cMo9716to >= 3840 && cMo9716to <= 4037) {
                                            str2 = "Microsoft Himalaya";
                                        } else if (cMo9716to >= 1920 && cMo9716to <= 1969) {
                                            str2 = "MV Boli";
                                        } else if (cMo9716to >= 3713 && cMo9716to <= 3805) {
                                            str2 = "DokChampa";
                                        } else if (cMo9716to >= 2817 && cMo9716to <= 2929) {
                                            str2 = "Kalinga";
                                        } else if (cMo9716to >= 5121 && cMo9716to <= 5750) {
                                            str2 = "Euphemia";
                                        } else if (cMo9716to < 5024 || cMo9716to > 5108) {
                                            i4++;
                                        } else {
                                            str2 = "Plantagenet Cherokee";
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!C14113y2.m67411k4(str2)) {
                        return c10159m9Mo14168c_.m49955k4(c10159m9Mo14168c_.m49954k4(str2, str, c4279jdM14136bv.m17247kk(), c4279jdM14136bv.m17248x1(), c4279jdM14136bv.m17248x1()), c4279jdM14136bv.f11682k4.mo9886x1(interfaceC1981h4), c4279jdM14136bv.m17248x1());
                    }
                }
                C10161to c10161to = c10161toArr[0];
                int i5 = iArr[0];
                for (int i6 = 1; i6 < length; i6++) {
                    int i7 = iArr[i6];
                    if (i7 > i5) {
                        c10161to = c10161toArr[i6];
                        i5 = i7;
                    }
                }
                return c10161to;
            }
            C10161to c10161toM49955k4 = c10159m9Mo14168c_.m49955k4(c10155jdArrM17246k4[i3], c4279jdM14136bv.f11682k4.mo9886x1(interfaceC1981h4), c4279jdM14136bv.m17248x1());
            c10161toArr[i3] = c10161toM49955k4;
            for (int i8 = i; i8 < i2; i8++) {
                if (c10161toM49955k4.m49978k4(interfaceC1858du.mo9716to(i8))) {
                    iArr[i3] = iArr[i3] + 1;
                    z = true;
                }
            }
            if (iArr[i3] == i2 - i) {
                return c10161toM49955k4;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C10161to m49925k4(C10768c5 c10768c5, InterfaceC1981h4 interfaceC1981h4) {
        return m49922k4(c10768c5.m52204qm(), c10768c5, c10768c5.m52199e0(), interfaceC1981h4);
    }
}
