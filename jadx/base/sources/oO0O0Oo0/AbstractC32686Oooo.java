package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32626Oooo0oO;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.OooO00o;
import oO0O0OO.OooO0O0;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32686Oooo extends AbstractC32675OooOOoo implements InterfaceC32626Oooo0oO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f117494OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final EnumC32614OooOoOO f117495OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f117496OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final InterfaceC32627Oooo0oo f117497OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f117498OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO0O0.OooO00o f117499Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public AbstractC32601OooOOo f117500Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public InterfaceC32609OooOo0 f117501Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32686Oooo(EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, boolean z, boolean z2, boolean z3, OooO0O0.OooO00o oooO00o, oO0O0OO.o000oOoO o000oooo2) {
        super(interfaceC32627Oooo0oo.OooO0Oo(), interfaceC34588OooO0oO, c33479OooO0o, o000oooo2);
        if (enumC32614OooOoOO == null) {
            OoooO(0);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(1);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(3);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(5);
            throw null;
        }
        this.f117501Oooo00o = null;
        this.f117495OooOoo = enumC32614OooOoOO;
        this.f117500Oooo00O = abstractC32601OooOOo;
        this.f117497OooOooO = interfaceC32627Oooo0oo;
        this.f117494OooOoOO = z;
        this.f117496OooOoo0 = z2;
        this.f117498OooOooo = z3;
        this.f117499Oooo000 = oooO00o;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0, oO0O0OO.InterfaceC32634OoooOOo
    public final InterfaceC32609OooOo0 OooO0O0(C33356ooOO c33356ooOO) {
        if (c33356ooOO != null) {
            return this;
        }
        OoooO(7);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final EnumC32614OooOoOO OooO0oO() {
        EnumC32614OooOoOO enumC32614OooOoOO = this.f117495OooOoo;
        if (enumC32614OooOoOO != null) {
            return enumC32614OooOoOO;
        }
        OoooO(10);
        throw null;
    }

    @Override // oO0O0OO.OooO0O0
    public final oO0O0OO.OooO0O0 OooOOoo(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32600OooOOOo abstractC32600OooOOOo) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean OooOo0O() {
        return false;
    }

    @Override // oO0O0OO.OooO0O0
    public final void Oooo0oO(Collection<? extends oO0O0OO.OooO0O0> collection) {
        if (collection != null) {
            return;
        }
        OoooO(16);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean Oooo0oo() {
        return false;
    }

    @Override // oO0O0OO.OooO00o
    public final InterfaceC32629OoooO0 OoooOo0() {
        return Ooooo0o().OoooOo0();
    }

    @Override // oO0O0OO.OooO00o
    public final InterfaceC32629OoooO0 OoooOoo() {
        return Ooooo0o().OoooOoo();
    }

    @Override // oO0O0OO.InterfaceC32626Oooo0oO
    public final InterfaceC32627Oooo0oo Ooooo0o() {
        InterfaceC32627Oooo0oo interfaceC32627Oooo0oo = this.f117497OooOooO;
        if (interfaceC32627Oooo0oo != null) {
            return interfaceC32627Oooo0oo;
        }
        OoooO(13);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean OooooO0() {
        return false;
    }

    @Override // oO0O0OO.OooO00o
    public final boolean Ooooooo() {
        return false;
    }

    @Override // oO0O0OO.OooO0O0
    public final OooO0O0.OooO00o getKind() {
        OooO0O0.OooO00o oooO00o = this.f117499Oooo000;
        if (oooO00o != null) {
            return oooO00o;
        }
        OoooO(6);
        throw null;
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32637OoooOoo> getTypeParameters() {
        List<InterfaceC32637OoooOoo> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        OoooO(9);
        throw null;
    }

    @Override // oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        AbstractC32601OooOOo abstractC32601OooOOo = this.f117500Oooo00O;
        if (abstractC32601OooOOo != null) {
            return abstractC32601OooOOo;
        }
        OoooO(11);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean isExternal() {
        return this.f117496OooOoo0;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean isInfix() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean isInline() {
        return this.f117498OooOooo;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean isOperator() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean isSuspend() {
        return false;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: o000000O */
    public abstract InterfaceC32626Oooo0oO o000OOo();

    public final ArrayList o000000o(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends oO0O0OO.OooO0O0> it = Ooooo0o().OooOO0o().iterator();
        while (it.hasNext()) {
            InterfaceC32627Oooo0oo interfaceC32627Oooo0oo = (InterfaceC32627Oooo0oo) it.next();
            oO0O0OO.OooOOO getter = z ? interfaceC32627Oooo0oo.getGetter() : interfaceC32627Oooo0oo.OooO0o0();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // oO0O0OO.OooO00o
    public final <V> V o00O0O(OooO00o.InterfaceC20249OooO00o<V> interfaceC20249OooO00o) {
        return null;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean o00Oo0() {
        return false;
    }

    @Override // oO0O0OO.OooO00o
    public final List<InterfaceC32629OoooO0> o0OOO0o() {
        List<InterfaceC32629OoooO0> listO0OOO0o = Ooooo0o().o0OOO0o();
        if (listO0OOO0o != null) {
            return listO0OOO0o;
        }
        OoooO(14);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final InterfaceC32609OooOo0 o0ooOO0() {
        return this.f117501Oooo00o;
    }

    @Override // oO0O0OO.InterfaceC32609OooOo0
    public final boolean oo0o0Oo() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32634OoooOOo
    public final /* bridge */ /* synthetic */ InterfaceC32599OooOO0o OooO0O0(C33356ooOO c33356ooOO) {
        OooO0O0(c33356ooOO);
        return this;
    }
}
