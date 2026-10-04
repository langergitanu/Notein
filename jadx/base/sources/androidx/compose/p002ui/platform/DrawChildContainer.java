package androidx.compose.p002ui.platform;

import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.InterfaceC21342OoooOOO;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "getChildCount", "()I", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f63448OooOo0o;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void OooO00o(InterfaceC21342OoooOOO canvas, ViewLayer viewLayer, long j) {
        OooOOO0.OooO0oO(canvas, "canvas");
        Canvas canvas2 = C21328Oooo000.f61738OooO00o;
        super.drawChild(((C21325OooOooo) canvas).f61733OooO00o, viewLayer, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            OooOOO0.OooO0o0(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated) {
                this.f63448OooOo0o = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f63448OooOo0o = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f63448OooOo0o) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
