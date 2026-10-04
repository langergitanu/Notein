package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String[] f66319OooOo0o = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f66318OooOo = new OooO00o(PointF.class, "topLeft");

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C19042OooO0O0 f66321OooOoO0 = new C19042OooO0O0(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO0OO f66320OooOoO = new OooO0OO(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C22089OooO0Oo f66322OooOoOO = new C22089OooO0Oo(PointF.class, "topLeft");

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO0o0 f66323OooOoo0 = new OooO0o0(PointF.class, RequestParameters.POSITION);

    public class OooO00o extends Property<C22091OooO0oo, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C22091OooO0oo c22091OooO0oo) {
            return null;
        }

        @Override // android.util.Property
        public final void set(C22091OooO0oo c22091OooO0oo, PointF pointF) {
            C22091OooO0oo c22091OooO0oo2 = c22091OooO0oo;
            PointF pointF2 = pointF;
            c22091OooO0oo2.getClass();
            c22091OooO0oo2.f66326OooO00o = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            c22091OooO0oo2.f66327OooO0O0 = iRound;
            int i = c22091OooO0oo2.f66330OooO0o + 1;
            c22091OooO0oo2.f66330OooO0o = i;
            if (i == c22091OooO0oo2.f66332OooO0oO) {
                C22110OooOoOO.OooO00o(c22091OooO0oo2.f66331OooO0o0, c22091OooO0oo2.f66326OooO00o, iRound, c22091OooO0oo2.f66328OooO0OO, c22091OooO0oo2.f66329OooO0Oo);
                c22091OooO0oo2.f66330OooO0o = 0;
                c22091OooO0oo2.f66332OooO0oO = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C19042OooO0O0 extends Property<C22091OooO0oo, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C22091OooO0oo c22091OooO0oo) {
            return null;
        }

        @Override // android.util.Property
        public final void set(C22091OooO0oo c22091OooO0oo, PointF pointF) {
            C22091OooO0oo c22091OooO0oo2 = c22091OooO0oo;
            PointF pointF2 = pointF;
            c22091OooO0oo2.getClass();
            c22091OooO0oo2.f66328OooO0OO = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            c22091OooO0oo2.f66329OooO0Oo = iRound;
            int i = c22091OooO0oo2.f66332OooO0oO + 1;
            c22091OooO0oo2.f66332OooO0oO = i;
            if (c22091OooO0oo2.f66330OooO0o == i) {
                C22110OooOoOO.OooO00o(c22091OooO0oo2.f66331OooO0o0, c22091OooO0oo2.f66326OooO00o, c22091OooO0oo2.f66327OooO0O0, c22091OooO0oo2.f66328OooO0OO, iRound);
                c22091OooO0oo2.f66330OooO0o = 0;
                c22091OooO0oo2.f66332OooO0oO = 0;
            }
        }
    }

    public class OooO0OO extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C22110OooOoOO.OooO00o(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public class C22089OooO0Oo extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C22110OooOoOO.OooO00o(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {
        private final C22091OooO0oo mViewBounds;

        public OooO0o(C22091OooO0oo c22091OooO0oo) {
            this.mViewBounds = c22091OooO0oo;
        }
    }

    public class OooO0o0 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            C22110OooOoOO.OooO00o(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0O0$OooO0oO, reason: case insensitive filesystem */
    public static class C22090OooO0oO extends C22103OooOOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f66324OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ViewGroup f66325OooO0O0;

        public C22090OooO0oO(ViewGroup viewGroup) {
            this.f66325OooO0O0 = viewGroup;
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
            C22108OooOoO.OooO00o(this.f66325OooO0O0, false);
            this.f66324OooO00o = true;
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            if (!this.f66324OooO00o) {
                C22108OooOoO.OooO00o(this.f66325OooO0O0, false);
            }
            oooOOO0.removeListener(this);
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionPause(OooOOO0 oooOOO0) {
            C22108OooOoO.OooO00o(this.f66325OooO0O0, false);
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionResume(OooOOO0 oooOOO0) {
            C22108OooOoO.OooO00o(this.f66325OooO0O0, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0O0$OooO0oo, reason: case insensitive filesystem */
    public static class C22091OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66326OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66327OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66328OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f66330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f66331OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f66332OooO0oO;

        public C22091OooO0oo(View view) {
            this.f66331OooO0o0 = view;
        }
    }

    public static void OooO00o(C22107OooOo0o c22107OooOo0o) {
        View view = c22107OooOo0o.f66395OooO0O0;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c22107OooOo0o.f66394OooO00o;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c22107OooOo0o.f66395OooO0O0.getParent());
    }

    @Override // androidx.transition.OooOOO0
    public final void captureEndValues(C22107OooOo0o c22107OooOo0o) {
        OooO00o(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public final void captureStartValues(C22107OooOo0o c22107OooOo0o) {
        OooO00o(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public final Animator createAnimator(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        int i;
        Animator animatorOooO00o;
        if (c22107OooOo0o == null || c22107OooOo0o2 == null) {
            return null;
        }
        HashMap map = c22107OooOo0o.f66394OooO00o;
        HashMap map2 = c22107OooOo0o2.f66394OooO00o;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c22107OooOo0o2.f66395OooO0O0;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        C22110OooOoOO.OooO00o(view, i2, i4, i6, i8);
        if (i != 2) {
            animatorOooO00o = (i2 == i3 && i4 == i5) ? C22095OooO0oo.OooO00o(view, f66320OooOoO, getPathMotion().getPath(i6, i8, i7, i9)) : C22095OooO0oo.OooO00o(view, f66322OooOoOO, getPathMotion().getPath(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            animatorOooO00o = C22095OooO0oo.OooO00o(view, f66323OooOoo0, getPathMotion().getPath(i2, i4, i3, i5));
        } else {
            C22091OooO0oo c22091OooO0oo = new C22091OooO0oo(view);
            ObjectAnimator objectAnimatorOooO00o = C22095OooO0oo.OooO00o(c22091OooO0oo, f66318OooOo, getPathMotion().getPath(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorOooO00o2 = C22095OooO0oo.OooO00o(c22091OooO0oo, f66321OooOoO0, getPathMotion().getPath(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOooO00o, objectAnimatorOooO00o2);
            animatorSet.addListener(new OooO0o(c22091OooO0oo));
            animatorOooO00o = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C22108OooOoO.OooO00o(viewGroup4, true);
            getRootTransition().addListener(new C22090OooO0oO(viewGroup4));
        }
        return animatorOooO00o;
    }

    @Override // androidx.transition.OooOOO0
    public final String[] getTransitionProperties() {
        return f66319OooOo0o;
    }

    @Override // androidx.transition.OooOOO0
    public final boolean isSeekingSupported() {
        return true;
    }
}
