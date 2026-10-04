package oO0O0oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0ooO.InterfaceC32814OooO;
import oO0O0ooO.InterfaceC32821OooO0oO;
import oO0O0ooO.InterfaceC32823OooOO0;
import oO0O0ooO.InterfaceC32826OooOOO;
import oO0O0ooO.InterfaceC32829OooOOOo;
import oO0O0ooO.InterfaceC32831OooOOo0;
import oO0O0ooO.InterfaceC32834OooOo0O;
import oO0O0ooO.InterfaceC32835OooOo0o;
import oO0O0ooO.InterfaceC32836OooOoO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33567OooO0o0;
import oO0o0O0O.C33576OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: oO0O0oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32779OooO00o implements InterfaceC32780OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32821OooO0oO f117750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f117751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C20254OooO00o f117752OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f117753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashMap f117754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedHashMap f117755OooO0o0;

    /* JADX INFO: renamed from: oO0O0oo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20254OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32831OooOOo0, Boolean> {
        public C20254OooO00o() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(InterfaceC32831OooOOo0 interfaceC32831OooOOo0) {
            boolean z;
            boolean zIsEmpty;
            InterfaceC32831OooOOo0 m = interfaceC32831OooOOo0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(m, "m");
            boolean z2 = false;
            if (((Boolean) C32779OooO00o.this.f117751OooO0O0.invoke(m)).booleanValue()) {
                if (m.OooOOoo().f117686OooO00o.isInterface()) {
                    String strOooO0O0 = m.getName().OooO0O0();
                    int iHashCode = strOooO0O0.hashCode();
                    if (iHashCode != -1776922004) {
                        if (iHashCode != -1295482945) {
                            if (iHashCode == 147696667 && strOooO0O0.equals("hashCode")) {
                                zIsEmpty = ((ArrayList) m.OooO0o()).isEmpty();
                            }
                        } else if (strOooO0O0.equals("equals")) {
                            InterfaceC32836OooOoO interfaceC32836OooOoO = (InterfaceC32836OooOoO) oOo000Oo.OooOo.o0OoOo0(m.OooO0o());
                            InterfaceC32835OooOo0o type = interfaceC32836OooOoO != null ? interfaceC32836OooOoO.getType() : null;
                            InterfaceC32823OooOO0 interfaceC32823OooOO0 = type instanceof InterfaceC32823OooOO0 ? (InterfaceC32823OooOO0) type : null;
                            if (interfaceC32823OooOO0 != null) {
                                InterfaceC32814OooO interfaceC32814OooOOooO0O0 = interfaceC32823OooOO0.OooO0O0();
                                if ((interfaceC32814OooOOooO0O0 instanceof InterfaceC32821OooO0oO) && ((InterfaceC32821OooO0oO) interfaceC32814OooOOooO0O0).OooO0OO().OooO0O0().equals("java.lang.Object")) {
                                    zIsEmpty = true;
                                }
                            }
                        }
                        zIsEmpty = false;
                    } else if (!strOooO0O0.equals("toString")) {
                        zIsEmpty = false;
                    }
                    if (zIsEmpty) {
                        z = true;
                    }
                    if (!z) {
                    }
                } else {
                    z = false;
                    if (!z) {
                        z2 = true;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    public C32779OooO00o(InterfaceC32821OooO0oO jClass, InterfaceC32507OooOO0o<? super InterfaceC32829OooOOOo, Boolean> memberFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(jClass, "jClass");
        kotlin.jvm.internal.OooOOO0.OooO0oO(memberFilter, "memberFilter");
        this.f117750OooO00o = jClass;
        this.f117751OooO0O0 = (kotlin.jvm.internal.OooOOOO) memberFilter;
        C20254OooO00o c20254OooO00o = new C20254OooO00o();
        this.f117752OooO0OO = c20254OooO00o;
        C33567OooO0o0 c33567OooO0o0OooOOO0 = C33576OooOOOo.OooOOO0(oOo000Oo.OooOo.OooOooo(jClass.OooOO0o()), c20254OooO00o);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(c33567OooO0o0OooOOO0);
        while (oooO00o.hasNext()) {
            Object next = oooO00o.next();
            C33479OooO0o name = ((InterfaceC32831OooOOo0) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f117753OooO0Oo = linkedHashMap;
        C33567OooO0o0 c33567OooO0o0OooOOO02 = C33576OooOOOo.OooOOO0(oOo000Oo.OooOo.OooOooo(this.f117750OooO00o.getFields()), this.f117751OooO0O0);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C33567OooO0o0.OooO00o oooO00o2 = new C33567OooO0o0.OooO00o(c33567OooO0o0OooOOO02);
        while (oooO00o2.hasNext()) {
            Object next2 = oooO00o2.next();
            linkedHashMap2.put(((InterfaceC32826OooOOO) next2).getName(), next2);
        }
        this.f117755OooO0o0 = linkedHashMap2;
        ArrayList arrayListOooOOo = this.f117750OooO00o.OooOOo();
        ?? r5 = this.f117751OooO0O0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListOooOOo) {
            if (((Boolean) r5.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo < 16 ? 16 : iOooO0Oo);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((InterfaceC32834OooOo0O) obj2).getName(), obj2);
        }
        this.f117754OooO0o = linkedHashMap3;
    }

    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final Set<C33479OooO0o> OooO00o() {
        C33567OooO0o0 c33567OooO0o0OooOOO0 = C33576OooOOOo.OooOOO0(oOo000Oo.OooOo.OooOooo(this.f117750OooO00o.OooOO0o()), this.f117752OooO0OO);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(c33567OooO0o0OooOOO0);
        while (oooO00o.hasNext()) {
            linkedHashSet.add(((InterfaceC32831OooOOo0) oooO00o.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final InterfaceC32834OooOo0O OooO0O0(C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return (InterfaceC32834OooOo0O) this.f117754OooO0o.get(name);
    }

    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final Set<C33479OooO0o> OooO0OO() {
        return this.f117754OooO0o.keySet();
    }

    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final Collection<InterfaceC32831OooOOo0> OooO0Oo(C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) this.f117753OooO0Oo.get(name);
        return list != null ? list : C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final InterfaceC32826OooOOO OooO0o0(C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return (InterfaceC32826OooOOO) this.f117755OooO0o0.get(name);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO0O0oo0.InterfaceC32780OooO0O0
    public final Set<C33479OooO0o> getFieldNames() {
        C33567OooO0o0 c33567OooO0o0OooOOO0 = C33576OooOOOo.OooOOO0(oOo000Oo.OooOo.OooOooo(this.f117750OooO00o.getFields()), this.f117751OooO0O0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(c33567OooO0o0OooOOO0);
        while (oooO00o.hasNext()) {
            linkedHashSet.add(((InterfaceC32826OooOOO) oooO00o.next()).getName());
        }
        return linkedHashSet;
    }
}
