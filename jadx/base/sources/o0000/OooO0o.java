package o0000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f80999OooO00o = new Object[256];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81000OooO0O0;

    public final void OooO00o(OooO0O0 oooO0O0) {
        int i = this.f81000OooO0O0;
        Object[] objArr = this.f80999OooO00o;
        if (i < objArr.length) {
            objArr[i] = oooO0O0;
            this.f81000OooO0O0 = i + 1;
        }
    }
}
