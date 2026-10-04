package oOo00Oo0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public class OooOo implements InterfaceC34517OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, List<String>> f123698OooO00o = new OooOO0O();

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<String, List<? extends String>, C32460OooOooO> {
        public OooO00o() {
            super(2);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(String str, List<? extends String> list) {
            String name = str;
            List<? extends String> values = list;
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
            OooOo.this.OooO00o(name, values);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oOo00Oo0.InterfaceC34517OooOo0o
    public final void OooO00o(String name, Iterable<String> values) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        List<String> listOooO0Oo = OooO0Oo(name);
        for (String str : values) {
            OooO0oo(str);
            listOooO0Oo.add(str);
        }
    }

    public final void OooO0O0(String name, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        OooO0oo(value);
        OooO0Oo(name).add(value);
    }

    public final void OooO0OO(InterfaceC34516OooOo0O stringValues) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stringValues, "stringValues");
        stringValues.OooO00o(new OooO00o());
    }

    public final List<String> OooO0Oo(String str) {
        Map<String, List<String>> map = this.f123698OooO00o;
        List<String> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        OooO0oO(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public final List<String> OooO0o(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return this.f123698OooO00o.get(name);
    }

    public final String OooO0o0(String str) {
        List<String> listOooO0o = OooO0o(str);
        if (listOooO0o != null) {
            return (String) oOo000Oo.OooOo.Oooo(listOooO0o);
        }
        return null;
    }

    public void OooO0oO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
    }

    public void OooO0oo(String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
    }

    @Override // oOo00Oo0.InterfaceC34517OooOo0o
    public final Set<Map.Entry<String, List<String>>> entries() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.f123698OooO00o.entrySet();
        kotlin.jvm.internal.OooOOO0.OooO0oO(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }
}
