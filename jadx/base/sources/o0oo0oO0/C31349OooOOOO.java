package o0oo0oO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o0oo0oO0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31349OooOOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<OooO00o, String> f111937OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<OooO00o, String> f111938OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f111939OooO00o;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(26);
        linkedHashMap.put(new OooO00o(1), "hstem");
        linkedHashMap.put(new OooO00o(3), "vstem");
        linkedHashMap.put(new OooO00o(4), "vmoveto");
        linkedHashMap.put(new OooO00o(5), "rlineto");
        linkedHashMap.put(new OooO00o(6), "hlineto");
        linkedHashMap.put(new OooO00o(7), "vlineto");
        linkedHashMap.put(new OooO00o(8), "rrcurveto");
        linkedHashMap.put(new OooO00o(9), "closepath");
        linkedHashMap.put(new OooO00o(10), "callsubr");
        linkedHashMap.put(new OooO00o(11), "return");
        linkedHashMap.put(new OooO00o(12), "escape");
        linkedHashMap.put(new OooO00o(12, 0), "dotsection");
        linkedHashMap.put(new OooO00o(12, 1), "vstem3");
        linkedHashMap.put(new OooO00o(12, 2), "hstem3");
        linkedHashMap.put(new OooO00o(12, 6), "seac");
        linkedHashMap.put(new OooO00o(12, 7), "sbw");
        linkedHashMap.put(new OooO00o(12, 12), "div");
        linkedHashMap.put(new OooO00o(12, 16), "callothersubr");
        linkedHashMap.put(new OooO00o(12, 17), TokenRequest.TokenType.POP);
        linkedHashMap.put(new OooO00o(12, 33), "setcurrentpoint");
        linkedHashMap.put(new OooO00o(13), "hsbw");
        linkedHashMap.put(new OooO00o(14), "endchar");
        linkedHashMap.put(new OooO00o(21), "rmoveto");
        linkedHashMap.put(new OooO00o(22), "hmoveto");
        linkedHashMap.put(new OooO00o(30), "vhcurveto");
        linkedHashMap.put(new OooO00o(31), "hvcurveto");
        f111937OooO0O0 = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(48);
        linkedHashMap2.put(new OooO00o(1), "hstem");
        linkedHashMap2.put(new OooO00o(3), "vstem");
        linkedHashMap2.put(new OooO00o(4), "vmoveto");
        linkedHashMap2.put(new OooO00o(5), "rlineto");
        linkedHashMap2.put(new OooO00o(6), "hlineto");
        linkedHashMap2.put(new OooO00o(7), "vlineto");
        linkedHashMap2.put(new OooO00o(8), "rrcurveto");
        linkedHashMap2.put(new OooO00o(10), "callsubr");
        linkedHashMap2.put(new OooO00o(11), "return");
        linkedHashMap2.put(new OooO00o(12), "escape");
        linkedHashMap2.put(new OooO00o(12, 3), "and");
        linkedHashMap2.put(new OooO00o(12, 4), "or");
        linkedHashMap2.put(new OooO00o(12, 5), "not");
        linkedHashMap2.put(new OooO00o(12, 9), "abs");
        linkedHashMap2.put(new OooO00o(12, 10), "add");
        linkedHashMap2.put(new OooO00o(12, 11), "sub");
        linkedHashMap2.put(new OooO00o(12, 12), "div");
        linkedHashMap2.put(new OooO00o(12, 14), "neg");
        linkedHashMap2.put(new OooO00o(12, 15), "eq");
        linkedHashMap2.put(new OooO00o(12, 18), "drop");
        linkedHashMap2.put(new OooO00o(12, 20), "put");
        linkedHashMap2.put(new OooO00o(12, 21), "get");
        linkedHashMap2.put(new OooO00o(12, 22), "ifelse");
        linkedHashMap2.put(new OooO00o(12, 23), "random");
        linkedHashMap2.put(new OooO00o(12, 24), "mul");
        linkedHashMap2.put(new OooO00o(12, 26), "sqrt");
        linkedHashMap2.put(new OooO00o(12, 27), "dup");
        linkedHashMap2.put(new OooO00o(12, 28), "exch");
        linkedHashMap2.put(new OooO00o(12, 29), FirebaseAnalytics.Param.INDEX);
        linkedHashMap2.put(new OooO00o(12, 30), "roll");
        linkedHashMap2.put(new OooO00o(12, 34), "hflex");
        linkedHashMap2.put(new OooO00o(12, 35), "flex");
        linkedHashMap2.put(new OooO00o(12, 36), "hflex1");
        linkedHashMap2.put(new OooO00o(12, 37), "flex1");
        linkedHashMap2.put(new OooO00o(14), "endchar");
        linkedHashMap2.put(new OooO00o(18), "hstemhm");
        linkedHashMap2.put(new OooO00o(19), "hintmask");
        linkedHashMap2.put(new OooO00o(20), "cntrmask");
        linkedHashMap2.put(new OooO00o(21), "rmoveto");
        linkedHashMap2.put(new OooO00o(22), "hmoveto");
        linkedHashMap2.put(new OooO00o(23), "vstemhm");
        linkedHashMap2.put(new OooO00o(24), "rcurveline");
        linkedHashMap2.put(new OooO00o(25), "rlinecurve");
        linkedHashMap2.put(new OooO00o(26), "vvcurveto");
        linkedHashMap2.put(new OooO00o(27), "hhcurveto");
        linkedHashMap2.put(new OooO00o(28), "shortint");
        linkedHashMap2.put(new OooO00o(29), "callgsubr");
        linkedHashMap2.put(new OooO00o(30), "vhcurveto");
        linkedHashMap2.put(new OooO00o(31), "hvcurveto");
        f111938OooO0OO = Collections.unmodifiableMap(linkedHashMap2);
    }

    public C31349OooOOOO(int i) {
        this.f111939OooO00o = new OooO00o(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C31349OooOOOO) {
            return this.f111939OooO00o.equals(((C31349OooOOOO) obj).f111939OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f111939OooO00o.hashCode();
    }

    public final String toString() {
        String str = f111938OooO0OO.get(this.f111939OooO00o);
        if (str == null) {
            str = f111937OooO0O0.get(this.f111939OooO00o);
        }
        if (str != null) {
            return str.concat("|");
        }
        return Arrays.toString(this.f111939OooO00o.f111940OooO00o) + '|';
    }

    /* JADX INFO: renamed from: o0oo0oO0.OooOOOO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f111940OooO00o;

        public OooO00o(int i) {
            this.f111940OooO00o = new int[]{i};
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                int[] iArr = this.f111940OooO00o;
                int i = iArr[0];
                if (i == 12) {
                    int[] iArr2 = oooO00o.f111940OooO00o;
                    if (iArr2[0] == 12) {
                        return (iArr.length <= 1 || iArr2.length <= 1) ? iArr.length == iArr2.length : iArr[1] == iArr2[1];
                    }
                }
                if (i == oooO00o.f111940OooO00o[0]) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int[] iArr = this.f111940OooO00o;
            int i = iArr[0];
            return (i != 12 || iArr.length <= 1) ? i : iArr[1] ^ i;
        }

        public final String toString() {
            return Arrays.toString(this.f111940OooO00o);
        }

        public OooO00o(int i, int i2) {
            this.f111940OooO00o = new int[]{i, i2};
        }
    }

    public C31349OooOOOO(int i, int i2) {
        this.f111939OooO00o = new OooO00o(i, i2);
    }
}
