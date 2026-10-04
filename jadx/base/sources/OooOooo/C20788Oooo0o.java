package OooOooo;

import java.util.Iterator;
import java.util.List;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o0000Ooo.EnumC24238OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34631OooOO0O;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34642OooOo0o;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20788Oooo0o implements InterfaceC34642OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EnumC20779OooOooO f59698OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f59699OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ float f59700OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AbstractC20742OooO f59701OooO0Oo;

    /* JADX INFO: renamed from: OooOooo.Oooo0o$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20791Oooo0oo f59702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20781Oooo f59703OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34643OooOoO f59704OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20781Oooo c20781Oooo, C20791Oooo0oo c20791Oooo0oo, InterfaceC34643OooOoO interfaceC34643OooOoO) {
            super(1);
            this.f59703OooOo0o = c20781Oooo;
            this.f59702OooOo = c20791Oooo0oo;
            this.f59704OooOoO0 = interfaceC34643OooOoO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC20742OooO abstractC20742OooO;
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            EnumC24238OooOOO layoutDirection = this.f59704OooOoO0.getLayoutDirection();
            C20781Oooo c20781Oooo = this.f59703OooOo0o;
            C20791Oooo0oo c20791Oooo0oo = this.f59702OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            for (int i = 0; i < c20791Oooo0oo.f59712OooO0O0; i++) {
                AbstractC34655Oooo0o abstractC34655Oooo0o = c20781Oooo.f59674OooO0o[i];
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC34655Oooo0o);
                Object objOooO0OO = c20781Oooo.f59675OooO0o0.get(i).OooO0OO();
                C20794OoooO00 c20794OoooO00 = objOooO0OO instanceof C20794OoooO00 ? (C20794OoooO00) objOooO0OO : null;
                if (c20794OoooO00 == null || (abstractC20742OooO = c20794OoooO00.f59718OooO0OO) == null) {
                    abstractC20742OooO = c20781Oooo.f59673OooO0Oo;
                }
                int iOooO00o = c20791Oooo0oo.f59711OooO00o - c20781Oooo.OooO00o(abstractC34655Oooo0o);
                EnumC20779OooOooO enumC20779OooOooO = EnumC20779OooOooO.f59666OooOo0o;
                EnumC20779OooOooO enumC20779OooOooO2 = c20781Oooo.f59670OooO00o;
                int iOooO00o2 = abstractC20742OooO.OooO00o(iOooO00o, enumC20779OooOooO2 == enumC20779OooOooO ? EnumC24238OooOOO.f81494OooOo0o : layoutDirection, abstractC34655Oooo0o);
                int[] iArr = c20791Oooo0oo.f59713OooO0OO;
                if (enumC20779OooOooO2 == enumC20779OooOooO) {
                    AbstractC34655Oooo0o.OooO00o.OooO0OO(layout, abstractC34655Oooo0o, iArr[i], iOooO00o2);
                } else {
                    AbstractC34655Oooo0o.OooO00o.OooO0OO(layout, abstractC34655Oooo0o, iOooO00o2, iArr[i]);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20788Oooo0o(EnumC20779OooOooO enumC20779OooOooO, InterfaceC32511OooOOoo interfaceC32511OooOOoo, float f, AbstractC20742OooO abstractC20742OooO) {
        this.f59698OooO00o = enumC20779OooOooO;
        this.f59699OooO0O0 = (kotlin.jvm.internal.OooOOOO) interfaceC32511OooOOoo;
        this.f59700OooO0OO = f;
        this.f59701OooO0Oo = abstractC20742OooO;
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final int OooO00o(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        return ((Number) (this.f59698OooO00o == EnumC20779OooOooO.f59666OooOo0o ? C20758OooOOO.f59633OooO00o : C20758OooOOO.f59634OooO0O0).invoke(list, Integer.valueOf(i), Integer.valueOf(interfaceC34631OooOO0O.o0OoOo0(this.f59700OooO0OO)))).intValue();
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final int OooO0O0(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        return ((Number) (this.f59698OooO00o == EnumC20779OooOooO.f59666OooOo0o ? C20758OooOOO.f59635OooO0OO : C20758OooOOO.f59636OooO0Oo).invoke(list, Integer.valueOf(i), Integer.valueOf(interfaceC34631OooOO0O.o0OoOo0(this.f59700OooO0OO)))).intValue();
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final int OooO0OO(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        return ((Number) (this.f59698OooO00o == EnumC20779OooOooO.f59666OooOo0o ? C20758OooOOO.f59638OooO0o0 : C20758OooOOO.f59637OooO0o).invoke(list, Integer.valueOf(i), Integer.valueOf(interfaceC34631OooOO0O.o0OoOo0(this.f59700OooO0OO)))).intValue();
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final int OooO0Oo(InterfaceC34631OooOO0O interfaceC34631OooOO0O, List<? extends InterfaceC34630OooOO0> list, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34631OooOO0O, "<this>");
        return ((Number) (this.f59698OooO00o == EnumC20779OooOooO.f59666OooOo0o ? C20758OooOOO.f59639OooO0oO : C20758OooOOO.f59640OooO0oo).invoke(list, Integer.valueOf(i), Integer.valueOf(interfaceC34631OooOO0O.o0OoOo0(this.f59700OooO0OO)))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOOoo] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOOoo] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oo000o.InterfaceC34642OooOo0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oo000o.OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        List<InterfaceC34641OooOo0O> list2;
        C20794OoooO00[] c20794OoooO00Arr;
        AbstractC34655Oooo0o[] abstractC34655Oooo0oArr;
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AbstractC34655Oooo0o[] abstractC34655Oooo0oArr2 = new AbstractC34655Oooo0o[list.size()];
        AbstractC20742OooO abstractC20742OooO = this.f59701OooO0Oo;
        EnumC20779OooOooO enumC20779OooOooO = this.f59698OooO00o;
        ?? r8 = this.f59699OooO0O0;
        float f2 = this.f59700OooO0OO;
        C20781Oooo c20781Oooo = new C20781Oooo(enumC20779OooOooO, r8, f2, abstractC20742OooO, list, abstractC34655Oooo0oArr2);
        int size = list.size();
        EnumC20779OooOooO enumC20779OooOooO2 = EnumC20779OooOooO.f59666OooOo0o;
        int iOooOO0 = enumC20779OooOooO == enumC20779OooOooO2 ? C24227OooO00o.OooOO0(j) : C24227OooO00o.OooO(j);
        int iOooO0oo = enumC20779OooOooO == enumC20779OooOooO2 ? C24227OooO00o.OooO0oo(j) : C24227OooO00o.OooO0oO(j);
        int iOooO = enumC20779OooOooO == enumC20779OooOooO2 ? C24227OooO00o.OooO(j) : C24227OooO00o.OooOO0(j);
        int iOooO0oO = enumC20779OooOooO == enumC20779OooOooO2 ? C24227OooO00o.OooO0oO(j) : C24227OooO00o.OooO0oo(j);
        int iO0OoOo0 = interfaceC34643OooOoO.o0OoOo0(f2);
        int iMax = 0;
        int i8 = 0;
        int i9 = 0;
        float f3 = 0.0f;
        int iOooO0O0 = 0;
        int iMin = 0;
        while (true) {
            list2 = c20781Oooo.f59675OooO0o0;
            c20794OoooO00Arr = c20781Oooo.f59676OooO0oO;
            abstractC34655Oooo0oArr = c20781Oooo.f59674OooO0o;
            if (i8 >= size) {
                break;
            }
            InterfaceC34641OooOo0O interfaceC34641OooOo0O = list2.get(i8);
            float fOooO0Oo = C20790Oooo0oO.OooO0Oo(c20794OoooO00Arr[i8]);
            if (fOooO0Oo > 0.0f) {
                f3 += fOooO0Oo;
                i9++;
                i6 = i8;
            } else {
                AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = abstractC34655Oooo0oArr[i8];
                if (abstractC34655Oooo0oO00ooo == null) {
                    int i10 = iOooO0oo == Integer.MAX_VALUE ? Integer.MAX_VALUE : iOooO0oo - iOooO0O0;
                    long jOooO00o = enumC20779OooOooO == enumC20779OooOooO2 ? C24228OooO0O0.OooO00o(0, i10, 0, iOooO0oO) : C24228OooO0O0.OooO00o(0, iOooO0oO, 0, i10);
                    i6 = i8;
                    i7 = i9;
                    abstractC34655Oooo0oO00ooo = interfaceC34641OooOo0O.o00ooo(jOooO00o);
                } else {
                    i6 = i8;
                    i7 = i9;
                }
                AbstractC34655Oooo0o abstractC34655Oooo0o = abstractC34655Oooo0oO00ooo;
                iMin = Math.min(iO0OoOo0, (iOooO0oo - iOooO0O0) - c20781Oooo.OooO0O0(abstractC34655Oooo0o));
                iOooO0O0 = c20781Oooo.OooO0O0(abstractC34655Oooo0o) + iMin + iOooO0O0;
                iMax = Math.max(iMax, c20781Oooo.OooO00o(abstractC34655Oooo0o));
                abstractC34655Oooo0oArr[i6] = abstractC34655Oooo0o;
                i9 = i7;
            }
            i8 = i6 + 1;
        }
        int i11 = i9;
        if (i11 == 0) {
            iOooO0O0 -= iMin;
            i = 0;
        } else {
            int i12 = (i11 - 1) * iO0OoOo0;
            int i13 = (((f3 <= 0.0f || iOooO0oo == Integer.MAX_VALUE) ? iOooOO0 : iOooO0oo) - iOooO0O0) - i12;
            float f4 = f3 > 0.0f ? i13 / f3 : 0.0f;
            Iterator<Integer> it = oO0O00oo.OooOO0.OooO(0, size).iterator();
            int iOooO0O02 = 0;
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                iOooO0O02 += oO0O00O.OooO00o.OooO0O0(C20790Oooo0oO.OooO0Oo(c20794OoooO00Arr[((oOo000Oo.Oooo000) it).nextInt()]) * f4);
            }
            int i14 = i13 - iOooO0O02;
            int i15 = 0;
            int i16 = iMax;
            int i17 = 0;
            while (i15 < size) {
                if (abstractC34655Oooo0oArr[i15] == null) {
                    InterfaceC34641OooOo0O interfaceC34641OooOo0O2 = list2.get(i15);
                    f = f4;
                    C20794OoooO00 c20794OoooO00 = c20794OoooO00Arr[i15];
                    float fOooO0Oo2 = C20790Oooo0oO.OooO0Oo(c20794OoooO00);
                    if (fOooO0Oo2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iSignum = Integer.signum(i14);
                    i14 -= iSignum;
                    i2 = iOooO0oo;
                    int iOooO0O03 = oO0O00O.OooO00o.OooO0O0(fOooO0Oo2 * f) + iSignum;
                    i3 = i12;
                    int iMax2 = Math.max(0, iOooO0O03);
                    int i18 = (!(c20794OoooO00 != null ? c20794OoooO00.f59717OooO0O0 : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2;
                    long jOooO00o2 = enumC20779OooOooO == enumC20779OooOooO2 ? C24228OooO0O0.OooO00o(i18, iMax2, 0, iOooO0oO) : C24228OooO0O0.OooO00o(0, iOooO0oO, i18, iMax2);
                    i4 = i15;
                    AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo2 = interfaceC34641OooOo0O2.o00ooo(jOooO00o2);
                    int iOooO0O04 = c20781Oooo.OooO0O0(abstractC34655Oooo0oO00ooo2) + i17;
                    int iMax3 = Math.max(i16, c20781Oooo.OooO00o(abstractC34655Oooo0oO00ooo2));
                    abstractC34655Oooo0oArr[i4] = abstractC34655Oooo0oO00ooo2;
                    i17 = iOooO0O04;
                    i16 = iMax3;
                } else {
                    f = f4;
                    i2 = iOooO0oo;
                    i3 = i12;
                    i4 = i15;
                }
                i15 = i4 + 1;
                f4 = f;
                i12 = i3;
                iOooO0oo = i2;
            }
            int i19 = i17 + i12;
            int i20 = iOooO0oo - iOooO0O0;
            i = i19 > i20 ? i20 : i19;
            iMax = i16;
        }
        int iMax4 = Math.max(iOooO0O0 + i, iOooOO0);
        if (iOooO0oO != Integer.MAX_VALUE) {
            if (c20781Oooo.f59672OooO0OO == EnumC20804OooooO0.f59728OooOo) {
                i5 = 0;
            } else {
                i5 = 0;
                iOooO0oO = Math.max(iMax, Math.max(iOooO, 0));
            }
        }
        int i21 = iOooO0oO;
        ?? r6 = new int[size];
        for (int i22 = i5; i22 < size; i22++) {
            r6[i22] = i5;
        }
        int[] iArr = new int[size];
        while (i5 < size) {
            AbstractC34655Oooo0o abstractC34655Oooo0o2 = abstractC34655Oooo0oArr[i5];
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC34655Oooo0o2);
            iArr[i5] = c20781Oooo.OooO0O0(abstractC34655Oooo0o2);
            i5++;
        }
        c20781Oooo.f59671OooO0O0.Oooo0oO(Integer.valueOf(iMax4), iArr, interfaceC34643OooOoO.getLayoutDirection(), interfaceC34643OooOoO, r6);
        C20791Oooo0oo c20791Oooo0oo = new C20791Oooo0oo(i21, iMax4, size, r6);
        if (enumC20779OooOooO != enumC20779OooOooO2) {
            i21 = iMax4;
            iMax4 = i21;
        }
        return interfaceC34643OooOoO.o00oO0O(iMax4, i21, C34436OooOoOO.f123455OooOo0o, new OooO00o(c20781Oooo, c20791Oooo0oo, interfaceC34643OooOoO));
    }
}
