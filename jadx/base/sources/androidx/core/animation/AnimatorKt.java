package androidx.core.animation;

import android.animation.Animator;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\r\u0010\f\u001al\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "LoO00ooO/OooOooO;", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;LoO0O000o/OooOO0o;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;LoO0O000o/OooOO0o;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;)Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class AnimatorKt {

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00021 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00021 INSTANCE = new C00021();

        public C00021() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$2 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00032 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00032 INSTANCE = new C00032();

        public C00032() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$3 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00043 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00043 INSTANCE = new C00043();

        public C00043() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$4 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00054 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00054 INSTANCE = new C00054();

        public C00054() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00061 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00061 INSTANCE = new C00061();

        public C00061() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$2 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/animation/Animator;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00072 extends OooOOOO implements InterfaceC32507OooOO0o<Animator, C32460OooOooO> {
        public static final C00072 INSTANCE = new C00072();

        public C00072() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Animator animator) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Animator animator) {
            invoke2(animator);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final Animator.AnimatorListener addListener(Animator animator, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o2, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o3, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC32507OooOO0o4, interfaceC32507OooOO0o, interfaceC32507OooOO0o3, interfaceC32507OooOO0o2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC32507OooOO0o interfaceC32507OooOO0o2, InterfaceC32507OooOO0o interfaceC32507OooOO0o3, InterfaceC32507OooOO0o interfaceC32507OooOO0o4, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC32507OooOO0o = C00021.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC32507OooOO0o2 = C00032.INSTANCE;
        }
        if ((i & 4) != 0) {
            interfaceC32507OooOO0o3 = C00043.INSTANCE;
        }
        if ((i & 8) != 0) {
            interfaceC32507OooOO0o4 = C00054.INSTANCE;
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC32507OooOO0o4, interfaceC32507OooOO0o, interfaceC32507OooOO0o3, interfaceC32507OooOO0o2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                interfaceC32507OooOO0o2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                interfaceC32507OooOO0o.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC32507OooOO0o interfaceC32507OooOO0o2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC32507OooOO0o = C00061.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC32507OooOO0o2 = C00072.INSTANCE;
        }
        return addPauseListener(animator, interfaceC32507OooOO0o, interfaceC32507OooOO0o2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                interfaceC32507OooOO0o.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                interfaceC32507OooOO0o.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        return addPauseListener$default(animator, null, interfaceC32507OooOO0o, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                interfaceC32507OooOO0o.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        return addPauseListener$default(animator, interfaceC32507OooOO0o, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                interfaceC32507OooOO0o.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
