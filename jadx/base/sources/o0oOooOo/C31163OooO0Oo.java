package o0oOooOo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.orion.notein.p607ui.widget.crop.AnimatableRectF;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0oOooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31163OooO0Oo {
    public static final void OooO00o(final AnimatableRectF animatableRectF, AnimatableRectF target, final InterfaceC32507OooOO0o<? super RectF, C32460OooOooO> interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(animatableRectF, "<this>");
        OooOOO0.OooO0oO(target, "target");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(animatableRectF, "left", ((RectF) animatableRectF).left, ((RectF) target).left);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(animatableRectF, "right", ((RectF) animatableRectF).right, ((RectF) target).right);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(animatableRectF, "top", ((RectF) animatableRectF).top, ((RectF) target).top);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(animatableRectF, "bottom", ((RectF) animatableRectF).bottom, ((RectF) target).bottom);
        objectAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0oOooOo.OooO0OO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                OooOOO0.OooO0oO(it, "it");
                interfaceC32507OooOO0o.invoke(animatableRectF);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public static final float OooO0O0(RectF rectF) {
        OooOOO0.OooO0oO(rectF, "<this>");
        return (float) Math.hypot(rectF.height(), rectF.width());
    }
}
