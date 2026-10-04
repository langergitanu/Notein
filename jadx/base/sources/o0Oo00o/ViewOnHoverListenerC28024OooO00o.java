package o0Oo00o;

import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: o0Oo00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnHoverListenerC28024OooO00o implements View.OnHoverListener {
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), 1002));
            return false;
        }
        if (actionMasked != 10) {
            return false;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), 1000));
        return false;
    }
}
