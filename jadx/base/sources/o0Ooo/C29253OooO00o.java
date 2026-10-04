package o0Ooo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29253OooO00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103747OooOo0o;

    public /* synthetic */ C29253OooO00o(PenBoxChildFragment penBoxChildFragment) {
        this.f103747OooOo0o = penBoxChildFragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        int i = PenBoxChildFragment.f75355o0000Ooo;
        Fragment fragmentRequireParentFragment = this.f103747OooOo0o.requireParentFragment();
        kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }
}
