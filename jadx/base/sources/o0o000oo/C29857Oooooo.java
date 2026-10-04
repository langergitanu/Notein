package o0o000oo;

import androidx.lifecycle.AbstractC22019Ooooooo;
import kotlin.coroutines.Continuation;
import o0o00oOo.o0OO00O;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o000oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29857Oooooo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f105891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105892OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC22019Ooooooo f105893OooOoO0;

    public /* synthetic */ C29857Oooooo(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC22019Ooooooo abstractC22019Ooooooo, int i) {
        this.f105892OooOo0o = i;
        this.f105891OooOo = interfaceC33721OooO0o;
        this.f105893OooOoO0 = abstractC22019Ooooooo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f105892OooOo0o) {
            case 0:
                Object objCollect = this.f105891OooOo.collect(new C29858Oooooo0(interfaceC33723OooO0oO, (o00Ooo) this.f105893OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f105891OooOo).collect(new o0OO00O(interfaceC33723OooO0oO, (com.orion.notein.p607ui.notelist.OooO0OO) this.f105893OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}
