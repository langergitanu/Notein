package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.fragment.app.C21885OooO0Oo;
import androidx.fragment.app.C21898OooOo0O;
import androidx.fragment.app.Fragment;
import com.aspose.words.ControlChar;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21885OooO0Oo extends AbstractC21925OoooOoO {

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO00o */
    public static final class OooO00o extends AbstractC21925OoooOoO.OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f64914OooO0OO;

        /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC19016OooO00o implements Animation.AnimationListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ AbstractC21925OoooOoO.OooO0OO f64915OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f64916OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ View f64917OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f64918OooO0Oo;

            public AnimationAnimationListenerC19016OooO00o(AbstractC21925OoooOoO.OooO0OO oooO0OO, ViewGroup viewGroup, View view, OooO00o oooO00o) {
                this.f64915OooO00o = oooO0OO;
                this.f64916OooO0O0 = viewGroup;
                this.f64917OooO0OO = view;
                this.f64918OooO0Oo = oooO00o;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(animation, "animation");
                final View view = this.f64917OooO0OO;
                final OooO00o oooO00o = this.f64918OooO0Oo;
                final ViewGroup viewGroup = this.f64916OooO0O0;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup container = viewGroup;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "$container");
                        C21885OooO0Oo.OooO00o this$0 = oooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        container.endViewTransition(view);
                        this$0.f64914OooO0OO.f64930OooO00o.OooO0OO(this$0);
                    }
                });
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f64915OooO00o + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(animation, "animation");
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f64915OooO00o + " has reached onAnimationStart.");
                }
            }
        }

        public OooO00o(OooO0O0 oooO0O0) {
            this.f64914OooO0OO = oooO0O0;
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0O0(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            OooO0O0 oooO0O0 = this.f64914OooO0OO;
            AbstractC21925OoooOoO.OooO0OO oooO0OO = oooO0O0.f64930OooO00o;
            View view = oooO0OO.f65089OooO0OO.mView;
            view.clearAnimation();
            container.endViewTransition(view);
            oooO0O0.f64930OooO00o.OooO0OO(this);
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Animation from operation " + oooO0OO + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0OO(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            OooO0O0 oooO0O0 = this.f64914OooO0OO;
            boolean zOooO00o = oooO0O0.OooO00o();
            AbstractC21925OoooOoO.OooO0OO oooO0OO = oooO0O0.f64930OooO00o;
            if (zOooO00o) {
                oooO0OO.OooO0OO(this);
                return;
            }
            Context context = container.getContext();
            View view = oooO0OO.f65089OooO0OO.mView;
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
            C21898OooOo0O.OooO00o oooO00oOooO0O0 = oooO0O0.OooO0O0(context);
            if (oooO00oOooO0O0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = oooO00oOooO0O0.f64983OooO00o;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (oooO0OO.f65087OooO00o != AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65102OooOo0o) {
                view.startAnimation(animation);
                oooO0OO.OooO0OO(this);
                return;
            }
            container.startViewTransition(view);
            C21898OooOo0O.OooO0O0 oooO0O02 = new C21898OooOo0O.OooO0O0(animation, container, view);
            oooO0O02.setAnimationListener(new AnimationAnimationListenerC19016OooO00o(oooO0OO, container, view, this));
            view.startAnimation(oooO0O02);
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Animation from operation " + oooO0OO + " has started.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f64919OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f64920OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public C21898OooOo0O.OooO00o f64921OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC21925OoooOoO.OooO0OO operation, boolean z) {
            super(operation);
            kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "operation");
            this.f64919OooO0O0 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C21898OooOo0O.OooO00o OooO0O0(Context context) {
            Animation animationLoadAnimation;
            C21898OooOo0O.OooO00o oooO00o;
            Animator animatorLoadAnimator;
            if (this.f64920OooO0OO) {
                return this.f64921OooO0Oo;
            }
            AbstractC21925OoooOoO.OooO0OO oooO0OO = this.f64930OooO00o;
            Fragment fragment = oooO0OO.f65089OooO0OO;
            boolean z = oooO0OO.f65087OooO00o == AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.f64919OooO0O0 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            C21898OooOo0O.OooO00o oooO00o2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
                if (animationOnCreateAnimation != null) {
                    oooO00o2 = new C21898OooOo0O.OooO00o(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                    if (animatorOnCreateAnimator != null) {
                        oooO00o2 = new C21898OooOo0O.OooO00o(animatorOnCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? C21898OooOo0O.OooO00o(context, android.R.attr.activityOpenEnterAnimation) : C21898OooOo0O.OooO00o(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? C21898OooOo0O.OooO00o(context, android.R.attr.activityCloseEnterAnimation) : C21898OooOo0O.OooO00o(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (zEquals) {
                                try {
                                    animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                        if (animatorLoadAnimator != null) {
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            oooO00o2 = new C21898OooOo0O.OooO00o(animationLoadAnimation2);
                                        }
                                    }
                                }
                                if (animationLoadAnimation != null) {
                                    oooO00o = new C21898OooOo0O.OooO00o(animationLoadAnimation);
                                    oooO00o2 = oooO00o;
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    oooO00o = new C21898OooOo0O.OooO00o(animatorLoadAnimator);
                                    oooO00o2 = oooO00o;
                                }
                            }
                        }
                    }
                }
            }
            this.f64921OooO0Oo = oooO00o2;
            this.f64920OooO0OO = true;
            return oooO00o2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0OO */
    public static final class OooO0OO extends AbstractC21925OoooOoO.OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f64922OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public AnimatorSet f64923OooO0Oo;

        /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0OO$OooO00o */
        public static final class OooO00o extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f64924OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ View f64925OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ boolean f64926OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ AbstractC21925OoooOoO.OooO0OO f64927OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f64928OooO0o0;

            public OooO00o(ViewGroup viewGroup, View view, boolean z, AbstractC21925OoooOoO.OooO0OO oooO0OO, OooO0OO oooO0OO2) {
                this.f64924OooO00o = viewGroup;
                this.f64925OooO0O0 = view;
                this.f64926OooO0OO = z;
                this.f64927OooO0Oo = oooO0OO;
                this.f64928OooO0o0 = oooO0OO2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator anim) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(anim, "anim");
                ViewGroup viewGroup = this.f64924OooO00o;
                View viewToAnimate = this.f64925OooO0O0;
                viewGroup.endViewTransition(viewToAnimate);
                boolean z = this.f64926OooO0OO;
                AbstractC21925OoooOoO.OooO0OO oooO0OO = this.f64927OooO0Oo;
                if (z) {
                    AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O0 = oooO0OO.f65087OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewToAnimate, "viewToAnimate");
                    oooO0O0.OooO00o(viewToAnimate, viewGroup);
                }
                OooO0OO oooO0OO2 = this.f64928OooO0o0;
                oooO0OO2.f64922OooO0OO.f64930OooO00o.OooO0OO(oooO0OO2);
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Animator from operation " + oooO0OO + " has ended.");
                }
            }
        }

        public OooO0OO(OooO0O0 oooO0O0) {
            this.f64922OooO0OO = oooO0O0;
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0O0(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            AnimatorSet animatorSet = this.f64923OooO0Oo;
            OooO0O0 oooO0O0 = this.f64922OooO0OO;
            if (animatorSet == null) {
                oooO0O0.f64930OooO00o.OooO0OO(this);
                return;
            }
            AbstractC21925OoooOoO.OooO0OO oooO0OO = oooO0O0.f64930OooO00o;
            if (oooO0OO.f65093OooO0oO) {
                C21886OooO0o0.f64931OooO00o.OooO00o(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.Oooo0o(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(oooO0OO);
                sb.append(" has been canceled");
                sb.append(oooO0OO.f65093OooO0oO ? " with seeking." : ".");
                sb.append(ControlChar.SPACE_CHAR);
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0OO(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            AbstractC21925OoooOoO.OooO0OO oooO0OO = this.f64922OooO0OO.f64930OooO00o;
            AnimatorSet animatorSet = this.f64923OooO0Oo;
            if (animatorSet == null) {
                oooO0OO.OooO0OO(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Animator from operation " + oooO0OO + " has started.");
            }
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0Oo(OooO0Oo.OooO0OO oooO0OO, ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            AbstractC21925OoooOoO.OooO0OO oooO0OO2 = this.f64922OooO0OO.f64930OooO00o;
            AnimatorSet animatorSet = this.f64923OooO0Oo;
            if (animatorSet == null) {
                oooO0OO2.OooO0OO(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !oooO0OO2.f65089OooO0OO.mTransitioning) {
                return;
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + oooO0OO2);
            }
            long jOooO00o = C19017OooO0Oo.f64929OooO00o.OooO00o(animatorSet);
            long j = (long) (oooO0OO.f58182OooO0OO * jOooO00o);
            if (j == 0) {
                j = 1;
            }
            if (j == jOooO00o) {
                j = jOooO00o - 1;
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + oooO0OO2);
            }
            C21886OooO0o0.f64931OooO00o.OooO0O0(animatorSet, j);
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0o0(ViewGroup container) {
            OooO0OO oooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            OooO0O0 oooO0O0 = this.f64922OooO0OO;
            if (oooO0O0.OooO00o()) {
                return;
            }
            Context context = container.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
            C21898OooOo0O.OooO00o oooO00oOooO0O0 = oooO0O0.OooO0O0(context);
            this.f64923OooO0Oo = oooO00oOooO0O0 != null ? oooO00oOooO0O0.f64984OooO0O0 : null;
            AbstractC21925OoooOoO.OooO0OO oooO0OO2 = oooO0O0.f64930OooO00o;
            Fragment fragment = oooO0OO2.f65089OooO0OO;
            boolean z = oooO0OO2.f65087OooO00o == AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65104OooOoO0;
            View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f64923OooO0Oo;
            if (animatorSet != null) {
                oooO0OO = this;
                animatorSet.addListener(new OooO00o(container, view, z, oooO0OO2, oooO0OO));
            } else {
                oooO0OO = this;
            }
            AnimatorSet animatorSet2 = oooO0OO.f64923OooO0Oo;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static final class C19017OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19017OooO0Oo f64929OooO00o = new C19017OooO0Oo();

        public final long OooO00o(AnimatorSet animatorSet) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0o */
    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC21925OoooOoO.OooO0OO f64930OooO00o;

        public OooO0o(AbstractC21925OoooOoO.OooO0OO operation) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "operation");
            this.f64930OooO00o = operation;
        }

        public final boolean OooO00o() {
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O0;
            AbstractC21925OoooOoO.OooO0OO oooO0OO = this.f64930OooO00o;
            View view = oooO0OO.f65089OooO0OO.mView;
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O02 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo;
            if (view != null) {
                float alpha = view.getAlpha();
                oooO0O0 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65103OooOoO;
                if (alpha != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        oooO0O0 = oooO0O02;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(visibility, "Unknown visibility "));
                        }
                        oooO0O0 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65104OooOoO0;
                    }
                }
            } else {
                oooO0O0 = null;
            }
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O03 = oooO0OO.f65087OooO00o;
            if (oooO0O0 != oooO0O03) {
                return (oooO0O0 == oooO0O02 || oooO0O03 == oooO0O02) ? false : true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public static final class C21886OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C21886OooO0o0 f64931OooO00o = new C21886OooO0o0();

        public final void OooO00o(AnimatorSet animatorSet) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void OooO0O0(AnimatorSet animatorSet, long j) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    public static final class C21887OooO0oO extends AbstractC21925OoooOoO.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final ArrayList<View> f64932OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f64933OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AbstractC21925OoooOoO.OooO0OO f64934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AbstractC21921OoooOO0 f64935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AbstractC21925OoooOoO.OooO0OO f64936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Object f64937OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final ArrayList<View> f64938OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooOo.OooO00o<String, String> f64939OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ArrayList<String> f64940OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final ArrayList<String> f64941OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final OooOo.OooO00o<String, View> f64942OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final OooOo.OooO00o<String, View> f64943OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final boolean f64944OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final CancellationSignal f64945OooOOOo = new CancellationSignal();

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public Object f64946OooOOo0;

        /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0oO$OooO00o */
        public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f64947OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C21887OooO0oO f64948OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Object f64949OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ViewGroup viewGroup, C21887OooO0oO c21887OooO0oO, Object obj) {
                super(0);
                this.f64948OooOo0o = c21887OooO0oO;
                this.f64947OooOo = viewGroup;
                this.f64949OooOoO0 = obj;
            }

            @Override // oO0O000o.OooO00o
            public final C32460OooOooO invoke() {
                this.f64948OooOo0o.f64935OooO0o.OooO0o0(this.f64947OooOo, this.f64949OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0oO$OooO0O0 */
        public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f64950OooOo;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> f64952OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Object f64953OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ViewGroup viewGroup, Object obj, C24034Oooo00O<oO0O000o.OooO00o<C32460OooOooO>> c24034Oooo00O) {
                super(0);
                this.f64950OooOo = viewGroup;
                this.f64953OooOoO0 = obj;
                this.f64952OooOoO = c24034Oooo00O;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.fragment.app.OooOOO0] */
            @Override // oO0O000o.OooO00o
            public final C32460OooOooO invoke() {
                C21887OooO0oO c21887OooO0oO = C21887OooO0oO.this;
                AbstractC21921OoooOO0 abstractC21921OoooOO0 = c21887OooO0oO.f64935OooO0o;
                ViewGroup viewGroup = this.f64950OooOo;
                Object obj = this.f64953OooOoO0;
                Object objOooO = abstractC21921OoooOO0.OooO(viewGroup, obj);
                c21887OooO0oO.f64946OooOOo0 = objOooO;
                if (objOooO == null) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + FilenameUtils.EXTENSION_SEPARATOR).toString());
                }
                this.f64952OooOoO.f80942OooOo0o = new OooOOO0(viewGroup, c21887OooO0oO, obj);
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + c21887OooO0oO.f64934OooO0Oo + " to " + c21887OooO0oO.f64936OooO0o0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C21887OooO0oO(ArrayList arrayList, AbstractC21925OoooOoO.OooO0OO oooO0OO, AbstractC21925OoooOoO.OooO0OO oooO0OO2, AbstractC21921OoooOO0 abstractC21921OoooOO0, Object obj, ArrayList arrayList2, ArrayList arrayList3, OooOo.OooO00o oooO00o, ArrayList arrayList4, ArrayList arrayList5, OooOo.OooO00o oooO00o2, OooOo.OooO00o oooO00o3, boolean z) {
            this.f64933OooO0OO = arrayList;
            this.f64934OooO0Oo = oooO0OO;
            this.f64936OooO0o0 = oooO0OO2;
            this.f64935OooO0o = abstractC21921OoooOO0;
            this.f64937OooO0oO = obj;
            this.f64938OooO0oo = arrayList2;
            this.f64932OooO = arrayList3;
            this.f64939OooOO0 = oooO00o;
            this.f64940OooOO0O = arrayList4;
            this.f64941OooOO0o = arrayList5;
            this.f64943OooOOO0 = oooO00o2;
            this.f64942OooOOO = oooO00o3;
            this.f64944OooOOOO = z;
        }

        public static void OooO0o(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooO0o(childAt, arrayList);
                }
            }
        }

        public final void OooO(ArrayList<View> arrayList, ViewGroup viewGroup, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
            C21919OoooO00.OooO0OO(4, arrayList);
            AbstractC21921OoooOO0 abstractC21921OoooOO0 = this.f64935OooO0o;
            abstractC21921OoooOO0.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.f64932OooO;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList3.get(i);
                arrayList2.add(ViewCompat.getTransitionName(view));
                ViewCompat.setTransitionName(view, null);
            }
            boolean zOooo0o = FragmentManager.Oooo0o(2);
            ArrayList<View> arrayList4 = this.f64938OooO0oo;
            if (zOooo0o) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (View sharedElementFirstOutViews : arrayList4) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view2 = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (View sharedElementLastInViews : arrayList3) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(sharedElementLastInViews, "sharedElementLastInViews");
                    View view3 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view3 + " Name: " + ViewCompat.getTransitionName(view3));
                }
            }
            oooO00o.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                View view4 = arrayList4.get(i2);
                String transitionName = ViewCompat.getTransitionName(view4);
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    ViewCompat.setTransitionName(view4, null);
                    String str = this.f64939OooOO0.get(transitionName);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i3))) {
                            ViewCompat.setTransitionName(arrayList3.get(i3), transitionName);
                            break;
                        }
                        i3++;
                    }
                }
            }
            OneShotPreDrawListener.add(viewGroup, new RunnableC21916OoooO(size2, arrayList3, arrayList2, arrayList4, arrayList5));
            C21919OoooO00.OooO0OO(0, arrayList);
            abstractC21921OoooOO0.OooOo(this.f64937OooO0oO, arrayList4, arrayList3);
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final boolean OooO00o() {
            Object obj;
            AbstractC21921OoooOO0 abstractC21921OoooOO0 = this.f64935OooO0o;
            if (!abstractC21921OoooOO0.OooOO0o()) {
                return false;
            }
            ArrayList<C21888OooO0oo> arrayList = this.f64933OooO0OO;
            if (arrayList == null || !arrayList.isEmpty()) {
                for (C21888OooO0oo c21888OooO0oo : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = c21888OooO0oo.f64954OooO0O0) == null || !abstractC21921OoooOO0.OooOOO0(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.f64937OooO0oO;
            return obj2 == null || abstractC21921OoooOO0.OooOOO0(obj2);
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0O0(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            this.f64945OooOOOo.cancel();
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0OO(ViewGroup container) {
            Object obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList<C21888OooO0oo> arrayList = this.f64933OooO0OO;
            if (!zIsLaidOut) {
                for (C21888OooO0oo c21888OooO0oo : arrayList) {
                    AbstractC21925OoooOoO.OooO0OO oooO0OO = c21888OooO0oo.f64930OooO00o;
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + oooO0OO);
                    }
                    c21888OooO0oo.f64930OooO00o.OooO0OO(this);
                }
                return;
            }
            Object obj2 = this.f64946OooOOo0;
            AbstractC21921OoooOO0 abstractC21921OoooOO0 = this.f64935OooO0o;
            AbstractC21925OoooOoO.OooO0OO oooO0OO2 = this.f64936OooO0o0;
            AbstractC21925OoooOoO.OooO0OO oooO0OO3 = this.f64934OooO0Oo;
            if (obj2 != null) {
                abstractC21921OoooOO0.OooO0OO(obj2);
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + oooO0OO3 + " to " + oooO0OO2);
                    return;
                }
                return;
            }
            C32443OooOOO<ArrayList<View>, Object> c32443OooOOOOooO0oO = OooO0oO(container, oooO0OO2, oooO0OO3);
            ArrayList<View> arrayList2 = c32443OooOOOOooO0oO.f116638OooOo0o;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C21888OooO0oo) it.next()).f64930OooO00o);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                obj = c32443OooOOOOooO0oO.f116637OooOo;
                if (!zHasNext) {
                    break;
                }
                AbstractC21925OoooOoO.OooO0OO oooO0OO4 = (AbstractC21925OoooOoO.OooO0OO) it2.next();
                abstractC21921OoooOO0.OooOo0(oooO0OO4.f65089OooO0OO, obj, this.f64945OooOOOo, new RunnableC21890OooO0oO(0, oooO0OO4, this));
            }
            OooO(arrayList2, container, new OooO00o(container, this, obj));
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + oooO0OO3 + " to " + oooO0OO2);
            }
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0Oo(OooO0Oo.OooO0OO oooO0OO, ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            Object obj = this.f64946OooOOo0;
            if (obj != null) {
                this.f64935OooO0o.OooOOo(obj, oooO0OO.f58182OooO0OO);
            }
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO00o
        public final void OooO0o0(ViewGroup container) {
            Object obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList arrayList = this.f64933OooO0OO;
            if (!zIsLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC21925OoooOoO.OooO0OO oooO0OO = ((C21888OooO0oo) it.next()).f64930OooO00o;
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + oooO0OO);
                    }
                }
                return;
            }
            boolean zOooO0oo = OooO0oo();
            AbstractC21925OoooOoO.OooO0OO oooO0OO2 = this.f64936OooO0o0;
            AbstractC21925OoooOoO.OooO0OO oooO0OO3 = this.f64934OooO0Oo;
            if (zOooO0oo && (obj = this.f64937OooO0oO) != null && !OooO00o()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + oooO0OO3 + " and " + oooO0OO2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (!OooO00o() || !OooO0oo()) {
                return;
            }
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            C32443OooOOO<ArrayList<View>, Object> c32443OooOOOOooO0oO = OooO0oO(container, oooO0OO2, oooO0OO3);
            ArrayList<View> arrayList2 = c32443OooOOOOooO0oO.f116638OooOo0o;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C21888OooO0oo) it2.next()).f64930OooO00o);
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                Object obj2 = c32443OooOOOOooO0oO.f116637OooOo;
                if (!zHasNext) {
                    OooO(arrayList2, container, new OooO0O0(container, obj2, c24034Oooo00O));
                    return;
                }
                final AbstractC21925OoooOoO.OooO0OO oooO0OO4 = (AbstractC21925OoooOoO.OooO0OO) it3.next();
                RunnableC21889OooO0o0 runnableC21889OooO0o0 = new RunnableC21889OooO0o0(c24034Oooo00O, 0);
                Fragment fragment = oooO0OO4.f65089OooO0OO;
                this.f64935OooO0o.OooOo0O(obj2, this.f64945OooOOOo, runnableC21889OooO0o0, new Runnable() { // from class: androidx.fragment.app.OooO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC21925OoooOoO.OooO0OO operation = oooO0OO4;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "$operation");
                        C21885OooO0Oo.C21887OooO0oO this$0 = this;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                        }
                        operation.OooO0OO(this$0);
                    }
                });
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C32443OooOOO<ArrayList<View>, Object> OooO0oO(ViewGroup viewGroup, final AbstractC21925OoooOoO.OooO0OO oooO0OO, final AbstractC21925OoooOoO.OooO0OO oooO0OO2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            final AbstractC21921OoooOO0 abstractC21921OoooOO0;
            Object obj2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Iterator it;
            final C21887OooO0oO c21887OooO0oO = this;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            ArrayList arrayList5 = c21887OooO0oO.f64933OooO0OO;
            Iterator it2 = arrayList5.iterator();
            View view2 = null;
            boolean z = false;
            while (true) {
                boolean zHasNext = it2.hasNext();
                arrayList = c21887OooO0oO.f64932OooO;
                arrayList2 = c21887OooO0oO.f64938OooO0oo;
                obj = c21887OooO0oO.f64937OooO0oO;
                abstractC21921OoooOO0 = c21887OooO0oO.f64935OooO0o;
                if (!zHasNext) {
                    break;
                }
                if (((C21888OooO0oo) it2.next()).f64956OooO0Oo == null || oooO0OO2 == null || oooO0OO == null || c21887OooO0oO.f64939OooOO0.isEmpty() || obj == null) {
                    arrayList4 = arrayList5;
                    it = it2;
                    z = z;
                } else {
                    OooOo.OooO00o<String, View> oooO00o = c21887OooO0oO.f64943OooOOO0;
                    arrayList4 = arrayList5;
                    it = it2;
                    boolean z2 = z;
                    z = true;
                    C21919OoooO00.OooO00o(oooO0OO.f65089OooO0OO, oooO0OO2.f65089OooO0OO, c21887OooO0oO.f64944OooOOOO, oooO00o, true);
                    OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO0oo
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21885OooO0Oo.C21887OooO0oO this$0 = c21887OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                            C21919OoooO00.OooO00o(oooO0OO.f65089OooO0OO, oooO0OO2.f65089OooO0OO, this$0.f64944OooOOOO, this$0.f64942OooOOO, false);
                        }
                    });
                    arrayList2.addAll(oooO00o.values());
                    ArrayList<String> arrayList6 = c21887OooO0oO.f64941OooOO0o;
                    if (!arrayList6.isEmpty()) {
                        String str = arrayList6.get(0);
                        kotlin.jvm.internal.OooOOO0.OooO0o(str, "exitingNames[0]");
                        View view3 = oooO00o.get(str);
                        abstractC21921OoooOO0.OooOo00(obj, view3);
                        view2 = view3;
                    }
                    OooOo.OooO00o<String, View> oooO00o2 = c21887OooO0oO.f64942OooOOO;
                    arrayList.addAll(oooO00o2.values());
                    ArrayList<String> arrayList7 = c21887OooO0oO.f64940OooOO0O;
                    if (!arrayList7.isEmpty()) {
                        String str2 = arrayList7.get(0);
                        kotlin.jvm.internal.OooOOO0.OooO0o(str2, "enteringNames[0]");
                        final View view4 = oooO00o2.get(str2);
                        if (view4 != null) {
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC21921OoooOO0 impl = abstractC21921OoooOO0;
                                    kotlin.jvm.internal.OooOOO0.OooO0oO(impl, "$impl");
                                    AbstractC21921OoooOO0.OooOO0(rect, view4);
                                }
                            });
                        } else {
                            z = z2;
                        }
                        abstractC21921OoooOO0.OooOo0o(obj, view, arrayList2);
                        AbstractC21921OoooOO0 abstractC21921OoooOO02 = c21887OooO0oO.f64935OooO0o;
                        Object obj3 = c21887OooO0oO.f64937OooO0oO;
                        abstractC21921OoooOO02.OooOOo0(obj3, null, null, obj3, arrayList);
                    }
                }
                arrayList5 = arrayList4;
                it2 = it;
            }
            ArrayList arrayList8 = arrayList5;
            boolean z3 = z;
            ArrayList arrayList9 = new ArrayList();
            Iterator it3 = arrayList8.iterator();
            Object objOooOOOO = null;
            Object objOooOOOO2 = null;
            while (it3.hasNext()) {
                C21888OooO0oo c21888OooO0oo = (C21888OooO0oo) it3.next();
                Iterator it4 = it3;
                AbstractC21925OoooOoO.OooO0OO oooO0OO3 = c21888OooO0oo.f64930OooO00o;
                ArrayList<View> arrayList10 = arrayList2;
                Object objOooO0oo = abstractC21921OoooOO0.OooO0oo(c21888OooO0oo.f64954OooO0O0);
                if (objOooO0oo != null) {
                    Object obj4 = obj;
                    ArrayList arrayList11 = new ArrayList();
                    Object obj5 = objOooOOOO2;
                    View view5 = oooO0OO3.f65089OooO0OO.mView;
                    Object obj6 = objOooOOOO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(view5, "operation.fragment.mView");
                    OooO0o(view5, arrayList11);
                    if (obj4 != null && (oooO0OO3 == oooO0OO2 || oooO0OO3 == oooO0OO)) {
                        if (oooO0OO3 == oooO0OO2) {
                            arrayList11.removeAll(oOo000Oo.OooOo.o0OO00O(arrayList10));
                        } else {
                            arrayList11.removeAll(oOo000Oo.OooOo.o0OO00O(arrayList));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        abstractC21921OoooOO0.OooO00o(objOooO0oo, view);
                        obj2 = objOooO0oo;
                        arrayList3 = arrayList11;
                    } else {
                        abstractC21921OoooOO0.OooO0O0(arrayList11, objOooO0oo);
                        c21887OooO0oO.f64935OooO0o.OooOOo0(objOooO0oo, objOooO0oo, arrayList11, null, null);
                        obj2 = objOooO0oo;
                        arrayList3 = arrayList11;
                        if (oooO0OO3.f65087OooO00o == AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65104OooOoO0) {
                            oooO0OO3.f65086OooO = false;
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList3);
                            Fragment fragment = oooO0OO3.f65089OooO0OO;
                            arrayList12.remove(fragment.mView);
                            abstractC21921OoooOO0.OooOOOo(obj2, fragment.mView, arrayList12);
                            OneShotPreDrawListener.add(viewGroup, new OooOO0(arrayList3, 0));
                        }
                    }
                    if (oooO0OO3.f65087OooO00o == AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo) {
                        arrayList9.addAll(arrayList3);
                        if (z3) {
                            abstractC21921OoooOO0.OooOOoo(obj2, rect);
                        }
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList3) {
                                kotlin.jvm.internal.OooOOO0.OooO0o(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        abstractC21921OoooOO0.OooOo00(obj2, view2);
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList3) {
                                kotlin.jvm.internal.OooOOO0.OooO0o(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (c21888OooO0oo.f64955OooO0OO) {
                        objOooOOOO = abstractC21921OoooOO0.OooOOOO(obj6, obj2);
                        c21887OooO0oO = this;
                        it3 = it4;
                        arrayList2 = arrayList10;
                        obj = obj4;
                        objOooOOOO2 = obj5;
                    } else {
                        objOooOOOO2 = abstractC21921OoooOO0.OooOOOO(obj5, obj2);
                        objOooOOOO = obj6;
                        it3 = it4;
                        arrayList2 = arrayList10;
                        obj = obj4;
                    }
                } else {
                    it3 = it4;
                    arrayList2 = arrayList10;
                }
                c21887OooO0oO = this;
            }
            Object objOooOOO = abstractC21921OoooOO0.OooOOO(objOooOOOO, objOooOOOO2, obj);
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objOooOOO);
            }
            return new C32443OooOOO<>(arrayList9, objOooOOO);
        }

        public final boolean OooO0oo() {
            ArrayList arrayList = this.f64933OooO0OO;
            if (arrayList != null && arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C21888OooO0oo) it.next()).f64930OooO00o.f65089OooO0OO.mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0Oo$OooO0oo, reason: case insensitive filesystem */
    public static final class C21888OooO0oo extends OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f64954OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f64955OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f64956OooO0Oo;

        public C21888OooO0oo(AbstractC21925OoooOoO.OooO0OO oooO0OO, boolean z, boolean z2) {
            super(oooO0OO);
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O0 = oooO0OO.f65087OooO00o;
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O02 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo;
            Fragment fragment = oooO0OO.f65089OooO0OO;
            this.f64954OooO0O0 = oooO0O0 == oooO0O02 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f64955OooO0OO = oooO0OO.f65087OooO00o == oooO0O02 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f64956OooO0Oo = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final AbstractC21921OoooOO0 OooO0O0() {
            Object obj = this.f64954OooO0O0;
            AbstractC21921OoooOO0 abstractC21921OoooOO0OooO0OO = OooO0OO(obj);
            Object obj2 = this.f64956OooO0Oo;
            AbstractC21921OoooOO0 abstractC21921OoooOO0OooO0OO2 = OooO0OO(obj2);
            if (abstractC21921OoooOO0OooO0OO == null || abstractC21921OoooOO0OooO0OO2 == null || abstractC21921OoooOO0OooO0OO == abstractC21921OoooOO0OooO0OO2) {
                return abstractC21921OoooOO0OooO0OO == null ? abstractC21921OoooOO0OooO0OO2 : abstractC21921OoooOO0OooO0OO;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f64930OooO00o.f65089OooO0OO + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final AbstractC21921OoooOO0 OooO0OO(Object obj) {
            if (obj == null) {
                return null;
            }
            C21917OoooO0 c21917OoooO0 = C21919OoooO00.f65064OooO00o;
            if (c21917OoooO0 != null && (obj instanceof Transition)) {
                return c21917OoooO0;
            }
            AbstractC21921OoooOO0 abstractC21921OoooOO0 = C21919OoooO00.f65065OooO0O0;
            if (abstractC21921OoooOO0 != null && abstractC21921OoooOO0.OooO0oO(obj)) {
                return abstractC21921OoooOO0;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f64930OooO00o.f65089OooO0OO + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void OooOOO(OooOo.OooO00o oooO00o, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            oooO00o.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooOOO(oooO00o, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f4 A[LOOP:20: B:180:0x04ee->B:182:0x04f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // androidx.fragment.app.AbstractC21925OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(ArrayList arrayList, boolean z) {
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O0;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O02;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O03;
        float f;
        Object next;
        Object objPrevious;
        Object obj;
        ArrayList<OooO0O0> arrayList2;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O04;
        String str;
        Iterator it;
        ArrayList arrayList3;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O05;
        ArrayList arrayList4;
        ArrayList arrayList5;
        AbstractC21921OoooOO0 abstractC21921OoooOO0;
        ArrayList<String> sharedElementTargetNames;
        String str2;
        Object obj2;
        String str3;
        String strOooO0O0;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O06;
        AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O07;
        boolean z2 = z;
        int i = 0;
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            oooO0O0 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65104OooOoO0;
            oooO0O02 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo;
            oooO0O03 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65103OooOoO;
            if (!zHasNext) {
                f = 0.0f;
                next = null;
                break;
            }
            next = it2.next();
            AbstractC21925OoooOoO.OooO0OO oooO0OO = (AbstractC21925OoooOoO.OooO0OO) next;
            f = 0.0f;
            View view = oooO0OO.f65089OooO0OO.mView;
            kotlin.jvm.internal.OooOOO0.OooO0o(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    oooO0O07 = oooO0O02;
                } else if (visibility == 4) {
                    oooO0O07 = oooO0O03;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(visibility, "Unknown visibility "));
                    }
                    oooO0O07 = oooO0O0;
                }
                if (oooO0O07 == oooO0O02 && oooO0OO.f65087OooO00o != oooO0O02) {
                    break;
                }
            }
        }
        AbstractC21925OoooOoO.OooO0OO oooO0OO2 = (AbstractC21925OoooOoO.OooO0OO) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            AbstractC21925OoooOoO.OooO0OO oooO0OO3 = (AbstractC21925OoooOoO.OooO0OO) objPrevious;
            View view2 = oooO0OO3.f65089OooO0OO.mView;
            kotlin.jvm.internal.OooOOO0.OooO0o(view2, "operation.fragment.mView");
            if (view2.getAlpha() != f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    oooO0O06 = oooO0O02;
                } else if (visibility2 == 4) {
                    oooO0O06 = oooO0O03;
                } else {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(visibility2, "Unknown visibility "));
                    }
                    oooO0O06 = oooO0O0;
                }
                if (oooO0O06 != oooO0O02 && oooO0OO3.f65087OooO00o == oooO0O02) {
                    break;
                }
            }
        }
        AbstractC21925OoooOoO.OooO0OO oooO0OO4 = (AbstractC21925OoooOoO.OooO0OO) objPrevious;
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Executing operations from " + oooO0OO2 + " to " + oooO0OO4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Fragment fragment = ((AbstractC21925OoooOoO.OooO0OO) oOo000Oo.OooOo.OoooOOo(arrayList)).f65089OooO0OO;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Fragment.OooOO0O oooOO0O = ((AbstractC21925OoooOoO.OooO0OO) it3.next()).f65089OooO0OO.mAnimationInfo;
            Fragment.OooOO0O oooOO0O2 = fragment.mAnimationInfo;
            oooOO0O.f64773OooO0O0 = oooOO0O2.f64773OooO0O0;
            oooOO0O.f64774OooO0OO = oooOO0O2.f64774OooO0OO;
            oooOO0O.f64775OooO0Oo = oooOO0O2.f64775OooO0Oo;
            oooOO0O.f64777OooO0o0 = oooOO0O2.f64777OooO0o0;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            AbstractC21925OoooOoO.OooO0OO oooO0OO5 = (AbstractC21925OoooOoO.OooO0OO) it4.next();
            arrayList6.add(new OooO0O0(oooO0OO5, z2));
            arrayList7.add(new C21888OooO0oo(oooO0OO5, z2, !z2 ? oooO0OO5 != oooO0OO4 : oooO0OO5 != oooO0OO2));
            oooO0OO5.f65090OooO0Oo.add(new androidx.fragment.app.OooO0O0(i, this, oooO0OO5));
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : arrayList7) {
            if (!((C21888OooO0oo) obj3).OooO00o()) {
                arrayList8.add(obj3);
            }
        }
        ArrayList<C21888OooO0oo> arrayList9 = new ArrayList();
        for (Object obj4 : arrayList8) {
            if (((C21888OooO0oo) obj4).OooO0O0() != null) {
                arrayList9.add(obj4);
            }
        }
        AbstractC21921OoooOO0 abstractC21921OoooOO02 = null;
        for (C21888OooO0oo c21888OooO0oo : arrayList9) {
            AbstractC21921OoooOO0 abstractC21921OoooOO0OooO0O0 = c21888OooO0oo.OooO0O0();
            if (abstractC21921OoooOO02 != null && abstractC21921OoooOO0OooO0O0 != abstractC21921OoooOO02) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(c21888OooO0oo.f64930OooO00o.f65089OooO0OO);
                sb.append(" returned Transition ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO0o.OooO0O0(sb, c21888OooO0oo.f64954OooO0O0, " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC21921OoooOO02 = abstractC21921OoooOO0OooO0O0;
        }
        if (abstractC21921OoooOO02 == null) {
            arrayList2 = arrayList6;
            str = "FragmentManager";
            oooO0O04 = oooO0O0;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList arrayList13 = new ArrayList();
            OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
            OooOo.OooO00o oooO00o3 = new OooOo.OooO00o();
            Iterator it5 = arrayList9.iterator();
            loop10: while (true) {
                obj = null;
                while (it5.hasNext()) {
                    arrayList3 = arrayList6;
                    Object obj5 = ((C21888OooO0oo) it5.next()).f64956OooO0Oo;
                    if (obj5 == null || oooO0OO2 == null || oooO0OO4 == null) {
                        oooO0O05 = oooO0O0;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList11;
                        abstractC21921OoooOO02 = abstractC21921OoooOO02;
                        z2 = z;
                    } else {
                        Object objOooOoO0 = abstractC21921OoooOO02.OooOoO0(abstractC21921OoooOO02.OooO0oo(obj5));
                        Fragment fragment2 = oooO0OO4.f65089OooO0OO;
                        arrayList13 = fragment2.getSharedElementSourceNames();
                        kotlin.jvm.internal.OooOOO0.OooO0o(arrayList13, "lastIn.fragment.sharedElementSourceNames");
                        Fragment fragment3 = oooO0OO2.f65089OooO0OO;
                        oooO0O05 = oooO0O0;
                        ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        abstractC21921OoooOO0 = abstractC21921OoooOO02;
                        kotlin.jvm.internal.OooOOO0.OooO0o(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        arrayList4 = arrayList10;
                        kotlin.jvm.internal.OooOOO0.OooO0o(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames2.size();
                        arrayList5 = arrayList11;
                        int i2 = 0;
                        while (i2 < size) {
                            int i3 = size;
                            int iIndexOf = arrayList13.indexOf(sharedElementTargetNames2.get(i2));
                            ArrayList<String> arrayList14 = sharedElementTargetNames2;
                            if (iIndexOf != -1) {
                                arrayList13.set(iIndexOf, sharedElementSourceNames.get(i2));
                            }
                            i2++;
                            size = i3;
                            sharedElementTargetNames2 = arrayList14;
                        }
                        sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        kotlin.jvm.internal.OooOOO0.OooO0o(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                        C32443OooOOO c32443OooOOO = !z2 ? new C32443OooOOO(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new C32443OooOOO(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                        SharedElementCallback sharedElementCallback = (SharedElementCallback) c32443OooOOO.f116638OooOo0o;
                        SharedElementCallback sharedElementCallback2 = (SharedElementCallback) c32443OooOOO.f116637OooOo;
                        int size2 = arrayList13.size();
                        int i4 = 0;
                        while (true) {
                            str2 = "enteringNames[i]";
                            obj2 = objOooOoO0;
                            if (i4 >= size2) {
                                break;
                            }
                            int i5 = size2;
                            Object obj6 = arrayList13.get(i4);
                            kotlin.jvm.internal.OooOOO0.OooO0o(obj6, "exitingNames[i]");
                            String str4 = sharedElementTargetNames.get(i4);
                            kotlin.jvm.internal.OooOOO0.OooO0o(str4, "enteringNames[i]");
                            oooO00o.put((String) obj6, str4);
                            i4++;
                            objOooOoO0 = obj2;
                            size2 = i5;
                        }
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            Iterator<String> it6 = sharedElementTargetNames.iterator();
                            while (true) {
                                Iterator<String> it7 = it6;
                                if (!it6.hasNext()) {
                                    break;
                                }
                                Log.v("FragmentManager", "Name: " + it7.next());
                                it6 = it7;
                                str2 = str2;
                            }
                            str3 = str2;
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator it8 = arrayList13.iterator(); it8.hasNext(); it8 = it8) {
                                Log.v("FragmentManager", "Name: " + ((String) it8.next()));
                            }
                        } else {
                            str3 = "enteringNames[i]";
                        }
                        View view3 = fragment3.mView;
                        kotlin.jvm.internal.OooOOO0.OooO0o(view3, "firstOut.fragment.mView");
                        OooOOO(oooO00o2, view3);
                        oooO00o2.OooOOO(arrayList13);
                        if (sharedElementCallback != null) {
                            if (FragmentManager.Oooo0o(2)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + oooO0OO2);
                            }
                            sharedElementCallback.onMapSharedElements(arrayList13, oooO00o2);
                            int size3 = arrayList13.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i6 = size3 - 1;
                                    Object obj7 = arrayList13.get(size3);
                                    kotlin.jvm.internal.OooOOO0.OooO0o(obj7, "exitingNames[i]");
                                    String str5 = (String) obj7;
                                    View view4 = (View) oooO00o2.get(str5);
                                    if (view4 == null) {
                                        oooO00o.remove(str5);
                                    } else if (!str5.equals(ViewCompat.getTransitionName(view4))) {
                                        oooO00o.put(ViewCompat.getTransitionName(view4), (String) oooO00o.remove(str5));
                                    }
                                    if (i6 < 0) {
                                        break;
                                    } else {
                                        size3 = i6;
                                    }
                                }
                            }
                        } else {
                            oooO00o.OooOOO(oooO00o2.keySet());
                        }
                        View view5 = fragment2.mView;
                        kotlin.jvm.internal.OooOOO0.OooO0o(view5, "lastIn.fragment.mView");
                        OooOOO(oooO00o3, view5);
                        oooO00o3.OooOOO(sharedElementTargetNames);
                        oooO00o3.OooOOO(oooO00o.values());
                        if (sharedElementCallback2 != null) {
                            if (FragmentManager.Oooo0o(2)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + oooO0OO4);
                            }
                            sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, oooO00o3);
                            int size4 = sharedElementTargetNames.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    String str6 = sharedElementTargetNames.get(size4);
                                    String str7 = str3;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(str6, str7);
                                    String str8 = str6;
                                    View view6 = (View) oooO00o3.get(str8);
                                    if (view6 == null) {
                                        String strOooO0O02 = C21919OoooO00.OooO0O0(oooO00o, str8);
                                        if (strOooO0O02 != null) {
                                            oooO00o.remove(strOooO0O02);
                                        }
                                    } else if (!str8.equals(ViewCompat.getTransitionName(view6)) && (strOooO0O0 = C21919OoooO00.OooO0O0(oooO00o, str8)) != null) {
                                        oooO00o.put(strOooO0O0, ViewCompat.getTransitionName(view6));
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                    str3 = str7;
                                }
                            }
                        } else {
                            C21917OoooO0 c21917OoooO0 = C21919OoooO00.f65064OooO00o;
                            for (int i8 = oooO00o.f58550OooOoO0 - 1; -1 < i8; i8--) {
                                if (!oooO00o3.containsKey((String) oooO00o.OooOO0O(i8))) {
                                    oooO00o.OooO(i8);
                                }
                            }
                        }
                        C34431OooOo0.OooOoO(oooO00o2.entrySet(), new OooOOO(oooO00o.keySet()), false);
                        C34431OooOo0.OooOoO(oooO00o3.entrySet(), new OooOOO(oooO00o.values()), false);
                        if (oooO00o.isEmpty()) {
                            break;
                        }
                        abstractC21921OoooOO02 = abstractC21921OoooOO0;
                        z2 = z;
                        obj = obj2;
                        arrayList12 = sharedElementTargetNames;
                    }
                    oooO0O0 = oooO0O05;
                    arrayList6 = arrayList3;
                    arrayList10 = arrayList4;
                    arrayList11 = arrayList5;
                }
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + oooO0OO2 + " and " + oooO0OO4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                arrayList4.clear();
                arrayList5.clear();
                abstractC21921OoooOO02 = abstractC21921OoooOO0;
                z2 = z;
                arrayList12 = sharedElementTargetNames;
                oooO0O0 = oooO0O05;
                arrayList6 = arrayList3;
                arrayList10 = arrayList4;
                arrayList11 = arrayList5;
            }
            arrayList2 = arrayList6;
            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O08 = oooO0O0;
            AbstractC21921OoooOO0 abstractC21921OoooOO03 = abstractC21921OoooOO02;
            ArrayList arrayList15 = arrayList10;
            ArrayList arrayList16 = arrayList11;
            if (obj != null) {
                oooO0O04 = oooO0O08;
                str = "FragmentManager";
                C21887OooO0oO c21887OooO0oO = new C21887OooO0oO(arrayList9, oooO0OO2, oooO0OO4, abstractC21921OoooOO03, obj, arrayList15, arrayList16, oooO00o, arrayList12, arrayList13, oooO00o2, oooO00o3, z);
                it = arrayList9.iterator();
                while (it.hasNext()) {
                    ((C21888OooO0oo) it.next()).f64930OooO00o.f65095OooOO0.add(c21887OooO0oO);
                }
            } else {
                if (!arrayList9.isEmpty()) {
                    Iterator it9 = arrayList9.iterator();
                    while (it9.hasNext()) {
                        if (((C21888OooO0oo) it9.next()).f64954OooO0O0 != null) {
                            oooO0O04 = oooO0O08;
                            str = "FragmentManager";
                            C21887OooO0oO c21887OooO0oO2 = new C21887OooO0oO(arrayList9, oooO0OO2, oooO0OO4, abstractC21921OoooOO03, obj, arrayList15, arrayList16, oooO00o, arrayList12, arrayList13, oooO00o2, oooO00o3, z);
                            it = arrayList9.iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                str = "FragmentManager";
                oooO0O04 = oooO0O08;
            }
        }
        ArrayList<OooO0O0> arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList18, ((OooO0O0) it10.next()).f64930OooO00o.f65096OooOO0O);
        }
        boolean zIsEmpty = arrayList18.isEmpty();
        boolean z3 = false;
        for (OooO0O0 oooO0O09 : arrayList2) {
            Context context = this.f65077OooO00o.getContext();
            AbstractC21925OoooOoO.OooO0OO oooO0OO6 = oooO0O09.f64930OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
            C21898OooOo0O.OooO00o oooO00oOooO0O0 = oooO0O09.OooO0O0(context);
            if (oooO00oOooO0O0 != null) {
                if (oooO00oOooO0O0.f64984OooO0O0 == null) {
                    arrayList17.add(oooO0O09);
                } else {
                    Fragment fragment4 = oooO0OO6.f65089OooO0OO;
                    if (oooO0OO6.f65096OooOO0O.isEmpty()) {
                        if (oooO0OO6.f65087OooO00o == oooO0O04) {
                            oooO0OO6.f65086OooO = false;
                        }
                        oooO0OO6.f65095OooOO0.add(new OooO0OO(oooO0O09));
                        z3 = true;
                    } else if (FragmentManager.Oooo0o(2)) {
                        Log.v(str, "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (OooO0O0 oooO0O010 : arrayList17) {
            AbstractC21925OoooOoO.OooO0OO oooO0OO7 = oooO0O010.f64930OooO00o;
            Fragment fragment5 = oooO0OO7.f65089OooO0OO;
            if (zIsEmpty) {
                if (!z3) {
                    oooO0OO7.f65095OooOO0.add(new OooO00o(oooO0O010));
                } else if (FragmentManager.Oooo0o(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.Oooo0o(2)) {
                Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
