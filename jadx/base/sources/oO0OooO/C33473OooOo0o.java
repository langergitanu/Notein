package oO0OooO;

import oO0Ooo.InterfaceC33342OoooOo0;

/* JADX INFO: renamed from: oO0OooO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33473OooOo0o {
    public static final String OooO00o(InterfaceC33342OoooOo0 interfaceC33342OoooOo0) {
        StringBuilder sb = new StringBuilder();
        OooO0O0("type: " + interfaceC33342OoooOo0, sb);
        OooO0O0("hashCode: " + interfaceC33342OoooOo0.hashCode(), sb);
        OooO0O0("javaClass: " + interfaceC33342OoooOo0.getClass().getCanonicalName(), sb);
        for (oO0O0OO.OooOO0O oooOO0OOooO0OO = interfaceC33342OoooOo0.OooO0OO(); oooOO0OOooO0OO != null; oooOO0OOooO0OO = oooOO0OOooO0OO.OooO0Oo()) {
            OooO0O0("fqName: ".concat(oO0OOOO.OooO0OO.f118961OooO00o.OooOo0O(oooOO0OOooO0OO)), sb);
            OooO0O0("javaClass: " + oooOO0OOooO0OO.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void OooO0O0(String str, StringBuilder sb) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }
}
