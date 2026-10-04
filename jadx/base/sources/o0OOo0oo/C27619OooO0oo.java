package o0OOo0oo;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudEventHandlerUseCase", m80623f = "CloudEventHandlerUseCase.kt", m80624l = {152, 153, 158}, m80625m = "handleAccountEvent")
public final class C27619OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27618OooO0oO f97120OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97121OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27618OooO0oO f97122OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27619OooO0oo(C27618OooO0oO c27618OooO0oO, Continuation<? super C27619OooO0oo> continuation) {
        super(continuation);
        this.f97122OooOoO0 = c27618OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97119OooOo = obj;
        this.f97121OooOoO |= Integer.MIN_VALUE;
        return C27618OooO0oO.OooO00o(this.f97122OooOoO0, null, this);
    }
}
