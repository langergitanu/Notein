package oO0OoO0;

import OooOoo.C20644Ooooooo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0OO00.C32888OooOO0o;
import oO0OO0Oo.C32919OooO0Oo;
import oO0OoOO.C33277OooOOO0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0OoO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33240OooOOOo extends OooOOOO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oO0OO0O.OooO00o f120298OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C32919OooO0Oo f120299OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33250OooOoo f120300OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C32888OooOO0o f120301Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C33277OooOOO0 f120302Oooo00O;

    /* JADX INFO: renamed from: oO0OoO0.OooOOOo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Collection<? extends C33479OooO0o>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Collection<? extends C33479OooO0o> invoke() {
            Set setKeySet = AbstractC33240OooOOOo.this.f120300OooOooo.f120339OooO0Oo.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                C33476OooO0O0 c33476OooO0O0 = (C33476OooO0O0) obj;
                if (c33476OooO0O0.f120968OooO0O0.OooO0o0().OooO0Oo() && !OooOO0.f120261OooO0OO.contains(c33476OooO0O0)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C33476OooO0O0) it.next()).OooO());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC33240OooOOOo(C33477OooO0OO fqName, C33361OooO0Oo c33361OooO0Oo, InterfaceC32615OooOoo module, C32888OooOO0o c32888OooOO0o, oO0OO0O.OooO00o oooO00o) {
        super(module, fqName);
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        this.f120298OooOoo = oooO00o;
        oO0OO00.OooOOOO oooOOOO = c32888OooOO0o.f118281OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOOOO, "proto.strings");
        oO0OO00.OooOOO oooOOO = c32888OooOO0o.f118283OooOoOO;
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOOO, "proto.qualifiedNames");
        C32919OooO0Oo c32919OooO0Oo = new C32919OooO0Oo(oooOOOO, oooOOO);
        this.f120299OooOooO = c32919OooO0Oo;
        this.f120300OooOooo = new C33250OooOoo(c32888OooOO0o, c32919OooO0Oo, oooO00o, new C20644Ooooooo(this, 1));
        this.f120301Oooo000 = c32888OooOO0o;
    }

    @Override // oO0O0OO.InterfaceC32620Oooo00O
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        C33277OooOOO0 c33277OooOOO0 = this.f120302Oooo00O;
        if (c33277OooOOO0 != null) {
            return c33277OooOOO0;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("_memberScope");
        throw null;
    }

    @Override // oO0OoO0.OooOOOO
    public final C33250OooOoo o000000O() {
        return this.f120300OooOooo;
    }

    public final void o000000o(C33239OooOO0o components) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(components, "components");
        C32888OooOO0o c32888OooOO0o = this.f120301Oooo000;
        if (c32888OooOO0o == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f120301Oooo000 = null;
        oO0OO00.OooOO0O oooOO0O = c32888OooOO0o.f118285OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0O, "proto.`package`");
        this.f120302Oooo00O = new C33277OooOOO0(this, oooOO0O, this.f120299OooOooO, this.f120298OooOoo, null, components, "scope of " + this, new OooO00o());
    }
}
