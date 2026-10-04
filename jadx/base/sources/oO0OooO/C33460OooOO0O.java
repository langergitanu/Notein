package oO0OooO;

import OooOoOO.C20519OooO0Oo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0OooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33460OooOO0O implements oO0OOo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33348OooooOO f120919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0O000o.OooO00o<? extends List<? extends AbstractC33354o00o0O>> f120920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33460OooOO0O f120921OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC32637OoooOoo f120922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f120923OooO0o0;

    /* JADX INFO: renamed from: oO0OooO.OooOO0O$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends AbstractC33354o00o0O>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends AbstractC33354o00o0O> invoke() {
            oO0O000o.OooO00o<? extends List<? extends AbstractC33354o00o0O>> oooO00o = C33460OooOO0O.this.f120920OooO0O0;
            if (oooO00o != null) {
                return oooO00o.invoke();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: oO0OooO.OooOO0O$OooO0O0 */
    public final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends AbstractC33354o00o0O>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC33457OooO0oO f120925OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
            super(0);
            this.f120925OooOo = abstractC33457OooO0oO;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final List<? extends AbstractC33354o00o0O> invoke() {
            Iterable iterable = (List) C33460OooOO0O.this.f120923OooO0o0.getValue();
            if (iterable == null) {
                iterable = C34434OooOoO.f123453OooOo0o;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC33354o00o0O) it.next()).o00000O(this.f120925OooOo));
            }
            return arrayList;
        }
    }

    public C33460OooOO0O() {
        throw null;
    }

    public C33460OooOO0O(InterfaceC33348OooooOO projection, oO0O000o.OooO00o<? extends List<? extends AbstractC33354o00o0O>> oooO00o, C33460OooOO0O c33460OooOO0O, InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(projection, "projection");
        this.f120919OooO00o = projection;
        this.f120920OooO0O0 = oooO00o;
        this.f120921OooO0OO = c33460OooOO0O;
        this.f120922OooO0Oo = interfaceC32637OoooOoo;
        this.f120923OooO0o0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooO00o());
    }

    @Override // oO0OOo0.OooO0O0
    public final InterfaceC33348OooooOO OooO0O0() {
        return this.f120919OooO00o;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final InterfaceC32598OooO0oo OooO0OO() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection OooO0Oo() {
        Collection collection = (List) this.f120923OooO0o0.getValue();
        if (collection == null) {
            collection = C34434OooOoO.f123453OooOo0o;
        }
        return collection;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        AbstractC33320OooOoo type = this.f120919OooO00o.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "projection.type");
        return C33538OooO0OO.OooO0o0(type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C33460OooOO0O.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C33460OooOO0O c33460OooOO0O = (C33460OooOO0O) obj;
        C33460OooOO0O c33460OooOO0O2 = this.f120921OooO0OO;
        if (c33460OooOO0O2 == null) {
            c33460OooOO0O2 = this;
        }
        C33460OooOO0O c33460OooOO0O3 = c33460OooOO0O.f120921OooO0OO;
        if (c33460OooOO0O3 != null) {
            c33460OooOO0O = c33460OooOO0O3;
        }
        return c33460OooOO0O2 == c33460OooOO0O;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final int hashCode() {
        C33460OooOO0O c33460OooOO0O = this.f120921OooO0OO;
        return c33460OooOO0O != null ? c33460OooOO0O.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f120919OooO00o + ')';
    }

    public /* synthetic */ C33460OooOO0O(InterfaceC33348OooooOO interfaceC33348OooooOO, C33459OooOO0 c33459OooOO0, InterfaceC32637OoooOoo interfaceC32637OoooOoo, int i) {
        this(interfaceC33348OooooOO, (i & 2) != 0 ? null : c33459OooOO0, (C33460OooOO0O) null, (i & 8) != 0 ? null : interfaceC32637OoooOoo);
    }
}
