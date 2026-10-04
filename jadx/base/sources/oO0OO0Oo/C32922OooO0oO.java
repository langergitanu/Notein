package oO0OO0Oo;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0OO00.C32889OooOOOo;
import oO0OO00.C32892OooOOoo;
import oO0OOOO0.C32965OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oO0OO0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32922OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<C32889OooOOOo> f118801OooO00o;

    public C32922OooO0oO(C32892OooOOoo typeTable) {
        OooOOO0.OooO0oO(typeTable, "typeTable");
        List<C32889OooOOOo> list = typeTable.f118472OooOoO0;
        if ((typeTable.f118469OooOo & 1) == 1) {
            int i = typeTable.f118471OooOoO;
            OooOOO0.OooO0o(list, "typeTable.typeList");
            List<C32889OooOOOo> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C32889OooOOOo c32889OooOOOoOooO0o = (C32889OooOOOo) obj;
                if (i2 >= i) {
                    c32889OooOOOoOooO0o.getClass();
                    C32889OooOOOo.OooO0OO oooO0OOOooOOO0 = C32889OooOOOo.OooOOO0(c32889OooOOOoOooO0o);
                    oooO0OOOooOOO0.f118402OooOoO |= 2;
                    oooO0OOOooOOO0.f118405OooOoo0 = true;
                    c32889OooOOOoOooO0o = oooO0OOOooOOO0.OooO0o();
                    if (!c32889OooOOOoOooO0o.isInitialized()) {
                        throw new C32965OooOo0O();
                    }
                }
                arrayList.add(c32889OooOOOoOooO0o);
                i2 = i3;
            }
            list = arrayList;
        }
        OooOOO0.OooO0o(list, "run {\n        val origin… else originalTypes\n    }");
        this.f118801OooO00o = list;
    }

    public final C32889OooOOOo OooO00o(int i) {
        return this.f118801OooO00o.get(i);
    }
}
