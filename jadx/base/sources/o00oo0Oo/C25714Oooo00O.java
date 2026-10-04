package o00oo0Oo;

import androidx.fragment.app.Fragment;
import com.facebook.imagepipeline.producers.C22301OooooOO;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oo0Oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25714Oooo00O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87771OooOo0o;

    public /* synthetic */ C25714Oooo00O(Object obj, int i) {
        this.f87771OooOo0o = i;
        this.f87770OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f87771OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) this.f87770OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                OooOo oooOo = this$0.f87785OooO0O0;
                return new C22301OooooOO(this$0.OooO0oo(new com.facebook.imagepipeline.producers.Oooo000(oooOo.f87710OooO.OooO0OO(), oooOo.f87719OooOO0, oooOo.f87711OooO00o)), this$0.f87789OooO0o0);
            default:
                Fragment fragmentRequireParentFragment = ((LatestOpenedNoteTabFragment) this.f87770OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
