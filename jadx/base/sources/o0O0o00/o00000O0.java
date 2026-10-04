package o0O0o00;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.orion.editor.PDFView;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000O0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PDFView f88667OooO00o;

    public o00000O0(PDFView pDFView) {
        this.f88667OooO00o = pDFView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PDFView pDFView = this.f88667OooO00o;
        pDFView.f69256o000Oo.reset();
        pDFView.invalidate();
    }
}
