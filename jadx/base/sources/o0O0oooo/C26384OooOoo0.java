package o0O0oooo;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0oooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26384OooOoo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90520OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90521OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Collection f90522OooOoO0;

    public /* synthetic */ C26384OooOoo0(Object obj, Collection collection, int i) {
        this.f90521OooOo0o = i;
        this.f90520OooOo = obj;
        this.f90522OooOoO0 = collection;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f90521OooOo0o) {
            case 0:
                List<InterfaceC31284OooO0O0> listOooOOOO = ((C26395Oooo0o0) this.f90520OooOo).OooOOOO(((Integer) obj).intValue());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listOooOOOO) {
                    if (((HashSet) this.f90522OooOoO0).contains(((InterfaceC31284OooO0O0) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                List<Long> list = (List) this.f90522OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f90520OooOo);
                try {
                    int i = 1;
                    for (Long l : list) {
                        if (l == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.OooO0o(i, l.longValue());
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList2.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList2;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
