package o0Oo0oOo;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.data.p602db.entity.p603ai.NoteSummaryEntity;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import com.orion.notein.p607ui.creative_library.C23050OooOoo0;
import com.orion.notein.p607ui.creative_library.CreatorProfileFragment;
import java.util.Iterator;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28361OooooOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100542OooOo0o;

    public /* synthetic */ C28361OooooOo(Object obj, int i) {
        this.f100542OooOo0o = i;
        this.f100541OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Object next;
        NoteSummaryEntity noteSummaryEntity = null;
        String strO000OoO = null;
        Object obj2 = this.f100541OooOo;
        switch (this.f100542OooOo0o) {
            case 0:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                C23047OooOoOO c23047OooOoOOOooOoOO = ((CreatorProfileFragment) obj2).OooOoOO();
                String materialId = item.f71088OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                Iterator<T> it = ((C23047OooOoOO.OooO0OO) c23047OooOoOOOooOoOO.f71202OooOOOO.f121747OooOo0o.getValue()).f71222OooO0o.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C23047OooOoOO.OooO00o) next).f71204OooO00o, materialId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C23047OooOoOO.OooO00o oooO00o = (C23047OooOoOO.OooO00o) next;
                if (oooO00o == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreatorProfileVM");
                    c20358OooO00o.OooOO0O("Material not found: ".concat(materialId), new Object[0]);
                } else if (oooO00o.f71212OooOO0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o2, "CreatorProfileVM", "Material already applied: ");
                    sbOooO0O0.append(oooO00o.f71205OooO0O0);
                    c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                } else {
                    if (oooO00o.f71211OooO0oo == DownloadState.DOWNLOADED) {
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23047OooOoOOOooOoOO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23050OooOoo0(c23047OooOoOOOooOoOO, materialId, null), 2);
                    } else {
                        C25252OooO0Oo.OooOo0o(new o000Oo0(c23047OooOoOOOooOoOO.f71195OooO0oO.OooO00o(materialId), new C28377ooOO(c23047OooOoOOOooOoOO, materialId, null), 1), androidx.lifecycle.o0OoOo0.OooO00o(c23047OooOoOOOooOoOO));
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM NoteSummaryEntity WHERE md5 = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "md5");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "summary");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        }
                        noteSummaryEntity = new NoteSummaryEntity(strO000OoO2, strO000OoO);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteSummaryEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
