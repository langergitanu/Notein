package o0OOOO0o;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0ooOOo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f94761OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94762OooOo0o;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f94762OooOo0o = i;
        this.f94761OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f94762OooOo0o) {
            case 0:
                o0O0O00 o0o0o00 = (o0O0O00) this.f94761OooOo;
                o0O0O00.OooO0O0(o0o0o00).stopAuth();
                o0O0O00.OooO0O0(o0o0o00).removeAllListeners();
                return C32460OooOooO.f116667OooO00o;
            default:
                Fragment fragmentRequireParentFragment = ((NoteEditorFragment) this.f94761OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
