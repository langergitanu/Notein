package o0oOooOo;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0oOooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31161OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float[] f111174OooO00o = new float[9];

    public static final void OooO00o(final Matrix matrix, Matrix matrix2, final oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        OooOOO0.OooO0oO(matrix, "<this>");
        float[] fArr = f111174OooO00o;
        matrix.getValues(fArr);
        float f = fArr[0];
        matrix2.getValues(fArr);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, fArr[0]);
        matrix.getValues(fArr);
        float f2 = fArr[2];
        matrix2.getValues(fArr);
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, fArr[2]);
        matrix.getValues(fArr);
        float f3 = fArr[5];
        matrix2.getValues(fArr);
        final ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f3, fArr[5]);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0oOooOo.OooO00o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                OooOOO0.OooO0oO(it, "it");
                Matrix matrix3 = matrix;
                matrix3.reset();
                ValueAnimator valueAnimator = valueAnimatorOfFloat;
                Object animatedValue = valueAnimator.getAnimatedValue();
                OooOOO0.OooO0o0(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                OooOOO0.OooO0o0(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                matrix3.preScale(fFloatValue, ((Float) animatedValue2).floatValue());
                Object animatedValue3 = valueAnimatorOfFloat2.getAnimatedValue();
                OooOOO0.OooO0o0(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) animatedValue3).floatValue();
                Object animatedValue4 = valueAnimatorOfFloat3.getAnimatedValue();
                OooOOO0.OooO0o0(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                matrix3.postTranslate(fFloatValue2, ((Float) animatedValue4).floatValue());
                oooO00o.invoke();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public static final Matrix OooO0O0(Matrix matrix) {
        OooOOO0.OooO0oO(matrix, "<this>");
        float[] fArr = f111174OooO00o;
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix();
        matrix2.setValues(fArr);
        return matrix2;
    }
}
