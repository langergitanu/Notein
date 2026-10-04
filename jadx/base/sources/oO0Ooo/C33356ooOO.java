package oO0Ooo;

import OooOoo0.C20706o00000oO;
import Oooo0oO.C21091o0000o;
import OoooOOo.C21197OooOO0O;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OooO.C33460OooOO0O;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oO0o000.C33538OooO0OO;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o000O.C33545OooO0O0;
import oO0o000O.C33546OooO0OO;
import oO0o000O.C33547OooO0Oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33356ooOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33356ooOO f120633OooO0O0 = OooO0o0(AbstractC33350Oooooo.f120621OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC33350Oooooo f120634OooO00o;

    /* JADX INFO: renamed from: oO0Ooo.ooOO$OooO00o */
    public static final class OooO00o extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0Ooo.ooOO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f120635OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f120636OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f120637OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f120638OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("NO_CONFLICT", 0);
            f120636OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("IN_IN_OUT_POSITION", 1);
            f120635OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("OUT_IN_IN_POSITION", 2);
            f120638OooOoO0 = oooO0O03;
            f120637OooOoO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f120637OooOoO.clone();
        }
    }

    public C33356ooOO(AbstractC33350Oooooo abstractC33350Oooooo) {
        if (abstractC33350Oooooo != null) {
            this.f120634OooO00o = abstractC33350Oooooo;
        } else {
            OooO00o(7);
            throw null;
        }
    }

    public static String OooO(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (C21197OooOO0O.OooO0Oo(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void OooO00o(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = C18437z2.f56754h;
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static int OooO0O0(int i, int i2) {
        if (i == 0) {
            OooO00o(38);
            throw null;
        }
        if (i2 == 0) {
            OooO00o(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                OooO00o(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                OooO00o(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + C20706o00000oO.OooO0OO(i) + "' and projection kind '" + C20706o00000oO.OooO0OO(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                OooO00o(42);
                throw null;
            }
        }
        return i2;
    }

    public static OooO0O0 OooO0OO(int i, int i2) {
        return (i == 2 && i2 == 3) ? OooO0O0.f120638OooOoO0 : (i == 3 && i2 == 2) ? OooO0O0.f120635OooOo : OooO0O0.f120636OooOo0o;
    }

    public static C33356ooOO OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(6);
            throw null;
        }
        return OooO0o0(AbstractC33344OoooOoo.f120613OooO0O0.OooO00o(abstractC33320OooOoo.o00000(), abstractC33320OooOoo.o000000O()));
    }

    public static C33356ooOO OooO0o(AbstractC33350Oooooo abstractC33350Oooooo, AbstractC33350Oooooo abstractC33350Oooooo2) {
        if (abstractC33350Oooooo == null) {
            OooO00o(3);
            throw null;
        }
        if (abstractC33350Oooooo2 == null) {
            OooO00o(4);
            throw null;
        }
        int i = C33314OooOo00.f120551OooO0Oo;
        if (abstractC33350Oooooo.OooO0o0()) {
            abstractC33350Oooooo = abstractC33350Oooooo2;
        } else if (!abstractC33350Oooooo2.OooO0o0()) {
            abstractC33350Oooooo = new C33314OooOo00(abstractC33350Oooooo, abstractC33350Oooooo2);
        }
        return OooO0o0(abstractC33350Oooooo);
    }

    public static C33356ooOO OooO0o0(AbstractC33350Oooooo abstractC33350Oooooo) {
        if (abstractC33350Oooooo != null) {
            return new C33356ooOO(abstractC33350Oooooo);
        }
        OooO00o(0);
        throw null;
    }

    public final AbstractC33350Oooooo OooO0oO() {
        AbstractC33350Oooooo abstractC33350Oooooo = this.f120634OooO00o;
        if (abstractC33350Oooooo != null) {
            return abstractC33350Oooooo;
        }
        OooO00o(8);
        throw null;
    }

    public final AbstractC33320OooOoo OooO0oo(int i, AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(9);
            throw null;
        }
        if (i == 0) {
            OooO00o(10);
            throw null;
        }
        if (this.f120634OooO00o.OooO0o0()) {
            return abstractC33320OooOoo;
        }
        try {
            AbstractC33320OooOoo type = OooOO0O(new C33351Oooooo0(i, abstractC33320OooOoo), null, 0).getType();
            if (type != null) {
                return type;
            }
            OooO00o(12);
            throw null;
        } catch (OooO00o e) {
            return C33509OooO.OooO0OO(EnumC33517OooO0oo.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    public final AbstractC33320OooOoo OooOO0(int i, AbstractC33320OooOoo abstractC33320OooOoo) {
        if (abstractC33320OooOoo == null) {
            OooO00o(14);
            throw null;
        }
        if (i == 0) {
            OooO00o(15);
            throw null;
        }
        InterfaceC33348OooooOO c33351Oooooo0 = new C33351Oooooo0(i, OooO0oO().OooO0o(i, abstractC33320OooOoo));
        AbstractC33350Oooooo abstractC33350Oooooo = this.f120634OooO00o;
        if (!abstractC33350Oooooo.OooO0o0()) {
            try {
                c33351Oooooo0 = OooOO0O(c33351Oooooo0, null, 0);
            } catch (OooO00o unused) {
                c33351Oooooo0 = null;
            }
        }
        if (abstractC33350Oooooo.OooO00o() || abstractC33350Oooooo.OooO0O0()) {
            boolean zOooO0O0 = abstractC33350Oooooo.OooO0O0();
            if (c33351Oooooo0 == null) {
                c33351Oooooo0 = null;
            } else if (!c33351Oooooo0.OooO00o()) {
                AbstractC33320OooOoo type = c33351Oooooo0.getType();
                kotlin.jvm.internal.OooOOO0.OooO0o(type, "typeProjection.type");
                if (o00Oo0.OooO0OO(type, C33545OooO0O0.f121142OooOo0o)) {
                    int iOooO0OO = c33351Oooooo0.OooO0OO();
                    com.aspose.slides.Oooo0.OooO0OO(iOooO0OO, "typeProjection.projectionKind");
                    if (iOooO0OO == 3) {
                        c33351Oooooo0 = new C33351Oooooo0(iOooO0OO, C33547OooO0Oo.OooO00o(type).f121141OooO0O0);
                    } else if (zOooO0O0) {
                        c33351Oooooo0 = new C33351Oooooo0(iOooO0OO, C33547OooO0Oo.OooO00o(type).f121140OooO00o);
                    } else {
                        C33356ooOO c33356ooOOOooO0o0 = OooO0o0(new C33546OooO0OO());
                        if (!c33356ooOOOooO0o0.f120634OooO00o.OooO0o0()) {
                            try {
                                c33351Oooooo0 = c33356ooOOOooO0o0.OooOO0O(c33351Oooooo0, null, 0);
                            } catch (OooO00o unused2) {
                                c33351Oooooo0 = null;
                            }
                        }
                    }
                }
            }
        }
        if (c33351Oooooo0 == null) {
            return null;
        }
        return c33351Oooooo0.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC33348OooooOO OooOO0O(InterfaceC33348OooooOO interfaceC33348OooooOO, InterfaceC32637OoooOoo interfaceC32637OoooOoo, int i) throws OooO00o {
        char c;
        int i2;
        C33356ooOO c33356ooOO;
        int i3 = 0;
        AbstractC33320OooOoo abstractC33320OooOooOooOO0 = null;
        if (interfaceC33348OooooOO == null) {
            OooO00o(18);
            throw null;
        }
        AbstractC33350Oooooo abstractC33350Oooooo = this.f120634OooO00o;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + OooO(interfaceC33348OooooOO) + "; substitution: " + OooO(abstractC33350Oooooo));
        }
        if (!interfaceC33348OooooOO.OooO00o()) {
            AbstractC33320OooOoo type = interfaceC33348OooooOO.getType();
            if (type instanceof o00Ooo) {
                o00Ooo o00ooo2 = (o00Ooo) type;
                AbstractC33354o00o0O origin = o00ooo2.getOrigin();
                AbstractC33320OooOoo abstractC33320OooOooO0OoOo0 = o00ooo2.o0OoOo0();
                InterfaceC33348OooooOO interfaceC33348OooooOOOooOO0O = OooOO0O(new C33351Oooooo0(interfaceC33348OooooOO.OooO0OO(), origin), interfaceC32637OoooOoo, i + 1);
                return interfaceC33348OooooOOOooOO0O.OooO00o() ? interfaceC33348OooooOOOooOO0O : new C33351Oooooo0(interfaceC33348OooooOOOooOO0O.OooO0OO(), C21091o0000o.OooOOo(interfaceC33348OooooOOOooOO0O.getType().o00000OO(), OooOO0(interfaceC33348OooooOO.OooO0OO(), abstractC33320OooOooO0OoOo0)));
            }
            if (!C33315OooOo0O.OooO00o(type) && !(type.o00000OO() instanceof Oooo0)) {
                InterfaceC33348OooooOO interfaceC33348OooooOOOooO0Oo = abstractC33350Oooooo.OooO0Oo(type);
                if (interfaceC33348OooooOOOooO0Oo == null) {
                    interfaceC33348OooooOOOooO0Oo = null;
                } else if (type.getAnnotations().Oooo000(OooOOO.OooO00o.f117174OooOoO0)) {
                    InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = interfaceC33348OooooOOOooO0Oo.getType().o00000();
                    if (interfaceC33342OoooOo0O00000 instanceof C33460OooOO0O) {
                        InterfaceC33348OooooOO interfaceC33348OooooOO2 = ((C33460OooOO0O) interfaceC33342OoooOo0O00000).f120919OooO00o;
                        int iOooO0OO = interfaceC33348OooooOO2.OooO0OO();
                        OooO0O0 oooO0O0OooO0OO = OooO0OO(interfaceC33348OooooOO.OooO0OO(), iOooO0OO);
                        OooO0O0 oooO0O0 = OooO0O0.f120638OooOoO0;
                        if (oooO0O0OooO0OO == oooO0O0) {
                            interfaceC33348OooooOOOooO0Oo = new C33351Oooooo0(interfaceC33348OooooOO2.getType());
                        } else if (interfaceC32637OoooOoo != null && OooO0OO(interfaceC32637OoooOoo.OooOo0(), iOooO0OO) == oooO0O0) {
                            interfaceC33348OooooOOOooO0Oo = new C33351Oooooo0(interfaceC33348OooooOO2.getType());
                        }
                    }
                }
                int iOooO0OO2 = interfaceC33348OooooOO.OooO0OO();
                if (interfaceC33348OooooOOOooO0Oo == null && o00OO0O0.OooO0O0.OooO(type)) {
                    InterfaceC33541OooO0oO interfaceC33541OooO0oOO00000OO = type.o00000OO();
                    InterfaceC33307OooOOOO interfaceC33307OooOOOO = interfaceC33541OooO0oOO00000OO instanceof InterfaceC33307OooOOOO ? (InterfaceC33307OooOOOO) interfaceC33541OooO0oOO00000OO : null;
                    if (!(interfaceC33307OooOOOO != null ? interfaceC33307OooOOOO.o000OOo() : false)) {
                        AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) type.o00000OO();
                        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = abstractC33316OooOo0o.f120554OooOo;
                        int i4 = i + 1;
                        InterfaceC33348OooooOO interfaceC33348OooooOOOooOO0O2 = OooOO0O(new C33351Oooooo0(iOooO0OO2, abstractC33328Oooo0O0), interfaceC32637OoooOoo, i4);
                        AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = abstractC33316OooOo0o.f120555OooOoO0;
                        InterfaceC33348OooooOO interfaceC33348OooooOOOooOO0O3 = OooOO0O(new C33351Oooooo0(iOooO0OO2, abstractC33328Oooo0O02), interfaceC32637OoooOoo, i4);
                        int iOooO0OO3 = interfaceC33348OooooOOOooOO0O2.OooO0OO();
                        if (interfaceC33348OooooOOOooOO0O2.getType() != abstractC33328Oooo0O0 || interfaceC33348OooooOOOooOO0O3.getType() != abstractC33328Oooo0O02) {
                            return new C33351Oooooo0(iOooO0OO3, C33322OooOooO.OooO0OO(C33353Ooooooo.OooO00o(interfaceC33348OooooOOOooOO0O2.getType()), C33353Ooooooo.OooO00o(interfaceC33348OooooOOOooOO0O3.getType())));
                        }
                    }
                } else if (!oO0O0O0o.OooOO0.OooOooO(type) && !o0OOO0o.OooO0O0(type)) {
                    if (interfaceC33348OooooOOOooO0Oo != null) {
                        OooO0O0 oooO0O0OooO0OO2 = OooO0OO(iOooO0OO2, interfaceC33348OooooOOOooO0Oo.OooO0OO());
                        if (!(type.o00000() instanceof oO0OOo0.OooO0O0)) {
                            int iOrdinal = oooO0O0OooO0OO2.ordinal();
                            if (iOrdinal == 1) {
                                return new C33351Oooooo0(3, type.o00000().OooOO0O().OooOOO());
                            }
                            if (iOrdinal == 2) {
                                throw new OooO00o("Out-projection in in-position");
                            }
                        }
                        InterfaceC33541OooO0oO interfaceC33541OooO0oOO00000OO2 = type.o00000OO();
                        InterfaceC33307OooOOOO interfaceC33307OooOOOO2 = interfaceC33541OooO0oOO00000OO2 instanceof InterfaceC33307OooOOOO ? (InterfaceC33307OooOOOO) interfaceC33541OooO0oOO00000OO2 : null;
                        if (interfaceC33307OooOOOO2 == null || !interfaceC33307OooOOOO2.o000OOo()) {
                            interfaceC33307OooOOOO2 = null;
                        }
                        if (interfaceC33348OooooOOOooO0Oo.OooO00o()) {
                            return interfaceC33348OooooOOOooO0Oo;
                        }
                        AbstractC33320OooOoo abstractC33320OooOooOoooO = interfaceC33307OooOOOO2 != null ? interfaceC33307OooOOOO2.OoooO(interfaceC33348OooooOOOooO0Oo.getType()) : o00Oo0.OooO(interfaceC33348OooooOOOooO0Oo.getType(), type.o00000O0());
                        if (!type.getAnnotations().isEmpty()) {
                            InterfaceC34588OooO0oO interfaceC34588OooO0oOOooO0OO = abstractC33350Oooooo.OooO0OO(type.getAnnotations());
                            if (interfaceC34588OooO0oOOooO0OO == null) {
                                OooO00o(33);
                                throw null;
                            }
                            if (interfaceC34588OooO0oOOooO0OO.Oooo000(OooOOO.OooO00o.f117174OooOoO0)) {
                                interfaceC34588OooO0oOOooO0OO = new oOo0oooO.OooOO0O(interfaceC34588OooO0oOOooO0OO, new o0OoOo0());
                            }
                            abstractC33320OooOooOoooO = C33538OooO0OO.OooOO0(abstractC33320OooOooOoooO, new oOo0oooO.OooOO0(abstractC33320OooOooOoooO.getAnnotations(), interfaceC34588OooO0oOOooO0OO));
                        }
                        if (oooO0O0OooO0OO2 == OooO0O0.f120636OooOo0o) {
                            iOooO0OO2 = OooO0O0(iOooO0OO2, interfaceC33348OooooOOOooO0Oo.OooO0OO());
                        }
                        return new C33351Oooooo0(iOooO0OO2, abstractC33320OooOooOoooO);
                    }
                    AbstractC33320OooOoo type2 = interfaceC33348OooooOO.getType();
                    int iOooO0OO4 = interfaceC33348OooooOO.OooO0OO();
                    if (!(type2.o00000().OooO0OO() instanceof InterfaceC32637OoooOoo)) {
                        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = type2.o00000OO();
                        C33293OooO00o c33293OooO00o = abstractC33354o00o0OO00000OO instanceof C33293OooO00o ? (C33293OooO00o) abstractC33354o00o0OO00000OO : null;
                        AbstractC33328Oooo0O0 abstractC33328Oooo0O03 = c33293OooO00o != null ? c33293OooO00o.f120521OooOoO0 : null;
                        if (abstractC33328Oooo0O03 != null) {
                            if ((abstractC33350Oooooo instanceof C33317OooOoO) && abstractC33350Oooooo.OooO0O0()) {
                                C33317OooOoO c33317OooOoO = (C33317OooOoO) abstractC33350Oooooo;
                                c33356ooOO = new C33356ooOO(new C33317OooOoO(c33317OooOoO.f120556OooO0O0, c33317OooOoO.f120557OooO0OO, false));
                            } else {
                                c33356ooOO = this;
                            }
                            abstractC33320OooOooOooOO0 = c33356ooOO.OooOO0(1, abstractC33328Oooo0O03);
                        }
                        List<InterfaceC32637OoooOoo> parameters = type2.o00000().getParameters();
                        List<InterfaceC33348OooooOO> newArguments = type2.o000000O();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        int i5 = 0;
                        while (i3 < parameters.size()) {
                            InterfaceC32637OoooOoo interfaceC32637OoooOoo2 = parameters.get(i3);
                            InterfaceC33348OooooOO interfaceC33348OooooOO3 = newArguments.get(i3);
                            InterfaceC33348OooooOO interfaceC33348OooooOOOooOO0O4 = OooOO0O(interfaceC33348OooooOO3, interfaceC32637OoooOoo2, i + 1);
                            int iOrdinal2 = OooO0OO(interfaceC32637OoooOoo2.OooOo0(), interfaceC33348OooooOOOooOO0O4.OooO0OO()).ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    c = 2;
                                    if (iOrdinal2 == 2) {
                                    }
                                    i2 = 1;
                                } else {
                                    c = 2;
                                }
                                interfaceC33348OooooOOOooOO0O4 = o00Oo0.OooOO0O(interfaceC32637OoooOoo2);
                                i2 = 1;
                            } else {
                                c = 2;
                                int iOooOo0 = interfaceC32637OoooOoo2.OooOo0();
                                i2 = 1;
                                if (iOooOo0 != 1 && !interfaceC33348OooooOOOooOO0O4.OooO00o()) {
                                    interfaceC33348OooooOOOooOO0O4 = new C33351Oooooo0(1, interfaceC33348OooooOOOooOO0O4.getType());
                                }
                            }
                            if (interfaceC33348OooooOOOooOO0O4 != interfaceC33348OooooOO3) {
                                i5 = i2;
                            }
                            arrayList.add(interfaceC33348OooooOOOooOO0O4);
                            i3 += i2;
                        }
                        if (i5 != 0) {
                            newArguments = arrayList;
                        }
                        InterfaceC34588OooO0oO newAnnotations = abstractC33350Oooooo.OooO0OO(type2.getAnnotations());
                        kotlin.jvm.internal.OooOOO0.OooO0oO(newArguments, "newArguments");
                        kotlin.jvm.internal.OooOOO0.OooO0oO(newAnnotations, "newAnnotations");
                        AbstractC33320OooOoo abstractC33320OooOooOooO0OO = C33353Ooooooo.OooO0OO(type2, newArguments, newAnnotations, 4);
                        if ((abstractC33320OooOooOooO0OO instanceof AbstractC33328Oooo0O0) && (abstractC33320OooOooOooOO0 instanceof AbstractC33328Oooo0O0)) {
                            abstractC33320OooOooOooO0OO = C33332Oooo0oO.OooO0OO((AbstractC33328Oooo0O0) abstractC33320OooOooOooO0OO, (AbstractC33328Oooo0O0) abstractC33320OooOooOooOO0);
                        }
                        return new C33351Oooooo0(iOooO0OO4, abstractC33320OooOooOooO0OO);
                    }
                }
            }
        }
        return interfaceC33348OooooOO;
    }
}
