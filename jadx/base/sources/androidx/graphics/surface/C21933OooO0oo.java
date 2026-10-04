package androidx.graphics.surface;

import androidx.graphics.surface.SurfaceControlCompat;
import com.google.firebase.inappmessaging.internal.OooOOOO;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.graphics.surface.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21933OooO0oo implements SurfaceControlCompat.TransactionCommittedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Executor f65138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SurfaceControlCompat.TransactionCommittedListener f65139OooO0O0;

    public C21933OooO0oo(Executor executor, SurfaceControlCompat.TransactionCommittedListener transactionCommittedListener) {
        this.f65138OooO00o = executor;
        this.f65139OooO0O0 = transactionCommittedListener;
    }

    @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
    public final void onTransactionCommitted() {
        this.f65138OooO00o.execute(new OooOOOO(this.f65139OooO0O0, 1));
    }
}
