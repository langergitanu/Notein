package oO0oO0O;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0oO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC34007OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Activity f122303OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f122304OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34008OooO0O0 f122305OooOoO0;

    public ViewTreeObserverOnGlobalLayoutListenerC34007OooO00o(Activity activity, InterfaceC34008OooO0O0 interfaceC34008OooO0O0) {
        this.f122303OooOo = activity;
        this.f122305OooOoO0 = interfaceC34008OooO0O0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity = this.f122303OooOo;
        OooOOO0.OooO0oO(activity, "activity");
        Rect rect = new Rect();
        View viewFindViewById = activity.findViewById(R.id.content);
        OooOOO0.OooO0o(viewFindViewById, "activity.findViewById(android.R.id.content)");
        View rootView = ((ViewGroup) viewFindViewById).getRootView();
        OooOOO0.OooO0o(rootView, "getContentRoot(activity).rootView");
        rootView.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        View viewFindViewById2 = activity.findViewById(R.id.content);
        OooOOO0.OooO0o(viewFindViewById2, "activity.findViewById(android.R.id.content)");
        ((ViewGroup) viewFindViewById2).getLocationOnScreen(iArr);
        View rootView2 = rootView.getRootView();
        OooOOO0.OooO0o(rootView2, "activityRoot.rootView");
        int height = rootView2.getHeight();
        boolean z = ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
        if (z == this.f122304OooOo0o) {
            return;
        }
        this.f122304OooOo0o = z;
        this.f122305OooOoO0.onVisibilityChanged(z);
    }
}
