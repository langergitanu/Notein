package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.ai */
/* JADX INFO: loaded from: classes3.dex */
class C0750ai extends AbstractC7020m9<C0750ai> {
    /* JADX INFO: renamed from: x1 */
    private boolean m3593x1(C0750ai c0750ai) {
        return true;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C0750ai) {
            return m3593x1((C0750ai) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C0750ai Clone() {
        C0750ai c0750ai = new C0750ai();
        CloneTo(c0750ai);
        return c0750ai;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3581k4(float f, double d, int i, C14365qy c14365qy) {
        int i2;
        int i3;
        int i4;
        int iOooO00o;
        C0886d8 c0886d8;
        C0886d8 c0886d82;
        char c;
        float fM56895kk;
        C12025x6 c12025x6;
        double dM4989k4;
        int i5;
        float fM56895kk2;
        C12025x6 c12025x62;
        int i6 = i;
        C14365qy c14365qy2 = c14365qy;
        if (i6 < 2) {
            return;
        }
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m3583k4(f, d, c14365qy2);
            return;
        }
        float f2 = f;
        float fM69822ar = c14365qy2.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy2.m69834fa(), 0) & 65535) / 100.0f;
        List list = new List();
        boolean z = c14365qy2.m69854ne().m73375b3() || c14365qy2.m69834fa().hasDataTable();
        if (z) {
            i2 = i6;
        } else {
            i2 = i6 - 1;
            if (i2 == 0) {
                i2 = 1;
            }
        }
        float fM64121to = c14365qy2.m69833e0().m64121to() / i2;
        float f3 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        int i7 = 180;
        List list2 = new List();
        int i8 = 270;
        if ((c14365qy2.m69877xk() >= 0 && c14365qy2.m69877xk() < 90) || (c14365qy2.m69877xk() >= 180 && c14365qy2.m69877xk() < 270)) {
            int i9 = 0;
            while (i9 < listM69865up.size()) {
                int iOooO00o2 = C20856OooooOo.OooO00o(1, i9, listM69865up);
                if (c14365qy2.m69877xk() >= i7 && c14365qy2.m69877xk() < i8) {
                    iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
                }
                if (c14365qy2.m69868wl().m73384dy().isPlotOrderReversed()) {
                    iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
                }
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o2);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i10 = 0;
                C0886d8 c0886d83 = null;
                while (i10 < i6) {
                    int i11 = (c14365qy2.m69877xk() < i7 || c14365qy2.m69877xk() >= 270) ? i10 : (i6 - 1) - i10;
                    float fM64124x1 = c14365qy2.m69833e0().m64124x1() + (i11 * fM64121to);
                    if (z) {
                        fM64124x1 = (fM64121to / 2.0f) + fM64124x1;
                    }
                    if (c14365qy2.m69854ne().m73384dy().isPlotOrderReversed()) {
                        i11 = (i6 - 1) - i11;
                    }
                    C0886d8 c0886d84 = listM64944dy.get_Item(i11);
                    if (c0886d84 == null || c0886d84.m4983dy()) {
                        dM4989k4 = 0.0d;
                    } else {
                        dM4989k4 = c0886d84.m4989k4();
                        c0886d83 = c0886d84;
                    }
                    float fM73389ix = (((float) (d - dM4989k4)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                    if (c14365qy2.m69863u4().m73384dy().isPlotOrderReversed()) {
                        fM73389ix = -fM73389ix;
                    }
                    int i12 = iM64963x1;
                    int i13 = i12 + 1;
                    int i14 = i10;
                    List<C0886d8> list3 = listM64944dy;
                    int i15 = i9;
                    List list4 = list2;
                    float f4 = fM64124x1;
                    C12025x6[] c12025x6ArrM69082k4 = C14285pi.m69082k4(f2, 0.0f, f4, f3, i13, listM69865up.size(), c14365qy2);
                    list4.addItem(c12025x6ArrM69082k4);
                    c14365qy2 = c14365qy;
                    C12025x6[] c12025x6ArrM69082k42 = C14285pi.m69082k4(f, fM73389ix, f4, f3, i13, listM69865up.size(), c14365qy2);
                    list4.addItem(c12025x6ArrM69082k42);
                    if (c0886d84 == null || c0886d84.m4983dy()) {
                        i5 = i12;
                        list4.addItem(null);
                    } else {
                        C12025x6 c12025x63 = new C12025x6(0.0f, 0.0f);
                        if (c14365qy2.m69877xk() < 90 || c14365qy2.m69877xk() >= 270) {
                            c12025x63.m56891k4((c12025x6ArrM69082k42[0].m56897x1() + c12025x6ArrM69082k4[0].m56897x1()) / 2.0f);
                            fM56895kk2 = c12025x6ArrM69082k4[0].m56895kk();
                            c12025x62 = c12025x6ArrM69082k42[0];
                        } else {
                            c12025x63.m56891k4((c12025x6ArrM69082k42[1].m56897x1() + c12025x6ArrM69082k4[1].m56897x1()) / 2.0f);
                            fM56895kk2 = c12025x6ArrM69082k4[1].m56895kk();
                            c12025x62 = c12025x6ArrM69082k42[1];
                        }
                        c12025x63.m56898x1((c12025x62.m56895kk() + fM56895kk2) / 2.0f);
                        i5 = i12;
                        list.addItem(new C14319px(i5, i11, c12025x63.Clone()));
                    }
                    i10 = i14 + 1;
                    f2 = f;
                    list2 = list4;
                    iM64963x1 = i5;
                    i9 = i15;
                    listM64944dy = list3;
                    i7 = 180;
                }
                List list5 = list2;
                m3585k4(c14365qy2, c0886d83, (List<C12025x6[]>) list5);
                list5.clear();
                C14285pi.m69072k4((List<C14319px>) list, c14365qy2);
                list.clear();
                i9++;
                f2 = f;
                i8 = 270;
                i7 = 180;
            }
            return;
        }
        char c2 = 'Z';
        int iM69877xk = c14365qy2.m69877xk();
        int i16 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        if (iM69877xk < 90 || c14365qy2.m69877xk() >= 180) {
            i3 = 270;
            if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= 360) {
                return;
            }
        } else {
            i3 = 270;
        }
        int i17 = 0;
        while (i17 < listM69865up.size()) {
            if (c14365qy2.m69877xk() < i3 || c14365qy2.m69877xk() >= i16) {
                i4 = 1;
                iOooO00o = i17;
            } else {
                i4 = 1;
                iOooO00o = C20856OooooOo.OooO00o(1, i17, listM69865up);
            }
            if (c14365qy2.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o = C20856OooooOo.OooO00o(i4, iOooO00o, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i18 = 0;
            C0886d8 c0886d85 = null;
            while (i18 < i6) {
                int i19 = (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= i16) ? i18 : (i6 - 1) - i18;
                float fM64124x12 = c14365qy2.m69833e0().m64124x1() + (i19 * fM64121to);
                if (z) {
                    fM64124x12 = (fM64121to / 2.0f) + fM64124x12;
                }
                if (c14365qy2.m69854ne().m73384dy().isPlotOrderReversed()) {
                    i19 = (i6 - 1) - i19;
                }
                C0886d8 c0886d86 = listM64944dy2.get_Item(i19);
                double dM4989k42 = c0886d86.m4989k4();
                if (c0886d86.m4983dy()) {
                    c0886d8 = c0886d85;
                    c0886d82 = c0886d86;
                } else {
                    dM4989k42 = c0886d86.m4989k4();
                    c0886d8 = c0886d86;
                    c0886d82 = c0886d8;
                }
                float fM73389ix2 = (((float) (d - dM4989k42)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                if (c14365qy2.m69863u4().m73384dy().isPlotOrderReversed()) {
                    fM73389ix2 = -fM73389ix2;
                }
                float f5 = fM73389ix2;
                int i20 = i18;
                int i21 = iM64963x12 + 1;
                List<C0886d8> list6 = listM64944dy2;
                int i22 = iM64963x12;
                float f6 = fM64124x12;
                int i23 = i17;
                C12025x6[] c12025x6ArrM69082k43 = C14285pi.m69082k4(f, 0.0f, f6, f3, i21, listM69865up.size(), c14365qy2);
                list2.addItem(c12025x6ArrM69082k43);
                c14365qy2 = c14365qy;
                C12025x6[] c12025x6ArrM69082k44 = C14285pi.m69082k4(f, f5, f6, f3, i21, listM69865up.size(), c14365qy2);
                list2.addItem(c12025x6ArrM69082k44);
                if (c0886d82.m4983dy()) {
                    c = 'Z';
                    list2.addItem(null);
                } else {
                    C12025x6 c12025x64 = new C12025x6(0.0f, 0.0f);
                    c = 'Z';
                    if (c14365qy2.m69877xk() < 90 || c14365qy2.m69877xk() >= 270) {
                        c12025x64.m56891k4((c12025x6ArrM69082k44[0].m56897x1() + c12025x6ArrM69082k43[0].m56897x1()) / 2.0f);
                        fM56895kk = c12025x6ArrM69082k43[0].m56895kk();
                        c12025x6 = c12025x6ArrM69082k44[0];
                    } else {
                        c12025x64.m56891k4((c12025x6ArrM69082k44[1].m56897x1() + c12025x6ArrM69082k43[1].m56897x1()) / 2.0f);
                        fM56895kk = c12025x6ArrM69082k43[1].m56895kk();
                        c12025x6 = c12025x6ArrM69082k44[1];
                    }
                    c12025x64.m56898x1((c12025x6.m56895kk() + fM56895kk) / 2.0f);
                    list.addItem(new C14319px(i22, i19, c12025x64.Clone()));
                }
                i18 = i20 + 1;
                iM64963x12 = i22;
                i17 = i23;
                listM64944dy2 = list6;
                i16 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                i6 = i;
                c2 = c;
                c0886d85 = c0886d8;
            }
            m3585k4(c14365qy2, c0886d85, (List<C12025x6[]>) list2);
            list2.clear();
            C14285pi.m69072k4((List<C14319px>) list, c14365qy2);
            list.clear();
            i6 = i;
            i17++;
            i3 = 270;
            c2 = c2;
            i16 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3582k4(float f, double d, int i, boolean z, C14365qy c14365qy) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        List<C0886d8> list;
        double dM4989k4;
        List list2;
        float fM67475k4;
        float fM56895kk;
        C12025x6 c12025x6;
        int i5 = i;
        if (i5 < 2) {
            return;
        }
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        if (c14365qy.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m3584k4(f, d, z, c14365qy);
            return;
        }
        float f2 = 100.0f;
        float fM69822ar = c14365qy.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        float fM73389ix = !c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? ((((float) c14787xiM69863u4.m73389ix()) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du()) + (c14365qy.m69833e0().m64114kk() - c14365qy.m69833e0().m64100du()) : c14365qy.m69833e0().m64114kk() - ((((float) c14787xiM69863u4.m73389ix()) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du());
        List list3 = new List();
        boolean z3 = c14365qy.m69854ne().m73375b3() || c14365qy.m69834fa().hasDataTable();
        if (z3) {
            i2 = i5;
        } else {
            i2 = i5 - 1;
            if (i2 == 0) {
                i2 = 1;
            }
        }
        float fM64121to = c14365qy.m69833e0().m64121to() / i2;
        float f3 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        List list4 = new List();
        List list5 = new List();
        int i6 = 0;
        while (i6 < i5) {
            float f4 = f2;
            float fM64124x1 = (i6 * fM64121to) + c14365qy.m69833e0().m64124x1();
            if (z3) {
                fM64124x1 = (fM64121to / 2.0f) + fM64124x1;
            }
            list5.addItem(m3592k4(c14365qy, fM64124x1, f3, f));
            i6++;
            f2 = f4;
        }
        float f5 = f2;
        list4.addItem(list5);
        C0886d8[] c0886d8Arr = new C0886d8[listM69865up.size()];
        List list6 = null;
        int i7 = 0;
        while (i7 < listM69865up.size()) {
            C13847mr c13847mr = listM69865up.get_Item(i7);
            int iM64963x1 = c13847mr.m64963x1();
            List<C0886d8> listM64944dy = c13847mr.m64944dy();
            C14787xi c14787xi = c14787xiM69863u4;
            List list7 = new List();
            if (i7 == 0) {
                list6 = list5;
            }
            float f6 = fM73389ix;
            int i8 = 0;
            while (i8 < i5) {
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (i8 * fM64121to);
                if (z3) {
                    fM64124x12 = (fM64121to / 2.0f) + fM64124x12;
                }
                float f7 = fM64124x12;
                if (c14365qy.m69854ne().m73384dy().isPlotOrderReversed()) {
                    z2 = z3;
                    i3 = (i - 1) - i8;
                } else {
                    z2 = z3;
                    i3 = i8;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i3);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i4 = i7;
                    list = listM64944dy;
                    dM4989k4 = 0.0d;
                } else {
                    c0886d8Arr[i7] = c0886d8;
                    dM4989k4 = c0886d8.m4989k4();
                    list = listM64944dy;
                    int i9 = 0;
                    while (i9 < i7) {
                        int i10 = i7;
                        C0886d8 c0886d82 = listM69865up.get_Item(i9).m64944dy().get_Item(i3);
                        if (c0886d82 != null) {
                            dM4989k4 += c0886d82.m4989k4();
                        }
                        i9++;
                        i7 = i10;
                    }
                    i4 = i7;
                }
                List list8 = list5;
                float f8 = fM64121to;
                double dM67475k4 = 0.0d;
                for (int i11 = 0; i11 < listM69865up.size(); i11++) {
                    C0886d8 c0886d83 = listM69865up.get_Item(i11).m64944dy().get_Item(i3);
                    if (c0886d83 != null) {
                        dM67475k4 = C14116yg.m67475k4(c0886d83.m4989k4()) + dM67475k4;
                    }
                }
                if (z) {
                    list2 = list4;
                    if (dM67475k4 == 0.0d) {
                        i8++;
                        i5 = i;
                        list4 = list2;
                        z3 = z2;
                        list5 = list8;
                        i7 = i4;
                        fM64121to = f8;
                        listM64944dy = list;
                    } else {
                        fM67475k4 = (((((float) C14116yg.m67475k4(dM4989k4)) * f5) / ((float) dM67475k4)) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    }
                } else {
                    fM67475k4 = (((float) C14116yg.m67475k4(dM4989k4)) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    list2 = list4;
                }
                C12025x6[] c12025x6ArrM3592k4 = m3592k4(c14365qy, f7, f3, (c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? dM4989k4 > 0.0d : dM4989k4 <= 0.0d) ? f6 + fM67475k4 : f6 - fM67475k4);
                list7.addItem(c12025x6ArrM3592k4);
                if (c0886d8 != null && !c0886d8.m4983dy()) {
                    C12025x6 c12025x62 = new C12025x6(0.0f, 0.0f);
                    C12025x6[] c12025x6Arr = (C12025x6[]) list6.get_Item(i8);
                    if (c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) {
                        c12025x62.m56891k4(c12025x6ArrM3592k4[0].m56897x1());
                        fM56895kk = c12025x6Arr[0].m56895kk();
                        c12025x6 = c12025x6ArrM3592k4[0];
                    } else {
                        c12025x62.m56891k4(c12025x6ArrM3592k4[1].m56897x1());
                        fM56895kk = c12025x6Arr[1].m56895kk();
                        c12025x6 = c12025x6ArrM3592k4[1];
                    }
                    c12025x62.m56898x1((c12025x6.m56895kk() + fM56895kk) / 2.0f);
                    list3.addItem(new C14319px(iM64963x1, i3, c12025x62.Clone()));
                }
                i8++;
                i5 = i;
                list4 = list2;
                z3 = z2;
                list5 = list8;
                i7 = i4;
                fM64121to = f8;
                listM64944dy = list;
            }
            list4.addItem(list7);
            i7++;
            i5 = i;
            list6 = list7;
            c14787xiM69863u4 = c14787xi;
            fM73389ix = f6;
        }
        m3588k4(c0886d8Arr, (List<List<C12025x6[]>>) list4, c14365qy);
        C14285pi.m69072k4((List<C14319px>) list3, c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3583k4(float f, double d, C14365qy c14365qy) {
        int i;
        int i2;
        int i3;
        int iOooO00o;
        C0886d8 c0886d8;
        int i4;
        double dM4989k4;
        float fM56895kk;
        C12025x6 c12025x6;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        float fM69822ar = c14365qy.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        List list = new List();
        int baseUnitScale = c14787xiM69854ne.m73384dy().getBaseUnitScale();
        boolean z = c14365qy.m69854ne().m73375b3() || c14365qy.m69834fa().hasDataTable();
        float fM64121to = c14365qy.m69833e0().m64121to() / c14365qy.m69854ne().m73373ak();
        float f2 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        List list2 = new List();
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i5 = 270;
        if (c14365qy.m69877xk() < 0 || c14365qy.m69877xk() >= 90) {
            i = 180;
            if (c14365qy.m69877xk() < 180 || c14365qy.m69877xk() >= 270) {
                C14365qy c14365qy2 = c14365qy;
                boolean z2 = z;
                int iM69877xk = c14365qy2.m69877xk();
                int i6 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (iM69877xk < 90 || c14365qy2.m69877xk() >= 180) {
                    i2 = 270;
                    if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= 360) {
                        return;
                    }
                } else {
                    i2 = 270;
                }
                int i7 = 0;
                while (i7 < listM69865up.size()) {
                    if (c14365qy2.m69877xk() < i2 || c14365qy2.m69877xk() >= i6) {
                        i3 = 1;
                        iOooO00o = i7;
                    } else {
                        i3 = 1;
                        iOooO00o = C20856OooooOo.OooO00o(1, i7, listM69865up);
                    }
                    if (c14365qy2.m69868wl().m73384dy().isPlotOrderReversed()) {
                        iOooO00o = C20856OooooOo.OooO00o(i3, iOooO00o, listM69865up);
                    }
                    C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                    int iM64963x1 = c13847mr.m64963x1();
                    List<C0886d8> listM64944dy = c13847mr.m64944dy();
                    int i8 = 0;
                    C0886d8 c0886d82 = null;
                    while (i8 < size) {
                        int i9 = (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= i6) ? i8 : (size - 1) - i8;
                        int i10 = iM64963x1;
                        int i11 = i8;
                        float fM64124x1 = c14365qy2.m69833e0().m64124x1() + (fM64121to * C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, listM72791k4.get_Item(i9).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false));
                        if (z2) {
                            fM64124x1 += fM64121to / 2.0f;
                        }
                        float f3 = fM64124x1;
                        if (c14365qy2.m69854ne().m73384dy().isPlotOrderReversed()) {
                            i9 = (size - 1) - i9;
                        }
                        int i12 = i9;
                        C0886d8 c0886d83 = listM64944dy.get_Item(i12);
                        double dM4989k42 = c0886d83.m4989k4();
                        if (c0886d83.m4983dy()) {
                            c0886d8 = c0886d82;
                        } else {
                            dM4989k42 = c0886d83.m4989k4();
                            c0886d8 = c0886d83;
                        }
                        float fM73389ix = (((float) (d - dM4989k42)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                        if (c14365qy2.m69863u4().m73384dy().isPlotOrderReversed()) {
                            fM73389ix = -fM73389ix;
                        }
                        float f4 = fM73389ix;
                        int i13 = i10 + 1;
                        List<C13847mr> list3 = listM69865up;
                        List<C0886d8> list4 = listM64944dy;
                        C12025x6[] c12025x6ArrM69082k4 = C14285pi.m69082k4(f, 0.0f, f3, f2, i13, listM69865up.size(), c14365qy2);
                        list2.addItem(c12025x6ArrM69082k4);
                        c14365qy2 = c14365qy;
                        C12025x6[] c12025x6ArrM69082k42 = C14285pi.m69082k4(f, f4, f3, f2, i13, list3.size(), c14365qy2);
                        list2.addItem(c12025x6ArrM69082k42);
                        if (c0886d83.m4983dy()) {
                            list2.addItem(null);
                        } else {
                            C12025x6 c12025x62 = new C12025x6(0.0f, 0.0f);
                            if (c14365qy2.m69877xk() < 90 || c14365qy2.m69877xk() >= 270) {
                                c12025x62.m56891k4((c12025x6ArrM69082k42[0].m56897x1() + c12025x6ArrM69082k4[0].m56897x1()) / 2.0f);
                                c12025x62.m56898x1((c12025x6ArrM69082k42[0].m56895kk() + c12025x6ArrM69082k4[0].m56895kk()) / 2.0f);
                            } else {
                                c12025x62.m56891k4((c12025x6ArrM69082k42[1].m56897x1() + c12025x6ArrM69082k4[1].m56897x1()) / 2.0f);
                                c12025x62.m56898x1((c12025x6ArrM69082k42[1].m56895kk() + c12025x6ArrM69082k4[1].m56895kk()) / 2.0f);
                            }
                            list.addItem(new C14319px(i10, i12, c12025x62.Clone()));
                        }
                        i8 = i11 + 1;
                        iM64963x1 = i10;
                        listM69865up = list3;
                        c0886d82 = c0886d8;
                        listM64944dy = list4;
                        i6 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                    }
                    m3585k4(c14365qy2, c0886d82, (List<C12025x6[]>) list2);
                    list2.clear();
                    C14285pi.m69072k4((List<C14319px>) list, c14365qy2);
                    list.clear();
                    i7++;
                    i2 = 270;
                    i6 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                }
                return;
            }
        } else {
            i = 180;
        }
        int i14 = 0;
        while (i14 < listM69865up.size()) {
            int iOooO00o2 = C20856OooooOo.OooO00o(1, i14, listM69865up);
            if (c14365qy.m69877xk() < i || c14365qy.m69877xk() >= i5) {
                i4 = 1;
            } else {
                i4 = 1;
                iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
            }
            if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o2 = C20856OooooOo.OooO00o(i4, iOooO00o2, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o2);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i15 = 0;
            C0886d8 c0886d84 = null;
            while (i15 < size) {
                List list5 = list2;
                int i16 = (c14365qy.m69877xk() < 180 || c14365qy.m69877xk() >= 270) ? i15 : (size - 1) - i15;
                List<Integer> list6 = listM72791k4;
                int i17 = size;
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, listM72791k4.get_Item(r0).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false) * fM64121to);
                if (z) {
                    fM64124x12 += fM64121to / 2.0f;
                }
                float f5 = fM64124x12;
                int i18 = c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? (i17 - 1) - i16 : i16;
                C0886d8 c0886d85 = listM64944dy2.get_Item(i18);
                if (c0886d85 == null || c0886d85.m4983dy()) {
                    dM4989k4 = 0.0d;
                } else {
                    dM4989k4 = c0886d85.m4989k4();
                    c0886d84 = c0886d85;
                }
                float fM73389ix2 = (((float) (d - dM4989k4)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                    fM73389ix2 = -fM73389ix2;
                }
                float f6 = fM73389ix2;
                int i19 = i14;
                int i20 = iM64963x12 + 1;
                List<C0886d8> list7 = listM64944dy2;
                int i21 = i15;
                C14787xi c14787xi = c14787xiM69854ne;
                boolean z3 = z;
                C14787xi c14787xi2 = c14787xiM69863u4;
                float f7 = fM64121to;
                C12025x6[] c12025x6ArrM69082k43 = C14285pi.m69082k4(f, 0.0f, f5, f2, i20, listM69865up.size(), c14365qy);
                list5.addItem(c12025x6ArrM69082k43);
                C12025x6[] c12025x6ArrM69082k44 = C14285pi.m69082k4(f, f6, f5, f2, i20, listM69865up.size(), c14365qy);
                list5.addItem(c12025x6ArrM69082k44);
                if (c0886d85 == null || c0886d85.m4983dy()) {
                    list5.addItem(null);
                } else {
                    C12025x6 c12025x63 = new C12025x6(0.0f, 0.0f);
                    if (c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) {
                        c12025x63.m56891k4((c12025x6ArrM69082k44[0].m56897x1() + c12025x6ArrM69082k43[0].m56897x1()) / 2.0f);
                        fM56895kk = c12025x6ArrM69082k43[0].m56895kk();
                        c12025x6 = c12025x6ArrM69082k44[0];
                    } else {
                        c12025x63.m56891k4((c12025x6ArrM69082k44[1].m56897x1() + c12025x6ArrM69082k43[1].m56897x1()) / 2.0f);
                        fM56895kk = c12025x6ArrM69082k43[1].m56895kk();
                        c12025x6 = c12025x6ArrM69082k44[1];
                    }
                    c12025x63.m56898x1((c12025x6.m56895kk() + fM56895kk) / 2.0f);
                    list.addItem(new C14319px(iM64963x12, i18, c12025x63.Clone()));
                }
                i15 = i21 + 1;
                list2 = list5;
                listM72791k4 = list6;
                size = i17;
                c14787xiM69863u4 = c14787xi2;
                z = z3;
                fM64121to = f7;
                i14 = i19;
                listM64944dy2 = list7;
                c14787xiM69854ne = c14787xi;
            }
            C14787xi c14787xi3 = c14787xiM69854ne;
            List list8 = list2;
            m3585k4(c14365qy, c0886d84, (List<C12025x6[]>) list8);
            list8.clear();
            C14285pi.m69072k4((List<C14319px>) list, c14365qy);
            list.clear();
            i14++;
            list2 = list8;
            c14787xiM69863u4 = c14787xiM69863u4;
            z = z;
            fM64121to = fM64121to;
            c14787xiM69854ne = c14787xi3;
            i = 180;
            i5 = 270;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3584k4(float f, double d, boolean z, C14365qy c14365qy) {
        int i;
        double dM4989k4;
        int i2;
        List list;
        float fM64100du;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        float fM69822ar = c14365qy.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        float fM73389ix = !c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? ((((float) c14787xiM69863u4.m73389ix()) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du()) + (c14365qy.m69833e0().m64114kk() - c14365qy.m69833e0().m64100du()) : c14365qy.m69833e0().m64114kk() - ((((float) c14787xiM69863u4.m73389ix()) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du());
        List list2 = new List();
        int baseUnitScale = c14787xiM69854ne.m73384dy().getBaseUnitScale();
        boolean z2 = c14365qy.m69854ne().m73375b3() || c14365qy.m69834fa().hasDataTable();
        float fM64121to = c14365qy.m69833e0().m64121to() / c14365qy.m69854ne().m73373ak();
        float f2 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        List list3 = new List();
        List list4 = new List();
        int i3 = 0;
        while (i3 < size) {
            C14787xi c14787xi = c14787xiM69863u4;
            C14787xi c14787xi2 = c14787xiM69854ne;
            float f3 = fM73389ix;
            float fM64124x1 = c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, listM72791k4.get_Item(i3).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM64121to);
            if (z2) {
                fM64124x1 += fM64121to / 2.0f;
            }
            list4.addItem(m3592k4(c14365qy, fM64124x1, f2, f));
            i3++;
            c14787xiM69863u4 = c14787xi;
            c14787xiM69854ne = c14787xi2;
            fM73389ix = f3;
        }
        C14787xi c14787xi3 = c14787xiM69863u4;
        C14787xi c14787xi4 = c14787xiM69854ne;
        float f4 = fM73389ix;
        list3.addItem(list4);
        C0886d8[] c0886d8Arr = new C0886d8[listM69865up.size()];
        List list5 = null;
        int i4 = 0;
        while (i4 < listM69865up.size()) {
            C13847mr c13847mr = listM69865up.get_Item(i4);
            int iM64963x1 = c13847mr.m64963x1();
            List<C0886d8> listM64944dy = c13847mr.m64944dy();
            List list6 = list4;
            List list7 = new List();
            if (i4 == 0) {
                list5 = list6;
            }
            boolean z3 = z2;
            int i5 = 0;
            while (i5 < size) {
                List<Integer> list8 = listM72791k4;
                int i6 = size;
                float f5 = fM64121to;
                C0886d8[] c0886d8Arr2 = c0886d8Arr;
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (f5 * C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, listM72791k4.get_Item(i5).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xi4.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi4.m73389ix()), 14), false));
                if (z3) {
                    fM64124x12 += f5 / 2.0f;
                }
                int i7 = c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? (i6 - 1) - i5 : i5;
                C0886d8 c0886d8 = listM64944dy.get_Item(i7);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i = i4;
                    dM4989k4 = 0.0d;
                } else {
                    c0886d8Arr2[i4] = c0886d8;
                    dM4989k4 = c0886d8.m4989k4();
                    int i8 = 0;
                    while (i8 < i4) {
                        int i9 = i4;
                        C0886d8 c0886d82 = listM69865up.get_Item(i8).m64944dy().get_Item(i7);
                        if (c0886d82 != null) {
                            dM4989k4 += c0886d82.m4989k4();
                        }
                        i8++;
                        i4 = i9;
                    }
                    i = i4;
                }
                List<C0886d8> list9 = listM64944dy;
                int i10 = baseUnitScale;
                double dM67475k4 = 0.0d;
                for (int i11 = 0; i11 < listM69865up.size(); i11++) {
                    C0886d8 c0886d83 = listM69865up.get_Item(i11).m64944dy().get_Item(i7);
                    if (c0886d83 != null && !c0886d8.m4983dy()) {
                        dM67475k4 = C14116yg.m67475k4(c0886d83.m4989k4()) + dM67475k4;
                    }
                }
                if (z) {
                    i2 = i10;
                    if (dM67475k4 == 0.0d) {
                        list = list3;
                        i5++;
                        list3 = list;
                        baseUnitScale = i2;
                        c0886d8Arr = c0886d8Arr2;
                        size = i6;
                        listM72791k4 = list8;
                        fM64121to = f5;
                        listM64944dy = list9;
                        i4 = i;
                    } else {
                        list = list3;
                        fM64100du = c14365qy.m69833e0().m64100du() * (((((float) C14116yg.m67475k4(dM4989k4)) * 100.0f) / ((float) dM67475k4)) / ((float) (c14787xi3.m73389ix() - c14787xi3.m73410ne())));
                    }
                } else {
                    fM64100du = (((float) C14116yg.m67475k4(dM4989k4)) / ((float) (c14787xi3.m73389ix() - c14787xi3.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    i2 = i10;
                    list = list3;
                }
                C12025x6[] c12025x6ArrM3592k4 = m3592k4(c14365qy, fM64124x12, f2, (c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? dM4989k4 > 0.0d : dM4989k4 <= 0.0d) ? f4 + fM64100du : f4 - fM64100du);
                list7.addItem(c12025x6ArrM3592k4);
                if (c0886d8 != null && !c0886d8.m4983dy()) {
                    C12025x6 c12025x6 = new C12025x6(0.0f, 0.0f);
                    C12025x6[] c12025x6Arr = (C12025x6[]) C7019kk.m27458kk(list5.get_Item(i5), C12025x6[].class);
                    if (c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) {
                        c12025x6.m56891k4(c12025x6ArrM3592k4[0].m56897x1());
                        c12025x6.m56898x1((c12025x6ArrM3592k4[0].m56895kk() + c12025x6Arr[0].m56895kk()) / 2.0f);
                    } else {
                        c12025x6.m56891k4(c12025x6ArrM3592k4[1].m56897x1());
                        c12025x6.m56898x1((c12025x6ArrM3592k4[1].m56895kk() + c12025x6Arr[1].m56895kk()) / 2.0f);
                    }
                    list2.addItem(new C14319px(iM64963x1, i7, c12025x6.Clone()));
                }
                i5++;
                list3 = list;
                baseUnitScale = i2;
                c0886d8Arr = c0886d8Arr2;
                size = i6;
                listM72791k4 = list8;
                fM64121to = f5;
                listM64944dy = list9;
                i4 = i;
            }
            list3.addItem(list7);
            list5 = list7;
            list4 = list6;
            z2 = z3;
            listM72791k4 = listM72791k4;
            i4++;
            c0886d8Arr = c0886d8Arr;
        }
        m3588k4(c0886d8Arr, (List<List<C12025x6[]>>) list3, c14365qy);
        C14285pi.m69072k4((List<C14319px>) list2, c14365qy);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0750ai c0750ai) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3585k4(C14365qy c14365qy, C0886d8 c0886d8, List<C12025x6[]> list) {
        char c;
        char c2 = 4;
        if (list.size() < 4 || c0886d8 == null) {
            return;
        }
        char c3 = 2;
        int size = list.size() / 2;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, size);
        C12025x6[] c12025x6Arr2 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, size);
        C12025x6[] c12025x6Arr3 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, size);
        C12025x6[] c12025x6Arr4 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, size);
        char c4 = 0;
        int i = 0;
        while (true) {
            c = 1;
            if (i >= list.size()) {
                break;
            }
            C12025x6[] c12025x6Arr5 = list.get_Item(i);
            C12025x6[] c12025x6Arr6 = list.get_Item(i + 1);
            int i2 = i / 2;
            c12025x6Arr5[0].CloneTo(c12025x6Arr[i2]);
            c12025x6Arr5[1].CloneTo(c12025x6Arr2[i2]);
            c12025x6Arr6[0].CloneTo(c12025x6Arr3[i2]);
            c12025x6Arr6[1].CloneTo(c12025x6Arr4[i2]);
            i += 2;
            c2 = c2;
            c3 = c3;
        }
        char c5 = c2;
        char c6 = c3;
        int i3 = 1;
        while (i3 < size) {
            C12025x6[] c12025x6Arr7 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 8);
            C12025x6 c12025x6 = new C12025x6();
            C12025x6 c12025x62 = new C12025x6();
            C12025x6[] c12025x6Arr8 = {c12025x6};
            int i4 = i3 - 1;
            char c7 = c4;
            char c8 = c;
            int i5 = i3;
            C12025x6[] c12025x6Arr9 = c12025x6Arr;
            boolean zM3591k4 = m3591k4(c12025x6Arr[i4].Clone(), c12025x6Arr[i3].Clone(), c12025x6Arr3[i4].Clone(), c12025x6Arr3[i5].Clone(), c12025x6Arr8);
            c12025x6Arr8[c7].CloneTo(c12025x6);
            if (zM3591k4) {
                C12025x6[] c12025x6Arr10 = {c12025x62};
                boolean zM3591k42 = m3591k4(c12025x6Arr2[i4].Clone(), c12025x6Arr2[i5].Clone(), c12025x6Arr4[i4].Clone(), c12025x6Arr4[i5].Clone(), c12025x6Arr10);
                c12025x6Arr10[c7].CloneTo(c12025x62);
                if (zM3591k42) {
                    c12025x6Arr9[i4].CloneTo(c12025x6Arr7[c7]);
                    c12025x6.CloneTo(c12025x6Arr7[c8]);
                    c12025x62.CloneTo(c12025x6Arr7[c6]);
                    c12025x6Arr2[i4].CloneTo(c12025x6Arr7[3]);
                    c12025x6Arr3[i4].CloneTo(c12025x6Arr7[c5]);
                    c12025x6.CloneTo(c12025x6Arr7[5]);
                    c12025x62.CloneTo(c12025x6Arr7[6]);
                    c12025x6Arr4[i4].CloneTo(c12025x6Arr7[7]);
                    m3586k4(c14365qy, c0886d8, c12025x6Arr7);
                    c12025x6.CloneTo(c12025x6Arr7[c7]);
                    c12025x6Arr9[i5].CloneTo(c12025x6Arr7[c8]);
                    c12025x6Arr2[i5].CloneTo(c12025x6Arr7[c6]);
                    c12025x62.CloneTo(c12025x6Arr7[3]);
                    c12025x6.CloneTo(c12025x6Arr7[c5]);
                    c12025x6Arr3[i5].CloneTo(c12025x6Arr7[5]);
                    c12025x6Arr4[i5].CloneTo(c12025x6Arr7[6]);
                    c12025x62.CloneTo(c12025x6Arr7[7]);
                } else {
                    i3 = i5 + 1;
                    c4 = c7;
                    c = c8;
                    c12025x6Arr = c12025x6Arr9;
                }
            } else {
                c12025x6Arr9[i4].CloneTo(c12025x6Arr7[c7]);
                c12025x6Arr9[i5].CloneTo(c12025x6Arr7[c8]);
                c12025x6Arr2[i5].CloneTo(c12025x6Arr7[c6]);
                c12025x6Arr2[i4].CloneTo(c12025x6Arr7[3]);
                c12025x6Arr3[i4].CloneTo(c12025x6Arr7[c5]);
                c12025x6Arr3[i5].CloneTo(c12025x6Arr7[5]);
                c12025x6Arr4[i5].CloneTo(c12025x6Arr7[6]);
                c12025x6Arr4[i4].CloneTo(c12025x6Arr7[7]);
            }
            m3586k4(c14365qy, c0886d8, c12025x6Arr7);
            i3 = i5 + 1;
            c4 = c7;
            c = c8;
            c12025x6Arr = c12025x6Arr9;
        }
        m3587k4(c14365qy, c0886d8, c12025x6Arr, c12025x6Arr2, c12025x6Arr3, c12025x6Arr4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3586k4(C14365qy c14365qy, C0886d8 c0886d8, C12025x6[] c12025x6Arr) {
        C11896dy c11896dy;
        C11896dy c11896dy2;
        C11896dy c11896dy3;
        new C11896dy().m55570to(c12025x6Arr);
        boolean z = c12025x6Arr[3].m56895kk() + (c12025x6Arr[2].m56895kk() + (c12025x6Arr[1].m56895kk() + c12025x6Arr[0].m56895kk())) > c12025x6Arr[7].m56895kk() + (c12025x6Arr[6].m56895kk() + (c12025x6Arr[5].m56895kk() + c12025x6Arr[4].m56895kk()));
        if (c14365qy.m69829dq() > 0) {
            if (z) {
                C11896dy c11896dy4 = new C11896dy();
                c11896dy4.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
                c0886d8.m4993k4(c11896dy4, 0.6666667f);
                c0886d8.m4992k4(c11896dy4);
                c11896dy2 = new C11896dy();
                c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
                c0886d8.m4993k4(c11896dy2, 0.6666667f);
                c0886d8.m4992k4(c11896dy2);
            } else {
                C11896dy c11896dy5 = new C11896dy();
                c11896dy5.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
                c0886d8.m4993k4(c11896dy5, 0.6666667f);
                c0886d8.m4992k4(c11896dy5);
                c11896dy = new C11896dy();
                c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
                c0886d8.m4993k4(c11896dy, 0.6666667f);
                c0886d8.m4992k4(c11896dy);
            }
        } else if (z) {
            C11896dy c11896dy6 = new C11896dy();
            c11896dy6.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
            c0886d8.m4993k4(c11896dy6, 0.6666667f);
            c0886d8.m4992k4(c11896dy6);
            c11896dy = new C11896dy();
            c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
            c0886d8.m4993k4(c11896dy, 0.6666667f);
            c0886d8.m4992k4(c11896dy);
        } else {
            C11896dy c11896dy7 = new C11896dy();
            c11896dy7.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
            c0886d8.m4993k4(c11896dy7, 0.6666667f);
            c0886d8.m4992k4(c11896dy7);
            c11896dy2 = new C11896dy();
            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
            c0886d8.m4993k4(c11896dy2, 0.6666667f);
            c0886d8.m4992k4(c11896dy2);
        }
        if (c14365qy.m69877xk() <= 90 || c14365qy.m69877xk() == 360) {
            c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
        } else if (c14365qy.m69877xk() > 90 && c14365qy.m69877xk() <= 180) {
            c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
        } else if (c14365qy.m69877xk() > 180 && c14365qy.m69877xk() <= 270) {
            c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
        } else {
            if (c14365qy.m69877xk() <= 270 || c14365qy.m69877xk() >= 360) {
                return;
            }
            c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
        }
        c0886d8.m4993k4(c11896dy3, 0.5f);
        c0886d8.m4992k4(c11896dy3);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3587k4(C14365qy c14365qy, C0886d8 c0886d8, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2, C12025x6[] c12025x6Arr3, C12025x6[] c12025x6Arr4) {
        C11896dy c11896dy;
        int i = 0;
        if (c14365qy.m69877xk() <= 90 || c14365qy.m69877xk() == 360 || (c14365qy.m69877xk() > 270 && c14365qy.m69877xk() < 360)) {
            C12025x6[] c12025x6Arr5 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12025x6Arr.length * 2));
            while (i < c12025x6Arr.length) {
                c12025x6Arr[i].CloneTo(c12025x6Arr5[i]);
                c12025x6Arr3[i].CloneTo(c12025x6Arr5[(c12025x6Arr5.length - 1) - i]);
                i++;
            }
            c11896dy = new C11896dy();
            c11896dy.m55570to(c12025x6Arr5);
        } else {
            if ((c14365qy.m69877xk() <= 90 || c14365qy.m69877xk() > 180) && (c14365qy.m69877xk() <= 180 || c14365qy.m69877xk() > 270)) {
                return;
            }
            C12025x6[] c12025x6Arr6 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12025x6Arr2.length * 2));
            while (i < c12025x6Arr2.length) {
                c12025x6Arr2[i].CloneTo(c12025x6Arr6[i]);
                c12025x6Arr4[i].CloneTo(c12025x6Arr6[(c12025x6Arr6.length - 1) - i]);
                i++;
            }
            c11896dy = new C11896dy();
            c11896dy.m55570to(c12025x6Arr6);
        }
        c0886d8.m5000kk(c11896dy);
        c0886d8.m4992k4(c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3588k4(C0886d8[] c0886d8Arr, List<List<C12025x6[]>> list, C14365qy c14365qy) {
        int i;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        C12025x6[] c12025x6Arr;
        Object objOooO00o;
        C11896dy c11896dy;
        C11896dy c11896dy2;
        if (list.size() < 2) {
            return;
        }
        int i2 = 0;
        List<C12025x6[]> list2 = list.get_Item(0);
        if (list.size() >= 2) {
            List list3 = (List) OooO0O0.OooO00o(list, 1);
            C12025x6[] c12025x6Arr2 = null;
            for (int i3 = 1; i3 < list2.size(); i3++) {
                if (c14365qy.m69829dq() >= 0) {
                    int size = list.size();
                    int i4 = size - 1;
                    C0886d8 c0886d8 = c0886d8Arr[size - 2];
                    C12025x6[][] c12025x6Arr3 = {c12025x6Arr2};
                    boolean zM3590k4 = m3590k4((List<C12025x6[]>) list3, list2, i3, c12025x6Arr3);
                    c12025x6Arr2 = c12025x6Arr3[0];
                    if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
                        if (zM3590k4) {
                            List<C12025x6[]> list4 = list.get_Item(i4);
                            C12025x6[] c12025x6Arr4 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
                            int i5 = i3 - 1;
                            C12025x6[] c12025x6Arr5 = list4.get_Item(i5);
                            if (c12025x6Arr2[0].m56895kk() >= c12025x6Arr5[0].m56895kk()) {
                                C12025x6[] c12025x6Arr6 = list2.get_Item(i5);
                                c12025x6Arr6[0].CloneTo(c12025x6Arr4[0]);
                                c12025x6Arr6[1].CloneTo(c12025x6Arr4[1]);
                                c12025x6Arr2[1].CloneTo(c12025x6Arr4[2]);
                                c12025x6Arr2[0].CloneTo(c12025x6Arr4[3]);
                                c11896dy = new C11896dy();
                            } else {
                                c12025x6Arr5[0].CloneTo(c12025x6Arr4[0]);
                                c12025x6Arr5[1].CloneTo(c12025x6Arr4[1]);
                                c12025x6Arr2[1].CloneTo(c12025x6Arr4[2]);
                                c12025x6Arr2[0].CloneTo(c12025x6Arr4[3]);
                                c11896dy = new C11896dy();
                            }
                            c11896dy.m55570to(c12025x6Arr4);
                            c0886d8.m4993k4(c11896dy, 0.6666667f);
                            c0886d8.m4992k4(c11896dy);
                            C12025x6[] c12025x6Arr7 = list4.get_Item(i3);
                            if (c12025x6Arr2[0].m56895kk() >= c12025x6Arr7[0].m56895kk()) {
                                C12025x6[] c12025x6Arr8 = list2.get_Item(i3);
                                c12025x6Arr8[0].CloneTo(c12025x6Arr4[0]);
                                c12025x6Arr8[1].CloneTo(c12025x6Arr4[1]);
                                c12025x6Arr2[1].CloneTo(c12025x6Arr4[2]);
                                c12025x6Arr2[0].CloneTo(c12025x6Arr4[3]);
                                c11896dy2 = new C11896dy();
                            } else {
                                c12025x6Arr7[0].CloneTo(c12025x6Arr4[0]);
                                c12025x6Arr7[1].CloneTo(c12025x6Arr4[1]);
                                c12025x6Arr2[1].CloneTo(c12025x6Arr4[2]);
                                c12025x6Arr2[0].CloneTo(c12025x6Arr4[3]);
                                c11896dy2 = new C11896dy();
                            }
                            c11896dy2.m55570to(c12025x6Arr4);
                            c0886d8.m4993k4(c11896dy2, 0.6666667f);
                            c0886d8.m4992k4(c11896dy2);
                        }
                    } else if (m3589k4((List<C12025x6[]>) list3, list2, i3)) {
                        List<C12025x6[]> list5 = list.get_Item(i4);
                        C12025x6[] c12025x6Arr9 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
                        C12025x6[] c12025x6Arr10 = (C12025x6[]) C7019kk.m27458kk(list5.get_Item(i3 - 1), C12025x6[].class);
                        c12025x6Arr10[0].CloneTo(c12025x6Arr9[0]);
                        c12025x6Arr10[1].CloneTo(c12025x6Arr9[1]);
                        C12025x6[] c12025x6Arr11 = list5.get_Item(i3);
                        c12025x6Arr11[1].CloneTo(c12025x6Arr9[2]);
                        c12025x6Arr11[0].CloneTo(c12025x6Arr9[3]);
                        c11896dy2 = new C11896dy();
                        c11896dy2.m55570to(c12025x6Arr9);
                        c0886d8.m4993k4(c11896dy2, 0.6666667f);
                        c0886d8.m4992k4(c11896dy2);
                    }
                }
            }
            for (int i6 = 1; i6 < list.size(); i6++) {
                int i7 = i6 - 1;
                C0886d8 c0886d82 = c0886d8Arr[i7];
                List<C12025x6[]> list6 = list.get_Item(i7);
                List<C12025x6[]> list7 = list.get_Item(i6);
                if (c14365qy.m69877xk() <= 180) {
                    c12025x6Arr = (C12025x6[]) OooO0O0.OooO00o(list6, 1);
                    objOooO00o = OooO0O0.OooO00o(list7, 1);
                } else {
                    c12025x6Arr = list6.get_Item(0);
                    objOooO00o = list7.get_Item(0);
                }
                C12025x6[] c12025x6Arr12 = (C12025x6[]) objOooO00o;
                C11896dy c11896dy3 = new C11896dy();
                c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr12[1], c12025x6Arr12[0]});
                c0886d82.m4993k4(c11896dy3, 0.5f);
                c0886d82.m4992k4(c11896dy3);
            }
            int i8 = 1;
            while (i8 < list.size()) {
                int i9 = i8 - 1;
                C0886d8 c0886d83 = c0886d8Arr[i9];
                List<C12025x6[]> list8 = list.get_Item(i9);
                List<C12025x6[]> list9 = list.get_Item(i8);
                int size2 = list9.size() * 2;
                C12025x6[] c12025x6Arr13 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, size2);
                int i10 = i2;
                while (i10 < list8.size()) {
                    C12025x6[] c12025x6Arr14 = list8.get_Item(i10);
                    C12025x6[] c12025x6Arr15 = list9.get_Item(i10);
                    if (c14365qy.m69877xk() <= 90 || c14365qy.m69877xk() == 360) {
                        i = i2;
                    } else {
                        i = i2;
                        if (c14365qy.m69877xk() <= 270 || c14365qy.m69877xk() >= 360) {
                            c12025x6Arr14[1].CloneTo(c12025x6Arr13[i10]);
                            c12025x62 = c12025x6Arr15[1];
                            c12025x6 = c12025x6Arr13[(size2 - i10) - 1];
                        }
                        c12025x62.CloneTo(c12025x6);
                        i10++;
                        i2 = i;
                    }
                    c12025x6Arr14[i].CloneTo(c12025x6Arr13[i10]);
                    c12025x62 = c12025x6Arr15[i];
                    c12025x6 = c12025x6Arr13[(size2 - i10) - 1];
                    c12025x62.CloneTo(c12025x6);
                    i10++;
                    i2 = i;
                }
                int i11 = i2;
                C11896dy c11896dy4 = new C11896dy();
                c11896dy4.m55570to(c12025x6Arr13);
                c0886d83.m5000kk(c11896dy4);
                c0886d83.m4992k4(c11896dy4);
                i8++;
                i2 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3589k4(List<C12025x6[]> list, List<C12025x6[]> list2, int i) {
        int i2 = i - 1;
        return list.get_Item(i2)[0].Clone().m56895kk() < list2.get_Item(i2)[0].Clone().m56895kk() && list.get_Item(i)[0].Clone().m56895kk() < list2.get_Item(i)[0].Clone().m56895kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3590k4(List<C12025x6[]> list, List<C12025x6[]> list2, int i, C12025x6[][] c12025x6Arr) {
        int i2 = i - 1;
        C12025x6 c12025x6Clone = list.get_Item(i2)[0].Clone();
        C12025x6 c12025x6Clone2 = list.get_Item(i)[0].Clone();
        C12025x6 c12025x6Clone3 = list2.get_Item(i2)[0].Clone();
        C12025x6 c12025x6Clone4 = list2.get_Item(i)[0].Clone();
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr2 = {c12025x6};
        boolean zM3591k4 = m3591k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone(), c12025x6Clone3.Clone(), c12025x6Clone4.Clone(), c12025x6Arr2);
        c12025x6Arr2[0].CloneTo(c12025x6);
        list.get_Item(i2)[1].CloneTo(c12025x6Clone);
        list.get_Item(i)[1].CloneTo(c12025x6Clone2);
        list2.get_Item(i2)[1].CloneTo(c12025x6Clone3);
        list2.get_Item(i)[1].CloneTo(c12025x6Clone4);
        C12025x6[] c12025x6Arr3 = {c12025x62};
        m3591k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone(), c12025x6Clone3.Clone(), c12025x6Clone4.Clone(), c12025x6Arr3);
        c12025x6Arr3[0].CloneTo(c12025x62);
        C12025x6[] c12025x6Arr4 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), 2));
        c12025x6Arr[0] = c12025x6Arr4;
        c12025x6.CloneTo(c12025x6Arr4[0]);
        c12025x62.CloneTo(c12025x6Arr[0][1]);
        return zM3591k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3591k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64, C12025x6[] c12025x6Arr) {
        c12025x6Arr[0] = new C12025x6(0.0f, 0.0f);
        if (c12025x6.m56897x1() != c12025x62.m56897x1() && c12025x63.m56897x1() != c12025x64.m56897x1()) {
            float fM56895kk = (c12025x6.m56895kk() - c12025x62.m56895kk()) / (c12025x6.m56897x1() - c12025x62.m56897x1());
            float fM56895kk2 = c12025x6.m56895kk() - (c12025x6.m56897x1() * fM56895kk);
            float fM56895kk3 = (c12025x63.m56895kk() - c12025x64.m56895kk()) / (c12025x63.m56897x1() - c12025x64.m56897x1());
            float fM56895kk4 = c12025x63.m56895kk() - (c12025x63.m56897x1() * fM56895kk3);
            if (fM56895kk == fM56895kk3) {
                return false;
            }
            c12025x6Arr[0].m56891k4((fM56895kk4 - fM56895kk2) / (fM56895kk - fM56895kk3));
            C12025x6 c12025x65 = c12025x6Arr[0];
            c12025x65.m56898x1((c12025x65.m56897x1() * fM56895kk) + fM56895kk2);
            if (c12025x6.m56897x1() < c12025x6Arr[0].m56897x1() && c12025x62.m56897x1() > c12025x6Arr[0].m56897x1() && c12025x63.m56897x1() < c12025x6Arr[0].m56897x1() && c12025x64.m56897x1() > c12025x6Arr[0].m56897x1()) {
                return true;
            }
            if (c12025x6.m56897x1() > c12025x6Arr[0].m56897x1() && c12025x62.m56897x1() < c12025x6Arr[0].m56897x1() && c12025x63.m56897x1() > c12025x6Arr[0].m56897x1() && c12025x64.m56897x1() < c12025x6Arr[0].m56897x1()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6[] m3592k4(C14365qy c14365qy, float f, float f2, float f3) {
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        if (f <= fM64106h4) {
            float f4 = (fM64106h4 - f) * 2.0f;
            C14285pi.m69064k4(c14365qy, f3, f4, f2, 0).CloneTo(c12025x6Arr[0]);
            c12025x6M69064k4 = C14285pi.m69064k4(c14365qy, f3, f4, f2, 3);
            c12025x6 = c12025x6Arr[1];
        } else {
            float f5 = (f - fM64106h4) * 2.0f;
            C14285pi.m69064k4(c14365qy, f3, f5, f2, 1).CloneTo(c12025x6Arr[0]);
            c12025x6M69064k4 = C14285pi.m69064k4(c14365qy, f3, f5, f2, 2);
            c12025x6 = c12025x6Arr[1];
        }
        c12025x6M69064k4.CloneTo(c12025x6);
        return c12025x6Arr;
    }
}
