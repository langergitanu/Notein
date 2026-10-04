package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.C25503OooOoOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R3\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003`\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, m80612d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "Ljava/util/HashMap;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lo00oO0O/OooOoOO;", "Lkotlin/collections/HashMap;", "OooOo0o", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "OooOo", "getLayoutNodeToHolder", "layoutNodeToHolder", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class AndroidViewsHandler extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public final HashMap<C25503OooOoOO, AndroidViewHolder> layoutNodeToHolder;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public final HashMap<AndroidViewHolder, C25503OooOoOO> holderToLayoutNode;

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, C25503OooOoOO> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<C25503OooOoOO, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        OooOOO0.OooO0oO(child, "child");
        OooOOO0.OooO0oO(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        OooOOO0.OooO0o(setKeySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : setKeySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        OooOOO0.OooO0o(setKeySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : setKeySet) {
            int i4 = androidViewHolder.f63553Oooo00o;
            if (i4 != Integer.MIN_VALUE && (i3 = androidViewHolder.f63550Oooo0) != Integer.MIN_VALUE) {
                androidViewHolder.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C25503OooOoOO c25503OooOoOO = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && c25503OooOoOO != null) {
                C25503OooOoOO.OooO0OO oooO0OO = C25503OooOoOO.f86933OooooOO;
                c25503OooOoOO.Oooo00o(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
