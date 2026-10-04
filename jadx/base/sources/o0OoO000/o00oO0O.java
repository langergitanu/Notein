package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00oO0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101352OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101353OooOo0o;

    public /* synthetic */ o00oO0O(Object obj, int i) {
        this.f101353OooOo0o = i;
        this.f101352OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f101353OooOo0o) {
            case 0:
                FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f101352OooOo;
                C21989OooOooO.OooO00o(firebaseUserLoginFragment).OooO0O0(new C28578o00000oO((AuthResult) obj, firebaseUserLoginFragment, null));
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PlayPurchaseServerEntity WHERE product_type = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, (String) this.f101352OooOo);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "purchase_token");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "product_type");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "product_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "original_json");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        arrayList.add(new PlayPurchaseServerEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO));
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
