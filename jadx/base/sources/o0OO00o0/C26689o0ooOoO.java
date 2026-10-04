package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30410OooOooO;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26689o0ooOoO implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92153OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92154OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f92155OooOoO0;

    public /* synthetic */ C26689o0ooOoO(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f92154OooOo0o = i;
        this.f92153OooOo = interfaceC33721OooO0o;
        this.f92155OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92154OooOo0o) {
            case 0:
                Object objCollect = this.f92153OooOo.collect(new o0ooOOo(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f92155OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f92153OooOo).collect(new C30410OooOooO(interfaceC33723OooO0oO, (C30394OooOOOO) this.f92155OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}
