package OooooO0;

/* JADX INFO: renamed from: OooooO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21288OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f61714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f61715OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f61716OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f61717OooO0Oo;

    public final void OooO00o(float f, float f2, float f3, float f4) {
        this.f61714OooO00o = Math.max(f, this.f61714OooO00o);
        this.f61715OooO0O0 = Math.max(f2, this.f61715OooO0O0);
        this.f61716OooO0OO = Math.min(f3, this.f61716OooO0OO);
        this.f61717OooO0Oo = Math.min(f4, this.f61717OooO0Oo);
    }

    public final boolean OooO0O0() {
        return this.f61714OooO00o >= this.f61716OooO0OO || this.f61715OooO0O0 >= this.f61717OooO0Oo;
    }

    public final String toString() {
        return "MutableRect(" + C21287OooO0OO.OooO0O0(this.f61714OooO00o) + ", " + C21287OooO0OO.OooO0O0(this.f61715OooO0O0) + ", " + C21287OooO0OO.OooO0O0(this.f61716OooO0OO) + ", " + C21287OooO0OO.OooO0O0(this.f61717OooO0Oo) + ')';
    }
}
