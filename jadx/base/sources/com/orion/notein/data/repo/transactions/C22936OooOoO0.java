package com.orion.notein.data.repo.transactions;

import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$restorePurchases$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {1200, 710}, m80625m = "invokeSuspend")
public final class C22936OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public GoogleBillingDataSource f70143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f70144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f70146OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22936OooOoO0(GoogleBillingDataSource googleBillingDataSource, Continuation<? super C22936OooOoO0> continuation) {
        super(2, continuation);
        this.f70145OooOoO = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22936OooOoO0(this.f70145OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<C32460OooOooO>> continuation) {
        return ((C22936OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|40|(1:(1:(6:6|41|7|23|36|37)(2:13|14))(1:15))(3:16|(0)|21)|43|19|(4:22|23|36|37)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        r2.OooOOO0(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        throw r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        GoogleBillingDataSource googleBillingDataSource;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        C27174OooO0O0 c27174OooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = this.f70146OooOoO0;
        try {
            if (r2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                googleBillingDataSource = this.f70145OooOoO;
                interfaceC33895OooO00o = googleBillingDataSource.f70024OooO0o;
                this.f70144OooOo0o = interfaceC33895OooO00o;
                this.f70143OooOo = googleBillingDataSource;
                this.f70146OooOoO0 = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f70144OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c27174OooO0O0 = (C27174OooO0O0) obj;
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o.OooO0OO("restorePurchases: failed. ".concat(C32435OooO0Oo.OooO0O0(exc)), new Object[0]);
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c27174OooO0O0 = new C27174OooO0O0(false, null, "399999", message, 2);
                }
                interfaceC33895OooO00o2.OooOOO0(null);
                return c27174OooO0O0;
            }
            googleBillingDataSource = this.f70143OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f70144OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f70144OooOo0o = interfaceC33895OooO00o;
            this.f70143OooOo = null;
            this.f70146OooOoO0 = 2;
            Object objOooO0O0 = GoogleBillingDataSource.OooO0O0(googleBillingDataSource, this);
            if (objOooO0O0 != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                obj = objOooO0O0;
                c27174OooO0O0 = (C27174OooO0O0) obj;
                interfaceC33895OooO00o2.OooOOO0(null);
                return c27174OooO0O0;
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            th = th;
        }
    }
}
