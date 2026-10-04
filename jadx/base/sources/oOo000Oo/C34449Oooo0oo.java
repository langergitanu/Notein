package oOo000Oo;

import Oooo0oO.C21111o0ooOoO;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import oO00ooOO.C32463OooO;
import oO00ooOO.C32466OooO0OO;
import oO0OOO.C32934OooO0o0;

/* JADX INFO: renamed from: oOo000Oo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34449Oooo0oo {
    public static LinkedHashSet OooO(Set set, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static String OooO00o(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : MsalUtils.QUERY_STRING_SYMBOL;
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
            return MsalUtils.QUERY_STRING_SYMBOL;
        }
    }

    public static HashMap OooO0O0(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            String strOooO0Oo = C21111o0ooOoO.OooO0Oo(strSubstring, "={");
            map.put(strSubstring, str2.substring(strOooO0Oo.length() + str2.indexOf(strOooO0Oo), str2.lastIndexOf("}")));
        }
        return map;
    }

    public static HashMap OooO0OO(String str, C25047OooO00o c25047OooO00o) {
        int iOooO00o = o00OOOO0.OooO0O0.OooO00o(AuthCode.StatusCode.WAITING_CONNECT);
        HashMap map = new HashMap();
        map.put("resultStatus", Integer.toString(o00OOOO0.OooO0O0.OooO0O0(iOooO00o)));
        map.put("memo", o00OOOO0.OooO0O0.OooO0OO(iOooO00o));
        map.put("result", "");
        try {
            return OooO0O0(str);
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "FormatResultEx", th);
            return map;
        }
    }

    public static C32463OooO OooO0Oo(C32463OooO c32463OooO) {
        C32466OooO0OO<E, ?> c32466OooO0OO = c32463OooO.f116671OooOo0o;
        c32466OooO0OO.OooO0O0();
        return c32466OooO0OO.f116698OooOooo > 0 ? c32463OooO : C32463OooO.f116670OooOo;
    }

    public static LinkedHashSet OooO0o(Set set, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.OooOOO0.OooO0O0(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final C32934OooO0o0 OooO0o0(oO0OoO0.OooOOO0 oooOOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOOO0, "<this>");
        return C32934OooO0o0.f118820OooO0oO;
    }

    public static Set OooO0oO(Set set, Iterable iterable) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(set, "<this>");
        Collection<?> collectionOooOoO0 = C34431OooOo0.OooOoO0(iterable);
        if (collectionOooOoO0.isEmpty()) {
            return OooOo.o0OO00O(set);
        }
        if (!(collectionOooOoO0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionOooOoO0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionOooOoO0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet OooO0oo(Set set, Iterable elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(set, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        C34431OooOo0.OooOo0o(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set OooOO0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.OooOOO0.OooO0o(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
