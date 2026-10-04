package o000oo0;

import kotlin.coroutines.Continuation;
import o00OO0oO.C25003OooO0O0;
import o0OO0o0O.C26922OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o000oo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24664OooOO0O implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f83548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83549OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f83550OooOoO0;

    public /* synthetic */ C24664OooOO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f83549OooOo0o = i;
        this.f83548OooOo = interfaceC33721OooO0o;
        this.f83550OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f83549OooOo0o) {
            case 0:
                ((C33772OooooOo) this.f83548OooOo).collect(new C24663OooOO0(interfaceC33723OooO0oO, (String[]) this.f83550OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
            default:
                Object objCollect = this.f83548OooOo.collect(new C26922OooO0Oo(interfaceC33723OooO0oO, (C25003OooO0O0) this.f83550OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }
}
