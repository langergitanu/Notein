package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.b3 */
/* JADX INFO: loaded from: classes4.dex */
class C6979b3 {
    /* JADX INFO: renamed from: du */
    public static String m27303du(int i) {
        switch (i) {
            case 1633842036:
                return "AbstractClass";
            case 1818848875:
                return "LinkClass";
            case 1835955314:
                return "DisplayClass";
            case 1852662636:
                return "NamedColorClass";
            case 1886549106:
                return "OutputClass";
            case 1935896178:
                return "InputClass";
            case 1936744803:
                return "ColorSpaceClass";
            default:
                throw new NotSupportedException("Invalid ProfileClassSignature");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27304k4(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            fArr[i] = m27309kk(fArr[i]);
        }
    }

    /* JADX INFO: renamed from: kk */
    public static byte m27308kk(int i) {
        switch (i) {
            case 1129142603:
                return (byte) 4;
            case 1196573017:
                return (byte) 1;
            case 1281450528:
            case 1380401696:
            case 1482250784:
                return (byte) 3;
            default:
                throw new NotSupportedException(C14113y2.m67402k4("Not supported ColorSpace: {0}", C7019kk.m27466x1(i)));
        }
    }

    /* JADX INFO: renamed from: to */
    public static String m27310to(int i) {
        switch (i) {
            case 1482250784:
                return "XyzType (XyzArrayType)";
            case 1650877472:
                return "UcrBgType";
            case 1667789421:
                return "ChromaticityType";
            case 1668051567:
                return "ColorantOrderType";
            case 1668051572:
                return "ColorantTableType";
            case 1668441193:
                return "CrdInfoType";
            case 1668641398:
                return "CurveType";
            case 1684108385:
                return "DataType";
            case 1684370275:
                return "TextDescriptionType";
            case 1684371059:
                return "DeviceSettingsType";
            case 1684628340:
                return "DictType";
            case 1685350765:
                return "DateTimeType";
            case 1832993312:
                return "LutAtoBType";
            case 1833058592:
                return "LutBtoAType";
            case 1835360627:
                return "MeasurementType";
            case 1835430961:
                return "Lut8Type";
            case 1835430962:
                return "Lut16Type";
            case 1835824483:
                return "MultiLocalizedUnicodeType";
            case 1836082548:
                return "MultiProcessElementType";
            case 1852009522:
                return "NamedColor2Type";
            case 1885434465:
                return "ParametricCurveType";
            case 1886610801:
                return "ProfileSequenceDescType";
            case 1886611812:
                return "ProfileSequceIdType";
            case 1919120178:
                return "ResponseCurveSet16Type";
            case 1935897198:
                return "ScreeningType";
            case 1936077618:
                return "S15Fixed16ArrayType";
            case 1936287520:
                return "SignatureType";
            case 1952807028:
                return "TextType";
            case 1969632050:
                return "U16Fixed16ArrayType";
            case 1969827896:
                return "UInt8ArrayType";
            case 1969828150:
                return "UInt16ArrayType";
            case 1969828658:
                return "UInt32ArrayType";
            case 1969829428:
                return "UInt64ArrayType";
            case 1986618743:
                return "ViewingConditionsType";
            default:
                throw new NotSupportedException("Invalid TagTypeSignature");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static float m27311x1(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27305k4(float f) {
        return f > 0.9999999f && f < 1.0000001f;
    }

    /* JADX INFO: renamed from: kk */
    public static float m27309kk(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m27312x1(int i) {
        return i == 1129142603 || i == 876825682;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27306k4(int i) {
        return i == 1482250784 || i == 1281450528;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m27313x1(float[] fArr) {
        float f = fArr[4];
        float f2 = fArr[8];
        float f3 = fArr[7];
        float f4 = fArr[5];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[0];
        float f8 = (f * f2) - (f3 * f4);
        float f9 = fArr[1];
        float f10 = (f5 * f2) - (f6 * f4);
        float f11 = fArr[2];
        float f12 = (f5 * f3) - (f6 * f);
        float f13 = (f11 * f12) + ((f7 * f8) - (f9 * f10));
        if (f13 == 0.0f) {
            return false;
        }
        float[] fArr2 = {f8, -f10, f12, -((f9 * f2) - (f3 * f11)), (f2 * f7) - (f6 * f11), -((f3 * f7) - (f6 * f9)), (f9 * f4) - (f * f11), -((f4 * f7) - (f11 * f5)), (f7 * f) - (f5 * f9)};
        fArr[0] = fArr2[0] / f13;
        fArr[1] = fArr2[3] / f13;
        fArr[2] = fArr2[6] / f13;
        fArr[3] = fArr2[1] / f13;
        fArr[4] = fArr2[4] / f13;
        fArr[5] = fArr2[7] / f13;
        fArr[6] = fArr2[2] / f13;
        fArr[7] = fArr2[5] / f13;
        fArr[8] = fArr2[8] / f13;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27307k4(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (m27306k4(i) && m27306k4(i2)) {
            return true;
        }
        return m27312x1(i) && m27312x1(i2);
    }
}
