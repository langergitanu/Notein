package androidx.compose.p002ui.viewinterop;

import Oooo0oO.InterfaceC21032OooOOO0;
import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21289OooO0o;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.NestedScrollingParent3;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.oo000o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000O0oo.C24442Oooo00o;
import o000ooo0.InterfaceC24753OooO0o0;
import o00oO0O.C25503OooOoOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013R6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR*\u0010.\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u00106\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0016\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010>\u001a\u0002072\u0006\u0010\u000e\u001a\u0002078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010B\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0016\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R.\u0010J\u001a\u0004\u0018\u00010C2\b\u0010\u000e\u001a\u0004\u0018\u00010C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010R\u001a\u0004\u0018\u00010K2\b\u0010\u000e\u001a\u0004\u0018\u00010K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u0016\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u00101\u001a\u0004\bU\u00103\"\u0004\bV\u00105R\u0017\u0010Y\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006]"}, m80612d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "LOooo0oO/OooOOO0;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "", "getNestedScrollAxes", "()I", "value", "OooOo0o", "Landroid/view/View;", "getView", "setView$ui_release", "(Landroid/view/View;)V", "view", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "OooOo", "LoO0O000o/OooO00o;", "getUpdate", "()LoO0O000o/OooO00o;", "setUpdate", "(LoO0O000o/OooO00o;)V", "update", "<set-?>", "OooOoO0", "getReset", "setReset", "reset", "OooOoO", "getRelease", "setRelease", "release", "LOoooOoO/OooO0o;", "OooOoOO", "LOoooOoO/OooO0o;", "getModifier", "()LOoooOoO/OooO0o;", "setModifier", "(LOoooOoO/OooO0o;)V", "modifier", "Lkotlin/Function1;", "OooOoo0", "LoO0O000o/OooOO0o;", "getOnModifierChanged$ui_release", "()LoO0O000o/OooOO0o;", "setOnModifierChanged$ui_release", "(LoO0O000o/OooOO0o;)V", "onModifierChanged", "Lo0000Ooo/OooO0OO;", "OooOoo", "Lo0000Ooo/OooO0OO;", "getDensity", "()Lo0000Ooo/OooO0OO;", "setDensity", "(Lo0000Ooo/OooO0OO;)V", "density", "OooOooO", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/OooOoo;", "OooOooo", "Landroidx/lifecycle/OooOoo;", "getLifecycleOwner", "()Landroidx/lifecycle/OooOoo;", "setLifecycleOwner", "(Landroidx/lifecycle/OooOoo;)V", "lifecycleOwner", "Lo000ooo0/OooO0o0;", "Oooo000", "Lo000ooo0/OooO0o0;", "getSavedStateRegistryOwner", "()Lo000ooo0/OooO0o0;", "setSavedStateRegistryOwner", "(Lo000ooo0/OooO0o0;)V", "savedStateRegistryOwner", "", "Oooo00O", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Lo00oO0O/OooOoOO;", "layoutNode", "Lo00oO0O/OooOoOO;", "getLayoutNode", "()Lo00oO0O/OooOoOO;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, InterfaceC21032OooOOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public OooO00o<C32460OooOooO> update;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public View view;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    public OooO00o<C32460OooOooO> release;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public OooO00o<C32460OooOooO> reset;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name and from kotlin metadata */
    public InterfaceC21233OooO0o modifier;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC24229OooO0OO density;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super InterfaceC21233OooO0o, C32460OooOooO> onModifierChanged;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super InterfaceC24229OooO0OO, C32460OooOooO> onDensityChanged;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC21987OooOoo lifecycleOwner;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f63550Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name and from kotlin metadata */
    public InterfaceC24753OooO0o0 savedStateRegistryOwner;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f63553Oooo00o;

    @Override // Oooo0oO.InterfaceC21032OooOOO0
    public final void OooO0O0() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // Oooo0oO.InterfaceC21032OooOOO0
    public final void OooO0Oo() {
        this.release.invoke();
    }

    @Override // Oooo0oO.InterfaceC21032OooOOO0
    public final void OooO0oO() {
        View view = this.view;
        OooOOO0.OooO0Oo(view);
        if (view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(null);
        throw null;
    }

    public final InterfaceC24229OooO0OO getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final C25503OooOoOO getLayoutNode() {
        return null;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.view;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC21987OooOoo getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final InterfaceC21233OooO0o getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        throw null;
    }

    public final InterfaceC32507OooOO0o<InterfaceC24229OooO0OO, C32460OooOooO> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final InterfaceC32507OooOO0o<InterfaceC21233OooO0o, C32460OooOooO> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final InterfaceC32507OooOO0o<Boolean, C32460OooOooO> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final OooO00o<C32460OooOooO> getRelease() {
        return this.release;
    }

    public final OooO00o<C32460OooOooO> getReset() {
        return this.reset;
    }

    public final InterfaceC24753OooO0o0 getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final OooO00o<C32460OooOooO> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.view;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        OooOOO0.OooO0oO(child, "child");
        OooOOO0.OooO0oO(target, "target");
        super.onDescendantInvalidated(child, target);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.view;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.view;
        if ((view != null ? view.getParent() : null) != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        View view2 = this.view;
        if (view2 != null) {
            view2.measure(i, i2);
        }
        View view3 = this.view;
        int measuredWidth = view3 != null ? view3.getMeasuredWidth() : 0;
        View view4 = this.view;
        setMeasuredDimension(measuredWidth, view4 != null ? view4.getMeasuredHeight() : 0);
        this.f63553Oooo00o = i;
        this.f63550Oooo0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        OooOOO0.OooO0oO(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C24242OooOOo.OooO00o(f * (-1.0f), f2 * (-1.0f));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        OooOOO0.OooO0oO(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C24242OooOOo.OooO00o(f * (-1.0f), f2 * (-1.0f));
        throw null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed, int i3) {
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            C21289OooO0o.OooO00o(f * f2, i2 * f2);
            throw null;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            C21289OooO0o.OooO00o(f * f2, i2 * f2);
            C21289OooO0o.OooO00o(i3 * f2, i4 * f2);
            throw null;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View child, View target, int i, int i2) {
        OooOOO0.OooO0oO(child, "child");
        OooOOO0.OooO0oO(target, "target");
        throw null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View child, View target, int i, int i2) {
        OooOOO0.OooO0oO(child, "child");
        OooOOO0.OooO0oO(target, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View target, int i) {
        OooOOO0.OooO0oO(target, "target");
        throw null;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o = this.onRequestDisallowInterceptTouchEvent;
        if (interfaceC32507OooOO0o != null) {
            interfaceC32507OooOO0o.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC24229OooO0OO value) {
        OooOOO0.OooO0oO(value, "value");
        if (value != this.density) {
            this.density = value;
            InterfaceC32507OooOO0o<? super InterfaceC24229OooO0OO, C32460OooOooO> interfaceC32507OooOO0o = this.onDensityChanged;
            if (interfaceC32507OooOO0o != null) {
                interfaceC32507OooOO0o.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        if (interfaceC21987OooOoo != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC21987OooOoo;
            oo000o.OooO0O0(this, interfaceC21987OooOoo);
        }
    }

    public final void setModifier(InterfaceC21233OooO0o value) {
        OooOOO0.OooO0oO(value, "value");
        if (value != this.modifier) {
            this.modifier = value;
            InterfaceC32507OooOO0o<? super InterfaceC21233OooO0o, C32460OooOooO> interfaceC32507OooOO0o = this.onModifierChanged;
            if (interfaceC32507OooOO0o != null) {
                interfaceC32507OooOO0o.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC32507OooOO0o<? super InterfaceC24229OooO0OO, C32460OooOooO> interfaceC32507OooOO0o) {
        this.onDensityChanged = interfaceC32507OooOO0o;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC32507OooOO0o<? super InterfaceC21233OooO0o, C32460OooOooO> interfaceC32507OooOO0o) {
        this.onModifierChanged = interfaceC32507OooOO0o;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o) {
        this.onRequestDisallowInterceptTouchEvent = interfaceC32507OooOO0o;
    }

    public final void setRelease(OooO00o<C32460OooOooO> oooO00o) {
        OooOOO0.OooO0oO(oooO00o, "<set-?>");
        this.release = oooO00o;
    }

    public final void setReset(OooO00o<C32460OooOooO> oooO00o) {
        OooOOO0.OooO0oO(oooO00o, "<set-?>");
        this.reset = oooO00o;
    }

    public final void setSavedStateRegistryOwner(InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
        if (interfaceC24753OooO0o0 != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = interfaceC24753OooO0o0;
            C24442Oooo00o.OooO0O0(this, interfaceC24753OooO0o0);
        }
    }

    public final void setUpdate(OooO00o<C32460OooOooO> value) {
        OooOOO0.OooO0oO(value, "value");
        this.update = value;
        throw null;
    }

    public final void setView$ui_release(View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViewsInLayout();
            if (view == null) {
                return;
            }
            addView(view);
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5) {
        OooOOO0.OooO0oO(target, "target");
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            C21289OooO0o.OooO00o(f * f2, i2 * f2);
            C21289OooO0o.OooO00o(i3 * f2, i4 * f2);
            throw null;
        }
    }
}
