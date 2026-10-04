package Oooo0oO;

import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.AbstractC21223Oooo0OO;
import OoooOOo.AbstractC21225Oooo0o0;
import OoooOOo.C21200OooOOO0;
import OoooOOo.InterfaceC21208OooOo00;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public class o000<T> extends AbstractC21223Oooo0OO implements InterfaceC21208OooOo00<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o000O000<T> f61049OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO00o<T> f61050OooOoO0;

    public static final class OooO00o<T> extends AbstractC21225Oooo0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public T f61051OooO0OO;

        public OooO00o(T t) {
            this.f61051OooO0OO = t;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final void OooO00o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f61051OooO0OO = ((OooO00o) abstractC21225Oooo0o0).f61051OooO0OO;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final AbstractC21225Oooo0o0 OooO0O0() {
            return new OooO00o(this.f61051OooO0OO);
        }
    }

    public o000(T t, o000O000<T> o000o0002) {
        this.f61049OooOo = o000o0002;
        OooO00o<T> oooO00o = new OooO00o<>(t);
        if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
            OooO00o oooO00o2 = new OooO00o(t);
            oooO00o2.f61574OooO00o = 1;
            oooO00o.f61575OooO0O0 = oooO00o2;
        }
        this.f61050OooOoO0 = oooO00o;
    }

    @Override // OoooOOo.InterfaceC21208OooOo00
    public final o000O000<T> OooO00o() {
        return this.f61049OooOo;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final void OooO0Oo(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f61050OooOoO0 = (OooO00o) abstractC21225Oooo0o0;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0, AbstractC21225Oooo0o0 abstractC21225Oooo0o02, AbstractC21225Oooo0o0 abstractC21225Oooo0o03) {
        if (this.f61049OooOo.OooO00o(((OooO00o) abstractC21225Oooo0o02).f61051OooO0OO, ((OooO00o) abstractC21225Oooo0o03).f61051OooO0OO)) {
            return abstractC21225Oooo0o02;
        }
        return null;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o0() {
        return this.f61050OooOoO0;
    }

    @Override // Oooo0oO.o000O0
    public final T getValue() {
        return ((OooO00o) C21200OooOOO0.OooOo00(this.f61050OooOoO0, this)).f61051OooO0OO;
    }

    @Override // Oooo0oO.o00oO0O
    public final void setValue(T t) {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        OooO00o oooO00o = (OooO00o) C21200OooOOO0.OooO(this.f61050OooOoO0);
        if (this.f61049OooOo.OooO00o(oooO00o.f61051OooO0OO, t)) {
            return;
        }
        OooO00o<T> oooO00o2 = this.f61050OooOoO0;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
            ((OooO00o) C21200OooOOO0.OooOOOO(oooO00o2, this, abstractC21194OooO0oOOooOO0O, oooO00o)).f61051OooO0OO = t;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((OooO00o) C21200OooOOO0.OooO(this.f61050OooOoO0)).f61051OooO0OO + ")@" + hashCode();
    }
}
