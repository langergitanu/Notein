package o0o00Ooo;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.o00Ooo;
import o0o00Ooo.C29915OooO0OO;

/* JADX INFO: renamed from: o0o00Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29916OooO0Oo extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ View f106150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C29915OooO0OO.OooO0O0 f106151OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C29915OooO0OO f106152OooO0OO;

    public C29916OooO0Oo(View view, C29915OooO0OO.OooO0O0 oooO0O0, C29915OooO0OO c29915OooO0OO) {
        this.f106150OooO00o = view;
        this.f106151OooO0O0 = oooO0O0;
        this.f106152OooO0OO = c29915OooO0OO;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        OooOOO0.OooO0oO(e, "e");
        C29915OooO0OO.OooO0O0 oooO0O0 = this.f106152OooO0OO.f106140OooO0o0;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(false);
        }
        View viewFindViewById = this.f106150OooO00o.findViewById(R.id.show_press);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(0);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        OooOOO0.OooO0oO(e, "e");
        Object tag = this.f106150OooO00o.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetVO");
        if (((C29920OooO0oo) tag).f106162OooO0o == 1) {
            C29915OooO0OO.OooO0O0 oooO0O0 = this.f106151OooO0O0;
            oooO0O0.OooO00o(true);
            this.f106152OooO0OO.f106140OooO0o0 = oooO0O0;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        OooOOO0.OooO0oO(e, "e");
        Log.d("ColorSetAdapter", "onSingleTapConfirmed");
        o00Ooo o00ooo2 = this.f106152OooO0OO.f106139OooO0Oo;
        View view = this.f106150OooO00o;
        if (o00ooo2 != null) {
            o00ooo2.onClick(view);
        }
        View viewFindViewById = view.findViewById(R.id.show_press);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(8);
        return true;
    }
}
