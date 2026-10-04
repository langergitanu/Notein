package io.ktor.client.engine.cio;

import java.util.ArrayList;
import oO00O.C32165Oooo0oO;
import oO00O0oo.C32222OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C32165Oooo0oO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32222OooOO0o f80396OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80397OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(C23938OooOOo0 c23938OooOOo0, C32222OooOO0o c32222OooOO0o) {
        super(1);
        this.f80397OooOo0o = c23938OooOOo0;
        this.f80396OooOo = c32222OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(C32165Oooo0oO c32165Oooo0oO) {
        C32165Oooo0oO tls = c32165Oooo0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tls, "$this$tls");
        C32165Oooo0oO other = this.f80397OooOo0o.f80432OooOoO.f80385OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        C34431OooOo0.OooOo0o(tls.f115389OooO00o, other.f115389OooO00o);
        ArrayList arrayList = other.f115390OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<set-?>");
        tls.f115390OooO0O0 = arrayList;
        String hostName = other.f115391OooO0OO;
        tls.f115391OooO0OO = hostName;
        if (hostName == null) {
            hostName = this.f80396OooOo.f115663OooO00o.getHostName();
            kotlin.jvm.internal.OooOOO0.OooO0o(hostName, "address.hostName");
        }
        tls.f115391OooO0OO = hostName;
        return C32460OooOooO.f116667OooO00o;
    }
}
