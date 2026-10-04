package com.aspose.slides.internal.p316of;

import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p154gr.C4378x1;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p274mh.AbstractC6384k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.of.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C7035kk {

    /* JADX INFO: renamed from: k4 */
    private static AbstractC6384k4 f19187k4;

    /* JADX INFO: renamed from: k4 */
    public static float m27489k4(float f, float f2, int i) {
        return (i * f) / f2;
    }

    /* JADX INFO: renamed from: kk */
    public static float m27499kk(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        return m27491k4(c12004dyM56651x1, c12013m9, c12004dyM56651x1.m56526du(c12013m9.m56642jd()));
    }

    /* JADX INFO: renamed from: to */
    public static float m27500to(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        int iM56642jd = c12013m9.m56642jd();
        return m27491k4(c12004dyM56651x1, c12013m9, (c12004dyM56651x1.m56526du(iM56642jd) - c12004dyM56651x1.m56536x1(iM56642jd)) - c12004dyM56651x1.m56532kk(iM56642jd));
    }

    /* JADX INFO: renamed from: x1 */
    public static float m27501x1(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        return m27491k4(c12004dyM56651x1, c12013m9, c12004dyM56651x1.m56532kk(c12013m9.m56642jd()));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27490k4(float f, int i, AbstractC12008jd abstractC12008jd) {
        return ((float) C4375kk.m17615k4(i, abstractC12008jd == null ? 1 : abstractC12008jd.mo17605yj(), f)) / 1.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12004dy m27502x1(String str) {
        try {
            return new C12004dy(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27491k4(C12004dy c12004dy, C12013m9 c12013m9, int i) {
        return m27489k4(c12013m9.m56647ks().m18934kk(), c12004dy.m56535to(c12013m9.m56642jd()), i);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12013m9 m27503x1(C12013m9 c12013m9, String str) {
        return m27496k4(c12013m9, str, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27492k4(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        return m27491k4(c12004dyM56651x1, c12013m9, c12004dyM56651x1.m56536x1(c12013m9.m56642jd()));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27493k4(C12013m9 c12013m9, char c) {
        return c12013m9.m56651x1().m56530k4(c12013m9.m56642jd(), c, c12013m9.m56639dy());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6384k4 m27494k4() {
        return f19187k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m27495k4(String str) {
        try {
            return new C12004dy(str);
        } catch (Exception unused) {
            return C12004dy.m56523kk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12013m9 m27496k4(C12013m9 c12013m9, String str, int i) {
        String strM18932k4;
        int[][] iArrM27529k4;
        int i2;
        String[] strArrM27535qm = C7038x1.m27535qm();
        EnumC7034k4[] enumC7034k4ArrValues = EnumC7034k4.values();
        int i3 = 0;
        for (String str2 : strArrM27535qm) {
            if (str2.equalsIgnoreCase(c12013m9.m56648m9())) {
                return c12013m9;
            }
        }
        int iM17682k4 = C4378x1.m17682k4(c12013m9, str);
        if (iM17682k4 != -1) {
            int length = enumC7034k4ArrValues.length;
            boolean[] zArr = new boolean[length];
            for (EnumC7034k4 enumC7034k4 : enumC7034k4ArrValues) {
                zArr[enumC7034k4.ordinal()] = false;
            }
            char[] charArray = str.toCharArray();
            int iMin = Math.min(charArray.length, 100);
            int i4 = 0;
            while (iM17682k4 < iMin && i4 < length) {
                int length2 = enumC7034k4ArrValues.length;
                int i5 = i3;
                while (i5 < length2) {
                    EnumC7034k4 enumC7034k42 = enumC7034k4ArrValues[i5];
                    if (zArr[enumC7034k42.ordinal()] || (iArrM27529k4 = C7038x1.m27529k4(enumC7034k42)) == null) {
                        i2 = i3;
                    } else {
                        int i6 = i3;
                        while (i6 < iArrM27529k4.length) {
                            char c = charArray[iM17682k4];
                            int[] iArr = iArrM27529k4[i6];
                            i2 = i3;
                            if ((c >= iArr[i2] && c <= iArr[1]) || (c == ' ' && enumC7034k42 == EnumC7034k4.LATIN)) {
                                zArr[enumC7034k42.ordinal()] = true;
                                i4++;
                                break;
                            }
                            i6++;
                            i3 = i2;
                        }
                        i2 = i3;
                    }
                    i5++;
                    i3 = i2;
                }
                iM17682k4++;
            }
            int i7 = i3;
            C12013m9 c12013m92 = new C12013m9(C12004dy.m56523kk(), 10.0f);
            AbstractC4584k4[][] abstractC4584k4ArrM27552kk = C7038x1.m27527k4().m27552kk();
            String[][] strArrM27554x1 = C7038x1.m27527k4().m27554x1();
            int i8 = i7;
            int i9 = i8;
            loop5: while (i8 < enumC7034k4ArrValues.length) {
                int i10 = i7;
                while (true) {
                    AbstractC4584k4[] abstractC4584k4Arr = abstractC4584k4ArrM27552kk[i8];
                    if (i10 < abstractC4584k4Arr.length) {
                        AbstractC4584k4 abstractC4584k4 = abstractC4584k4Arr[i10];
                        int length3 = abstractC4584k4Arr.length;
                        String[] strArr = strArrM27554x1[i8];
                        strM18932k4 = length3 > strArr.length ? abstractC4584k4.m18932k4() : strArr[i10];
                        if ((!c12013m92.m56648m9().equalsIgnoreCase(abstractC4584k4.m18937x1()) || c12013m92.m56648m9().equalsIgnoreCase(strM18932k4)) && C4378x1.m17681k4(abstractC4584k4, str) == -1 && ((i8 < enumC7034k4ArrValues.length && zArr[i8]) || (i8 >= enumC7034k4ArrValues.length && i4 > 0))) {
                            if (i <= i9 || i10 >= strArrM27554x1[i8].length - 1) {
                                break loop5;
                            }
                            i9++;
                        }
                        i10++;
                    }
                }
                float fM27553x1 = C7038x1.m27527k4().m27553x1(enumC7034k4ArrValues[i8]);
                C12013m9 c12013m93 = new C12013m9(strM18932k4, c12013m9.m56639dy() * fM27553x1, c12013m9.m56642jd(), c12013m9.m56640fa(), c12013m9.m56646kk(), c12013m9.m56649to());
                if (fM27553x1 == 1.0f) {
                    float fM27501x1 = m27501x1(c12013m9) + m27492k4(c12013m9);
                    float fM27501x12 = m27501x1(c12013m93) + m27492k4(c12013m93);
                    if (fM27501x12 < fM27501x1) {
                        return new C12013m9(c12013m93.m56651x1(), c12013m93.m56639dy() * Math.min(fM27501x1 / fM27501x12, 1.1f), c12013m93.m56642jd(), c12013m93.m56640fa(), c12013m93.m56646kk(), c12013m93.m56649to());
                    }
                }
                return c12013m93;
            }
        }
        return c12013m9;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m27497k4(C12013m9 c12013m9, String str) {
        if (str.contains("…") && C4378x1.m17682k4(c12013m9, str) != -1) {
            String strReplaceAll = str.replaceAll("…", "...");
            if (C4378x1.m17682k4(c12013m9, strReplaceAll) == -1) {
                return strReplaceAll;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m27498k4(String str, String str2) {
        for (String str3 : C7038x1.m27539to()) {
            if (str3.equalsIgnoreCase(str)) {
                char[] charArray = str2.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = (char) (charArray[i] | 61440);
                }
                return new String(charArray);
            }
        }
        return str2;
    }
}
