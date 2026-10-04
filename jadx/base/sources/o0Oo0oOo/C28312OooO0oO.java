package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import com.orion.notein.p607ui.noteeditor.ruler.RulerOverlayView;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Oo0oOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28312OooO0oO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100428OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100429OooOo0o;

    public /* synthetic */ C28312OooO0oO(Object obj, int i) {
        this.f100429OooOo0o = i;
        this.f100428OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f100429OooOo0o) {
            case 0:
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = (CreativeLibraryDetailFragment) this.f100428OooOo;
                creativeLibraryDetailFragment.OooOoOO().OooO0o(((C28322OooOOo0) creativeLibraryDetailFragment.f70836OooOooO.getValue()).f100444OooO00o);
                return C32460OooOooO.f116667OooO00o;
            case 1:
                oO0O000o.OooO00o<C32460OooOooO> oooO00o = ((RulerOverlayView) this.f100428OooOo).f76190OooOo;
                if (oooO00o != null) {
                    oooO00o.invoke();
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                return Boolean.valueOf(((C31042OooOOO0) this.f100428OooOo).f110827OooO0O0 != null);
        }
    }
}
