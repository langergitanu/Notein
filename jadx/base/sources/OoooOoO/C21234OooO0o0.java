package OoooOoO;

import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0ooOO0.C31604o0ooOoO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: OoooOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21234OooO0o0 {

    /* JADX INFO: renamed from: OoooOoO.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21233OooO0o.OooO0O0, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f61613OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(InterfaceC21233OooO0o.OooO0O0 oooO0O0) {
            InterfaceC21233OooO0o.OooO0O0 it = oooO0O0;
            OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(!(it instanceof C21232OooO0Oo));
        }
    }

    /* JADX INFO: renamed from: OoooOoO.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21233OooO0o, InterfaceC21233OooO0o.OooO0O0, InterfaceC21233OooO0o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21033OooOOOO f61614OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
            super(2);
            this.f61614OooOo0o = interfaceC21033OooOOOO;
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.jvm.internal.OooOOOO, oO0O000o.OooOOo0] */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final InterfaceC21233OooO0o invoke(InterfaceC21233OooO0o interfaceC21233OooO0o, InterfaceC21233OooO0o.OooO0O0 oooO0O0) {
            InterfaceC21233OooO0o acc = interfaceC21233OooO0o;
            InterfaceC21233OooO0o.OooO0O0 element = oooO0O0;
            OooOOO0.OooO0oO(acc, "acc");
            OooOOO0.OooO0oO(element, "element");
            if (element instanceof C21232OooO0Oo) {
                ?? r5 = ((C21232OooO0Oo) element).f61601OooOoO0;
                OooOOO0.OooO0o0(r5, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                C24039Oooo0o0.OooO0o0(3, r5);
                InterfaceC21233OooO0o.OooO00o oooO00o = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
                InterfaceC21033OooOOOO interfaceC21033OooOOOO = this.f61614OooOo0o;
                element = C21234OooO0o0.OooO0O0(interfaceC21033OooOOOO, (InterfaceC21233OooO0o) r5.invoke(oooO00o, interfaceC21033OooOOOO, 0));
            }
            return acc.o00ooo(element);
        }
    }

    public static final InterfaceC21233OooO0o OooO00o(InterfaceC21233OooO0o interfaceC21233OooO0o, C31604o0ooOoO.OooO00o inspectorInfo, InterfaceC32510OooOOo0 factory) {
        OooOOO0.OooO0oO(interfaceC21233OooO0o, "<this>");
        OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        OooOOO0.OooO0oO(factory, "factory");
        return interfaceC21233OooO0o.o00ooo(new C21232OooO0Oo(inspectorInfo, factory));
    }

    public static final InterfaceC21233OooO0o OooO0O0(InterfaceC21033OooOOOO interfaceC21033OooOOOO, InterfaceC21233OooO0o modifier) {
        OooOOO0.OooO0oO(interfaceC21033OooOOOO, "<this>");
        OooOOO0.OooO0oO(modifier, "modifier");
        if (modifier.OooOo0o(OooO00o.f61613OooOo0o)) {
            return modifier;
        }
        interfaceC21033OooOOOO.OooOo00(1219399079);
        InterfaceC21233OooO0o interfaceC21233OooO0o = (InterfaceC21233OooO0o) modifier.OooOOOO(InterfaceC21233OooO0o.OooO00o.f61602OooOo0o, new OooO0O0(interfaceC21033OooOOOO));
        interfaceC21033OooOOOO.OooOoo();
        return interfaceC21233OooO0o;
    }
}
