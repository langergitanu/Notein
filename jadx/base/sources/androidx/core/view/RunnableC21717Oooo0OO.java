package androidx.core.view;

import android.widget.ImageView;
import io.ktor.utils.p616io.C23991Oooooo0;
import java.util.concurrent.CountDownLatch;
import o0o00oOo.C30035OooO0oO;

/* JADX INFO: renamed from: androidx.core.view.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21717Oooo0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64293OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64294OooOo0o;

    public /* synthetic */ RunnableC21717Oooo0OO(Object obj, int i) {
        this.f64294OooOo0o = i;
        this.f64293OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64294OooOo0o) {
            case 0:
                ((oO0O000o.OooO00o) this.f64293OooOo).invoke();
                break;
            case 1:
                CountDownLatch latch = (CountDownLatch) this.f64293OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(latch, "$latch");
                latch.countDown();
                break;
            default:
                C30035OooO0oO.OooO0O0 oooO0O0 = (C30035OooO0oO.OooO0O0) this.f64293OooOo;
                ImageView btnMore = oooO0O0.f106783OooOO0;
                kotlin.jvm.internal.OooOOO0.OooO0o(btnMore, "btnMore");
                C23991Oooooo0.OooO0O0(8, btnMore);
                ImageView favorite = oooO0O0.f106787OooOOO0;
                kotlin.jvm.internal.OooOOO0.OooO0o(favorite, "favorite");
                C23991Oooooo0.OooO0O0(8, favorite);
                break;
        }
    }
}
