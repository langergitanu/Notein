package o00ooOoo;

import android.view.MotionEvent;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import o00ooo00.AbstractC25813OooO0OO;
import o00ooo00.C25815OooO0o0;

/* JADX INFO: renamed from: o00ooOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC25792OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FastScroller f87969OooOo0o;

    public ViewOnTouchListenerC25792OooO00o(FastScroller fastScroller) {
        this.f87969OooOo0o = fastScroller;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        FastScroller fastScroller = this.f87969OooOo0o;
        fastScroller.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            fastScroller.f67548Oooo00o = false;
            if (fastScroller.f67549Oooo0O0 != null) {
                AbstractC25813OooO0OO abstractC25813OooO0OO = fastScroller.f67545Oooo0;
                abstractC25813OooO0OO.getClass();
                if (abstractC25813OooO0OO.OooO00o() != null) {
                    C25815OooO0o0 c25815OooO0o0 = abstractC25813OooO0OO.OooO00o().f88023OooO00o;
                    c25815OooO0o0.OooO00o();
                    c25815OooO0o0.f88031OooO0O0.start();
                }
            }
            return true;
        }
        if (fastScroller.f67549Oooo0O0 != null && motionEvent.getAction() == 0) {
            AbstractC25813OooO0OO abstractC25813OooO0OO2 = fastScroller.f67545Oooo0;
            abstractC25813OooO0OO2.getClass();
            if (abstractC25813OooO0OO2.OooO00o() != null) {
                C25815OooO0o0 c25815OooO0o02 = abstractC25813OooO0OO2.OooO00o().f88023OooO00o;
                c25815OooO0o02.f88031OooO0O0.cancel();
                View view2 = c25815OooO0o02.f88030OooO00o;
                if (view2.getVisibility() == 4) {
                    view2.setVisibility(0);
                    c25815OooO0o02.OooO00o();
                    c25815OooO0o02.f88032OooO0OO.start();
                }
            }
        }
        fastScroller.f67548Oooo00o = true;
        if (fastScroller.OooO0OO()) {
            float rawY = motionEvent.getRawY();
            View view3 = fastScroller.f67538OooOoO;
            ((View) view3.getParent()).getLocationInWindow(new int[]{0, (int) view3.getY()});
            f = rawY - r2[1];
            width = fastScroller.getHeight();
            width2 = fastScroller.f67538OooOoO.getHeight();
        } else {
            float rawX = motionEvent.getRawX();
            View view4 = fastScroller.f67538OooOoO;
            ((View) view4.getParent()).getLocationInWindow(new int[]{(int) view4.getX(), 0});
            f = rawX - r3[0];
            width = fastScroller.getWidth();
            width2 = fastScroller.f67538OooOoO.getWidth();
        }
        float f2 = f / (width - width2);
        fastScroller.setScrollerPosition(f2);
        fastScroller.setRecyclerViewPosition(f2);
        return true;
    }
}
