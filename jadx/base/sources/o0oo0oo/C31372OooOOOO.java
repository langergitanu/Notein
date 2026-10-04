package o0oo0oo;

import OooOoo.C20593OooO0Oo;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31372OooOOOO extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f112017OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public LinkedHashMap<String, OooOOO> f112018OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C31373OooO0Oo[] f112019OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO[] f112020OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f112021OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f112022OooOO0O;

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO */
    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112023OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f112024OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f112025OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public AbstractC31376OooO0oo[] f112026OooO0Oo;

        public final String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.f112023OooO00o), Integer.valueOf(this.f112024OooO0O0), Integer.valueOf(this.f112025OooO0OO));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112027OooO00o;

        public abstract int OooO00o(int i);
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0O0 */
    public static class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int[] f112028OooO0O0;

        @Override // o0oo0oo.C31372OooOOOO.OooO00o
        public final int OooO00o(int i) {
            return Arrays.binarySearch(this.f112028OooO0O0, i);
        }

        public final String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.f112027OooO00o), Arrays.toString(this.f112028OooO0O0));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0OO */
    public static class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C31377OooOO0o[] f112029OooO0O0;

        @Override // o0oo0oo.C31372OooOOOO.OooO00o
        public final int OooO00o(int i) {
            for (C31377OooOO0o c31377OooOO0o : this.f112029OooO0O0) {
                int i2 = c31377OooOO0o.f112041OooO00o;
                if (i2 <= i && i <= c31377OooOO0o.f112042OooO0O0) {
                    return (c31377OooOO0o.f112043OooO0OO + i) - i2;
                }
            }
            return -1;
        }

        public final String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.f112027OooO00o));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0Oo, reason: case insensitive filesystem */
    public static class C31373OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f112030OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C31374OooO0o0 f112031OooO0O0;

        public final String toString() {
            return C20593OooO0Oo.OooO0O0("FeatureRecord[featureTag=", this.f112030OooO00o, "]");
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0o */
    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f112032OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C31375OooO0oO f112033OooO0O0;

        public final String toString() {
            return C20593OooO0Oo.OooO0O0("LangSysRecord[langSysTag=", this.f112032OooO00o, "]");
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0o0, reason: case insensitive filesystem */
    public static class C31374OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f112034OooO00o;

        public final String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.f112034OooO00o.length));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0oO, reason: case insensitive filesystem */
    public static class C31375OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112035OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int[] f112036OooO0O0;

        public final String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.f112035OooO00o));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooO0oo, reason: case insensitive filesystem */
    public static abstract class AbstractC31376OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112037OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f112038OooO0O0;

        public abstract int OooO00o(int i, int i2);
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooOO0 */
    public static class OooOO0 extends AbstractC31376OooO0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public short f112039OooO0OO;

        @Override // o0oo0oo.C31372OooOOOO.AbstractC31376OooO0oo
        public final int OooO00o(int i, int i2) {
            return i2 < 0 ? i : i + this.f112039OooO0OO;
        }

        public final String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.f112037OooO00o), Short.valueOf(this.f112039OooO0OO));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooOO0O */
    public static class OooOO0O extends AbstractC31376OooO0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f112040OooO0OO;

        @Override // o0oo0oo.C31372OooOOOO.AbstractC31376OooO0oo
        public final int OooO00o(int i, int i2) {
            return i2 < 0 ? i : this.f112040OooO0OO[i2];
        }

        public final String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.f112037OooO00o), Arrays.toString(this.f112040OooO0OO));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooOO0o, reason: case insensitive filesystem */
    public static class C31377OooOO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f112041OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f112042OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f112043OooO0OO;

        public final String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.f112041OooO00o), Integer.valueOf(this.f112042OooO0O0), Integer.valueOf(this.f112043OooO0OO));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooOOO */
    public static class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C31375OooO0oO f112044OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public LinkedHashMap<String, C31375OooO0oO> f112045OooO0O0;

        public final String toString() {
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", Boolean.valueOf(this.f112044OooO00o != null), Integer.valueOf(this.f112045OooO0O0.size()));
        }
    }

    /* JADX INFO: renamed from: o0oo0oo.OooOOOO$OooOOO0 */
    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f112046OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOOO f112047OooO0O0;

        public final String toString() {
            return C20593OooO0Oo.OooO0O0("ScriptRecord[scriptTag=", this.f112046OooO00o, "]");
        }
    }

    public C31372OooOOOO(C31401Oooo0oO c31401Oooo0oO) {
        super(c31401Oooo0oO);
        this.f112017OooO = new HashMap();
        this.f112021OooOO0 = new HashMap();
    }

    public static OooO00o OooO0O0(AbstractC31397Oooo0O0 abstractC31397Oooo0O0, long j) throws IOException {
        abstractC31397Oooo0O0.seek(j);
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        int i = 0;
        if (iOoOO == 1) {
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f112027OooO00o = iOoOO;
            int iOoOO2 = abstractC31397Oooo0O0.ooOO();
            oooO0O0.f112028OooO0O0 = new int[iOoOO2];
            while (i < iOoOO2) {
                oooO0O0.f112028OooO0O0[i] = abstractC31397Oooo0O0.ooOO();
                i++;
            }
            return oooO0O0;
        }
        if (iOoOO != 2) {
            throw new IOException(C21532OooOOo.OooO0OO(iOoOO, "Unknown coverage format: "));
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f112027OooO00o = iOoOO;
        int iOoOO3 = abstractC31397Oooo0O0.ooOO();
        oooO0OO.f112029OooO0O0 = new C31377OooOO0o[iOoOO3];
        while (i < iOoOO3) {
            C31377OooOO0o[] c31377OooOO0oArr = oooO0OO.f112029OooO0O0;
            C31377OooOO0o c31377OooOO0o = new C31377OooOO0o();
            c31377OooOO0o.f112041OooO00o = abstractC31397Oooo0O0.ooOO();
            c31377OooOO0o.f112042OooO0O0 = abstractC31397Oooo0O0.ooOO();
            c31377OooOO0o.f112043OooO0OO = abstractC31397Oooo0O0.ooOO();
            c31377OooOO0oArr[i] = c31377OooOO0o;
            i++;
        }
        return oooO0OO;
    }

    public static C31375OooO0oO OooO0OO(AbstractC31397Oooo0O0 abstractC31397Oooo0O0, long j) throws IOException {
        abstractC31397Oooo0O0.seek(j);
        C31375OooO0oO c31375OooO0oO = new C31375OooO0oO();
        abstractC31397Oooo0O0.ooOO();
        c31375OooO0oO.f112035OooO00o = abstractC31397Oooo0O0.ooOO();
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        c31375OooO0oO.f112036OooO0O0 = new int[iOoOO];
        for (int i = 0; i < iOoOO; i++) {
            c31375OooO0oO.f112036OooO0O0[i] = abstractC31397Oooo0O0.ooOO();
        }
        return c31375OooO0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [o0oo0oo.OooOOOO$OooO0oo[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o0oo0oo.OooOOOO$OooO0oo, o0oo0oo.OooOOOO$OooOO0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, o0oo0oo.OooOOOO$OooO0oo, o0oo0oo.OooOOOO$OooOO0O] */
    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        int i;
        int i2;
        int[] iArr;
        ?? oooOO02;
        long jOooO00o = abstractC31397Oooo0O0.OooO00o();
        abstractC31397Oooo0O0.ooOO();
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        int iOoOO2 = abstractC31397Oooo0O0.ooOO();
        int iOoOO3 = abstractC31397Oooo0O0.ooOO();
        int iOoOO4 = abstractC31397Oooo0O0.ooOO();
        if (iOoOO == 1) {
            abstractC31397Oooo0O0.Oooo0OO();
        }
        long j = ((long) iOoOO2) + jOooO00o;
        abstractC31397Oooo0O0.seek(j);
        int iOoOO5 = abstractC31397Oooo0O0.ooOO();
        OooOOO0[] oooOOO0Arr = new OooOOO0[iOoOO5];
        int[] iArr2 = new int[iOoOO5];
        for (int i3 = 0; i3 < iOoOO5; i3++) {
            OooOOO0 oooOOO0 = new OooOOO0();
            oooOOO0.f112046OooO00o = abstractC31397Oooo0O0.Oooo00o(4, C31413OooO0O0.f112169OooO00o);
            iArr2[i3] = abstractC31397Oooo0O0.ooOO();
            oooOOO0Arr[i3] = oooOOO0;
        }
        int i4 = 0;
        while (i4 < iOoOO5) {
            OooOOO0 oooOOO02 = oooOOO0Arr[i4];
            long j2 = ((long) iArr2[i4]) + j;
            abstractC31397Oooo0O0.seek(j2);
            OooOOO oooOOO = new OooOOO();
            long j3 = jOooO00o;
            int iOoOO6 = abstractC31397Oooo0O0.ooOO();
            int iOoOO7 = abstractC31397Oooo0O0.ooOO();
            long j4 = j;
            OooO0o[] oooO0oArr = new OooO0o[iOoOO7];
            int[] iArr3 = new int[iOoOO7];
            String str = "";
            int i5 = 0;
            while (i5 < iOoOO7) {
                int i6 = i5;
                OooO0o oooO0o = new OooO0o();
                OooOOO0[] oooOOO0Arr2 = oooOOO0Arr;
                int[] iArr4 = iArr2;
                String strOooo00o = abstractC31397Oooo0O0.Oooo00o(4, C31413OooO0O0.f112169OooO00o);
                oooO0o.f112032OooO00o = strOooo00o;
                if (i6 > 0 && strOooo00o.compareTo(str) <= 0) {
                    throw new IOException(com.aspose.slides.OooOOO.OooO0O0(new StringBuilder("LangSysRecords not alphabetically sorted by LangSys tag: "), oooO0o.f112032OooO00o, " <= ", str));
                }
                iArr3[i6] = abstractC31397Oooo0O0.ooOO();
                oooO0oArr[i6] = oooO0o;
                str = oooO0o.f112032OooO00o;
                i5 = i6 + 1;
                oooOOO0Arr = oooOOO0Arr2;
                iArr2 = iArr4;
            }
            OooOOO0[] oooOOO0Arr3 = oooOOO0Arr;
            int[] iArr5 = iArr2;
            if (iOoOO6 != 0) {
                oooOOO.f112044OooO00o = OooO0OO(abstractC31397Oooo0O0, ((long) iOoOO6) + j2);
            }
            for (int i7 = 0; i7 < iOoOO7; i7++) {
                oooO0oArr[i7].f112033OooO0O0 = OooO0OO(abstractC31397Oooo0O0, ((long) iArr3[i7]) + j2);
            }
            oooOOO.f112045OooO0O0 = new LinkedHashMap<>(iOoOO7);
            for (int i8 = 0; i8 < iOoOO7; i8++) {
                OooO0o oooO0o2 = oooO0oArr[i8];
                oooOOO.f112045OooO0O0.put(oooO0o2.f112032OooO00o, oooO0o2.f112033OooO0O0);
            }
            oooOOO02.f112047OooO0O0 = oooOOO;
            i4++;
            jOooO00o = j3;
            j = j4;
            oooOOO0Arr = oooOOO0Arr3;
            iArr2 = iArr5;
        }
        long j5 = jOooO00o;
        OooOOO0[] oooOOO0Arr4 = oooOOO0Arr;
        LinkedHashMap<String, OooOOO> linkedHashMap = new LinkedHashMap<>(iOoOO5);
        for (int i9 = 0; i9 < iOoOO5; i9++) {
            OooOOO0 oooOOO03 = oooOOO0Arr4[i9];
            linkedHashMap.put(oooOOO03.f112046OooO00o, oooOOO03.f112047OooO0O0);
        }
        this.f112018OooO0o = linkedHashMap;
        long j6 = j5 + ((long) iOoOO3);
        abstractC31397Oooo0O0.seek(j6);
        int iOoOO8 = abstractC31397Oooo0O0.ooOO();
        C31373OooO0Oo[] c31373OooO0OoArr = new C31373OooO0Oo[iOoOO8];
        int[] iArr6 = new int[iOoOO8];
        String str2 = "";
        for (int i10 = 0; i10 < iOoOO8; i10++) {
            C31373OooO0Oo c31373OooO0Oo = new C31373OooO0Oo();
            String strOooo00o2 = abstractC31397Oooo0O0.Oooo00o(4, C31413OooO0O0.f112169OooO00o);
            c31373OooO0Oo.f112030OooO00o = strOooo00o2;
            if (i10 > 0 && strOooo00o2.compareTo(str2) < 0) {
                if (!c31373OooO0Oo.f112030OooO00o.matches("\\w{4}") || !str2.matches("\\w{4}")) {
                    Log.w("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + c31373OooO0Oo.f112030OooO00o + " < " + str2);
                    i = 0;
                    c31373OooO0OoArr = new C31373OooO0Oo[0];
                    break;
                }
                Log.d("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + c31373OooO0Oo.f112030OooO00o + " < " + str2);
            }
            iArr6[i10] = abstractC31397Oooo0O0.ooOO();
            c31373OooO0OoArr[i10] = c31373OooO0Oo;
            str2 = c31373OooO0Oo.f112030OooO00o;
        }
        i = 0;
        for (int i11 = 0; i11 < iOoOO8; i11++) {
            C31373OooO0Oo c31373OooO0Oo2 = c31373OooO0OoArr[i11];
            abstractC31397Oooo0O0.seek(((long) iArr6[i11]) + j6);
            C31374OooO0o0 c31374OooO0o0 = new C31374OooO0o0();
            abstractC31397Oooo0O0.ooOO();
            int iOoOO9 = abstractC31397Oooo0O0.ooOO();
            c31374OooO0o0.f112034OooO00o = new int[iOoOO9];
            for (int i12 = 0; i12 < iOoOO9; i12++) {
                c31374OooO0o0.f112034OooO00o[i12] = abstractC31397Oooo0O0.ooOO();
            }
            c31373OooO0Oo2.f112031OooO0O0 = c31374OooO0o0;
        }
        this.f112019OooO0oO = c31373OooO0OoArr;
        long j7 = j5 + ((long) iOoOO4);
        abstractC31397Oooo0O0.seek(j7);
        int iOoOO10 = abstractC31397Oooo0O0.ooOO();
        int[] iArr7 = new int[iOoOO10];
        for (int i13 = i; i13 < iOoOO10; i13++) {
            iArr7[i13] = abstractC31397Oooo0O0.ooOO();
        }
        OooO[] oooOArr = new OooO[iOoOO10];
        int i14 = i;
        while (i14 < iOoOO10) {
            long j8 = ((long) iArr7[i14]) + j7;
            abstractC31397Oooo0O0.seek(j8);
            OooO oooO = new OooO();
            oooO.f112023OooO00o = abstractC31397Oooo0O0.ooOO();
            oooO.f112024OooO0O0 = abstractC31397Oooo0O0.ooOO();
            int iOoOO11 = abstractC31397Oooo0O0.ooOO();
            int[] iArr8 = new int[iOoOO11];
            for (int i15 = i; i15 < iOoOO11; i15++) {
                iArr8[i15] = abstractC31397Oooo0O0.ooOO();
            }
            if ((oooO.f112024OooO0O0 & 16) != 0) {
                oooO.f112025OooO0OO = abstractC31397Oooo0O0.ooOO();
            }
            oooO.f112026OooO0Oo = new AbstractC31376OooO0oo[iOoOO11];
            if (oooO.f112023OooO00o != 1) {
                Log.d("PdfBox-Android", "Type " + oooO.f112023OooO00o + " GSUB lookup table is not supported and will be ignored");
            } else {
                int i16 = 0;
                while (i16 < iOoOO11) {
                    ?? r11 = oooO.f112026OooO0Oo;
                    long j9 = j7;
                    long j10 = ((long) iArr8[i16]) + j8;
                    abstractC31397Oooo0O0.seek(j10);
                    int iOoOO12 = abstractC31397Oooo0O0.ooOO();
                    if (iOoOO12 == 1) {
                        i2 = iOoOO10;
                        iArr = iArr7;
                        oooOO02 = new OooOO0();
                        oooOO02.f112037OooO00o = iOoOO12;
                        int iOoOO13 = abstractC31397Oooo0O0.ooOO();
                        oooOO02.f112039OooO0OO = abstractC31397Oooo0O0.Oooo000();
                        oooOO02.f112038OooO0O0 = OooO0O0(abstractC31397Oooo0O0, j10 + ((long) iOoOO13));
                    } else {
                        if (iOoOO12 != 2) {
                            throw new IOException(C21532OooOOo.OooO0OO(iOoOO12, "Unknown substFormat: "));
                        }
                        oooOO02 = new OooOO0O();
                        oooOO02.f112037OooO00o = iOoOO12;
                        int iOoOO14 = abstractC31397Oooo0O0.ooOO();
                        i2 = iOoOO10;
                        int iOoOO15 = abstractC31397Oooo0O0.ooOO();
                        iArr = iArr7;
                        oooOO02.f112040OooO0OO = new int[iOoOO15];
                        int i17 = 0;
                        while (i17 < iOoOO15) {
                            oooOO02.f112040OooO0OO[i17] = abstractC31397Oooo0O0.ooOO();
                            i17++;
                            iOoOO15 = iOoOO15;
                        }
                        oooOO02.f112038OooO0O0 = OooO0O0(abstractC31397Oooo0O0, j10 + ((long) iOoOO14));
                    }
                    r11[i16] = oooOO02;
                    i16++;
                    j7 = j9;
                    iOoOO10 = i2;
                    iArr7 = iArr;
                }
            }
            long j11 = j7;
            int i18 = iOoOO10;
            int[] iArr9 = iArr7;
            oooOArr[i14] = oooO;
            i14++;
            j7 = j11;
            iOoOO10 = i18;
            iArr7 = iArr9;
            i = 0;
        }
        this.f112020OooO0oo = oooOArr;
    }
}
