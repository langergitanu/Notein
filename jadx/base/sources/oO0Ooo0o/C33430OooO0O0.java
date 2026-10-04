package oO0Ooo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0Ooo0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.HttpClientCallLogger", m80623f = "HttpClientCallLogger.kt", m80624l = {34}, m80625m = "logResponseBody")
public final class C33430OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f120843OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33432OooO0Oo f120844OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33432OooO0Oo f120845OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120846OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f120847OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33430OooO0O0(C33432OooO0Oo c33432OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f120845OooOoO = c33432OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f120846OooOoO0 = obj;
        this.f120847OooOoOO |= Integer.MIN_VALUE;
        return this.f120845OooOoO.OooO0OO(null, this);
    }
}
