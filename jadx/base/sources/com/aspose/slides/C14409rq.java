package com.aspose.slides;

import OooO0o.C20424OooO0Oo;
import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.rq */
/* JADX INFO: loaded from: classes3.dex */
class C14409rq extends AbstractC7020m9<C14409rq> {
    /* JADX INFO: renamed from: k4 */
    public static C12023wl m70243k4(List<Object> list, C12014ne c12014ne, C14787xi c14787xi) {
        if (c14787xi.m73384dy() == null || c14787xi.m73384dy().getTickLabelPosition() == 3 || list.size() == 0) {
            return new C12023wl(0, 0);
        }
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        c12015qq.m56695k4((c12014ne.m56663c5() / list.size()) * c14787xi.m73376bv());
        c12015qq.m56700x1(c12014ne.m56683x1() * 0.5f);
        int iM56865x1 = 0;
        int iM56862kk = 0;
        for (int i = 0; i < list.size(); i++) {
            C12023wl c12023wlClone = C0840c3.m4439k4(C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i), c14787xi), c14787xi.m73386h4(), c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).Clone();
            if (c12023wlClone.m56865x1() > iM56865x1) {
                iM56865x1 = c12023wlClone.m56865x1();
            }
            if (c12023wlClone.m56862kk() > iM56862kk) {
                iM56862kk = c12023wlClone.m56862kk();
            }
            if (i == 0) {
                c14787xi.m73427x1((C0840c3.m4441k4("a", c14787xi.m73386h4(), c14787xi.m73400kk(), c12014ne.m56680m9().Clone(), 1, 1).Clone().m56865x1() * c14787xi.m73378ck()) / 250);
            }
        }
        c14787xi.f50094k4 = iM56865x1;
        c14787xi.f50110x1 = iM56862kk;
        return new C12023wl(iM56865x1, iM56862kk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70252kk(C14787xi c14787xi, C14365qy c14365qy) {
        double dM73430x6;
        double dM73410ne;
        String strM63880k4;
        C12025x6[] c12025x6Arr;
        double d;
        String str;
        int i;
        float fM56557jd;
        float fM56551ck;
        float fM67480k4;
        float f;
        float fM56557jd2;
        float fM56897x1;
        float f2;
        int i2;
        float fM56557jd3;
        float fM56895kk;
        float f3;
        float fM56551ck2;
        float fM56897x12;
        float f4;
        float fM56895kk2;
        float f5;
        float fM56897x13;
        float f6;
        float f7;
        float fM56897x14;
        float f8;
        float f9;
        float fM56557jd4;
        float fM56895kk3;
        float f10;
        float fM56897x15;
        float f11;
        float fM56895kk4;
        float f12;
        float fM67480k42;
        float fM56897x16;
        float f13;
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qy);
        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
            dM73430x6 = c14365qy.m69863u4().m73389ix();
            dM73410ne = c14365qy.m69863u4().m73430x6();
        } else {
            dM73430x6 = c14365qy.m69863u4().m73430x6();
            dM73410ne = c14365qy.m69863u4().m73410ne();
        }
        double d2 = dM73430x6 - dM73410ne;
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d2 / (c14365qy.m69863u4().m73389ix() - c14365qy.m69863u4().m73410ne()), c14365qy.m69833e0().m64100du(), 14);
        int i3 = 1;
        int i4 = 0;
        if (iOooO00o != 0) {
            float f14 = iOooO00o;
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - f14, c12025x6ArrM72659kk[1].m56897x1(), c12025x6ArrM72659kk[1].m56895kk() - f14);
        }
        if (c14365qy.m69829dq() >= 0) {
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[1].m56897x1(), c12025x6ArrM72659kk[1].m56895kk());
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            C12025x6 c12025x6 = c12025x6ArrM72659kk[0];
            float f15 = iOooO00o;
            c12025x6.m56898x1(c12025x6.m56895kk() - f15);
            C12025x6 c12025x62 = c12025x6ArrM72659kk[1];
            c12025x62.m56898x1(c12025x62.m56895kk() - f15);
        }
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        float fM73390jd = c14787xi.m73390jd();
        if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
            float fM56639dy = c14787xi.m73400kk().m56639dy();
            fM73390jd += C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy);
        }
        double dM67471fa = c12025x6ArrM72659kk[1].m56897x1() == c12025x6ArrM72659kk[0].m56897x1() ? 1.5707963267948966d : C14116yg.m67471fa(C14116yg.m67480k4((c12025x6ArrM72659kk[0].m56895kk() - c12025x6ArrM72659kk[1].m56895kk()) / (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1())));
        boolean z = c14787xi.m73375b3() || c14365qy.m69834fa().hasDataTable();
        float fM73373ak = c14787xi.m73373ak();
        float fM56897x17 = (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1()) / fM73373ak;
        float fM56895kk5 = (c12025x6ArrM72659kk[1].m56895kk() - c12025x6ArrM72659kk[0].m56895kk()) / fM73373ak;
        List<Object> list = c14787xi.f50098m9;
        while (i4 < list.size()) {
            int iOooO00o2 = c14787xi.m73384dy().isPlotOrderReversed() ? C20856OooooOo.OooO00o(i3, i4, list) : i4;
            int i5 = i3;
            C14080ne.m66998m9(c14787xi.f50098m9.get_Item(i4));
            C12003du c12003duClone = c14787xi.m73413to().Clone();
            strM63880k4 = "";
            if (iOooO00o2 < c14787xi.f50098m9.size()) {
                String strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(iOooO00o2), c14787xi);
                c12025x6Arr = c12025x6ArrM72659kk;
                d = d2;
                C13729ki.m63876k4(c14787xi.f50098m9.get_Item(iOooO00o2), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone()).CloneTo(c12003duClone);
                if (!c14787xi.m73385fa() || listM69871x1.size() <= 0) {
                    str = strM4468k4;
                    if (c14787xi.m73384dy().getTickLabelPosition() == 3) {
                        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
                        if (!z) {
                            if (c14365qy.m69829dq() >= 0) {
                                if (c12025x6Arr[0].m56895kk() == c12025x6Arr[i5].m56895kk()) {
                                    c12007ix.m56566kk(fM56897x17 < 0.0f ? (fM56897x17 / 2.0f) + (i4 * fM56897x17) + c12025x6Arr[0].m56897x1() : ((i4 * fM56897x17) + c12025x6Arr[0].m56897x1()) - (fM56897x17 / 2.0f));
                                    fM56551ck = c12025x6Arr[0].m56895kk() + fM73390jd;
                                } else if (dM67471fa <= 0.7853981633974483d) {
                                    float f16 = i4;
                                    c12007ix.m56566kk(((f16 * fM56897x17) + c12025x6Arr[0].m56897x1()) - (C14116yg.m67480k4(fM56897x17) / 2.0f));
                                    c12007ix.m56572to((f16 * fM56895kk5) + c12025x6Arr[0].m56895kk() + fM73390jd);
                                    fM67480k4 = C14116yg.m67480k4(fM56897x17);
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50110x1);
                                    i = iOooO00o;
                                } else {
                                    float f17 = i4;
                                    c12007ix.m56566kk((f17 * fM56897x17) + c12025x6Arr[0].m56897x1());
                                    if (fM56897x17 * fM56895kk5 <= 0.0f) {
                                        f = f17;
                                        fM56557jd2 = (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd) + c12007ix.m56557jd();
                                    } else {
                                        f = f17;
                                        fM56557jd2 = (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd)) - c14787xi.f50094k4;
                                    }
                                    c12007ix.m56566kk(fM56557jd2);
                                    c12007ix.m56572to(((f * fM56895kk5) + c12025x6Arr[0].m56895kk()) - (c14787xi.f50110x1 / 2.0f));
                                    fM67480k4 = c14787xi.f50094k4;
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50110x1);
                                    i = iOooO00o;
                                }
                            } else if (c14365qy.m69829dq() >= 0 || d == 0.0d || c14787xi.m73384dy().getTickLabelPosition() != 2) {
                                i = iOooO00o;
                            } else if (c12025x6Arr[0].m56895kk() == c12025x6Arr[i5].m56895kk()) {
                                c12007ix.m56566kk(fM56897x17 > 0.0f ? ((i4 * fM56897x17) + c12025x6Arr[0].m56897x1()) - (fM56897x17 / 2.0f) : (i4 * fM56897x17) + c12025x6Arr[0].m56897x1() + (fM56897x17 / 2.0f));
                                fM56551ck = (c12025x6Arr[0].m56895kk() - c14787xi.f50110x1) - fM73390jd;
                            } else if (dM67471fa <= 0.7853981633974483d) {
                                float f18 = i4;
                                c12007ix.m56566kk(((f18 * fM56897x17) + c12025x6Arr[0].m56897x1()) - (C14116yg.m67480k4(fM56897x17) / 2.0f));
                                c12007ix.m56572to((f18 * fM56895kk5) + c12025x6Arr[0].m56895kk());
                                fM56551ck = c12007ix.m56551ck() - (c14787xi.f50110x1 + fM73390jd);
                            } else {
                                float f19 = i4;
                                c12007ix.m56566kk((f19 * fM56897x17) + c12025x6Arr[0].m56897x1());
                                if (fM56897x17 * fM56895kk5 >= 0.0f) {
                                    i = iOooO00o;
                                    fM56557jd = (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd) + c12007ix.m56557jd();
                                } else {
                                    i = iOooO00o;
                                    fM56557jd = (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd)) - c14787xi.f50094k4;
                                }
                                c12007ix.m56566kk(fM56557jd);
                                c12007ix.m56572to(((f19 * fM56895kk5) + c12025x6Arr[0].m56895kk()) - (c14787xi.f50110x1 / 2.0f));
                                c12007ix.m56576x1(c14787xi.f50094k4);
                                c12007ix.m56560k4(c14787xi.f50110x1);
                            }
                            c12007ix.m56572to(fM56551ck);
                            fM67480k4 = C14116yg.m67480k4(fM56897x17);
                            c12007ix.m56576x1(fM67480k4);
                            c12007ix.m56560k4(c14787xi.f50110x1);
                            i = iOooO00o;
                        } else if (c14365qy.m69829dq() >= 0) {
                            if (c12025x6Arr[0].m56895kk() == c12025x6Arr[i5].m56895kk()) {
                                if (fM56897x17 < 0.0f) {
                                    fM56897x16 = c12025x6Arr[0].m56897x1();
                                    f13 = i4 + 1;
                                } else {
                                    fM56897x16 = c12025x6Arr[0].m56897x1();
                                    f13 = i4;
                                }
                                c12007ix.m56566kk((f13 * fM56897x17) + fM56897x16);
                                c12007ix.m56572to(c12025x6Arr[0].m56895kk() + fM73390jd);
                                fM67480k42 = C14116yg.m67480k4(fM56897x17);
                            } else if (dM67471fa <= 0.7853981633974483d) {
                                if (fM56897x17 < 0.0f) {
                                    fM56897x15 = c12025x6Arr[0].m56897x1();
                                    f11 = i4 + 1;
                                } else {
                                    fM56897x15 = c12025x6Arr[0].m56897x1();
                                    f11 = i4;
                                }
                                c12007ix.m56566kk((f11 * fM56897x17) + fM56897x15);
                                if (fM56895kk5 > 0.0f) {
                                    fM56895kk4 = c12025x6Arr[0].m56895kk();
                                    f12 = i4 + 1;
                                } else {
                                    fM56895kk4 = c12025x6Arr[0].m56895kk();
                                    f12 = i4;
                                }
                                c12007ix.m56572to((f12 * fM56895kk5) + fM56895kk4);
                                fM67480k42 = c14787xi.f50094k4;
                            } else {
                                if (fM56895kk5 > 0.0f) {
                                    fM56897x14 = (i4 * fM56897x17) + c12025x6Arr[0].m56897x1();
                                    f7 = 0.0f;
                                } else {
                                    f7 = 0.0f;
                                    fM56897x14 = c12025x6Arr[0].m56897x1() + ((i4 + 1) * fM56897x17);
                                }
                                c12007ix.m56566kk(fM56897x14);
                                if (fM56897x17 * fM56895kk5 <= f7) {
                                    f8 = fM73390jd;
                                    f9 = 2.0f;
                                    fM56557jd4 = (f8 * ((float) C14116yg.m67495m9(dM67471fa))) + c12007ix.m56557jd();
                                } else {
                                    f8 = fM73390jd;
                                    f9 = 2.0f;
                                    fM56557jd4 = (c12007ix.m56557jd() - (f8 * ((float) C14116yg.m67495m9(dM67471fa)))) - c14787xi.f50094k4;
                                }
                                c12007ix.m56566kk(fM56557jd4);
                                if (fM56895kk5 > 0.0f) {
                                    fM56895kk3 = c12025x6Arr[0].m56895kk();
                                    f10 = i4;
                                } else {
                                    fM56895kk3 = c12025x6Arr[0].m56895kk();
                                    f10 = i4 + 1;
                                }
                                c12007ix.m56572to((f10 * fM56895kk5) + fM56895kk3);
                                fM73390jd = f8;
                                c12007ix.m56572to((((C14116yg.m67480k4(fM56895kk5) - c14787xi.f50110x1) * ((float) C14116yg.m67495m9(dM67471fa))) / f9) + c12007ix.m56551ck());
                                fM67480k4 = c14787xi.f50094k4;
                                c12007ix.m56576x1(fM67480k4);
                                c12007ix.m56560k4(c14787xi.f50110x1);
                                i = iOooO00o;
                            }
                            c12007ix.m56576x1(fM67480k42);
                            c12007ix.m56560k4(c14787xi.f50110x1);
                            i = iOooO00o;
                        } else {
                            if (c14365qy.m69829dq() < 0 && d != 0.0d && c14787xi.m73384dy().getTickLabelPosition() == 2) {
                                if (c12025x6Arr[0].m56895kk() == c12025x6Arr[i5].m56895kk()) {
                                    if (fM56897x17 > 0.0f) {
                                        fM56897x13 = c12025x6Arr[0].m56897x1();
                                        f6 = i4;
                                    } else {
                                        fM56897x13 = c12025x6Arr[0].m56897x1();
                                        f6 = i4 + 1;
                                    }
                                    c12007ix.m56566kk((f6 * fM56897x17) + fM56897x13);
                                    fM56551ck2 = (c12025x6Arr[0].m56895kk() - c14787xi.f50110x1) - fM73390jd;
                                } else {
                                    if (dM67471fa <= 0.7853981633974483d) {
                                        if (fM56897x17 < 0.0f) {
                                            fM56897x12 = c12025x6Arr[0].m56897x1();
                                            f4 = i4 + 1;
                                        } else {
                                            fM56897x12 = c12025x6Arr[0].m56897x1();
                                            f4 = i4;
                                        }
                                        c12007ix.m56566kk((f4 * fM56897x17) + fM56897x12);
                                        if (fM56895kk5 < 0.0f) {
                                            fM56895kk2 = c12025x6Arr[0].m56895kk();
                                            f5 = i4 + 1;
                                        } else {
                                            fM56895kk2 = c12025x6Arr[0].m56895kk();
                                            f5 = i4;
                                        }
                                        c12007ix.m56572to((f5 * fM56895kk5) + fM56895kk2);
                                    } else {
                                        int i6 = (fM56895kk5 > 0.0f ? 1 : (fM56895kk5 == 0.0f ? 0 : -1));
                                        if (i6 < 0) {
                                            fM56897x1 = c12025x6Arr[0].m56897x1();
                                            f2 = i4;
                                        } else {
                                            fM56897x1 = c12025x6Arr[0].m56897x1();
                                            f2 = i4 + 1;
                                        }
                                        c12007ix.m56566kk((f2 * fM56897x17) + fM56897x1);
                                        if (fM56897x17 * fM56895kk5 >= 0.0f) {
                                            i2 = i6;
                                            fM56557jd3 = (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd) + c12007ix.m56557jd();
                                        } else {
                                            i2 = i6;
                                            fM56557jd3 = (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd)) - c14787xi.f50094k4;
                                        }
                                        c12007ix.m56566kk(fM56557jd3);
                                        if (i2 < 0) {
                                            fM56895kk = c12025x6Arr[0].m56895kk();
                                            f3 = i4;
                                        } else {
                                            fM56895kk = c12025x6Arr[0].m56895kk();
                                            f3 = i4 + 1;
                                        }
                                        c12007ix.m56572to((f3 * fM56895kk5) + fM56895kk);
                                        c12007ix.m56572to(c12007ix.m56551ck() - (((C14116yg.m67480k4(fM56895kk5) - c14787xi.f50110x1) * ((float) C14116yg.m67495m9(dM67471fa))) / 2.0f));
                                    }
                                    fM56551ck2 = c12007ix.m56551ck() - c14787xi.f50110x1;
                                }
                                c12007ix.m56572to(fM56551ck2);
                                fM67480k4 = c14787xi.f50094k4;
                                c12007ix.m56576x1(fM67480k4);
                                c12007ix.m56560k4(c14787xi.f50110x1);
                            }
                            i = iOooO00o;
                        }
                        C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(c12007ix.Clone())).Clone(), str, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 1, 2, c14365qy);
                    } else {
                        i = iOooO00o;
                    }
                    i4++;
                    iOooO00o = i;
                    i3 = i5;
                    c12025x6ArrM72659kk = c12025x6Arr;
                    d2 = d;
                } else {
                    String strM7228h4 = iOooO00o2 < listM69871x1.size() ? listM69871x1.get_Item(iOooO00o2).m7228h4() : "";
                    strM63880k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(iOooO00o2), strM7228h4, (iOooO00o2 >= listM69871x1.size() || !listM69871x1.get_Item(iOooO00o2).m7227du()) ? 0 : i5);
                    C13729ki.m63876k4(c14787xi.f50098m9.get_Item(iOooO00o2), strM7228h4, c12003duClone.Clone()).CloneTo(c12003duClone);
                }
            } else {
                c12025x6Arr = c12025x6ArrM72659kk;
                d = d2;
            }
            str = strM63880k4;
            if (c14787xi.m73384dy().getTickLabelPosition() == 3) {
            }
            i4++;
            iOooO00o = i;
            i3 = i5;
            c12025x6ArrM72659kk = c12025x6Arr;
            d2 = d;
        }
        m70249k4(iOooO00o, c14787xi);
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: to */
    private static void m70253to(C14787xi c14787xi, C14365qy c14365qy) {
        double dM73430x6;
        double dM73410ne;
        float f;
        C12025x6[] c12025x6Arr;
        List<Object> list;
        String strM63880k4;
        C12003du c12003duM63876k4;
        C13743kq c13743kqM69833e0 = c14365qy.m69833e0();
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qy);
        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
            dM73430x6 = c14365qy.m69863u4().m73389ix();
            dM73410ne = c14365qy.m69863u4().m73430x6();
        } else {
            dM73430x6 = c14365qy.m69863u4().m73430x6();
            dM73410ne = c14365qy.m69863u4().m73410ne();
        }
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((dM73430x6 - dM73410ne) / (c14365qy.m69863u4().m73389ix() - c14365qy.m69863u4().m73410ne()), c14365qy.m69833e0().m64121to(), 14);
        ?? r4 = 0;
        if (iOooO00o != 0) {
            float f2 = iOooO00o;
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1() + f2, c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[0].m56897x1() + f2, c12025x6ArrM72659kk[0].m56895kk() - c14365qy.m69833e0().m64100du());
        }
        if (c14365qy.m69829dq() >= 0) {
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c14365qy.m69833e0().m64100du());
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            C12025x6 c12025x6 = c12025x6ArrM72659kk[0];
            c12025x6.m56891k4(c12025x6.m56897x1() + iOooO00o);
        }
        List<Object> list2 = c14787xi.f50098m9;
        float fM73390jd = c14787xi.m73390jd();
        float f3 = c14787xi.f50110x1 / 2.0f;
        float fM56897x1 = (c12025x6ArrM72659kk[0].m56897x1() - c14787xi.f50094k4) - fM73390jd;
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        boolean z = c14787xi.m73385fa() && listM69871x1.size() > 0;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14);
        int baseUnitScale = c14787xi.m73384dy().getBaseUnitScale();
        float fM64100du = c13743kqM69833e0.m64100du() / (C0841c4.m4455k4(baseUnitScale, iM27462to, iM27462to2, iM27462to, false) + 1);
        int i = 0;
        while (i < list2.size()) {
            float fM4455k4 = (fM64100du / 2.0f) + (C0841c4.m4455k4(baseUnitScale, C14080ne.m66998m9(c14787xi.f50098m9.get_Item(i)), iM27462to2, iM27462to, (boolean) r4) * fM64100du);
            float fM56895kk = c14787xi.m73384dy().isPlotOrderReversed() ? (c12025x6ArrM72659kk[r4].m56895kk() - c14365qy.m69833e0().m64100du()) + fM4455k4 : c12025x6ArrM72659kk[r4].m56895kk() - fM4455k4;
            if (c14787xi.m73384dy().getTickLabelPosition() == 3 || i % c14787xi.m73376bv() != 0 || i >= c14787xi.f50098m9.size()) {
                f = fM64100du;
                c12025x6Arr = c12025x6ArrM72659kk;
                list = list2;
            } else {
                C12003du c12003duClone = c14787xi.m73413to().Clone();
                if (z) {
                    f = fM64100du;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    list = list2;
                    String strM7228h4 = i < listM69871x1.size() ? listM69871x1.get_Item(i).m7228h4() : "";
                    strM63880k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i), strM7228h4, i < listM69871x1.size() && listM69871x1.get_Item(i).m7227du());
                    c12003duM63876k4 = C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i), strM7228h4, c12003duClone.Clone());
                } else {
                    strM63880k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i), c14787xi);
                    f = fM64100du;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    list = list2;
                    c12003duM63876k4 = C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone());
                }
                c12003duM63876k4.CloneTo(c12003duClone);
                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM56897x1, fM56895kk - f3, c14787xi.f50094k4, c14787xi.f50110x1).Clone())).Clone(), strM63880k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 2, 2, c14365qy);
            }
            i++;
            fM64100du = f;
            list2 = list;
            c12025x6ArrM72659kk = c12025x6Arr;
            r4 = 0;
        }
        m70255x1(iOooO00o, c14787xi);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0270 A[PHI: r5
      0x0270: PHI (r5v9 int) = (r5v6 int), (r5v6 int), (r5v10 int) binds: [B:97:0x025d, B:99:0x026e, B:91:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9 A[LOOP:0: B:10:0x0039->B:68:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70254x1(int i, int i2, C14787xi c14787xi) {
        boolean z;
        boolean z2;
        int minorTickMark;
        boolean z3;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        float fM56895kk;
        float fM56895kk2;
        boolean z4;
        double d;
        C12025x6[] c12025x6Arr;
        C13743kq c13743kq;
        boolean z5;
        boolean z6;
        double d2;
        float fOooO0O0;
        double d3;
        int i3;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        C13743kq c13743kqM69833e0 = c14365qyM73423wy.m69833e0();
        if ((c14787xi.m73384dy().getMajorTickMark() == 2 && c14787xi.m73384dy().getMinorTickMark() == 2) || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qyM73423wy);
        new C12025x6();
        new C12025x6();
        while (true) {
            int i4 = i;
            int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
            boolean z7 = true;
            int i5 = 0;
            if (majorTickMark != 0) {
                if (majorTickMark == 1) {
                    z = true;
                    z2 = false;
                } else if (majorTickMark != 3) {
                    z = false;
                } else {
                    z2 = true;
                    z = false;
                }
                minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark != 0) {
                    z3 = true;
                } else if (minorTickMark == 1) {
                    z3 = false;
                } else if (minorTickMark != 3) {
                    z3 = false;
                    z7 = false;
                } else {
                    z3 = true;
                    z7 = false;
                }
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    c12025x6 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk());
                    c12025x62 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c13743kqM69833e0.m64100du());
                } else {
                    c12025x6 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c13743kqM69833e0.m64100du());
                    c12025x62 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk());
                }
                fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / i2;
                float fM56897x1 = c12025x6.m56897x1();
                fM56895kk2 = c12025x6.m56895kk();
                float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                while (true) {
                    i = i5;
                    if ((c12025x6.m56895kk() <= fM56895kk2 || fM56895kk2 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM56895kk2 || fM56895kk2 < c12025x62.m56895kk())) {
                        z4 = z2;
                        d = fM56895kk2;
                        c12025x6Arr = c12025x6ArrM72659kk;
                        c13743kq = c13743kqM69833e0;
                        if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56895kk())) {
                            break;
                        } else {
                            z5 = z3;
                        }
                    } else {
                        c12025x6Arr = c12025x6ArrM72659kk;
                        c13743kq = c13743kqM69833e0;
                        z5 = z3;
                        z4 = z2;
                    }
                    if ((c12025x6.m56895kk() <= fM56895kk2 || fM56895kk2 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM56895kk2 || fM56895kk2 < c12025x62.m56895kk())) {
                        d2 = fM56895kk2;
                        if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x62.m56895kk())) {
                            if (z) {
                                c14787xi.m73393k4(fM56897x1, fM56895kk2, fM56897x1 + fM4453k4, fM56895kk2);
                            }
                            if (z4) {
                                c14787xi.m73393k4(fM56897x1 - fM4453k4, fM56895kk2, fM56897x1, fM56895kk2);
                            }
                        }
                    }
                    fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM56895kk2);
                    if ((c12025x6.m56895kk() <= fOooO0O0 || fOooO0O0 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fOooO0O0 || fOooO0O0 < c12025x62.m56895kk())) {
                        d3 = fOooO0O0;
                        i3 = i4;
                        if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x62.m56895kk())) {
                        }
                        fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                        i5 = i;
                        i4 = i3;
                        z2 = z4;
                        z3 = z5;
                        c12025x6ArrM72659kk = c12025x6Arr;
                        c13743kqM69833e0 = c13743kq;
                    } else {
                        i3 = i4;
                    }
                    if (z7) {
                        c14787xi.m73393k4(fM56897x1, fOooO0O0, fM56897x1 + fM4453k4, fOooO0O0);
                    }
                    if (z5) {
                        c14787xi.m73393k4(fM56897x1 - fM4453k4, fOooO0O0, fM56897x1, fOooO0O0);
                    }
                    fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                    i5 = i;
                    i4 = i3;
                    z2 = z4;
                    z3 = z5;
                    c12025x6ArrM72659kk = c12025x6Arr;
                    c13743kqM69833e0 = c13743kq;
                }
                if (c14787xi.m73406lr() * fM56895kk > c12025x62.m56895kk() - c12025x6.m56895kk()) {
                    float fOooO0O02 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM56895kk2);
                    if ((c12025x6.m56895kk() > fOooO0O02 || fOooO0O02 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fOooO0O02 || fOooO0O02 < c12025x62.m56895kk())) {
                        double d4 = fOooO0O02;
                        z6 = z3;
                        if (C14116yg.m67497to(d4) == C14116yg.m67497to(c12025x6.m56895kk()) || C14116yg.m67497to(d4) == C14116yg.m67497to(c12025x62.m56895kk())) {
                        }
                    } else {
                        z6 = z3;
                    }
                    if (z7) {
                        c14787xi.m73393k4(fM56897x1, fOooO0O02, fM56897x1 + fM4453k4, fOooO0O02);
                    }
                    if (z6) {
                        c14787xi.m73393k4(fM56897x1 - fM4453k4, fOooO0O02, fM56897x1, fOooO0O02);
                    }
                }
                if (i4 > 0) {
                    return;
                }
                C12025x6 c12025x63 = c12025x6Arr[i];
                c12025x63.m56891k4(c12025x63.m56897x1() + i4);
                c12025x6ArrM72659kk = c12025x6Arr;
                c13743kqM69833e0 = c13743kq;
            } else {
                z = true;
            }
            z2 = z;
            minorTickMark = c14787xi.m73384dy().getMinorTickMark();
            if (minorTickMark != 0) {
            }
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
            }
            fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / i2;
            float fM56897x12 = c12025x6.m56897x1();
            fM56895kk2 = c12025x6.m56895kk();
            float fM4453k42 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            while (true) {
                i = i5;
                if (c12025x6.m56895kk() <= fM56895kk2) {
                    z4 = z2;
                    d = fM56895kk2;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    c13743kq = c13743kqM69833e0;
                    if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                    z5 = z3;
                } else {
                    z4 = z2;
                    d = fM56895kk2;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    c13743kq = c13743kqM69833e0;
                    if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                    z5 = z3;
                }
                if (c12025x6.m56895kk() <= fM56895kk2) {
                    d2 = fM56895kk2;
                    if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk())) {
                        if (z) {
                        }
                        if (z4) {
                        }
                    }
                } else {
                    d2 = fM56895kk2;
                    if (C14116yg.m67497to(d2) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                }
                fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, fM56895kk2);
                if (c12025x6.m56895kk() <= fOooO0O0) {
                    d3 = fOooO0O0;
                    i3 = i4;
                    if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk())) {
                        if (z7) {
                        }
                        if (z5) {
                        }
                    } else {
                        if (z7) {
                        }
                        if (z5) {
                        }
                    }
                } else {
                    d3 = fOooO0O0;
                    i3 = i4;
                    if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                }
                fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                i5 = i;
                i4 = i3;
                z2 = z4;
                z3 = z5;
                c12025x6ArrM72659kk = c12025x6Arr;
                c13743kqM69833e0 = c13743kq;
            }
            if (c14787xi.m73406lr() * fM56895kk > c12025x62.m56895kk() - c12025x6.m56895kk()) {
            }
            if (i4 > 0) {
            }
        }
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
        if (obj instanceof C14409rq) {
            return m70258x1((C14409rq) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205 A[LOOP:0: B:10:0x0039->B:71:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0225 A[SYNTHETIC] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70255x1(int i, C14787xi c14787xi) {
        boolean z;
        boolean z2;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        boolean z3;
        float fM56895kk;
        float fM56895kk2;
        float fM4453k4;
        float f;
        double d;
        C12025x6[] c12025x6Arr;
        C13743kq c13743kq;
        char c;
        int minorTickMark;
        int i2;
        int i3;
        float fM56895kk3;
        C12025x6[] c12025x6Arr2;
        C13743kq c13743kq2;
        double d2;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        C13743kq c13743kqM69833e0 = c14365qyM73423wy.m69833e0();
        if ((c14787xi.m73384dy().getMajorTickMark() == 2 && c14787xi.m73384dy().getMinorTickMark() == 2) || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qyM73423wy);
        new C12025x6();
        new C12025x6();
        while (true) {
            int i4 = i;
            int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
            char c2 = 3;
            boolean z4 = true;
            if (majorTickMark != 0) {
                if (majorTickMark == 1) {
                    z = true;
                    z2 = false;
                } else if (majorTickMark != 3) {
                    z = false;
                } else {
                    z2 = true;
                    z = false;
                }
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    c12025x6 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk());
                    c12025x62 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c13743kqM69833e0.m64100du());
                } else {
                    c12025x6 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c13743kqM69833e0.m64100du());
                    c12025x62 = new C12025x6(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk());
                }
                i = 0;
                z3 = z2;
                fM56895kk = (float) (((double) (c12025x62.m56895kk() - c12025x6.m56895kk())) / ((c14787xi.m73419up() == 0 || c14787xi.m73384dy().getCategoryAxisType() != 1) ? c14787xi.m73389ix() - c14787xi.m73410ne() : ((double) C0841c4.m4455k4(c14787xi.m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false)) + 1.0d));
                float fM56897x1 = c12025x6.m56897x1();
                fM56895kk2 = c12025x6.m56895kk();
                fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                while (true) {
                    if ((c12025x6.m56895kk() <= fM56895kk2 || fM56895kk2 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM56895kk2 || fM56895kk2 < c12025x62.m56895kk())) {
                        f = fM4453k4;
                        d = fM56895kk2;
                        if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56895kk())) {
                            break;
                        }
                        c12025x6Arr = c12025x6ArrM72659kk;
                        c13743kq = c13743kqM69833e0;
                        c = 3;
                    } else {
                        c = c2;
                        c12025x6Arr = c12025x6ArrM72659kk;
                        c13743kq = c13743kqM69833e0;
                        f = fM4453k4;
                    }
                    if (z) {
                        c14787xi.m73393k4(fM56897x1, fM56895kk2, fM56897x1 + f, fM56895kk2);
                    }
                    if (!z3) {
                        c14787xi.m73393k4(fM56897x1 - f, fM56895kk2, fM56897x1, fM56895kk2);
                    }
                    fM56895kk2 += C0841c4.m4455k4(r11, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56895kk;
                    i = 0;
                    c2 = c;
                    fM4453k4 = f;
                    c13743kqM69833e0 = c13743kq;
                    c12025x6ArrM72659kk = c12025x6Arr;
                    z4 = true;
                }
                minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark == 0) {
                    if (minorTickMark != 1) {
                        i2 = i;
                        if (minorTickMark == 3) {
                            i3 = 1;
                        }
                    } else {
                        i3 = i;
                        i2 = 1;
                    }
                    float fM56897x12 = c12025x6.m56897x1();
                    fM56895kk3 = c12025x6.m56895kk();
                    float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
                    while (true) {
                        if ((c12025x6.m56895kk() > fM56895kk3 || fM56895kk3 > c12025x62.m56895kk()) && (c12025x6.m56895kk() < fM56895kk3 || fM56895kk3 < c12025x62.m56895kk())) {
                            c12025x6Arr2 = c12025x6ArrM72659kk;
                            c13743kq2 = c13743kqM69833e0;
                            d2 = fM56895kk3;
                            if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x62.m56895kk())) {
                                break;
                            }
                        } else {
                            c12025x6Arr2 = c12025x6ArrM72659kk;
                            c13743kq2 = c13743kqM69833e0;
                        }
                        if (i2 != 0) {
                            c14787xi.m73393k4(fM56897x12, fM56895kk3, fM56897x12 + fM4486x1, fM56895kk3);
                        }
                        if (i3 != 0) {
                            c14787xi.m73393k4(fM56897x12 - fM4486x1, fM56895kk3, fM56897x12, fM56895kk3);
                        }
                        boolean z5 = i;
                        fM56895kk3 += C0841c4.m4455k4(r11, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), z5), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), z5) * fM56895kk;
                        c13743kqM69833e0 = c13743kq2;
                        c12025x6ArrM72659kk = c12025x6Arr2;
                        i = 0;
                    }
                    if (i4 <= 0) {
                        return;
                    }
                    C12025x6 c12025x63 = c12025x6Arr2[i];
                    c12025x63.m56891k4(c12025x63.m56897x1() + i4);
                    c13743kqM69833e0 = c13743kq2;
                    c12025x6ArrM72659kk = c12025x6Arr2;
                } else {
                    i2 = 1;
                }
                i3 = i2;
                float fM56897x122 = c12025x6.m56897x1();
                fM56895kk3 = c12025x6.m56895kk();
                float fM4486x12 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
                while (true) {
                    if (c12025x6.m56895kk() > fM56895kk3) {
                        c12025x6Arr2 = c12025x6ArrM72659kk;
                        c13743kq2 = c13743kqM69833e0;
                        d2 = fM56895kk3;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk())) {
                            break;
                            break;
                        }
                    } else {
                        c12025x6Arr2 = c12025x6ArrM72659kk;
                        c13743kq2 = c13743kqM69833e0;
                        d2 = fM56895kk3;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk())) {
                        }
                    }
                    if (i2 != 0) {
                    }
                    if (i3 != 0) {
                    }
                    boolean z52 = i;
                    fM56895kk3 += C0841c4.m4455k4(r11, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), z52), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), z52) * fM56895kk;
                    c13743kqM69833e0 = c13743kq2;
                    c12025x6ArrM72659kk = c12025x6Arr2;
                    i = 0;
                }
                if (i4 <= 0) {
                }
            } else {
                z = true;
            }
            z2 = z;
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
            }
            if (c14787xi.m73419up() == 0) {
            }
            i = 0;
            z3 = z2;
            fM56895kk = (float) (((double) (c12025x62.m56895kk() - c12025x6.m56895kk())) / ((c14787xi.m73419up() == 0 || c14787xi.m73384dy().getCategoryAxisType() != 1) ? c14787xi.m73389ix() - c14787xi.m73410ne() : ((double) C0841c4.m4455k4(c14787xi.m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false)) + 1.0d));
            float fM56897x13 = c12025x6.m56897x1();
            fM56895kk2 = c12025x6.m56895kk();
            fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            while (true) {
                if (c12025x6.m56895kk() <= fM56895kk2) {
                    f = fM4453k4;
                    d = fM56895kk2;
                    if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                    c12025x6Arr = c12025x6ArrM72659kk;
                    c13743kq = c13743kqM69833e0;
                    c = 3;
                } else {
                    f = fM4453k4;
                    d = fM56895kk2;
                    if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                    c12025x6Arr = c12025x6ArrM72659kk;
                    c13743kq = c13743kqM69833e0;
                    c = 3;
                }
                if (z) {
                }
                if (!z3) {
                }
                fM56895kk2 += C0841c4.m4455k4(r11, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56895kk;
                i = 0;
                c2 = c;
                fM4453k4 = f;
                c13743kqM69833e0 = c13743kq;
                c12025x6ArrM72659kk = c12025x6Arr;
                z4 = true;
            }
            minorTickMark = c14787xi.m73384dy().getMinorTickMark();
            if (minorTickMark == 0) {
            }
            i3 = i2;
            float fM56897x1222 = c12025x6.m56897x1();
            fM56895kk3 = c12025x6.m56895kk();
            float fM4486x122 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
            while (true) {
                if (c12025x6.m56895kk() > fM56895kk3) {
                }
                if (i2 != 0) {
                }
                if (i3 != 0) {
                }
                boolean z522 = i;
                fM56895kk3 += C0841c4.m4455k4(r11, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), z522), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), z522) * fM56895kk;
                c13743kqM69833e0 = c13743kq2;
                c12025x6ArrM72659kk = c12025x6Arr2;
                i = 0;
            }
            if (i4 <= 0) {
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14409rq Clone() {
        C14409rq c14409rq = new C14409rq();
        CloneTo(c14409rq);
        return c14409rq;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70244k4(float f, float f2, float f3, C14787xi c14787xi) {
        boolean z;
        float f4;
        if (c14787xi.m73384dy().getMinorTickMark() == 2 || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        int minorTickMark = c14787xi.m73384dy().getMinorTickMark();
        boolean z2 = true;
        if (minorTickMark != 0) {
            z = false;
            if (minorTickMark != 1) {
                if (minorTickMark != 3) {
                    z2 = false;
                } else if (f <= c14365qyM73423wy.m69833e0().m64106h4()) {
                    z = true;
                    z2 = false;
                }
            } else if (f > c14365qyM73423wy.m69833e0().m64106h4()) {
            }
        } else {
            z = true;
        }
        float fM73374ar = (float) ((c14787xi.m73374ar() / (c14787xi.m73389ix() - c14787xi.m73410ne())) * ((double) (f3 - f2)));
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
            f4 = f2;
        } else {
            fM73374ar = -fM73374ar;
            f4 = f3;
        }
        float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
        do {
            if (z2) {
                c14787xi.m73393k4(f, f4, f + fM4486x1, f4);
            }
            if (z) {
                c14787xi.m73393k4(f - fM4486x1, f4, f, f4);
            }
            f4 += fM73374ar;
            if (f2 > f4) {
                return;
            }
        } while (f4 <= f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de A[SYNTHETIC] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70256x1(C14787xi c14787xi) {
        C12025x6 c12025x6;
        boolean z;
        boolean z2;
        boolean z3;
        float fM56897x1;
        double d;
        if (!c14787xi.m73384dy().isVisible()) {
            return;
        }
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14787xi.m73423wy());
        C12025x6 c12025x62 = new C12025x6();
        C12025x6 c12025x63 = new C12025x6();
        if (c14787xi.m73384dy().isPlotOrderReversed()) {
            c12025x6ArrM72659kk[1].CloneTo(c12025x62);
            c12025x6 = c12025x6ArrM72659kk[0];
        } else {
            c12025x6ArrM72659kk[0].CloneTo(c12025x62);
            c12025x6 = c12025x6ArrM72659kk[1];
        }
        c12025x6.CloneTo(c12025x63);
        float fM56897x12 = (float) (((double) (c12025x63.m56897x1() - c12025x62.m56897x1())) / (c14787xi.m73389ix() - c14787xi.m73410ne()));
        if (c14787xi.m73384dy().getMajorTickMark() != 2) {
            int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
            if (majorTickMark != 0) {
                if (majorTickMark == 1) {
                    z3 = false;
                    z2 = true;
                } else if (majorTickMark != 3) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
                fM56897x1 = c12025x62.m56897x1();
                float fM56895kk = c12025x62.m56895kk();
                float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
                while (true) {
                    if ((c12025x62.m56897x1() <= fM56897x1 || fM56897x1 > c12025x63.m56897x1()) && (c12025x62.m56897x1() < fM56897x1 || fM56897x1 < c12025x63.m56897x1())) {
                        d = fM56897x1;
                        if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56897x1()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x63.m56897x1())) {
                            break;
                        }
                    }
                    if (z2) {
                        c14787xi.m73393k4(fM56897x1, fM56895kk - fM4453k4, fM56897x1, fM56895kk);
                    }
                    if (!z3) {
                        c14787xi.m73393k4(fM56897x1, fM56895kk, fM56897x1, fM56895kk + fM4453k4);
                    }
                    fM56897x1 += ((float) c14787xi.m73418um()) * fM56897x12;
                }
            } else {
                z2 = true;
            }
            z3 = z2;
            fM56897x1 = c12025x62.m56897x1();
            float fM56895kk2 = c12025x62.m56895kk();
            float fM4453k42 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
            while (true) {
                if (c12025x62.m56897x1() <= fM56897x1) {
                }
                d = fM56897x1;
                if (C14116yg.m67497to(d) != C14116yg.m67497to(c12025x62.m56897x1())) {
                    break;
                    break;
                }
                if (z2) {
                }
                if (!z3) {
                }
                fM56897x1 += ((float) c14787xi.m73418um()) * fM56897x12;
            }
        }
        if (c14787xi.m73384dy().getMinorTickMark() == 2) {
            return;
        }
        int minorTickMark = c14787xi.m73384dy().getMinorTickMark();
        boolean z4 = true;
        if (minorTickMark == 0) {
            z = true;
        } else if (minorTickMark == 1) {
            z = false;
        } else if (minorTickMark != 3) {
            z4 = false;
            z = false;
        } else {
            z = true;
            z4 = false;
        }
        float fM56897x13 = c12025x62.m56897x1();
        float fM56895kk3 = c12025x62.m56895kk();
        float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
        while (true) {
            if ((c12025x62.m56897x1() > fM56897x13 || fM56897x13 > c12025x63.m56897x1()) && (c12025x62.m56897x1() < fM56897x13 || fM56897x13 < c12025x63.m56897x1())) {
                double d2 = fM56897x13;
                if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x62.m56897x1()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x63.m56897x1())) {
                    return;
                }
            }
            if (z4) {
                c14787xi.m73393k4(fM56897x13, fM56895kk3 - fM4486x1, fM56897x13, fM56895kk3);
            }
            if (z) {
                c14787xi.m73393k4(fM56897x13, fM56895kk3, fM56897x13, fM56895kk3 + fM4486x1);
            }
            fM56897x13 += ((float) c14787xi.m73374ar()) * fM56897x12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70245k4(float f, float f2, C14787xi c14787xi) {
        boolean z;
        if (c14787xi.m73384dy().getMajorTickMark() == 2 || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
        boolean z2 = true;
        if (majorTickMark != 0) {
            z = false;
            if (majorTickMark != 1) {
                if (majorTickMark != 3) {
                    z2 = false;
                } else if (f <= c14365qyM73423wy.m69833e0().m64106h4()) {
                    z = true;
                    z2 = false;
                }
            } else if (f > c14365qyM73423wy.m69833e0().m64106h4()) {
            }
        } else {
            z = true;
        }
        float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        if (z2) {
            c14787xi.m73393k4(f, f2, f + fM4453k4, f2);
        }
        if (z) {
            c14787xi.m73393k4(f - fM4453k4, f2, f, f2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m70257x1(C14787xi c14787xi, C14365qy c14365qy) {
        int i;
        char c;
        float fM56897x1;
        float f;
        float fM56895kk;
        float f2;
        float fM56897x12;
        float f3;
        float fM56895kk2;
        float f4;
        float fM56551ck;
        float fM67480k4;
        float fM56897x13;
        float f5;
        float fM56897x14;
        float fM56895kk3;
        float f6;
        float fM56897x15;
        float fM56895kk4;
        float f7;
        float fM56897x16;
        float f8;
        C12025x6[] c12025x6ArrM72660to = C14728w8.m72660to(c14365qy);
        double dM73432yj = c14365qy.m69863u4().m73432yj();
        double dM73405ks = c14365qy.m69863u4().m73405ks();
        double dM73412rv = c14365qy.m69863u4().m73412rv();
        int i2 = 1;
        char c2 = 0;
        boolean z = c14365qy.m69863u4().m73410ne() == ((double) c14365qy.m69863u4().m73430x6());
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? dM73432yj - dM73412rv : dM73412rv - dM73405ks) / (dM73432yj - dM73405ks), c14365qy.m69833e0().m64100du(), 14);
        if (iOooO00o != 0) {
            float f9 = iOooO00o;
            c14787xi.m73393k4(c12025x6ArrM72660to[0].m56897x1(), c12025x6ArrM72660to[0].m56895kk() - f9, c12025x6ArrM72660to[1].m56897x1(), c12025x6ArrM72660to[1].m56895kk() - f9);
        }
        if (c14365qy.m69829dq() >= 0) {
            c14787xi.m73393k4(c12025x6ArrM72660to[0].m56897x1(), c12025x6ArrM72660to[0].m56895kk(), c12025x6ArrM72660to[1].m56897x1(), c12025x6ArrM72660to[1].m56895kk());
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            C12025x6 c12025x6 = c12025x6ArrM72660to[0];
            float f10 = iOooO00o;
            c12025x6.m56898x1(c12025x6.m56895kk() - f10);
            C12025x6 c12025x62 = c12025x6ArrM72660to[1];
            c12025x62.m56898x1(c12025x62.m56895kk() - f10);
        }
        float fM73390jd = c14787xi.m73390jd();
        double dM67471fa = c12025x6ArrM72660to[1].m56897x1() == c12025x6ArrM72660to[0].m56897x1() ? 1.5707963267948966d : C14116yg.m67471fa(C14116yg.m67480k4((c12025x6ArrM72660to[0].m56895kk() - c12025x6ArrM72660to[1].m56895kk()) / (c12025x6ArrM72660to[1].m56897x1() - c12025x6ArrM72660to[0].m56897x1())));
        float fM56897x17 = (c12025x6ArrM72660to[1].m56897x1() - c12025x6ArrM72660to[0].m56897x1()) / c14787xi.f50098m9.size();
        float fM56895kk5 = (c12025x6ArrM72660to[1].m56895kk() - c12025x6ArrM72660to[0].m56895kk()) / c14787xi.f50098m9.size();
        int i3 = 0;
        while (i3 < c14787xi.f50098m9.size()) {
            int iOooO00o2 = c14787xi.m73384dy().isPlotOrderReversed() ? C20856OooooOo.OooO00o(i2, i3, c14787xi.f50098m9) : i3;
            String strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(iOooO00o2), c14787xi);
            if (c14787xi.m73384dy().getTickLabelPosition() == 3 || iOooO00o2 % c14787xi.m73376bv() != 0) {
                i = i2;
                c = c2;
            } else {
                C12007ix c12007ix = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
                if (c14365qy.m69829dq() >= 0) {
                    if (c12025x6ArrM72660to[c2].m56895kk() == c12025x6ArrM72660to[i2].m56895kk()) {
                        if (fM56897x17 < 0.0f) {
                            fM56897x16 = c12025x6ArrM72660to[c2].m56897x1();
                            f8 = i3 + 1;
                        } else {
                            fM56897x16 = c12025x6ArrM72660to[c2].m56897x1();
                            f8 = i3;
                        }
                        c12007ix.m56566kk((f8 * fM56897x17) + fM56897x16);
                        c12007ix.m56572to(c12025x6ArrM72660to[c2].m56895kk() + fM73390jd);
                        c12007ix.m56576x1(C14116yg.m67480k4(fM56897x17));
                        c12007ix.m56560k4(c14787xi.f50110x1);
                        i = i2;
                    } else if (dM67471fa <= 0.7853981633974483d) {
                        if (fM56897x17 < 0.0f) {
                            i = i2;
                            fM56897x15 = ((i3 + 1) * fM56897x17) + c12025x6ArrM72660to[c2].m56897x1();
                        } else {
                            i = i2;
                            fM56897x15 = c12025x6ArrM72660to[c2].m56897x1() + (i3 * fM56897x17);
                        }
                        c12007ix.m56566kk(fM56897x15);
                        if (fM56895kk5 > 0.0f) {
                            fM56895kk4 = c12025x6ArrM72660to[c2].m56895kk();
                            f7 = i3 + 1;
                        } else {
                            fM56895kk4 = c12025x6ArrM72660to[c2].m56895kk();
                            f7 = i3;
                        }
                        c12007ix.m56572to((f7 * fM56895kk5) + fM56895kk4);
                        c12007ix.m56576x1(C14116yg.m67480k4(fM56897x17));
                        c12007ix.m56560k4(c14787xi.f50110x1);
                    } else {
                        i = i2;
                        if (fM56895kk5 > 0.0f) {
                            c = c2;
                            fM56897x14 = (i3 * fM56897x17) + c12025x6ArrM72660to[c2].m56897x1();
                        } else {
                            c = c2;
                            fM56897x14 = c12025x6ArrM72660to[c].m56897x1() + ((i3 + 1) * fM56897x17);
                        }
                        c12007ix.m56566kk(fM56897x14);
                        c12007ix.m56566kk(fM56897x17 * fM56895kk5 <= 0.0f ? (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd) + c12007ix.m56557jd() : (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd)) - c14787xi.f50094k4);
                        if (fM56895kk5 > 0.0f) {
                            fM56895kk3 = c12025x6ArrM72660to[c].m56895kk();
                            f6 = i3;
                        } else {
                            fM56895kk3 = c12025x6ArrM72660to[c].m56895kk();
                            f6 = i3 + 1;
                        }
                        c12007ix.m56572to((f6 * fM56895kk5) + fM56895kk3);
                        c12007ix.m56572to((((C14116yg.m67480k4(fM56895kk5) - c14787xi.f50110x1) * ((float) C14116yg.m67495m9(dM67471fa))) / 2.0f) + c12007ix.m56551ck());
                        fM67480k4 = c14787xi.f50094k4;
                        c12007ix.m56576x1(fM67480k4);
                        c12007ix.m56560k4(c14787xi.f50110x1);
                    }
                    c = c2;
                } else {
                    i = i2;
                    c = c2;
                    if (c14365qy.m69829dq() < 0 && !z && c14787xi.m73384dy().getTickLabelPosition() == 2) {
                        if (c12025x6ArrM72660to[c].m56895kk() == c12025x6ArrM72660to[i].m56895kk()) {
                            if (fM56897x17 > 0.0f) {
                                fM56897x13 = c12025x6ArrM72660to[c].m56897x1();
                                f5 = i3;
                            } else {
                                fM56897x13 = c12025x6ArrM72660to[c].m56897x1();
                                f5 = i3 + 1;
                            }
                            c12007ix.m56566kk((f5 * fM56897x17) + fM56897x13);
                            fM56551ck = (c12025x6ArrM72660to[c].m56895kk() - c14787xi.f50110x1) - fM73390jd;
                        } else if (dM67471fa <= 0.7853981633974483d) {
                            if (fM56897x17 < 0.0f) {
                                fM56897x12 = c12025x6ArrM72660to[c].m56897x1();
                                f3 = i3 + 1;
                            } else {
                                fM56897x12 = c12025x6ArrM72660to[c].m56897x1();
                                f3 = i3;
                            }
                            c12007ix.m56566kk((f3 * fM56897x17) + fM56897x12);
                            if (fM56895kk5 < 0.0f) {
                                fM56895kk2 = c12025x6ArrM72660to[c].m56895kk();
                                f4 = i3 + 1;
                            } else {
                                fM56895kk2 = c12025x6ArrM72660to[c].m56895kk();
                                f4 = i3;
                            }
                            c12007ix.m56572to((f4 * fM56895kk5) + fM56895kk2);
                            fM56551ck = c12007ix.m56551ck() - c14787xi.f50110x1;
                        } else {
                            if (fM56895kk5 < 0.0f) {
                                fM56897x1 = c12025x6ArrM72660to[c].m56897x1();
                                f = i3;
                            } else {
                                fM56897x1 = c12025x6ArrM72660to[c].m56897x1();
                                f = i3 + 1;
                            }
                            c12007ix.m56566kk((f * fM56897x17) + fM56897x1);
                            c12007ix.m56566kk(fM56897x17 * fM56895kk5 >= 0.0f ? (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd) + c12007ix.m56557jd() : (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * fM73390jd)) - c14787xi.f50094k4);
                            if (fM56895kk5 < 0.0f) {
                                fM56895kk = c12025x6ArrM72660to[c].m56895kk();
                                f2 = i3;
                            } else {
                                fM56895kk = c12025x6ArrM72660to[c].m56895kk();
                                f2 = i3 + 1;
                            }
                            c12007ix.m56572to((f2 * fM56895kk5) + fM56895kk);
                            c12007ix.m56572to(c12007ix.m56551ck() - (((C14116yg.m67480k4(fM56895kk5) - c14787xi.f50110x1) * ((float) C14116yg.m67495m9(dM67471fa))) / 2.0f));
                            c12007ix.m56572to(c12007ix.m56551ck() - c14787xi.f50110x1);
                            fM67480k4 = c14787xi.f50094k4;
                            c12007ix.m56576x1(fM67480k4);
                            c12007ix.m56560k4(c14787xi.f50110x1);
                        }
                        c12007ix.m56572to(fM56551ck);
                        fM67480k4 = C14116yg.m67480k4(fM56897x17);
                        c12007ix.m56576x1(fM67480k4);
                        c12007ix.m56560k4(c14787xi.f50110x1);
                    }
                }
                c12007ix.m56576x1(c14787xi.f50094k4);
                c12007ix.m56560k4(c14787xi.f50110x1);
                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(c12007ix.Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c14787xi.m73413to().Clone(), 1, 2, c14365qy);
            }
            i3++;
            i2 = i;
            c2 = c;
        }
        m70246k4(iOooO00o, c14787xi.f50098m9.size(), c14787xi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0371, code lost:
    
        if (r25.m69877xk() >= 270) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x038c, code lost:
    
        if (r25.m69877xk() >= 270) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x046b, code lost:
    
        if (r25.m69877xk() >= 270) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x048d, code lost:
    
        if (r25.m69877xk() >= 270) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d3, code lost:
    
        if (r25.m69829dq() >= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d9, code lost:
    
        r3 = r16;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e1, code lost:
    
        if (r25.m69829dq() >= 0) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /* JADX WARN: Type inference failed for: r14v13, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v81, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v82, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.aspose.slides.xi] */
    /* JADX WARN: Type inference failed for: r3v13, types: [float] */
    /* JADX WARN: Type inference failed for: r3v14, types: [float] */
    /* JADX WARN: Type inference failed for: r3v16, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r3v17, types: [float] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r4v11, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r4v12, types: [float] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v5, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [float] */
    /* JADX WARN: Type inference failed for: r4v9, types: [float] */
    /* JADX WARN: Type inference failed for: r5v12, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v38, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [float] */
    /* JADX WARN: Type inference failed for: r7v22, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r8v18, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21, types: [float] */
    /* JADX WARN: Type inference failed for: r8v22, types: [float] */
    /* JADX WARN: Type inference failed for: r8v26, types: [float] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70246k4(int i, int i2, C14787xi c14787xi) {
        boolean z;
        C12025x6[] c12025x6ArrM72659kk;
        int i3;
        C14365qy c14365qy;
        float f;
        C12025x6[] c12025x6Arr;
        int i4;
        int i5;
        C12025x6 c12025x6;
        float fM56897x1;
        float fM56895kk;
        float fM56897x12;
        float fM56895kk2;
        double d;
        int i6;
        float f2;
        char c;
        char c2;
        int minorTickMark;
        int i7;
        int i8;
        ?? OooO0O02;
        ?? OooO0O03;
        double d2;
        int i9;
        int i10;
        C12025x6 c12025x62;
        float fM56897x13;
        float fM56895kk3;
        float fM56897x14;
        float fM56895kk4;
        int i11;
        double d3;
        float f3;
        C12025x6[] c12025x6Arr2;
        int minorTickMark2;
        int i12;
        int i13;
        ?? OooO0O04;
        ?? M73406lr;
        int i14;
        int i15;
        float f4;
        C12025x6[] c12025x6Arr3;
        int i16 = i;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if ((c14787xi.m73384dy().getMajorTickMark() == 2 && c14787xi.m73384dy().getMinorTickMark() == 2) || !c14787xi.m73384dy().isVisible()) {
            return;
        }
        float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        float fM4486x1 = C0841c4.m4486x1(c14787xi.m73400kk().m56639dy());
        int i17 = 0;
        int i18 = 1;
        boolean z2 = c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable();
        if (c14787xi.m73419up() == 4) {
            c12025x6ArrM72659kk = C14728w8.m72660to(c14365qyM73423wy);
            z = true;
        } else {
            z = z2;
            c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qyM73423wy);
        }
        double dM67471fa = c12025x6ArrM72659kk[1].m56897x1() == c12025x6ArrM72659kk[0].m56897x1() ? 1.5707963267948966d : C14116yg.m67471fa(C14116yg.m67480k4((c12025x6ArrM72659kk[0].m56895kk() - c12025x6ArrM72659kk[1].m56895kk()) / (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1())));
        if (z) {
            i3 = i2;
        } else {
            i3 = i2 - 1;
            if (i3 == 0) {
                i3 = 1;
            }
        }
        if (c14365qyM73423wy.m69829dq() < 0 && i16 > 0) {
            C12025x6 c12025x63 = c12025x6ArrM72659kk[0];
            float f5 = i16;
            c12025x63.m56898x1(c12025x63.m56895kk() - f5);
            C12025x6 c12025x64 = c12025x6ArrM72659kk[1];
            c12025x64.m56898x1(c12025x64.m56895kk() - f5);
            i16 = 0;
        }
        while (true) {
            C12025x6 c12025x65 = new C12025x6();
            C12025x6 c12025x66 = new C12025x6();
            int i19 = i17;
            if (dM67471fa <= 0.7853981633974483d) {
                int majorTickMark = c14787xi.m73384dy().getMajorTickMark();
                if (majorTickMark != 0) {
                    if (majorTickMark != i18) {
                        if (majorTickMark != 3) {
                            i9 = i19;
                        } else if (c14365qyM73423wy.m69829dq() >= 0) {
                            i10 = i18;
                            i9 = i19;
                        } else {
                            i9 = i18;
                            i10 = i19;
                        }
                    } else if (c14365qyM73423wy.m69829dq() >= 0) {
                    }
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        c12025x6ArrM72659kk[i19].CloneTo(c12025x65);
                        c12025x62 = c12025x6ArrM72659kk[i18];
                    } else {
                        c12025x6ArrM72659kk[i18].CloneTo(c12025x65);
                        c12025x62 = c12025x6ArrM72659kk[i19];
                    }
                    c12025x62.CloneTo(c12025x66);
                    float f6 = i3;
                    fM56897x13 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f6;
                    fM56895kk3 = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f6;
                    if (fM56897x13 != 0.0f && fM56895kk3 == 0.0f) {
                        return;
                    }
                    fM56897x14 = c12025x65.m56897x1();
                    fM56895kk4 = c12025x65.m56895kk();
                    while (true) {
                        if ((c12025x65.m56897x1() <= fM56897x14 || fM56897x14 > c12025x66.m56897x1()) && (c12025x65.m56897x1() < fM56897x14 || fM56897x14 < c12025x66.m56897x1())) {
                            i11 = i3;
                            d3 = fM56897x14;
                            c14365qy = c14365qyM73423wy;
                            f = fM4453k4;
                            if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x65.m56897x1()) && C14116yg.m67497to(d3) != C14116yg.m67497to(c12025x66.m56897x1())) {
                                break;
                            }
                            f3 = fM4486x1;
                            c12025x6Arr2 = c12025x6ArrM72659kk;
                        } else {
                            c14365qy = c14365qyM73423wy;
                            f = fM4453k4;
                            f3 = fM4486x1;
                            c12025x6Arr2 = c12025x6ArrM72659kk;
                            i11 = i3;
                        }
                        float f7 = fM56895kk4;
                        if (i9 != 0) {
                            c14787xi.m73393k4(fM56897x14, f7 - f, fM56897x14, f7);
                        }
                        if (i10 == 0) {
                            c14787xi.m73393k4(fM56897x14, f7, fM56897x14, f7 + f);
                        }
                        fM56897x14 += c14787xi.m73406lr() * fM56897x13;
                        fM56895kk4 = (c14787xi.m73406lr() * fM56895kk3) + f7;
                        fM4486x1 = f3;
                        i3 = i11;
                        c12025x6ArrM72659kk = c12025x6Arr2;
                        c14365qyM73423wy = c14365qy;
                        fM4453k4 = f;
                    }
                    minorTickMark2 = c14787xi.m73384dy().getMinorTickMark();
                    if (minorTickMark2 != 0) {
                        i12 = 1;
                    } else if (minorTickMark2 != 1) {
                        if (minorTickMark2 != 3) {
                            i12 = i19;
                            i13 = i12;
                            c12025x65.m56897x1();
                            StringBuffer stringBufferAppend = StringBuffer.append((String) c14787xi.m73406lr());
                            c12025x65.m56895kk();
                            M73406lr = stringBufferAppend;
                            OooO0O04 = StringBuffer.append((String) c14787xi.m73406lr());
                            while (true) {
                                if (c12025x65.m56897x1() <= (M73406lr == true ? 1.0f : 0.0f)) {
                                    if ((M73406lr == true ? 1.0f : 0.0f) > c12025x66.m56897x1()) {
                                        if (c12025x65.m56897x1() >= (M73406lr == true ? 1.0f : 0.0f)) {
                                            if ((M73406lr == true ? 1.0f : 0.0f) >= c12025x66.m56897x1()) {
                                                i14 = i12;
                                                i15 = i13;
                                            }
                                        }
                                        i14 = i12;
                                        i15 = i13;
                                        double d4 = M73406lr == true ? 1.0d : 0.0d;
                                        if (C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x65.m56897x1()) && C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x66.m56897x1())) {
                                            break;
                                        }
                                    }
                                }
                                if (i14 != 0) {
                                    c14787xi.m73393k4(M73406lr == true ? 1.0f : 0.0f, OooO0O04 - fM4486x1, M73406lr == true ? 1.0f : 0.0f, OooO0O04);
                                }
                                if (i15 != 0) {
                                    c14787xi.m73393k4(M73406lr == true ? 1.0f : 0.0f, OooO0O04, M73406lr == true ? 1.0f : 0.0f, OooO0O04 + fM4486x1);
                                }
                                if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                                    ?? Append = StringBuffer.append((String) c14787xi.m73406lr());
                                    ?? Append2 = StringBuffer.append((String) c14787xi.m73406lr());
                                    if ((c12025x65.m56895kk() > Append2 || Append2 > c12025x66.m56895kk()) && (c12025x65.m56895kk() < Append2 || Append2 < c12025x66.m56895kk())) {
                                        f4 = fM4486x1;
                                        c12025x6Arr3 = c12025x6ArrM72659kk;
                                        double d5 = (double) Append2;
                                        if (C14116yg.m67497to(d5) == C14116yg.m67497to(c12025x65.m56895kk()) || C14116yg.m67497to(d5) == C14116yg.m67497to(c12025x66.m56895kk())) {
                                        }
                                        float fOooO0O0 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56897x13, 2.0f, Append);
                                        OooO0O04 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk3, 2.0f, Append2);
                                        M73406lr = fOooO0O0;
                                    } else {
                                        f4 = fM4486x1;
                                        c12025x6Arr3 = c12025x6ArrM72659kk;
                                    }
                                    if (i14 != 0) {
                                        c14787xi.m73393k4(Append, Append2 - f4, Append, Append2);
                                    }
                                    if (i15 != 0) {
                                        c14787xi.m73393k4(Append, Append2, Append, Append2 + f4);
                                    }
                                    float fOooO0O02 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56897x13, 2.0f, Append);
                                    OooO0O04 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk3, 2.0f, Append2);
                                    M73406lr = fOooO0O02;
                                } else {
                                    f4 = fM4486x1;
                                    c12025x6Arr3 = c12025x6ArrM72659kk;
                                }
                                i12 = i14;
                                fM4486x1 = f4;
                                i13 = i15;
                                c12025x6ArrM72659kk = c12025x6Arr3;
                                M73406lr += c14787xi.m73406lr() * fM56897x13;
                                OooO0O04 += c14787xi.m73406lr() * fM56895kk3;
                            }
                            f2 = fM4486x1;
                            c12025x6Arr = c12025x6ArrM72659kk;
                            i3 = i11;
                        }
                    }
                    i13 = 1;
                    c12025x65.m56897x1();
                    StringBuffer stringBufferAppend2 = StringBuffer.append((String) c14787xi.m73406lr());
                    c12025x65.m56895kk();
                    M73406lr = stringBufferAppend2;
                    OooO0O04 = StringBuffer.append((String) c14787xi.m73406lr());
                    while (true) {
                        if (c12025x65.m56897x1() <= (M73406lr == true ? 1.0f : 0.0f)) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                        }
                        i12 = i14;
                        fM4486x1 = f4;
                        i13 = i15;
                        c12025x6ArrM72659kk = c12025x6Arr3;
                        M73406lr += c14787xi.m73406lr() * fM56897x13;
                        OooO0O04 += c14787xi.m73406lr() * fM56895kk3;
                    }
                    f2 = fM4486x1;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    i3 = i11;
                } else {
                    i9 = i18;
                }
                i10 = i9;
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                }
                c12025x62.CloneTo(c12025x66);
                float f62 = i3;
                fM56897x13 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f62;
                fM56895kk3 = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f62;
                if (fM56897x13 != 0.0f) {
                }
                fM56897x14 = c12025x65.m56897x1();
                fM56895kk4 = c12025x65.m56895kk();
                while (true) {
                    if (c12025x65.m56897x1() <= fM56897x14) {
                        i11 = i3;
                        d3 = fM56897x14;
                        c14365qy = c14365qyM73423wy;
                        f = fM4453k4;
                        if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x65.m56897x1())) {
                        }
                        f3 = fM4486x1;
                        c12025x6Arr2 = c12025x6ArrM72659kk;
                    } else {
                        i11 = i3;
                        d3 = fM56897x14;
                        c14365qy = c14365qyM73423wy;
                        f = fM4453k4;
                        if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x65.m56897x1())) {
                        }
                        f3 = fM4486x1;
                        c12025x6Arr2 = c12025x6ArrM72659kk;
                    }
                    float f72 = fM56895kk4;
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    fM56897x14 += c14787xi.m73406lr() * fM56897x13;
                    fM56895kk4 = (c14787xi.m73406lr() * fM56895kk3) + f72;
                    fM4486x1 = f3;
                    i3 = i11;
                    c12025x6ArrM72659kk = c12025x6Arr2;
                    c14365qyM73423wy = c14365qy;
                    fM4453k4 = f;
                }
                minorTickMark2 = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark2 != 0) {
                }
                i13 = 1;
                c12025x65.m56897x1();
                StringBuffer stringBufferAppend22 = StringBuffer.append((String) c14787xi.m73406lr());
                c12025x65.m56895kk();
                M73406lr = stringBufferAppend22;
                OooO0O04 = StringBuffer.append((String) c14787xi.m73406lr());
                while (true) {
                    if (c12025x65.m56897x1() <= (M73406lr == true ? 1.0f : 0.0f)) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                    }
                    i12 = i14;
                    fM4486x1 = f4;
                    i13 = i15;
                    c12025x6ArrM72659kk = c12025x6Arr3;
                    M73406lr += c14787xi.m73406lr() * fM56897x13;
                    OooO0O04 += c14787xi.m73406lr() * fM56895kk3;
                }
                f2 = fM4486x1;
                c12025x6Arr = c12025x6ArrM72659kk;
                i3 = i11;
            } else {
                c14365qy = c14365qyM73423wy;
                f = fM4453k4;
                float f8 = fM4486x1;
                c12025x6Arr = c12025x6ArrM72659kk;
                int i20 = i3;
                int majorTickMark2 = c14787xi.m73384dy().getMajorTickMark();
                char c3 = 225;
                char c4 = 'Z';
                if (majorTickMark2 == 0) {
                    i4 = 1;
                } else if (majorTickMark2 == 1) {
                    if (c14365qy.m69877xk() >= 90) {
                        if (c14365qy.m69877xk() >= 225) {
                        }
                        i4 = i19;
                    }
                    i5 = i19;
                    i4 = 1;
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    }
                    c12025x6.CloneTo(c12025x66);
                    i3 = i20;
                    float f9 = i3;
                    fM56897x1 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f9;
                    fM56895kk = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f9;
                    if (fM56897x1 != 0.0f) {
                    }
                    fM56897x12 = c12025x65.m56897x1();
                    fM56895kk2 = c12025x65.m56895kk();
                    while (true) {
                        if (c12025x65.m56895kk() <= fM56895kk2) {
                        }
                        if (i6 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        fM56897x12 += c14787xi.m73406lr() * fM56897x1;
                        fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                        char c5 = c2;
                        c4 = c;
                        c3 = c5;
                        i4 = i6;
                        f8 = f2;
                    }
                    minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                    if (minorTickMark != 0) {
                    }
                    i8 = 1;
                    c12025x65.m56897x1();
                    StringBuffer stringBufferAppend3 = StringBuffer.append((String) c14787xi.m73406lr());
                    c12025x65.m56895kk();
                    OooO0O03 = stringBufferAppend3;
                    OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                    while (true) {
                        if (c12025x65.m56895kk() <= OooO0O02) {
                        }
                        d2 = (double) OooO0O02;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                        }
                        OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                        OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                    }
                } else if (majorTickMark2 != 3) {
                    i4 = i19;
                    i5 = i4;
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        c12025x6Arr[i19].CloneTo(c12025x65);
                        c12025x6 = c12025x6Arr[1];
                    } else {
                        c12025x6Arr[1].CloneTo(c12025x65);
                        c12025x6 = c12025x6Arr[i19];
                    }
                    c12025x6.CloneTo(c12025x66);
                    i3 = i20;
                    float f92 = i3;
                    fM56897x1 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f92;
                    fM56895kk = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f92;
                    if (fM56897x1 != 0.0f && fM56895kk == 0.0f) {
                        return;
                    }
                    fM56897x12 = c12025x65.m56897x1();
                    fM56895kk2 = c12025x65.m56895kk();
                    while (true) {
                        if ((c12025x65.m56895kk() <= fM56895kk2 || fM56895kk2 > c12025x66.m56895kk()) && (c12025x65.m56895kk() < fM56895kk2 || fM56895kk2 < c12025x66.m56895kk())) {
                            d = fM56895kk2;
                            i6 = i4;
                            f2 = f8;
                            if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x65.m56895kk()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x66.m56895kk())) {
                                break;
                            }
                            c = 'Z';
                            c2 = 225;
                        } else {
                            char c6 = c4;
                            c2 = c3;
                            c = c6;
                            i6 = i4;
                            f2 = f8;
                        }
                        if (i6 != 0) {
                            c14787xi.m73393k4(fM56897x12, fM56895kk2, fM56897x12 + f, fM56895kk2);
                        }
                        if (i5 == 0) {
                            c14787xi.m73393k4(fM56897x12 - f, fM56895kk2, fM56897x12, fM56895kk2);
                        }
                        fM56897x12 += c14787xi.m73406lr() * fM56897x1;
                        fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                        char c52 = c2;
                        c4 = c;
                        c3 = c52;
                        i4 = i6;
                        f8 = f2;
                    }
                    minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                    if (minorTickMark != 0) {
                        i7 = 1;
                    } else if (minorTickMark == 1) {
                        if (c14365qy.m69877xk() >= 90) {
                            if (c14365qy.m69877xk() >= 225) {
                            }
                            i7 = i19;
                        }
                        i8 = i19;
                        i7 = 1;
                        c12025x65.m56897x1();
                        StringBuffer stringBufferAppend32 = StringBuffer.append((String) c14787xi.m73406lr());
                        c12025x65.m56895kk();
                        OooO0O03 = stringBufferAppend32;
                        OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                        while (true) {
                            if (c12025x65.m56895kk() <= OooO0O02) {
                            }
                            d2 = (double) OooO0O02;
                            if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                            }
                            OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                            OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                        }
                    } else if (minorTickMark != 3) {
                        i7 = i19;
                        i8 = i7;
                        c12025x65.m56897x1();
                        StringBuffer stringBufferAppend322 = StringBuffer.append((String) c14787xi.m73406lr());
                        c12025x65.m56895kk();
                        OooO0O03 = stringBufferAppend322;
                        OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                        while (true) {
                            if ((c12025x65.m56895kk() <= OooO0O02 || OooO0O02 > c12025x66.m56895kk()) && (c12025x65.m56895kk() < OooO0O02 || OooO0O02 < c12025x66.m56895kk())) {
                                d2 = (double) OooO0O02;
                                if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x66.m56895kk())) {
                                    break;
                                }
                            }
                            if (i7 != 0) {
                                c14787xi.m73393k4(OooO0O03, OooO0O02, OooO0O03 + f2, OooO0O02);
                            }
                            if (i8 != 0) {
                                c14787xi.m73393k4(OooO0O03 - f2, OooO0O02, OooO0O03, OooO0O02);
                            }
                            if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                                ?? Append3 = StringBuffer.append((String) c14787xi.m73406lr());
                                ?? Append4 = StringBuffer.append((String) c14787xi.m73406lr());
                                if ((c12025x65.m56895kk() > Append4 || Append4 > c12025x66.m56895kk()) && (c12025x65.m56895kk() < Append4 || Append4 < c12025x66.m56895kk())) {
                                    double d6 = (double) Append4;
                                    if (C14116yg.m67497to(d6) == C14116yg.m67497to(c12025x65.m56895kk()) || C14116yg.m67497to(d6) == C14116yg.m67497to(c12025x66.m56895kk())) {
                                        if (i7 != 0) {
                                            c14787xi.m73393k4(Append3, Append4, Append3 + f2, Append4);
                                        }
                                        if (i8 != 0) {
                                            c14787xi.m73393k4(Append3 - f2, Append4, Append3, Append4);
                                        }
                                    }
                                    OooO0O03 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56897x1, 2.0f, Append3);
                                    OooO0O02 = C20424OooO0Oo.OooO0O0(c14787xi.m73406lr(), fM56895kk, 2.0f, Append4);
                                }
                            }
                            OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                            OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                        }
                    } else {
                        if (c14365qy.m69877xk() >= 90) {
                            if (c14365qy.m69877xk() >= 225) {
                            }
                            i8 = i19;
                            i7 = 1;
                            c12025x65.m56897x1();
                            StringBuffer stringBufferAppend3222 = StringBuffer.append((String) c14787xi.m73406lr());
                            c12025x65.m56895kk();
                            OooO0O03 = stringBufferAppend3222;
                            OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                            while (true) {
                                if (c12025x65.m56895kk() <= OooO0O02) {
                                }
                                d2 = (double) OooO0O02;
                                if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                                    break;
                                    break;
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                                }
                                OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                                OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                            }
                        }
                        i7 = i19;
                    }
                    i8 = 1;
                    c12025x65.m56897x1();
                    StringBuffer stringBufferAppend32222 = StringBuffer.append((String) c14787xi.m73406lr());
                    c12025x65.m56895kk();
                    OooO0O03 = stringBufferAppend32222;
                    OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                    while (true) {
                        if (c12025x65.m56895kk() <= OooO0O02) {
                        }
                        d2 = (double) OooO0O02;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                        }
                        OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                        OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                    }
                } else {
                    if (c14365qy.m69877xk() >= 90) {
                        if (c14365qy.m69877xk() >= 225) {
                        }
                        i5 = i19;
                        i4 = 1;
                        if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        }
                        c12025x6.CloneTo(c12025x66);
                        i3 = i20;
                        float f922 = i3;
                        fM56897x1 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f922;
                        fM56895kk = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f922;
                        if (fM56897x1 != 0.0f) {
                        }
                        fM56897x12 = c12025x65.m56897x1();
                        fM56895kk2 = c12025x65.m56895kk();
                        while (true) {
                            if (c12025x65.m56895kk() <= fM56895kk2) {
                                d = fM56895kk2;
                                i6 = i4;
                                f2 = f8;
                                if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x65.m56895kk())) {
                                }
                                c = 'Z';
                                c2 = 225;
                            } else {
                                d = fM56895kk2;
                                i6 = i4;
                                f2 = f8;
                                if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x65.m56895kk())) {
                                }
                                c = 'Z';
                                c2 = 225;
                            }
                            if (i6 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            fM56897x12 += c14787xi.m73406lr() * fM56897x1;
                            fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                            char c522 = c2;
                            c4 = c;
                            c3 = c522;
                            i4 = i6;
                            f8 = f2;
                        }
                        minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                        if (minorTickMark != 0) {
                        }
                        i8 = 1;
                        c12025x65.m56897x1();
                        StringBuffer stringBufferAppend322222 = StringBuffer.append((String) c14787xi.m73406lr());
                        c12025x65.m56895kk();
                        OooO0O03 = stringBufferAppend322222;
                        OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                        while (true) {
                            if (c12025x65.m56895kk() <= OooO0O02) {
                            }
                            d2 = (double) OooO0O02;
                            if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                            }
                            OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                            OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                        }
                    }
                    i4 = i19;
                }
                i5 = 1;
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                }
                c12025x6.CloneTo(c12025x66);
                i3 = i20;
                float f9222 = i3;
                fM56897x1 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f9222;
                fM56895kk = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f9222;
                if (fM56897x1 != 0.0f) {
                }
                fM56897x12 = c12025x65.m56897x1();
                fM56895kk2 = c12025x65.m56895kk();
                while (true) {
                    if (c12025x65.m56895kk() <= fM56895kk2) {
                    }
                    if (i6 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    fM56897x12 += c14787xi.m73406lr() * fM56897x1;
                    fM56895kk2 += c14787xi.m73406lr() * fM56895kk;
                    char c5222 = c2;
                    c4 = c;
                    c3 = c5222;
                    i4 = i6;
                    f8 = f2;
                }
                minorTickMark = c14787xi.m73384dy().getMinorTickMark();
                if (minorTickMark != 0) {
                }
                i8 = 1;
                c12025x65.m56897x1();
                StringBuffer stringBufferAppend3222222 = StringBuffer.append((String) c14787xi.m73406lr());
                c12025x65.m56895kk();
                OooO0O03 = stringBufferAppend3222222;
                OooO0O02 = StringBuffer.append((String) c14787xi.m73406lr());
                while (true) {
                    if (c12025x65.m56895kk() <= OooO0O02) {
                    }
                    d2 = (double) OooO0O02;
                    if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x65.m56895kk())) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (c14787xi.m73384dy().getMajorTickMark() == 2) {
                    }
                    OooO0O03 += c14787xi.m73406lr() * fM56897x1;
                    OooO0O02 += c14787xi.m73406lr() * fM56895kk;
                }
            }
            if (i16 <= 0) {
                return;
            }
            C12025x6 c12025x67 = c12025x6Arr[i19];
            float f10 = i16;
            c12025x67.m56898x1(c12025x67.m56895kk() - f10);
            C12025x6 c12025x68 = c12025x6Arr[1];
            c12025x68.m56898x1(c12025x68.m56895kk() - f10);
            i16 = i19;
            i17 = i16;
            i18 = 1;
            c12025x6ArrM72659kk = c12025x6Arr;
            fM4486x1 = f2;
            c14365qyM73423wy = c14365qy;
            fM4453k4 = f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m70247k4(int i, C12014ne c12014ne, C14787xi c14787xi, C14365qy c14365qy) {
        double dM73430x6;
        double dM73410ne;
        String str;
        boolean z = true;
        if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
            m70253to(c14787xi, c14365qy);
            return;
        }
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qy);
        if (c14365qy.m69863u4().m73384dy().isPlotOrderReversed()) {
            dM73430x6 = c14365qy.m69863u4().m73389ix();
            dM73410ne = c14365qy.m69863u4().m73430x6();
        } else {
            dM73430x6 = c14365qy.m69863u4().m73430x6();
            dM73410ne = c14365qy.m69863u4().m73410ne();
        }
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((dM73430x6 - dM73410ne) / (c14365qy.m69863u4().m73389ix() - c14365qy.m69863u4().m73410ne()), c14365qy.m69833e0().m64121to(), 14);
        char c = 0;
        if (iOooO00o != 0) {
            float f = iOooO00o;
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1() + f, c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[0].m56897x1() + f, c12025x6ArrM72659kk[0].m56895kk() - c14365qy.m69833e0().m64100du());
        }
        if (c14365qy.m69829dq() >= 0) {
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - c14365qy.m69833e0().m64100du());
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            C12025x6 c12025x6 = c12025x6ArrM72659kk[0];
            c12025x6.m56891k4(c12025x6.m56897x1() + iOooO00o);
        }
        float fM73390jd = c14787xi.m73390jd();
        if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
            float fM56639dy = c14787xi.m73400kk().m56639dy();
            fM73390jd += C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy);
        }
        float fM56897x1 = (c12025x6ArrM72659kk[0].m56897x1() - c14787xi.f50102to) - fM73390jd;
        float fM64100du = c14365qy.m69833e0().m64100du() / i;
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        boolean z2 = c14787xi.m73385fa() && listM69871x1.size() > 0;
        int i2 = 0;
        while (i2 < i) {
            boolean z3 = z;
            char c2 = c;
            float f2 = fM73390jd;
            double d = ((double) (i2 * fM64100du)) + ((double) (fM64100du / 2.0f));
            float fM56895kk = ((float) (c14787xi.m73384dy().isPlotOrderReversed() ? ((double) (c12025x6ArrM72659kk[c2].m56895kk() - c14365qy.m69833e0().m64100du())) + d : ((double) c12025x6ArrM72659kk[c2].m56895kk()) - d)) - (c14787xi.f50095kk / 2.0f);
            if (c14787xi.m73384dy().getTickLabelPosition() != 3 && i2 % c14787xi.m73376bv() == 0 && i2 < c14787xi.f50098m9.size()) {
                C12003du c12003duClone = c14787xi.m73413to().Clone();
                if (z2) {
                    String strM7228h4 = i2 < listM69871x1.size() ? listM69871x1.get_Item(i2).m7228h4() : "";
                    String strM63880k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i2), strM7228h4, (i2 >= listM69871x1.size() || !listM69871x1.get_Item(i2).m7227du()) ? c2 : z3);
                    C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i2), strM7228h4, c12003duClone.Clone()).CloneTo(c12003duClone);
                    str = strM63880k4;
                } else {
                    String strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i2), c14787xi);
                    C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i2), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone()).CloneTo(c12003duClone);
                    str = strM4468k4;
                }
                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM56897x1, fM56895kk, c14787xi.f50102to, c14787xi.f50095kk).Clone())).Clone(), str, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 2, 2, c14365qy);
            }
            i2++;
            z = z3;
            c = c2;
            fM73390jd = f2;
        }
        char c3 = c;
        float f3 = fM73390jd;
        m70254x1(iOooO00o, i, c14787xi);
        List<C1210hn>[] listArrM69861to = c14365qy.m69861to();
        if (listArrM69861to == null || listArrM69861to.length <= 0 || listM69871x1.size() <= 0 || c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return;
        }
        C0841c4.m4477k4(listArrM69861to, true, fM64100du, c12014ne.Clone(), f3, c12025x6ArrM72659kk[c3].m56897x1(), (c12025x6ArrM72659kk[c3].m56897x1() - (f3 * (listArrM69861to.length + 1))) - c14787xi.f50094k4, !c14787xi.m73384dy().isPlotOrderReversed() ? c12025x6ArrM72659kk[c3].m56895kk() : c12025x6ArrM72659kk[c3].m56895kk() - c14365qy.m69833e0().m64100du(), c14787xi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x066c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70248k4(int i, C12014ne c12014ne, boolean z, C14787xi c14787xi, C14365qy c14365qy) {
        int i2;
        char c;
        int i3;
        String strM63880k4;
        C12025x6[] c12025x6Arr;
        float f;
        boolean z2;
        String strM4468k4;
        List<C1210hn> list;
        C12003du c12003du;
        float f2;
        float fM56557jd;
        float fM56551ck;
        float fM56895kk;
        float fM56895kk2;
        float fM67480k4;
        char c2;
        float fM56897x1;
        float f3;
        float fM56895kk3;
        float f4;
        float fM56897x12;
        float f5;
        float fM56895kk4;
        float f6;
        float fM56897x13;
        float f7;
        float f8;
        float fM56897x14;
        float fM56557jd2;
        float fM56895kk5;
        float f9;
        float fM56897x15;
        float f10;
        float fM56895kk6;
        float f11;
        float f12;
        float fM56897x16;
        if (c14787xi.m73384dy().getCategoryAxisType() == 1) {
            m70252kk(c14787xi, c14365qy);
            return;
        }
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qy);
        double dM73432yj = c14365qy.m69863u4().m73432yj();
        double dM73405ks = c14365qy.m69863u4().m73405ks();
        double dM73412rv = c14365qy.m69863u4().m73412rv();
        char c3 = 0;
        boolean z3 = c14365qy.m69863u4().m73410ne() == ((double) c14365qy.m69863u4().m73430x6());
        int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o((c14365qy.m69863u4().m73384dy().isPlotOrderReversed() ? dM73432yj - dM73412rv : dM73412rv - dM73405ks) / (dM73432yj - dM73405ks), c14365qy.m69833e0().m64100du(), 14);
        if (iOooO00o != 0) {
            float f13 = iOooO00o;
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk() - f13, c12025x6ArrM72659kk[1].m56897x1(), c12025x6ArrM72659kk[1].m56895kk() - f13);
        }
        if (c14365qy.m69829dq() >= 0) {
            c14787xi.m73393k4(c12025x6ArrM72659kk[0].m56897x1(), c12025x6ArrM72659kk[0].m56895kk(), c12025x6ArrM72659kk[1].m56897x1(), c12025x6ArrM72659kk[1].m56895kk());
        }
        if (c14787xi.m73384dy().getTickLabelPosition() == 2) {
            C12025x6 c12025x6 = c12025x6ArrM72659kk[0];
            float f14 = iOooO00o;
            c12025x6.m56898x1(c12025x6.m56895kk() - f14);
            C12025x6 c12025x62 = c12025x6ArrM72659kk[1];
            c12025x62.m56898x1(c12025x62.m56895kk() - f14);
        }
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        float fM73390jd = c14787xi.m73390jd();
        if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
            float fM56639dy = c14787xi.m73400kk().m56639dy();
            fM73390jd += C0841c4.m4453k4(fM56639dy) + C0841c4.m4486x1(fM56639dy);
        }
        boolean z4 = c14787xi.m73375b3() || c14365qy.m69834fa().hasDataTable();
        if (z4) {
            i2 = i;
        } else {
            i2 = i - 1;
            if (i2 == 0) {
                i2 = 1;
            }
        }
        double dM67471fa = c12025x6ArrM72659kk[1].m56897x1() == c12025x6ArrM72659kk[0].m56897x1() ? 1.5707963267948966d : C14116yg.m67471fa(C14116yg.m67480k4((c12025x6ArrM72659kk[0].m56895kk() - c12025x6ArrM72659kk[1].m56895kk()) / (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1())));
        float f15 = i2;
        float fM56897x17 = (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1()) / f15;
        float fM56895kk7 = (c12025x6ArrM72659kk[1].m56895kk() - c12025x6ArrM72659kk[0].m56895kk()) / f15;
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        int i4 = 0;
        while (i4 < i) {
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                c = c3;
                i3 = (i - 1) - i4;
            } else {
                c = c3;
                i3 = i4;
            }
            C12003du c12003duClone = c14787xi.m73413to().Clone();
            strM63880k4 = "";
            if (i3 < c14787xi.f50098m9.size()) {
                strM4468k4 = C0841c4.m4468k4(c14787xi.f50098m9.get_Item(i4), c14787xi);
                c12025x6Arr = c12025x6ArrM72659kk;
                f = fM73390jd;
                z2 = z4;
                C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i3), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone()).CloneTo(c12003duClone);
                if (c14787xi.m73385fa() && listM69871x1.size() > 0) {
                    String strM7228h4 = i3 < listM69871x1.size() ? listM69871x1.get_Item(i3).m7228h4() : "";
                    strM63880k4 = C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i3), strM7228h4, i3 < listM69871x1.size() ? listM69871x1.get_Item(i3).m7227du() : c);
                    C13729ki.m63876k4(c14787xi.f50098m9.get_Item(i3), strM7228h4, c12003duClone.Clone()).CloneTo(c12003duClone);
                }
                if (c14787xi.m73384dy().getTickLabelPosition() == 3 && i3 % c14787xi.m73376bv() == 0) {
                    C12007ix c12007ix = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
                    if (z2) {
                        if (c14365qy.m69829dq() < 0) {
                            list = listM69871x1;
                            c12003du = c12003duClone;
                            if (c14365qy.m69829dq() < 0 && !z3 && c14787xi.m73384dy().getTickLabelPosition() == 2) {
                                if (c12025x6Arr[c].m56895kk() == c12025x6Arr[1].m56895kk()) {
                                    if (fM56897x17 > 0.0f) {
                                        fM56897x13 = c12025x6Arr[c].m56897x1();
                                        f7 = i4;
                                    } else {
                                        fM56897x13 = c12025x6Arr[c].m56897x1();
                                        f7 = i4 + 1;
                                    }
                                    c12007ix.m56566kk((f7 * fM56897x17) + fM56897x13);
                                    fM56895kk = c12025x6Arr[c].m56895kk() - c14787xi.f50095kk;
                                    fM56551ck = fM56895kk - f;
                                    c12007ix.m56572to(fM56551ck);
                                    fM67480k4 = C14116yg.m67480k4(fM56897x17);
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50095kk);
                                } else if (dM67471fa <= 0.7853981633974483d) {
                                    if (fM56897x17 < 0.0f) {
                                        fM56897x12 = c12025x6Arr[c].m56897x1();
                                        f5 = i4 + 1;
                                    } else {
                                        fM56897x12 = c12025x6Arr[c].m56897x1();
                                        f5 = i4;
                                    }
                                    c12007ix.m56566kk((f5 * fM56897x17) + fM56897x12);
                                    if (fM56895kk7 < 0.0f) {
                                        fM56895kk4 = c12025x6Arr[c].m56895kk();
                                        f6 = i4 + 1;
                                    } else {
                                        fM56895kk4 = c12025x6Arr[c].m56895kk();
                                        f6 = i4;
                                    }
                                    c12007ix.m56572to((f6 * fM56895kk7) + fM56895kk4);
                                    fM56551ck = c12007ix.m56551ck() - c14787xi.f50095kk;
                                    c12007ix.m56572to(fM56551ck);
                                    fM67480k4 = C14116yg.m67480k4(fM56897x17);
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50095kk);
                                } else {
                                    if (fM56895kk7 < 0.0f) {
                                        fM56897x1 = c12025x6Arr[c].m56897x1();
                                        f3 = i4;
                                    } else {
                                        fM56897x1 = c12025x6Arr[c].m56897x1();
                                        f3 = i4 + 1;
                                    }
                                    c12007ix.m56566kk((f3 * fM56897x17) + fM56897x1);
                                    c12007ix.m56566kk(fM56897x17 * fM56895kk7 >= 0.0f ? (((float) C14116yg.m67495m9(dM67471fa)) * f) + c12007ix.m56557jd() : (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * f)) - c14787xi.f50102to);
                                    if (fM56895kk7 < 0.0f) {
                                        fM56895kk3 = c12025x6Arr[c].m56895kk();
                                        f4 = i4;
                                    } else {
                                        fM56895kk3 = c12025x6Arr[c].m56895kk();
                                        f4 = i4 + 1;
                                    }
                                    c12007ix.m56572to((f4 * fM56895kk7) + fM56895kk3);
                                    c12007ix.m56572to(c12007ix.m56551ck() - (((C14116yg.m67480k4(fM56895kk7) - c14787xi.f50095kk) * ((float) C14116yg.m67495m9(dM67471fa))) / 2.0f));
                                    c12007ix.m56572to(c12007ix.m56551ck() - c14787xi.f50095kk);
                                    fM67480k4 = c14787xi.f50102to;
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50095kk);
                                }
                            }
                        } else if (c12025x6Arr[c].m56895kk() == c12025x6Arr[1].m56895kk()) {
                            if (fM56897x17 < 0.0f) {
                                f12 = 2.0f;
                                fM56897x16 = ((i4 + 1) * fM56897x17) + c12025x6Arr[c].m56897x1();
                            } else {
                                f12 = 2.0f;
                                fM56897x16 = c12025x6Arr[c].m56897x1() + (i4 * fM56897x17);
                            }
                            c12007ix.m56566kk(fM56897x16);
                            c12007ix.m56572to(c12025x6Arr[c].m56895kk() + f);
                            c12007ix.m56576x1(C14116yg.m67480k4(fM56897x17));
                            c12007ix.m56560k4(c14787xi.f50095kk);
                            c12025x6Clone.m56891k4(fM56897x17 < 0.0f ? c12007ix.m56557jd() - (fM56897x17 / f12) : c12007ix.m56557jd() + (fM56897x17 / f12));
                            c12025x6Clone.m56898x1(c12007ix.m56551ck());
                            list = listM69871x1;
                            c12003du = c12003duClone;
                            c2 = 1;
                            if (c14787xi.m73386h4() != 0 || c14787xi.m73386h4() == 90 || c14787xi.m73386h4() == -90 || c2 == 0) {
                                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(c12007ix.Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003du.Clone(), 1, 2, c14365qy);
                            } else {
                                C0841c4.m4475k4(strM4468k4, c12025x6Clone.Clone(), new C12015qq(c14787xi.f50102to, c14787xi.f50095kk), c12003du.Clone(), c14787xi);
                            }
                        } else if (dM67471fa <= 0.7853981633974483d) {
                            if (fM56897x17 < 0.0f) {
                                fM56897x15 = c12025x6Arr[c].m56897x1();
                                f10 = i4 + 1;
                            } else {
                                fM56897x15 = c12025x6Arr[c].m56897x1();
                                f10 = i4;
                            }
                            c12007ix.m56566kk((f10 * fM56897x17) + fM56897x15);
                            if (fM56895kk7 > 0.0f) {
                                fM56895kk6 = c12025x6Arr[c].m56895kk();
                                f11 = i4 + 1;
                            } else {
                                fM56895kk6 = c12025x6Arr[c].m56895kk();
                                f11 = i4;
                            }
                            c12007ix.m56572to((f11 * fM56895kk7) + fM56895kk6);
                            c12007ix.m56576x1(C14116yg.m67480k4(fM56897x17));
                            c12007ix.m56560k4(c14787xi.f50095kk);
                            list = listM69871x1;
                            c12003du = c12003duClone;
                        } else {
                            if (fM56895kk7 > 0.0f) {
                                f8 = 0.0f;
                                fM56897x14 = (i4 * fM56897x17) + c12025x6Arr[c].m56897x1();
                            } else {
                                f8 = 0.0f;
                                fM56897x14 = c12025x6Arr[c].m56897x1() + ((i4 + 1) * fM56897x17);
                            }
                            c12007ix.m56566kk(fM56897x14);
                            if (fM56897x17 * fM56895kk7 <= f8) {
                                list = listM69871x1;
                                c12003du = c12003duClone;
                                fM56557jd2 = (((float) C14116yg.m67495m9(dM67471fa)) * f) + c12007ix.m56557jd();
                            } else {
                                list = listM69871x1;
                                c12003du = c12003duClone;
                                fM56557jd2 = (c12007ix.m56557jd() - (f * ((float) C14116yg.m67495m9(dM67471fa)))) - c14787xi.f50102to;
                            }
                            c12007ix.m56566kk(fM56557jd2);
                            if (fM56895kk7 > 0.0f) {
                                fM56895kk5 = c12025x6Arr[c].m56895kk();
                                f9 = i4;
                            } else {
                                fM56895kk5 = c12025x6Arr[c].m56895kk();
                                f9 = i4 + 1;
                            }
                            c12007ix.m56572to((f9 * fM56895kk7) + fM56895kk5);
                            fM56895kk2 = (((C14116yg.m67480k4(fM56895kk7) - c14787xi.f50095kk) * ((float) C14116yg.m67495m9(dM67471fa))) / 2.0f) + c12007ix.m56551ck();
                            c12007ix.m56572to(fM56895kk2);
                            fM67480k4 = c14787xi.f50102to;
                            c12007ix.m56576x1(fM67480k4);
                            c12007ix.m56560k4(c14787xi.f50095kk);
                        }
                        c2 = c;
                        if (c14787xi.m73386h4() != 0) {
                            C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(c12007ix.Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003du.Clone(), 1, 2, c14365qy);
                        }
                    } else {
                        list = listM69871x1;
                        c12003du = c12003duClone;
                        if (c14365qy.m69829dq() < 0) {
                            if (c14365qy.m69829dq() < 0 && !z3 && c14787xi.m73384dy().getTickLabelPosition() == 2) {
                                if (c12025x6Arr[c].m56895kk() == c12025x6Arr[1].m56895kk()) {
                                    c12007ix.m56566kk(fM56897x17 > 0.0f ? ((i4 * fM56897x17) + c12025x6Arr[c].m56897x1()) - (fM56897x17 / 2.0f) : (i4 * fM56897x17) + c12025x6Arr[c].m56897x1() + (fM56897x17 / 2.0f));
                                    fM56895kk = c12025x6Arr[c].m56895kk() - c14787xi.f50095kk;
                                    fM56551ck = fM56895kk - f;
                                } else if (dM67471fa <= 0.7853981633974483d) {
                                    float f16 = i4;
                                    c12007ix.m56566kk(((f16 * fM56897x17) + c12025x6Arr[c].m56897x1()) - (C14116yg.m67480k4(fM56897x17) / 2.0f));
                                    c12007ix.m56572to((f16 * fM56895kk7) + c12025x6Arr[c].m56895kk());
                                    fM56551ck = c12007ix.m56551ck() - (c14787xi.f50095kk + f);
                                } else {
                                    float f17 = i4;
                                    c12007ix.m56566kk((f17 * fM56897x17) + c12025x6Arr[c].m56897x1());
                                    if (fM56897x17 * fM56895kk7 >= 0.0f) {
                                        f2 = f17;
                                        fM56557jd = (f * ((float) C14116yg.m67495m9(dM67471fa))) + c12007ix.m56557jd();
                                    } else {
                                        f2 = f17;
                                        fM56557jd = (c12007ix.m56557jd() - (f * ((float) C14116yg.m67495m9(dM67471fa)))) - c14787xi.f50102to;
                                    }
                                    c12007ix.m56566kk(fM56557jd);
                                    c12007ix.m56572to(((f2 * fM56895kk7) + c12025x6Arr[c].m56895kk()) - (c14787xi.f50095kk / 2.0f));
                                    fM67480k4 = c14787xi.f50102to;
                                    c12007ix.m56576x1(fM67480k4);
                                    c12007ix.m56560k4(c14787xi.f50095kk);
                                }
                            }
                            c2 = c;
                            if (c14787xi.m73386h4() != 0) {
                            }
                        } else if (c12025x6Arr[c].m56895kk() == c12025x6Arr[1].m56895kk()) {
                            c12007ix.m56566kk(fM56897x17 < 0.0f ? (fM56897x17 / 2.0f) + (i4 * fM56897x17) + c12025x6Arr[c].m56897x1() : ((i4 * fM56897x17) + c12025x6Arr[c].m56897x1()) - (fM56897x17 / 2.0f));
                            fM56551ck = c12025x6Arr[c].m56895kk() + f;
                        } else if (dM67471fa <= 0.7853981633974483d) {
                            float f18 = i4;
                            c12007ix.m56566kk(((f18 * fM56897x17) + c12025x6Arr[c].m56897x1()) - (C14116yg.m67480k4(fM56897x17) / 2.0f));
                            c12007ix.m56572to((f18 * fM56895kk7) + c12025x6Arr[c].m56895kk() + f);
                            fM67480k4 = C14116yg.m67480k4(fM56897x17);
                            c12007ix.m56576x1(fM67480k4);
                            c12007ix.m56560k4(c14787xi.f50095kk);
                            c2 = c;
                            if (c14787xi.m73386h4() != 0) {
                            }
                        } else {
                            float f19 = i4;
                            c12007ix.m56566kk((f19 * fM56897x17) + c12025x6Arr[c].m56897x1());
                            c12007ix.m56566kk(fM56897x17 * fM56895kk7 <= 0.0f ? (((float) C14116yg.m67495m9(dM67471fa)) * f) + c12007ix.m56557jd() : (c12007ix.m56557jd() - (((float) C14116yg.m67495m9(dM67471fa)) * f)) - c14787xi.f50102to);
                            fM56895kk2 = ((f19 * fM56895kk7) + c12025x6Arr[c].m56895kk()) - (c14787xi.f50095kk / 2.0f);
                            c12007ix.m56572to(fM56895kk2);
                            fM67480k4 = c14787xi.f50102to;
                            c12007ix.m56576x1(fM67480k4);
                            c12007ix.m56560k4(c14787xi.f50095kk);
                            c2 = c;
                            if (c14787xi.m73386h4() != 0) {
                            }
                        }
                        c12007ix.m56572to(fM56551ck);
                        fM67480k4 = C14116yg.m67480k4(fM56897x17);
                        c12007ix.m56576x1(fM67480k4);
                        c12007ix.m56560k4(c14787xi.f50095kk);
                        c2 = c;
                        if (c14787xi.m73386h4() != 0) {
                        }
                    }
                } else {
                    list = listM69871x1;
                }
                i4++;
                listM69871x1 = list;
                c3 = c;
                c12025x6ArrM72659kk = c12025x6Arr;
                z4 = z2;
                fM73390jd = f;
            } else {
                c12025x6Arr = c12025x6ArrM72659kk;
                f = fM73390jd;
                z2 = z4;
            }
            strM4468k4 = strM63880k4;
            if (c14787xi.m73384dy().getTickLabelPosition() == 3) {
                list = listM69871x1;
            }
            i4++;
            listM69871x1 = list;
            c3 = c;
            c12025x6ArrM72659kk = c12025x6Arr;
            z4 = z2;
            fM73390jd = f;
        }
        C12025x6[] c12025x6Arr2 = c12025x6ArrM72659kk;
        float f20 = fM73390jd;
        char c4 = c3;
        List<C1210hn> list2 = listM69871x1;
        m70246k4(iOooO00o, i, c14787xi);
        List<C1210hn>[] listArrM69861to = c14365qy.m69861to();
        float fM56895kk8 = c12025x6Arr2[c4].m56895kk();
        if (listArrM69861to == null || listArrM69861to.length <= 0 || list2.size() <= 0 || c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return;
        }
        float fM56897x18 = (!c14787xi.m73384dy().isPlotOrderReversed() ? c12025x6Arr2[c4] : c12025x6Arr2[1]).m56897x1();
        float length = c14787xi.f50110x1 + (f20 * (listArrM69861to.length + 1)) + fM56895kk8;
        if (c12025x6Arr2[c4].m56895kk() == c12025x6Arr2[1].m56895kk()) {
            C0841c4.m4476k4(listArrM69861to, fM56897x18, length, f20, false, fM56897x17, 1, fM56895kk8, c12014ne.Clone(), z, c14787xi);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m70258x1(C14409rq c14409rq) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x03a6, code lost:
    
        if (r25.m69877xk() >= 270) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03be, code lost:
    
        if (r25.m69877xk() >= 270) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0498, code lost:
    
        if (r25.m69877xk() >= 270) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04b9, code lost:
    
        if (r25.m69877xk() >= 270) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        if (r25.m69829dq() >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019d, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r3 = r16;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a9, code lost:
    
        if (r25.m69829dq() >= 0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x054a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70249k4(int i, C14787xi c14787xi) {
        C14365qy c14365qy;
        float f;
        float f2;
        boolean z;
        boolean z2;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        float fM56897x1;
        float fM56895kk;
        float fM56897x12;
        float fM56895kk2;
        C12025x6[] c12025x6Arr;
        double d;
        int minorTickMark;
        boolean z3;
        boolean z4;
        float fM56897x13;
        float fM56895kk3;
        double d2;
        int i2;
        int i3;
        C12025x6 c12025x63;
        float fM56897x14;
        float fM56895kk4;
        float fM56897x15;
        float fM56895kk5;
        C12025x6 c12025x64;
        double d3;
        float f3;
        int minorTickMark2;
        int i4;
        int i5;
        float fM56897x16;
        float fM56895kk6;
        double d4;
        int i6;
        int i7;
        int i8 = i;
        C14787xi c14787xi2 = c14787xi;
        C14365qy c14365qyM73423wy = c14787xi2.m73423wy();
        if ((c14787xi2.m73384dy().getMajorTickMark() == 2 && c14787xi2.m73384dy().getMinorTickMark() == 2) || !c14787xi2.m73384dy().isVisible()) {
            return;
        }
        float fM4453k4 = C0841c4.m4453k4(c14787xi2.m73400kk().m56639dy());
        float fM4486x1 = C0841c4.m4486x1(c14787xi2.m73400kk().m56639dy());
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qyM73423wy);
        int i9 = 1;
        int i10 = 0;
        double dM67471fa = c12025x6ArrM72659kk[1].m56897x1() == c12025x6ArrM72659kk[0].m56897x1() ? 1.5707963267948966d : C14116yg.m67471fa(C14116yg.m67480k4((c12025x6ArrM72659kk[0].m56895kk() - c12025x6ArrM72659kk[1].m56895kk()) / (c12025x6ArrM72659kk[1].m56897x1() - c12025x6ArrM72659kk[0].m56897x1())));
        C12025x6 c12025x65 = new C12025x6();
        C12025x6 c12025x66 = new C12025x6();
        int baseUnitScale = c14787xi2.m73384dy().getBaseUnitScale();
        int iM73373ak = c14787xi2.m73373ak();
        if (c14365qyM73423wy.m69829dq() < 0 && i8 > 0) {
            C12025x6 c12025x67 = c12025x6ArrM72659kk[0];
            float f4 = i8;
            c12025x67.m56898x1(c12025x67.m56895kk() - f4);
            C12025x6 c12025x68 = c12025x6ArrM72659kk[1];
            c12025x68.m56898x1(c12025x68.m56895kk() - f4);
            i8 = 0;
        }
        while (true) {
            int i11 = i10;
            if (dM67471fa <= 0.7853981633974483d) {
                int majorTickMark = c14787xi2.m73384dy().getMajorTickMark();
                if (majorTickMark != 0) {
                    if (majorTickMark != i9) {
                        if (majorTickMark != 3) {
                            i2 = i11;
                        } else if (c14365qyM73423wy.m69829dq() >= 0) {
                            i3 = i9;
                            i2 = i11;
                        } else {
                            i2 = i9;
                            i3 = i11;
                        }
                    } else if (c14365qyM73423wy.m69829dq() >= 0) {
                    }
                    if (c14787xi2.m73384dy().isPlotOrderReversed()) {
                        c12025x6ArrM72659kk[i11].CloneTo(c12025x65);
                        c12025x63 = c12025x6ArrM72659kk[i9];
                    } else {
                        c12025x6ArrM72659kk[i9].CloneTo(c12025x65);
                        c12025x63 = c12025x6ArrM72659kk[i11];
                    }
                    c12025x63.CloneTo(c12025x66);
                    float f5 = iM73373ak;
                    fM56897x14 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f5;
                    fM56895kk4 = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f5;
                    fM56897x15 = c12025x65.m56897x1();
                    fM56895kk5 = c12025x65.m56895kk();
                    while (true) {
                        if ((c12025x65.m56897x1() <= fM56897x15 || fM56897x15 > c12025x66.m56897x1()) && (c12025x65.m56897x1() < fM56897x15 || fM56897x15 < c12025x66.m56897x1())) {
                            c12025x64 = c12025x65;
                            d3 = fM56897x15;
                            c14365qy = c14365qyM73423wy;
                            f = fM4453k4;
                            if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x64.m56897x1()) && C14116yg.m67497to(d3) != C14116yg.m67497to(c12025x66.m56897x1())) {
                                break;
                            } else {
                                f3 = fM4486x1;
                            }
                        } else {
                            c14365qy = c14365qyM73423wy;
                            f = fM4453k4;
                            f3 = fM4486x1;
                            c12025x64 = c12025x65;
                        }
                        float f6 = fM56895kk5;
                        if (i2 != 0) {
                            c14787xi2.m73393k4(fM56897x15, f6 - f, fM56897x15, f6);
                        }
                        if (i3 == 0) {
                            c14787xi2.m73393k4(fM56897x15, f6, fM56897x15, f6 + f);
                        }
                        fM56897x15 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56897x14;
                        fM56895kk5 = (C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk4) + f6;
                        c12025x65 = c12025x64;
                        c14365qyM73423wy = c14365qy;
                        fM4453k4 = f;
                        fM4486x1 = f3;
                        i11 = 0;
                    }
                    minorTickMark2 = c14787xi2.m73384dy().getMinorTickMark();
                    if (minorTickMark2 != 0) {
                        i4 = 1;
                    } else if (minorTickMark2 != 1) {
                        if (minorTickMark2 != 3) {
                            i4 = i11;
                            i5 = i4;
                            fM56897x16 = c12025x64.m56897x1();
                            fM56895kk6 = c12025x64.m56895kk();
                            while (true) {
                                if ((c12025x64.m56897x1() > fM56897x16 || fM56897x16 > c12025x66.m56897x1()) && (c12025x64.m56897x1() < fM56897x16 || fM56897x16 < c12025x66.m56897x1())) {
                                    d4 = fM56897x16;
                                    i6 = i4;
                                    i7 = i5;
                                    if (C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x64.m56897x1()) && C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x66.m56897x1())) {
                                        break;
                                    }
                                } else {
                                    i6 = i4;
                                    i7 = i5;
                                }
                                if (i6 != 0) {
                                    c14787xi2.m73393k4(fM56897x16, fM56895kk6 - fM4486x1, fM56897x16, fM56895kk6);
                                }
                                if (i7 != 0) {
                                    c14787xi2.m73393k4(fM56897x16, fM56895kk6, fM56897x16, fM56895kk6 + fM4486x1);
                                }
                                boolean z5 = i11;
                                fM56897x16 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), z5), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), z5) * fM56897x14;
                                fM56895kk6 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk4;
                                i4 = i6;
                                i5 = i7;
                                fM4486x1 = fM4486x1;
                                i11 = 0;
                            }
                            f2 = fM4486x1;
                            c12025x6Arr = c12025x6ArrM72659kk;
                            c12025x6 = c12025x64;
                        }
                    }
                    i5 = 1;
                    fM56897x16 = c12025x64.m56897x1();
                    fM56895kk6 = c12025x64.m56895kk();
                    while (true) {
                        if (c12025x64.m56897x1() > fM56897x16) {
                            d4 = fM56897x16;
                            i6 = i4;
                            i7 = i5;
                            if (C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x64.m56897x1())) {
                                break;
                                break;
                            }
                        } else {
                            d4 = fM56897x16;
                            i6 = i4;
                            i7 = i5;
                            if (C14116yg.m67497to(d4) != C14116yg.m67497to(c12025x64.m56897x1())) {
                            }
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        boolean z52 = i11;
                        fM56897x16 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), z52), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), z52) * fM56897x14;
                        fM56895kk6 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk4;
                        i4 = i6;
                        i5 = i7;
                        fM4486x1 = fM4486x1;
                        i11 = 0;
                    }
                    f2 = fM4486x1;
                    c12025x6Arr = c12025x6ArrM72659kk;
                    c12025x6 = c12025x64;
                } else {
                    i2 = i9;
                }
                i3 = i2;
                if (c14787xi2.m73384dy().isPlotOrderReversed()) {
                }
                c12025x63.CloneTo(c12025x66);
                float f52 = iM73373ak;
                fM56897x14 = (c12025x66.m56897x1() - c12025x65.m56897x1()) / f52;
                fM56895kk4 = (c12025x66.m56895kk() - c12025x65.m56895kk()) / f52;
                fM56897x15 = c12025x65.m56897x1();
                fM56895kk5 = c12025x65.m56895kk();
                while (true) {
                    if (c12025x65.m56897x1() <= fM56897x15) {
                        c12025x64 = c12025x65;
                        d3 = fM56897x15;
                        c14365qy = c14365qyM73423wy;
                        f = fM4453k4;
                        if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x64.m56897x1())) {
                        }
                        f3 = fM4486x1;
                    } else {
                        c12025x64 = c12025x65;
                        d3 = fM56897x15;
                        c14365qy = c14365qyM73423wy;
                        f = fM4453k4;
                        if (C14116yg.m67497to(d3) == C14116yg.m67497to(c12025x64.m56897x1())) {
                        }
                        f3 = fM4486x1;
                    }
                    float f62 = fM56895kk5;
                    if (i2 != 0) {
                    }
                    if (i3 == 0) {
                    }
                    fM56897x15 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56897x14;
                    fM56895kk5 = (C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk4) + f62;
                    c12025x65 = c12025x64;
                    c14365qyM73423wy = c14365qy;
                    fM4453k4 = f;
                    fM4486x1 = f3;
                    i11 = 0;
                }
                minorTickMark2 = c14787xi2.m73384dy().getMinorTickMark();
                if (minorTickMark2 != 0) {
                }
                i5 = 1;
                fM56897x16 = c12025x64.m56897x1();
                fM56895kk6 = c12025x64.m56895kk();
                while (true) {
                    if (c12025x64.m56897x1() > fM56897x16) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    boolean z522 = i11;
                    fM56897x16 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), z522), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), z522) * fM56897x14;
                    fM56895kk6 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk4;
                    i4 = i6;
                    i5 = i7;
                    fM4486x1 = fM4486x1;
                    i11 = 0;
                }
                f2 = fM4486x1;
                c12025x6Arr = c12025x6ArrM72659kk;
                c12025x6 = c12025x64;
            } else {
                c14365qy = c14365qyM73423wy;
                f = fM4453k4;
                f2 = fM4486x1;
                C12025x6 c12025x69 = c12025x65;
                int majorTickMark2 = c14787xi2.m73384dy().getMajorTickMark();
                char c = 225;
                char c2 = 'Z';
                if (majorTickMark2 != 0) {
                    if (majorTickMark2 == 1) {
                        if (c14365qy.m69877xk() >= 90) {
                            if (c14365qy.m69877xk() >= 225) {
                            }
                            z = false;
                        }
                        z = true;
                        z2 = false;
                    } else if (majorTickMark2 != 3) {
                        z = false;
                        z2 = false;
                    } else {
                        if (c14365qy.m69877xk() >= 90) {
                            if (c14365qy.m69877xk() >= 225) {
                            }
                            z = true;
                            z2 = false;
                        }
                        z = false;
                    }
                    if (c14787xi2.m73384dy().isPlotOrderReversed()) {
                        c12025x6 = c12025x69;
                        c12025x6ArrM72659kk[0].CloneTo(c12025x6);
                        c12025x62 = c12025x6ArrM72659kk[1];
                    } else {
                        c12025x6 = c12025x69;
                        c12025x6ArrM72659kk[1].CloneTo(c12025x6);
                        c12025x62 = c12025x6ArrM72659kk[0];
                    }
                    c12025x62.CloneTo(c12025x66);
                    float f7 = iM73373ak;
                    fM56897x1 = (c12025x66.m56897x1() - c12025x6.m56897x1()) / f7;
                    fM56895kk = (c12025x66.m56895kk() - c12025x6.m56895kk()) / f7;
                    fM56897x12 = c12025x6.m56897x1();
                    fM56895kk2 = c12025x6.m56895kk();
                    while (true) {
                        if ((c12025x6.m56895kk() <= fM56895kk2 || fM56895kk2 > c12025x66.m56895kk()) && (c12025x6.m56895kk() < fM56895kk2 || fM56895kk2 < c12025x66.m56895kk())) {
                            c12025x6Arr = c12025x6ArrM72659kk;
                            d = fM56895kk2;
                            if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d) != C14116yg.m67497to(c12025x66.m56895kk())) {
                                break;
                            }
                        } else {
                            c12025x6Arr = c12025x6ArrM72659kk;
                        }
                        if (z) {
                            c14787xi2.m73393k4(fM56897x12, fM56895kk2, fM56897x12 + f, fM56895kk2);
                        }
                        if (!z2) {
                            c14787xi2.m73393k4(fM56897x12 - f, fM56895kk2, fM56897x12, fM56895kk2);
                        }
                        fM56897x12 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56897x1;
                        fM56895kk2 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56895kk;
                        c14787xi2 = c14787xi;
                        c12025x6ArrM72659kk = c12025x6Arr;
                        i8 = i8;
                        c = 225;
                        c2 = 'Z';
                    }
                    minorTickMark = c14787xi2.m73384dy().getMinorTickMark();
                    if (minorTickMark == 0) {
                        if (minorTickMark == 1) {
                            if (c14365qy.m69877xk() >= 90) {
                                if (c14365qy.m69877xk() >= 225) {
                                }
                                z3 = false;
                            }
                            z3 = true;
                            z4 = false;
                        } else if (minorTickMark != 3) {
                            z3 = false;
                            z4 = false;
                        } else {
                            if (c14365qy.m69877xk() >= 90) {
                                if (c14365qy.m69877xk() >= 225) {
                                }
                                z3 = true;
                                z4 = false;
                            }
                            z3 = false;
                        }
                        fM56897x13 = c12025x6.m56897x1();
                        fM56895kk3 = c12025x6.m56895kk();
                        while (true) {
                            if ((c12025x6.m56895kk() <= fM56895kk3 || fM56895kk3 > c12025x66.m56895kk()) && (c12025x6.m56895kk() < fM56895kk3 || fM56895kk3 < c12025x66.m56895kk())) {
                                d2 = fM56895kk3;
                                if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk()) && C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x66.m56895kk())) {
                                    break;
                                }
                            }
                            if (z3) {
                                c14787xi2.m73393k4(fM56897x13, fM56895kk3, fM56897x13 + f2, fM56895kk3);
                            }
                            if (z4) {
                                c14787xi2.m73393k4(fM56897x13 - f2, fM56895kk3, fM56897x13, fM56895kk3);
                            }
                            fM56897x13 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56897x1;
                            fM56895kk3 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk;
                        }
                    } else {
                        z3 = true;
                    }
                    z4 = true;
                    fM56897x13 = c12025x6.m56897x1();
                    fM56895kk3 = c12025x6.m56895kk();
                    while (true) {
                        if (c12025x6.m56895kk() <= fM56895kk3) {
                        }
                        d2 = fM56895kk3;
                        if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk())) {
                            break;
                            break;
                        }
                        if (z3) {
                        }
                        if (z4) {
                        }
                        fM56897x13 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56897x1;
                        fM56895kk3 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk;
                    }
                } else {
                    z = true;
                }
                z2 = true;
                if (c14787xi2.m73384dy().isPlotOrderReversed()) {
                }
                c12025x62.CloneTo(c12025x66);
                float f72 = iM73373ak;
                fM56897x1 = (c12025x66.m56897x1() - c12025x6.m56897x1()) / f72;
                fM56895kk = (c12025x66.m56895kk() - c12025x6.m56895kk()) / f72;
                fM56897x12 = c12025x6.m56897x1();
                fM56895kk2 = c12025x6.m56895kk();
                while (true) {
                    if (c12025x6.m56895kk() <= fM56895kk2) {
                        c12025x6Arr = c12025x6ArrM72659kk;
                        d = fM56895kk2;
                        if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                        }
                    } else {
                        c12025x6Arr = c12025x6ArrM72659kk;
                        d = fM56895kk2;
                        if (C14116yg.m67497to(d) == C14116yg.m67497to(c12025x6.m56895kk())) {
                        }
                    }
                    if (z) {
                    }
                    if (!z2) {
                    }
                    fM56897x12 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56897x1;
                    fM56895kk2 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi.m73418um()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14), false) * fM56895kk;
                    c14787xi2 = c14787xi;
                    c12025x6ArrM72659kk = c12025x6Arr;
                    i8 = i8;
                    c = 225;
                    c2 = 'Z';
                }
                minorTickMark = c14787xi2.m73384dy().getMinorTickMark();
                if (minorTickMark == 0) {
                }
                z4 = true;
                fM56897x13 = c12025x6.m56897x1();
                fM56895kk3 = c12025x6.m56895kk();
                while (true) {
                    if (c12025x6.m56895kk() <= fM56895kk3) {
                    }
                    d2 = fM56895kk3;
                    if (C14116yg.m67497to(d2) != C14116yg.m67497to(c12025x6.m56895kk())) {
                    }
                    if (z3) {
                    }
                    if (z4) {
                    }
                    fM56897x13 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56897x1;
                    fM56895kk3 += C0841c4.m4455k4(baseUnitScale, C0841c4.m4487x1(c14787xi2.m73384dy().getBaseUnitScale(), c14787xi2.m73420uz(), C7019kk.m27462to(Double.valueOf(c14787xi2.m73374ar()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), false), C7019kk.m27462to(Double.valueOf(c14787xi2.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xi2.m73389ix()), 14), false) * fM56895kk;
                }
            }
            if (i8 <= 0) {
                return;
            }
            C12025x6 c12025x610 = c12025x6Arr[0];
            float f8 = i8;
            c12025x610.m56898x1(c12025x610.m56895kk() - f8);
            C12025x6 c12025x611 = c12025x6Arr[1];
            c12025x611.m56898x1(c12025x611.m56895kk() - f8);
            c12025x65 = c12025x6;
            i9 = 1;
            c12025x6ArrM72659kk = c12025x6Arr;
            c14365qyM73423wy = c14365qy;
            fM4453k4 = f;
            fM4486x1 = f2;
            i8 = 0;
            i10 = 0;
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14409rq c14409rq) {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea A[PHI: r24
      0x01ea: PHI (r24v1 char) = (r24v0 char), (r24v2 char) binds: [B:54:0x01e8, B:72:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70250k4(C14787xi c14787xi) {
        float fM56897x1;
        float fM56895kk;
        float fM56897x12;
        float fM56895kk2;
        char c;
        List<Object> list;
        int i;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        float fM56897x13;
        String strM4468k4;
        C12003du c12003duM63876k4;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        ?? r9 = 0;
        int type = c14365qyM73423wy.m69834fa().getType() != 73 ? c14365qyM73423wy.m69834fa().getType() : c14365qyM73423wy.m69834fa().getChartData().getSeries().get_Item(0).getType();
        C12025x6[] c12025x6ArrM72659kk = C14728w8.m72659kk(c14365qyM73423wy);
        char c2 = 2;
        if (c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed() || c14787xi.m73423wy().m69854ne().m73384dy().getCrossType() == 1) {
            fM56897x1 = c12025x6ArrM72659kk[2].m56897x1();
            fM56895kk = c12025x6ArrM72659kk[2].m56895kk() - c14365qyM73423wy.m69833e0().m64100du();
            fM56897x12 = c12025x6ArrM72659kk[3].m56897x1();
            fM56895kk2 = c12025x6ArrM72659kk[3].m56895kk() - c14365qyM73423wy.m69833e0().m64100du();
        } else {
            fM56897x1 = c12025x6ArrM72659kk[0].m56897x1();
            fM56895kk = c12025x6ArrM72659kk[0].m56895kk();
            fM56897x12 = c12025x6ArrM72659kk[1].m56897x1();
            fM56895kk2 = c12025x6ArrM72659kk[1].m56895kk();
        }
        c14787xi.m73393k4(fM56897x1, fM56895kk, fM56897x12, fM56895kk2);
        String strM5008to = c14787xi.m73423wy().m69865up().get_Item(0).m64944dy().get_Item(0).m5008to();
        float fM56895kk3 = (c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed() || c14787xi.m73423wy().m69854ne().m73384dy().getCrossType() == 1) ? ((c12025x6ArrM72659kk[2].m56895kk() - c14365qyM73423wy.m69833e0().m64100du()) - C0841c4.m4453k4(c14787xi.m73400kk().m56639dy())) - c14787xi.m73380du().m56862kk() : c12025x6ArrM72659kk[0].m56895kk() + C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        List<Object> list2 = c14787xi.f50098m9;
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73389ix()) : c14787xi.m73389ix();
        double dM73391k42 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73410ne()) : c14787xi.m73410ne();
        double dM73391k43 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        int i2 = 0;
        while (i2 < c14787xi.f50098m9.size()) {
            Object obj = c14787xi.f50098m9.get_Item(i2);
            Class cls = Double.TYPE;
            double dDoubleValue = ((Double) C7019kk.m27464to(obj, cls)).doubleValue();
            double dM73424x1 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73424x1(dDoubleValue) : dDoubleValue;
            int i3 = i2 - 1;
            if (i3 <= 0) {
                int i4 = i2 + 1;
                c = c2;
                if (i4 < list2.size() && C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list2.get_Item(i4), cls)).doubleValue())) != dM73391k43) {
                    list = list2;
                    i = i2;
                }
                i2 = i + 1;
                list2 = list;
                c2 = c;
                r9 = 0;
            } else if (C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list2.get_Item(i3), cls)).doubleValue())) != dM73391k43) {
                list = list2;
                i = i2;
                c = c2;
                i2 = i + 1;
                list2 = list;
                c2 = c;
                r9 = 0;
            } else {
                c = c2;
            }
            float fM64121to = (float) (((dDoubleValue - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) c14365qyM73423wy.m69833e0().m64121to()));
            if (c14787xi.m73423wy().m69854ne().m73384dy().isPlotOrderReversed() || c14787xi.m73423wy().m69854ne().m73384dy().getCrossType() == 1) {
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    c12025x6 = c12025x6ArrM72659kk[3];
                    fM56897x13 = c12025x6.m56897x1() - fM64121to;
                } else {
                    c12025x62 = c12025x6ArrM72659kk[c];
                    fM56897x13 = c12025x62.m56897x1() + fM64121to;
                }
            } else if (c14787xi.m73384dy().isPlotOrderReversed()) {
                c12025x6 = c12025x6ArrM72659kk[1];
                fM56897x13 = c12025x6.m56897x1() - fM64121to;
            } else {
                c12025x62 = c12025x6ArrM72659kk[r9];
                fM56897x13 = c12025x62.m56897x1() + fM64121to;
            }
            if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
                if (ChartTypeCharacterizer.m761jd(type)) {
                    dM73424x1 /= 100.0d;
                    strM5008to = "0%";
                }
                String str = strM5008to;
                if (!c14787xi.m73384dy().isLogarithmic()) {
                    dM73424x1 *= C0841c4.m4452k4(c14787xi);
                }
                C12003du c12003duClone = c14787xi.m73413to().Clone();
                if (c14787xi.m73385fa()) {
                    strM4468k4 = C13729ki.m63880k4(Double.valueOf(dM73424x1), str, (boolean) r9);
                    c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), str, c12003duClone.Clone());
                } else {
                    strM4468k4 = C0841c4.m4468k4(Double.valueOf(dM73424x1), c14787xi);
                    c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone());
                }
                c12003duM63876k4.CloneTo(c12003duClone);
                float f = c14787xi.f50094k4;
                i = i2;
                list = list2;
                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM56897x13 - (f / 2.0f), fM56895kk3, f, c14787xi.f50110x1).Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), 1, 1, c14365qyM73423wy);
                strM5008to = str;
            }
            i2 = i + 1;
            list2 = list;
            c2 = c;
            r9 = 0;
        }
        m70256x1(c14787xi);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70251k4(C14787xi c14787xi, C14365qy c14365qy) {
        float fM56897x1;
        int i;
        int i2;
        int i3;
        boolean z;
        String strM4468k4;
        C12003du c12003duM63876k4;
        C13743kq c13743kqM69833e0 = c14365qy.m69833e0();
        C12025x6 c12025x6Clone = C14728w8.m72650du(c14365qy).Clone();
        c14787xi.m73393k4(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk() - c13743kqM69833e0.m64100du());
        String strM5008to = c14365qy.m69865up().get_Item(0).m64944dy().get_Item(0).m5008to();
        float fM4453k4 = C0841c4.m4453k4(c14787xi.m73400kk().m56639dy());
        if (c12025x6Clone.m56897x1() > c14365qy.m69833e0().m64106h4()) {
            fM56897x1 = c12025x6Clone.m56897x1() + fM4453k4;
            i = 0;
        } else {
            fM56897x1 = (c12025x6Clone.m56897x1() - c14787xi.f50094k4) - fM4453k4;
            i = 2;
        }
        List<Object> list = c14787xi.f50098m9;
        double dM73391k4 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73389ix()) : c14787xi.m73389ix();
        double dM73391k42 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73410ne()) : c14787xi.m73410ne();
        double dM73391k43 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73391k4(c14787xi.m73418um()) : c14787xi.m73418um();
        int i4 = 0;
        while (i4 < c14787xi.f50098m9.size()) {
            Object obj = c14787xi.f50098m9.get_Item(i4);
            Class cls = Double.TYPE;
            double dDoubleValue = ((Double) C7019kk.m27464to(obj, cls)).doubleValue();
            double dM73424x1 = c14787xi.m73384dy().isLogarithmic() ? c14787xi.m73424x1(dDoubleValue) : dDoubleValue;
            int i5 = i4 - 1;
            if (i5 <= 0 ? (i2 = i4 + 1) >= list.size() || C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i2), cls)).doubleValue())) == dM73391k43 : C14116yg.m67475k4(kc0.m63750k4(dDoubleValue, ((Double) C7019kk.m27464to(list.get_Item(i5), cls)).doubleValue())) == dM73391k43) {
                float fM64100du = (float) (((dDoubleValue - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) c14365qy.m69833e0().m64100du()));
                float fM56895kk = !c14787xi.m73384dy().isPlotOrderReversed() ? c12025x6Clone.m56895kk() - fM64100du : (c12025x6Clone.m56895kk() - c13743kqM69833e0.m64100du()) + fM64100du;
                if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
                    if (ChartTypeCharacterizer.m761jd(c14365qy.m69834fa().getType() != 73 ? c14365qy.m69834fa().getType() : c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getType())) {
                        dM73424x1 /= 100.0d;
                        strM5008to = "0%";
                    }
                    if (!c14787xi.m73384dy().isLogarithmic()) {
                        dM73424x1 *= C0841c4.m4452k4(c14787xi);
                    }
                    C12003du c12003duClone = c14787xi.m73413to().Clone();
                    if (c14787xi.m73385fa()) {
                        strM4468k4 = C13729ki.m63880k4((Object) Double.valueOf(dM73424x1), strM5008to, false);
                        c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), strM5008to, c12003duClone.Clone());
                    } else {
                        strM4468k4 = C0841c4.m4468k4(Double.valueOf(dM73424x1), c14787xi);
                        c12003duM63876k4 = C13729ki.m63876k4(Double.valueOf(dM73424x1), c14787xi.m73384dy().getNumberFormat(), c12003duClone.Clone());
                    }
                    c12003duM63876k4.CloneTo(c12003duClone);
                    float f = c14787xi.f50110x1;
                    i3 = i4;
                    z = false;
                    C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(fM56897x1, fM56895kk - (f / 2.0f), c14787xi.f50094k4, f).Clone())).Clone(), strM4468k4, c14787xi.m73386h4(), c14787xi.m73425x1(), c12003duClone.Clone(), i, 2, c14365qy);
                } else {
                    i3 = i4;
                    z = false;
                }
                m70245k4(c12025x6Clone.m56897x1(), fM56895kk, c14787xi);
            } else {
                i3 = i4;
                z = false;
            }
            i4 = i3 + 1;
        }
        m70244k4(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk() - c13743kqM69833e0.m64100du(), c12025x6Clone.m56895kk(), c14787xi);
    }
}
