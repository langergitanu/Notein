package o00000oo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o00000oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24137OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f81332OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f81333OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f81334OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC24139OooOoOO f81335OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f81336OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f81337OooO0o0;

    public C24137OooOoO(boolean z, EnumC24139OooOoOO securePolicy, boolean z2, boolean z3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(securePolicy, "securePolicy");
        this.f81332OooO00o = z;
        this.f81333OooO0O0 = true;
        this.f81334OooO0OO = true;
        this.f81335OooO0Oo = securePolicy;
        this.f81337OooO0o0 = z2;
        this.f81336OooO0o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24137OooOoO)) {
            return false;
        }
        C24137OooOoO c24137OooOoO = (C24137OooOoO) obj;
        return this.f81332OooO00o == c24137OooOoO.f81332OooO00o && this.f81333OooO0O0 == c24137OooOoO.f81333OooO0O0 && this.f81334OooO0OO == c24137OooOoO.f81334OooO0OO && this.f81335OooO0Oo == c24137OooOoO.f81335OooO0Oo && this.f81337OooO0o0 == c24137OooOoO.f81337OooO0o0 && this.f81336OooO0o == c24137OooOoO.f81336OooO0o;
    }

    public final int hashCode() {
        boolean z = this.f81333OooO0O0;
        return Boolean.hashCode(false) + o00000.OooO0O0(o00000.OooO0O0((this.f81335OooO0Oo.hashCode() + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(Boolean.hashCode(z) * 31, 31, this.f81332OooO00o), 31, z), 31, this.f81334OooO0OO)) * 31, 31, this.f81337OooO0o0), 31, this.f81336OooO0o);
    }

    public C24137OooOoO() {
        this(false, EnumC24139OooOoOO.f81339OooOo0o, true, true);
    }

    public C24137OooOoO(int i) {
        this((i & 1) == 0, EnumC24139OooOoOO.f81339OooOo0o, true, (i & 32) != 0);
    }
}
