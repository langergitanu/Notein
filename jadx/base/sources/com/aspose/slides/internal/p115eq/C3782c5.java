package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.huawei.hms.network.embedded.C18385v2;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C3782c5 {

    /* JADX INFO: renamed from: k4 */
    private static final C12380dy f10298k4 = new C12380dy("(?=[MmZzLlHhVvCcSsQqTtAa])");

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f10299x1 = new C7017h4("M", "m", "Z", "z", "L", "l", "H", C18773h.f57233c, "V", "v", "C", "c", "S", "s", "Q", "q", "T", "t", C18385v2.f56336h, "a");

    /* JADX INFO: renamed from: k4 */
    private static int m15110k4(String str) {
        switch (f10299x1.m27428k4(str)) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            default:
                return 19;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m15114x1(C3789k4 c3789k4, float[] fArr) {
        fArr[0] = c3789k4.m15140kk();
        fArr[1] = c3789k4.m15140kk();
        fArr[2] = c3789k4.m15140kk();
        fArr[3] = c3789k4.m15141x1() ? 1.0f : 0.0f;
        fArr[4] = c3789k4.m15141x1() ? 1.0f : 0.0f;
        fArr[5] = c3789k4.m15140kk();
        fArr[6] = c3789k4.m15140kk();
        return !c3789k4.m15139k4();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<C3785dy> m15111k4(String str, C3786fa c3786fa) {
        int i;
        int i2 = 0;
        List<C3785dy> list = new List<>();
        if (!C14113y2.m67411k4(str)) {
            String[] strArrM57984k4 = f10298k4.m57984k4(str);
            int length = strArrM57984k4.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArrM57984k4[i3];
                if (!C14113y2.m67411k4(C14113y2.m67440x1(str2))) {
                    int iM15110k4 = m15110k4(C14117yj.m67537ne(str2.charAt(i2)));
                    C3789k4 c3789k4 = new C3789k4(str2);
                    switch (iM15110k4) {
                        case 0:
                        case 1:
                            float[] fArr = new float[2];
                            if (m15113k4(c3789k4, fArr)) {
                                int i4 = iM15110k4 == 1 ? 1 : i2;
                                if (i4 != 0 && list.size() == 0) {
                                    iM15110k4 = i2;
                                }
                                float fM15131kk = c3786fa.m15131kk(fArr[i2]);
                                float fM15131kk2 = c3786fa.m15131kk(fArr[1]);
                                i = i2;
                                float[] fArr2 = new float[2];
                                fArr2[i] = fM15131kk;
                                fArr2[1] = fM15131kk2;
                                list.addItem(new C3785dy(iM15110k4, fArr2));
                                m15112k4(2, list, i4 != 0 ? 4 : 3, c3789k4, c3786fa);
                                break;
                            }
                            break;
                        case 2:
                            list.addItem(new C3785dy(iM15110k4, new float[i2]));
                            i = i2;
                            break;
                        case 3:
                        case 4:
                        case 15:
                        case 16:
                            m15112k4(2, list, iM15110k4, c3789k4, c3786fa);
                            i = i2;
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            m15112k4(1, list, iM15110k4, c3789k4, c3786fa);
                            i = i2;
                            break;
                        case 9:
                        case 10:
                            m15112k4(6, list, iM15110k4, c3789k4, c3786fa);
                            i = i2;
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            m15112k4(4, list, iM15110k4, c3789k4, c3786fa);
                            i = i2;
                            break;
                        case 17:
                        case 18:
                            float[] fArr3 = new float[7];
                            while (m15114x1(c3789k4, fArr3)) {
                                for (int i5 = i2; i5 < 7; i5++) {
                                    if (i5 != 2 && i5 != 3 && i5 != 4) {
                                        fArr3[i5] = c3786fa.m15131kk(fArr3[i5]);
                                    }
                                }
                                list.addItem(new C3785dy(iM15110k4, fArr3));
                            }
                            i = i2;
                            break;
                    }
                } else {
                    i = i2;
                }
                i3++;
                i2 = i;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15112k4(int i, List<C3785dy> list, int i2, C3789k4 c3789k4, C3786fa c3786fa) {
        float[] fArr = new float[i];
        while (m15113k4(c3789k4, fArr)) {
            for (int i3 = 0; i3 < i; i3++) {
                fArr[i3] = c3786fa.m15131kk(fArr[i3]);
            }
            list.addItem(new C3785dy(i2, fArr));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m15113k4(C3789k4 c3789k4, float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = c3789k4.m15140kk();
        }
        return !c3789k4.m15139k4();
    }
}
