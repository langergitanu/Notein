package oO000oO0;

import java.util.List;
import oO00O0o0.C32190OooOOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import okhttp3.Request;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<String, String, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Request.Builder f115127OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(Request.Builder builder) {
        super(2);
        this.f115127OooOo0o = builder;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(String str, String str2) {
        String key = str;
        String value = str2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        List<String> list = C32190OooOOo0.f115537OooO00o;
        if (!key.equals("Content-Length")) {
            this.f115127OooOo0o.OooO00o(key, value);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
