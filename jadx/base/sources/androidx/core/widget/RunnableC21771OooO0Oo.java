package androidx.core.widget;

import android.content.Context;
import com.google.firebase.functions.FirebaseFunctions;

/* JADX INFO: renamed from: androidx.core.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21771OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64308OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64309OooOo0o;

    public /* synthetic */ RunnableC21771OooO0Oo(Object obj, int i) {
        this.f64309OooOo0o = i;
        this.f64308OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64309OooOo0o) {
            case 0:
                ((ContentLoadingProgressBar) this.f64308OooOo).hideOnUiThread();
                break;
            default:
                FirebaseFunctions.Companion.maybeInstallProviders$lambda$1((Context) this.f64308OooOo);
                break;
        }
    }
}
