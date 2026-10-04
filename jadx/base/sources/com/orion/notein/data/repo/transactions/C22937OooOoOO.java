package com.orion.notein.data.repo.transactions;

import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$showErrorToast$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22937OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f70147OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70148OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70149OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22937OooOoOO(GoogleBillingDataSource googleBillingDataSource, int i, String str, Continuation<? super C22937OooOoOO> continuation) {
        super(2, continuation);
        this.f70148OooOo0o = googleBillingDataSource;
        this.f70147OooOo = i;
        this.f70149OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22937OooOoOO(this.f70148OooOo0o, this.f70147OooOo, this.f70149OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C22937OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        GoogleBillingDataSource googleBillingDataSource = this.f70148OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            String string = googleBillingDataSource.f70022OooO0OO.getResources().getString(R.string.pbl_error, new Integer(this.f70147OooOo), this.f70149OooOoO0);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0OO(googleBillingDataSource.f70022OooO0OO, string);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0O0(e);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
