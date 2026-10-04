package oO0O0Oo0;

import com.facebook.common.callercontext.ContextChain;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.AbstractC32639Ooooo0o;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OOOo.C32995OooOOO0;
import oO0Oo0o0.C33216OooO0Oo;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33300OooO0oo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33306OooOOO0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33369OooO0oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32680OooOoO0 extends OooOOOO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33306OooOOO0 f117430OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO00o f117431OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final InterfaceC33370OooOO0<Set<C33479OooO0o>> f117432OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC34588OooO0oO f117433Oooo000;

    /* JADX INFO: renamed from: oO0O0Oo0.OooOoO0$OooO00o */
    public class OooO00o extends oO0Oo0o0.OooOO0O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC33369OooO0oo<C33479OooO0o, Collection<? extends InterfaceC32632OoooOO0>> f117434OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC33369OooO0oo<C33479OooO0o, Collection<? extends InterfaceC32627Oooo0oo>> f117435OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC33370OooOO0<Collection<oO0O0OO.OooOO0O>> f117436OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ C32680OooOoO0 f117437OooO0o0;

        public OooO00o(C32680OooOoO0 c32680OooOoO0, C33361OooO0Oo c33361OooO0Oo) {
            if (c33361OooO0Oo == null) {
                OooO0oo(0);
                throw null;
            }
            this.f117437OooO0o0 = c32680OooOoO0;
            this.f117434OooO0O0 = c33361OooO0Oo.OooO0Oo(new C32676OooOo0(this));
            this.f117435OooO0OO = c33361OooO0Oo.OooO0Oo(new C32677OooOo0O(this));
            this.f117436OooO0Oo = c33361OooO0Oo.OooO00o(new C32678OooOo0o(this));
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void OooO0oo(int i) {
            String str;
            int i2;
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = ContextChain.TAG_PRODUCT;
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        public final oO0Oo0o0.OooOO0 OooO() {
            oO0Oo0o0.OooOO0 oooOO0OooOOO0 = ((AbstractC33300OooO0oo) this.f117437OooO0o0.OooO()).OooO0Oo().iterator().next().OooOOO0();
            if (oooOO0OooOOO0 != null) {
                return oooOO0OooOOO0;
            }
            OooO0oo(9);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
        public final Set<C33479OooO0o> OooO00o() {
            Set<C33479OooO0o> setInvoke = this.f117437OooO0o0.f117432OooOooo.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            OooO0oo(17);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
        public final Collection OooO0O0(C33479OooO0o c33479OooO0o, oOo0o0oO.OooO0O0 oooO0O0) {
            if (c33479OooO0o != null) {
                return (Collection) ((C33361OooO0Oo.OooOO0O) this.f117435OooO0OO).invoke(c33479OooO0o);
            }
            OooO0oo(1);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
        public final Set<C33479OooO0o> OooO0OO() {
            Set<C33479OooO0o> setInvoke = this.f117437OooO0o0.f117432OooOooo.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            OooO0oo(19);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
        public final Set<C33479OooO0o> OooO0Oo() {
            Set<C33479OooO0o> set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            OooO0oo(18);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
        public final Collection<? extends InterfaceC32632OoooOO0> OooO0o(C33479OooO0o c33479OooO0o, oOo0o0oO.OooO0O0 oooO0O0) {
            if (c33479OooO0o != null) {
                return (Collection) ((C33361OooO0Oo.OooOO0O) this.f117434OooO0O0).invoke(c33479OooO0o);
            }
            OooO0oo(5);
            throw null;
        }

        @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
        public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo c33216OooO0Oo, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> interfaceC32507OooOO0o) {
            if (c33216OooO0Oo == null) {
                OooO0oo(13);
                throw null;
            }
            if (interfaceC32507OooOO0o == null) {
                OooO0oo(14);
                throw null;
            }
            Collection<oO0O0OO.OooOO0O> collectionInvoke = this.f117436OooO0Oo.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            OooO0oo(15);
            throw null;
        }

        public final LinkedHashSet OooOO0(C33479OooO0o c33479OooO0o, Collection collection) {
            if (c33479OooO0o == null) {
                OooO0oo(10);
                throw null;
            }
            if (collection == null) {
                OooO0oo(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C32995OooOOO0.f119372OooO0o0.OooO0oo(c33479OooO0o, collection, Collections.EMPTY_SET, this.f117437OooO0o0, new OooOo(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32680OooOoO0(C33361OooO0Oo c33361OooO0Oo, InterfaceC32596OooO0o0 interfaceC32596OooO0o0, AbstractC33328Oooo0O0 abstractC33328Oooo0O0, C33479OooO0o c33479OooO0o, InterfaceC33370OooOO0 interfaceC33370OooOO0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, oO0O0OO.o000oOoO o000oooo2) {
        super(c33361OooO0Oo, interfaceC32596OooO0o0, c33479OooO0o, o000oooo2);
        if (c33361OooO0Oo == null) {
            o000OOo(6);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            o000OOo(7);
            throw null;
        }
        if (abstractC33328Oooo0O0 == null) {
            o000OOo(8);
            throw null;
        }
        if (c33479OooO0o == null) {
            o000OOo(9);
            throw null;
        }
        if (interfaceC33370OooOO0 == null) {
            o000OOo(10);
            throw null;
        }
        if (o000oooo2 == null) {
            o000OOo(12);
            throw null;
        }
        this.f117433Oooo000 = interfaceC34588OooO0oO;
        this.f117430OooOoo = new C33306OooOOO0(this, Collections.EMPTY_LIST, Collections.singleton(abstractC33328Oooo0O0), c33361OooO0Oo);
        this.f117431OooOooO = new OooO00o(this, c33361OooO0Oo);
        this.f117432OooOooo = interfaceC33370OooOO0;
    }

    public static C32680OooOoO0 o000000o(C33361OooO0Oo c33361OooO0Oo, InterfaceC32596OooO0o0 interfaceC32596OooO0o0, C33479OooO0o c33479OooO0o, InterfaceC33370OooOO0 interfaceC33370OooOO0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, oO0O0OO.o000oOoO o000oooo2) {
        if (c33361OooO0Oo == null) {
            o000OOo(0);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            o000OOo(1);
            throw null;
        }
        if (c33479OooO0o == null) {
            o000OOo(2);
            throw null;
        }
        if (interfaceC33370OooOO0 == null) {
            o000OOo(3);
            throw null;
        }
        if (o000oooo2 != null) {
            return new C32680OooOoO0(c33361OooO0Oo, interfaceC32596OooO0o0, interfaceC32596OooO0o0.OooOOO(), c33479OooO0o, interfaceC33370OooOO0, interfaceC34588OooO0oO, o000oooo2);
        }
        o000OOo(5);
        throw null;
    }

    public static /* synthetic */ void o000OOo(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        C33306OooOOO0 c33306OooOOO0 = this.f117430OooOoo;
        if (c33306OooOOO0 != null) {
            return c33306OooOOO0;
        }
        o000OOo(17);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32612OooOoO
    public final EnumC32614OooOoOO OooO0oO() {
        return EnumC32614OooOoOO.f117261OooOo0o;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32595OooO0Oo> OooOO0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(16);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooO
    public final List<InterfaceC32637OoooOoo> OooOOOO() {
        List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(22);
        throw null;
    }

    @Override // oO0O0OO.OooO
    public final boolean OooOo00() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32595OooO0Oo OooOo0o() {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final Collection<InterfaceC32596OooO0o0> OoooO0O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o000OOo(23);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final AbstractC32639Ooooo0o<AbstractC33328Oooo0O0> Ooooo00() {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean OooooO0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean Oooooo0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean OoooooO() {
        return false;
    }

    @Override // oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        InterfaceC34588OooO0oO interfaceC34588OooO0oO = this.f117433Oooo000;
        if (interfaceC34588OooO0oO != null) {
            return interfaceC34588OooO0oO;
        }
        o000OOo(21);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0O0OO.OooO0o getKind() {
        return oO0O0OO.OooO0o.f117231OooOoO;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        C32602OooOOo0.C32606OooO0oo c32606OooO0oo = C32602OooOOo0.f117243OooO0o0;
        if (c32606OooO0oo != null) {
            return c32606OooO0oo;
        }
        o000OOo(20);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean isInline() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean o000000() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean o00Oo0() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final oO0Oo0o0.OooOO0 o00Ooo() {
        OooOO0.OooO0O0 oooO0O0 = OooOO0.OooO0O0.f120222OooO0O0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        o000OOo(15);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final InterfaceC32596OooO0o0 o00o0O() {
        return null;
    }

    @Override // oO0O0Oo0.AbstractC32688Oooo00o
    public final oO0Oo0o0.OooOO0 o0OoOo0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO == null) {
            o000OOo(13);
            throw null;
        }
        OooO00o oooO00o = this.f117431OooOooO;
        if (oooO00o != null) {
            return oooO00o;
        }
        o000OOo(14);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32596OooO0o0
    public final boolean ooOO() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }
}
