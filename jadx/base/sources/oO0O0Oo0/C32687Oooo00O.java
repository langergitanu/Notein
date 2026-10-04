package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o0Oo0ooo.C28476OooOOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.AbstractC32639Ooooo0o;
import oO0O0OO.C32610OooOo0O;
import oO0O0OO.C32617OooOooO;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0Oo0o0.C33223OooOOo0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33350Oooooo;
import oO0Ooo.C33303OooOO0O;
import oO0Ooo.C33306OooOOO0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33356ooOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33479OooO0o;
import oO0o0000.InterfaceC33542OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32687Oooo00O extends AbstractC32688Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33356ooOO f117509OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC32688Oooo00o f117510OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f117511OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33356ooOO f117512OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ArrayList f117513OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C33306OooOOO0 f117514OooOoo0;

    public C32687Oooo00O(AbstractC32688Oooo00o abstractC32688Oooo00o, C33356ooOO c33356ooOO) {
        this.f117510OooOo0o = abstractC32688Oooo00o;
        this.f117509OooOo = c33356ooOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void o000OOo(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i != 6) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 13) {
                        if (i != 23) {
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                        } else {
                            objArr[0] = "substitutor";
                        }
                    }
                }
            }
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO = this.f117510OooOo0o.OooO();
        if (this.f117509OooOo.f120634OooO00o.OooO0o0()) {
            if (interfaceC33342OoooOo0OooO != null) {
                return interfaceC33342OoooOo0OooO;
            }
            o000OOo(0);
            throw null;
        }
        if (this.f117514OooOoo0 == null) {
            C33356ooOO c33356ooOOO000000O = o000000O();
            Collection<AbstractC33320OooOoo> collectionOooO0Oo = interfaceC33342OoooOo0OooO.OooO0Oo();
            ArrayList arrayList = new ArrayList(collectionOooO0Oo.size());
            Iterator<AbstractC33320OooOoo> it = collectionOooO0Oo.iterator();
            while (it.hasNext()) {
                arrayList.add(c33356ooOOO000000O.OooOO0(1, it.next()));
            }
            this.f117514OooOoo0 = new C33306OooOOO0(this, this.f117511OooOoO, arrayList, C33361OooO0Oo.f120642OooO0o0);
        }
        C33306OooOOO0 c33306OooOOO0 = this.f117514OooOoo0;
        if (c33306OooOOO0 != null) {
            return c33306OooOOO0;
        }
        o000OOo(1);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32634OoooOOo
    public final InterfaceC32599OooOO0o OooO0O0(C33356ooOO c33356ooOO) {
        if (c33356ooOO != null) {
            return c33356ooOO.f120634OooO00o.OooO0o0() ? this : new C32687Oooo00O(this, C33356ooOO.OooO0o(c33356ooOO.OooO0oO(), o000000O().OooO0oO()));
        }
        o000OOo(23);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final oO0O0OO.OooOO0O OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = this.f117510OooOo0o.OooO0Oo();
        if (oooOO0OOooO0Oo != null) {
            return oooOO0OOooO0Oo;
        }
        o000OOo(22);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32612OooOoO
    public final EnumC32614OooOoOO OooO0oO() {
        EnumC32614OooOoOO enumC32614OooOoOOOooO0oO = this.f117510OooOo0o.OooO0oO();
        if (enumC32614OooOoOOOooO0oO != null) {
            return enumC32614OooOoOOOooO0oO;
        }
        o000OOo(26);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32595OooO0Oo> OooOO0() {
        Collection<InterfaceC32595OooO0Oo> collectionOooOO0 = this.f117510OooOo0o.OooOO0();
        ArrayList arrayList = new ArrayList(collectionOooOO0.size());
        for (InterfaceC32595OooO0Oo interfaceC32595OooO0Oo : collectionOooOO0) {
            arrayList.add(((InterfaceC32595OooO0Oo) interfaceC32595OooO0Oo.Oooo().OooOOOo(interfaceC32595OooO0Oo.o000OOo()).OooOOO(interfaceC32595OooO0Oo.OooO0oO()).OooOOOO(interfaceC32595OooO0Oo.getVisibility()).OooO00o(interfaceC32595OooO0Oo.getKind()).OooOO0o().build()).OooO0O0(o000000O()));
        }
        return arrayList;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32598OooO0oo
    public final AbstractC33328Oooo0O0 OooOOO() {
        C33339OoooOOO c33339OoooOOOOooO0OO;
        List<InterfaceC33348OooooOO> listOooO0o0 = o00Oo0.OooO0o0(OooO().getParameters());
        InterfaceC34588OooO0oO annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C33339OoooOOO.f120598OooOo.getClass();
            c33339OoooOOOOooO0OO = C33339OoooOOO.f120599OooOoO0;
        } else {
            C33339OoooOOO.OooO00o oooO00o = C33339OoooOOO.f120598OooOo;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new C33303OooOO0O(annotations));
            oooO00o.getClass();
            c33339OoooOOOOooO0OO = C33339OoooOOO.OooO00o.OooO0OO(listOooO0oO);
        }
        return C33322OooOooO.OooO0o(listOooO0o0, Oooo000(), c33339OoooOOOOooO0OO, OooO(), false);
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooO
    public final List<InterfaceC32637OoooOoo> OooOOOO() {
        o000000O();
        ArrayList arrayList = this.f117513OooOoOO;
        if (arrayList != null) {
            return arrayList;
        }
        o000OOo(30);
        throw null;
    }

    @Override // oO0O0OO.OooO
    public final boolean OooOo00() {
        return this.f117510OooOo0o.OooOo00();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32595OooO0Oo OooOo0o() {
        return this.f117510OooOo0o.OooOo0o();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 OooOoO(AbstractC33350Oooooo abstractC33350Oooooo) {
        return OoooO(abstractC33350Oooooo, C33194OooO0O0.OooO(C32982OooO.OooO0Oo(this)));
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 OooOooo() {
        oO0Oo0o0.OooOO0 oooOO0OooOooo = this.f117510OooOo0o.OooOooo();
        if (oooOO0OooOooo != null) {
            return oooOO0OooOooo;
        }
        o000OOo(28);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 Oooo000() {
        return o0OoOo0(C33194OooO0O0.OooO(C32982OooO.OooO0Oo(this.f117510OooOo0o)));
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public final oO0Oo0o0.OooOO0 OoooO(AbstractC33350Oooooo abstractC33350Oooooo, AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(6);
            throw null;
        }
        oO0Oo0o0.OooOO0 oooOO0OoooO = this.f117510OooOo0o.OoooO(abstractC33350Oooooo, abstractC33457OooO0oO);
        if (!this.f117509OooOo.f120634OooO00o.OooO0o0()) {
            return new C33223OooOOo0(oooOO0OoooO, o000000O());
        }
        if (oooOO0OoooO != null) {
            return oooOO0OoooO;
        }
        o000OOo(7);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32629OoooO0 OoooO00() {
        throw new UnsupportedOperationException();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32596OooO0o0> OoooO0O() {
        Collection<InterfaceC32596OooO0o0> collectionOoooO0O = this.f117510OooOo0o.OoooO0O();
        if (collectionOoooO0O != null) {
            return collectionOoooO0O;
        }
        o000OOo(31);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final AbstractC32639Ooooo0o<AbstractC33328Oooo0O0> Ooooo00() {
        AbstractC32639Ooooo0o<AbstractC33328Oooo0O0> abstractC32639Ooooo0oOoooo00 = this.f117510OooOo0o.Ooooo00();
        if (abstractC32639Ooooo0oOoooo00 == null) {
            return null;
        }
        boolean z = abstractC32639Ooooo0oOoooo00 instanceof C32610OooOo0O;
        C33356ooOO c33356ooOO = this.f117509OooOo;
        if (z) {
            C32610OooOo0O c32610OooOo0O = (C32610OooOo0O) abstractC32639Ooooo0oOoooo00;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) c32610OooOo0O.f117259OooO0O0;
            if (abstractC33328Oooo0O0 != null && !c33356ooOO.f120634OooO00o.OooO0o0()) {
                abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) o000000O().OooOO0(1, abstractC33328Oooo0O0);
            }
            return new C32610OooOo0O(c32610OooOo0O.f117258OooO00o, abstractC33328Oooo0O0);
        }
        if (!(abstractC32639Ooooo0oOoooo00 instanceof C32617OooOooO)) {
            throw new C32442OooOO0o();
        }
        ArrayList<C32443OooOOO> arrayList = ((C32617OooOooO) abstractC32639Ooooo0oOoooo00).f117266OooO00o;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (C32443OooOOO c32443OooOOO : arrayList) {
            C33479OooO0o c33479OooO0o = (C33479OooO0o) c32443OooOOO.f116638OooOo0o;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = (AbstractC33328Oooo0O0) ((InterfaceC33542OooO0oo) c32443OooOOO.f116637OooOo);
            if (abstractC33328Oooo0O02 != null && !c33356ooOO.f120634OooO00o.OooO0o0()) {
                abstractC33328Oooo0O02 = (AbstractC33328Oooo0O0) o000000O().OooOO0(1, abstractC33328Oooo0O02);
            }
            arrayList2.add(new C32443OooOOO(c33479OooO0o, abstractC33328Oooo0O02));
        }
        return new C32617OooOooO(arrayList2);
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean OooooO0() {
        return this.f117510OooOo0o.OooooO0();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final List<InterfaceC32629OoooO0> OooooOO() {
        List<InterfaceC32629OoooO0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(17);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean Oooooo0() {
        return this.f117510OooOo0o.Oooooo0();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean OoooooO() {
        return this.f117510OooOo0o.OoooooO();
    }

    @Override // oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        InterfaceC34588OooO0oO annotations = this.f117510OooOo0o.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        o000OOo(19);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0O0OO.OooO0o getKind() {
        oO0O0OO.OooO0o kind = this.f117510OooOo0o.getKind();
        if (kind != null) {
            return kind;
        }
        o000OOo(25);
        throw null;
    }

    @Override // oO0O0OO.OooOO0O
    public final C33479OooO0o getName() {
        C33479OooO0o name = this.f117510OooOo0o.getName();
        if (name != null) {
            return name;
        }
        o000OOo(20);
        throw null;
    }

    @Override // oO0O0OO.OooOOO
    public final oO0O0OO.o000oOoO getSource() {
        return oO0O0OO.o000oOoO.f117308OooO00o;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        AbstractC32601OooOOo visibility = this.f117510OooOo0o.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        o000OOo(27);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean isExternal() {
        return this.f117510OooOo0o.isExternal();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean isInline() {
        return this.f117510OooOo0o.isInline();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean o000000() {
        return this.f117510OooOo0o.o000000();
    }

    public final C33356ooOO o000000O() {
        if (this.f117512OooOoO0 == null) {
            C33356ooOO c33356ooOO = this.f117509OooOo;
            if (c33356ooOO.f120634OooO00o.OooO0o0()) {
                this.f117512OooOoO0 = c33356ooOO;
            } else {
                List<InterfaceC32637OoooOoo> parameters = this.f117510OooOo0o.OooO().getParameters();
                this.f117511OooOoO = new ArrayList(parameters.size());
                this.f117512OooOoO0 = C28476OooOOO.OooO0OO(parameters, c33356ooOO.OooO0oO(), this, this.f117511OooOoO);
                ArrayList arrayList = this.f117511OooOoO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC32637OoooOoo) obj).OooOoo()) {
                        arrayList2.add(obj);
                    }
                }
                this.f117513OooOoOO = arrayList2;
            }
        }
        return this.f117512OooOoO0;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean o00Oo0() {
        return this.f117510OooOo0o.o00Oo0();
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 o00Ooo() {
        oO0Oo0o0.OooOO0 oooOO0O00Ooo = this.f117510OooOo0o.o00Ooo();
        if (oooOO0O00Ooo != null) {
            return oooOO0O00Ooo;
        }
        o000OOo(15);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32596OooO0o0 o00o0O() {
        return this.f117510OooOo0o.o00o0O();
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public final oO0Oo0o0.OooOO0 o0OoOo0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(13);
            throw null;
        }
        oO0Oo0o0.OooOO0 oooOO0O0OoOo0 = this.f117510OooOo0o.o0OoOo0(abstractC33457OooO0oO);
        if (!this.f117509OooOo.f120634OooO00o.OooO0o0()) {
            return new C33223OooOOo0(oooOO0O0OoOo0, o000000O());
        }
        if (oooOO0O0OoOo0 != null) {
            return oooOO0O0OoOo0;
        }
        o000OOo(14);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean ooOO() {
        return this.f117510OooOo0o.ooOO();
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32596OooO0o0 o000OOo() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0O000OOo = this.f117510OooOo0o.o000OOo();
        if (interfaceC32596OooO0o0O000OOo != null) {
            return interfaceC32596OooO0o0O000OOo;
        }
        o000OOo(21);
        throw null;
    }
}
