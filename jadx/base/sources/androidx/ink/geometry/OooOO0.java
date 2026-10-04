package androidx.ink.geometry;

import androidx.fragment.app.Fragment;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65407OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65408OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f65408OooOo0o = i;
        this.f65407OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f65407OooOo;
        switch (this.f65408OooOo0o) {
            case 0:
                return MeshNative.f65388OooO00o.createBounds(((OooOO0O) obj).OooO00o());
            case 1:
                return AiOcrTextPage.contentMd5$lambda$0((AiOcrTextPage) obj);
            default:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                Fragment fragmentRequireParentFragment = ((PenBoxChildFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
