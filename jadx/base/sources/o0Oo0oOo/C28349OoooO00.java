package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import com.orion.notein.p607ui.creative_library.CreativeLibrarySearchFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import oO00ooO.C32460OooOooO;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0oOo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28349OoooO00 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100505OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100506OooOo0o;

    public /* synthetic */ C28349OoooO00(Object obj, int i) {
        this.f100506OooOo0o = i;
        this.f100505OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        String str;
        Object obj = this.f100505OooOo;
        switch (this.f100506OooOo0o) {
            case 0:
                CreativeLibrarySearchFragment creativeLibrarySearchFragment = (CreativeLibrarySearchFragment) obj;
                C23040OooOOoo c23040OooOOooOooOoOO = creativeLibrarySearchFragment.OooOoOO();
                C23033OooOO0o.OooO00o oooO00o = (C23033OooOO0o.OooO00o) oOo000Oo.OooOo.Oooo(((C23040OooOOoo.OooO0O0) creativeLibrarySearchFragment.OooOoOO().f71152OooOOO0.f121747OooOo0o.getValue()).f71159OooO0O0);
                if (oooO00o == null || (str = oooO00o.f71089OooO0O0) == null) {
                    str = "";
                }
                C33781o00o0O c33781o00o0O = c23040OooOOooOooOoOO.f71151OooOOO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, str);
                break;
            default:
                int i = ImageCropView.f80139OooooO0;
                ImageCropView imageCropView = (ImageCropView) obj;
                imageCropView.invalidate();
                imageCropView.OooO0o0();
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
