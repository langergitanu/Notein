package com.orion.notein.data.repo.backup;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource$1", m80623f = "BackupBaiduDatasource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22891OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69846OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22891OooO0o0(BackupBaiduDatasource backupBaiduDatasource, Continuation<? super C22891OooO0o0> continuation) {
        super(2, continuation);
        this.f69846OooOo0o = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22891OooO0o0(this.f69846OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C22891OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = BackupBaiduDatasource.f69830OooO0o;
        this.f69846OooOo0o.OooO00o();
        return C32460OooOooO.f116667OooO00o;
    }
}
