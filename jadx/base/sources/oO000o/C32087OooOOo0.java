package oO000o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo00Oo0.C34515OooOo0;

/* JADX INFO: renamed from: oO000o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32087OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<String> f114938OooO00o;

    static {
        List<String> list = C32190OooOOo0.f115537OooO00o;
        f114938OooO00o = oOo000Oo.OooOOO.OoooOo0(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }

    public static final void OooO00o(oO00O0o0.OooOOO0 oooOOO0, oO00O0oO.OooO0OO oooO0OO, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        String string;
        String string2;
        OooOOOO oooOOOO = new OooOOOO(oooOOO0, oooO0OO);
        C32187OooOO0o c32187OooOO0o = new C32187OooOO0o();
        oooOOOO.invoke(c32187OooOO0o);
        Map<String, List<String>> values = c32187OooOO0o.f123698OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        oOo00Oo0.OooOO0O oooOO0O = new oOo00Oo0.OooOO0O();
        for (Map.Entry<String, List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(value.get(i));
            }
            oooOO0O.put(key, arrayList);
        }
        C32086OooOOOo c32086OooOOOo = new C32086OooOOOo(interfaceC32508OooOOOo);
        Iterator it = oooOO0O.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            c32086OooOOOo.invoke((String) entry2.getKey(), (List) entry2.getValue());
        }
        List<String> list = C32190OooOOo0.f115537OooO00o;
        if (oooOOO0.get("User-Agent") == null && oooO0OO.OooO0OO().get("User-Agent") == null) {
            boolean z = C34515OooOo0.f123700OooO00o;
            interfaceC32508OooOOOo.invoke("User-Agent", "Ktor client");
        }
        C32183OooO0Oo c32183OooO0OoOooO0O0 = oooO0OO.OooO0O0();
        if ((c32183OooO0OoOooO0O0 == null || (string = c32183OooO0OoOooO0O0.toString()) == null) && (string = oooO0OO.OooO0OO().get("Content-Type")) == null) {
            string = oooOOO0.get("Content-Type");
        }
        Long lOooO00o = oooO0OO.OooO00o();
        if ((lOooO00o == null || (string2 = lOooO00o.toString()) == null) && (string2 = oooO0OO.OooO0OO().get("Content-Length")) == null) {
            string2 = oooOOO0.get("Content-Length");
        }
        if (string != null) {
            interfaceC32508OooOOOo.invoke("Content-Type", string);
        }
        if (string2 != null) {
            interfaceC32508OooOOOo.invoke("Content-Length", string2);
        }
    }
}
