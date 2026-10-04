package androidx.core.transition;

import android.transition.Transition;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\u0006\u001a*\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u0006\u001a\u0082\u0001\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m80612d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "LoO00ooO/OooOooO;", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;LoO0O000o/OooOO0o;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "(Landroid/transition/Transition;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class TransitionKt {

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/transition/Transition;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00401 extends OooOOOO implements InterfaceC32507OooOO0o<Transition, C32460OooOooO> {
        public static final C00401 INSTANCE = new C00401();

        public C00401() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Transition transition) {
            invoke2(transition);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$2 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/transition/Transition;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00412 extends OooOOOO implements InterfaceC32507OooOO0o<Transition, C32460OooOooO> {
        public static final C00412 INSTANCE = new C00412();

        public C00412() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Transition transition) {
            invoke2(transition);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$3 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/transition/Transition;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00423 extends OooOOOO implements InterfaceC32507OooOO0o<Transition, C32460OooOooO> {
        public static final C00423 INSTANCE = new C00423();

        public C00423() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Transition transition) {
            invoke2(transition);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$4 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/transition/Transition;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00434 extends OooOOOO implements InterfaceC32507OooOO0o<Transition, C32460OooOooO> {
        public static final C00434 INSTANCE = new C00434();

        public C00434() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Transition transition) {
            invoke2(transition);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$5 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/transition/Transition;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00445 extends OooOOOO implements InterfaceC32507OooOO0o<Transition, C32460OooOooO> {
        public static final C00445 INSTANCE = new C00445();

        public C00445() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Transition transition) {
            invoke2(transition);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final Transition.TransitionListener addListener(Transition transition, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o2, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o3, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o4, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC32507OooOO0o, interfaceC32507OooOO0o4, interfaceC32507OooOO0o5, interfaceC32507OooOO0o3, interfaceC32507OooOO0o2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC32507OooOO0o interfaceC32507OooOO0o2, InterfaceC32507OooOO0o interfaceC32507OooOO0o3, InterfaceC32507OooOO0o interfaceC32507OooOO0o4, InterfaceC32507OooOO0o interfaceC32507OooOO0o5, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC32507OooOO0o = C00401.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC32507OooOO0o2 = C00412.INSTANCE;
        }
        InterfaceC32507OooOO0o interfaceC32507OooOO0o6 = interfaceC32507OooOO0o2;
        if ((i & 4) != 0) {
            interfaceC32507OooOO0o3 = C00423.INSTANCE;
        }
        if ((i & 8) != 0) {
            interfaceC32507OooOO0o4 = C00434.INSTANCE;
        }
        if ((i & 16) != 0) {
            interfaceC32507OooOO0o5 = C00445.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC32507OooOO0o, interfaceC32507OooOO0o4, interfaceC32507OooOO0o5, interfaceC32507OooOO0o3, interfaceC32507OooOO0o6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                interfaceC32507OooOO0o.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                interfaceC32507OooOO0o.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                interfaceC32507OooOO0o.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                interfaceC32507OooOO0o.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                interfaceC32507OooOO0o.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
