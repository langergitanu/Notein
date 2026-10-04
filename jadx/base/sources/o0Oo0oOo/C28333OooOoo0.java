package o0Oo0oOo;

import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23037OooOOOo;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import java.util.Iterator;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import o0OoO000.C28572OoooooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28333OooOoo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100468OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100469OooOo0o;

    public /* synthetic */ C28333OooOoo0(Object obj, int i) {
        this.f100469OooOo0o = i;
        this.f100468OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Object next;
        Object obj2 = this.f100468OooOo;
        switch (this.f100469OooOo0o) {
            case 0:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                C23033OooOO0o c23033OooOO0oOooOoo = ((CreativeLibraryListFragment) obj2).OooOoo();
                String materialId = item.f71088OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                Iterator<T> it = ((C23033OooOO0o.OooO0OO) c23033OooOO0oOooOoo.f71085OooOOO.f121747OooOo0o.getValue()).f71106OooO0OO.iterator();
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
                    C34406OooO00o.f123390OooO00o.OooOO0O("Material not found: ".concat(materialId), new Object[0]);
                } else {
                    if (oooO00o.f71094OooO0oO == MaterialActionType.GO_TO_CREATE) {
                        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23033OooOO0oOooOoo), null, null, new C23037OooOOOo(c23033OooOO0oOooOoo, materialId, null), 3);
                    } else if (oooO00o.f71098OooOO0o) {
                        C34406OooO00o.f123390OooO00o.OooO00o("Material already applied: " + oooO00o.f71089OooO0O0, new Object[0]);
                    } else {
                        if (oooO00o.f71096OooOO0 == DownloadState.DOWNLOADED) {
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23033OooOO0oOooOoo);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.creative_library.OooOOO0(c23033OooOO0oOooOoo, materialId, null), 2);
                        } else {
                            C25252OooO0Oo.OooOo0o(new o000Oo0(c23033OooOO0oOooOoo.f71080OooO0oO.OooO00o(materialId), new C28341Oooo0O0(c23033OooOO0oOooOoo, null), 1), androidx.lifecycle.o0OoOo0.OooO00o(c23033OooOO0oOooOoo));
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                FirebaseUserAuthFragment firebaseUserAuthFragment = (FirebaseUserAuthFragment) obj2;
                C21989OooOooO.OooO00o(firebaseUserAuthFragment).OooO0O0(new C28572OoooooO((AuthResult) obj, firebaseUserAuthFragment, null));
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM material_download_state WHERE material_id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "material_id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "material_type");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "download_url");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "local_path");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_size");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "downloaded_at");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_available_on_server");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        materialDownloadStateEntity = new MaterialDownloadStateEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)) != 0);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return materialDownloadStateEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
