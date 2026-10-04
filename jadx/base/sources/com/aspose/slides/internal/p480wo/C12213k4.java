package com.aspose.slides.internal.p480wo;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.firebase.firestore.util.OooOOO;
import o00OoOo0.C25069OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.wo.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12213k4 {
    /* JADX INFO: renamed from: c5 */
    private static int[] m56983c5(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 2);
                byte b = bArr[iOooO00o2];
                byte b2 = bArr[iOooO00o2 + 1];
                iArr[iOooO00o] = ((((byte) (((b2 & 255) >> 1) & 31)) & 255) << 16) | ((((byte) (((b & 7) << 2) | ((b2 & 255) >> 6))) & 255) << 8) | (((byte) ((b & 255) >> 3)) & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: ck */
    private static int[] m56984ck(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                iArr[C25069OooO00o.OooO00o(c12009k4, i, i2)] = c12009k4.mo15749c5().m15746k4()[bArr[OooOOO.OooO00o(iM15715du, i, i2)] & 255].m56506h4();
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: du */
    private static int[] m56985du(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 4);
                byte b = bArr[iOooO00o2];
                iArr[iOooO00o] = ((bArr[iOooO00o2 + 3] & 255) << 24) | ((bArr[iOooO00o2 + 2] & 255) << 16) | ((bArr[iOooO00o2 + 1] & 255) << 8) | (b & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: dy */
    private static int[] m56986dy(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 2);
                byte b = bArr[iOooO00o2];
                byte b2 = bArr[iOooO00o2 + 1];
                iArr[iOooO00o] = ((((byte) (b2 & 31)) & 255) << 16) | ((((byte) (((b & 7) << 3) | ((b2 & 255) >> 5))) & 255) << 8) | (((byte) ((b & 255) >> 3)) & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: fa */
    private static int[] m56987fa(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                iArr[C25069OooO00o.OooO00o(c12009k4, i, i2)] = c12009k4.mo15749c5().m15746k4()[((bArr[OooOOO.OooO00o(iM15715du, i, i2 / 2)] & 255) >> ((1 - (i2 % 2)) * 4)) & 15].m56506h4();
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: h4 */
    private static int[] m56988h4(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 3);
                iArr[iOooO00o] = ((bArr[iOooO00o2 + 2] & 255) << 16) | ((bArr[iOooO00o2 + 1] & 255) << 8) | (bArr[iOooO00o2] & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: jd */
    private static int[] m56989jd(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iM66769k4 = C14069jd.m66769k4(bArr, (C14116yg.m67482k4(iM15715du) * i) + (i2 * 2)) & 65535;
                iArr[iOooO00o] = iM66769k4 | (iM66769k4 << 16) | (iM66769k4 << 8);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m56990k4(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        switch (c12009k4.mo15753jd()) {
            case 135173:
                return m56983c5(c12009k4);
            case 135174:
                return m56986dy(c12009k4);
            case 137224:
                return m56988h4(c12009k4);
            case 139273:
                return m56985du(c12009k4);
            case 196865:
                return m56994up(c12009k4);
            case 197634:
                return m56987fa(c12009k4);
            case 198659:
                return m56984ck(c12009k4);
            case 397319:
                return m56992m9(c12009k4);
            case 1052676:
                return m56989jd(c12009k4);
            case 1060876:
                return m56991kk(c12009k4);
            case 1851406:
            case 3424269:
                return m56995x1(c12009k4);
            default:
                return m56993to(c12009k4);
        }
    }

    /* JADX INFO: renamed from: kk */
    private static int[] m56991kk(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 6);
                iArr[iOooO00o] = ((((byte) ((C14069jd.m66769k4(bArr, iOooO00o2 + 4) & 65535) >> 5)) & 255) << 16) | ((((byte) ((C14069jd.m66769k4(bArr, iOooO00o2 + 2) & 65535) >> 5)) & 255) << 8) | (((byte) ((C14069jd.m66769k4(bArr, iOooO00o2) & 65535) >> 5)) & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: m9 */
    private static int[] m56992m9(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 2);
                byte b = bArr[iOooO00o2];
                byte b2 = bArr[iOooO00o2 + 1];
                int i3 = ((((byte) (((b & 7) << 2) | ((b2 & 255) >> 6))) & 255) << 8) | ((((byte) (((b2 & 255) >> 1) & 31)) & 255) << 16) | (((byte) ((b & 255) >> 3)) & 255);
                iArr[iOooO00o] = (int) ((((byte) (b2 & 1)) & 255) == 0 ? i3 : (((long) i3) | 4278190080L) & 4294967295L);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: to */
    private static int[] m56993to(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 4);
                byte b = bArr[iOooO00o2];
                iArr[iOooO00o] = ((bArr[iOooO00o2 + 3] & 255) << 24) | ((bArr[iOooO00o2 + 2] & 255) << 16) | ((bArr[iOooO00o2 + 1] & 255) << 8) | (b & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: up */
    private static int[] m56994up(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int i3 = 7 - (i2 % 8);
                iArr[C25069OooO00o.OooO00o(c12009k4, i, i2)] = c12009k4.mo15749c5().m15746k4()[((bArr[OooOOO.OooO00o(iM15715du, i, i2 / 8)] & 255) & (1 << i3)) >> i3].m56506h4();
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }

    /* JADX INFO: renamed from: x1 */
    private static int[] m56995x1(C12009k4 c12009k4) {
        int[] iArr = new int[c12009k4.mo15757m9() * c12009k4.mo15760yj()];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        int iM15715du = c3983k4M56597k4.m15715du();
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iMo15757m9 = c12009k4.mo15757m9() * C14116yg.m67482k4(iM15715du);
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, iMo15757m9);
        for (int i = 0; i < c12009k4.mo15757m9(); i++) {
            for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                int iOooO00o = C25069OooO00o.OooO00o(c12009k4, i, i2);
                int iOooO00o2 = OooOOO.OooO00o(iM15715du, i, i2 * 8);
                byte bM66769k4 = (byte) ((C14069jd.m66769k4(bArr, iOooO00o2) & 65535) >> 5);
                iArr[iOooO00o] = ((((byte) ((C14069jd.m66769k4(bArr, iOooO00o2 + 6) & 65535) >> 5)) & 255) << 24) | ((((byte) ((C14069jd.m66769k4(bArr, iOooO00o2 + 4) & 65535) >> 5)) & 255) << 16) | ((((byte) ((C14069jd.m66769k4(bArr, iOooO00o2 + 2) & 65535) >> 5)) & 255) << 8) | (bM66769k4 & 255);
            }
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return iArr;
    }
}
