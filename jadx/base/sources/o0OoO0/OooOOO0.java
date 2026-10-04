package o0OoO0;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f101105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101106OooOo0o;

    public /* synthetic */ OooOOO0(String str, int i) {
        this.f101106OooOo0o = i;
        this.f101105OooOo = str;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f101106OooOo0o) {
            case 0:
                OooOO0O state = (OooOO0O) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                return OooOO0O.OooO00o(state, null, this.f101105OooOo, null, null, false, null, false, false, false, 505);
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM FolderEntity where parent_id is null and is_in_trash_bin = 1 and user_id = ?");
                String str = this.f101105OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        int i2 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i2;
                        iOooO0Oo2 = i;
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
