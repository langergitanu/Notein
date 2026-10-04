package o00o0OOO;

/* JADX INFO: renamed from: o00o0OOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25401OooO0o implements InterfaceC25397OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f86616OooO00o;

    public C25401OooO0o(String str) {
        str.getClass();
        this.f86616OooO00o = str;
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final String OooO00o() {
        return this.f86616OooO00o;
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final boolean OooO0O0() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25401OooO0o) {
            return this.f86616OooO00o.equals(((C25401OooO0o) obj).f86616OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f86616OooO00o.hashCode();
    }

    public final String toString() {
        return this.f86616OooO00o;
    }
}
