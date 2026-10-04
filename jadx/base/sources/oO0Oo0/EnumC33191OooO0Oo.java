package oO0Oo0;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import oO0O0O0o.OooOO0O;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: oO0Oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC33191OooO0Oo {
    BOOLEAN(OooOO0O.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(OooOO0O.CHAR, "char", "C", "java.lang.Character"),
    BYTE(OooOO0O.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(OooOO0O.SHORT, "short", "S", "java.lang.Short"),
    INT(OooOO0O.INT, "int", "I", "java.lang.Integer"),
    FLOAT(OooOO0O.FLOAT, "float", "F", "java.lang.Float"),
    LONG(OooOO0O.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(OooOO0O.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f120122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0O f120123OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33477OooO0OO f120124OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f120125OooOoO0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final HashSet f120114Oooo0 = new HashSet();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final HashMap f120118Oooo0O0 = new HashMap();

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final EnumMap f120119Oooo0OO = new EnumMap(OooOO0O.class);

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final HashMap f120121Oooo0o0 = new HashMap();

    static {
        for (EnumC33191OooO0Oo enumC33191OooO0Oo : values()) {
            f120114Oooo0.add(enumC33191OooO0Oo.OooO0o0());
            f120118Oooo0O0.put(enumC33191OooO0Oo.f120122OooOo, enumC33191OooO0Oo);
            f120119Oooo0OO.put(enumC33191OooO0Oo.OooO0Oo(), enumC33191OooO0Oo);
            f120121Oooo0o0.put(enumC33191OooO0Oo.OooO0OO(), enumC33191OooO0Oo);
        }
    }

    EnumC33191OooO0Oo(OooOO0O oooOO0O, String str, String str2, String str3) {
        if (oooOO0O == null) {
            OooO00o(6);
            throw null;
        }
        this.f120123OooOo0o = oooOO0O;
        this.f120122OooOo = str;
        this.f120125OooOoO0 = str2;
        this.f120124OooOoO = new C33477OooO0OO(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = C18437z2.f56754h;
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static EnumC33191OooO0Oo OooO0O0(String str) {
        EnumC33191OooO0Oo enumC33191OooO0Oo = (EnumC33191OooO0Oo) f120118Oooo0O0.get(str);
        if (enumC33191OooO0Oo != null) {
            return enumC33191OooO0Oo;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String OooO0OO() {
        String str = this.f120125OooOoO0;
        if (str != null) {
            return str;
        }
        OooO00o(12);
        throw null;
    }

    public final OooOO0O OooO0Oo() {
        OooOO0O oooOO0O = this.f120123OooOo0o;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooO00o(10);
        throw null;
    }

    public final C33477OooO0OO OooO0o0() {
        C33477OooO0OO c33477OooO0OO = this.f120124OooOoO;
        if (c33477OooO0OO != null) {
            return c33477OooO0OO;
        }
        OooO00o(13);
        throw null;
    }
}
