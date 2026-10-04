package androidx.ink.strokes;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import o0o00oOo.C30038OooOO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65477OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65478OooOo0o;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f65478OooOo0o = i;
        this.f65477OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65478OooOo0o) {
            case 0:
                StrokeNative strokeNative = StrokeNative.f65499OooO00o;
                OooOOO0 oooOOO0 = (OooOOO0) this.f65477OooOo;
                oooOOO0.getClass();
                return Long.valueOf(strokeNative.newShallowCopyOfInputs(oooOOO0.f65487OooO0O0.OooO00o(oooOOO0, OooOOO0.f65484OooO0o[0])));
            case 1:
                ((C30038OooOO0o) this.f65477OooOo).invoke();
                return C32460OooOooO.f116667OooO00o;
            default:
                Fragment fragmentRequireParentFragment = ((MoveToFolderFragment) this.f65477OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
