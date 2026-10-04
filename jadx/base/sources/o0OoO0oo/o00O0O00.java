package o0OoO0oo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00O0O00 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102128OooOo0o;

    public /* synthetic */ o00O0O00(NoteEditorFragment noteEditorFragment) {
        this.f102128OooOo0o = noteEditorFragment;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        int iOooO;
        Fragment fragment = (Fragment) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
        NoteEditorFragment noteEditorFragment = this.f102128OooOo0o;
        Fragment fragmentOooOooo = noteEditorFragment.getChildFragmentManager().OooOooo(fragment.getClass().getSimpleName());
        if (fragmentOooOooo == null) {
            FragmentManager childFragmentManager = noteEditorFragment.getChildFragmentManager();
            androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
            oooO00oOooO0OO.OooO0Oo(0, fragment, fragment.getClass().getSimpleName(), 1);
            iOooO = oooO00oOooO0OO.OooO(true, true);
        } else {
            FragmentManager childFragmentManager2 = noteEditorFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager2);
            oooO00o.OooOOO0(fragmentOooOooo);
            oooO00o.OooO0Oo(0, fragment, fragment.getClass().getSimpleName(), 1);
            iOooO = oooO00o.OooO(true, true);
        }
        return Integer.valueOf(iOooO);
    }
}
