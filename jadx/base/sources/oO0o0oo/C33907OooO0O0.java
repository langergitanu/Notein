package oO0o0oo;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: oO0o0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33907OooO0O0<TResult> implements OnCompleteListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f122122OooO00o;

    public C33907OooO0O0(C33614OooOOO0 c33614OooOOO0) {
        this.f122122OooO00o = c33614OooOOO0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        C33614OooOOO0 c33614OooOOO0 = this.f122122OooO00o;
        if (exception != null) {
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(exception));
        } else if (task.isCanceled()) {
            c33614OooOOO0.cancel(null);
        } else {
            c33614OooOOO0.resumeWith(task.getResult());
        }
    }
}
