package o000ooOO;

import com.facebook.soloader.OooOo;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o000OoO.C24536OooO0Oo;
import o000ooOO.OooOOOO;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooOO.C32465OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    public static final class OooO00o<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final class OooO0O0<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final List<OooO> OooO00o(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo) {
        int iOooO00o = OooOOO0.OooO00o(interfaceC24749OooO0Oo, "id");
        int iOooO00o2 = OooOOO0.OooO00o(interfaceC24749OooO0Oo, "seq");
        int iOooO00o3 = OooOOO0.OooO00o(interfaceC24749OooO0Oo, Constants.MessagePayloadKeys.FROM);
        int iOooO00o4 = OooOOO0.OooO00o(interfaceC24749OooO0Oo, "to");
        C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
        while (interfaceC24749OooO0Oo.o00oO0o()) {
            c32465OooO0O0OooO0Oo.add(new OooO((int) interfaceC24749OooO0Oo.getLong(iOooO00o), (int) interfaceC24749OooO0Oo.getLong(iOooO00o2), interfaceC24749OooO0Oo.o000OoO(iOooO00o3), interfaceC24749OooO0Oo.o000OoO(iOooO00o4)));
        }
        return oOo000Oo.OooOo.ooOO(OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
    }

    public static final OooOOOO.C24742OooO0Oo OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0, String str, boolean z) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iOooO00o = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "seqno");
            int iOooO00o2 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "cid");
            int iOooO00o3 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "name");
            int iOooO00o4 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "desc");
            if (iOooO00o != -1 && iOooO00o2 != -1 && iOooO00o3 != -1 && iOooO00o4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                    if (((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o2)) >= 0) {
                        int i = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o);
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o3);
                        String str2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strO000OoO);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listO00O0O = oOo000Oo.OooOo.o00O0O(linkedHashMap.entrySet(), new OooO00o());
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
                Iterator it = listO00O0O.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(arrayList);
                List listO00O0O2 = oOo000Oo.OooOo.o00O0O(linkedHashMap2.entrySet(), new OooO0O0());
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O2, 10));
                Iterator it2 = listO00O0O2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                OooOOOO.C24742OooO0Oo c24742OooO0Oo = new OooOOOO.C24742OooO0Oo(str, z, listO0ooOO0, oOo000Oo.OooOo.o0ooOO0(arrayList2));
                interfaceC24749OooO0OoO0ooOOo.close();
                return c24742OooO0Oo;
            }
            interfaceC24749OooO0OoO0ooOOo.close();
            return null;
        } finally {
        }
    }
}
