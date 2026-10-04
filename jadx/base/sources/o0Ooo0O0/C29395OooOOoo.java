package o0Ooo0O0;

import android.animation.Animator;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditorPanel;

/* JADX INFO: renamed from: o0Ooo0O0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29395OooOOoo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditorPanel f104234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f104235OooO0O0;

    public C29395OooOOoo(PageLayerEditorPanel pageLayerEditorPanel, boolean z) {
        this.f104234OooO00o = pageLayerEditorPanel;
        this.f104235OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        PageLayerEditorPanel pageLayerEditorPanel = this.f104234OooO00o;
        pageLayerEditorPanel.f74889OooOoO0 = false;
        pageLayerEditorPanel.f74888OooOoO = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f104235OooO0O0 ? 0 : 8;
        PageLayerEditorPanel pageLayerEditorPanel = this.f104234OooO00o;
        pageLayerEditorPanel.setVisibility(i);
        pageLayerEditorPanel.f74889OooOoO0 = false;
        pageLayerEditorPanel.f74888OooOoO = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PageLayerEditorPanel pageLayerEditorPanel = this.f104234OooO00o;
        pageLayerEditorPanel.setVisibility(0);
        pageLayerEditorPanel.f74889OooOoO0 = true;
    }
}
