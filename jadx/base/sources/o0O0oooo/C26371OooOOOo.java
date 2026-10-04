package o0O0oooo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.penkit.models.InkStrokeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0Ooo0o0.C29420OooO0Oo;
import o0Ooo0o0.EnumC29418OooO0O0;
import o0Ooo0o0.EnumC29419OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0O0oooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26371OooOOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90490OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90491OooOo0o;

    public /* synthetic */ C26371OooOOOo(Object obj, int i) {
        this.f90491OooOo0o = i;
        this.f90490OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f90491OooOo0o) {
            case 0:
                InkStrokeInfo record = (InkStrokeInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(record, "record");
                ArrayList arrayList = (ArrayList) this.f90490OooOo;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InkStrokeInfo) it.next()).getId());
                }
                return Boolean.valueOf(arrayList2.contains(record.getId()));
            case 1:
                C29420OooO0Oo vo = (C29420OooO0Oo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                C29423OooO00o c29423OooO00oOooOooO = ((PagePaddingFragment) this.f90490OooOo).OooOooO();
                EnumC29418OooO0O0 enumC29418OooO0O0 = vo.f104345OooO00o;
                PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) c29423OooO00oOooOooO.f104369OooOOO.getValue();
                if (pagePaddingStyle != null) {
                    EnumC29418OooO0O0 enumC29418OooO0O0OooO = C29423OooO00o.OooO(pagePaddingStyle);
                    if (enumC29418OooO0O0OooO == null) {
                        enumC29418OooO0O0OooO = (EnumC29418OooO0O0) c29423OooO00oOooOooO.f104371OooOOOO.f121747OooOo0o.getValue();
                    }
                    if (enumC29418OooO0O0OooO != enumC29418OooO0O0) {
                        EnumC29419OooO0OO enumC29419OooO0OOOooO00o = enumC29418OooO0O0.OooO00o((EnumC29419OooO0OO) c29423OooO00oOooOooO.f104372OooOOOo.f121747OooOo0o.getValue());
                        PagePaddingStyle pagePaddingStyleOooO0o = c29423OooO00oOooOooO.OooO0o(enumC29418OooO0O0, enumC29419OooO0OOOooO00o, null, c29423OooO00oOooOooO.OooOO0O(enumC29419OooO0OOOooO00o), pagePaddingStyle);
                        if (pagePaddingStyleOooO0o != null) {
                            c29423OooO00oOooOooO.OooOOo0(pagePaddingStyleOooO0o);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageLayerEntity where note_id = ?");
                String str = (String) this.f90490OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "visible");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList3.add(new PageLayerEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)));
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList3;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
