package oO0Oo0o0;

import OooOoOO.C20519OooO0Oo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import oO00ooO.C32447OooOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32634OoooOOo;
import oO0OOo0.C33054OooO0Oo;
import oO0Oo0o0.OooOOO0;
import oO0Ooo.AbstractC33350Oooooo;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0Oo0o0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33223OooOOo0 implements OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f120232OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33356ooOO f120233OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap f120234OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f120235OooO0o0;

    /* JADX INFO: renamed from: oO0Oo0o0.OooOOo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Collection<? extends oO0O0OO.OooOO0O>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Collection<? extends oO0O0OO.OooOO0O> invoke() {
            C33223OooOOo0 c33223OooOOo0 = C33223OooOOo0.this;
            return c33223OooOOo0.OooO0oo(OooOOO0.OooO00o.OooO00o(c33223OooOOo0.f120232OooO0O0, null, 3));
        }
    }

    /* JADX INFO: renamed from: oO0Oo0o0.OooOOo0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C33356ooOO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33356ooOO f120237OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33356ooOO c33356ooOO) {
            super(0);
            this.f120237OooOo0o = c33356ooOO;
        }

        @Override // oO0O000o.OooO00o
        public final C33356ooOO invoke() {
            AbstractC33350Oooooo abstractC33350OoooooOooO0oO = this.f120237OooOo0o.OooO0oO();
            abstractC33350OoooooOooO0oO.getClass();
            return C33356ooOO.OooO0o0(abstractC33350OoooooOooO0oO);
        }
    }

    public C33223OooOOo0(OooOO0 workerScope, C33356ooOO givenSubstitutor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(workerScope, "workerScope");
        kotlin.jvm.internal.OooOOO0.OooO0oO(givenSubstitutor, "givenSubstitutor");
        this.f120232OooO0O0 = workerScope;
        C20519OooO0Oo.OooO0OO(new OooO0O0(givenSubstitutor));
        AbstractC33350Oooooo abstractC33350OoooooOooO0oO = givenSubstitutor.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(abstractC33350OoooooOooO0oO, "givenSubstitutor.substitution");
        this.f120233OooO0OO = C33356ooOO.OooO0o0(C33054OooO0Oo.OooO0O0(abstractC33350OoooooOooO0oO));
        this.f120235OooO0o0 = C20519OooO0Oo.OooO0OO(new OooO00o());
    }

    public final <D extends oO0O0OO.OooOO0O> D OooO(D d) {
        C33356ooOO c33356ooOO = this.f120233OooO0OO;
        if (c33356ooOO.f120634OooO00o.OooO0o0()) {
            return d;
        }
        if (this.f120234OooO0Oo == null) {
            this.f120234OooO0Oo = new HashMap();
        }
        HashMap map = this.f120234OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(map);
        Object objOooO0O0 = map.get(d);
        if (objOooO0O0 == null) {
            if (!(d instanceof InterfaceC32634OoooOOo)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            objOooO0O0 = ((InterfaceC32634OoooOOo) d).OooO0O0(c33356ooOO);
            if (objOooO0O0 == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, objOooO0O0);
        }
        return (D) objOooO0O0;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO00o() {
        return this.f120232OooO0O0.OooO00o();
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return OooO0oo(this.f120232OooO0O0.OooO0O0(name, oooO0O0));
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0OO() {
        return this.f120232OooO0O0.OooO0OO();
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        return this.f120232OooO0O0.OooO0Oo();
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection<? extends InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return OooO0oo(this.f120232OooO0O0.OooO0o(name, oooO0O0));
    }

    @Override // oO0Oo0o0.OooOOO0
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return (Collection) this.f120235OooO0o0.getValue();
    }

    @Override // oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = this.f120232OooO0O0.OooO0oO(name, location);
        if (interfaceC32598OooO0ooOooO0oO != null) {
            return (InterfaceC32598OooO0oo) OooO(interfaceC32598OooO0ooOooO0oO);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends oO0O0OO.OooOO0O> Collection<D> OooO0oo(Collection<? extends D> collection) {
        if (this.f120233OooO0OO.f120634OooO00o.OooO0o0() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(OooO((oO0O0OO.OooOO0O) it.next()));
        }
        return linkedHashSet;
    }
}
