package oO00O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO00O.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.tls.TLSClientHandshake", m80623f = "TLSClientHandshake.kt", m80624l = {384}, m80625m = "sendClientCertificate")
public final class C32156OooOooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115354OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f115355OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115356OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32156OooOooO(C32161Oooo0O0 c32161Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f115354OooOo = c32161Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f115355OooOo0o = obj;
        this.f115356OooOoO0 |= Integer.MIN_VALUE;
        return this.f115354OooOo.OooOO0(this);
    }
}
