package com.orion.notein.data.repo.backup;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource$isAuthorized$3", m80623f = "BackupBaiduDatasource.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3, StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
public final class C22897OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Boolean>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f69887OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f69888OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69889OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22897OooOOo0(BackupBaiduDatasource backupBaiduDatasource, Continuation<? super C22897OooOOo0> continuation) {
        super(2, continuation);
        this.f69889OooOoO0 = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C22897OooOOo0 c22897OooOOo0 = new C22897OooOOo0(this.f69889OooOoO0, continuation);
        c22897OooOOo0.f69887OooOo = obj;
        return c22897OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C22897OooOOo0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f69888OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f69887OooOo;
            this.f69887OooOo = interfaceC33723OooO0oO;
            this.f69888OooOo0o = 1;
            AbstractC24338OooO0o0.OooO00o<String> oooO00o = BackupBaiduDatasource.f69830OooO0o;
            obj = this.f69889OooOoO0.OooO0Oo(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f69887OooOo;
        C32446OooOOOo.OooO0O0(obj);
        CharSequence charSequence = (CharSequence) obj;
        Boolean boolValueOf = Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
        this.f69887OooOo = null;
        this.f69888OooOo0o = 2;
    }
}
