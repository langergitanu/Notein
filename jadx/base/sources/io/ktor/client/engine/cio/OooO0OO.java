package io.ktor.client.engine.cio;

import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f80370OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80371OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO00o oooO00o, String str) {
        super(0);
        this.f80371OooOo0o = oooO00o;
        this.f80370OooOo = str;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        this.f80371OooOo0o.f80354OooOoo.remove(this.f80370OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
