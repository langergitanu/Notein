package oO0Ooo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0Oo0.AbstractC32688Oooo00o;
import oO0OOOo.C32982OooO;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33373OooOOO;
import oO0OooO0.C33478OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33306OooOOO0 extends AbstractC33294OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC32688Oooo00o f120543OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<InterfaceC32637OoooOoo> f120544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Collection<AbstractC33320OooOoo> f120545OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33306OooOOO0(AbstractC32688Oooo00o abstractC32688Oooo00o, List list, Collection collection, C33361OooO0Oo c33361OooO0Oo) {
        super((InterfaceC33373OooOOO) c33361OooO0Oo);
        if (list == null) {
            OooOOOO(1);
            throw null;
        }
        if (collection == null) {
            OooOOOO(2);
            throw null;
        }
        if (c33361OooO0Oo == null) {
            OooOOOO(3);
            throw null;
        }
        this.f120543OooO0OO = abstractC32688Oooo00o;
        this.f120544OooO0Oo = Collections.unmodifiableList(new ArrayList(list));
        this.f120545OooO0o0 = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void OooOOOO(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return true;
    }

    @Override // oO0Ooo.AbstractC33300OooO0oo
    public final Collection<AbstractC33320OooOoo> OooO0oO() {
        Collection<AbstractC33320OooOoo> collection = this.f120545OooO0o0;
        if (collection != null) {
            return collection;
        }
        OooOOOO(6);
        throw null;
    }

    @Override // oO0Ooo.AbstractC33300OooO0oo
    public final InterfaceC32635OoooOo0 OooOO0() {
        return InterfaceC32635OoooOo0.OooO00o.f117292OooO00o;
    }

    @Override // oO0Ooo.AbstractC33294OooO0O0
    /* JADX INFO: renamed from: OooOOOo */
    public final InterfaceC32596OooO0o0 OooO0OO() {
        AbstractC32688Oooo00o abstractC32688Oooo00o = this.f120543OooO0OO;
        if (abstractC32688Oooo00o != null) {
            return abstractC32688Oooo00o;
        }
        OooOOOO(5);
        throw null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        List<InterfaceC32637OoooOoo> list = this.f120544OooO0Oo;
        if (list != null) {
            return list;
        }
        OooOOOO(4);
        throw null;
    }

    public final String toString() {
        String str = C32982OooO.OooO0oO(this.f120543OooO0OO).f120976OooO00o;
        if (str != null) {
            return str;
        }
        C33478OooO0Oo.OooO00o(4);
        throw null;
    }
}
