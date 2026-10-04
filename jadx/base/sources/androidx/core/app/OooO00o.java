package androidx.core.app;

import android.app.Activity;
import com.orion.notein.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Activity f64200OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64201OooOo0o;

    public /* synthetic */ OooO00o(Activity activity, int i) {
        this.f64201OooOo0o = i;
        this.f64200OooOo = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64201OooOo0o) {
            case 0:
                ActivityCompat.lambda$recreate$0(this.f64200OooOo);
                break;
            default:
                ((MainActivity) this.f64200OooOo).maybeReapplyImmersive();
                break;
        }
    }
}
