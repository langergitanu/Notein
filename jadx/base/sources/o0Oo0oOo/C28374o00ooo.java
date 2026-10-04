package o0Oo0oOo;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23055Oooo0O0;
import com.orion.notein.p607ui.creative_library.C23058Oooo0o0;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.creative_library.Oooo0;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28374o00ooo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100598OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100599OooOo0o;

    public /* synthetic */ C28374o00ooo(Fragment fragment, int i) {
        this.f100599OooOo0o = i;
        this.f100598OooOo = fragment;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f100599OooOo0o) {
            case 0:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                com.orion.notein.p607ui.creative_library.Oooo0 oooo0 = (com.orion.notein.p607ui.creative_library.Oooo0) ((DownloadedMaterialListFragment) this.f100598OooOo).f70920OooOoo.getValue();
                String materialId = item.f71088OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                Iterator<T> it = ((Oooo0.OooO0O0) oooo0.f71240OooO.getValue()).f71249OooO0O0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C23033OooOO0o.OooO00o) next).f71088OooO00o, materialId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C23033OooOO0o.OooO00o oooO00o = (C23033OooOO0o.OooO00o) next;
                if (oooO00o == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DownloadedMaterialListVM");
                    c20358OooO00o.OooOO0O("Material not found: ".concat(materialId), new Object[0]);
                } else {
                    if (oooO00o.f71094OooO0oO == MaterialActionType.GO_TO_CREATE) {
                        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooo0), null, null, new C23058Oooo0o0(oooo0, materialId, null), 3);
                    } else if (oooO00o.f71098OooOO0o) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o2, "DownloadedMaterialListVM", "Material already applied: ");
                        sbOooO0O0.append(oooO00o.f71089OooO0O0);
                        c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                    } else {
                        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooo0), null, null, new C23055Oooo0O0(oooo0, materialId, oooO00o, null), 3);
                    }
                }
                break;
            default:
                List<? extends Uri> it2 = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
                ((StickerCollectionCreationFragment) this.f100598OooOo).OooOoo0().OooO0o0(it2);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
