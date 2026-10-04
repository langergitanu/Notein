package o0OoOOOo;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import o000o00.AbstractC24555OooO00o;

/* JADX INFO: renamed from: o0OoOOOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29097OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103117OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103118OooOo0o;

    public /* synthetic */ C29097OooO0o(Object obj, int i) {
        this.f103118OooOo0o = i;
        this.f103117OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f103118OooOo0o) {
            case 0:
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = (com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f103117OooOo;
                return (C29102OooOO0O) new o00Oo0(oooO00o.OooO0O0().getViewModelStore(), oooO00o.OooO0O0().getDefaultViewModelProviderFactory(), AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0).OooO00o(C29102OooOO0O.class);
            default:
                Fragment parentFragment = ((PaperConfigTemplateFragment) this.f103117OooOo).getParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parentFragment, "null cannot be cast to non-null type com.orion.notein.ui.paperconfig.PaperConfigDialogFragment");
                return ((PaperConfigDialogFragment) parentFragment).OooOoo();
        }
    }
}
