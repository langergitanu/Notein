package com.aspose.slides.internal.p402sn;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p101e6.C3583k4;
import com.aspose.slides.internal.p135fp.C4089ck;
import com.aspose.slides.internal.p135fp.C4091dy;
import com.aspose.slides.internal.p135fp.C4094ix;
import com.aspose.slides.internal.p135fp.C4096k4;
import com.aspose.slides.internal.p135fp.C4098ks;
import com.aspose.slides.internal.p135fp.C4099m9;
import com.aspose.slides.internal.p135fp.C4102rv;
import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p262m1.C6302k4;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p450uu.C11560x1;
import com.aspose.slides.internal.p512xv.C12679k4;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.internal.p515xz.C12755kk;
import com.aspose.slides.internal.p550zi.AbstractC13605ks;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sn.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10245x1 {
    /* JADX INFO: renamed from: k4 */
    private static int m50194k4(C4098ks c4098ks, C4096k4 c4096k4, C4091dy c4091dy) {
        int length = c4098ks.m16362x1().length;
        if (length == 1) {
            return 0;
        }
        if (length != 3) {
            if (length == 4) {
                return (c4096k4 == null || c4096k4.m16337k4() == 0) ? 4 : 5;
            }
            throw new C12754k4("Following jpeg colorspace is not supported yet.", new NotSupportedException());
        }
        if (c4091dy != null) {
            return 3;
        }
        return c4096k4 != null ? C7019kk.m27462to(Byte.valueOf(c4096k4.m16337k4()), 6) == 0 ? 1 : 3 : (C7019kk.m27462to(Byte.valueOf(c4098ks.m16362x1()[0].m16317h4()), 6) == 82 && C7019kk.m27462to(Byte.valueOf(c4098ks.m16362x1()[1].m16317h4()), 6) == 71 && C7019kk.m27462to(Byte.valueOf(c4098ks.m16362x1()[2].m16317h4()), 6) == 66) ? 2 : 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[PHI: r12
      0x00c2: PHI (r12v6 com.aspose.slides.internal.uu.x1) = (r12v4 com.aspose.slides.internal.uu.x1), (r12v9 com.aspose.slides.internal.uu.x1) binds: [B:37:0x00c7, B:31:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10243kk m50198x1(C13618wy c13618wy, C13620x6 c13620x6) {
        C4099m9 c4099m9;
        int iM50194k4;
        C13609qq c13609qqM62784m9;
        C13609qq c13609qqM62780c5;
        int i;
        C13620x6 c13620x62 = c13620x6;
        C10243kk c10243kk = new C10243kk();
        C4099m9 c4099m92 = new C4099m9();
        c13618wy.m62854k4(0L, 0);
        if (!m50197k4(c13618wy)) {
            throw new C12754k4("Cannot parse file.", (Exception) new C12755kk("Not a jpeg data."));
        }
        C10019k4 c10019k4 = new C10019k4();
        c10019k4.m49211k4(new C4106up(c13618wy));
        if (C7019kk.m27469x1(c13620x62, C12679k4.class)) {
            c10019k4.m49217x1().m16416k4((C12679k4) C7019kk.m27452k4((Object) c13620x62, C12679k4.class));
        }
        c10019k4.m49217x1().m16412k4(c4099m92.m16364k4());
        c10019k4.m49208k4(c13618wy.m62853k4());
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        C4096k4 c4096k4M16335k4 = null;
        C4091dy c4091dyM16286k4 = null;
        C11560x1 c11560x1M50196k4 = null;
        byte[] bArr = null;
        while (!z) {
            byte bM16297du = c10019k4.m49217x1().m16404ck().m16297du();
            if (bM16297du == -39) {
                throw new C12754k4("Cannot parse file.", (Exception) new C12755kk("Not enough data in stream."));
            }
            if (bM16297du == -38) {
                c4099m9 = c4099m92;
                z = true;
            } else if (bM16297du == -18) {
                c4099m9 = c4099m92;
                c4096k4M16335k4 = C4096k4.m16335k4(c10019k4.m49217x1().m16404ck());
            } else if (bM16297du == -17) {
                c4099m9 = c4099m92;
                m50199x1(c10019k4.m49217x1().m16404ck());
            } else if (bM16297du == -2) {
                c4099m9 = c4099m92;
                int i2 = 0;
                int[] iArr = {0};
                c10019k4.m49217x1().m16404ck().m16302k4(iArr);
                int i3 = iArr[0] - 2;
                bArr = new byte[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int[] iArr2 = {i2};
                    c10019k4.m49217x1().m16404ck().m16309x1(iArr2);
                    bArr[i4] = (byte) iArr2[i2];
                    i4++;
                    i2 = 0;
                }
            } else if (bM16297du != -1) {
                switch (bM16297du) {
                    case -64:
                    case -63:
                    case -62:
                        C4098ks c4098ksM16345k4 = C4098ks.m16345k4(c10019k4.m49217x1().m16404ck(), bM16297du != -62 ? (byte) -64 : (byte) -62);
                        if (C7019kk.m27469x1(c13620x62, C12679k4.class)) {
                            int iM58828du = ((C12679k4) C7019kk.m27452k4((Object) c13620x62, C12679k4.class)).m58828du();
                            iM50194k4 = iM58828du != 0 ? iM58828du != 1 ? iM58828du != 2 ? iM58828du != 3 ? iM58828du != 4 ? 1 : 2 : 5 : 4 : 3 : 0;
                        } else {
                            iM50194k4 = m50194k4(c4098ksM16345k4, c4096k4M16335k4, c4091dyM16286k4);
                        }
                        if (iM50194k4 == 0) {
                            c13609qqM62784m9 = C13609qq.m62784m9();
                        } else if (iM50194k4 == 1 || iM50194k4 == 2) {
                            c13609qqM62780c5 = C13609qq.m62780c5();
                            i = 1;
                            c10243kk.m50165kk(i);
                            c10019k4.m49206k4(i);
                            c10019k4.m49213k4(new C13616v4());
                            c10019k4.m49216to().m62826k4((InterfaceC6901du) null);
                            c10019k4.m49216to().m62825k4(0);
                            c10019k4.m49216to().m62827k4((InterfaceC6904h4) null);
                            c4099m9 = c4099m92;
                            c10019k4.m49216to().m62831kk(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16351dy()), 8) * C7019kk.m27462to(Byte.valueOf(c4098ksM16345k4.m16353k4()), 6) * c4098ksM16345k4.m16362x1().length);
                            c10019k4.m49216to().m62829k4(c13609qqM62780c5);
                            c10019k4.m49217x1().m16413k4(c4098ksM16345k4);
                            c10243kk.m50158k4(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16351dy()), 8));
                            c10243kk.m50169x1(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16348c5()), 8));
                            c10243kk.m50160k4(new C4089ck(c10019k4));
                            if (c10019k4.m49217x1().m16425x1().getLength() > 0) {
                                c10019k4.m49217x1().m16425x1().seek(0L, 0);
                                c10243kk.m50159k4(new C3583k4(c10019k4.m49217x1().m16425x1()));
                                c10243kk.m50170x1(C13623yj.m62876x1());
                            }
                            break;
                        } else if (iM50194k4 == 3) {
                            c13609qqM62784m9 = C13609qq.m62782h4();
                        } else if (iM50194k4 == 4) {
                            c13609qqM62784m9 = C13609qq.m62783k4();
                        } else {
                            if (iM50194k4 != 5) {
                                throw new ArgumentOutOfRangeException();
                            }
                            c13609qqM62784m9 = C13609qq.m62781dy();
                        }
                        int i5 = iM50194k4;
                        c13609qqM62780c5 = c13609qqM62784m9;
                        i = i5;
                        c10243kk.m50165kk(i);
                        c10019k4.m49206k4(i);
                        c10019k4.m49213k4(new C13616v4());
                        c10019k4.m49216to().m62826k4((InterfaceC6901du) null);
                        c10019k4.m49216to().m62825k4(0);
                        c10019k4.m49216to().m62827k4((InterfaceC6904h4) null);
                        c4099m9 = c4099m92;
                        c10019k4.m49216to().m62831kk(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16351dy()), 8) * C7019kk.m27462to(Byte.valueOf(c4098ksM16345k4.m16353k4()), 6) * c4098ksM16345k4.m16362x1().length);
                        c10019k4.m49216to().m62829k4(c13609qqM62780c5);
                        c10019k4.m49217x1().m16413k4(c4098ksM16345k4);
                        c10243kk.m50158k4(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16351dy()), 8));
                        c10243kk.m50169x1(C7019kk.m27462to(Integer.valueOf(c4098ksM16345k4.m16348c5()), 8));
                        c10243kk.m50160k4(new C4089ck(c10019k4));
                        if (c10019k4.m49217x1().m16425x1().getLength() > 0) {
                        }
                        break;
                    case -61:
                        throw new C12754k4(C14113y2.m67402k4("Format {0} is not supported", C7019kk.m27445k4(bM16297du)), new NotSupportedException());
                    default:
                        switch (bM16297du) {
                            case -59:
                            case -58:
                            case -57:
                                throw new C12754k4(C14113y2.m67402k4("Format {0} is not supported", C7019kk.m27445k4(bM16297du)), new NotSupportedException());
                            default:
                                switch (bM16297du) {
                                    case -55:
                                    case -54:
                                    case -53:
                                        throw new C12754k4(C14113y2.m67402k4("Format {0} is not supported", C7019kk.m27445k4(bM16297du)), new NotSupportedException());
                                    default:
                                        switch (bM16297du) {
                                            case -51:
                                            case -50:
                                            case -49:
                                                throw new C12754k4(C14113y2.m67402k4("Format {0} is not supported", C7019kk.m27445k4(bM16297du)), new NotSupportedException());
                                            default:
                                                switch (bM16297du) {
                                                    case -32:
                                                        if (!z2) {
                                                            c4091dyM16286k4 = C4091dy.m16286k4(c10019k4.m49217x1().m16404ck());
                                                            c4099m9 = c4099m92;
                                                            z2 = true;
                                                        }
                                                        m50199x1(c10019k4.m49217x1().m16404ck());
                                                        c4099m9 = c4099m92;
                                                        break;
                                                    case -31:
                                                        if (!z3) {
                                                            try {
                                                                c11560x1M50196k4 = m50196k4(c10019k4.m49217x1().m16404ck());
                                                            } catch (RuntimeException unused) {
                                                                if (c11560x1M50196k4 != null) {
                                                                }
                                                                z3 = z;
                                                                c4099m9 = c4099m92;
                                                                c13620x62 = c13620x6;
                                                                c4099m92 = c4099m9;
                                                            }
                                                        } else {
                                                            m50199x1(c10019k4.m49217x1().m16404ck());
                                                        }
                                                        boolean z4 = c11560x1M50196k4 != null;
                                                        z3 = z4;
                                                        c4099m9 = c4099m92;
                                                        break;
                                                    case -30:
                                                        c4099m92.m16365k4(c10019k4.m49217x1().m16404ck());
                                                        c4099m9 = c4099m92;
                                                        break;
                                                    default:
                                                        m50199x1(c10019k4.m49217x1().m16404ck());
                                                        c4099m9 = c4099m92;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                c4099m9 = c4099m92;
                m50199x1(c10019k4.m49217x1().m16404ck());
            }
            c13620x62 = c13620x6;
            c4099m92 = c4099m9;
        }
        c10243kk.m50161k4(c4091dyM16286k4);
        c10243kk.m50162k4(c11560x1M50196k4);
        if (bArr != null) {
            c10243kk.m50163k4(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, bArr.length));
        }
        return c10243kk;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC13605ks m50200kk(C13618wy c13618wy, C13620x6 c13620x6) {
        return m50195k4(c13618wy, c13620x6);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4102rv m50195k4(C13618wy c13618wy, C13620x6 c13620x6) {
        C10243kk c10243kkM50198x1 = m50198x1(c13618wy, c13620x6);
        C4102rv c4102rv = new C4102rv(c10243kkM50198x1.m50157k4(), c10243kkM50198x1.m50168x1(), c10243kkM50198x1.m50164kk(), c10243kkM50198x1.m50167to());
        c4102rv.m16390x1(c10243kkM50198x1.m50154du());
        c4102rv.m16382k4(c10243kkM50198x1.m50156h4());
        c10243kkM50198x1.m50167to().m16263k4(c4102rv);
        c4102rv.m16383k4(c10243kkM50198x1.m50166m9());
        c4102rv.m16384k4(c10243kkM50198x1.m50155dy());
        c4102rv.m16385k4(c10243kkM50198x1.m50153c5());
        return c4102rv;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m50199x1(C4094ix c4094ix) {
        c4094ix.m16302k4(new int[]{0});
        c4094ix.m16303kk(r1[0] - 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11560x1 m50196k4(C4094ix c4094ix) {
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i = iArr[0] - 2;
        C3152yj c3152yj = new C3152yj();
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = new byte[i];
            if (!c4094ix.m16304kk()) {
                throw new C12754k4("Cannot parse file.", (Exception) new C12755kk("Not enough data in stream."));
            }
            int iM16300k4 = c4094ix.m16300k4(bArr, i2);
            c3152yj.write(bArr, 0, iM16300k4);
            i2 -= iM16300k4;
        }
        c3152yj.seek(0L, 0);
        byte[] bArr2 = new byte[6];
        c3152yj.read(bArr2, 0, 6);
        if (C14113y2.m67448x1(AbstractC6747ar.m26635ix().mo26682x1(bArr2, 0, 6), "Exif")) {
            try {
                C6304x1 c6304x1M50172k4 = C10244to.m50172k4(c3152yj);
                C11560x1 c11560x1M50176k4 = C10244to.m50176k4(c6304x1M50172k4);
                if (c11560x1M50176k4 != null) {
                    c11560x1M50176k4.m54541k4(C7019kk.m27469x1(c6304x1M50172k4, C6302k4.class));
                }
                return c11560x1M50176k4;
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m50197k4(C13618wy c13618wy) {
        return c13618wy.m62847c5() == 255 || c13618wy.m62847c5() == C7019kk.m27462to((Object) (byte) -40, 6);
    }
}
