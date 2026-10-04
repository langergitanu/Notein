package com.google.firebase.inappmessaging.display.internal;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class FiamAnimator {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.FiamAnimator$3 */
    public static /* synthetic */ class C171303 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$inappmessaging$display$internal$FiamAnimator$Position */
        static final /* synthetic */ int[] f51820x1fbc48f9;

        static {
            int[] iArr = new int[Position.values().length];
            f51820x1fbc48f9 = iArr;
            try {
                iArr[Position.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51820x1fbc48f9[Position.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51820x1fbc48f9[Position.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51820x1fbc48f9[Position.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface AnimationCompleteListener {
        void onComplete();
    }

    public enum Position {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Point getPoint(Position position, View view) {
            view.measure(-2, -2);
            int i = C171303.f51820x1fbc48f9[position.ordinal()];
            if (i == 1) {
                return new Point(view.getMeasuredWidth() * (-1), 0);
            }
            if (i == 2) {
                return new Point(view.getMeasuredWidth(), 0);
            }
            if (i != 3 && i == 4) {
                return new Point(0, view.getMeasuredHeight());
            }
            return new Point(0, view.getMeasuredHeight() * (-1));
        }
    }

    public void slideIntoView(final Application application, final View view, Position position) {
        view.setAlpha(0.0f);
        Point point = Position.getPoint(position, view);
        view.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.FiamAnimator.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(application.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
            }
        });
    }

    public void slideOutOfView(Application application, View view, Position position, final AnimationCompleteListener animationCompleteListener) {
        Point point = Position.getPoint(position, view);
        view.animate().translationX(point.x).translationY(point.y).setDuration(application.getResources().getInteger(R.integer.config_longAnimTime)).setListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.FiamAnimator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                animationCompleteListener.onComplete();
            }
        });
    }
}
