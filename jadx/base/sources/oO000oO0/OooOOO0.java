package oO000oO0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo00Oo0.InterfaceC34516OooOo0O;
import oOo00Oo0.OooOo;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements oO00O0o0.OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Headers f115142OooO0OO;

    public OooOOO0(Headers headers) {
        this.f115142OooO0OO = headers;
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final void OooO00o(InterfaceC32508OooOOOo<? super String, ? super List<String>, C32460OooOooO> interfaceC32508OooOOOo) {
        InterfaceC34516OooOo0O.OooO00o.OooO00o(this, (OooOo.OooO00o) interfaceC32508OooOOOo);
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final Set<Map.Entry<String, List<String>>> entries() {
        return this.f115142OooO0OO.OooO0o().entrySet();
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final String get(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List<String> listOooO0oo = this.f115142OooO0OO.OooO0oo(name);
        if (listOooO0oo.isEmpty()) {
            listOooO0oo = null;
        }
        if (listOooO0oo != null) {
            return (String) oOo000Oo.OooOo.Oooo(listOooO0oo);
        }
        return null;
    }
}
