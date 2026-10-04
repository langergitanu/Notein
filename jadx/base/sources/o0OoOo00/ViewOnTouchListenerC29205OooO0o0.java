package o0OoOo00;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: renamed from: o0OoOo00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnTouchListenerC29205OooO0o0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103585OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103586OooOo0o;

    public /* synthetic */ ViewOnTouchListenerC29205OooO0o0(Object obj, int i) {
        this.f103586OooOo0o = i;
        this.f103585OooOo = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f103586OooOo0o) {
            case 0:
                int action = motionEvent.getAction();
                C29200OooO00o c29200OooO00o = (C29200OooO00o) this.f103585OooOo;
                if (action == 0) {
                    c29200OooO00o.f103568OooO0OO = true;
                } else if (action == 1 || action == 3) {
                    c29200OooO00o.f103568OooO0OO = false;
                }
                return true;
            default:
                ScrollView scrollView = (ScrollView) this.f103585OooOo;
                if (scrollView.canScrollVertically(-1)) {
                    scrollView.requestDisallowInterceptTouchEvent(true);
                    Log.d("TranslateDialogFragment", "onViewCreated: dstScroller.requestDisallowInterceptTouchEvent(true)");
                } else {
                    scrollView.requestDisallowInterceptTouchEvent(false);
                    Log.d("TranslateDialogFragment", "onViewCreated: dstScroller.requestDisallowInterceptTouchEvent(false)");
                }
                return false;
        }
    }
}
