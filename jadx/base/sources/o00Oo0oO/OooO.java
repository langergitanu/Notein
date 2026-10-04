package o00Oo0oO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f85048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Intent f85049OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f85050OooOoO0;

    public OooO(OooOO0 oooOO02, Intent intent, Object obj) {
        this.f85050OooOoO0 = oooOO02;
        this.f85049OooOo0o = intent;
        this.f85048OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OooOO0 oooOO02 = this.f85050OooOoO0;
            Activity activity = oooOO02.f85062OooO00o;
            if (activity != null) {
                activity.startActivity(this.f85049OooOo0o);
                return;
            }
            o00OOOOo.OooO00o.OooO0oO(oooOO02.f85067OooO0o0, "biz", "ErrActNull2", "");
            Context context = this.f85050OooOoO0.f85067OooO0o0.f85035OooO0OO;
            if (context != null) {
                context.startActivity(this.f85049OooOo0o);
            }
        } finally {
        }
    }
}
