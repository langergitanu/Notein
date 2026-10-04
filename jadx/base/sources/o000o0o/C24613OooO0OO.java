package o000o0o;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.concurrent.futures.C21617OooO0Oo;
import androidx.concurrent.futures.C21619OooO0oO;
import oO0o0OO.C33632Oooo;

/* JADX INFO: renamed from: o000o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24613OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f83398OooO00o = 0;

    public static C21619OooO0oO OooO00o(C33632Oooo c33632Oooo) {
        C21617OooO0Oo c21617OooO0Oo = new C21617OooO0Oo();
        C21619OooO0oO<T> c21619OooO0oO = new C21619OooO0oO<>(c21617OooO0Oo);
        c21617OooO0Oo.f63600OooO0O0 = c21619OooO0oO;
        c21617OooO0Oo.f63599OooO00o = C24611OooO00o.class;
        try {
            c33632Oooo.invokeOnCompletion(new C24612OooO0O0(c21617OooO0Oo, c33632Oooo));
            c21617OooO0Oo.f63599OooO00o = "Deferred.asListenableFuture";
            return c21619OooO0oO;
        } catch (Exception e) {
            c21619OooO0oO.f63603OooOo.setException(e);
            return c21619OooO0oO;
        }
    }

    public static final void OooO0O0(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Expected positive parallelism level, but got ").toString());
        }
    }
}
