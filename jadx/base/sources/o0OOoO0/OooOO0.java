package o0OOoO0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f97775OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f97776OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f97777OooO0OO;

    public OooOO0(String driveId, OooO phase, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phase, "phase");
        this.f97775OooO00o = driveId;
        this.f97776OooO0O0 = phase;
        this.f97777OooO0OO = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO02 = (OooOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97775OooO00o, oooOO02.f97775OooO00o) && this.f97776OooO0O0 == oooOO02.f97776OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97777OooO0OO, oooOO02.f97777OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f97776OooO0O0.hashCode() + (this.f97775OooO00o.hashCode() * 31)) * 31;
        String str = this.f97777OooO0OO;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationState(driveId=");
        sb.append(this.f97775OooO00o);
        sb.append(", phase=");
        sb.append(this.f97776OooO0O0);
        sb.append(", lastError=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f97777OooO0OO, ")");
    }
}
