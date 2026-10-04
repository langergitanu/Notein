package o00Ooo;

import OooooO0.C21290OooO0o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.InterfaceC25547o0ooOO0;
import o00oO0O.o0ooOOo;
import oOo000Oo.C34434OooOoO;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends C25080OooOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f85117OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25547o0ooOO0 f85118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo.OooO0O0<C25084OooOOoo> f85119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f85120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOO0 f85121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AbstractC25521OoooO f85122OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f85123OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f85124OooO0oo;

    public OooOO0O(InterfaceC25547o0ooOO0 pointerInputNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pointerInputNode, "pointerInputNode");
        this.f85118OooO0O0 = pointerInputNode;
        this.f85119OooO0OO = new Oooo.OooO0O0<>(new C25084OooOOoo[16]);
        this.f85120OooO0Oo = new LinkedHashMap();
        this.f85124OooO0oo = true;
        this.f85117OooO = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    @Override // o00Ooo.C25080OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(LinkedHashMap linkedHashMap, InterfaceC34635OooOOOO parentCoordinates, C25078OooO0oO c25078OooO0oO, boolean z) {
        LinkedHashMap linkedHashMap2;
        Oooo.OooO0O0<C25084OooOOoo> oooO0O0;
        Object obj;
        boolean z2;
        OooOOO0 oooOOO0;
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentCoordinates, "parentCoordinates");
        boolean zOooO00o = super.OooO00o(linkedHashMap, parentCoordinates, c25078OooO0oO, z);
        InterfaceC25547o0ooOO0 interfaceC25547o0ooOO0 = this.f85118OooO0O0;
        boolean z3 = true;
        if (!o0ooOOo.OooO00o(interfaceC25547o0ooOO0)) {
            return true;
        }
        this.f85122OooO0o0 = o00oO0O.OooO.OooO0Oo(interfaceC25547o0ooOO0, 16);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap2 = this.f85120OooO0Oo;
            int i2 = 0;
            oooO0O0 = this.f85119OooO0OO;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            long j = ((C25084OooOOoo) entry.getKey()).f85133OooO00o;
            OooOo00 oooOo00 = (OooOo00) entry.getValue();
            if (oooO0O0.OooO0oO(new C25084OooOOoo(j))) {
                ArrayList arrayList = new ArrayList();
                List list = oooOo00.f85153OooOO0O;
                if (list == null) {
                    list = C34434OooOoO.f123453OooOo0o;
                }
                int size = list.size();
                while (i2 < size) {
                    C25077OooO0o0 c25077OooO0o0 = (C25077OooO0o0) list.get(i2);
                    boolean z4 = z3;
                    long j2 = c25077OooO0o0.f85106OooO00o;
                    boolean z5 = zOooO00o;
                    AbstractC25521OoooO abstractC25521OoooO = this.f85122OooO0o0;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
                    arrayList.add(new C25077OooO0o0(j2, abstractC25521OoooO.OooOOO0(parentCoordinates, c25077OooO0o0.f85107OooO0O0)));
                    i2++;
                    list = list;
                    size = size;
                    z3 = z4;
                    linkedHashMap2 = linkedHashMap2;
                    zOooO00o = z5;
                }
                boolean z6 = zOooO00o;
                boolean z7 = z3;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                C25084OooOOoo c25084OooOOoo = new C25084OooOOoo(j);
                AbstractC25521OoooO abstractC25521OoooO2 = this.f85122OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO2);
                long jOooOOO0 = abstractC25521OoooO2.OooOOO0(parentCoordinates, oooOo00.f85148OooO0o);
                AbstractC25521OoooO abstractC25521OoooO3 = this.f85122OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO3);
                long jOooOOO02 = abstractC25521OoooO3.OooOOO0(parentCoordinates, oooOo00.f85146OooO0OO);
                Float f = oooOo00.f85152OooOO0;
                OooOo00 oooOo002 = new OooOo00(oooOo00.f85144OooO00o, oooOo00.f85145OooO0O0, jOooOOO02, oooOo00.f85147OooO0Oo, f != null ? f.floatValue() : 0.0f, oooOo00.f85149OooO0o0, jOooOOO0, oooOo00.f85150OooO0oO, oooOo00.f85151OooO0oo, arrayList, oooOo00.f85143OooO);
                oooOo002.f85154OooOO0o = oooOo00.f85154OooOO0o;
                linkedHashMap3.put(c25084OooOOoo, oooOo002);
                z3 = z7;
                zOooO00o = z6;
            }
        }
        boolean z8 = zOooO00o;
        boolean z9 = z3;
        if (linkedHashMap2.isEmpty()) {
            oooO0O0.OooO0o();
            ((Oooo.OooO0O0) this.f85125OooO00o).OooO0o();
            return z9;
        }
        int i3 = oooO0O0.f59746OooOoO0;
        while (true) {
            i3--;
            if (-1 >= i3) {
                break;
            }
            if (!linkedHashMap.containsKey(new C25084OooOOoo(oooO0O0.f59745OooOo0o[i3].f85133OooO00o))) {
                oooO0O0.OooOO0o(i3);
            }
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap2.values());
        OooOOO0 oooOOO02 = new OooOOO0(listO0ooOO0, c25078OooO0oO);
        int size2 = listO0ooOO0.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj = null;
                break;
            }
            obj = listO0ooOO0.get(i4);
            if (c25078OooO0oO.OooO00o(((OooOo00) obj).f85144OooO00o)) {
                break;
            }
            i4++;
        }
        OooOo00 oooOo003 = (OooOo00) obj;
        if (oooOo003 != null) {
            boolean z10 = oooOo003.f85147OooO0Oo;
            if (!z) {
                this.f85124OooO0oo = false;
            } else if (!this.f85124OooO0oo && (z10 || oooOo003.f85150OooO0oO)) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(this.f85122OooO0o0);
                this.f85124OooO0oo = !OooOOO.OooO0Oo(oooOo003, r4.f124847OooOoO0);
            }
            boolean z11 = this.f85124OooO0oo;
            boolean z12 = this.f85123OooO0oO;
            if (z11 == z12 || !((i = oooOOO02.f85128OooO0O0) == 3 || i == 4 || i == 5)) {
                int i5 = oooOOO02.f85128OooO0O0;
                if (i5 == 4 && z12 && !this.f85117OooO) {
                    oooOOO02.f85128OooO0O0 = 3;
                } else if (i5 == 5 && z11 && z10) {
                    oooOOO02.f85128OooO0O0 = 3;
                }
            } else {
                oooOOO02.f85128OooO0O0 = z11 ? 4 : 5;
            }
        }
        if (z8 || oooOOO02.f85128OooO0O0 != 3 || (oooOOO0 = this.f85121OooO0o) == null) {
            z2 = z9;
            break;
        }
        List<OooOo00> list2 = oooOOO0.f85127OooO00o;
        int size3 = list2.size();
        List<OooOo00> list3 = oooOOO02.f85127OooO00o;
        if (size3 == list3.size()) {
            int size4 = list3.size();
            for (int i6 = 0; i6 < size4; i6++) {
                if (!C21290OooO0o0.OooO00o(list2.get(i6).f85146OooO0OO, list3.get(i6).f85146OooO0OO)) {
                    z2 = z9;
                    break;
                }
            }
            z2 = false;
        }
        this.f85121OooO0o = oooOOO02;
        return z2;
    }

    @Override // o00Ooo.C25080OooOO0o
    public final void OooO0O0(C25078OooO0oO c25078OooO0oO) {
        super.OooO0O0(c25078OooO0oO);
        OooOOO0 oooOOO0 = this.f85121OooO0o;
        if (oooOOO0 == null) {
            return;
        }
        this.f85123OooO0oO = this.f85124OooO0oo;
        List<OooOo00> list = oooOOO0.f85127OooO00o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            OooOo00 oooOo00 = list.get(i);
            if (!oooOo00.f85147OooO0Oo) {
                long j = oooOo00.f85144OooO00o;
                if (!c25078OooO0oO.OooO00o(j) || !this.f85124OooO0oo) {
                    this.f85119OooO0OO.OooOO0O(new C25084OooOOoo(j));
                }
            }
        }
        this.f85124OooO0oo = false;
        this.f85117OooO = oooOOO0.f85128OooO0O0 == 5;
    }

    public final void OooO0Oo() {
        Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        if (i > 0) {
            Object[] objArr = oooO0O0.f59745OooOo0o;
            int i2 = 0;
            do {
                ((OooOO0O) objArr[i2]).OooO0Oo();
                i2++;
            } while (i2 < i);
        }
        this.f85118OooO0O0.OooOO0o();
    }

    public final boolean OooO0o(Map<C25084OooOOoo, OooOo00> changes, InterfaceC34635OooOOOO parentCoordinates, C25078OooO0oO c25078OooO0oO, boolean z) {
        Oooo.OooO0O0 oooO0O0;
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(changes, "changes");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentCoordinates, "parentCoordinates");
        LinkedHashMap linkedHashMap = this.f85120OooO0Oo;
        int i2 = 0;
        if (!linkedHashMap.isEmpty()) {
            InterfaceC25547o0ooOO0 interfaceC25547o0ooOO0 = this.f85118OooO0O0;
            if (o0ooOOo.OooO00o(interfaceC25547o0ooOO0)) {
                OooOOO0 oooOOO0 = this.f85121OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooOOO0);
                AbstractC25521OoooO abstractC25521OoooO = this.f85122OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
                long j = abstractC25521OoooO.f124847OooOoO0;
                interfaceC25547o0ooOO0.OooOo0o(oooOOO0, OooOOOO.f85130OooOo0o, j);
                if (o0ooOOo.OooO00o(interfaceC25547o0ooOO0) && (i = (oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o).f59746OooOoO0) > 0) {
                    Object[] objArr = oooO0O0.f59745OooOo0o;
                    do {
                        OooOO0O oooOO0O = (OooOO0O) objArr[i2];
                        AbstractC25521OoooO abstractC25521OoooO2 = this.f85122OooO0o0;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO2);
                        oooOO0O.OooO0o(linkedHashMap, abstractC25521OoooO2, c25078OooO0oO, z);
                        i2++;
                    } while (i2 < i);
                }
                if (o0ooOOo.OooO00o(interfaceC25547o0ooOO0)) {
                    interfaceC25547o0ooOO0.OooOo0o(oooOOO0, OooOOOO.f85129OooOo, j);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o0(C25078OooO0oO c25078OooO0oO) {
        Oooo.OooO0O0 oooO0O0;
        int i;
        LinkedHashMap linkedHashMap = this.f85120OooO0Oo;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!linkedHashMap.isEmpty()) {
            InterfaceC25547o0ooOO0 interfaceC25547o0ooOO0 = this.f85118OooO0O0;
            if (o0ooOOo.OooO00o(interfaceC25547o0ooOO0)) {
                OooOOO0 oooOOO0 = this.f85121OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooOOO0);
                AbstractC25521OoooO abstractC25521OoooO = this.f85122OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
                interfaceC25547o0ooOO0.OooOo0o(oooOOO0, OooOOOO.f85132OooOoO0, abstractC25521OoooO.f124847OooOoO0);
                if (o0ooOOo.OooO00o(interfaceC25547o0ooOO0) && (i = (oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o).f59746OooOoO0) > 0) {
                    T[] tArr = oooO0O0.f59745OooOo0o;
                    do {
                        ((OooOO0O) tArr[i2]).OooO0o0(c25078OooO0oO);
                        i2++;
                    } while (i2 < i);
                }
                z = true;
            }
        }
        OooO0O0(c25078OooO0oO);
        linkedHashMap.clear();
        this.f85122OooO0o0 = null;
        return z;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f85118OooO0O0 + ", children=" + ((Oooo.OooO0O0) this.f85125OooO00o) + ", pointerIds=" + this.f85119OooO0OO + ')';
    }
}
