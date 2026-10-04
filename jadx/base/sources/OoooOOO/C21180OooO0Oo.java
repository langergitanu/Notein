package OoooOOO;

import Oooo0oO.C21110o0ooOO0;
import Oooo0oO.o0000OO0;
import Oooo0oO.o000O0O0;
import Oooo0oO.o000OO;
import OoooOOO.InterfaceC21182OooO0o0;
import OoooOOo.InterfaceC21208OooOo00;
import kotlin.jvm.internal.OooOOOO;

/* JADX INFO: renamed from: OoooOOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21180OooO0Oo<T> implements InterfaceC21186OooOO0O, o0000OO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC21182OooO0o0 f61429OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C21185OooOO0 f61430OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public T f61431OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f61432OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object[] f61433OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO00o f61434OooOoo = new OooO00o(this);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public InterfaceC21182OooO0o0.OooO00o f61435OooOoo0;

    /* JADX INFO: renamed from: OoooOOO.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C21180OooO0Oo<T> f61436OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C21180OooO0Oo<T> c21180OooO0Oo) {
            super(0);
            this.f61436OooOo0o = c21180OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            C21180OooO0Oo<T> c21180OooO0Oo = this.f61436OooOo0o;
            C21185OooOO0 c21185OooOO0 = c21180OooO0Oo.f61430OooOo0o;
            T t = c21180OooO0Oo.f61431OooOoO;
            if (t != null) {
                return c21185OooOO0.f61445OooO00o.invoke(c21180OooO0Oo, t);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public C21180OooO0Oo(C21185OooOO0 c21185OooOO0, InterfaceC21182OooO0o0 interfaceC21182OooO0o0, String str, T t, Object[] objArr) {
        this.f61430OooOo0o = c21185OooOO0;
        this.f61429OooOo = interfaceC21182OooO0o0;
        this.f61432OooOoO0 = str;
        this.f61431OooOoO = t;
        this.f61433OooOoOO = objArr;
    }

    @Override // OoooOOO.InterfaceC21186OooOO0O
    public final boolean OooO00o(Object obj) {
        InterfaceC21182OooO0o0 interfaceC21182OooO0o0 = this.f61429OooOo;
        return interfaceC21182OooO0o0 == null || interfaceC21182OooO0o0.OooO00o(obj);
    }

    public final void OooO0O0() {
        String strOooO00o;
        InterfaceC21182OooO0o0 interfaceC21182OooO0o0 = this.f61429OooOo;
        if (this.f61435OooOoo0 != null) {
            throw new IllegalArgumentException(("entry(" + this.f61435OooOoo0 + ") is not null").toString());
        }
        if (interfaceC21182OooO0o0 != null) {
            OooO00o oooO00o = this.f61434OooOoo;
            Object objInvoke = oooO00o.invoke();
            if (objInvoke == null || interfaceC21182OooO0o0.OooO00o(objInvoke)) {
                this.f61435OooOoo0 = interfaceC21182OooO0o0.OooO0O0(this.f61432OooOoO0, oooO00o);
                return;
            }
            if (objInvoke instanceof InterfaceC21208OooOo00) {
                InterfaceC21208OooOo00 interfaceC21208OooOo00 = (InterfaceC21208OooOo00) objInvoke;
                if (interfaceC21208OooOo00.OooO00o() == C21110o0ooOO0.f61264OooO00o || interfaceC21208OooOo00.OooO00o() == o000O0O0.f61218OooO00o || interfaceC21208OooOo00.OooO00o() == o000OO.f61221OooO00o) {
                    strOooO00o = "MutableState containing " + interfaceC21208OooOo00.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strOooO00o = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strOooO00o = C21179OooO0OO.OooO00o(objInvoke);
            }
            throw new IllegalArgumentException(strOooO00o);
        }
    }

    @Override // Oooo0oO.o0000OO0
    public final void OooO0o0() {
        OooO0O0();
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0OO() {
        InterfaceC21182OooO0o0.OooO00o oooO00o = this.f61435OooOoo0;
        if (oooO00o != null) {
            oooO00o.unregister();
        }
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0oO() {
        InterfaceC21182OooO0o0.OooO00o oooO00o = this.f61435OooOoo0;
        if (oooO00o != null) {
            oooO00o.unregister();
        }
    }
}
