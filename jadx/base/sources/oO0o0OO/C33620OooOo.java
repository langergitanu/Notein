package oO0o0OO;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: oO0o0OO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33620OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121303OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(C33620OooOo.class, "_handled$volatile");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Throwable f121304OooO00o;
    private volatile /* synthetic */ int _handled$volatile;

    public C33620OooOo(boolean z, Throwable th) {
        this.f121304OooO00o = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f121304OooO00o + ']';
    }
}
