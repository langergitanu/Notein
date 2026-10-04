package o00O0Ooo;

import java.util.List;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: renamed from: o00O0Ooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC24910OooOOo0<T> implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24932OooO0OO<T> f84531OooOo0o = new C24932OooO0OO<>();

    public abstract List OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        C24932OooO0OO<T> c24932OooO0OO = this.f84531OooOo0o;
        try {
            c24932OooO0OO.OooO((T) OooO00o());
        } catch (Throwable th) {
            c24932OooO0OO.OooOO0(th);
        }
    }
}
