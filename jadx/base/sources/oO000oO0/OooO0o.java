package oO000oO0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ResponseBody f115115OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(ResponseBody responseBody) {
        super(1);
        this.f115115OooOo0o = responseBody;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        ResponseBody responseBody = this.f115115OooOo0o;
        if (responseBody != null) {
            responseBody.close();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
