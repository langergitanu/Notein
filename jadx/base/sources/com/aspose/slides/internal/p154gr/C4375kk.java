package com.aspose.slides.internal.p154gr;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.AbstractC4415wy;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p282mu.C6542kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import com.google.logging.type.LogSeverity;
import java.lang.reflect.Array;
import java.util.Collection;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4375kk {

    /* JADX INFO: renamed from: k4 */
    private static float f11883k4;

    /* JADX INFO: renamed from: kk */
    private static C12023wl f11884kk;

    /* JADX INFO: renamed from: to */
    private static int f11885to;

    /* JADX INFO: renamed from: x1 */
    private static float f11886x1;

    /* JADX INFO: renamed from: k4 */
    public static double m17615k4(int i, int i2, double d) {
        return m17616k4(i, i2, d, m17633to(), m17633to());
    }

    /* JADX INFO: renamed from: kk */
    public static float m17632kk() {
        return m17634x1();
    }

    /* JADX INFO: renamed from: to */
    public static float m17633to() {
        return m17634x1();
    }

    /* JADX INFO: renamed from: x1 */
    public static int m17634x1() {
        if (f11885to == 0) {
            f11885to = GraphicsEnv.m67574kk().mo67576h4();
        }
        return f11885to;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m17616k4(int i, int i2, double d, float f, float f2) {
        if (m17630k4(i) && m17630k4(i2) && f == f2) {
            return d;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                d /= (double) f;
                break;
            case 3:
                d /= 72.0d;
                break;
            case 4:
                break;
            case 5:
                d /= 300.0d;
                break;
            case 6:
                d /= 25.399999618530273d;
                break;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return d * ((double) f2);
            case 3:
                return d * 72.0d;
            case 4:
                return d;
            case 5:
                return d * 300.0d;
            case 6:
                return d * 25.399999618530273d;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m17635x1(int i) {
        return m17621k4(i, -1.0d);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m17617k4(int i, int i2, float f) {
        double dM17615k4;
        if (i != i2 || f == m17633to() || i2 == 2) {
            dM17615k4 = (i == i2 || (i == 1 && i2 == 2) || (i2 == 1 && i == 2)) ? 1.0d : m17615k4(i, 4, 1.0d) * ((double) f);
        } else {
            dM17615k4 = f / m17633to();
        }
        return (float) dM17615k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC1565x1 m17636x1(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            return null;
        }
        InterfaceC1565x1 interfaceC1565x1M17623k4 = m17623k4(interfaceC1565x1);
        if (interfaceC1565x1M17623k4 instanceof AbstractC4415wy) {
            if (interfaceC1565x1M17623k4 instanceof C12014ne) {
                return interfaceC1565x1M17623k4;
            }
            C12007ix c12007ixMo8355dy = interfaceC1565x1M17623k4.mo8355dy();
            float fRound = Math.round(c12007ixMo8355dy.m56557jd() * 100.0f) / 100.0f;
            float fRound2 = Math.round(c12007ixMo8355dy.m56551ck() * 100.0f) / 100.0f;
            return new AbstractC4415wy.x1(fRound, fRound2, (Math.round((c12007ixMo8355dy.m56550c5() + c12007ixMo8355dy.m56557jd()) * 100.0f) / 100.0f) - fRound, (Math.round((c12007ixMo8355dy.m56575x1() + c12007ixMo8355dy.m56551ck()) * 100.0f) / 100.0f) - fRound2);
        }
        C11896dy c11896dyM55503k4 = C11896dy.m55503k4(interfaceC1565x1);
        if (interfaceC1565x1.mo8359kk(null).mo17821x1()) {
            return interfaceC1565x1;
        }
        C12025x6[] c12025x6ArrM55565kk = c11896dyM55503k4.m55565kk();
        byte[] bArrM55571to = c11896dyM55503k4.m55571to();
        C12025x6[] c12025x6Arr = new C12025x6[c12025x6ArrM55565kk.length];
        for (int i = 0; i < c12025x6ArrM55565kk.length; i++) {
            c12025x6Arr[i] = new C12025x6(Math.round(c12025x6ArrM55565kk[i].m56897x1() * 100.0f) / 100.0f, Math.round(c12025x6ArrM55565kk[i].m56895kk() * 100.0f) / 100.0f);
        }
        return new C11896dy(c12025x6Arr, bArrM55571to).m55568ne();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17618k4(byte b, double d) {
        return (int) (Math.round(Math.pow(((double) (b & 255)) / 255.0d, d) * 255.0d) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17619k4(double d, double d2) {
        return m17620k4(d, d2, 0.005f);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17620k4(double d, double d2, float f) {
        double d3 = d - d2;
        if (Math.abs(d3) < f) {
            return 0;
        }
        return (int) Math.signum(d3);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17621k4(int i, double d) {
        if (d == -1.0d) {
            d = 2.2d;
        }
        int iM17618k4 = m17618k4((byte) ((i >> 24) & 255), d);
        int iM17618k42 = m17618k4((byte) ((i >> 16) & 255), d);
        return m17618k4((byte) (i & 255), d) | (m17618k4((byte) ((i >> 8) & 255), d) << 8) | (iM17618k42 << 16) | (iM17618k4 << 24);
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<String, String> m17622k4(IGenericDictionary<String, String> iGenericDictionary) {
        Collection<String> collectionMo67583x1 = GraphicsEnv.m67573du().mo67583x1();
        Dictionary<String, String> dictionary = new Dictionary<>();
        for (String str : collectionMo67583x1) {
            dictionary.addItem(str, str);
        }
        return dictionary;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[LOOP:0: B:8:0x0016->B:27:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a A[EDGE_INSN: B:47:0x015a->B:45:0x015a BREAK  A[LOOP:0: B:8:0x0016->B:27:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC1565x1 m17623k4(InterfaceC1565x1 interfaceC1565x1) {
        C12025x6 c12025x6;
        if (interfaceC1565x1 == null) {
            return null;
        }
        Object[] objArr = new C12025x6[4];
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC1565x1.mo8359kk(null);
        if (!interfaceC4413v4Mo8359kk.mo17821x1()) {
            int i = 0;
            boolean z = false;
            while (true) {
                if (interfaceC4413v4Mo8359kk.mo17821x1()) {
                    double dM56897x1 = objArr[0].m56897x1();
                    double dM56895kk = objArr[0].m56895kk();
                    for (int i2 = 0; i2 < 4; i2++) {
                        if (((double) objArr[i2].m56897x1()) - dM56897x1 <= 1.0E-7d && ((double) objArr[i2].m56895kk()) - dM56895kk <= 1.0E-7d) {
                            dM56897x1 = objArr[i2].m56897x1();
                            dM56895kk = objArr[i2].m56895kk();
                        }
                    }
                    double dMax = Math.max(Math.abs(objArr[1].m56897x1() - objArr[0].m56897x1()), Math.abs(objArr[1].m56897x1() - objArr[2].m56897x1()));
                    double dMax2 = Math.max(Math.abs(objArr[1].m56895kk() - objArr[0].m56895kk()), Math.abs(objArr[1].m56895kk() - objArr[2].m56895kk()));
                    if (C6542kk.m26357k4(objArr[0].m56897x1(), objArr[0].m56895kk(), objArr[2].m56897x1(), objArr[2].m56895kk()) == C6542kk.m26357k4(objArr[1].m56897x1(), objArr[1].m56895kk(), objArr[3].m56897x1(), objArr[3].m56895kk()) && (objArr[0].m56897x1() == objArr[1].m56897x1() || objArr[0].m56895kk() == objArr[1].m56895kk())) {
                        return new AbstractC4415wy.k4(dM56897x1, dM56895kk, dMax, dMax2);
                    }
                } else {
                    float[] fArr = new float[6];
                    byte bMo17818k4 = (byte) interfaceC4413v4Mo8359kk.mo17818k4(fArr);
                    if (bMo17818k4 == 0 || bMo17818k4 == 1) {
                        if (i >= 4) {
                            c12025x6 = new C12025x6(fArr[0], fArr[1]);
                            if (!c12025x6.equals(objArr[i % 4])) {
                                z = true;
                            }
                        } else {
                            c12025x6 = new C12025x6(fArr[0], fArr[1]);
                            objArr[i] = c12025x6;
                            i++;
                        }
                        if (!z) {
                            break;
                        }
                        interfaceC4413v4Mo8359kk.mo17820kk();
                    } else {
                        if (bMo17818k4 == 2 || bMo17818k4 == 3 || (bMo17818k4 == 4 && i < 4)) {
                        }
                        if (!z) {
                        }
                    }
                }
            }
        }
        return interfaceC1565x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1565x1 m17624k4(InterfaceC1565x1 interfaceC1565x1, C11913yj c11913yj) {
        return m17623k4(C6541k4.m26346k4(c11913yj, interfaceC1565x1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11913yj m17625k4(C11913yj c11913yj, int i, float f) {
        C11913yj c11913yj2;
        if (i != 1) {
            double dM17615k4 = m17615k4(i, 2, f);
            if (Math.abs(dM17615k4 - 1.0d) > 1.401298464324817E-45d) {
                c11913yj2 = new C11913yj();
                float f2 = (float) dM17615k4;
                c11913yj2.m55763k4(f2, f2);
            } else {
                c11913yj2 = null;
            }
        }
        if (c11913yj2 == null) {
            return c11913yj;
        }
        c11913yj2.m55769k4(c11913yj, 0);
        return c11913yj2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m17626k4(AbstractC12008jd abstractC12008jd) {
        float fMo17474ck;
        float fM17615k4 = (float) m17615k4(abstractC12008jd.mo17605yj(), 1, 1.0d);
        if (abstractC12008jd.mo17605yj() != 1) {
            fM17615k4 *= abstractC12008jd.mo17579up();
        }
        if (m17630k4(abstractC12008jd.mo17605yj()) || (abstractC12008jd.mo17483jd() == m17632kk() && abstractC12008jd.mo17474ck() == m17633to())) {
            fMo17474ck = fM17615k4;
        } else {
            float fMo17483jd = (abstractC12008jd.mo17483jd() / m17632kk()) * fM17615k4;
            fMo17474ck = fM17615k4 * (abstractC12008jd.mo17474ck() / m17633to());
            fM17615k4 = fMo17483jd;
        }
        return C11913yj.m55748du(fM17615k4, fMo17474ck);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m17627k4(int i, int i2, C12007ix c12007ix) {
        return new C12007ix((float) m17615k4(i, i2, c12007ix.m56557jd()), (float) m17615k4(i, i2, c12007ix.m56551ck()), (float) m17615k4(i, i2, c12007ix.m56550c5()), (float) m17615k4(i, i2, c12007ix.m56575x1()));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m17628k4(C12009k4 c12009k4) {
        C12009k4 c12009k42;
        int i = 0;
        if (AbstractC12002ck.m56327x1(c12009k4.mo15753jd())) {
            c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
            AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42).mo17513k4(c12009k4, new C12016rv(0, 0));
        } else {
            c12009k42 = (C12009k4) c12009k4.deepClone();
        }
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        char c = 3;
        char c2 = 2;
        int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, iMo15760yj, iMo15757m9, 4);
        for (int i2 = 0; i2 < iMo15760yj; i2++) {
            for (int i3 = 0; i3 < iMo15757m9; i3++) {
                C12003du c12003duM56609x1 = c12009k4.m56609x1(i2, i3);
                iArr[i2][i3][0] = c12003duM56609x1.m56501c5() & 255;
                iArr[i2][i3][1] = c12003duM56609x1.m56507jd() & 255;
                iArr[i2][i3][2] = c12003duM56609x1.m56502ck() & 255;
                iArr[i2][i3][3] = c12003duM56609x1.m56505fa() & 255;
            }
        }
        for (int i4 = 0; i4 < iMo15760yj; i4++) {
            int i5 = i;
            while (i5 < iMo15757m9) {
                int[] iArr2 = iArr[i4][i5];
                int i6 = iArr2[i];
                int i7 = iArr2[1];
                int i8 = iArr2[c2];
                int i9 = iArr2[c];
                int iMax = Math.max(i, i4 - 1);
                char c3 = c;
                int iMin = Math.min(iMo15760yj - 1, i4 + 1);
                int iMax2 = Math.max(i, i5 - 1);
                int i10 = i;
                char c4 = c2;
                int i11 = i5 + 1;
                int iMin2 = Math.min(iMo15757m9 - 1, i11);
                int[] iArr3 = iArr[iMax][i5];
                int i12 = i6 + iArr3[i10];
                int i13 = i7 + iArr3[1];
                int i14 = i8 + iArr3[c4];
                int i15 = i9 + iArr3[c3];
                int[][] iArr4 = iArr[i4];
                int[] iArr5 = iArr4[iMin2];
                int i16 = i12 + iArr5[i10];
                int i17 = i13 + iArr5[1];
                int i18 = i14 + iArr5[c4];
                int i19 = i15 + iArr5[c3];
                int[] iArr6 = iArr4[iMax2];
                int i20 = i16 + iArr6[i10];
                int i21 = i17 + iArr6[1];
                int i22 = i18 + iArr6[c4];
                int i23 = i19 + iArr6[c3];
                int[] iArr7 = iArr[iMin][i5];
                int i24 = i20 + iArr7[i10];
                int i25 = i21 + iArr7[1];
                int i26 = i22 + iArr7[c4];
                int i27 = i23 + iArr7[c3];
                int[] iArr8 = iArr4[i5];
                c12009k42.m56604k4(i4, i5, C12003du.m56398k4(((i24 / 5) + iArr8[i10]) / 2, ((i25 / 5) + iArr8[1]) / 2, ((i26 / 5) + iArr8[c4]) / 2, ((i27 / 5) + iArr8[c3]) / 2));
                i5 = i11;
                c = c3;
                i = i10;
                c2 = c4;
            }
        }
        return c12009k42;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m17629k4() {
        if (f11884kk == null) {
            f11884kk = new C12023wl(LogSeverity.EMERGENCY_VALUE, 600);
        }
        return f11884kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17630k4(int i) {
        return i == 1 || i == 2 || i == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17631k4(C11896dy c11896dy) {
        return c11896dy.m55525du() > 0;
    }
}
