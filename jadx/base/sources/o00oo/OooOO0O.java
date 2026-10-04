package o00oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O implements InterfaceC25640OooOO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOO0O f87512OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87513OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f87514OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f87515OooO0OO;

    static {
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f87513OooO00o = Integer.MAX_VALUE;
        oooOO0O.f87514OooO0O0 = true;
        oooOO0O.f87515OooO0OO = true;
        f87512OooO0Oo = oooOO0O;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f87513OooO00o == oooOO0O.f87513OooO00o && this.f87514OooO0O0 == oooOO0O.f87514OooO0O0 && this.f87515OooO0OO == oooOO0O.f87515OooO0OO;
    }

    public final int hashCode() {
        return ((this.f87514OooO0O0 ? 4194304 : 0) ^ this.f87513OooO00o) ^ (this.f87515OooO0OO ? 8388608 : 0);
    }
}
