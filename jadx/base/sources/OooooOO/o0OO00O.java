package OooooOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f61796OooO0O0 = (((long) Float.floatToIntBits(0.5f)) << 32) | (((long) Float.floatToIntBits(0.5f)) & 4294967295L);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f61797OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61798OooO00o;

    public static String OooO00o(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0OO00O) {
            return this.f61798OooO00o == ((o0OO00O) obj).f61798OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61798OooO00o);
    }

    public final String toString() {
        return OooO00o(this.f61798OooO00o);
    }
}
