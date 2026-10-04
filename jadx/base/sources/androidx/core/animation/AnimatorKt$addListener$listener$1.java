package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m80612d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LoO00ooO/OooOooO;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 176)
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ InterfaceC32507OooOO0o<Animator, C32460OooOooO> $onCancel;
    final /* synthetic */ InterfaceC32507OooOO0o<Animator, C32460OooOooO> $onEnd;
    final /* synthetic */ InterfaceC32507OooOO0o<Animator, C32460OooOooO> $onRepeat;
    final /* synthetic */ InterfaceC32507OooOO0o<Animator, C32460OooOooO> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o2, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o3, InterfaceC32507OooOO0o<? super Animator, C32460OooOooO> interfaceC32507OooOO0o4) {
        this.$onRepeat = interfaceC32507OooOO0o;
        this.$onEnd = interfaceC32507OooOO0o2;
        this.$onCancel = interfaceC32507OooOO0o3;
        this.$onStart = interfaceC32507OooOO0o4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
