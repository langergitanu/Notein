package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22117OooO0Oo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f66445OooO00o;

    public C22117OooO0Oo(OooO0OO oooO0OO) {
        this.f66445OooO00o = oooO0OO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0OO oooO0OO = this.f66445OooO00o;
        ArrayList arrayList = new ArrayList(oooO0OO.f66437OooOoOO);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0O0) arrayList.get(i)).onAnimationEnd(oooO0OO);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooO0OO oooO0OO = this.f66445OooO00o;
        ArrayList arrayList = new ArrayList(oooO0OO.f66437OooOoOO);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0O0) arrayList.get(i)).onAnimationStart(oooO0OO);
        }
    }
}
