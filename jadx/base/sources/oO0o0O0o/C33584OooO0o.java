package oO0o0O0o;

/* JADX INFO: renamed from: oO0o0O0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33584OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f121250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O00oo.OooO f121251OooO0O0;

    public C33584OooO0o(String str, oO0O00oo.OooO oooO) {
        this.f121250OooO00o = str;
        this.f121251OooO0O0 = oooO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33584OooO0o)) {
            return false;
        }
        C33584OooO0o c33584OooO0o = (C33584OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121250OooO00o, c33584OooO0o.f121250OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121251OooO0O0, c33584OooO0o.f121251OooO0O0);
    }

    public final int hashCode() {
        return this.f121251OooO0O0.hashCode() + (this.f121250OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f121250OooO00o + ", range=" + this.f121251OooO0O0 + ')';
    }
}
