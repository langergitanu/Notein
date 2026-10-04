package com.orion.notein.data.repo.transactions;

import kotlin.coroutines.Continuation;
import o0OOoooO.C28000OooO0o;
import o0Ooo000.C29352OooOoO;
import o0Ooo000.C29355OooOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22961Ooooo00 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f70295OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70296OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f70297OooOoO0;

    public /* synthetic */ C22961Ooooo00(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f70296OooOo0o = i;
        this.f70295OooOo = interfaceC33721OooO0o;
        this.f70297OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f70296OooOo0o) {
            case 0:
                Object objCollect = ((C33769Ooooo0o) this.f70295OooOo).f121747OooOo0o.collect(new C22960OoooOoo(interfaceC33723OooO0oO, (String) this.f70297OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((C28000OooO0o) this.f70295OooOo).collect(new C29352OooOoO(interfaceC33723OooO0oO, (C29355OooOoo) this.f70297OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
