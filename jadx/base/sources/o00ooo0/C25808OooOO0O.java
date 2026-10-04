package o00ooo0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: o00ooo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25808OooOO0O extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC25806OooOO0 f88020OooO00o;

    public C25808OooOO0O(ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0) {
        this.f88020OooO00o = viewOnTouchListenerC25806OooOO0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f88020OooO00o.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f88020OooO00o;
        View.OnLongClickListener onLongClickListener = viewOnTouchListenerC25806OooOO0.f88001Oooo0o;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(viewOnTouchListenerC25806OooOO0.f87992OooOooO);
        }
    }
}
