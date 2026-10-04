package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "LoO00ooO/OooOooO;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 176)
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ InterfaceC32507OooOO0o<Transition, C32460OooOooO> $onCancel;
    final /* synthetic */ InterfaceC32507OooOO0o<Transition, C32460OooOooO> $onEnd;
    final /* synthetic */ InterfaceC32507OooOO0o<Transition, C32460OooOooO> $onPause;
    final /* synthetic */ InterfaceC32507OooOO0o<Transition, C32460OooOooO> $onResume;
    final /* synthetic */ InterfaceC32507OooOO0o<Transition, C32460OooOooO> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o2, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o3, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o4, InterfaceC32507OooOO0o<? super Transition, C32460OooOooO> interfaceC32507OooOO0o5) {
        this.$onEnd = interfaceC32507OooOO0o;
        this.$onResume = interfaceC32507OooOO0o2;
        this.$onPause = interfaceC32507OooOO0o3;
        this.$onCancel = interfaceC32507OooOO0o4;
        this.$onStart = interfaceC32507OooOO0o5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
