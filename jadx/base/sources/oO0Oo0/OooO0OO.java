package oO0Oo0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f120108OooO00o;

    public OooO0OO(String str) {
        if (str != null) {
            this.f120108OooO00o = str;
        } else {
            OooO00o(5);
            throw null;
        }
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static OooO0OO OooO0O0(C33476OooO0O0 c33476OooO0O0) {
        if (c33476OooO0O0 == null) {
            OooO00o(1);
            throw null;
        }
        C33477OooO0OO c33477OooO0OOOooO0oO = c33476OooO0O0.OooO0oO();
        String strReplace = c33476OooO0O0.OooO0oo().OooO0O0().replace(FilenameUtils.EXTENSION_SEPARATOR, '$');
        if (c33477OooO0OOOooO0oO.OooO0Oo()) {
            return new OooO0OO(strReplace);
        }
        return new OooO0OO(c33477OooO0OOOooO0oO.OooO0O0().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + "/" + strReplace);
    }

    public static OooO0OO OooO0OO(C33477OooO0OO c33477OooO0OO) {
        if (c33477OooO0OO != null) {
            return new OooO0OO(c33477OooO0OO.OooO0O0().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX));
        }
        OooO00o(2);
        throw null;
    }

    public static OooO0OO OooO0Oo(String str) {
        if (str != null) {
            return new OooO0OO(str);
        }
        OooO00o(0);
        throw null;
    }

    public final String OooO0o0() {
        String str = this.f120108OooO00o;
        if (str != null) {
            return str;
        }
        OooO00o(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0OO.class != obj.getClass()) {
            return false;
        }
        return this.f120108OooO00o.equals(((OooO0OO) obj).f120108OooO00o);
    }

    public final int hashCode() {
        return this.f120108OooO00o.hashCode();
    }

    public final String toString() {
        return this.f120108OooO00o;
    }
}
