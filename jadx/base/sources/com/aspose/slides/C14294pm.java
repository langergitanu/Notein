package com.aspose.slides;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3063jd;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10398dc;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10619ri;
import com.aspose.slides.internal.p407st.C10661u4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pm */
/* JADX INFO: loaded from: classes3.dex */
class C14294pm {
    /* JADX INFO: renamed from: k4 */
    public static long m69135k4(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return 1L;
        }
        if (i == 2) {
            return 2L;
        }
        if (i == 3) {
            return 3L;
        }
        if (i == 4) {
            return 4L;
        }
        if (i == 5) {
            return 5L;
        }
        if (i != 10) {
            return i != 11 ? 254L : 7L;
        }
        return 6L;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m69136k4(IColorFormat iColorFormat, y2n y2nVar) {
        int colorType = iColorFormat.getColorType();
        if (colorType == 1) {
            float[] fArr = {iColorFormat.getFloatR()};
            float[] fArr2 = {iColorFormat.getFloatG()};
            float[] fArr3 = {iColorFormat.getFloatB()};
            C3063jd.m12959x1(fArr, fArr2, fArr3);
            return C14080ne.m66887dy(Integer.valueOf((C22202OooO0oo.OooO00o(fArr[0], 100.0f, 13) & 255) | ((C22202OooO0oo.OooO00o(fArr2[0], 100.0f, 13) & 255) << 8) | ((C22202OooO0oo.OooO00o(fArr3[0], 100.0f, 13) & 255) << 16)));
        }
        if (colorType == 2) {
            long jM66887dy = C14080ne.m66887dy((Integer) 8355711);
            y2nVar.m73707k4("ColorType ColorType.HSL is not supported for saving yet", 2);
            return jM66887dy;
        }
        if (colorType != 3) {
            return colorType != 4 ? C14080ne.m66887dy(Integer.valueOf(((iColorFormat.getB() & 255) << 16) | (iColorFormat.getR() & 255) | ((iColorFormat.getG() & 255) << 8))) : C14080ne.m66887dy(Integer.valueOf((((byte) iColorFormat.getSystemColor()) & 255) | com.aspose.words.WarningType.HINT));
        }
        long jM69135k4 = m69135k4(iColorFormat.getSchemeColor());
        return jM69135k4 != 254 ? C14080ne.m66887dy(Integer.valueOf((((byte) jM69135k4) & 255) | 134217728)) : C14080ne.m66887dy(Integer.valueOf(((iColorFormat.getB() & 255) << 16) | (iColorFormat.getR() & 255) | ((iColorFormat.getG() & 255) << 8)));
    }

    /* JADX INFO: renamed from: k4 */
    public static C10661u4 m69137k4(IColorFormat iColorFormat) {
        C10661u4 c10661u4 = new C10661u4(255L, C12003du.f40505to.Clone());
        return (iColorFormat == null || iColorFormat.getColorType() == -1) ? c10661u4 : new C10661u4(254L, ((ColorFormat) iColorFormat).m1084to().Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69138k4(IColorFormat iColorFormat, int i, int i2) {
        IColorOperationCollection colorTransform;
        if ((i & 128) != 0) {
            iColorFormat.getColorTransform().add(4);
        }
        int i3 = i & 15;
        if (i3 == 1) {
            iColorFormat.getColorTransform().add(26);
            iColorFormat.getColorTransform().add(1, i2 / 255.0f);
        } else if (i3 != 2) {
            if (i3 == 3) {
                colorTransform = iColorFormat.getColorTransform();
            } else {
                if (i3 != 4) {
                    if (i3 == 5) {
                        iColorFormat.getColorTransform().add(3);
                        colorTransform = iColorFormat.getColorTransform();
                        i2 -= 255;
                    }
                    if ((i & 32) != 0) {
                        iColorFormat.getColorTransform().add(3);
                    }
                    if ((i & 64) != 0) {
                        iColorFormat.getColorTransform().add(3);
                        return;
                    }
                    return;
                }
                colorTransform = iColorFormat.getColorTransform();
                i2 = -i2;
            }
            float f = i2 / 255.0f;
            colorTransform.add(18, f);
            iColorFormat.getColorTransform().add(21, f);
            iColorFormat.getColorTransform().add(24, f);
            if ((i & 32) != 0) {
            }
            if ((i & 64) != 0) {
            }
        } else {
            iColorFormat.getColorTransform().add(26);
            iColorFormat.getColorTransform().add(0, i2 / 255.0f);
        }
        iColorFormat.getColorTransform().add(27);
        if ((i & 32) != 0) {
        }
        if ((i & 64) != 0) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69139k4(IColorFormat iColorFormat, long j, double d) {
        if ((268435456 & j) != 0) {
            long j2 = 4294967295L & j;
            int i = (int) (j & 255);
            if (i <= 30) {
                iColorFormat.setSystemColor(i);
            }
            ((ColorFormat) iColorFormat).m1080k4(C12003du.m56460uz().Clone());
            m69138k4(iColorFormat, (int) ((j2 >> 8) & 255), (int) ((j2 >> 16) & 255));
        } else if ((134217728 & j) != 0) {
            iColorFormat.setSchemeColor(f6b.m5959to((int) (j & 255)));
        } else {
            ((ColorFormat) iColorFormat).m1080k4(C3085sv.m13078k4(j));
        }
        iColorFormat.getColorTransform().clear();
        if (d < 1.0d) {
            iColorFormat.getColorTransform().add(5, (float) d);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69140k4(IColorFormat iColorFormat, C10462h9 c10462h9, int i, int i2, long j) {
        m69142k4(iColorFormat, c10462h9, null, i, i2, j, 8);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69141k4(IColorFormat iColorFormat, C10462h9 c10462h9, C10462h9 c10462h92, int i, int i2, long j) {
        m69142k4(iColorFormat, c10462h9, c10462h92, i, i2, j, 8);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69142k4(IColorFormat iColorFormat, C10462h9 c10462h9, C10462h9 c10462h92, int i, int i2, long j, int i3) {
        m69143k4(iColorFormat, c10462h9, c10462h92, C10398dc.m50663k4(c10462h9, c10462h92, i, j), i2, i3 - 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public static void m69143k4(IColorFormat iColorFormat, C10462h9 c10462h9, C10462h9 c10462h92, long j, int i, int i2) {
        long j2;
        int i3;
        int i4;
        IColorFormat iColorFormat2;
        int i5;
        C10462h9 c10462h93 = c10462h9;
        C10462h9 c10462h94 = c10462h92;
        double dM50663k4 = (C10398dc.m50663k4(c10462h93, c10462h94, i, 65536L) & 4294967295L) / 65536.0d;
        long j3 = j & 4294967295L;
        if ((268435456 & j) != 0) {
            long j4 = j & 255;
            if (j4 >= 240 && j4 <= 247 && i2 > 0) {
                switch ((int) j4) {
                    case 241:
                    case 242:
                        j2 = 0;
                        i3 = i2 - 1;
                        i4 = 448;
                        iColorFormat2 = iColorFormat;
                        c10462h93 = c10462h9;
                        c10462h94 = c10462h92;
                        i5 = i;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                    case 243:
                        j2 = 0;
                        i3 = i2 - 1;
                        i4 = InputDeviceCompat.SOURCE_DPAD;
                        iColorFormat2 = iColorFormat;
                        c10462h93 = c10462h9;
                        c10462h94 = c10462h92;
                        i5 = i;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                    case 244:
                        ((ColorFormat) iColorFormat).m1080k4(C12003du.m56460uz().Clone());
                        iColorFormat2 = iColorFormat;
                        break;
                    case 245:
                        j2 = 16777215;
                        i3 = i2 - 1;
                        i4 = 387;
                        iColorFormat2 = iColorFormat;
                        c10462h93 = c10462h9;
                        c10462h94 = c10462h92;
                        i5 = i;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                    case 246:
                        j2 = 16777215;
                        i3 = i2 - 1;
                        i4 = 450;
                        iColorFormat2 = iColorFormat;
                        c10462h93 = c10462h9;
                        c10462h94 = c10462h92;
                        i5 = i;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                    case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                        if (m69146k4(C10398dc.m50667kk(c10462h93, 447), c10462h93, c10462h94)) {
                            j2 = 16777215;
                            i3 = i2 - 1;
                            i4 = 385;
                            iColorFormat2 = iColorFormat;
                            i5 = i;
                            m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        }
                        j2 = 0;
                        i3 = i2 - 1;
                        i4 = 448;
                        iColorFormat2 = iColorFormat;
                        c10462h93 = c10462h9;
                        c10462h94 = c10462h92;
                        i5 = i;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                    default:
                        j2 = 16777215;
                        i3 = i2 - 1;
                        i4 = 385;
                        i5 = i;
                        iColorFormat2 = iColorFormat;
                        m69142k4(iColorFormat2, c10462h93, c10462h94, i4, i5, j2, i3);
                        break;
                }
                m69138k4(iColorFormat2, (int) ((j3 >> 8) & 255), (int) ((j3 >> 16) & 255));
                return;
            }
        }
        m69139k4(iColorFormat, j, dM50663k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69144k4(IColorFormat iColorFormat, C10480ii c10480ii, int i, int i2, y2n y2nVar) {
        if (iColorFormat == null || iColorFormat.getColorType() == -1) {
            return;
        }
        c10480ii.m50930x1(new C10609qn(i, m69136k4(iColorFormat, y2nVar)));
        IGenericEnumerator<IColorOperation> it = iColorFormat.getColorTransform().iterator();
        while (it.hasNext()) {
            try {
                IColorOperation next = it.next();
                if (next.getOperationType() != 5) {
                    y2nVar.m73707k4(C14113y2.m67408k4("ColorOperation #", C14042ak.m66410k4(ColorTransformOperation.class, next.getOperationType()), " is not implemented yet."), 2);
                } else {
                    c10480ii.m50930x1(new C10609qn(i2, C7019kk.m27435du(Float.valueOf(next.getParameter() * 65536.0f), 13)));
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
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69145k4(IColorFormat iColorFormat, C10661u4 c10661u4) {
        if (c10661u4.m51794x1() == 255) {
            ((ColorFormat) iColorFormat).m1071dy();
        } else if (c10661u4.m51794x1() == 254) {
            ((ColorFormat) iColorFormat).m1080k4(c10661u4.m51789k4().Clone());
        } else {
            iColorFormat.setSchemeColor(f6b.m5959to(((byte) c10661u4.m51794x1()) & 255));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m69146k4(C10609qn c10609qn, C10462h9 c10462h9, C10462h9 c10462h92) {
        C10619ri c10619riM51621k4 = C10619ri.m51621k4(new C10609qn(447, 0L), false);
        c10619riM51621k4.m51624k4(28L, (byte) 1);
        C10609qn c10609qnM50667kk = c10462h92 != null ? C10398dc.m50667kk(c10462h92, 447) : null;
        if (c10609qnM50667kk != null) {
            c10619riM51621k4.m51625k4(c10609qnM50667kk);
        }
        if (c10609qn != null) {
            c10619riM51621k4.m51625k4(c10609qn);
        }
        return (c10609qn == null && c10609qnM50667kk == null) ? (C10398dc.m50663k4(c10462h9, c10462h92, 384, 10L) & 4294967295L) < 10 : c10619riM51621k4.m51623k4(16L) == 1;
    }
}
