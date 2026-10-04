package oO0OooO0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0OooO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33478OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f120976OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public transient C33477OooO0OO f120977OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public transient C33478OooO0Oo f120978OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient C33479OooO0o f120979OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33479OooO0o f120974OooO0o0 = C33479OooO0o.OooO0oO("<root>");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f120973OooO0o = Pattern.compile("\\.");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f120975OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: oO0OooO0.OooO0Oo$OooO00o */
    public static class OooO00o implements InterfaceC32507OooOO0o<String, C33479OooO0o> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C33479OooO0o invoke(String str) {
            return C33479OooO0o.OooO0Oo(str);
        }
    }

    public C33478OooO0Oo(String str, C33477OooO0OO c33477OooO0OO) {
        if (str == null) {
            OooO00o(0);
            throw null;
        }
        if (c33477OooO0OO == null) {
            OooO00o(1);
            throw null;
        }
        this.f120976OooO00o = str;
        this.f120977OooO0O0 = c33477OooO0OO;
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final C33478OooO0Oo OooO0O0(C33479OooO0o c33479OooO0o) {
        String strOooO0O0;
        if (c33479OooO0o == null) {
            OooO00o(9);
            throw null;
        }
        String str = this.f120976OooO00o;
        if (str.isEmpty()) {
            strOooO0O0 = c33479OooO0o.OooO0O0();
        } else {
            strOooO0O0 = str + "." + c33479OooO0o.OooO0O0();
        }
        return new C33478OooO0Oo(strOooO0O0, this, c33479OooO0o);
    }

    public final void OooO0OO() {
        String str = this.f120976OooO00o;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f120979OooO0Oo = C33479OooO0o.OooO0Oo(str.substring(iLastIndexOf + 1));
            this.f120978OooO0OO = new C33478OooO0Oo(str.substring(0, iLastIndexOf));
        } else {
            this.f120979OooO0Oo = C33479OooO0o.OooO0Oo(str);
            this.f120978OooO0OO = C33477OooO0OO.f120970OooO0OO.OooO();
        }
    }

    public final boolean OooO0Oo() {
        if (this.f120977OooO0O0 != null) {
            return true;
        }
        String str = this.f120976OooO00o;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        OooO00o(4);
        throw null;
    }

    public final C33479OooO0o OooO0o() {
        C33479OooO0o c33479OooO0o = this.f120979OooO0Oo;
        if (c33479OooO0o != null) {
            if (c33479OooO0o != null) {
                return c33479OooO0o;
            }
            OooO00o(10);
            throw null;
        }
        if (this.f120976OooO00o.isEmpty()) {
            throw new IllegalStateException("root");
        }
        OooO0OO();
        C33479OooO0o c33479OooO0o2 = this.f120979OooO0Oo;
        if (c33479OooO0o2 != null) {
            return c33479OooO0o2;
        }
        OooO00o(11);
        throw null;
    }

    public final List<C33479OooO0o> OooO0o0() {
        List<C33479OooO0o> list;
        String str = this.f120976OooO00o;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f120973OooO0o.split(str);
            OooOOO0.OooO0oO(strArrSplit, "<this>");
            OooO00o transform = f120975OooO0oO;
            OooOOO0.OooO0oO(transform, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(C33479OooO0o.OooO0Oo(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        OooO00o(14);
        throw null;
    }

    public final C33477OooO0OO OooO0oO() {
        C33477OooO0OO c33477OooO0OO = this.f120977OooO0O0;
        if (c33477OooO0OO == null) {
            C33477OooO0OO c33477OooO0OO2 = new C33477OooO0OO(this);
            this.f120977OooO0O0 = c33477OooO0OO2;
            return c33477OooO0OO2;
        }
        if (c33477OooO0OO != null) {
            return c33477OooO0OO;
        }
        OooO00o(5);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33478OooO0Oo) && this.f120976OooO00o.equals(((C33478OooO0Oo) obj).f120976OooO00o);
    }

    public final int hashCode() {
        return this.f120976OooO00o.hashCode();
    }

    public final String toString() {
        String strOooO0O0 = this.f120976OooO00o;
        if (strOooO0O0.isEmpty()) {
            strOooO0O0 = f120974OooO0o0.OooO0O0();
        }
        if (strOooO0O0 != null) {
            return strOooO0O0;
        }
        OooO00o(17);
        throw null;
    }

    public C33478OooO0Oo(String str) {
        if (str != null) {
            this.f120976OooO00o = str;
        } else {
            OooO00o(2);
            throw null;
        }
    }

    public C33478OooO0Oo(String str, C33478OooO0Oo c33478OooO0Oo, C33479OooO0o c33479OooO0o) {
        if (str != null) {
            this.f120976OooO00o = str;
            this.f120978OooO0OO = c33478OooO0Oo;
            this.f120979OooO0Oo = c33479OooO0o;
            return;
        }
        OooO00o(3);
        throw null;
    }
}
