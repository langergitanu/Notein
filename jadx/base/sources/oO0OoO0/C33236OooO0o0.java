package oO0OoO0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.C32618OooOooo;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32889OooOOOo;
import oO0OO00.C32890OooOOo;
import oO0OO00.OooO00o;
import oO0OO0Oo.C32921OooO0o0;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OoO.C33227OooO00o;
import oO0OoO0.AbstractC33252OooOooO;
import oO0Ooo.AbstractC33320OooOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0OoO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33236OooO0o0 implements InterfaceC33235OooO0Oo<oOo0oooO.OooO0OO, AbstractC33038OooO0oO<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33227OooO00o f120255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f120256OooO0O0;

    public C33236OooO0o0(InterfaceC32615OooOoo module, C32618OooOooo c32618OooOooo, C33227OooO00o protocol) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        kotlin.jvm.internal.OooOOO0.OooO0oO(protocol, "protocol");
        this.f120255OooO00o = protocol;
        this.f120256OooO0O0 = new OooO0o(module, c32618OooOooo);
    }

    @Override // oO0OoO0.InterfaceC33235OooO0Oo
    public final AbstractC33038OooO0oO<?> OooO(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto, AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        OooO00o.OooO0O0.OooO0OO oooO0OO = (OooO00o.OooO0O0.OooO0OO) C32921OooO0o0.OooO00o(proto, this.f120255OooO00o.f120375OooO);
        if (oooO0OO == null) {
            return null;
        }
        return this.f120256OooO0O0.OooO0OO(abstractC33320OooOoo, oooO0OO, abstractC33252OooOooO.f120346OooO00o);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<oOo0oooO.OooO0OO> OooO00o(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        this.f120255OooO00o.getClass();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
        Iterator<E> it = c34434OooOoO.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), abstractC33252OooOooO.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List OooO0O0(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO proto, EnumC33234OooO0OO enumC33234OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        boolean z = proto instanceof C32887OooO0oo;
        C33227OooO00o c33227OooO00o = this.f120255OooO00o;
        if (z) {
            c33227OooO00o.getClass();
        } else {
            if (!(proto instanceof oO0OO00.OooOOO0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = enumC33234OooO0OO.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + enumC33234OooO0OO).toString());
            }
            c33227OooO00o.getClass();
        }
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
        Iterator<E> it = c34434OooOoO.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), abstractC33252OooOooO.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooO0OO(AbstractC33252OooOooO.OooO00o container) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        Iterable iterable = (List) container.f120349OooO0Oo.OooO0o(this.f120255OooO00o.f120378OooO0OO);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), container.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33235OooO0Oo
    public final AbstractC33038OooO0oO<?> OooO0Oo(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto, AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        return null;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<oOo0oooO.OooO0OO> OooO0o(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        this.f120255OooO00o.getClass();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
        Iterator<E> it = c34434OooOoO.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), abstractC33252OooOooO.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List OooO0o0(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO proto, EnumC33234OooO0OO enumC33234OooO0OO) {
        List list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        boolean z = proto instanceof oO0OO00.OooO0OO;
        C33227OooO00o c33227OooO00o = this.f120255OooO00o;
        if (z) {
            list = (List) ((oO0OO00.OooO0OO) proto).OooO0o(c33227OooO00o.f120377OooO0O0);
        } else if (proto instanceof C32887OooO0oo) {
            list = (List) ((C32887OooO0oo) proto).OooO0o(c33227OooO00o.f120379OooO0Oo);
        } else {
            if (!(proto instanceof oO0OO00.OooOOO0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = enumC33234OooO0OO.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((oO0OO00.OooOOO0) proto).OooO0o(c33227OooO00o.f120381OooO0o0);
            } else if (iOrdinal == 2) {
                list = (List) ((oO0OO00.OooOOO0) proto).OooO0o(c33227OooO00o.f120380OooO0o);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((oO0OO00.OooOOO0) proto).OooO0o(c33227OooO00o.f120382OooO0oO);
            }
        }
        if (list == null) {
            list = C34434OooOoO.f123453OooOo0o;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), abstractC33252OooOooO.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooO0oO(C32889OooOOOo proto, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.OooO0o(this.f120255OooO00o.f120385OooOO0O);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List OooO0oo(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO callableProto, EnumC33234OooO0OO enumC33234OooO0OO, int i, oO0OO00.OooOo00 oooOo00) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(callableProto, "callableProto");
        Iterable iterable = (List) oooOo00.OooO0o(this.f120255OooO00o.f120384OooOO0);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), abstractC33252OooOooO.f120346OooO00o));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooOO0(C32890OooOOo proto, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.OooO0o(this.f120255OooO00o.f120386OooOO0o);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<oOo0oooO.OooO0OO> OooOO0O(AbstractC33252OooOooO container, oO0OO00.OooO0o oooO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        Iterable iterable = (List) oooO0o.OooO0o(this.f120255OooO00o.f120383OooO0oo);
        if (iterable == null) {
            iterable = C34434OooOoO.f123453OooOo0o;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f120256OooO0O0.OooO00o((oO0OO00.OooO00o) it.next(), container.f120346OooO00o));
        }
        return arrayList;
    }
}
