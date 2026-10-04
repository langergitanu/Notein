package oO00O0o0;

import OoooOOo.C21197OooOO0O;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oOo000Oo.C34428OooOOo;
import oOo00Oo0.C34519OooOoO0;
import oOo00Oo0.InterfaceC34517OooOo0o;

/* JADX INFO: renamed from: oO00O0o0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32213OoooO0O implements InterfaceC34517OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32197OooOoOO f115609OooO00o;

    public C32213OoooO0O(C32197OooOoOO c32197OooOoOO) {
        this.f115609OooO00o = c32197OooOoOO;
    }

    @Override // oOo00Oo0.InterfaceC34517OooOo0o
    public final void OooO00o(String name, Iterable<String> values) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        String strOooO0o = OooO0O0.OooO0o(name, false);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(values, 10));
        for (String str : values) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
            arrayList.add(OooO0O0.OooO0o(str, true));
        }
        this.f115609OooO00o.OooO00o(strOooO0o, arrayList);
    }

    @Override // oOo00Oo0.InterfaceC34517OooOo0o
    public final Set<Map.Entry<String, List<String>>> entries() {
        return ((C34519OooOoO0) C21197OooOO0O.OooO0OO(this.f115609OooO00o)).entries();
    }
}
