package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.uz */
/* JADX INFO: loaded from: classes5.dex */
final class C12021uz {

    /* JADX INFO: renamed from: com.aspose.slides.internal.wh.uz$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private static int f40581k4 = 262144;

        /* JADX INFO: renamed from: kk */
        private byte[] f40582kk = null;

        /* JADX INFO: renamed from: x1 */
        private final C12018u4 f40583x1;

        public k4(C12018u4 c12018u4) {
            this.f40583x1 = c12018u4;
        }

        /* JADX INFO: renamed from: k4 */
        public int m56842k4() {
            return Math.round(this.f40583x1.m56763m9().m56669jd());
        }

        /* JADX INFO: renamed from: kk */
        public int m56843kk() {
            return Math.round(this.f40583x1.m56763m9().m56663c5());
        }

        /* JADX INFO: renamed from: to */
        public int m56844to() {
            return Math.round(this.f40583x1.m56763m9().m56683x1());
        }

        /* JADX INFO: renamed from: x1 */
        public int m56845x1() {
            return Math.round(this.f40583x1.m56763m9().m56664ck());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x1 */
        public static boolean m56841x1(C11896dy c11896dy) {
            C12014ne.f40546k4.Clone();
            if (c11896dy.m55525du() == 0) {
                return false;
            }
            C12014ne c12014neM56657kk = C12014ne.m56657kk(c11896dy.m55530jd());
            if (c12014neM56657kk.m56663c5() != 0 && c12014neM56657kk.m56683x1() != 0) {
                long jM56683x1 = c12014neM56657kk.m56683x1() * c12014neM56657kk.m56663c5() * 4;
                if (jM56683x1 >= 1 && jM56683x1 <= (f40581k4 << 5)) {
                    int i = (int) jM56683x1;
                    byte[] bArr = new byte[i];
                    return i != 0;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [E, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v8, types: [E, java.lang.Integer] */
    /* JADX INFO: renamed from: k4 */
    private static int m56834k4(k4 k4Var, C12007ix[] c12007ixArr, int i) {
        HashMap map = new HashMap();
        int i2 = 0;
        C12014ne c12014ne = new C12014ne(-4194304, 0, 8388608, 0);
        C7015du c7015du = new C7015du(0);
        C7015du c7015du2 = new C7015du(0);
        for (int iM56845x1 = k4Var.m56845x1(); iM56845x1 < k4Var.m56845x1() + k4Var.m56844to(); iM56845x1++) {
            c7015du.f19072k4 = Integer.valueOf(k4Var.m56842k4());
            while (m56835k4(k4Var, iM56845x1, c7015du, c7015du2).booleanValue()) {
                String str = c7015du.f19072k4 + C18241k5.f55433h + c7015du2.f19072k4 + C18241k5.f55433h + iM56845x1;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.get(str);
                    int iIntValue = num.intValue();
                    if (c12007ixArr != null && iIntValue >= 0) {
                        C12007ix c12007ix = c12007ixArr[iIntValue];
                        c12007ix.m56560k4(c12007ix.m56575x1() + 1.0f);
                        map.remove(str);
                        map.put(((int) c12007ixArr[iIntValue].m56557jd()) + C18241k5.f55433h + ((int) c12007ixArr[iIntValue].m56550c5()) + C18241k5.f55433h + ((int) (c12007ixArr[iIntValue].m56575x1() + c12007ixArr[iIntValue].m56551ck())), num);
                    }
                } else {
                    c12014ne.m56676kk(((Integer) c7015du.f19072k4).intValue());
                    c12014ne.m56682to(iM56845x1);
                    c12014ne.m56684x1(((Integer) c7015du2.f19072k4).intValue());
                    c12014ne.m56671k4(1);
                    if (c12007ixArr != null && i2 < i) {
                        c12007ixArr[i2].m56566kk(c12014ne.m56669jd());
                        c12007ixArr[i2].m56572to(c12014ne.m56664ck());
                        c12007ixArr[i2].m56576x1(c12014ne.m56663c5());
                        c12007ixArr[i2].m56560k4(c12014ne.m56683x1());
                        map.put(c12014ne.m56669jd() + C18241k5.f55433h + c12014ne.m56663c5() + C18241k5.f55433h + (c12014ne.m56683x1() + c12014ne.m56664ck()), Integer.valueOf(i2));
                    }
                    i2++;
                }
                c7015du.f19072k4 = Integer.valueOf(((Integer) c7015du2.f19072k4).intValue() + 1 + ((Integer) c7015du.f19072k4).intValue());
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v8, types: [E, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v8, types: [E, java.lang.Integer] */
    /* JADX INFO: renamed from: k4 */
    private static Boolean m56835k4(k4 k4Var, int i, C7015du<Integer> c7015du, C7015du<Integer> c7015du2) {
        int iIntValue = c7015du.f19072k4.intValue();
        c7015du.f19072k4 = -1;
        c7015du2.f19072k4 = -1;
        while (true) {
            if (iIntValue < k4Var.m56842k4() + k4Var.m56843kk()) {
                boolean zM56754k4 = k4Var.f40583x1.m56754k4(iIntValue, i);
                if (c7015du.f19072k4.intValue() == -1) {
                    if (zM56754k4) {
                        c7015du.f19072k4 = Integer.valueOf(iIntValue + 1 + c7015du.f19072k4.intValue());
                    }
                } else if (!zM56754k4) {
                    break;
                }
                iIntValue++;
            } else if (c7015du.f19072k4.intValue() == -1) {
                return Boolean.FALSE;
            }
        }
        c7015du2.f19072k4 = Integer.valueOf(iIntValue - c7015du.f19072k4.intValue());
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [E, java.lang.Integer] */
    /* JADX INFO: renamed from: k4 */
    private static boolean m56836k4(C12018u4 c12018u4, C7015du<Integer> c7015du) {
        if (c12018u4 == null || c7015du.f19072k4 == null) {
            throw new ArgumentException("count or region");
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55529ix().mo59976x1(c12018u4.m56748k4());
        c7015du.f19072k4 = Integer.valueOf(!k4.m56841x1(c11896dy) ? 0 : m56834k4(new k4(c12018u4.m56768x1()), (C12007ix[]) null, -1));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [E, java.lang.Integer] */
    /* JADX INFO: renamed from: k4 */
    private static boolean m56837k4(C12018u4 c12018u4, C12007ix[] c12007ixArr, C7015du<Integer> c7015du) {
        if (c12018u4 == null || c12007ixArr == null || c7015du == null) {
            throw new ArgumentException("region or rects or count");
        }
        c7015du.f19072k4 = Integer.valueOf(m56834k4(new k4(c12018u4.m56768x1()), c12007ixArr, c7015du.f19072k4.intValue()));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static C12007ix[] m56838k4(C12018u4 c12018u4) {
        C12007ix c12007ix;
        C7015du c7015du = new C7015du(0);
        if (c12018u4 == null) {
            return new C12007ix[0];
        }
        C12007ix c12007ixMo8355dy = c12018u4.mo8355dy();
        if (!c12018u4.m56767to(c12007ixMo8355dy)) {
            if (!m56836k4(c12018u4, c7015du)) {
                throw new RuntimeException("unknown error in gdiGetRegionScansCount");
            }
            if (((Integer) c7015du.f19072k4).intValue() == 0) {
                C12007ix c12007ixMo8355dy2 = c12018u4.mo8355dy();
                double dM56550c5 = c12007ixMo8355dy2.m56550c5();
                double dM56575x1 = c12007ixMo8355dy2.m56575x1();
                if (c12007ixMo8355dy2.m56557jd() < 0.0f) {
                    dM56550c5 += (double) c12007ixMo8355dy2.m56557jd();
                }
                if (c12007ixMo8355dy2.m56551ck() < 0.0f) {
                    dM56575x1 += (double) c12007ixMo8355dy2.m56551ck();
                }
                if (dM56550c5 >= 1.0d && dM56575x1 >= 1.0d) {
                    c12007ix = new C12007ix(c12007ixMo8355dy2.m56557jd(), c12007ixMo8355dy2.m56551ck(), c12007ixMo8355dy2.m56550c5(), c12007ixMo8355dy2.m56575x1());
                }
            }
            int iIntValue = ((Integer) c7015du.f19072k4).intValue();
            C12007ix[] c12007ixArr = new C12007ix[iIntValue];
            for (int i = 0; i < iIntValue; i++) {
                c12007ixArr[i] = C12007ix.f40519k4.Clone();
            }
            if (((Integer) c7015du.f19072k4).intValue() > 0 && !m56837k4(c12018u4, c12007ixArr, (C7015du<Integer>) c7015du)) {
                throw new RuntimeException("unknown error in gdiGetRegionScans");
            }
            if (((Integer) c7015du.f19072k4).intValue() >= iIntValue) {
                return c12007ixArr;
            }
            C12007ix[] c12007ixArr2 = new C12007ix[((Integer) c7015du.f19072k4).intValue()];
            for (int i2 = 0; i2 < ((Integer) c7015du.f19072k4).intValue(); i2++) {
                c12007ixArr2[i2] = c12007ixArr[i2];
            }
            return c12007ixArr2;
        }
        c12007ix = new C12007ix(c12007ixMo8355dy.m56557jd(), c12007ixMo8355dy.m56551ck(), c12007ixMo8355dy.m56550c5(), c12007ixMo8355dy.m56575x1());
        return new C12007ix[]{c12007ix};
    }
}
