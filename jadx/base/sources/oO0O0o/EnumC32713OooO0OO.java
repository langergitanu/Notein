package oO0O0o;

import OooO0Oo.C20398OooO0O0;
import kotlin.jvm.internal.OooOOO0;
import oO0O0O0o.OooOOO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33595OooOOo;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OooOoo0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: oO0O0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32713OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final EnumC32713OooO0OO f117629OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f117630OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final EnumC32713OooO0OO f117631OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final EnumC32713OooO0OO f117632OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final EnumC32713OooO0OO f117633OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ EnumC32713OooO0OO[] f117634OooOooO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f117635OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33477OooO0OO f117636OooOo0o;

    /* JADX INFO: renamed from: oO0O0o.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: oO0O0o.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20251OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final EnumC32713OooO0OO f117637OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f117638OooO0O0;

            public C20251OooO00o(EnumC32713OooO0OO enumC32713OooO0OO, int i) {
                this.f117637OooO00o = enumC32713OooO0OO;
                this.f117638OooO0O0 = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20251OooO00o)) {
                    return false;
                }
                C20251OooO00o c20251OooO00o = (C20251OooO00o) obj;
                return this.f117637OooO00o == c20251OooO00o.f117637OooO00o && this.f117638OooO0O0 == c20251OooO00o.f117638OooO0O0;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f117638OooO0O0) + (this.f117637OooO00o.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.f117637OooO00o);
                sb.append(", arity=");
                return C20398OooO0O0.OooO00o(')', sb, this.f117638OooO0O0);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C20251OooO00o OooO00o(String str, C33477OooO0OO packageFqName) {
            EnumC32713OooO0OO enumC32713OooO0OO;
            Integer numValueOf;
            OooOOO0.OooO0oO(packageFqName, "packageFqName");
            EnumC32713OooO0OO[] enumC32713OooO0OOArrValues = EnumC32713OooO0OO.values();
            int length = enumC32713OooO0OOArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC32713OooO0OO = null;
                    break;
                }
                enumC32713OooO0OO = enumC32713OooO0OOArrValues[i];
                if (OooOOO0.OooO0O0(enumC32713OooO0OO.f117636OooOo0o, packageFqName) && C33595OooOOo.OooOoO0(str, enumC32713OooO0OO.f117635OooOo, false)) {
                    break;
                }
                i++;
            }
            if (enumC32713OooO0OO != null) {
                String strSubstring = str.substring(enumC32713OooO0OO.f117635OooOo.length());
                OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    if (numValueOf != null) {
                        return new C20251OooO00o(enumC32713OooO0OO, numValueOf.intValue());
                    }
                } else {
                    int length2 = strSubstring.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        int iCharAt = strSubstring.charAt(i3) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                    }
                    numValueOf = Integer.valueOf(i2);
                    if (numValueOf != null) {
                    }
                }
            }
            return null;
        }
    }

    static {
        EnumC32713OooO0OO enumC32713OooO0OO = new EnumC32713OooO0OO("Function", 0, OooOOO.f117143OooOO0O, "Function");
        f117629OooOoO = enumC32713OooO0OO;
        EnumC32713OooO0OO enumC32713OooO0OO2 = new EnumC32713OooO0OO("SuspendFunction", 1, OooOOO.f117139OooO0o0, "SuspendFunction");
        f117631OooOoOO = enumC32713OooO0OO2;
        C33477OooO0OO c33477OooO0OO = OooOOO.f117141OooO0oo;
        EnumC32713OooO0OO enumC32713OooO0OO3 = new EnumC32713OooO0OO("KFunction", 2, c33477OooO0OO, "KFunction");
        f117633OooOoo0 = enumC32713OooO0OO3;
        EnumC32713OooO0OO enumC32713OooO0OO4 = new EnumC32713OooO0OO("KSuspendFunction", 3, c33477OooO0OO, "KSuspendFunction");
        f117632OooOoo = enumC32713OooO0OO4;
        f117634OooOooO = new EnumC32713OooO0OO[]{enumC32713OooO0OO, enumC32713OooO0OO2, enumC32713OooO0OO3, enumC32713OooO0OO4};
        f117630OooOoO0 = new OooO00o();
    }

    public EnumC32713OooO0OO(String str, int i, C33477OooO0OO c33477OooO0OO, String str2) {
        this.f117636OooOo0o = c33477OooO0OO;
        this.f117635OooOo = str2;
    }

    public static EnumC32713OooO0OO valueOf(String str) {
        return (EnumC32713OooO0OO) Enum.valueOf(EnumC32713OooO0OO.class, str);
    }

    public static EnumC32713OooO0OO[] values() {
        return (EnumC32713OooO0OO[]) f117634OooOooO.clone();
    }

    public final C33479OooO0o OooO00o(int i) {
        return C33479OooO0o.OooO0o0(this.f117635OooOo + i);
    }
}
