package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.ks */
/* JADX INFO: loaded from: classes.dex */
public class C3791ks {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f10330x1 = new C7017h4("rotate", "translate", "scale", "shear", "skew", "skewX", "skewY", "matrix", "xMinYMin", "xMinYMid", "xMinYMax", "xMidYMin", "xMidYMid", "xMidYMax", "xMaxYMin", "xMaxYMid");

    /* JADX INFO: renamed from: k4 */
    private C3786fa f10331k4;

    public C3791ks(C3786fa c3786fa) {
        this.f10331k4 = c3786fa;
    }

    /* JADX INFO: renamed from: k4 */
    private float m15146k4(String str, C12015qq c12015qq, boolean z) {
        return z ? C10308dy.m50270k4(str) : this.f10331k4.m15129k4(str, C14113y2.f47374k4, (C3181c5) null, c12015qq.Clone());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.aspose.slides.internal.eq.ks] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX INFO: renamed from: x1 */
    public final Dictionary<Integer, C3796yj> m15150x1(String str, C12015qq c12015qq) {
        int i;
        ?? r23;
        int i2;
        ?? r0 = this;
        int i3 = 7;
        int i4 = 2;
        Dictionary<Integer, C3796yj> dictionary = new Dictionary<>();
        int i5 = 1;
        String[] strArrM67417k4 = C14113y2.m67417k4(str, new String[]{")"}, 1);
        int length = strArrM67417k4.length;
        ?? r11 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            String[] strArrM67417k42 = C14113y2.m67417k4(strArrM67417k4[i6], new String[]{"("}, i5);
            if (strArrM67417k42.length != i4) {
                i2 = i4;
                i = i5;
                r23 = r11;
            } else {
                char[] cArr = new char[i3];
                // fill-array-data instruction
                cArr[0] = ' ';
                cArr[1] = ',';
                cArr[2] = '\r';
                cArr[3] = '\n';
                cArr[4] = '\t';
                cArr[5] = '(';
                cArr[6] = ')';
                String strM67423kk = C14113y2.m67423kk(strArrM67417k42[r11], cArr);
                char[] cArr2 = new char[i3];
                // fill-array-data instruction
                cArr2[0] = ' ';
                cArr2[1] = ',';
                cArr2[2] = '\r';
                cArr2[3] = '\n';
                cArr2[4] = '\t';
                cArr2[5] = '(';
                cArr2[6] = ')';
                String strM67423kk2 = C14113y2.m67423kk(strArrM67417k42[i5], cArr2);
                ?? r4 = ("translate".equals(strM67423kk) || "matrix".equals(strM67423kk)) ? r11 : i5;
                ?? r232 = r11;
                String[] strArrM67417k43 = C14113y2.m67417k4(strM67423kk2, new String[]{",", " "}, i5);
                if (strArrM67417k43.length == i5) {
                    float fM15146k4 = r0.m15146k4(strArrM67417k43[r232 == true ? 1 : 0], c12015qq.Clone(), r4);
                    float f = "translate".equals(strM67423kk) ? 0.0f : fM15146k4;
                    int i8 = i7 + 1;
                    Integer numValueOf = Integer.valueOf(i7);
                    i = i5;
                    float[] fArr = new float[i4];
                    fArr[r232 == true ? 1 : 0] = fM15146k4;
                    fArr[i] = f;
                    dictionary.addItem(numValueOf, new C3796yj(strM67423kk, fArr));
                    i7 = i8;
                } else {
                    i = i5;
                }
                if (strArrM67417k43.length == i4) {
                    float fM15146k42 = r0.m15146k4(strArrM67417k43[r232 == true ? 1 : 0], c12015qq.Clone(), r4);
                    float fM15146k43 = r0.m15146k4(strArrM67417k43[i], c12015qq.Clone(), r4);
                    Integer numValueOf2 = Integer.valueOf(i7);
                    float[] fArr2 = new float[i4];
                    fArr2[r232 == true ? 1 : 0] = fM15146k42;
                    fArr2[i] = fM15146k43;
                    dictionary.addItem(numValueOf2, new C3796yj(strM67423kk, fArr2));
                    i7++;
                    i2 = i4;
                    r23 = r232;
                } else {
                    if ("rotate".equals(strM67423kk) && strArrM67417k43.length >= 3) {
                        ?? r5 = i;
                        float fM15146k44 = r0.m15146k4(strArrM67417k43[r232 == true ? 1 : 0], c12015qq.Clone(), r5);
                        float fM15146k45 = r0.m15146k4(strArrM67417k43[r5 == true ? 1 : 0], c12015qq.Clone(), r232);
                        float fM15146k46 = r0.m15146k4(strArrM67417k43[i4], c12015qq.Clone(), r232);
                        Integer numValueOf3 = Integer.valueOf(i7);
                        float[] fArr3 = new float[i4];
                        fArr3[r232 == true ? 1 : 0] = fM15146k45;
                        fArr3[i] = fM15146k46;
                        dictionary.addItem(numValueOf3, new C3796yj("translate", fArr3));
                        int i9 = i7 + 2;
                        Integer numValueOf4 = Integer.valueOf(i7 + 1);
                        int i10 = i;
                        float[] fArr4 = new float[i10];
                        fArr4[r232 == true ? 1 : 0] = fM15146k44;
                        dictionary.addItem(numValueOf4, new C3796yj("rotate", fArr4));
                        i7 += 3;
                        Integer numValueOf5 = Integer.valueOf(i9);
                        float[] fArr5 = new float[2];
                        fArr5[r232 == true ? 1 : 0] = -fM15146k45;
                        fArr5[i10] = -fM15146k46;
                        dictionary.addItem(numValueOf5, new C3796yj("translate", fArr5));
                    } else if (!"matrix".equals(strM67423kk) || strArrM67417k43.length < 6) {
                        i2 = 2;
                        i = 1;
                        r23 = r232;
                    } else {
                        i = 1;
                        r23 = 0;
                        i2 = 2;
                        dictionary.addItem(Integer.valueOf(i7), new C3796yj("matrix", new float[]{r0.m15146k4(strArrM67417k43[r232 == true ? 1 : 0], c12015qq.Clone(), true), r0.m15146k4(strArrM67417k43[1], c12015qq.Clone(), true), r0.m15146k4(strArrM67417k43[2], c12015qq.Clone(), true), r0.m15146k4(strArrM67417k43[3], c12015qq.Clone(), true), r0.m15146k4(strArrM67417k43[4], c12015qq.Clone(), false), r0.m15146k4(strArrM67417k43[5], c12015qq.Clone(), false)}));
                        i7++;
                        i6++;
                        r0 = this;
                        r11 = r23;
                        i4 = i2;
                        i5 = i;
                        i3 = 7;
                    }
                    i2 = 2;
                    i = 1;
                    r23 = r232;
                }
            }
            i6++;
            r0 = this;
            r11 = r23;
            i4 = i2;
            i5 = i;
            i3 = 7;
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4317dy m15148k4(float[] fArr, float f, float f2, String str) {
        C4317dy c4317dy = new C4317dy();
        float f3 = fArr[2] / fArr[3];
        float f4 = f / f2;
        if ("none".equals(str)) {
            c4317dy.m17335k4(f / fArr[2], f2 / fArr[3]);
            c4317dy.m17348x1(-fArr[0], -fArr[1]);
            return c4317dy;
        }
        if (f3 < f4) {
            float f5 = f2 / fArr[3];
            c4317dy.m17335k4(f5, f5);
            switch (f10330x1.m27428k4(str)) {
                case 8:
                case 9:
                case 10:
                    c4317dy.m17348x1(-fArr[0], -fArr[1]);
                    break;
                case 11:
                case 12:
                case 13:
                    c4317dy.m17348x1((-fArr[0]) - ((fArr[2] - ((f * fArr[3]) / f2)) / 2.0f), -fArr[1]);
                    break;
                default:
                    c4317dy.m17348x1((-fArr[0]) - (fArr[2] - ((f * fArr[3]) / f2)), -fArr[1]);
                    break;
            }
            return c4317dy;
        }
        float f6 = f / fArr[2];
        c4317dy.m17335k4(f6, f6);
        switch (f10330x1.m27428k4(str)) {
            case 8:
            case 11:
            case 14:
                c4317dy.m17348x1(-fArr[0], -fArr[1]);
                break;
            case 9:
            case 12:
            case 15:
                c4317dy.m17348x1(-fArr[0], (-fArr[1]) - ((fArr[3] - ((f2 * fArr[2]) / f)) / 2.0f));
                break;
            case 10:
            case 13:
            default:
                c4317dy.m17348x1(-fArr[0], (-fArr[1]) - (fArr[3] - ((f2 * fArr[2]) / f)));
                break;
        }
        return c4317dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m15149k4(String str, C12015qq c12015qq) {
        float fM67466c5;
        double dM67466c5;
        try {
            C11913yj c11913yj = new C11913yj();
            try {
                Dictionary<Integer, C3796yj> dictionaryM15150x1 = m15150x1(str, c12015qq.Clone());
                for (int i = 0; i < dictionaryM15150x1.size(); i++) {
                    C3796yj c3796yj = dictionaryM15150x1.get_Item(Integer.valueOf(i));
                    String str2 = c3796yj.f10333k4;
                    float[] fArr = c3796yj.f10334x1;
                    switch (f10330x1.m27428k4(str2)) {
                        case 0:
                            c11913yj.m55762k4(fArr[0]);
                            continue;
                            break;
                        case 1:
                            c11913yj.m55777kk(fArr[0], fArr[1]);
                            continue;
                            break;
                        case 2:
                            c11913yj.m55763k4(fArr[0], fArr[1]);
                            continue;
                            break;
                        case 3:
                            c11913yj.m55785x1(fArr[0], fArr[1]);
                            continue;
                            break;
                        case 4:
                            fM67466c5 = (float) C14116yg.m67466c5(((double) (fArr[0] / 180.0f)) * 3.141592653589793d);
                            dM67466c5 = C14116yg.m67466c5(((double) (fArr[1] / 180.0f)) * 3.141592653589793d);
                            break;
                        case 5:
                            c11913yj.m55785x1((float) C14116yg.m67466c5(((double) (fArr[0] / 180.0f)) * 3.141592653589793d), (float) C14116yg.m67466c5(0.0d));
                            continue;
                            break;
                        case 6:
                            fM67466c5 = (float) C14116yg.m67466c5(0.0d);
                            dM67466c5 = C14116yg.m67466c5(((double) (fArr[0] / 180.0f)) * 3.141592653589793d);
                            break;
                        case 7:
                            c11913yj.m55787x1(new C11913yj(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]));
                            continue;
                            break;
                        default:
                            continue;
                            break;
                    }
                    c11913yj.m55785x1(fM67466c5, (float) dM67466c5);
                }
                return c11913yj;
            } catch (RuntimeException e) {
                e = e;
                if (C4113k4.f11284k4) {
                    return new C11913yj();
                }
                throw e;
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m15147k4(C11913yj c11913yj) {
        float f = c11913yj.m55776k4()[0];
        float f2 = c11913yj.m55776k4()[1];
        float f3 = c11913yj.m55776k4()[2];
        float f4 = c11913yj.m55776k4()[3];
        return new float[]{(float) C14116yg.m67475k4(C14116yg.m67496rv((f2 * f2) + (f * f))), (float) C14116yg.m67475k4(C14116yg.m67496rv((f4 * f4) + (f3 * f3)))};
    }
}
