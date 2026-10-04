package o0OoO0oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoO0oo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28756o00000oO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f101846OooO0O0;

    public C28756o00000oO(NoteEditorContainerFragment noteEditorContainerFragment, int i) {
        this.f101845OooO00o = noteEditorContainerFragment;
        this.f101846OooO0O0 = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101845OooO00o;
        View view = noteEditorContainerFragment.f72837Oooooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
            throw null;
        }
        int i = this.f101846OooO0O0;
        view.setVisibility(i == 0 ? 0 : 8);
        noteEditorContainerFragment.f72844o00Ooo = i;
        noteEditorContainerFragment.f72845o00o0O = false;
        if (i == 1 && noteEditorContainerFragment.Oooo00O().f73410o000000o.getValue() == OooO0O0.OooO00o.f75496OooOo) {
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
            OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f75497OooOo0o;
            C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73409o000000O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, oooO00o);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101845OooO00o;
        View view = noteEditorContainerFragment.f72837Oooooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
            throw null;
        }
        view.setVisibility(0);
        noteEditorContainerFragment.f72845o00o0O = true;
    }
}
