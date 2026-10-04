package oO0O0oOo;

import com.android.billingclient.api.OooOO0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o0OOO0O0.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO00o;
import oO0O0OO.OooO0O0;
import oO0O0OO.OooOO0O;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.AbstractC32682OooOoo;
import oO0O0Oo0.C32695OoooO;
import oO0O0Oo0.C32699OoooOO0;
import oO0OOOo.C32990OooO0oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33588OooOO0;
import oOo00OOo.C34498OooO0o0;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOoOoo.AbstractC35163OooO0oO;
import ooOOoOoo.C35166OooOO0O;
import ooOOoOoo.C35174OooOOoo;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: oO0O0oOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32776OooO0o0 extends C32699OoooOO0 implements InterfaceC32771OooO00o {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final OooO00o f117745Ooooo0o = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final OooO0O0 f117746OooooO0 = new OooO0O0();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f117747OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f117748Ooooo00;

    /* JADX INFO: renamed from: oO0O0oOo.OooO0o0$OooO00o */
    public static class OooO00o implements OooO00o.InterfaceC20249OooO00o<InterfaceC32641OooooOO> {
    }

    /* JADX INFO: renamed from: oO0O0oOo.OooO0o0$OooO0O0 */
    public static class OooO0O0 implements OooO00o.InterfaceC20249OooO00o<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32776OooO0o0(OooOO0O oooOO0O, InterfaceC32632OoooOO0 interfaceC32632OoooOO0, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, OooO0O0.OooO00o oooO00o, o000oOoO o000oooo2, boolean z) {
        super(oooOO0O, interfaceC32632OoooOO0, interfaceC34588OooO0oO, c33479OooO0o, oooO00o, o000oooo2);
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
        if (oooO00o == null) {
            OoooO(3);
            throw null;
        }
        if (o000oooo2 == null) {
            OoooO(4);
            throw null;
        }
        this.f117747OoooOoo = 0;
        this.f117748Ooooo00 = z;
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C32776OooO0o0 o0000O0(OooOO0O oooOO0O, C34498OooO0o0 c34498OooO0o0, C33479OooO0o c33479OooO0o, ooOOO00O.OooO00o oooO00o, boolean z) {
        if (oooOO0O == null) {
            OoooO(5);
            throw null;
        }
        if (c33479OooO0o == null) {
            OoooO(7);
            throw null;
        }
        if (oooO00o != null) {
            return new C32776OooO0o0(oooOO0O, null, c34498OooO0o0, c33479OooO0o, OooO0O0.OooO00o.f117222OooOo0o, oooO00o, z);
        }
        OoooO(8);
        throw null;
    }

    @Override // oO0O0oOo.InterfaceC32771OooO00o
    public final InterfaceC32771OooO00o Oooo0O0(AbstractC33320OooOoo abstractC33320OooOoo, ArrayList arrayList, AbstractC33320OooOoo abstractC33320OooOoo2, C32443OooOOO c32443OooOOO) {
        ArrayList arrayListOooO00o = OooOO0.OooO00o(arrayList, OooO0o(), this);
        C32695OoooO c32695OoooOOooO0oo = abstractC33320OooOoo == null ? null : C32990OooO0oo.OooO0oo(this, abstractC33320OooOoo, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o);
        AbstractC32682OooOoo.OooO00o oooO00oO00000OO = o00000OO(C33356ooOO.f120633OooO0O0);
        oooO00oO00000OO.f117473OooO0oO = arrayListOooO00o;
        oooO00oO00000OO.f117476OooOO0O = abstractC33320OooOoo2;
        oooO00oO00000OO.f117466OooO = c32695OoooOOooO0oo;
        oooO00oO00000OO.f117481OooOOOo = true;
        oooO00oO00000OO.f117480OooOOOO = true;
        C32776OooO0o0 c32776OooO0o0 = (C32776OooO0o0) oooO00oO00000OO.f117485OooOo.o00000(oooO00oO00000OO);
        if (c32443OooOOO != null) {
            c32776OooO0o0.o00000Oo((OooO00o.InterfaceC20249OooO00o) c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
        if (c32776OooO0o0 != null) {
            return c32776OooO0o0;
        }
        OoooO(21);
        throw null;
    }

    @Override // oO0O0Oo0.AbstractC32682OooOoo, oO0O0OO.OooO00o
    public final boolean Ooooooo() {
        return OooOOO0.OooO00o(this.f117747OoooOoo);
    }

    @Override // oO0O0Oo0.C32699OoooOO0, oO0O0Oo0.AbstractC32682OooOoo
    public final AbstractC32682OooOoo o000000o(OooO0O0.OooO00o oooO00o, OooOO0O oooOO0O, InterfaceC32609OooOo0 interfaceC32609OooOo0, o000oOoO o000oooo2, C33479OooO0o c33479OooO0o, InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (oooOO0O == null) {
            OoooO(14);
            throw null;
        }
        if (oooO00o == null) {
            OoooO(15);
            throw null;
        }
        if (interfaceC34588OooO0oO == null) {
            OoooO(16);
            throw null;
        }
        InterfaceC32632OoooOO0 interfaceC32632OoooOO0 = (InterfaceC32632OoooOO0) interfaceC32609OooOo0;
        if (c33479OooO0o == null) {
            c33479OooO0o = getName();
        }
        C32776OooO0o0 c32776OooO0o0 = new C32776OooO0o0(oooOO0O, interfaceC32632OoooOO0, interfaceC34588OooO0oO, c33479OooO0o, oooO00o, o000oooo2, this.f117748Ooooo00);
        int i = this.f117747OoooOoo;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                z = true;
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                z = true;
            }
        }
        c32776OooO0o0.o0000O0O(z, OooOOO0.OooO00o(i));
        return c32776OooO0o0;
    }

    public final void o0000O0O(boolean z, boolean z2) {
        this.f117747OoooOoo = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // oO0O0Oo0.C32699OoooOO0
    public final C32699OoooOO0 o0000oO(C32695OoooO c32695OoooO, InterfaceC32629OoooO0 interfaceC32629OoooO0, List list, List list2, List list3, AbstractC33320OooOoo abstractC33320OooOoo, EnumC32614OooOoOO enumC32614OooOoOO, AbstractC32601OooOOo abstractC32601OooOOo, Map map) {
        AbstractC35163OooO0oO oooO0O0;
        if (list == null) {
            OoooO(9);
            throw null;
        }
        if (list2 == null) {
            OoooO(10);
            throw null;
        }
        if (list3 == null) {
            OoooO(11);
            throw null;
        }
        if (abstractC32601OooOOo == null) {
            OoooO(12);
            throw null;
        }
        super.o0000oO(c32695OoooO, interfaceC32629OoooO0, list, list2, list3, abstractC33320OooOoo, enumC32614OooOoOO, abstractC32601OooOOo, map);
        C35174OooOOoo.f126253OooO00o.getClass();
        for (C35166OooOO0O c35166OooOO0O : C35174OooOOoo.f126254OooO0O0) {
            c35166OooOO0O.getClass();
            C33479OooO0o c33479OooO0o = c35166OooOO0O.f126237OooO00o;
            if (c33479OooO0o == null || kotlin.jvm.internal.OooOOO0.OooO0O0(getName(), c33479OooO0o)) {
                C33588OooOO0 c33588OooOO0 = c35166OooOO0O.f126238OooO0O0;
                if (c33588OooOO0 != null) {
                    String strOooO0O0 = getName().OooO0O0();
                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "functionDescriptor.name.asString()");
                    if (!c33588OooOO0.OooO0O0(strOooO0O0)) {
                        continue;
                    }
                }
                Collection<C33479OooO0o> collection = c35166OooOO0O.f126239OooO0OO;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC35161OooO0o[] interfaceC35161OooO0oArr = c35166OooOO0O.f126241OooO0o0;
                    int length = interfaceC35161OooO0oArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            oooO0O0 = c35166OooOO0O.f126240OooO0Oo.invoke(this) != null ? new AbstractC35163OooO0oO.OooO0O0(false) : AbstractC35163OooO0oO.OooO0OO.f126234OooO0O0;
                        } else {
                            if (interfaceC35161OooO0oArr[i].OooO00o(this) != null) {
                                oooO0O0 = new AbstractC35163OooO0oO.OooO0O0(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f117446Oooo0 = oooO0O0.f126232OooO00o;
                    return this;
                }
            }
        }
        oooO0O0 = AbstractC35163OooO0oO.OooO00o.f126233OooO0O0;
        this.f117446Oooo0 = oooO0O0.f126232OooO00o;
        return this;
    }
}
