package oo0oO0;

import com.orion.notein.data.p602db.entity.MergingLayerItemEntity;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0000OO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125137OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125138OooOoO0;

    public /* synthetic */ o0000OO0(int i, Object obj, Object obj2) {
        this.f125137OooOo0o = i;
        this.f125136OooOo = obj;
        this.f125138OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125137OooOo0o) {
            case 0:
                ((C34758o0000Oo0) this.f125136OooOo).f125140OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (HandWritingTextCacheEntity[]) this.f125138OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                List<String> list = (List) this.f125138OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125136OooOo);
                try {
                    int i = 1;
                    for (String str : list) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        }
                        arrayList.add(new MergingLayerItemEntity(strO000OoO2, strO000OoO, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3)));
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
