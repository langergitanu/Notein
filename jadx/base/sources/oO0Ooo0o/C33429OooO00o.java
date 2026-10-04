package oO0Ooo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0Ooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.HttpClientCallLogger", m80623f = "HttpClientCallLogger.kt", m80624l = {52}, m80625m = "closeResponseLog")
public final class C33429OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120839OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33432OooO0Oo f120840OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f120841OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33432OooO0Oo f120842OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33429OooO00o(C33432OooO0Oo c33432OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f120842OooOoO0 = c33432OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f120839OooOo = obj;
        this.f120841OooOoO |= Integer.MIN_VALUE;
        return this.f120842OooOoO0.OooO0O0(this);
    }
}
