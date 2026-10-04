package o0o00oO0;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.backup.BackupResultDialogFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.pageeditor.ChooseNoteDialogFragment;
import o0o00o0.C29936OooO0oO;
import o0o0OOO0.C30544OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0o00oO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29992OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106544OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106545OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29992OooOO0o(Object obj, int i) {
        this.f106545OooOo0o = i;
        this.f106544OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LockNoteFragment lockNoteFragment;
        switch (this.f106545OooOo0o) {
            case 0:
                boolean zIsActivated = view.isActivated();
                C29993OooOOOo c29993OooOOOo = (C29993OooOOOo) this.f106544OooOo;
                if (!zIsActivated) {
                    C29936OooO0oO c29936OooO0oO = c29993OooOOOo.f106559Oooo0;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0OO(3);
                    }
                } else {
                    C29936OooO0oO c29936OooO0oO2 = c29993OooOOOo.f106559Oooo0;
                    if (c29936OooO0oO2 != null) {
                        c29936OooO0oO2.OooO0oo(3);
                    }
                }
                break;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.pageeditor.vo.TargetNoteVO");
                final C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) tag;
                final ChooseNoteDialogFragment chooseNoteDialogFragment = (ChooseNoteDialogFragment) this.f106544OooOo;
                Fragment fragmentOooOooo = chooseNoteDialogFragment.getChildFragmentManager().OooOooo("LockNoteFragment");
                if (fragmentOooOooo != null) {
                    lockNoteFragment = (LockNoteFragment) fragmentOooOooo;
                } else {
                    lockNoteFragment = new LockNoteFragment();
                    FragmentManager childFragmentManager = chooseNoteDialogFragment.getChildFragmentManager();
                    androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
                    oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
                    oooO00oOooO0OO.OooOO0O();
                }
                InterfaceC21987OooOoo viewLifecycleOwner = chooseNoteDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                LockNoteFragment.OooOoo(lockNoteFragment, C21989OooOooO.OooO00o(viewLifecycleOwner), com.facebook.soloader.OooOo.OooO0oO(c30544OooO0O0.f109255OooO00o), new oO0O000o.OooO00o() { // from class: o0o0OO0O.OooO00o
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        chooseNoteDialogFragment.OooOoo0().OooO0o(c30544OooO0O0.f109255OooO00o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                break;
            default:
                Dialog dialog = ((BackupResultDialogFragment) this.f106544OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
