package com.orion.notein.data.repo.transactions;

import kotlin.coroutines.Continuation;
import o0Ooo000.C29347OooOo;
import o0Ooo000.C29355OooOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33780o00Ooo;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
public final class o000oOoO implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f70336OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70337OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f70338OooOoO0;

    public /* synthetic */ o000oOoO(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f70337OooOo0o = i;
        this.f70336OooOo = interfaceC33721OooO0o;
        this.f70338OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f70337OooOo0o) {
            case 0:
                Object objCollect = this.f70336OooOo.collect(new C22955OoooOO0(interfaceC33723OooO0oO, (C22949Oooo0oO) this.f70338OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((C33799OooOO0O) this.f70336OooOo).collect(new C29347OooOo(interfaceC33723OooO0oO, (C29355OooOoo) this.f70338OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect3 = ((InterfaceC33780o00Ooo) this.f70336OooOo).collect(new o0o0O000.OooOo00(interfaceC33723OooO0oO, (String) this.f70338OooOoO0), continuation);
                if (objCollect3 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
