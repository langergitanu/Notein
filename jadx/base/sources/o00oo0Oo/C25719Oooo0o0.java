package o00oo0Oo;

import androidx.fragment.app.Fragment;
import com.facebook.imagepipeline.producers.C22293OoooOOO;
import com.facebook.imagepipeline.producers.InterfaceC22305OoooooO;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;

/* JADX INFO: renamed from: o00oo0Oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25719Oooo0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87779OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87780OooOo0o;

    public /* synthetic */ C25719Oooo0o0(Object obj, int i) {
        this.f87780OooOo0o = i;
        this.f87779OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87779OooOo;
        switch (this.f87780OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                OooOo oooOo = this$0.f87785OooO0O0;
                return this$0.OooO0oO(new C22293OoooOOO(oooOo.f87710OooO.OooO0OO(), oooOo.f87719OooOO0, oooOo.f87711OooO00o), new InterfaceC22305OoooooO[]{new LocalExifThumbnailProducer(oooOo.f87710OooO.OooO0Oo(), oooOo.f87719OooOO0, oooOo.f87711OooO00o)});
            default:
                Fragment fragmentRequireParentFragment = ((LatestOpenedNoteTabFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
