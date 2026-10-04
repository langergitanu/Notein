package o0oo0oO0;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o0oo0oO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31330OooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final LinkedHashMap f111877OooO0OO = new LinkedHashMap(52);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LinkedHashMap f111878OooO0Oo = new LinkedHashMap(52);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f111879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f111880OooO0O0;

    /* JADX INFO: renamed from: o0oo0oO0.OooO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f111881OooO00o;

        public OooO00o(int i) {
            this(new int[]{i});
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return Arrays.equals(this.f111881OooO00o, ((OooO00o) obj).f111881OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f111881OooO00o);
        }

        public final String toString() {
            return Arrays.toString(this.f111881OooO00o);
        }

        public OooO00o(int i, int i2) {
            this(new int[]{i, i2});
        }

        public OooO00o(int[] iArr) {
            this.f111881OooO00o = iArr;
        }
    }

    static {
        OooO00o(new OooO00o(0), "version");
        OooO00o(new OooO00o(1), "Notice");
        OooO00o(new OooO00o(12, 0), "Copyright");
        OooO00o(new OooO00o(2), "FullName");
        OooO00o(new OooO00o(3), "FamilyName");
        OooO00o(new OooO00o(4), "Weight");
        OooO00o(new OooO00o(12, 1), "isFixedPitch");
        OooO00o(new OooO00o(12, 2), "ItalicAngle");
        OooO00o(new OooO00o(12, 3), "UnderlinePosition");
        OooO00o(new OooO00o(12, 4), "UnderlineThickness");
        OooO00o(new OooO00o(12, 5), "PaintType");
        OooO00o(new OooO00o(12, 6), "CharstringType");
        OooO00o(new OooO00o(12, 7), "FontMatrix");
        OooO00o(new OooO00o(13), "UniqueID");
        OooO00o(new OooO00o(5), "FontBBox");
        OooO00o(new OooO00o(12, 8), "StrokeWidth");
        OooO00o(new OooO00o(14), "XUID");
        OooO00o(new OooO00o(15), "charset");
        OooO00o(new OooO00o(16), "Encoding");
        OooO00o(new OooO00o(17), "CharStrings");
        OooO00o(new OooO00o(18), "Private");
        OooO00o(new OooO00o(12, 20), "SyntheticBase");
        OooO00o(new OooO00o(12, 21), "PostScript");
        OooO00o(new OooO00o(12, 22), "BaseFontName");
        OooO00o(new OooO00o(12, 23), "BaseFontBlend");
        OooO00o(new OooO00o(12, 30), "ROS");
        OooO00o(new OooO00o(12, 31), "CIDFontVersion");
        OooO00o(new OooO00o(12, 32), "CIDFontRevision");
        OooO00o(new OooO00o(12, 33), "CIDFontType");
        OooO00o(new OooO00o(12, 34), "CIDCount");
        OooO00o(new OooO00o(12, 35), "UIDBase");
        OooO00o(new OooO00o(12, 36), "FDArray");
        OooO00o(new OooO00o(12, 37), "FDSelect");
        OooO00o(new OooO00o(12, 38), "FontName");
        OooO00o(new OooO00o(6), "BlueValues");
        OooO00o(new OooO00o(7), "OtherBlues");
        OooO00o(new OooO00o(8), "FamilyBlues");
        OooO00o(new OooO00o(9), "FamilyOtherBlues");
        OooO00o(new OooO00o(12, 9), "BlueScale");
        OooO00o(new OooO00o(12, 10), "BlueShift");
        OooO00o(new OooO00o(12, 11), "BlueFuzz");
        OooO00o(new OooO00o(10), "StdHW");
        OooO00o(new OooO00o(11), "StdVW");
        OooO00o(new OooO00o(12, 12), "StemSnapH");
        OooO00o(new OooO00o(12, 13), "StemSnapV");
        OooO00o(new OooO00o(12, 14), "ForceBold");
        OooO00o(new OooO00o(12, 15), "LanguageGroup");
        OooO00o(new OooO00o(12, 16), "ExpansionFactor");
        OooO00o(new OooO00o(12, 17), "initialRandomSeed");
        OooO00o(new OooO00o(19), "Subrs");
        OooO00o(new OooO00o(20), "defaultWidthX");
        OooO00o(new OooO00o(21), "nominalWidthX");
    }

    public static void OooO00o(OooO00o oooO00o, String str) {
        C31330OooO c31330OooO = new C31330OooO();
        c31330OooO.f111879OooO00o = oooO00o;
        c31330OooO.f111880OooO0O0 = str;
        f111877OooO0OO.put(oooO00o, c31330OooO);
        f111878OooO0Oo.put(str, c31330OooO);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C31330OooO) {
            return this.f111879OooO00o.equals(((C31330OooO) obj).f111879OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f111879OooO00o.f111881OooO00o);
    }

    public final String toString() {
        return this.f111880OooO0O0;
    }
}
