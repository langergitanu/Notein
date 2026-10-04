package oO0O0oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0Oo0.AbstractC32668OooO0o0;
import oO0O0ooO.InterfaceC32823OooOO0;
import oO0O0ooo.C32872OooOOoo;
import oO0O0ooo.C32875OooOo00;
import oO0O0ooo.C32876OooOo0O;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.o00O0O;
import oO0Ooo.o00Oo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34498OooO0o0;
import oOo00OOo.C34499OooO0oO;

/* JADX INFO: renamed from: oO0O0oo0.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32813Oooo000 extends AbstractC32668OooO0o0 {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C34499OooO0oO f117884Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final oO0O0ooO.OooOo f117885Oooo00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32813Oooo000(C34499OooO0oO c34499OooO0oO, oO0O0ooO.OooOo javaTypeParameter, int i, InterfaceC32599OooOO0o interfaceC32599OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(javaTypeParameter, "javaTypeParameter");
        C34495OooO0OO c34495OooO0OO = c34499OooO0oO.f123639OooO00o;
        super(c34495OooO0OO.f123606OooO00o, interfaceC32599OooOO0o, new C34498OooO0o0(c34499OooO0oO, javaTypeParameter, false), javaTypeParameter.getName(), 1, false, i, c34495OooO0OO.f123618OooOOO0);
        this.f117884Oooo00O = c34499OooO0oO;
        this.f117885Oooo00o = javaTypeParameter;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final List<AbstractC33320OooOoo> o00000() {
        Collection<InterfaceC32823OooOO0> upperBounds = this.f117885Oooo00o.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        C34499OooO0oO c34499OooO0oO = this.f117884Oooo00O;
        if (zIsEmpty) {
            return com.facebook.soloader.OooOo.OooO0oO(C33322OooOooO.OooO0OO(c34499OooO0oO.f123639OooO00o.f123619OooOOOO.f117524OooOoO.OooO0o0(), c34499OooO0oO.f123639OooO00o.f123619OooOOOO.f117524OooOoO.OooOOO()));
        }
        Collection<InterfaceC32823OooOO0> collection = upperBounds;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(c34499OooO0oO.f123643OooO0o0.OooO0Oo((InterfaceC32823OooOO0) it.next(), Ooooo00.OooOOO.OooO0o0(o00O0O.f120625OooOo, false, this, 3)));
        }
        return arrayList;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final List<AbstractC33320OooOoo> o000000O(List<? extends AbstractC33320OooOoo> list) {
        C32875OooOo00 c32875OooOo00;
        C34499OooO0oO c34499OooO0oO = this.f117884Oooo00O;
        C32875OooOo00 c32875OooOo002 = c34499OooO0oO.f123639OooO00o.f123621OooOOo;
        c32875OooOo002.getClass();
        List<? extends AbstractC33320OooOoo> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (AbstractC33320OooOoo abstractC33320OooOooOooO0O0 : list2) {
            C32872OooOOoo predicate = C32872OooOOoo.f117959OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOooOooO0O0, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
            if (o00Oo0.OooO0Oo(abstractC33320OooOooOooO0O0, predicate, null)) {
                c32875OooOo00 = c32875OooOo002;
            } else {
                c32875OooOo00 = c32875OooOo002;
                abstractC33320OooOooOooO0O0 = c32875OooOo00.OooO0O0(new C32876OooOo0O(this, false, c34499OooO0oO, ooOOO0Oo.OooO0OO.TYPE_PARAMETER_BOUNDS, false), abstractC33320OooOooOooO0O0, C34434OooOoO.f123453OooOo0o, null, false);
                if (abstractC33320OooOooOooO0O0 == null) {
                    abstractC33320OooOooOooO0O0 = abstractC33320OooOooOooO0O0;
                }
            }
            arrayList.add(abstractC33320OooOooOooO0O0);
            c32875OooOo002 = c32875OooOo00;
        }
        return arrayList;
    }

    @Override // oO0O0Oo0.OooOOO0
    public final void o000000o(AbstractC33320OooOoo type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
    }
}
