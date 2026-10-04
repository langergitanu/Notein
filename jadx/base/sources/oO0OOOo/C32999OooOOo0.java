package oO0OOOo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.C24035Oooo00o;
import o0Oo0o00.o0OOO0o;
import oO00ooO.C32442OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0ooo.C32848OooOO0;
import oO0OOo0.C33053OooO00o;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33310OooOOo0;
import oO0Ooo.C33315OooOo0O;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.AbstractC33456OooO0o0;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO.C33453OooO0OO;
import oO0OooO.C33460OooOO0O;
import oO0OooO.C33468OooOOoo;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0OooO.InterfaceC33454OooO0Oo;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oO0o0000.InterfaceC33539OooO0Oo;
import oO0o0000.InterfaceC33540OooO0o0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0000.InterfaceC33543OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OOOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32999OooOOo0 implements InterfaceC33452OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f119385OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33454OooO0Oo.OooO00o f119386OooO0O0;

    public C32999OooOOo0(HashMap map, InterfaceC33454OooO0Oo.OooO00o equalityAxioms, AbstractC33457OooO0oO.OooO00o kotlinTypeRefiner, AbstractC33456OooO0o0.OooO00o kotlinTypePreparator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(equalityAxioms, "equalityAxioms");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypePreparator, "kotlinTypePreparator");
        this.f119385OooO00o = map;
        this.f119386OooO0O0 = equalityAxioms;
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33354o00o0O OooO(ArrayList arrayList) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC33354o00o0O) OooOo.OoooooO(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC33354o00o0O abstractC33354o00o0O = (AbstractC33354o00o0O) it.next();
            z = z || o0OOO0o.OooO0O0(abstractC33354o00o0O);
            if (abstractC33354o00o0O instanceof AbstractC33328Oooo0O0) {
                abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) abstractC33354o00o0O;
            } else {
                if (!(abstractC33354o00o0O instanceof AbstractC33316OooOo0o)) {
                    throw new C32442OooOO0o();
                }
                if (C33315OooOo0O.OooO00o(abstractC33354o00o0O)) {
                    return abstractC33354o00o0O;
                }
                abstractC33328Oooo0O0 = ((AbstractC33316OooOo0o) abstractC33354o00o0O).f120554OooOo;
                z2 = true;
            }
            arrayList2.add(abstractC33328Oooo0O0);
        }
        if (z) {
            return C33509OooO.OooO0OO(EnumC33517OooO0oo.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        if (!z2) {
            return C33468OooOOoo.f120937OooO00o.OooO0O0(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(o00OO0O0.OooO0O0.OooOO0o((AbstractC33354o00o0O) it2.next()));
        }
        C33468OooOOoo c33468OooOOoo = C33468OooOOoo.f120937OooO00o;
        return C33322OooOooO.OooO0OO(c33468OooOOoo.OooO0O0(arrayList2), c33468OooOOoo.OooO0O0(arrayList3));
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooO00o(InterfaceC33539OooO0Oo interfaceC33539OooO0Oo) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo(interfaceC33539OooO0Oo);
    }

    @Override // oO0o0000.OooOOO0
    public final C33351Oooooo0 OooO0O0(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.OooO(interfaceC33541OooO0oO);
    }

    @Override // oO0o0000.OooOOO0
    public final C33460OooOO0O OooO0OO(oO0o0000.OooO0OO oooO0OO) {
        return InterfaceC33452OooO0O0.OooO00o.OoooOOO(oooO0OO);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooO0Oo(oO0o0000.OooOO0O c1, oO0o0000.OooOO0O c2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c1, "c1");
        kotlin.jvm.internal.OooOOO0.OooO0oO(c2, "c2");
        if (!(c1 instanceof InterfaceC33342OoooOo0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c2 instanceof InterfaceC33342OoooOo0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (InterfaceC33452OooO0O0.OooO00o.OooO00o(c1, c2)) {
            return true;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0 = (InterfaceC33342OoooOo0) c1;
        InterfaceC33342OoooOo0 interfaceC33342OoooOo02 = (InterfaceC33342OoooOo0) c2;
        if (this.f119386OooO0O0.OooO00o(interfaceC33342OoooOo0, interfaceC33342OoooOo02)) {
            return true;
        }
        HashMap map = this.f119385OooO00o;
        if (map == null) {
            return false;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo03 = (InterfaceC33342OoooOo0) map.get(interfaceC33342OoooOo0);
        InterfaceC33342OoooOo0 interfaceC33342OoooOo04 = (InterfaceC33342OoooOo0) map.get(interfaceC33342OoooOo02);
        if (interfaceC33342OoooOo03 == null || !interfaceC33342OoooOo03.equals(interfaceC33342OoooOo02)) {
            return interfaceC33342OoooOo04 != null && interfaceC33342OoooOo04.equals(interfaceC33342OoooOo0);
        }
        return true;
    }

    @Override // oO0o0000.OooOOO0
    public final Collection<InterfaceC33541OooO0oO> OooO0o(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OoooOO0(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooO0o0(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOoO(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooO0oO(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo000(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooO OooO0oo(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0OO(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOO0(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOooO(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOO0O(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOo(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final int OooOO0o(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OoooO00(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOOO(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOoO0(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33543OooOO0o OooOOO0(oO0o0000.OooOO0O oooOO0O, int i) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOO(oooOO0O, i);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooOOOO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooOO0 OooOOOo(oO0o0000.OooO oooO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO, "<this>");
        if (oooO instanceof InterfaceC33542OooO0oo) {
            return InterfaceC33452OooO0O0.OooO00o.OooOOO0((InterfaceC33541OooO0oO) oooO, i);
        }
        if (oooO instanceof oO0o0000.OooO00o) {
            oO0o0000.OooOO0 oooOO02 = ((oO0o0000.OooO00o) oooO).get(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(oooOO02, "get(index)");
            return oooOO02;
        }
        throw new IllegalStateException(("unknown type argument list type: " + oooO + ", " + C24035Oooo00o.f80943OooO00o.OooO0O0(oooO.getClass())).toString());
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOOo(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooOooo(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOOo0(InterfaceC33541OooO0oO receiver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
        return receiver instanceof C32848OooOO0;
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33354o00o0O OooOOoo(oO0o0000.OooO0OO oooO0OO) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0oO(oooO0OO);
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooOO0 OooOo(InterfaceC33541OooO0oO interfaceC33541OooO0oO, int i) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOO0(interfaceC33541OooO0oO, i);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooOo0(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OoooOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
        if (abstractC33316OooOo0oOooO0oO != null && (abstractC33328Oooo0O0OoooOOo = InterfaceC33452OooO0O0.OooO00o.OoooOOo(abstractC33316OooOo0oOooO0oO)) != null) {
            return abstractC33328Oooo0O0OoooOOo;
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo);
        return abstractC33328Oooo0O0OooO0oo;
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33342OoooOo0 OooOo00(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.o000oOoO(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooOo0O(InterfaceC33540OooO0o0 interfaceC33540OooO0o0) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0o(interfaceC33540OooO0o0);
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooO0O0 OooOo0o(oO0o0000.OooO0OO oooO0OO) {
        return InterfaceC33452OooO0O0.OooO00o.OooOO0O(oooO0OO);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOoO(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        return InterfaceC33452OooO0O0.OooO00o.OooOoo(InterfaceC33452OooO0O0.OooO00o.o000oOoO(interfaceC33542OooO0oo));
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33354o00o0O OooOoO0(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0oo(interfaceC33541OooO0oO);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooOoOO(InterfaceC33542OooO0oo interfaceC33542OooO0oo, boolean z) {
        return InterfaceC33452OooO0O0.OooO00o.OoooOo0(interfaceC33542OooO0oo, z);
    }

    @Override // oO0o0000.OooOOO0
    public final Collection<InterfaceC33541OooO0oO> OooOoo(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OoooO0(this, interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33354o00o0O OooOoo0(oO0o0000.OooOO0 oooOO02) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOOO(oooOO02);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOooO(oO0o0000.OooO0OO receiver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
        return receiver instanceof C33053OooO00o;
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooOooo(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOo0o(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final int Oooo(oO0o0000.OooOO0 oooOO02) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOo(oooOO02);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooo0(oO0o0000.OooO0OO oooO0OO) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0(oooO0OO);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooo000(oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOoo(oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final void Oooo00O(InterfaceC33542OooO0oo interfaceC33542OooO0oo, oO0o0000.OooOO0O oooOO0O) {
    }

    @Override // oO0o0000.OooOOO0
    public final C33453OooO0OO Oooo00o(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OoooO(this, interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final C33310OooOOo0 Oooo0O0(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0o0(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooo0OO(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        return InterfaceC33452OooO0O0.OooO00o.Oooo000(o0OoOo0(interfaceC33542OooO0oo)) && !InterfaceC33452OooO0O0.OooO00o.Oooo00O(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33348OooooOO Oooo0o(oO0OOo0.OooO0O0 oooO0O0) {
        return InterfaceC33452OooO0O0.OooO00o.OoooO0O(oooO0O0);
    }

    @Override // oO0o0000.OooOOO0
    public final int Oooo0o0(InterfaceC33543OooOO0o interfaceC33543OooOO0o) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOoo(interfaceC33543OooOO0o);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooo0oO(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        return InterfaceC33452OooO0O0.OooO00o.OooOo(InterfaceC33452OooO0O0.OooO00o.o000oOoO(interfaceC33542OooO0oo));
    }

    @Override // oO0OooO.InterfaceC33452OooO0O0
    public final AbstractC33354o00o0O Oooo0oo(InterfaceC33542OooO0oo interfaceC33542OooO0oo, InterfaceC33542OooO0oo interfaceC33542OooO0oo2) {
        return InterfaceC33452OooO0O0.OooO00o.OooOO0o(this, interfaceC33542OooO0oo, interfaceC33542OooO0oo2);
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33541OooO0oO OoooO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.OoooOoO(this, interfaceC33541OooO0oO);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OoooO0(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0o0(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OoooO00(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33542OooO0oo);
        return (abstractC33328Oooo0O0OooO0oo != null ? InterfaceC33452OooO0O0.OooO00o.OooO0Oo(this, abstractC33328Oooo0O0OooO0oo) : null) != null;
    }

    @Override // oO0o0000.OooOOO0
    public final int OoooO0O(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0O0(interfaceC33541OooO0oO);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OoooOO0(oO0o0000.OooOO0 oooOO02) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0O0(oooOO02);
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33542OooO0oo OoooOOO(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Oooo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        C33310OooOOo0 c33310OooOOo0OooO0o0 = InterfaceC33452OooO0O0.OooO00o.OooO0o0(interfaceC33542OooO0oo);
        return (c33310OooOOo0OooO0o0 == null || (abstractC33328Oooo0O0Oooo = InterfaceC33452OooO0O0.OooO00o.Oooo(c33310OooOOo0OooO0o0)) == null) ? interfaceC33542OooO0oo : abstractC33328Oooo0O0Oooo;
    }

    @Override // oO0o0000.OooOOO
    public final boolean OoooOOo(InterfaceC33542OooO0oo interfaceC33542OooO0oo, InterfaceC33542OooO0oo interfaceC33542OooO0oo2) {
        return InterfaceC33452OooO0O0.OooO00o.OooOo0O(interfaceC33542OooO0oo, interfaceC33542OooO0oo2);
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC32637OoooOoo OoooOo0(oO0o0000.OooOOOO oooOOOO) {
        return InterfaceC33452OooO0O0.OooO00o.OooOOOo(oooOOOO);
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooO0OO OoooOoO(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0Oo(this, interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OoooOoo(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooOO0(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 Ooooo00(InterfaceC33540OooO0o0 interfaceC33540OooO0o0) {
        return InterfaceC33452OooO0O0.OooO00o.OoooOOo(interfaceC33540OooO0o0);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Ooooo0o(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
        return (abstractC33328Oooo0O0OooO0oo != null ? InterfaceC33452OooO0O0.OooO00o.OooO0o0(abstractC33328Oooo0O0OooO0oo) : null) != null;
    }

    @Override // oO0o0000.OooOOO0
    public final boolean OooooO0(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.Oooo0OO(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33328Oooo0O0 OooooOO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Oooo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
        if (abstractC33316OooOo0oOooO0oO != null && (abstractC33328Oooo0O0Oooo0o = InterfaceC33452OooO0O0.OooO00o.Oooo0o(abstractC33316OooOo0oOooO0oO)) != null) {
            return abstractC33328Oooo0O0Oooo0o;
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo);
        return abstractC33328Oooo0O0OooO0oo;
    }

    @Override // oO0o0000.OooOOO0
    public final oO0o0000.OooOO0 OooooOo(InterfaceC33542OooO0oo interfaceC33542OooO0oo, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33542OooO0oo, "<this>");
        if (i < 0 || i >= InterfaceC33452OooO0O0.OooO00o.OooO0O0(interfaceC33542OooO0oo)) {
            return null;
        }
        return InterfaceC33452OooO0O0.OooO00o.OooOOO0(interfaceC33542OooO0oo, i);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooooo(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
        return (abstractC33316OooOo0oOooO0oO != null ? InterfaceC33452OooO0O0.OooO00o.OooO0o(abstractC33316OooOo0oOooO0oO) : null) != null;
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Oooooo0(InterfaceC33543OooOO0o interfaceC33543OooOO0o, oO0o0000.OooOO0O oooOO0O) {
        return InterfaceC33452OooO0O0.OooO00o.OooOo0(interfaceC33543OooOO0o, oooOO0O);
    }

    @Override // oO0o0000.OooOOO0
    public final int OoooooO(oO0o0000.OooO oooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO, "<this>");
        if (oooO instanceof InterfaceC33542OooO0oo) {
            return InterfaceC33452OooO0O0.OooO00o.OooO0O0((InterfaceC33541OooO0oO) oooO);
        }
        if (oooO instanceof oO0o0000.OooO00o) {
            return ((oO0o0000.OooO00o) oooO).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + oooO + ", " + C24035Oooo00o.f80943OooO00o.OooO0O0(oooO.getClass())).toString());
    }

    @Override // oO0o0000.OooOOO0
    public final boolean Ooooooo(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
        return InterfaceC33452OooO0O0.OooO00o.OooOoOO(interfaceC33542OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final boolean o000oOoO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        return InterfaceC33452OooO0O0.OooO00o.OooOooo(OooooOO(interfaceC33541OooO0oO)) != InterfaceC33452OooO0O0.OooO00o.OooOooo(OooOo0(interfaceC33541OooO0oO));
    }

    @Override // oO0o0000.OooOOO0
    public final InterfaceC33342OoooOo0 o0OoOo0(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
        if (abstractC33328Oooo0O0OooO0oo == null) {
            abstractC33328Oooo0O0OooO0oo = OooooOO(interfaceC33541OooO0oO);
        }
        return InterfaceC33452OooO0O0.OooO00o.o000oOoO(abstractC33328Oooo0O0OooO0oo);
    }

    @Override // oO0o0000.OooOOO0
    public final AbstractC33316OooOo0o ooOO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        return InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
    }
}
