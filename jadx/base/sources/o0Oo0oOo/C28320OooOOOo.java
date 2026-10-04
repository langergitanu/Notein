package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oo0oO0.AbstractC34924o00oOOO0;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28320OooOOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100441OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100442OooOo0o;

    public /* synthetic */ C28320OooOOOo(Object obj, int i) {
        this.f100442OooOo0o = i;
        this.f100441OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f100442OooOo0o) {
            case 0:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                C23028OooO0Oo c23028OooO0OoOooOoOO = ((CreativeLibraryDetailFragment) this.f100441OooOo).OooOoOO();
                String materialId = item.f71088OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23028OooO0OoOooOoOO), null, null, new com.orion.notein.p607ui.creative_library.OooO(c23028OooO0OoOooOoOO, materialId, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(TextBoxEntity.'left') AS 'left', MAX(TextBoxEntity.'right') AS 'right', MIN(TextBoxEntity.'top') AS 'top', MAX(TextBoxEntity.'bottom') AS 'bottom' FROM TextBoxEntity where page_id = ?");
                String str = (String) this.f100441OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
