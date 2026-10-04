package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1760uz;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C6857wl extends AbstractC6841rv {
    /* JADX INFO: renamed from: k4 */
    public static float m26888k4(C11315h4 c11315h4) {
        float fM56683x1 = (c11315h4.m54467yd() || c11315h4.m54411jd() == null || C14113y2.m67411k4(c11315h4.m54411jd().m58148ks()) || c11315h4.m54431kk().m56679kk() || c11315h4.m54456x1().m56679kk()) ? 1.0f : ((c11315h4.m54431kk().m56683x1() / c11315h4.m54456x1().m56683x1()) * c11315h4.m54456x1().m56663c5()) / c11315h4.m54431kk().m56663c5();
        if (fM56683x1 > 1.0f) {
            return 1.0f;
        }
        return fM56683x1;
    }

    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        C1760uz c1760uz = (C1760uz) c1752sv;
        if ((c1760uz.m9476to() & 2) > 0) {
            abstractC12008jd.mo17594x1(new C11999ar(c11315h4.m54468yj().Clone()), c1760uz.m9465h4().m58223h4().Clone());
        }
        if (c11315h4.m54411jd() == null) {
            return;
        }
        C11999ar c11999ar = new C11999ar(c11315h4.m54405fa().Clone());
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        int i = 1;
        if ((c1760uz.m9476to() & 128) > 0) {
            c12019um.m56817kk(c12019um.m56816kk() | 1);
        }
        if ((c1760uz.m9476to() & 2048) > 0) {
            c12019um.m56813k4(C11697x1.m55250kk().m55262dy(), 2);
        }
        if ((c1760uz.m9476to() & 1024) > 0) {
            c12019um.m56813k4(C11697x1.m55252to().m55262dy(), 1);
        }
        int iM9477x1 = c1760uz.m9477x1();
        int iM9466k4 = c1760uz.m9466k4();
        if ((c11315h4.m54437ks() & 1) == 1) {
            iM9477x1 = c11315h4.m54465x6().m56708k4();
            iM9466k4 = c11315h4.m54465x6().m56713x1();
        }
        int i2 = iM9477x1;
        int i3 = iM9466k4;
        C12025x6 c12025x6 = new C12025x6(i2, i3);
        String strMo26682x1 = m26889k4(c11315h4.m54411jd().m58138jd()).mo26682x1(c1760uz.m9475m9(), 0, c1760uz.m9473kk());
        C12013m9 c12013m9M58160x6 = c11315h4.m54411jd().m58160x6();
        C9579bv c9579bvM58151ne = c11315h4.m54411jd().m58151ne();
        if ((c1760uz.m9476to() & 4) > 0) {
            abstractC12008jd.mo17520k4(c1760uz.m9465h4().m58223h4().Clone(), 0);
        }
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        AbstractC12008jd abstractC12008jd3 = abstractC12008jd;
        C12025x6 c12025x6Clone = m26890k4(c12025x6.Clone(), strMo26682x1, c9579bvM58151ne, c12013m9M58160x6.m56639dy(), abstractC12008jd3, c11315h4).Clone();
        float fM56897x1 = c12025x6Clone.m56897x1() - c12025x6.m56897x1();
        float fM56895kk = c12025x6Clone.m56895kk() - c12025x6.m56895kk();
        if (c11315h4.m54411jd().m58153to() != 0) {
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4((-c11315h4.m54411jd().m58153to()) / 10.0f, c12025x6.Clone());
            abstractC12008jd3.mo17499k4(c11913yj);
        }
        if (c1760uz.m9464dy() == null || c1760uz.m9464dy().length <= 0) {
            C12025x6 c12025x62 = new C12025x6(c12025x6.m56897x1() + fM56897x1, c12025x6.m56895kk() + fM56895kk);
            abstractC12008jd2 = abstractC12008jd;
            m26891k4(abstractC12008jd2, strMo26682x1, c12013m9M58160x6, c11999ar, c12025x62, c12019um);
        } else {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < strMo26682x1.length()) {
                String strM67537ne = C14117yj.m67537ne(strMo26682x1.charAt(i4));
                int i7 = i;
                String str = strMo26682x1;
                C12025x6 c12025x6Clone2 = C12025x6.m56886x1(c12025x6.Clone(), new C12015qq(fM56897x1 + i5, fM56895kk)).Clone();
                C12019um c12019um2 = c12019um;
                float f = fM56895kk;
                int i8 = i4;
                int i9 = i5;
                C11999ar c11999ar2 = c11999ar;
                C12013m9 c12013m9 = c12013m9M58160x6;
                m26891k4(abstractC12008jd3, strM67537ne, c12013m9, c11999ar2, c12025x6Clone2, c12019um2);
                int iMo26658k4 = m26889k4(c11315h4.m54411jd().m58138jd()).mo26658k4(C14117yj.m67537ne(str.charAt(i8)));
                int i10 = 0;
                while (i10 < iMo26658k4) {
                    i9 += c1760uz.m9464dy()[i6];
                    i10++;
                    i6++;
                }
                int i11 = i8 + 1;
                abstractC12008jd3 = abstractC12008jd;
                c12013m9M58160x6 = c12013m9;
                strMo26682x1 = str;
                i = i7;
                i4 = i11;
                c11999ar = c11999ar2;
                fM56895kk = f;
                i5 = i9;
                c12019um = c12019um2;
            }
            int i12 = i5;
            if ((c11315h4.m54437ks() & 1) == i) {
                c11315h4.m54435kk(new C12016rv(i2 + i12, i3));
            }
            abstractC12008jd2 = abstractC12008jd;
        }
        abstractC12008jd2.mo17496k4(c11893c5Mo17583x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m26889k4(byte b) {
        int i;
        AbstractC6747ar abstractC6747arM26635ix = AbstractC6747ar.m26635ix();
        if (b == -122) {
            i = 936;
        } else if (b == -120) {
            i = 950;
        } else if (b == -70) {
            i = 1257;
        } else if (b == -52) {
            i = 1251;
        } else if (b == -34) {
            i = 874;
        } else if (b == -18) {
            i = 1250;
        } else if (b == 77) {
            i = 10029;
        } else if (b == -79) {
            i = 1255;
        } else if (b == -78) {
            i = 1256;
        } else if (b == -1) {
            i = 437;
        } else {
            if (b == 0) {
                return AbstractC6747ar.m26644to(1252);
            }
            if (b == 1) {
                return AbstractC6747ar.m26634h4();
            }
            if (b == 2) {
                return AbstractC6747ar.m26644to(1252);
            }
            switch (b) {
                case -128:
                    i = 932;
                    break;
                case -127:
                    i = 949;
                    break;
                case -126:
                    i = 1361;
                    break;
                default:
                    switch (b) {
                        case -95:
                            i = 1253;
                            break;
                        case -94:
                            i = 1254;
                            break;
                        case -93:
                            i = 1258;
                            break;
                        default:
                            return abstractC6747arM26635ix;
                    }
                    break;
            }
        }
        return AbstractC6747ar.m26644to(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12025x6 m26890k4(C12025x6 c12025x6, String str, C9579bv c9579bv, float f, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        float f2;
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        int iM46794m9 = c9579bv.m46794m9();
        int iM46760c5 = c9579bv.m46760c5();
        int iM46766dy = c9579bv.m46766dy();
        int i = iM46760c5 + iM46766dy;
        float f3 = f / iM46794m9;
        if ((c11315h4.m54437ks() & 24) != 24) {
            if ((c11315h4.m54437ks() & 8) == 8) {
                f2 = i;
            }
            float fM26888k4 = m26888k4(c11315h4) * c9579bv.m46776k4(str, f);
            if ((c11315h4.m54437ks() & 6) == 6) {
                if ((c11315h4.m54437ks() & 2) == 2) {
                }
                return new C12025x6(fM56897x1, fM56895kk);
            }
            fM26888k4 /= 2.0f;
            fM56897x1 -= fM26888k4;
            return new C12025x6(fM56897x1, fM56895kk);
        }
        f2 = iM46766dy;
        fM56895kk -= f2 * f3;
        float fM26888k42 = m26888k4(c11315h4) * c9579bv.m46776k4(str, f);
        if ((c11315h4.m54437ks() & 6) == 6) {
        }
        fM56897x1 -= fM26888k42;
        return new C12025x6(fM56897x1, fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m26891k4(AbstractC12008jd abstractC12008jd, String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12025x6 c12025x6, C12019um c12019um) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        AbstractC12008jd abstractC12008jd3;
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        try {
            float[] fArrM55776k4 = c11913yjMo17577u4.m55776k4();
            if (C14116yg.m67480k4(fArrM55776k4[0] - fArrM55776k4[3]) < 1.0E-4d) {
                try {
                    abstractC12008jd2 = abstractC12008jd;
                    try {
                        abstractC12008jd2.mo17554k4(str, c12013m9, abstractC12024x1, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12025x6.m56895kk())), 14), c12019um);
                        abstractC12008jd2 = abstractC12008jd2;
                        abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    abstractC12008jd3 = abstractC12008jd;
                    abstractC12008jd2 = abstractC12008jd3;
                }
            } else {
                abstractC12008jd3 = abstractC12008jd;
                try {
                    float f = fArrM55776k4[3];
                    abstractC12008jd3.mo17588x1(new C11913yj(f, fArrM55776k4[1], fArrM55776k4[2], f, fArrM55776k4[4], fArrM55776k4[5]));
                    abstractC12008jd2 = abstractC12008jd3;
                    try {
                        abstractC12008jd2.mo17554k4(str, c12013m9, abstractC12024x1, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((c12025x6.m56897x1() * fArrM55776k4[0]) / fArrM55776k4[3])), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12025x6.m56895kk())), 14), c12019um);
                        abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC12008jd2 = abstractC12008jd3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            abstractC12008jd2 = abstractC12008jd;
        }
        abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
        throw th;
    }
}
