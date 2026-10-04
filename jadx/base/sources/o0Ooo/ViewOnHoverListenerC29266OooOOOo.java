package o0Ooo;

import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnHoverListenerC29266OooOOOo implements View.OnHoverListener {
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i = PenBoxChildFragment.f75355o0000Ooo;
        if (motionEvent.getAction() == 9) {
            view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), PointerIconCompat.TYPE_GRAB));
            return false;
        }
        if (motionEvent.getAction() != 10) {
            return false;
        }
        view.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), PointerIconCompat.TYPE_GRABBING));
        return false;
    }
}
