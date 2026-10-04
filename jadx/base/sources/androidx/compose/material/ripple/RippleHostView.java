package androidx.compose.material.ripple;

import OooOo.C20496Oooo0o0;
import OooOoOO.C20559OoooOOO;
import OooOooO.C20738OooOOOo;
import Oooo0OO.C20967OooOo0O;
import Oooo0OO.RunnableC20958OooOOO;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooOO.C21348Ooooo0o;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00O.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "LoO00ooO/OooOooO;", "setRippleState", "(Z)V", "material-ripple_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Boolean f63320OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C20967OooOo0O f63321OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RunnableC20958OooOOO f63322OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Long f63323OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C20559OoooOOO f63324OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int[] f63319OooOoo0 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f63318OooOoo = new int[0];

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f63322OooOoO;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f63323OooOoO0;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f63319OooOoo0 : f63318OooOoo;
            C20967OooOo0O c20967OooOo0O = this.f63321OooOo0o;
            if (c20967OooOo0O != null) {
                c20967OooOo0O.setState(iArr);
            }
        } else {
            RunnableC20958OooOOO runnableC20958OooOOO = new RunnableC20958OooOOO(this, 0);
            this.f63322OooOoO = runnableC20958OooOOO;
            postDelayed(runnableC20958OooOOO, 50L);
        }
        this.f63323OooOoO0 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView this$0) {
        OooOOO0.OooO0oO(this$0, "this$0");
        C20967OooOo0O c20967OooOo0O = this$0.f63321OooOo0o;
        if (c20967OooOo0O != null) {
            c20967OooOo0O.setState(f63318OooOoo);
        }
        this$0.f63322OooOoO = null;
    }

    public final void OooO0O0(C20738OooOOOo interaction, boolean z, long j, int i, long j2, float f, C20559OoooOOO onInvalidateRipple) {
        OooOOO0.OooO0oO(interaction, "interaction");
        OooOOO0.OooO0oO(onInvalidateRipple, "onInvalidateRipple");
        if (this.f63321OooOo0o == null || !Boolean.valueOf(z).equals(this.f63320OooOo)) {
            C20967OooOo0O c20967OooOo0O = new C20967OooOo0O(z);
            setBackground(c20967OooOo0O);
            this.f63321OooOo0o = c20967OooOo0O;
            this.f63320OooOo = Boolean.valueOf(z);
        }
        C20967OooOo0O c20967OooOo0O2 = this.f63321OooOo0o;
        OooOOO0.OooO0Oo(c20967OooOo0O2);
        this.f63324OooOoOO = onInvalidateRipple;
        OooO0o0(j, j2, i, f);
        if (z) {
            long j3 = interaction.f59580OooO00o;
            c20967OooOo0O2.setHotspot(C21290OooO0o0.OooO0OO(j3), C21290OooO0o0.OooO0Oo(j3));
        } else {
            c20967OooOo0O2.setHotspot(c20967OooOo0O2.getBounds().centerX(), c20967OooOo0O2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void OooO0OO() {
        this.f63324OooOoOO = null;
        RunnableC20958OooOOO runnableC20958OooOOO = this.f63322OooOoO;
        if (runnableC20958OooOOO != null) {
            removeCallbacks(runnableC20958OooOOO);
            RunnableC20958OooOOO runnableC20958OooOOO2 = this.f63322OooOoO;
            OooOOO0.OooO0Oo(runnableC20958OooOOO2);
            runnableC20958OooOOO2.run();
        } else {
            C20967OooOo0O c20967OooOo0O = this.f63321OooOo0o;
            if (c20967OooOo0O != null) {
                c20967OooOo0O.setState(f63318OooOoo);
            }
        }
        C20967OooOo0O c20967OooOo0O2 = this.f63321OooOo0o;
        if (c20967OooOo0O2 == null) {
            return;
        }
        c20967OooOo0O2.setVisible(false, false);
        unscheduleDrawable(c20967OooOo0O2);
    }

    public final void OooO0Oo() {
        setRippleState(false);
    }

    public final void OooO0o0(long j, long j2, int i, float f) {
        C20967OooOo0O c20967OooOo0O = this.f63321OooOo0o;
        if (c20967OooOo0O == null) {
            return;
        }
        Integer num = c20967OooOo0O.f60522OooOoO0;
        if (num == null || num.intValue() != i) {
            c20967OooOo0O.f60522OooOoO0 = Integer.valueOf(i);
            C20967OooOo0O.OooO00o.f60523OooO00o.OooO00o(c20967OooOo0O, i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jOooO0O0 = C21348Ooooo0o.OooO0O0(f, j2);
        C21348Ooooo0o c21348Ooooo0o = c20967OooOo0O.f60519OooOo;
        if (!(c21348Ooooo0o == null ? false : C21348Ooooo0o.OooO0OO(c21348Ooooo0o.f61768OooO00o, jOooO0O0))) {
            c20967OooOo0O.f60519OooOo = new C21348Ooooo0o(jOooO0O0);
            c20967OooOo0O.setColor(ColorStateList.valueOf(C20496Oooo0o0.OooO0oo(jOooO0O0)));
        }
        Rect rect = new Rect(0, 0, OooO00o.OooO0O0(C21293OooOO0.OooO0Oo(j)), OooO00o.OooO0O0(C21293OooOO0.OooO0O0(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c20967OooOo0O.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        OooOOO0.OooO0oO(who, "who");
        C20559OoooOOO c20559OoooOOO = this.f63324OooOoOO;
        if (c20559OoooOOO != null) {
            c20559OoooOOO.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
