package oO00Ooo;

import oO00Ooo.OooOOO0;

/* JADX INFO: renamed from: oO00Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32297OooO0o0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0.OooO0O0 f116184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f116185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f116186OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f116187OooO0Oo;

    /* JADX INFO: renamed from: oO00Ooo.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOO0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOOO0.OooO0O0 f116188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f116189OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f116190OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f116191OooO0Oo;

        public final C32297OooO0o0 OooO00o() {
            String str = this.f116188OooO00o == null ? " type" : "";
            if (str.isEmpty()) {
                return new C32297OooO0o0(this.f116188OooO00o, this.f116189OooO0O0.longValue(), this.f116190OooO0OO.longValue(), this.f116191OooO0Oo.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public C32297OooO0o0(OooOOO0.OooO0O0 oooO0O0, long j, long j2, long j3) {
        this.f116184OooO00o = oooO0O0;
        this.f116185OooO0O0 = j;
        this.f116186OooO0OO = j2;
        this.f116187OooO0Oo = j3;
    }

    @Override // oO00Ooo.OooOOO0
    public final long OooO0O0() {
        return this.f116187OooO0Oo;
    }

    @Override // oO00Ooo.OooOOO0
    public final long OooO0OO() {
        return this.f116185OooO0O0;
    }

    @Override // oO00Ooo.OooOOO0
    public final OooOOO0.OooO0O0 OooO0Oo() {
        return this.f116184OooO00o;
    }

    @Override // oO00Ooo.OooOOO0
    public final long OooO0o0() {
        return this.f116186OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return this.f116184OooO00o.equals(oooOOO0.OooO0Oo()) && this.f116185OooO0O0 == oooOOO0.OooO0OO() && this.f116186OooO0OO == oooOOO0.OooO0o0() && this.f116187OooO0Oo == oooOOO0.OooO0O0();
    }

    public final int hashCode() {
        long jHashCode = (this.f116184OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f116185OooO0O0;
        long j2 = ((int) (jHashCode ^ (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f116186OooO0OO;
        long j4 = this.f116187OooO0Oo;
        return (int) (((long) (((int) (j2 ^ (j3 ^ (j3 >>> 32)))) * 1000003)) ^ (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageEvent{type=");
        sb.append(this.f116184OooO00o);
        sb.append(", messageId=");
        sb.append(this.f116185OooO0O0);
        sb.append(", uncompressedMessageSize=");
        sb.append(this.f116186OooO0OO);
        sb.append(", compressedMessageSize=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f116187OooO0Oo, "}", sb);
    }
}
