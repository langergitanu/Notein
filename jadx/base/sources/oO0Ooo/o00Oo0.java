package oO0Ooo;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o00OO0o0.C24998OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO.InterfaceC33464OooOOOO;
import oO0Oooo.C33509OooO;
import oO0Oooo.C33514OooO0o;
import oO0Oooo.EnumC33517OooO0oo;
import oO0o0O0.C33558OooO0Oo;
import oOo00OOO.C34484OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33514OooO0o f120628OooO00o = C33509OooO.OooO0OO(EnumC33517OooO0oo.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33514OooO0o f120629OooO0O0 = C33509OooO.OooO0OO(EnumC33517OooO0oo.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f120630OooO0OO = new OooO00o("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f120631OooO0Oo = new OooO00o("UNIT_EXPECTED_TYPE");

    public static class OooO00o extends AbstractC33309OooOOo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f120632OooOo;

        public OooO00o(String str) {
            this.f120632OooOo = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void o0000oO(int i) {
            String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            }
            if (i == 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // oO0Ooo.AbstractC33309OooOOo
        public final AbstractC33328Oooo0O0 o0000() {
            throw new IllegalStateException(this.f120632OooOo);
        }

        @Override // oO0Ooo.AbstractC33309OooOOo, oO0Ooo.AbstractC33320OooOoo
        public final AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO abstractC33457OooO0oO) {
            if (abstractC33457OooO0oO != null) {
                return this;
            }
            o0000oO(3);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
        public final /* bridge */ /* synthetic */ AbstractC33354o00o0O o00000Oo(boolean z) {
            o00000Oo(z);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33309OooOOo, oO0Ooo.AbstractC33354o00o0O
        /* JADX INFO: renamed from: o00000o0 */
        public final AbstractC33354o00o0O o00000O(AbstractC33457OooO0oO abstractC33457OooO0oO) {
            if (abstractC33457OooO0oO != null) {
                return this;
            }
            o0000oO(3);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33328Oooo0O0
        /* JADX INFO: renamed from: o00000oO */
        public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
            throw new IllegalStateException(this.f120632OooOo);
        }

        @Override // oO0Ooo.AbstractC33328Oooo0O0
        /* JADX INFO: renamed from: o00000oo */
        public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO c33339OoooOOO) {
            if (c33339OoooOOO != null) {
                throw new IllegalStateException(this.f120632OooOo);
            }
            o0000oO(0);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33309OooOOo
        /* JADX INFO: renamed from: o0000O00 */
        public final AbstractC33328Oooo0O0 o00000O(AbstractC33457OooO0oO abstractC33457OooO0oO) {
            if (abstractC33457OooO0oO != null) {
                return this;
            }
            o0000oO(3);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
        public final /* bridge */ /* synthetic */ AbstractC33354o00o0O o0000Ooo(C33339OoooOOO c33339OoooOOO) {
            o0000Ooo(c33339OoooOOO);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33309OooOOo
        public final AbstractC33309OooOOo o0000oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
            throw new IllegalStateException(this.f120632OooOo);
        }

        @Override // oO0Ooo.AbstractC33328Oooo0O0
        public final String toString() {
            String str = this.f120632OooOo;
            if (str != null) {
                return str;
            }
            o0000oO(1);
            throw null;
        }
    }

    public static AbstractC33320OooOoo OooO(AbstractC33320OooOoo abstractC33320OooOoo, boolean z) {
        if (abstractC33320OooOoo != null) {
            return z ? OooO0oo(abstractC33320OooOoo, true) : abstractC33320OooOoo;
        }
        OooO00o(8);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = C18437z2.f56754h;
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean OooO0O0(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(28);
            throw null;
        }
        if (abstractC33320OooOoo.o00000O0()) {
            return true;
        }
        return o00OO0O0.OooO0O0.OooO(abstractC33320OooOoo) && OooO0O0(((AbstractC33316OooOo0o) abstractC33320OooOoo.o00000OO()).f120555OooOoO0);
    }

    public static boolean OooO0OO(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC32507OooOO0o<AbstractC33354o00o0O, Boolean> interfaceC32507OooOO0o) {
        if (interfaceC32507OooOO0o != null) {
            return OooO0Oo(abstractC33320OooOoo, interfaceC32507OooOO0o, null);
        }
        OooO00o(43);
        throw null;
    }

    public static boolean OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC32507OooOO0o<AbstractC33354o00o0O, Boolean> interfaceC32507OooOO0o, C33558OooO0Oo<AbstractC33320OooOoo> c33558OooO0Oo) {
        if (interfaceC32507OooOO0o == null) {
            OooO00o(44);
            throw null;
        }
        if (abstractC33320OooOoo == null) {
            return false;
        }
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (OooOOO(abstractC33320OooOoo)) {
            return interfaceC32507OooOO0o.invoke(abstractC33354o00o0OO00000OO).booleanValue();
        }
        if (c33558OooO0Oo != null && c33558OooO0Oo.contains(abstractC33320OooOoo)) {
            return false;
        }
        if (interfaceC32507OooOO0o.invoke(abstractC33354o00o0OO00000OO).booleanValue()) {
            return true;
        }
        if (c33558OooO0Oo == null) {
            c33558OooO0Oo = new C33558OooO0Oo<>();
        }
        c33558OooO0Oo.add(abstractC33320OooOoo);
        AbstractC33316OooOo0o abstractC33316OooOo0o = abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o ? (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO : null;
        if (abstractC33316OooOo0o != null && (OooO0Oo(abstractC33316OooOo0o.f120554OooOo, interfaceC32507OooOO0o, c33558OooO0Oo) || OooO0Oo(abstractC33316OooOo0o.f120555OooOoO0, interfaceC32507OooOO0o, c33558OooO0Oo))) {
            return true;
        }
        if ((abstractC33354o00o0OO00000OO instanceof C33310OooOOo0) && OooO0Oo(((C33310OooOOo0) abstractC33354o00o0OO00000OO).f120547OooOo, interfaceC32507OooOO0o, c33558OooO0Oo)) {
            return true;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33320OooOoo.o00000();
        if (interfaceC33342OoooOo0O00000 instanceof C33319OooOoOO) {
            Iterator<AbstractC33320OooOoo> it = ((C33319OooOoOO) interfaceC33342OoooOo0O00000).f120562OooO0O0.iterator();
            while (it.hasNext()) {
                if (OooO0Oo(it.next(), interfaceC32507OooOO0o, c33558OooO0Oo)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC33348OooooOO interfaceC33348OooooOO : abstractC33320OooOoo.o000000O()) {
            if (!interfaceC33348OooooOO.OooO00o() && OooO0Oo(interfaceC33348OooooOO.getType(), interfaceC32507OooOO0o, c33558OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO0o(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(27);
            throw null;
        }
        if (abstractC33320OooOoo.o00000O0()) {
            return true;
        }
        if (o00OO0O0.OooO0O0.OooO(abstractC33320OooOoo) && OooO0o(((AbstractC33316OooOo0o) abstractC33320OooOoo.o00000OO()).f120555OooOoO0)) {
            return true;
        }
        if (abstractC33320OooOoo.o00000OO() instanceof C33310OooOOo0) {
            return false;
        }
        if (!OooO0oO(abstractC33320OooOoo)) {
            if (abstractC33320OooOoo instanceof AbstractC33296OooO0Oo) {
                throw null;
            }
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33320OooOoo.o00000();
            if (!(interfaceC33342OoooOo0O00000 instanceof C33319OooOoOO)) {
                return false;
            }
            Iterator<AbstractC33320OooOoo> it = ((C33319OooOoOO) interfaceC33342OoooOo0O00000).f120562OooO0O0.iterator();
            while (it.hasNext()) {
                if (OooO0o(it.next())) {
                    return true;
                }
            }
            return false;
        }
        if (abstractC33320OooOoo == null) {
            OooO00o(29);
            throw null;
        }
        if (!(abstractC33320OooOoo.o00000().OooO0OO() instanceof InterfaceC32596OooO0o0)) {
            C33356ooOO c33356ooOOOooO0Oo = C33356ooOO.OooO0Oo(abstractC33320OooOoo);
            Collection<AbstractC33320OooOoo> collectionOooO0Oo = abstractC33320OooOoo.o00000().OooO0Oo();
            ArrayList arrayList = new ArrayList(collectionOooO0Oo.size());
            for (AbstractC33320OooOoo abstractC33320OooOoo2 : collectionOooO0Oo) {
                if (abstractC33320OooOoo2 == null) {
                    OooO00o(21);
                    throw null;
                }
                AbstractC33320OooOoo abstractC33320OooOooOooOO0 = c33356ooOOOooO0Oo.OooOO0(1, abstractC33320OooOoo2);
                AbstractC33320OooOoo abstractC33320OooOooOooO = abstractC33320OooOooOooOO0 != null ? OooO(abstractC33320OooOooOooOO0, abstractC33320OooOoo.o00000O0()) : null;
                if (abstractC33320OooOooOooO != null) {
                    arrayList.add(abstractC33320OooOooOooO);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (OooO0o((AbstractC33320OooOoo) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<InterfaceC33348OooooOO> OooO0o0(List<InterfaceC32637OoooOoo> list) {
        if (list == null) {
            OooO00o(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<InterfaceC32637OoooOoo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C33351Oooooo0(it.next().OooOOO()));
        }
        return oOo000Oo.OooOo.o0ooOO0(arrayList);
    }

    public static boolean OooO0oO(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo != null) {
            return (abstractC33320OooOoo.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo ? (InterfaceC32637OoooOoo) abstractC33320OooOoo.o00000().OooO0OO() : null) != null || (abstractC33320OooOoo.o00000() instanceof InterfaceC33464OooOOOO);
        }
        OooO00o(60);
        throw null;
    }

    public static AbstractC33354o00o0O OooO0oo(AbstractC33320OooOoo abstractC33320OooOoo, boolean z) {
        if (abstractC33320OooOoo == null) {
            OooO00o(3);
            throw null;
        }
        AbstractC33354o00o0O abstractC33354o00o0OO00000Oo = abstractC33320OooOoo.o00000OO().o00000Oo(z);
        if (abstractC33354o00o0OO00000Oo != null) {
            return abstractC33354o00o0OO00000Oo;
        }
        OooO00o(4);
        throw null;
    }

    public static AbstractC33328Oooo0O0 OooOO0(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, boolean z) {
        if (abstractC33328Oooo0O0 == null) {
            OooO00o(5);
            throw null;
        }
        if (!z) {
            return abstractC33328Oooo0O0;
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0O00000Oo = abstractC33328Oooo0O0.o00000Oo(true);
        if (abstractC33328Oooo0O0O00000Oo != null) {
            return abstractC33328Oooo0O0O00000Oo;
        }
        OooO00o(6);
        throw null;
    }

    public static C33325Oooo OooOO0O(InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        if (interfaceC32637OoooOoo != null) {
            return new C33325Oooo(interfaceC32637OoooOoo);
        }
        OooO00o(45);
        throw null;
    }

    public static AbstractC33349OooooOo OooOO0o(InterfaceC32637OoooOoo interfaceC32637OoooOoo, C34484OooO00o c34484OooO00o) {
        if (interfaceC32637OoooOoo != null) {
            return c34484OooO00o.f123573OooO0O0 == o00O0O.f120626OooOo0o ? new C33351Oooooo0(1, C24998OooO0O0.OooO0o(interfaceC32637OoooOoo)) : new C33325Oooo(interfaceC32637OoooOoo);
        }
        OooO00o(46);
        throw null;
    }

    public static boolean OooOOO(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo != null) {
            return abstractC33320OooOoo == f120630OooO0OO || abstractC33320OooOoo == f120631OooO0Oo;
        }
        OooO00o(0);
        throw null;
    }

    public static AbstractC33328Oooo0O0 OooOOO0(InterfaceC33342OoooOo0 interfaceC33342OoooOo0, oO0Oo0o0.OooOO0 oooOO02, InterfaceC32507OooOO0o<AbstractC33457OooO0oO, AbstractC33328Oooo0O0> interfaceC32507OooOO0o) {
        if (interfaceC33342OoooOo0 == null) {
            OooO00o(12);
            throw null;
        }
        if (oooOO02 == null) {
            OooO00o(13);
            throw null;
        }
        List<InterfaceC33348OooooOO> listOooO0o0 = OooO0o0(interfaceC33342OoooOo0.getParameters());
        C33339OoooOOO.f120598OooOo.getClass();
        return C33322OooOooO.OooO0oO(C33339OoooOOO.f120599OooOoO0, interfaceC33342OoooOo0, listOooO0o0, false, oooOO02, interfaceC32507OooOO0o);
    }
}
