package o00o00Oo;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o00o00Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25262OooO0oO implements InterfaceC25263OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Activity> f85991OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile boolean f85992OooO0O0;

    @Override // o00o00Oo.InterfaceC25263OooO0oo
    public final void OooO00o(ActivityC21897OooOo0 activityC21897OooOo0) {
        if (!this.f85992OooO0O0 && this.f85991OooO00o.add(activityC21897OooOo0)) {
            View decorView = activityC21897OooOo0.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC25260OooO0o(this, decorView));
        }
    }
}
