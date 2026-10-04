package com.orion.notein.data.repo.backup;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupGoogleDriveDatasource$setVendor$2", m80623f = "BackupGoogleDriveDatasource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22911Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f69974OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f69975OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22911Oooo00o(int i, Continuation<? super C22911Oooo00o> continuation) {
        super(2, continuation);
        this.f69974OooOo = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C22911Oooo00o c22911Oooo00o = new C22911Oooo00o(this.f69974OooOo, continuation);
        c22911Oooo00o.f69975OooOo0o = obj;
        return c22911Oooo00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C22911Oooo00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f69975OooOo0o;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
        c24334OooO0O0.OooO0oO(C27205OooO0OO.f95007OooO0o0, new Integer(this.f69974OooOo));
        return C32460OooOooO.f116667OooO00o;
    }
}
