package com.orion.notein.data.repo.transactions;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22941OooOooo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f70157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70158OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f70159OooOoO0;

    public /* synthetic */ C22941OooOooo(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f70158OooOo0o = i;
        this.f70157OooOo = interfaceC33721OooO0o;
        this.f70159OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f70158OooOo0o) {
            case 0:
                Object objCollect = this.f70157OooOo.collect(new C22940OooOooO(interfaceC33723OooO0oO, (GoogleBillingDataSource) this.f70159OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f70157OooOo.collect(new o0OO0o.OooO00o(interfaceC33723OooO0oO, (o0OO0o.OooO0O0) this.f70159OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
