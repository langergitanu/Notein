package androidx.concurrent.futures;

import androidx.concurrent.futures.C21619OooO0oO;

/* JADX INFO: renamed from: androidx.concurrent.futures.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21617OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f63599OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C21619OooO0oO<T> f63600OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO<Void> f63601OooO0OO = new OooO<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f63602OooO0Oo;

    public final void finalize() {
        OooO<Void> oooO;
        C21619OooO0oO<T> c21619OooO0oO = this.f63600OooO0O0;
        if (c21619OooO0oO != null) {
            C21619OooO0oO.OooO00o oooO00o = c21619OooO0oO.f63603OooOo;
            if (!oooO00o.isDone()) {
                oooO00o.setException(new C21618OooO0o0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f63599OooO00o));
            }
        }
        if (this.f63602OooO0Oo || (oooO = this.f63601OooO0OO) == null) {
            return;
        }
        oooO.set(null);
    }
}
