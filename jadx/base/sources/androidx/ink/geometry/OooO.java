package androidx.ink.geometry;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.EditorPropertyFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65400OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65401OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f65401OooOo0o = i;
        this.f65400OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65401OooOo0o) {
            case 0:
                return Long.valueOf(MeshNative.f65388OooO00o.newCopyOfFormat(((OooOO0O) this.f65400OooOo).OooO00o()));
            default:
                Fragment fragmentRequireParentFragment = ((EditorPropertyFragment) this.f65400OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
