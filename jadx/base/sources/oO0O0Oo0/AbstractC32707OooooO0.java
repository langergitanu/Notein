package oO0O0Oo0;

import oO0OOo.AbstractC33038OooO0oO;
import oO0Ooo0.InterfaceC33371OooOO0O;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32707OooooO0 extends AbstractC32706Ooooo0o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InterfaceC33371OooOO0O<AbstractC33038OooO0oO<?>> f117593OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f117594OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public kotlin.jvm.internal.OooOOOO f117595OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32707OooooO0(oO0O0OO.OooOO0O oooOO0O, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, boolean z, oO0O0OO.o000oOoO o000oooo2) {
        super(oooOO0O, interfaceC34588OooO0oO, c33479OooO0o, null, o000oooo2);
        if (oooOO0O == null) {
            OoooO(0);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(1);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(2);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(3);
            throw null;
        }
        this.f117594OooOoo0 = z;
    }

    public static /* synthetic */ void OoooO(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // oO0O0OO.InterfaceC32642OooooOo
    public final boolean OooOoOO() {
        return this.f117594OooOoo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o000000O(InterfaceC33371OooOO0O<AbstractC33038OooO0oO<?>> interfaceC33371OooOO0O, oO0O000o.OooO00o<InterfaceC33371OooOO0O<AbstractC33038OooO0oO<?>>> oooO00o) {
        if (oooO00o == 0) {
            OoooO(5);
            throw null;
        }
        this.f117595OooOooO = (kotlin.jvm.internal.OooOOOO) oooO00o;
        if (interfaceC33371OooOO0O == null) {
            interfaceC33371OooOO0O = (InterfaceC33371OooOO0O) oooO00o.invoke();
        }
        this.f117593OooOoo = interfaceC33371OooOO0O;
    }

    @Override // oO0O0OO.InterfaceC32642OooooOo
    public final AbstractC33038OooO0oO<?> o00ooo() {
        InterfaceC33371OooOO0O<AbstractC33038OooO0oO<?>> interfaceC33371OooOO0O = this.f117593OooOoo;
        if (interfaceC33371OooOO0O != null) {
            return interfaceC33371OooOO0O.invoke();
        }
        return null;
    }
}
