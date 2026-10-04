package oO0OOOo;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32623Oooo0OO;
import oO0O0OO.InterfaceC32630OoooO00;
import oO0O0OO.InterfaceC32633OoooOOO;
import oO0O0OO.OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33482OooO0oo;
import oO0Oooo.C33509OooO;

/* JADX INFO: renamed from: oO0OOOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32982OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f119352OooO00o = 0;

    static {
        new C33477OooO0OO("kotlin.jvm.JvmName");
    }

    public static <D extends oO0O0OO.OooOO0O> D OooO(oO0O0OO.OooOO0O oooOO0O, Class<D> cls, boolean z) {
        if (oooOO0O == null) {
            return null;
        }
        if (z) {
            oooOO0O = (D) oooOO0O.OooO0Oo();
        }
        while (oooOO0O != null) {
            if (cls.isInstance(oooOO0O)) {
                return (D) oooOO0O;
            }
            oooOO0O = (D) oooOO0O.OooO0Oo();
        }
        return null;
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = C18437z2.f56754h;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void OooO0O0(oO0O0OO.OooO00o oooO00o, LinkedHashSet linkedHashSet) {
        if (oooO00o == null) {
            OooO00o(73);
            throw null;
        }
        if (linkedHashSet.contains(oooO00o)) {
            return;
        }
        Iterator<? extends oO0O0OO.OooO00o> it = oooO00o.o000OOo().OooOO0o().iterator();
        while (it.hasNext()) {
            oO0O0OO.OooO00o OooO00o2 = it.next().o000OOo();
            OooO0O0(OooO00o2, linkedHashSet);
            linkedHashSet.add(OooO00o2);
        }
    }

    public static InterfaceC32596OooO0o0 OooO0OO(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(45);
            throw null;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33320OooOoo.o00000();
        if (interfaceC33342OoooOo0O00000 == null) {
            OooO00o(46);
            throw null;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) interfaceC33342OoooOo0O00000.OooO0OO();
        if (interfaceC32596OooO0o0 != null) {
            return interfaceC32596OooO0o0;
        }
        OooO00o(47);
        throw null;
    }

    public static InterfaceC32615OooOoo OooO0Oo(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(21);
            throw null;
        }
        InterfaceC32615OooOoo interfaceC32615OooOooOooO0o0 = OooO0o0(oooOO0O);
        if (interfaceC32615OooOooOooO0o0 != null) {
            return interfaceC32615OooOooOooO0o0;
        }
        OooO00o(22);
        throw null;
    }

    public static InterfaceC32633OoooOOO OooO0o(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(82);
            throw null;
        }
        if (oooOO0O instanceof InterfaceC32630OoooO00) {
            oooOO0O = ((InterfaceC32630OoooO00) oooOO0O).Ooooo0o();
        }
        boolean z = oooOO0O instanceof oO0O0OO.OooOOO;
        InterfaceC32633OoooOOO.OooO00o oooO00o = InterfaceC32633OoooOOO.f117291OooO00o;
        if (z) {
            ((oO0O0OO.OooOOO) oooOO0O).getSource().getClass();
        }
        return oooO00o;
    }

    public static InterfaceC32615OooOoo OooO0o0(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(23);
            throw null;
        }
        while (oooOO0O != null) {
            if (oooOO0O instanceof InterfaceC32615OooOoo) {
                return (InterfaceC32615OooOoo) oooOO0O;
            }
            if (oooOO0O instanceof InterfaceC32623Oooo0OO) {
                return ((InterfaceC32623Oooo0OO) oooOO0O).o0OO00O();
            }
            oooOO0O = oooOO0O.OooO0Oo();
        }
        return null;
    }

    public static C33478OooO0Oo OooO0oO(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O != null) {
            C33477OooO0OO c33477OooO0OOOooO0oo = OooO0oo(oooOO0O);
            return c33477OooO0OOOooO0oo != null ? c33477OooO0OOOooO0oo.OooO() : OooO0oO(oooOO0O.OooO0Oo()).OooO0O0(oooOO0O.getName());
        }
        OooO00o(2);
        throw null;
    }

    public static C33477OooO0OO OooO0oo(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(5);
            throw null;
        }
        if ((oooOO0O instanceof InterfaceC32615OooOoo) || C33509OooO.OooO0o(oooOO0O)) {
            return C33477OooO0OO.f120970OooO0OO;
        }
        if (oooOO0O instanceof InterfaceC32623Oooo0OO) {
            return ((InterfaceC32623Oooo0OO) oooOO0O).OooO0OO();
        }
        if (oooOO0O instanceof InterfaceC32620Oooo00O) {
            return ((InterfaceC32620Oooo00O) oooOO0O).OooO0OO();
        }
        return null;
    }

    public static InterfaceC32596OooO0o0 OooOO0(InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(44);
            throw null;
        }
        Iterator<AbstractC33320OooOoo> it = interfaceC32596OooO0o0.OooO().OooO0Oo().iterator();
        while (it.hasNext()) {
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0OO = OooO0OO(it.next());
            if (interfaceC32596OooO0o0OooO0OO.getKind() != oO0O0OO.OooO0o.f117229OooOo) {
                return interfaceC32596OooO0o0OooO0OO;
            }
        }
        return null;
    }

    public static boolean OooOO0O(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O != null) {
            return OooOOO(oooOO0O, oO0O0OO.OooO0o.f117230OooOo0o) && oooOO0O.getName().equals(C33482OooO0oo.f120983OooO00o);
        }
        OooO00o(34);
        throw null;
    }

    public static boolean OooOO0o(oO0O0OO.OooOO0O oooOO0O) {
        return OooOOO(oooOO0O, oO0O0OO.OooO0o.f117235OooOoo0) && ((InterfaceC32596OooO0o0) oooOO0O).Oooooo0();
    }

    public static boolean OooOOO(oO0O0OO.OooOO0O oooOO0O, oO0O0OO.OooO0o oooO0o) {
        return (oooOO0O instanceof InterfaceC32596OooO0o0) && ((InterfaceC32596OooO0o0) oooOO0O).getKind() == oooO0o;
    }

    public static boolean OooOOO0(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O != null) {
            return OooOOO(oooOO0O, oO0O0OO.OooO0o.f117231OooOoO);
        }
        OooO00o(36);
        throw null;
    }

    public static boolean OooOOOO(oO0O0OO.OooOO0O oooOO0O) {
        if (oooOO0O == null) {
            OooO00o(1);
            throw null;
        }
        while (oooOO0O != null) {
            if (OooOO0O(oooOO0O) || ((oooOO0O instanceof oO0O0OO.OooOOOO) && ((oO0O0OO.OooOOOO) oooOO0O).getVisibility() == C32602OooOOo0.f117242OooO0o)) {
                return true;
            }
            oooOO0O = oooOO0O.OooO0Oo();
        }
        return false;
    }

    public static boolean OooOOOo(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        if (abstractC33320OooOoo == null) {
            OooO00o(30);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(31);
            throw null;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO == null) {
            return false;
        }
        oO0O0OO.OooOO0O oooOO0OOooO00o = interfaceC32598OooO0ooOooO0OO.o000OOo();
        return (oooOO0OOooO00o instanceof InterfaceC32598OooO0oo) && interfaceC32596OooO0o0.OooO().equals(((InterfaceC32598OooO0oo) oooOO0OOooO00o).OooO());
    }

    public static boolean OooOOo(AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        if (abstractC33320OooOoo == null) {
            OooO00o(32);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(33);
            throw null;
        }
        if (OooOOOo(abstractC33320OooOoo, interfaceC32596OooO0o0)) {
            return true;
        }
        Iterator<AbstractC33320OooOoo> it = abstractC33320OooOoo.o00000().OooO0Oo().iterator();
        while (it.hasNext()) {
            if (OooOOo(it.next(), interfaceC32596OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooOOo0(oO0O0OO.OooOO0O oooOO0O) {
        return (OooOOO(oooOO0O, oO0O0OO.OooO0o.f117230OooOo0o) || OooOOO(oooOO0O, oO0O0OO.OooO0o.f117229OooOo)) && ((InterfaceC32596OooO0o0) oooOO0O).OooO0oO() == EnumC32614OooOoOO.f117260OooOo;
    }

    public static boolean OooOOoo(oO0O0OO.OooOO0O oooOO0O) {
        return oooOO0O != null && (oooOO0O.OooO0Oo() instanceof InterfaceC32620Oooo00O);
    }

    public static <D extends oO0O0OO.OooO0O0> D OooOo00(D d) {
        if (d == null) {
            OooO00o(59);
            throw null;
        }
        while (d.getKind() == OooO0O0.OooO00o.f117221OooOo) {
            Collection<? extends oO0O0OO.OooO0O0> collectionOooOO0o = d.OooOO0o();
            if (collectionOooOO0o.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
            d = (D) collectionOooOO0o.iterator().next();
        }
        return d;
    }
}
