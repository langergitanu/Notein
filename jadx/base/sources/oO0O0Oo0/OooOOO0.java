package oO0O0Oo0;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.o000oOoO;
import oO0OOOo.C32987OooO0o;
import oO0OOOo.C32989OooO0oO;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33300OooO0oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0Ooo0.InterfaceC33373OooOOO;
import oO0OooO0.C33479OooO0o;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOO0 extends AbstractC32675OooOOoo implements InterfaceC32637OoooOoo {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f117405OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f117406OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f117407OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final InterfaceC33370OooOO0<InterfaceC33342OoooOo0> f117408OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final InterfaceC33370OooOO0<AbstractC33328Oooo0O0> f117409OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC33373OooOOO f117410Oooo000;

    public class OooO00o extends AbstractC33300OooO0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC32635OoooOo0.OooO00o f117411OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f117412OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOO0 oooOOO0, InterfaceC33373OooOOO interfaceC33373OooOOO, InterfaceC32635OoooOo0.OooO00o oooO00o) {
            super(interfaceC33373OooOOO);
            if (interfaceC33373OooOOO == null) {
                OooOOOO(0);
                throw null;
            }
            this.f117412OooO0Oo = oooOOO0;
            this.f117411OooO0OO = oooO00o;
        }

        public static /* synthetic */ void OooOOOO(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = C18437z2.f56754h;
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // oO0Ooo.InterfaceC33342OoooOo0
        public final InterfaceC32598OooO0oo OooO0OO() {
            OooOOO0 oooOOO0 = this.f117412OooO0Oo;
            if (oooOOO0 != null) {
                return oooOOO0;
            }
            OooOOOO(3);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33305OooOOO
        public final boolean OooO0o(InterfaceC32598OooO0oo interfaceC32598OooO0oo) {
            if (!(interfaceC32598OooO0oo instanceof InterfaceC32637OoooOoo)) {
                return false;
            }
            OooOOO0 a = this.f117412OooO0Oo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
            return C32989OooO0oO.f119360OooO00o.OooO0O0(a, (InterfaceC32637OoooOoo) interfaceC32598OooO0oo, true, C32987OooO0o.f119357OooOo0o);
        }

        @Override // oO0Ooo.InterfaceC33342OoooOo0
        public final boolean OooO0o0() {
            return true;
        }

        @Override // oO0Ooo.AbstractC33300OooO0oo
        public final Collection<AbstractC33320OooOoo> OooO0oO() {
            List<AbstractC33320OooOoo> listO00000 = this.f117412OooO0Oo.o00000();
            if (listO00000 != null) {
                return listO00000;
            }
            OooOOOO(1);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33300OooO0oo
        public final AbstractC33320OooOoo OooO0oo() {
            return C33509OooO.OooO0OO(EnumC33517OooO0oo.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // oO0Ooo.AbstractC33300OooO0oo
        public final InterfaceC32635OoooOo0 OooOO0() {
            InterfaceC32635OoooOo0.OooO00o oooO00o = this.f117411OooO0OO;
            if (oooO00o != null) {
                return oooO00o;
            }
            OooOOOO(5);
            throw null;
        }

        @Override // oO0Ooo.InterfaceC33342OoooOo0
        public final oO0O0O0o.OooOO0 OooOO0O() {
            oO0O0O0o.OooOO0 oooOO0OooO0o0 = C33194OooO0O0.OooO0o0(this.f117412OooO0Oo);
            if (oooOO0OooO0o0 != null) {
                return oooOO0OooO0o0;
            }
            OooOOOO(4);
            throw null;
        }

        @Override // oO0Ooo.AbstractC33300OooO0oo
        public final void OooOOO(AbstractC33320OooOoo abstractC33320OooOoo) {
            if (abstractC33320OooOoo != null) {
                this.f117412OooO0Oo.o000000o(abstractC33320OooOoo);
            } else {
                OooOOOO(6);
                throw null;
            }
        }

        @Override // oO0Ooo.AbstractC33300OooO0oo
        public final List<AbstractC33320OooOoo> OooOOO0(List<AbstractC33320OooOoo> list) {
            List<AbstractC33320OooOoo> listO000000O = this.f117412OooO0Oo.o000000O(list);
            if (listO000000O != null) {
                return listO000000O;
            }
            OooOOOO(8);
            throw null;
        }

        @Override // oO0Ooo.InterfaceC33342OoooOo0
        public final List<InterfaceC32637OoooOoo> getParameters() {
            List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            OooOOOO(2);
            throw null;
        }

        public final String toString() {
            return this.f117412OooO0Oo.getName().f120981OooOo0o;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOOO0(InterfaceC33373OooOOO interfaceC33373OooOOO, oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, int i, boolean z, int i2, InterfaceC32635OoooOo0.OooO00o oooO00o) {
        o000oOoO.OooO00o oooO00o2 = oO0O0OO.o000oOoO.f117308OooO00o;
        if (interfaceC33373OooOOO == null) {
            OoooO(0);
            throw null;
        }
        if (oooOO0O == null) {
            OoooO(1);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(2);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(3);
            throw null;
        }
        if (i == 0) {
            OoooO(4);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(6);
            throw null;
        }
        super(oooOO0O, interfaceC34588OooO0oO, c33479OooO0o, oooO00o2);
        this.f117405OooOoOO = i;
        this.f117407OooOoo0 = z;
        this.f117406OooOoo = i2;
        this.f117408OooOooO = interfaceC33373OooOOO.OooO00o(new OooOO0(this, interfaceC33373OooOOO, oooO00o));
        this.f117409OooOooo = interfaceC33373OooOOO.OooO00o(new C32671OooOO0o(this, c33479OooO0o));
        this.f117410Oooo000 = interfaceC33373OooOOO;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo, oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0Invoke = this.f117408OooOooO.invoke();
        if (interfaceC33342OoooOo0Invoke != null) {
            return interfaceC33342OoooOo0Invoke;
        }
        OoooO(9);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32598OooO0oo o000OOo() {
        return this;
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final AbstractC33328Oooo0O0 OooOOO() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0Invoke = this.f117409OooOooo.invoke();
        if (abstractC33328Oooo0O0Invoke != null) {
            return abstractC33328Oooo0O0Invoke;
        }
        OoooO(10);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final boolean OooOOo() {
        return this.f117407OooOoo0;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final int OooOo0() {
        int i = this.f117405OooOoOO;
        if (i != 0) {
            return i;
        }
        OoooO(7);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final boolean OooOoo() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final InterfaceC33373OooOOO OoooOoO() {
        InterfaceC33373OooOOO interfaceC33373OooOOO = this.f117410Oooo000;
        if (interfaceC33373OooOOO != null) {
            return interfaceC33373OooOOO;
        }
        OoooO(14);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final int getIndex() {
        return this.f117406OooOoo;
    }

    @Override // oO0O0OO.InterfaceC32637OoooOoo
    public final List<AbstractC33320OooOoo> getUpperBounds() {
        List<AbstractC33320OooOoo> listOooO0Oo = ((OooO00o) OooO()).OooO0Oo();
        if (listOooO0Oo != null) {
            return listOooO0Oo;
        }
        OoooO(8);
        throw null;
    }

    public abstract List<AbstractC33320OooOoo> o00000();

    public List<AbstractC33320OooOoo> o000000O(List<AbstractC33320OooOoo> list) {
        return list;
    }

    public abstract void o000000o(AbstractC33320OooOoo abstractC33320OooOoo);

    @Override // oO0O0Oo0.AbstractC32675OooOOoo
    public final oO0O0OO.OooOOO o000OOo() {
        return this;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooOO0O(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final oO0O0OO.OooOO0O o000OOo() {
        return this;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32637OoooOoo o000OOo() {
        return this;
    }
}
