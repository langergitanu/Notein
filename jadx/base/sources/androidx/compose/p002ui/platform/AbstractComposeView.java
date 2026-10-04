package androidx.compose.p002ui.platform;

import Oooo0oO.AbstractC21043OooOoO;
import Oooo0oO.C21022OooO0OO;
import Oooo0oO.C21082o00000oO;
import Oooo0oO.InterfaceC21033OooOOOO;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OoO.C24224OooO00o;
import o000oOoO.C24633OooO00o;
import o00oO0O.InterfaceC25542OoooooO;
import o0ooOO0.C31584o0000ooO;
import o0ooOO0.C31592o000Oo00;
import o0ooOO0.C31596o000OoOO;
import o0ooOO0.C31602o0OoO0o;
import o0ooOO0.o000;
import o0ooOO0.o000O;
import o0ooOO0.o000O000;
import o0ooOO0.o000OO00;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33662Ooooooo;
import oO0o0OOO.C33685OooO0o;
import oO0o0OOO.C33688OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0006R$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR0\u0010&\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b%\u0010\u001e\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u000eR\u0014\u0010(\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010*\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006+"}, m80612d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "LOooo0oO/OooOoO;", "parent", "LoO00ooO/OooOooO;", "setParentCompositionContext", "(LOooo0oO/OooOoO;)V", "Lo0ooOO0/o000O000;", "strategy", "setViewCompositionStrategy", "(Lo0ooOO0/o000O000;)V", "", "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "OooOo", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "OooOoO", "LOooo0oO/OooOoO;", "setParentContext", "parentContext", "Lkotlin/Function0;", "OooOoOO", "LoO0O000o/OooO00o;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "OooOoo0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public WeakReference<AbstractC21043OooOoO> f63356OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    public AbstractC21043OooOoO parentContext;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21612OooO0oo f63358OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name and from kotlin metadata */
    public oO0O000o.OooO00o<C32460OooOooO> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f63360OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f63362OooOooO;

    public static final class OooO00o extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {
        public OooO00o() {
            super(2);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
            InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
            if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
                interfaceC21033OooOOOO2.OooO0o();
            } else {
                AbstractComposeView.this.OooO00o(8, interfaceC21033OooOOOO2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context) {
        super(context, null, 0);
        OooOOO0.OooO0oO(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        o000 o000Var = new o000(this);
        addOnAttachStateChangeListener(o000Var);
        C21022OooO0OO c21022OooO0OO = new C21022OooO0OO();
        C24224OooO00o.OooO0oO(this).f81467OooO00o.add(c21022OooO0OO);
        this.disposeViewCompositionStrategy = new C31584o0000ooO(this, o000Var, c21022OooO0OO);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC21043OooOoO abstractC21043OooOoO) {
        if (this.parentContext != abstractC21043OooOoO) {
            this.parentContext = abstractC21043OooOoO;
            if (abstractC21043OooOoO != null) {
                this.f63356OooOo0o = null;
            }
            C21612OooO0oo c21612OooO0oo = this.f63358OooOoO0;
            if (c21612OooO0oo != null) {
                c21612OooO0oo.dispose();
                this.f63358OooOoO0 = null;
                if (isAttachedToWindow()) {
                    OooO0Oo();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f63356OooOo0o = null;
        }
    }

    public abstract void OooO00o(int i, InterfaceC21033OooOOOO interfaceC21033OooOOOO);

    public final void OooO0O0() {
        if (this.f63360OooOoo) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void OooO0OO() {
        C21612OooO0oo c21612OooO0oo = this.f63358OooOoO0;
        if (c21612OooO0oo != null) {
            c21612OooO0oo.dispose();
        }
        this.f63358OooOoO0 = null;
        requestLayout();
    }

    public final void OooO0Oo() {
        if (this.f63358OooOoO0 == null) {
            try {
                this.f63360OooOoo = true;
                this.f63358OooOoO0 = C31596o000OoOO.OooO00o(this, OooO0oO(), new C24633OooO00o(-656146368, true, new OooO00o()));
            } finally {
                this.f63360OooOoo = false;
            }
        }
    }

    public void OooO0o(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void OooO0o0(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final AbstractC21043OooOoO OooO0oO() {
        C21082o00000oO c21082o00000oOOooO00o;
        AbstractC21043OooOoO abstractC21043OooOoOOooO0O0 = this.parentContext;
        if (abstractC21043OooOoOOooO0O0 == null) {
            abstractC21043OooOoOOooO0O0 = C31592o000Oo00.OooO0O0(this);
            if (abstractC21043OooOoOOooO0O0 == null) {
                for (ViewParent parent = getParent(); abstractC21043OooOoOOooO0O0 == null && (parent instanceof View); parent = parent.getParent()) {
                    abstractC21043OooOoOOooO0O0 = C31592o000Oo00.OooO0O0((View) parent);
                }
            }
            C21082o00000oO.EnumC21083OooO0Oo enumC21083OooO0Oo = C21082o00000oO.EnumC21083OooO0Oo.f61097OooOo;
            if (abstractC21043OooOoOOooO0O0 != null) {
                AbstractC21043OooOoO abstractC21043OooOoO = (!(abstractC21043OooOoOOooO0O0 instanceof C21082o00000oO) || ((C21082o00000oO.EnumC21083OooO0Oo) ((C21082o00000oO) abstractC21043OooOoOOooO0O0).f61093OooOOo0.getValue()).compareTo(enumC21083OooO0Oo) > 0) ? abstractC21043OooOoOOooO0O0 : null;
                if (abstractC21043OooOoO != null) {
                    this.f63356OooOo0o = new WeakReference<>(abstractC21043OooOoO);
                }
            } else {
                abstractC21043OooOoOOooO0O0 = null;
            }
            if (abstractC21043OooOoOOooO0O0 == null) {
                WeakReference<AbstractC21043OooOoO> weakReference = this.f63356OooOo0o;
                if (weakReference == null || (abstractC21043OooOoOOooO0O0 = weakReference.get()) == null || ((abstractC21043OooOoOOooO0O0 instanceof C21082o00000oO) && ((C21082o00000oO.EnumC21083OooO0Oo) ((C21082o00000oO) abstractC21043OooOoOOooO0O0).f61093OooOOo0.getValue()).compareTo(enumC21083OooO0Oo) <= 0)) {
                    abstractC21043OooOoOOooO0O0 = null;
                }
                if (abstractC21043OooOoOOooO0O0 == null) {
                    if (!isAttachedToWindow()) {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC21043OooOoO abstractC21043OooOoOOooO0O02 = C31592o000Oo00.OooO0O0(view);
                    if (abstractC21043OooOoOOooO0O02 == null) {
                        c21082o00000oOOooO00o = C31602o0OoO0o.f112927OooO00o.get().OooO00o(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c21082o00000oOOooO00o);
                        C33662Ooooooo c33662Ooooooo = C33662Ooooooo.f121350OooOo0o;
                        Handler handler = view.getHandler();
                        OooOOO0.OooO0o(handler, "rootView.handler");
                        int i = C33688OooO0oo.f121431OooO00o;
                        view.addOnAttachStateChangeListener(new o000O(C33609OooO0oo.OooO0OO(c33662Ooooooo, new C33685OooO0o(handler, "windowRecomposer cleanup", false).f121428OooOoo0, null, new o000OO00(c21082o00000oOOooO00o, view, null), 2)));
                    } else {
                        if (!(abstractC21043OooOoOOooO0O02 instanceof C21082o00000oO)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c21082o00000oOOooO00o = (C21082o00000oO) abstractC21043OooOoOOooO0O02;
                    }
                    C21082o00000oO c21082o00000oO = ((C21082o00000oO.EnumC21083OooO0Oo) c21082o00000oOOooO00o.f61093OooOOo0.getValue()).compareTo(enumC21083OooO0Oo) > 0 ? c21082o00000oOOooO00o : null;
                    if (c21082o00000oO != null) {
                        this.f63356OooOo0o = new WeakReference<>(c21082o00000oO);
                    }
                    return c21082o00000oOOooO00o;
                }
            }
        }
        return abstractC21043OooOoOOooO0O0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        OooO0O0();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.f63358OooOoO0 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f63362OooOooO || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            OooO0Oo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0o0(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0Oo();
        OooO0o(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(AbstractC21043OooOoO parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC25542OoooooO) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.f63362OooOooO = true;
    }

    public final void setViewCompositionStrategy(o000O000 strategy) {
        OooOOO0.OooO0oO(strategy, "strategy");
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.disposeViewCompositionStrategy;
        if (oooO00o != null) {
            oooO00o.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.OooO00o(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        OooO0O0();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        OooO0O0();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        OooO0O0();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        super.addView(view, i, layoutParams);
    }
}
