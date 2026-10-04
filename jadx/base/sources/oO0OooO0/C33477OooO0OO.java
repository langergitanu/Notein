package oO0OooO0;

/* JADX INFO: renamed from: oO0OooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33477OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33477OooO0OO f120970OooO0OO = new C33477OooO0OO("");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33478OooO0Oo f120971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public transient C33477OooO0OO f120972OooO0O0;

    public C33477OooO0OO(String str) {
        if (str != null) {
            this.f120971OooO00o = new C33478OooO0Oo(str, this);
        } else {
            OooO00o(1);
            throw null;
        }
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C33477OooO0OO OooOO0(C33479OooO0o c33479OooO0o) {
        if (c33479OooO0o == null) {
            OooO00o(13);
            throw null;
        }
        if (c33479OooO0o != null) {
            return new C33477OooO0OO(new C33478OooO0Oo(c33479OooO0o.OooO0O0(), f120970OooO0OO.OooO(), c33479OooO0o));
        }
        C33478OooO0Oo.OooO00o(16);
        throw null;
    }

    public final C33478OooO0Oo OooO() {
        C33478OooO0Oo c33478OooO0Oo = this.f120971OooO00o;
        if (c33478OooO0Oo != null) {
            return c33478OooO0Oo;
        }
        OooO00o(5);
        throw null;
    }

    public final String OooO0O0() {
        String str = this.f120971OooO00o.f120976OooO00o;
        if (str != null) {
            return str;
        }
        C33478OooO0Oo.OooO00o(4);
        throw null;
    }

    public final C33477OooO0OO OooO0OO(C33479OooO0o c33479OooO0o) {
        if (c33479OooO0o != null) {
            return new C33477OooO0OO(this.f120971OooO00o.OooO0O0(c33479OooO0o), this);
        }
        OooO00o(8);
        throw null;
    }

    public final boolean OooO0Oo() {
        return this.f120971OooO00o.f120976OooO00o.isEmpty();
    }

    public final C33479OooO0o OooO0o() {
        C33479OooO0o c33479OooO0oOooO0o = this.f120971OooO00o.OooO0o();
        if (c33479OooO0oOooO0o != null) {
            return c33479OooO0oOooO0o;
        }
        OooO00o(9);
        throw null;
    }

    public final C33477OooO0OO OooO0o0() {
        C33477OooO0OO c33477OooO0OO = this.f120972OooO0O0;
        if (c33477OooO0OO != null) {
            if (c33477OooO0OO != null) {
                return c33477OooO0OO;
            }
            OooO00o(6);
            throw null;
        }
        if (OooO0Oo()) {
            throw new IllegalStateException("root");
        }
        C33478OooO0Oo c33478OooO0Oo = this.f120971OooO00o;
        C33478OooO0Oo c33478OooO0Oo2 = c33478OooO0Oo.f120978OooO0OO;
        if (c33478OooO0Oo2 == null) {
            if (c33478OooO0Oo.f120976OooO00o.isEmpty()) {
                throw new IllegalStateException("root");
            }
            c33478OooO0Oo.OooO0OO();
            c33478OooO0Oo2 = c33478OooO0Oo.f120978OooO0OO;
            if (c33478OooO0Oo2 == null) {
                C33478OooO0Oo.OooO00o(8);
                throw null;
            }
        }
        C33477OooO0OO c33477OooO0OO2 = new C33477OooO0OO(c33478OooO0Oo2);
        this.f120972OooO0O0 = c33477OooO0OO2;
        return c33477OooO0OO2;
    }

    public final C33479OooO0o OooO0oO() {
        C33478OooO0Oo c33478OooO0Oo = this.f120971OooO00o;
        if (c33478OooO0Oo.f120976OooO00o.isEmpty()) {
            C33479OooO0o c33479OooO0o = C33478OooO0Oo.f120974OooO0o0;
            if (c33479OooO0o != null) {
                return c33479OooO0o;
            }
            C33478OooO0Oo.OooO00o(12);
            throw null;
        }
        C33479OooO0o c33479OooO0oOooO0o = c33478OooO0Oo.OooO0o();
        if (c33479OooO0oOooO0o != null) {
            return c33479OooO0oOooO0o;
        }
        C33478OooO0Oo.OooO00o(13);
        throw null;
    }

    public final boolean OooO0oo(C33479OooO0o c33479OooO0o) {
        if (c33479OooO0o == null) {
            OooO00o(12);
            throw null;
        }
        String str = this.f120971OooO00o.f120976OooO00o;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strOooO0O0 = c33479OooO0o.OooO0O0();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strOooO0O0.length());
        }
        return str.regionMatches(0, strOooO0O0, 0, iIndexOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33477OooO0OO) && this.f120971OooO00o.equals(((C33477OooO0OO) obj).f120971OooO00o);
    }

    public final int hashCode() {
        return this.f120971OooO00o.f120976OooO00o.hashCode();
    }

    public final String toString() {
        return this.f120971OooO00o.toString();
    }

    public C33477OooO0OO(C33478OooO0Oo c33478OooO0Oo) {
        if (c33478OooO0Oo != null) {
            this.f120971OooO00o = c33478OooO0Oo;
        } else {
            OooO00o(2);
            throw null;
        }
    }

    public C33477OooO0OO(C33478OooO0Oo c33478OooO0Oo, C33477OooO0OO c33477OooO0OO) {
        this.f120971OooO00o = c33478OooO0Oo;
        this.f120972OooO0O0 = c33477OooO0OO;
    }
}
