package oO0o0OoO;

import kotlin.coroutines.Continuation;
import o0OoOO00.C29023Oooo0o;
import o0oOoOo.C31071OoooO;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33628OooOoo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33789OooO<S, T> extends AbstractC33796OooO0oO<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<S> f121820OooOoO;

    public AbstractC33789OooO(int i, EnumC33692OooO0OO enumC33692OooO0OO, InterfaceC33721OooO0o interfaceC33721OooO0o, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(interfaceC34415OooO0oo, i, enumC33692OooO0OO);
        this.f121820OooOoO = interfaceC33721OooO0o;
    }

    public abstract Object OooO(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation);

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final Object OooO0O0(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO = OooO(new C33815OooOoOO(interfaceC33712OooOo0O), continuation);
        return objOooO == EnumC32485OooO00o.f116726OooOo0o ? objOooO : C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO, oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        if (this.f121834OooOo == -3) {
            InterfaceC34415OooO0oo context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            C31071OoooO c31071OoooO = new C31071OoooO(1);
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121835OooOo0o;
            InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = !((Boolean) interfaceC34415OooO0oo.fold(bool, c31071OoooO)).booleanValue() ? context.plus(interfaceC34415OooO0oo) : C33628OooOoo.OooO00o(context, interfaceC34415OooO0oo, false);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34415OooO0ooPlus, context)) {
                Object objOooO = OooO(interfaceC33723OooO0oO, continuation);
                return objOooO == EnumC32485OooO00o.f116726OooOo0o ? objOooO : C32460OooOooO.f116667OooO00o;
            }
            InterfaceC34412OooO0o.OooO00o oooO00o = InterfaceC34412OooO0o.OooO00o.f123422OooOo0o;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34415OooO0ooPlus.get(oooO00o), context.get(oooO00o))) {
                InterfaceC34415OooO0oo context2 = continuation.getContext();
                if (!(interfaceC33723OooO0oO instanceof C33815OooOoOO) && !(interfaceC33723OooO0oO instanceof C33809OooOo0)) {
                    interfaceC33723OooO0oO = new C33818OooOooO(interfaceC33723OooO0oO, context2);
                }
                Object objOooO00o = C29023Oooo0o.OooO00o(interfaceC34415OooO0ooPlus, interfaceC33723OooO0oO, C33844OooOoO0.OooO0O0(interfaceC34415OooO0ooPlus), new C33797OooO0oo(this, null), continuation);
                return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
            }
        }
        Object objCollect = super.collect(interfaceC33723OooO0oO, continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final String toString() {
        return this.f121820OooOoO + " -> " + super.toString();
    }
}
