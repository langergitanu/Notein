package com.orion.notein.p607ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/ui/widget/CustomConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/notein/ui/widget/CustomConstraintLayout$OooO00o;", "OooOo0o", "Lcom/orion/notein/ui/widget/CustomConstraintLayout$OooO00o;", "getDispatchEventListener", "()Lcom/orion/notein/ui/widget/CustomConstraintLayout$OooO00o;", "setDispatchEventListener", "(Lcom/orion/notein/ui/widget/CustomConstraintLayout$OooO00o;)V", "dispatchEventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CustomConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public OooO00o dispatchEventListener;

    public interface OooO00o {
        void OooO00o(MotionEvent motionEvent);

        void OooO0O0(MotionEvent motionEvent, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        OooOOO0.OooO0oO(ev, "ev");
        OooO00o oooO00o = this.dispatchEventListener;
        if (oooO00o != null) {
            oooO00o.OooO00o(ev);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev);
        OooO00o oooO00o2 = this.dispatchEventListener;
        if (oooO00o2 != null) {
            oooO00o2.OooO0O0(ev, zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    public final OooO00o getDispatchEventListener() {
        return this.dispatchEventListener;
    }

    public final void setDispatchEventListener(OooO00o oooO00o) {
        this.dispatchEventListener = oooO00o;
    }
}
