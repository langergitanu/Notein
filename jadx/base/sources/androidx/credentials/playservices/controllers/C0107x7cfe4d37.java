package androidx.credentials.playservices.controllers;

import kotlin.Metadata;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.OooO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m80612d2 = {"", "T1", "T2", "R2", "R1", "E1", "LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class C0107x7cfe4d37 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
    final /* synthetic */ C24034Oooo00O<OooO0o> $exception;
    final /* synthetic */ InterfaceC32507OooOO0o<OooO0o, C32460OooOooO> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0107x7cfe4d37(InterfaceC32507OooOO0o<? super OooO0o, C32460OooOooO> interfaceC32507OooOO0o, C24034Oooo00O<OooO0o> c24034Oooo00O) {
        super(0);
        this.$onError = interfaceC32507OooOO0o;
        this.$exception = c24034Oooo00O;
    }

    @Override // oO0O000o.OooO00o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
        invoke2();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onError.invoke(this.$exception.f80942OooOo0o);
    }
}
