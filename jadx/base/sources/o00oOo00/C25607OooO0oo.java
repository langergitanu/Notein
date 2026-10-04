package o00oOo00;

/* JADX INFO: renamed from: o00oOo00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25607OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87372OooO00o;

    public C25607OooO0oo(int i) {
        this.f87372OooO00o = i;
    }

    public final int OooO00o(int i) {
        int i2 = this.f87372OooO00o;
        int i3 = i % i2;
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3 + i2;
    }
}
