package o0O0o00;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.editor.AbstractC22830OooO0Oo;
import java.util.ArrayList;
import o0O0oooo.C26395Oooo0o0;

/* JADX INFO: renamed from: o0O0o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25916OooO0oo extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.orion.editor.OooO00o f88476OooO00o;

    public C25916OooO0oo(com.orion.editor.OooO00o oooO00o) {
        this.f88476OooO00o = oooO00o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C26395Oooo0o0 c26395Oooo0o0;
        com.orion.editor.OooO00o oooO00o = this.f88476OooO00o;
        oooO00o.f69056OooO00o.OooOo0o();
        if (oooO00o.f69056OooO00o.getInputType() == 0) {
            return false;
        }
        if (oooO00o.f69056OooO00o.getInputType() == 2) {
            ArrayList arrayListOooOo00 = oooO00o.f69056OooO00o.OooOo00(true, new RectF(motionEvent.getX(), motionEvent.getY(), motionEvent.getX() + 1.0f, motionEvent.getY() + 1.0f));
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = oooO00o.f69056OooO00o.f69170OooOooO;
            if (!arrayListOooOo00.isEmpty() && abstractC22830OooO0Oo != null && (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) != null) {
                c26395Oooo0o0.f90558OooO0oO.OooOooo(arrayListOooOo00);
            }
        }
        oooO00o.f69056OooO00o.getTool().OooOO0O();
        oooO00o.f69091Oooo0O0 = true;
        return true;
    }
}
