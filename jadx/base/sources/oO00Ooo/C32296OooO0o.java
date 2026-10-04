package oO00Ooo;

import oO00Ooo.OooOOO;

/* JADX INFO: renamed from: oO00Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class C32296OooO0o extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO.OooO00o f116180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f116181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f116182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f116183OooO0Oo;

    public C32296OooO0o(OooOOO.OooO00o oooO00o, long j, long j2, long j3) {
        this.f116180OooO00o = oooO00o;
        this.f116181OooO0O0 = j;
        this.f116182OooO0OO = j2;
        this.f116183OooO0Oo = j3;
    }

    @Override // oO00Ooo.OooOOO
    public final long OooO00o() {
        return this.f116183OooO0Oo;
    }

    @Override // oO00Ooo.OooOOO
    public final long OooO0O0() {
        return this.f116181OooO0O0;
    }

    @Override // oO00Ooo.OooOOO
    public final OooOOO.OooO00o OooO0OO() {
        return this.f116180OooO00o;
    }

    @Override // oO00Ooo.OooOOO
    public final long OooO0Oo() {
        return this.f116182OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        oooOOO.getClass();
        return this.f116180OooO00o.equals(oooOOO.OooO0OO()) && this.f116181OooO0O0 == oooOOO.OooO0O0() && this.f116182OooO0OO == oooOOO.OooO0Oo() && this.f116183OooO0Oo == oooOOO.OooO00o();
    }

    public final int hashCode() {
        long jHashCode = ((1000003 * 1000003) ^ this.f116180OooO00o.hashCode()) * 1000003;
        long j = this.f116181OooO0O0;
        long j2 = ((int) (jHashCode ^ (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f116182OooO0OO;
        long j4 = this.f116183OooO0Oo;
        return (int) (((long) (((int) (j2 ^ (j3 ^ (j3 >>> 32)))) * 1000003)) ^ (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkEvent{kernelTimestamp=null, type=");
        sb.append(this.f116180OooO00o);
        sb.append(", messageId=");
        sb.append(this.f116181OooO0O0);
        sb.append(", uncompressedMessageSize=");
        sb.append(this.f116182OooO0OO);
        sb.append(", compressedMessageSize=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f116183OooO0Oo, "}", sb);
    }
}
