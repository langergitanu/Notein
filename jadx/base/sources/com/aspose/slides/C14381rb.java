package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11687fa;
import com.aspose.slides.internal.p463vm.C11689jd;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.rb */
/* JADX INFO: loaded from: classes3.dex */
class C14381rb {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11896dy m70044k4(String str, AbstractC14897zn abstractC14897zn, qy7 qy7Var, C12025x6 c12025x6, C12019um c12019um, float f) {
        String string;
        int i;
        qy7 qy7Var2;
        C14251ot c14251ot;
        C11896dy c11896dy = new C11896dy(1);
        if (!C14113y2.m67411k4(str)) {
            lrb lrbVar = qy7Var.f48466du;
            if (lrbVar != null && lrbVar.getLanguageId() != null) {
                if (C7019kk.m27469x1(abstractC14897zn, C14250os.class)) {
                    String strM1521k4 = Fonts.m1521k4(qy7Var.f48466du.getLanguageId());
                    if (("Arab".equals(strM1521k4) || "Hebr".equals(strM1521k4)) && qy7Var.m69930x6() == 0.0f) {
                        C6765kp c6765kp = new C6765kp();
                        C11687fa c11687faM55122x1 = C11689jd.m55122x1(str);
                        while (c11687faM55122x1.hasNext()) {
                            c6765kp.m26786k4(0, c11687faM55122x1.m55107k4());
                        }
                        string = c6765kp.toString();
                    }
                    C14251ot c14251otM69882b3 = qy7Var.m69882b3();
                    if (qy7Var.m69921up() == 1) {
                        m70051k4(c11896dy, string, abstractC14897zn, qy7Var, c14251otM69882b3, c12025x6.Clone(), c12019um, f);
                        return c11896dy;
                    }
                    String str2 = string;
                    qy7 qy7VarM69898k4 = !C14064he.m66715kk(c14251otM69882b3.m68808du()) ? qy7Var.m69898k4(qy7Var.m69915rv() * c14251otM69882b3.m68808du()) : qy7Var.cloneT();
                    C14251ot c14251otM69882b32 = qy7VarM69898k4.m69882b3();
                    C6765kp c6765kp2 = new C6765kp(str2.length());
                    boolean zM74605k4 = AbstractC14897zn.m74605k4(str2, 0);
                    int i2 = 0;
                    while (i2 < str2.length()) {
                        while (true) {
                            i = i2 + 1;
                            c6765kp2.m26780k4(str2.charAt(i2));
                            if (i >= str2.length() || zM74605k4 != AbstractC14897zn.m74605k4(str2, i)) {
                                break;
                            }
                            i2 = i;
                        }
                        String string2 = c6765kp2.toString();
                        if (zM74605k4) {
                            string2 = C14113y2.m67371jd(string2);
                            qy7Var2 = qy7VarM69898k4;
                            c14251ot = c14251otM69882b32;
                        } else {
                            qy7Var2 = qy7Var;
                            c14251ot = c14251otM69882b3;
                        }
                        m70051k4(c11896dy, string2, abstractC14897zn, qy7Var2, c14251ot, c12025x6.Clone(), c12019um, f);
                        i2 = i;
                    }
                }
            }
            string = str;
            C14251ot c14251otM69882b33 = qy7Var.m69882b3();
            if (qy7Var.m69921up() == 1) {
            }
        }
        return c11896dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m70045k4(AbstractC12024x1 abstractC12024x1) {
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        if (C7019kk.m27469x1(abstractC12024x1, C12012lr.class)) {
            c11913yj = ((C12012lr) abstractC12024x1).m56624m9();
        }
        if (C7019kk.m27469x1(abstractC12024x1, C11909up.class)) {
            c11913yj = ((C11909up) abstractC12024x1).m55719ck();
        }
        return C7019kk.m27469x1(abstractC12024x1, C11906rv.class) ? ((C11906rv) abstractC12024x1).m55685fa() : c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m70046k4(C12003du c12003du, byte b) {
        int i = 255;
        int i2 = b & 255;
        int iM56501c5 = c12003du.m56501c5() & 255;
        if (i2 > iM56501c5) {
            iM56501c5 = i2;
            i2 = iM56501c5;
        }
        float f = i2;
        int iM27462to = C7019kk.m27462to(Float.valueOf(f - (((255 - iM56501c5) / 255.0f) * f)), 13);
        if (iM27462to <= 255) {
            i = iM27462to < 0 ? 0 : iM27462to;
        }
        return C12003du.m56400k4(i, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m70047k4(IEffectFormatEffectiveData iEffectFormatEffectiveData, C12007ix c12007ix) {
        if (iEffectFormatEffectiveData.isNoEffects()) {
            return c12007ix;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        C12007ix c12007ixClone = c12007ix.Clone();
        if (iEffectFormatEffectiveData.getOuterShadowEffect() != null) {
            C12007ix.m56549x1(c12007ix.Clone(), new nv2(iEffectFormatEffectiveData.getOuterShadowEffect()).m68225k4(c11896dy, (AbstractC14897zn) null).Clone().Clone()).CloneTo(c12007ixClone);
        }
        if (iEffectFormatEffectiveData.getReflectionEffect() != null) {
            C12007ix.m56549x1(c12007ix.Clone(), new lzv(iEffectFormatEffectiveData.getReflectionEffect()).m64653k4(c11896dy, (AbstractC14897zn) null).Clone().Clone()).CloneTo(c12007ixClone);
        }
        if (iEffectFormatEffectiveData.getGlowEffect() != null) {
            C12007ix.m56549x1(c12007ix.Clone(), new C14871z3(iEffectFormatEffectiveData.getGlowEffect()).m74296k4(c11896dy).Clone().Clone()).CloneTo(c12007ixClone);
        }
        return c12007ixClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12008jd m70048k4(C12009k4 c12009k4, AbstractC14897zn abstractC14897zn) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        AbstractC12008jd abstractC12008jdM74608ar = abstractC14897zn.m74608ar();
        if (abstractC12008jdM74608ar != null) {
            abstractC12008jdM56582k4.mo17586x1(abstractC12008jdM74608ar.mo17473c5());
            abstractC12008jdM56582k4.mo17481h4(abstractC12008jdM74608ar.mo17603x6());
            abstractC12008jdM56582k4.mo17478dy(abstractC12008jdM74608ar.mo17482ix());
            abstractC12008jdM56582k4.mo17476du(abstractC12008jdM74608ar.mo17566ks());
            abstractC12008jdM56582k4.mo17491k4(abstractC12008jdM74608ar.mo17579up());
            abstractC12008jdM56582k4.mo17574to(abstractC12008jdM74608ar.mo17605yj());
        }
        return abstractC12008jdM56582k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70049k4(C11896dy c11896dy, String str, C12004dy c12004dy, int i, float f, qy7 qy7Var, C12025x6 c12025x6, C12019um c12019um) {
        m70050k4(c11896dy, str, c12004dy, i, f, qy7Var, c12025x6.Clone(), null, c12019um);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70050k4(C11896dy c11896dy, String str, C12004dy c12004dy, int i, float f, qy7 qy7Var, C12025x6 c12025x6, float[] fArr, C12019um c12019um) {
        if (fArr == null) {
            c11896dy.m55552k4(str, c12004dy, i, f, c12025x6.Clone(), c12019um);
        } else {
            if (str.length() != fArr.length) {
                throw new InvalidOperationException();
            }
            for (int i2 = 0; i2 < fArr.length; i2++) {
                c11896dy.m55552k4(C14117yj.m67537ne(str.charAt(i2)), c12004dy, i, f, new C12025x6(fArr[i2], c12025x6.m56895kk()).Clone(), c12019um);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[LOOP:2: B:36:0x0081->B:38:0x0087, LOOP_END] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70051k4(C11896dy c11896dy, String str, AbstractC14897zn abstractC14897zn, qy7 qy7Var, C14251ot c14251ot, C12025x6 c12025x6, C12019um c12019um, float f) {
        float f2;
        C6765kp c6765kp;
        int i;
        int i2;
        String str2;
        char c;
        int i3;
        C11687fa c11687faM55122x1;
        String string = str;
        int i4 = 0;
        if (string.length() > 2 && string.charAt(0) == 8237 && androidx.core.content.OooO0O0.OooO00o(1, string) == 8236) {
            C6765kp c6765kp2 = new C6765kp();
            for (int i5 = 0; i5 < string.length(); i5++) {
                if (string.charAt(i5) == 8205 || string.charAt(i5) == 8237 || string.charAt(i5) == 8238 || string.charAt(i5) == 8236) {
                    for (int i6 = 0; i6 < string.length(); i6++) {
                        if (string.charAt(i6) != 8205 && string.charAt(i6) != 8237 && string.charAt(i6) != 8238 && string.charAt(i6) != 8236) {
                            c6765kp2.m26780k4(string.charAt(i6));
                        }
                    }
                    string = c6765kp2.toString();
                    C6765kp c6765kp3 = new C6765kp();
                    c11687faM55122x1 = C11689jd.m55122x1(string);
                    while (c11687faM55122x1.hasNext()) {
                        c6765kp3.m26786k4(0, c11687faM55122x1.m55107k4());
                    }
                    string = c6765kp3.toString();
                }
            }
            C6765kp c6765kp32 = new C6765kp();
            c11687faM55122x1 = C11689jd.m55122x1(string);
            while (c11687faM55122x1.hasNext()) {
            }
            string = c6765kp32.toString();
        }
        C12013m9 c12013m9M68811k4 = c14251ot.m68811k4();
        int iM56642jd = c12013m9M68811k4.m56642jd();
        C12004dy c12004dyM56651x1 = c12013m9M68811k4.m56651x1();
        float fM69915rv = qy7Var.m69915rv();
        c12025x6.m56898x1(c12025x6.m56895kk() - (((qy7Var.m69926x1() * fM69915rv) / 100.0f) + (c12013m9M68811k4.m56644k4(abstractC14897zn.m74608ar()) * (c12004dyM56651x1.m56536x1(iM56642jd) / c12004dyM56651x1.m56526du(iM56642jd)))));
        if (qy7Var.m69926x1() != 0) {
            fM69915rv *= 0.66f;
        }
        float f3 = fM69915rv;
        String str3 = null;
        float f4 = 0.0f;
        float[] fArrM69924wl = (!C7019kk.m27469x1(abstractC14897zn, vhx.class) || qy7Var.m69924wl() == null || f == 0.0f) ? qy7Var.m69924wl() : null;
        if (string.length() <= 0 || (C14116yg.m67480k4(qy7Var.m69930x6()) <= 0.005d && C14064he.m66715kk(qy7Var.m69883bv()))) {
            f2 = 0.0f;
            m70050k4(c11896dy, string, c12004dyM56651x1, iM56642jd, f3, qy7Var, c12025x6.Clone(), fArrM69924wl, c12019um);
        } else {
            C6765kp c6765kp4 = new C6765kp();
            int[] iArr = {0};
            int[] iArr2 = {0};
            m70055k4(string, iArr, iArr2);
            int i7 = iArr[0];
            int i8 = iArr2[0];
            int length = 0;
            while (true) {
                if ((i7 == i8 || !C3047dy.m12849ck(string.charAt(i7))) && c6765kp4.m26807x1() > 0) {
                    int i9 = i7;
                    String string2 = c6765kp4.toString();
                    f2 = f4;
                    c6765kp4.m26809x1(i4, c6765kp4.m26807x1());
                    if (fArrM69924wl != null) {
                        float[] fArr = new float[string2.length()];
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(fArrM69924wl), length, AbstractC14092to.m67208k4(fArr), i4, string2.length());
                        c6765kp = c6765kp4;
                        i = i8;
                        i2 = i9;
                        m70050k4(c11896dy, string2, c12004dyM56651x1, iM56642jd, f3, qy7Var, c12025x6.Clone(), fArr, c12019um);
                        length = string2.length() + length;
                        str2 = str3;
                    } else {
                        c6765kp = c6765kp4;
                        String str4 = str3;
                        i = i8;
                        int i10 = length;
                        i2 = i9;
                        if (!C14113y2.m67411k4(str4)) {
                            c12025x6.m56891k4((abstractC14897zn.m74611k4(C14113y2.m67408k4(str4, string2), qy7Var).m56699x1() - (abstractC14897zn.m74611k4(string2, qy7Var).m56699x1() + abstractC14897zn.m74611k4(str4, qy7Var).m56699x1())) + c12025x6.m56897x1());
                        }
                        m70049k4(c11896dy, string2, c12004dyM56651x1, iM56642jd, f3, qy7Var, c12025x6.Clone(), c12019um);
                        c12025x6.m56891k4(abstractC14897zn.m74611k4(string2, qy7Var).m56699x1() + c12025x6.m56897x1());
                        length = i10;
                        str2 = string2;
                    }
                } else {
                    i2 = i7;
                    i = i8;
                    f2 = f4;
                    c6765kp = c6765kp4;
                    str2 = str3;
                    length = length;
                }
                if (i2 >= i) {
                    c = 8205;
                    i3 = i2;
                } else if (C3047dy.m12856jd(string.charAt(i2)) == 4) {
                    c = 8205;
                    c6765kp.m26780k4((char) 8205);
                    i3 = i2 + 1;
                    c6765kp.m26780k4(string.charAt(i2));
                    c6765kp.m26780k4((char) 8205);
                } else {
                    c = 8205;
                    i3 = i2 + 1;
                    c6765kp.m26780k4(string.charAt(i2));
                }
                if (c6765kp.m26807x1() <= 0) {
                    break;
                }
                str3 = str2;
                i7 = i3;
                i8 = i;
                c6765kp4 = c6765kp;
                i4 = 0;
                f4 = f2;
            }
        }
        if (!C7019kk.m27469x1(abstractC14897zn, vhx.class) || qy7Var.m69924wl() == null || f == f2) {
            return;
        }
        C11913yj c11913yj = new C11913yj();
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        float fM56557jd = c12007ixClone.m56557jd();
        float fM56551ck = c12007ixClone.m56551ck();
        c11913yj.m55777kk(fM56557jd, fM56551ck);
        c11913yj.m55763k4(f / c12007ixClone.m56550c5(), 1.0f);
        c11913yj.m55777kk(-fM56557jd, -fM56551ck);
        c11896dy.m55577x1(c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70052k4(C12009k4 c12009k4, byte b, int i) {
        if (c12009k4.mo15753jd() != 2498570 || i < 1) {
            return;
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, c12009k4.mo15753jd());
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr = new byte[iMo15757m9];
        byte[] bArr2 = (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4();
        System.arraycopy(bArr2, 0, bArr, 0, iMo15757m9);
        int iMo15760yj = c12009k4.mo15760yj() << 2;
        int i2 = i << 2;
        int iMo15757m92 = c12009k4.mo15757m9() - i;
        int i3 = (iMo15760yj - i2) + 3;
        for (int i4 = 0; i4 < c12009k4.mo15757m9(); i4++) {
            int i5 = i4 * iMo15760yj;
            if (i4 < i || i4 >= iMo15757m92) {
                for (int i6 = 3; i6 < iMo15760yj; i6 += 4) {
                    bArr[i5 + i6] = b;
                }
            } else {
                for (int i7 = 3; i7 <= i2; i7 += 4) {
                    bArr[i5 + i7] = b;
                }
                for (int i8 = i3; i8 < iMo15760yj; i8 += 4) {
                    bArr[i5 + i8] = b;
                }
            }
        }
        System.arraycopy(bArr, 0, bArr2, 0, iMo15757m9);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70053k4(C12009k4 c12009k4, byte[] bArr) {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()).Clone(), 3, c12009k4.mo15753jd());
        System.arraycopy(bArr, 0, (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, bArr.length);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70054k4(AbstractC12024x1 abstractC12024x1, C11913yj c11913yj) {
        if (C7019kk.m27469x1(abstractC12024x1, C12012lr.class)) {
            ((C12012lr) abstractC12024x1).m56623kk(c11913yj);
        }
        if (C7019kk.m27469x1(abstractC12024x1, C11909up.class)) {
            ((C11909up) abstractC12024x1).m55730kk(c11913yj);
        }
        if (C7019kk.m27469x1(abstractC12024x1, C11906rv.class)) {
            ((C11906rv) abstractC12024x1).m55697kk(c11913yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70055k4(String str, int[] iArr, int[] iArr2) {
        iArr[0] = 0;
        iArr2[0] = str.length();
        if (str.charAt(0) == 8237) {
            iArr[0] = iArr[0] + 1;
        }
        if (androidx.core.content.OooO0O0.OooO00o(1, str) == 8236) {
            iArr2[0] = iArr2[0] - 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70056k4(C12009k4 c12009k4, C12003du c12003du) {
        byte bM56507jd = c12003du.m56507jd();
        byte bM56502ck = c12003du.m56502ck();
        byte bM56505fa = c12003du.m56505fa();
        if (c12009k4.mo15753jd() != 2498570) {
            return false;
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, c12009k4.mo15753jd());
        byte[] bArr = (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr2 = new byte[iMo15757m9];
        System.arraycopy(bArr, 0, bArr2, 0, iMo15757m9);
        for (int i = 0; i < iMo15757m9; i += 4) {
            if ((bArr2[i + 3] & 255) == 0) {
                bArr2[i] = bM56505fa;
                bArr2[i + 1] = bM56502ck;
                bArr2[i + 2] = bM56507jd;
            }
        }
        System.arraycopy(bArr2, 0, bArr, 0, iMo15757m9);
        c12009k4.m56605k4(c3983k4M56597k4);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m70057k4(C12009k4 c12009k4) {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()).Clone(), 3, c12009k4.mo15753jd());
        byte[] bArr = (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr2 = new byte[iMo15757m9];
        System.arraycopy(bArr, 0, bArr2, 0, iMo15757m9);
        c12009k4.m56605k4(c3983k4M56597k4);
        return bArr2;
    }
}
