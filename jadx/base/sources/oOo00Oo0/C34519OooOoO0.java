package oOo00Oo0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oOo00Oo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34519OooOoO0 implements InterfaceC34516OooOo0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, List<String>> f123715OooO0OO;

    public C34519OooOoO0(Map values) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        OooOO0O oooOO0O = new OooOO0O();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            oooOO0O.put(str, arrayList);
        }
        this.f123715OooO0OO = oooOO0O;
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final void OooO00o(InterfaceC32508OooOOOo<? super String, ? super List<String>, C32460OooOooO> interfaceC32508OooOOOo) {
        for (Map.Entry<String, List<String>> entry : this.f123715OooO0OO.entrySet()) {
            interfaceC32508OooOOOo.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final Set<Map.Entry<String, List<String>>> entries() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.f123715OooO0OO.entrySet();
        kotlin.jvm.internal.OooOOO0.OooO0oO(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC34516OooOo0O)) {
            return false;
        }
        InterfaceC34516OooOo0O interfaceC34516OooOo0O = (InterfaceC34516OooOo0O) obj;
        if (true != interfaceC34516OooOo0O.OooO0O0()) {
            return false;
        }
        return entries().equals(interfaceC34516OooOo0O.entries());
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final String get(String str) {
        List<String> list = this.f123715OooO0OO.get(str);
        if (list != null) {
            return (String) oOo000Oo.OooOo.Oooo(list);
        }
        return null;
    }

    public final int hashCode() {
        Set<Map.Entry<String, List<String>>> setEntries = entries();
        return setEntries.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final boolean isEmpty() {
        return this.f123715OooO0OO.isEmpty();
    }
}
