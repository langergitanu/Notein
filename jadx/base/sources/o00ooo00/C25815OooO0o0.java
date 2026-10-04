package o00ooo00;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o00ooo00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25815OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f88030OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AnimatorSet f88031OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AnimatorSet f88032OooO0OO;

    public C25815OooO0o0(View view) {
        this.f88030OooO00o = view;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_hide);
        this.f88031OooO0O0 = animatorSet;
        animatorSet.setStartDelay(1000);
        animatorSet.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_show);
        this.f88032OooO0OO = animatorSet2;
        animatorSet2.setTarget(view);
        animatorSet.addListener(new C25814OooO0Oo(view));
        OooO00o();
    }

    public final void OooO00o() {
        View view = this.f88030OooO00o;
        view.setPivotX(view.getMeasuredWidth() * 1.0f);
        view.setPivotY(1.0f * view.getMeasuredHeight());
    }
}
