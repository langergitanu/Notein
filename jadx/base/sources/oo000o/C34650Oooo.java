package oo000o;

import java.util.ArrayList;
import java.util.List;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o00oO0O.C25503OooOoOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;

/* JADX INFO: renamed from: oo000o.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34650Oooo extends C25503OooOoOO.AbstractC25505OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34650Oooo f124837OooO00o = new C34650Oooo();

    /* JADX INFO: renamed from: oo000o.Oooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f124838OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oo000o.Oooo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f124839OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f124839OooOo0o = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0oO(layout, this.f124839OooOo0o, 0, 0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oo000o.Oooo$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f124840OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ArrayList arrayList) {
            super(1);
            this.f124840OooOo0o = arrayList;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            ArrayList arrayList = this.f124840OooOo0o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC34655Oooo0o.OooO00o.OooO0oO(layout, (AbstractC34655Oooo0o) arrayList.get(i), 0, 0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        boolean zIsEmpty = list.isEmpty();
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        if (zIsEmpty) {
            return interfaceC34643OooOoO.o00oO0O(C24227OooO00o.OooOO0(j), C24227OooO00o.OooO(j), c34436OooOoOO, OooO00o.f124838OooOo0o);
        }
        if (list.size() == 1) {
            AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = list.get(0).o00ooo(j);
            return interfaceC34643OooOoO.o00oO0O(C24228OooO0O0.OooO0o(abstractC34655Oooo0oO00ooo.f124845OooOo0o, j), C24228OooO0O0.OooO0o0(abstractC34655Oooo0oO00ooo.f124844OooOo, j), c34436OooOoOO, new OooO0O0(abstractC34655Oooo0oO00ooo));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).o00ooo(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC34655Oooo0o abstractC34655Oooo0o = (AbstractC34655Oooo0o) arrayList.get(i2);
            iMax = Math.max(abstractC34655Oooo0o.f124845OooOo0o, iMax);
            iMax2 = Math.max(abstractC34655Oooo0o.f124844OooOo, iMax2);
        }
        return interfaceC34643OooOoO.o00oO0O(C24228OooO0O0.OooO0o(iMax, j), C24228OooO0O0.OooO0o0(iMax2, j), c34436OooOoOO, new OooO0OO(arrayList));
    }
}
