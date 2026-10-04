package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class shu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.aspose.slides.IMotionPath, com.aspose.slides.MotionPath] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IMotionPath m70630k4(IMotionEffect iMotionEffect, String str, String str2) {
        boolean z;
        ?? r6;
        char c;
        ?? motionPath = new MotionPath();
        String strM67440x1 = str == null ? "" : C14113y2.m67440x1(str);
        int length = strM67440x1.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i != length) {
            char cCharAt = strM67440x1.charAt(i);
            int i4 = 4;
            if (cCharAt == 'C') {
                i2++;
                z = false;
                r6 = 2;
            } else if (cCharAt == 'E') {
                z = false;
                r6 = 4;
            } else if (cCharAt == 'Z') {
                z = false;
                r6 = 3;
            } else {
                if (cCharAt == 'c') {
                    i2++;
                    c = 2;
                } else if (cCharAt != 'e') {
                    if (cCharAt != 'z') {
                        if (cCharAt != 'L') {
                            if (cCharAt == 'M') {
                                i2++;
                                z = false;
                            } else if (cCharAt == 'l') {
                                i2++;
                                z = true;
                            } else {
                                if (cCharAt != 'm') {
                                    throw new PptxException("Unknow command.");
                                }
                                i2++;
                                c = 0;
                            }
                            r6 = z;
                        } else {
                            i2++;
                            z = false;
                            r6 = 1;
                        }
                    }
                }
                z = true;
                r6 = c;
            }
            if (str2 == null || str2.length() <= 0 || i2 == i3 || i2 > str2.length()) {
                i4 = 0;
            } else {
                char cCharAt2 = str2.charAt(i2 - 1);
                if (cCharAt2 == 'A') {
                    i3 = i2;
                    i4 = 1;
                } else if (cCharAt2 != 'F') {
                    if (cCharAt2 == 'a') {
                        i4 = 5;
                    } else if (cCharAt2 == 'f') {
                        i4 = 6;
                    } else if (cCharAt2 != 'S') {
                        if (cCharAt2 == 'T') {
                            i3 = i2;
                            i4 = 3;
                        } else if (cCharAt2 == 's') {
                            i4 = 8;
                        } else {
                            if (cCharAt2 != 't') {
                                throw new PptxException("Unknow command.");
                            }
                            i4 = 7;
                        }
                    }
                    i3 = i2;
                } else {
                    i3 = i2;
                    i4 = 2;
                }
            }
            int[] iArr = {i};
            motionPath.m2021k4(r6, m70634k4(strM67440x1, iArr), i4, z);
            i = iArr[0];
        }
        return motionPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m70635x1(IMotionPath iMotionPath) {
        IGenericEnumerator<IMotionCmdPath> it = iMotionPath.iterator();
        String strM67441x1 = "";
        while (it.hasNext()) {
            try {
                switch (it.next().getPointsType()) {
                    case 0:
                        break;
                    case 1:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'A');
                        continue;
                    case 2:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'F');
                        continue;
                    case 3:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'T');
                        continue;
                    case 4:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'S');
                        continue;
                    case 5:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'a');
                        continue;
                    case 6:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 'f');
                        continue;
                    case 7:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 't');
                        continue;
                    case 8:
                        strM67441x1 = C14113y2.m67441x1(strM67441x1, 's');
                        continue;
                    default:
                        throw new PptxException("fail.");
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                throw th;
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            throw th;
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return C14113y2.m67440x1(strM67441x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m70631k4(IMotionPath iMotionPath) {
        char c;
        IGenericEnumerator<IMotionCmdPath> it = iMotionPath.iterator();
        String strM67441x1 = "";
        while (it.hasNext()) {
            try {
                IMotionCmdPath next = it.next();
                int commandType = next.getCommandType();
                if (commandType == 0) {
                    c = next.isRelative() ? 'm' : 'M';
                } else if (commandType == 1) {
                    c = next.isRelative() ? 'l' : 'L';
                } else if (commandType == 2) {
                    c = next.isRelative() ? 'c' : 'C';
                } else if (commandType == 3) {
                    c = next.isRelative() ? 'z' : 'Z';
                } else {
                    if (commandType != 4) {
                        throw new PptxException("fail.");
                    }
                    c = next.isRelative() ? 'e' : 'E';
                }
                strM67441x1 = C14113y2.m67441x1(C14113y2.m67441x1(strM67441x1, c), ControlChar.SPACE_CHAR);
                if (((MotionCmdPath) next).m2012k4() != null) {
                    for (C12025x6 c12025x6 : ((MotionCmdPath) next).m2012k4()) {
                        strM67441x1 = C14113y2.m67400k4(C14113y2.m67400k4(strM67441x1, C14113y2.m67407k4(C14064he.m66711k4(c12025x6.m56897x1(), (InterfaceC14073kp) C11697x1.m55250kk()), Character.valueOf(ControlChar.SPACE_CHAR))), C14113y2.m67407k4(C14064he.m66711k4(c12025x6.m56895kk(), (InterfaceC14073kp) C11697x1.m55250kk()), Character.valueOf(ControlChar.SPACE_CHAR)));
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return C14113y2.m67440x1(strM67441x1);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m70636x1(String str, int[] iArr) {
        int i = iArr[0];
        if (i == -1) {
            return C14113y2.f47374k4;
        }
        int iM67434x1 = C14113y2.m67434x1(str, ControlChar.SPACE_CHAR, i);
        if (iM67434x1 == -1) {
            iM67434x1 = str.length();
        }
        int i2 = iArr[0];
        String strM67443x1 = C14113y2.m67443x1(str, i2, iM67434x1 - i2);
        iArr[0] = iM67434x1;
        return strM67443x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70632k4(IMotionEffect iMotionEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        com.aspose.slides.internal.p332p7.glt gltVar = (com.aspose.slides.internal.p332p7.glt) k4Var.mo2788k4("animMotion").m29542x1();
        no7VarArr[0] = gltVar.m32641jd();
        gltVar.m32643k4((byte) iMotionEffect.getOrigin());
        gltVar.m32651x1((byte) iMotionEffect.getPathEditMode());
        gltVar.m32644k4(iMotionEffect.getAngle());
        gltVar.m32645k4(m70631k4(iMotionEffect.getPath()));
        gltVar.m32652x1(m70635x1(iMotionEffect.getPath()));
        MotionEffect motionEffect = (MotionEffect) iMotionEffect;
        if (!C14064he.m66715kk(motionEffect.m2019x1().m56897x1()) && !C14064he.m66715kk(motionEffect.m2019x1().m56895kk())) {
            C13670j2.m63200k4(gltVar.m32650x1(), motionEffect.m2019x1().Clone());
        }
        if (!C14064he.m66715kk(motionEffect.m2015kk().m56897x1()) && !C14064he.m66715kk(motionEffect.m2015kk().m56895kk())) {
            C13670j2.m63200k4(gltVar.m32646kk(), motionEffect.m2015kk().Clone());
        }
        if (!C14064he.m66715kk(motionEffect.m2017to().m56897x1()) && !C14064he.m66715kk(motionEffect.m2017to().m56895kk())) {
            C13670j2.m63200k4(gltVar.m32642k4(), motionEffect.m2017to().Clone());
        }
        if (C14064he.m66715kk(motionEffect.m2013du().m56897x1()) || C14064he.m66715kk(motionEffect.m2013du().m56895kk())) {
            return;
        }
        C13670j2.m63200k4(gltVar.m32648to(), motionEffect.m2013du().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70633k4(IMotionEffect iMotionEffect, com.aspose.slides.internal.p332p7.glt gltVar) {
        iMotionEffect.setOrigin(gltVar.m32637du());
        iMotionEffect.setPathEditMode(gltVar.m32647m9());
        iMotionEffect.setAngle(gltVar.m32638dy());
        iMotionEffect.setPath(m70630k4(iMotionEffect, gltVar.m32640h4(), gltVar.m32635c5()));
        if (gltVar.m32639fa() != null) {
            ((MotionEffect) iMotionEffect).m2014k4(new C12025x6(gltVar.m32639fa().m42312k4(), gltVar.m32639fa().m42314x1()));
        }
        if (gltVar.m32649up() != null) {
            ((MotionEffect) iMotionEffect).m2020x1(new C12025x6(gltVar.m32649up().m42312k4(), gltVar.m32649up().m42314x1()));
        }
        if (gltVar.m32636ck() != null) {
            ((MotionEffect) iMotionEffect).m2016kk(new C12025x6(gltVar.m32636ck().m42312k4(), gltVar.m32636ck().m42314x1()));
        }
        if (gltVar.m32653yj() != null) {
            ((MotionEffect) iMotionEffect).m2018to(new C12025x6(gltVar.m32653yj().m42312k4(), gltVar.m32653yj().m42314x1()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6[] m70634k4(String str, int[] iArr) {
        if (str.charAt(iArr[0]) == 'Z' || str.charAt(iArr[0]) == 'z' || str.charAt(iArr[0]) == 'E' || str.charAt(iArr[0]) == 'e') {
            iArr[0] = iArr[0] + 1;
            while (iArr[0] + 1 < str.length()) {
                int i = iArr[0] + 1;
                iArr[0] = i;
                if (str.charAt(i) != ' ') {
                    return null;
                }
            }
            return null;
        }
        List list = new List();
        while (!C14117yj.m67539to(str.charAt(iArr[0])) && str.charAt(iArr[0]) != '-') {
            if (iArr[0] + 1 >= str.length()) {
                throw new PptxException("broken path.");
            }
            iArr[0] = iArr[0] + 1;
        }
        while (iArr[0] + 1 < str.length() && !C14117yj.m67519h4(str.charAt(iArr[0]))) {
            String strM70636x1 = m70636x1(str, iArr);
            iArr[0] = iArr[0] + 1;
            float[] fArr = {0.0f};
            float[] fArr2 = {0.0f};
            boolean z = C14064he.m66713k4(strM70636x1, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr) && C14064he.m66713k4(m70636x1(str, iArr), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr2);
            float f = fArr[0];
            float f2 = fArr2[0];
            if (z) {
                list.addItem(new C12025x6(f, f2).Clone());
            }
            while (iArr[0] + 1 < str.length()) {
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (str.charAt(i2) != ' ') {
                    break;
                }
            }
        }
        return (C12025x6[]) list.toArray(new C12025x6[0]);
    }
}
