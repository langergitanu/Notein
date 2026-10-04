package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10524lg;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10717xp;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class wkx {
    /* JADX INFO: renamed from: k4 */
    private static byte m72775k4(long j) {
        int i = (int) j;
        if (i == 0 || i == 1) {
            return (byte) 0;
        }
        return i != 2 ? (byte) -1 : (byte) 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m72776k4(byte b) {
        if (b == 0) {
            return 0L;
        }
        if (b == 1) {
            return 2L;
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m72777k4(String str) {
        String strM67401k4 = C14113y2.m67401k4(str, " -7 ", " ");
        C6765kp c6765kp = new C6765kp();
        char cCharAt = ' ';
        boolean z = false;
        for (int i = 0; i < strM67401k4.length(); i++) {
            if (!z || C14117yj.m67519h4(strM67401k4.charAt(i))) {
                if (C14117yj.m67519h4(strM67401k4.charAt(i))) {
                    if (C14113y2.m67429to("MLCZEmlcze", strM67401k4.charAt(i)) == -1) {
                        z = true;
                    } else {
                        if (cCharAt != ' ' && strM67401k4.charAt(i) != 'E' && strM67401k4.charAt(i) != 'e') {
                            c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                        }
                        z = false;
                    }
                } else if (strM67401k4.charAt(i) == '-' && cCharAt != ' ' && cCharAt != 'E' && cCharAt != 'e') {
                    c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                }
                c6765kp.m26780k4(strM67401k4.charAt(i));
                cCharAt = strM67401k4.charAt(i);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72778k4(com.aspose.slides.internal.p332p7.glt gltVar, C10409du c10409du, gi8 gi8Var) {
        if (gltVar == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10717xp c10717xp = new C10717xp();
        c10409du.m50513yj().addItem(c10717xp);
        m72780k4(gltVar, c10717xp);
        if (!C14113y2.m67411k4(gltVar.m32640h4())) {
            C10742z2 c10742z2 = new C10742z2(gltVar.m32640h4());
            c10742z2.m51407kk((short) 1);
            c10717xp.m50513yj().addItem(c10742z2);
        }
        C10486iy c10486iy = new C10486iy();
        c10717xp.m50513yj().addItem(c10486iy);
        ubb.m71612k4(gltVar.m32641jd(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72779k4(com.aspose.slides.internal.p332p7.glt gltVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m51380x6() == null) {
            throw new InvalidOperationException();
        }
        C10717xp c10717xpM51380x6 = c10562nk.m51380x6();
        l1y.m64245k4(gltVar.m32641jd(), c10562nk, c10717xpM51380x6.m51981du(), m4cVar);
        if (c10717xpM51380x6.m51983x1().m51185c5()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM32642k4 = gltVar.m32642k4();
            uc0VarM32642k4.m42313k4(c10717xpM51380x6.m51983x1().m51206x1());
            uc0VarM32642k4.m42315x1(c10717xpM51380x6.m51983x1().m51198kk());
        }
        if (c10717xpM51380x6.m51983x1().m51194jd()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM32650x1 = gltVar.m32650x1();
            uc0VarM32650x1.m42313k4(c10717xpM51380x6.m51983x1().m51203to());
            uc0VarM32650x1.m42315x1(c10717xpM51380x6.m51983x1().m51187du());
        }
        if (c10717xpM51380x6.m51983x1().m51186ck()) {
            com.aspose.slides.internal.p332p7.uc0 uc0VarM32646kk = gltVar.m32646kk();
            uc0VarM32646kk.m42313k4(c10717xpM51380x6.m51983x1().m51191h4());
            uc0VarM32646kk.m42315x1(c10717xpM51380x6.m51983x1().m51201m9());
        }
        gltVar.m32643k4(m72775k4(c10717xpM51380x6.m51983x1().m51190dy()));
        gltVar.m32645k4(c10717xpM51380x6.m51982to() == null ? null : m72777k4(c10717xpM51380x6.m51982to().m52123du()));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72780k4(com.aspose.slides.internal.p332p7.glt gltVar, C10717xp c10717xp) {
        if (gltVar == null) {
            throw new ArgumentNullException();
        }
        if (c10717xp == null) {
            throw new ArgumentNullException();
        }
        C10524lg c10524lg = new C10524lg();
        c10717xp.m50513yj().addItem(c10524lg);
        if (gltVar.m32636ck() != null) {
            c10524lg.m51197k4(true);
            c10524lg.m51195k4(gltVar.m32636ck().m42312k4());
            c10524lg.m51207x1(gltVar.m32636ck().m42314x1());
        } else {
            c10524lg.m51197k4(false);
        }
        if (gltVar.m32639fa() != null) {
            c10524lg.m51208x1(true);
            c10524lg.m51199kk(gltVar.m32639fa().m42312k4());
            c10524lg.m51204to(gltVar.m32639fa().m42314x1());
        } else {
            c10524lg.m51208x1(false);
        }
        if (gltVar.m32649up() != null) {
            c10524lg.m51200kk(true);
            c10524lg.m51188du(gltVar.m32649up().m42312k4());
            c10524lg.m51192h4(gltVar.m32649up().m42314x1());
        } else {
            c10524lg.m51200kk(false);
        }
        if (gltVar.m32637du() != -1) {
            c10524lg.m51205to(true);
            c10524lg.m51196k4(m72776k4(gltVar.m32637du()));
        } else {
            c10524lg.m51200kk(false);
        }
        if (C14113y2.m67411k4(gltVar.m32640h4())) {
            c10524lg.m51189du(false);
        } else {
            c10524lg.m51189du(true);
        }
        if (gltVar.m32647m9() != -1) {
            c10524lg.m51193h4(true);
        } else {
            c10524lg.m51193h4(false);
        }
        if (C14113y2.m67411k4(gltVar.m32635c5())) {
            c10524lg.m51202m9(false);
        } else {
            c10524lg.m51202m9(true);
        }
    }
}
