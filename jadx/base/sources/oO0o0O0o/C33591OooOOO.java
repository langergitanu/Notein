package oO0o0O0o;

import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import io.ktor.utils.p616io.C23988OooooOO;
import io.ktor.utils.p616io.Oooo000;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33576OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0o0O0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33591OooOOO extends C23988OooooOO {
    public static String OooO(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (C33599OooOo0O.Oooo0o0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listOooOo0 = C33576OooOOOo.OooOo0(new C33598OooOo0(str));
        int length = str.length();
        listOooOo0.size();
        int iOooOO0O = C34429OooOOo0.OooOO0O(listOooOo0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listOooOo0) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iOooOO0O) || !C33599OooOo0O.Oooo0o0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!Oooo000.OooO0o0(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && C33595OooOOo.OooOo(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        OooOo.OoooOO0(arrayList, sb, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 124);
        return sb.toString();
    }

    public static String OooO0oO(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        final String str2 = "    ";
        return C33576OooOOOo.OooOOo0(C33576OooOOOo.OooOOoo(new C33598OooOo0(str), new InterfaceC32507OooOO0o() { // from class: oO0o0O0o.OooOOO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                String it = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(it);
                String str3 = str2;
                return zOooo0o0 ? it.length() < str3.length() ? str3 : it : C21111o0ooOoO.OooO0Oo(str3, it);
            }
        }), IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static String OooO0oo(String str) {
        int length;
        Comparable comparable;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        List listOooOo0 = C33576OooOOOo.OooOo0(new C33598OooOo0(str));
        List list = listOooOo0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C33599OooOo0O.Oooo0o0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!Oooo000.OooO0o0(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listOooOo0.size();
        int iOooOO0O = C34429OooOOo0.OooOO0O(listOooOo0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            String str3 = (String) obj2;
            String strOooooo = ((length == 0 || length == iOooOO0O) && C33599OooOo0O.Oooo0o0(str3)) ? null : C33600OooOo0o.Oooooo(iIntValue, str3);
            if (strOooooo != null) {
                arrayList3.add(strOooooo);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        OooOo.OoooOO0(arrayList3, sb, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 124);
        return sb.toString();
    }
}
