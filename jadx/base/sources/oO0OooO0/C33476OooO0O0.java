package oO0OooO0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: oO0OooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33476OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33477OooO0OO f120967OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33477OooO0OO f120968OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f120969OooO0OO;

    public C33476OooO0O0(C33477OooO0OO c33477OooO0OO, C33477OooO0OO c33477OooO0OO2, boolean z) {
        if (c33477OooO0OO == null) {
            OooO00o(1);
            throw null;
        }
        this.f120967OooO00o = c33477OooO0OO;
        this.f120968OooO0O0 = c33477OooO0OO2;
        this.f120969OooO0OO = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
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
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static C33476OooO0O0 OooO0o0(String str, boolean z) {
        String str2;
        if (str == null) {
            OooO00o(12);
            throw null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR);
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new C33476OooO0O0(new C33477OooO0OO(str2), new C33477OooO0OO(str), z);
    }

    public static C33476OooO0O0 OooOO0(C33477OooO0OO c33477OooO0OO) {
        if (c33477OooO0OO != null) {
            return new C33476OooO0O0(c33477OooO0OO.OooO0o0(), c33477OooO0OO.OooO0o());
        }
        OooO00o(0);
        throw null;
    }

    public final C33479OooO0o OooO() {
        C33479OooO0o c33479OooO0oOooO0o = this.f120968OooO0O0.OooO0o();
        if (c33479OooO0oOooO0o != null) {
            return c33479OooO0oOooO0o;
        }
        OooO00o(7);
        throw null;
    }

    public final C33477OooO0OO OooO0O0() {
        C33477OooO0OO c33477OooO0OO = this.f120967OooO00o;
        boolean zOooO0Oo = c33477OooO0OO.OooO0Oo();
        C33477OooO0OO c33477OooO0OO2 = this.f120968OooO0O0;
        if (zOooO0Oo) {
            if (c33477OooO0OO2 != null) {
                return c33477OooO0OO2;
            }
            OooO00o(9);
            throw null;
        }
        return new C33477OooO0OO(c33477OooO0OO.OooO0O0() + "." + c33477OooO0OO2.OooO0O0());
    }

    public final String OooO0OO() {
        C33477OooO0OO c33477OooO0OO = this.f120967OooO00o;
        boolean zOooO0Oo = c33477OooO0OO.OooO0Oo();
        C33477OooO0OO c33477OooO0OO2 = this.f120968OooO0O0;
        if (zOooO0Oo) {
            return c33477OooO0OO2.OooO0O0();
        }
        String str = c33477OooO0OO.OooO0O0().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + "/" + c33477OooO0OO2.OooO0O0();
        if (str != null) {
            return str;
        }
        OooO00o(14);
        throw null;
    }

    public final C33476OooO0O0 OooO0Oo(C33479OooO0o c33479OooO0o) {
        if (c33479OooO0o != null) {
            return new C33476OooO0O0(OooO0oO(), this.f120968OooO0O0.OooO0OO(c33479OooO0o), this.f120969OooO0OO);
        }
        OooO00o(8);
        throw null;
    }

    public final C33476OooO0O0 OooO0o() {
        C33477OooO0OO c33477OooO0OOOooO0o0 = this.f120968OooO0O0.OooO0o0();
        if (c33477OooO0OOOooO0o0.OooO0Oo()) {
            return null;
        }
        return new C33476OooO0O0(OooO0oO(), c33477OooO0OOOooO0o0, this.f120969OooO0OO);
    }

    public final C33477OooO0OO OooO0oO() {
        C33477OooO0OO c33477OooO0OO = this.f120967OooO00o;
        if (c33477OooO0OO != null) {
            return c33477OooO0OO;
        }
        OooO00o(5);
        throw null;
    }

    public final C33477OooO0OO OooO0oo() {
        C33477OooO0OO c33477OooO0OO = this.f120968OooO0O0;
        if (c33477OooO0OO != null) {
            return c33477OooO0OO;
        }
        OooO00o(6);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33476OooO0O0.class == obj.getClass()) {
            C33476OooO0O0 c33476OooO0O0 = (C33476OooO0O0) obj;
            if (this.f120967OooO00o.equals(c33476OooO0O0.f120967OooO00o) && this.f120968OooO0O0.equals(c33476OooO0O0.f120968OooO0O0) && this.f120969OooO0OO == c33476OooO0O0.f120969OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f120969OooO0OO).hashCode() + ((this.f120968OooO0O0.hashCode() + (this.f120967OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f120967OooO00o.OooO0Oo() ? "/".concat(OooO0OO()) : OooO0OO();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33476OooO0O0(C33477OooO0OO c33477OooO0OO, C33479OooO0o c33479OooO0o) {
        this(c33477OooO0OO, C33477OooO0OO.OooOO0(c33479OooO0o), false);
        if (c33477OooO0OO == null) {
            OooO00o(3);
            throw null;
        }
        if (c33479OooO0o != null) {
        } else {
            OooO00o(4);
            throw null;
        }
    }
}
