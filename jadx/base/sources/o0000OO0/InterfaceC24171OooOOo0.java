package o0000OO0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o0000OO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24171OooOOo0 {
    boolean isAvailableOnDevice();

    void onClearCredential(OooO00o oooO00o, CancellationSignal cancellationSignal, Executor executor, OooOOO<Void, o0000OO.OooO00o> oooOOO);

    void onGetCredential(Context context, C24192Oooo0oo c24192Oooo0oo, CancellationSignal cancellationSignal, Executor executor, OooOOO<C24183Oooo, o0000OO.OooOO0O> oooOOO);
}
