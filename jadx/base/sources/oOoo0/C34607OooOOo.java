package oOoo0;

import com.huawei.hms.network.embedded.C18358t1;
import oO00ooO.C32442OooOO0o;
import oO0O0O0.C32567Oooo;

/* JADX INFO: renamed from: oOoo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34607OooOOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C34607OooOOo f123974OooO0OO = new C34607OooOOo(null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC34609OooOOoo f123975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32567Oooo f123976OooO0O0;

    /* JADX INFO: renamed from: oOoo0.OooOOo$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f123977OooO00o;

        static {
            int[] iArr = new int[EnumC34609OooOOoo.values().length];
            try {
                EnumC34609OooOOoo enumC34609OooOOoo = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo2 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo3 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f123977OooO00o = iArr;
        }
    }

    public C34607OooOOo(EnumC34609OooOOoo enumC34609OooOOoo, C32567Oooo c32567Oooo) {
        String str;
        this.f123975OooO00o = enumC34609OooOOoo;
        this.f123976OooO0O0 = c32567Oooo;
        if ((enumC34609OooOOoo == null) == (c32567Oooo == null)) {
            return;
        }
        if (enumC34609OooOOoo == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC34609OooOOoo + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34607OooOOo)) {
            return false;
        }
        C34607OooOOo c34607OooOOo = (C34607OooOOo) obj;
        return this.f123975OooO00o == c34607OooOOo.f123975OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123976OooO0O0, c34607OooOOo.f123976OooO0O0);
    }

    public final int hashCode() {
        EnumC34609OooOOoo enumC34609OooOOoo = this.f123975OooO00o;
        int iHashCode = (enumC34609OooOOoo == null ? 0 : enumC34609OooOOoo.hashCode()) * 31;
        C32567Oooo c32567Oooo = this.f123976OooO0O0;
        return iHashCode + (c32567Oooo != null ? c32567Oooo.hashCode() : 0);
    }

    public final String toString() {
        EnumC34609OooOOoo enumC34609OooOOoo = this.f123975OooO00o;
        int i = enumC34609OooOOoo == null ? -1 : OooO00o.f123977OooO00o[enumC34609OooOOoo.ordinal()];
        if (i == -1) {
            return C18358t1.g.f56183c;
        }
        C32567Oooo c32567Oooo = this.f123976OooO0O0;
        if (i == 1) {
            return String.valueOf(c32567Oooo);
        }
        if (i == 2) {
            return "in " + c32567Oooo;
        }
        if (i != 3) {
            throw new C32442OooOO0o();
        }
        return "out " + c32567Oooo;
    }
}
