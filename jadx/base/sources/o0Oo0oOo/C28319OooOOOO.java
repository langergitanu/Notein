package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OoO000.C28571Oooooo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28319OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100439OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100440OooOo0o;

    public /* synthetic */ C28319OooOOOO(Object obj, int i) {
        this.f100440OooOo0o = i;
        this.f100439OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f100440OooOo0o) {
            case 0:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                String materialId = item.f71088OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                C21030OooOO0o.OooO0OO((CreativeLibraryDetailFragment) this.f100439OooOo).OooOOOO(new C28321OooOOo(materialId));
                return C32460OooOooO.f116667OooO00o;
            case 1:
                AuthResult authResult = (AuthResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(authResult);
                FirebaseUserAuthFragment firebaseUserAuthFragment = (FirebaseUserAuthFragment) this.f100439OooOo;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(firebaseUserAuthFragment), null, null, new C28571Oooooo0(authResult, firebaseUserAuthFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM item_label_cross_ref WHERE extraInfo = ?");
                String str = (String) this.f100439OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
