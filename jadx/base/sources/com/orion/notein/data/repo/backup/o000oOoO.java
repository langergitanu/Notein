package com.orion.notein.data.repo.backup;

import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupRepoImpl$useNetworkDisk$2", m80623f = "BackupRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f70014OooOo0o;

    public o000oOoO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o000oOoO o000oooo2 = new o000oOoO(2, continuation);
        o000oooo2.f70014OooOo0o = obj;
        return o000oooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((o000oOoO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f70014OooOo0o;
        c24334OooO0O0.OooO0o(C27205OooO0OO.f95006OooO0o);
        c24334OooO0O0.OooO0oO(C27205OooO0OO.f95007OooO0o0, new Integer(BackupFile.DiskVendor.None.ordinal()));
        return C32460OooOooO.f116667OooO00o;
    }
}
