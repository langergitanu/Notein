package oOo00Oo0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oOo00Oo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34516OooOo0O {

    /* JADX INFO: renamed from: oOo00Oo0.OooOo0O$OooO00o */
    public static final class OooO00o {
        public static void OooO00o(InterfaceC34516OooOo0O interfaceC34516OooOo0O, InterfaceC32508OooOOOo<? super String, ? super List<String>, C32460OooOooO> interfaceC32508OooOOOo) {
            Iterator<T> it = interfaceC34516OooOo0O.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                interfaceC32508OooOOOo.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    void OooO00o(InterfaceC32508OooOOOo<? super String, ? super List<String>, C32460OooOooO> interfaceC32508OooOOOo);

    boolean OooO0O0();

    Set<Map.Entry<String, List<String>>> entries();

    String get(String str);

    boolean isEmpty();
}
