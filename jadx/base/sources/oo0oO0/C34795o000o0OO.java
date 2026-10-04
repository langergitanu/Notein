package oo0oO0;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import com.orion.notein.data.p602db.entity.PenInfoConverter;
import com.orion.notein.data.p602db.entity.PenInfoEntity;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34795o000o0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125213OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125214OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125215OooOoO0;

    public /* synthetic */ C34795o000o0OO(int i, Object obj, Object obj2) {
        this.f125214OooOo0o = i;
        this.f125213OooOo = obj;
        this.f125215OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125214OooOo0o) {
            case 0:
                ((C34798o000o0o0) this.f125213OooOo).f125217OooO0O0.OooOoOO((InterfaceC24747OooO0O0) obj, (MaterialDownloadStateEntity) this.f125215OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                PenInfoConverter penInfoConverter = ((C34950o00oo0o) this.f125213OooOo).f125554OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from PenInfoEntity where note_id = ?");
                String str = (String) this.f125215OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color_index");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "width_index");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color_list");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "width_list");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "selected");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        arrayList.add(new PenInfoEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), penInfoConverter.stringToColorList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)), penInfoConverter.stringToWidthList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)) != 0, penInfoConverter.stringToExtra(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9))));
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
