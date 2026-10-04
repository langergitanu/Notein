package oO0Ooo;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o000OoO.C24536OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Oo0o0.C33222OooOOo;
import oO0OooO.AbstractC33457OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0Ooo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33319OooOoOO implements InterfaceC33342OoooOo0, oO0o0000.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC33320OooOoo f120561OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet<AbstractC33320OooOoo> f120562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f120563OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo.OooOoOO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC33457OooO0oO, AbstractC33328Oooo0O0> {
        public OooO00o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final AbstractC33328Oooo0O0 invoke(AbstractC33457OooO0oO abstractC33457OooO0oO) {
            AbstractC33457OooO0oO kotlinTypeRefiner = abstractC33457OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
            C33319OooOoOO c33319OooOoOO = C33319OooOoOO.this;
            c33319OooOoOO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
            LinkedHashSet<AbstractC33320OooOoo> linkedHashSet = c33319OooOoOO.f120562OooO0O0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(linkedHashSet, 10));
            Iterator<T> it = linkedHashSet.iterator();
            boolean z = false;
            while (it.hasNext()) {
                arrayList.add(((AbstractC33320OooOoo) it.next()).o00000O(kotlinTypeRefiner));
                z = true;
            }
            C33319OooOoOO c33319OooOoOO2 = null;
            if (z) {
                AbstractC33320OooOoo abstractC33320OooOoo = c33319OooOoOO.f120561OooO00o;
                AbstractC33320OooOoo abstractC33320OooOooO00000O = abstractC33320OooOoo != null ? abstractC33320OooOoo.o00000O(kotlinTypeRefiner) : null;
                C33319OooOoOO c33319OooOoOO3 = new C33319OooOoOO(new C33319OooOoOO(arrayList).f120562OooO0O0);
                c33319OooOoOO3.f120561OooO00o = abstractC33320OooOooO00000O;
                c33319OooOoOO2 = c33319OooOoOO3;
            }
            if (c33319OooOoOO2 != null) {
                c33319OooOoOO = c33319OooOoOO2;
            }
            return c33319OooOoOO.OooO0o();
        }
    }

    /* JADX INFO: renamed from: oO0Ooo.OooOoOO$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o f120565OooOo0o;

        public OooO0O0(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            this.f120565OooOo0o = interfaceC32507OooOO0o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC33320OooOoo it = (AbstractC33320OooOoo) t;
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = this.f120565OooOo0o;
            String string = interfaceC32507OooOO0o.invoke(it).toString();
            AbstractC33320OooOoo it2 = (AbstractC33320OooOoo) t2;
            kotlin.jvm.internal.OooOOO0.OooO0o(it2, "it");
            return C24536OooO0Oo.OooO0O0(string, interfaceC32507OooOO0o.invoke(it2).toString());
        }
    }

    /* JADX INFO: renamed from: oO0Ooo.OooOoOO$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC33320OooOoo, CharSequence> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<AbstractC33320OooOoo, Object> f120566OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(InterfaceC32507OooOO0o<? super AbstractC33320OooOoo, ? extends Object> interfaceC32507OooOO0o) {
            super(1);
            this.f120566OooOo0o = interfaceC32507OooOO0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(AbstractC33320OooOoo abstractC33320OooOoo) {
            AbstractC33320OooOoo it = abstractC33320OooOoo;
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            return this.f120566OooOo0o.invoke(it).toString();
        }
    }

    public C33319OooOoOO() {
        throw null;
    }

    public C33319OooOoOO(AbstractCollection typesToIntersect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<AbstractC33320OooOoo> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f120562OooO0O0 = linkedHashSet;
        this.f120563OooO0OO = linkedHashSet.hashCode();
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final InterfaceC32598OooO0oo OooO0OO() {
        return null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection<AbstractC33320OooOoo> OooO0Oo() {
        return this.f120562OooO0O0;
    }

    public final AbstractC33328Oooo0O0 OooO0o() {
        C33339OoooOOO.f120598OooOo.getClass();
        return C33322OooOooO.OooO0oO(C33339OoooOOO.f120599OooOoO0, this, C34434OooOoO.f123453OooOo0o, false, C33222OooOOo.OooO00o.OooO00o("member scope for intersection type", this.f120562OooO0O0), new OooO00o());
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return false;
    }

    public final String OooO0oO(InterfaceC32507OooOO0o<? super AbstractC33320OooOoo, ? extends Object> getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return oOo000Oo.OooOo.o000oOoO(oOo000Oo.OooOo.o00O0O(this.f120562OooO0O0, new OooO0O0(getProperTypeRelatedToStringify)), " & ", "{", "}", new OooO0OO(getProperTypeRelatedToStringify), 24);
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        oO0O0O0o.OooOO0 oooOO0OooOO0O = this.f120562OooO0O0.iterator().next().o00000().OooOO0O();
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OooOO0O, "intersectedTypes.iterato…xt().constructor.builtIns");
        return oooOO0OooOO0O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33319OooOoOO) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120562OooO0O0, ((C33319OooOoOO) obj).f120562OooO0O0);
        }
        return false;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final int hashCode() {
        return this.f120563OooO0OO;
    }

    public final String toString() {
        return OooO0oO(C33321OooOoo0.f120568OooOo0o);
    }
}
