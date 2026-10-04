package oO0o;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0Oo0o0o.C28258Oooo0o0;
import o0OoOOOo.C29115OooOoO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32447OooOOo;
import oO0oO00.InterfaceC33945OooOOO0;
import oO0oO00.o00oO0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34437OooOoo;
import oOo000Oo.C34439OooOooO;
import oOo000Oo.C34440OooOooo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33532OooO0oO implements InterfaceC33531OooO0o0, InterfaceC33945OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean[] f121116OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f121117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC33534OooOO0o f121118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f121119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34434OooOoO f121120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String[] f121121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashSet f121122OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC33531OooO0o0[] f121123OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Annotation>[] f121124OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Map<String, Integer> f121125OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC33531OooO0o0[] f121126OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C32447OooOOo f121127OooOO0o;

    public C33532OooO0oO(String serialName, AbstractC33534OooOO0o kind, int i, List<? extends InterfaceC33531OooO0o0> list, C33523OooO00o c33523OooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serialName, "serialName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kind, "kind");
        this.f121117OooO00o = serialName;
        this.f121118OooO0O0 = kind;
        this.f121119OooO0OO = i;
        this.f121120OooO0Oo = c33523OooO00o.f121094OooO0O0;
        ArrayList arrayList = c33523OooO00o.f121095OooO0OO;
        this.f121122OooO0o0 = OooOo.o00oO0o(arrayList);
        int i2 = 0;
        this.f121121OooO0o = (String[]) arrayList.toArray(new String[0]);
        this.f121123OooO0oO = o00oO0O.OooO0O0(c33523OooO00o.f121098OooO0o0);
        this.f121124OooO0oo = (List[]) c33523OooO00o.f121097OooO0o.toArray(new List[0]);
        ArrayList arrayList2 = c33523OooO00o.f121099OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.f121116OooO = zArr;
        String[] strArr = this.f121121OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(strArr, "<this>");
        C34439OooOooO c34439OooOooO = new C34439OooOooO(new C28258Oooo0o0(strArr, 1));
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c34439OooOooO, 10));
        Iterator it2 = c34439OooOooO.iterator();
        while (true) {
            C34440OooOooo c34440OooOooo = (C34440OooOooo) it2;
            if (!c34440OooOooo.f123461OooOo0o.hasNext()) {
                this.f121125OooOO0 = C34444Oooo0O0.OooOO0o(arrayList3);
                this.f121126OooOO0O = o00oO0O.OooO0O0(list);
                this.f121127OooOO0o = C20519OooO0Oo.OooO0OO(new C29115OooOoO(this, 1));
                return;
            }
            C34437OooOoo c34437OooOoo = (C34437OooOoo) c34440OooOooo.next();
            arrayList3.add(new C32443OooOOO(c34437OooOoo.f123457OooO0O0, Integer.valueOf(c34437OooOoo.f123456OooO00o)));
        }
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        return this.f121116OooO[i];
    }

    @Override // oO0oO00.InterfaceC33945OooOOO0
    public final Set<String> OooO00o() {
        return this.f121122OooO0o0;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        Integer num = this.f121125OooOO0.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return this.f121123OooO0oO[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return this.f121121OooO0o[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return this.f121119OooO0OO;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        return this.f121124OooO0oo[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f121117OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33532OooO0oO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121117OooO00o, interfaceC33531OooO0o0.OooO0oo()) && Arrays.equals(this.f121126OooOO0O, ((C33532OooO0oO) obj).f121126OooOO0O)) {
                int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
                int i = this.f121119OooO0OO;
                if (i == iOooO0o0) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr = this.f121123OooO0oO;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0Arr[i2].OooO0oo(), interfaceC33531OooO0o0.OooO0Oo(i2).OooO0oo()) && kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0Arr[i2].getKind(), interfaceC33531OooO0o0.OooO0Oo(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return this.f121120OooO0Oo;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final AbstractC33534OooOO0o getKind() {
        return this.f121118OooO0O0;
    }

    public final int hashCode() {
        return ((Number) this.f121127OooOO0o.getValue()).intValue();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return OooOo.o000oOoO(oO0O00oo.OooOO0.OooO(0, this.f121119OooO0OO), ", ", C21111o0ooOoO.OooO0OO(this.f121117OooO00o, '(', new StringBuilder()), ")", new C33530OooO0o(this, 0), 24);
    }
}
