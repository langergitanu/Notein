package ooOOO0Oo;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0Oo0.C32695OoooO;
import oO0O0oOo.C32776OooO0o0;
import oO0OOOo.C32995OooOOO0;
import oO0OOOo.InterfaceC32991OooOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;
import oO0o0O0O.C33566OooO0o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.C33577OooOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo00OOO.C34488OooO0o;
import oOo00OOO.C34491OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO implements InterfaceC32991OooOO0 {

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f125800OooO00o;

        static {
            int[] iArr = new int[C32995OooOOO0.OooO0O0.OooO00o.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125800OooO00o = iArr;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32641OooooOO, AbstractC33320OooOoo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f125801OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final AbstractC33320OooOoo invoke(InterfaceC32641OooooOO interfaceC32641OooooOO) {
            return interfaceC32641OooooOO.getType();
        }
    }

    @Override // oO0OOOo.InterfaceC32991OooOO0
    public final InterfaceC32991OooOO0.OooO0O0 OooO00o(oO0O0OO.OooO00o superDescriptor, oO0O0OO.OooO00o subDescriptor, InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(subDescriptor, "subDescriptor");
        boolean z = subDescriptor instanceof C32776OooO0o0;
        InterfaceC32991OooOO0.OooO0O0 oooO0O0 = InterfaceC32991OooOO0.OooO0O0.f119368OooOoO0;
        if (z) {
            C32776OooO0o0 c32776OooO0o0 = (C32776OooO0o0) subDescriptor;
            if (c32776OooO0o0.getTypeParameters().isEmpty()) {
                C32995OooOOO0.OooO0O0 oooO0O0OooO = C32995OooOOO0.OooO(superDescriptor, subDescriptor);
                if ((oooO0O0OooO != null ? oooO0O0OooO.OooO0OO() : null) == null) {
                    List<InterfaceC32641OooooOO> listOooO0o = c32776OooO0o0.OooO0o();
                    kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "subDescriptor.valueParameters");
                    C33577OooOOo c33577OooOOoOooOOoo = C33576OooOOOo.OooOOoo(oOo000Oo.OooOo.OooOooo(listOooO0o), OooO0O0.f125801OooOo0o);
                    AbstractC33320OooOoo abstractC33320OooOoo = c32776OooO0o0.f117441OooOoo;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33320OooOoo);
                    C33566OooO0o c33566OooO0oOooO0oo = C33574OooOOO0.OooO0oo(oOo000Oo.OooOOO.OooOo(new InterfaceC33569OooO0oo[]{c33577OooOOoOooOOoo, oOo000Oo.OooOOO.OooOo(new Object[]{abstractC33320OooOoo})}));
                    C32695OoooO c32695OoooO = c32776OooO0o0.f117444OooOooo;
                    C33566OooO0o.OooO00o oooO00o = new C33566OooO0o.OooO00o(C33574OooOOO0.OooO0oo(oOo000Oo.OooOOO.OooOo(new InterfaceC33569OooO0oo[]{c33566OooO0oOooO0oo, oOo000Oo.OooOo.OooOooo(C34429OooOOo0.OooOOO0(c32695OoooO != null ? c32695OoooO.getType() : null))})));
                    while (true) {
                        if (oooO00o.hasNext()) {
                            AbstractC33320OooOoo abstractC33320OooOoo2 = (AbstractC33320OooOoo) oooO00o.next();
                            if (!abstractC33320OooOoo2.o000000O().isEmpty() && !(abstractC33320OooOoo2.o00000OO() instanceof C34491OooO0oo)) {
                                break;
                            }
                        } else {
                            oO0O0OO.OooO00o oooO00oOooO0O0 = superDescriptor.OooO0O0(C33356ooOO.OooO0o0(new C34488OooO0o()));
                            if (oooO00oOooO0O0 != null) {
                                if (oooO00oOooO0O0 instanceof InterfaceC32632OoooOO0) {
                                    InterfaceC32632OoooOO0 interfaceC32632OoooOO0 = (InterfaceC32632OoooOO0) oooO00oOooO0O0;
                                    List<InterfaceC32637OoooOoo> typeParameters = interfaceC32632OoooOO0.getTypeParameters();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "erasedSuper.typeParameters");
                                    if (!typeParameters.isEmpty()) {
                                        oooO00oOooO0O0 = interfaceC32632OoooOO0.Oooo().OooOOO0().build();
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00oOooO0O0);
                                    }
                                }
                                C32995OooOOO0.OooO0O0.OooO00o oooO00oOooO0OO = C32995OooOOO0.f119372OooO0o0.OooOOO(oooO00oOooO0O0, subDescriptor, false).OooO0OO();
                                kotlin.jvm.internal.OooOOO0.OooO0o(oooO00oOooO0OO, "DEFAULT.isOverridableByW…Descriptor, false).result");
                                if (OooO00o.f125800OooO00o[oooO00oOooO0OO.ordinal()] == 1) {
                                    return InterfaceC32991OooOO0.OooO0O0.f119366OooOo0o;
                                }
                            }
                        }
                    }
                }
            }
        }
        return oooO0O0;
    }

    @Override // oO0OOOo.InterfaceC32991OooOO0
    public final InterfaceC32991OooOO0.OooO00o OooO0O0() {
        return InterfaceC32991OooOO0.OooO00o.f119361OooOo;
    }
}
