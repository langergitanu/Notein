package o00000oo;

import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34642OooOo0o;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: o00000oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24130OooOOOo implements InterfaceC34642OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24130OooOOOo f81325OooO00o = new C24130OooOOOo();

    /* JADX INFO: renamed from: o00000oo.OooOOOo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81326OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00000oo.OooOOOo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f81327OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f81327OooOo0o = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0o(layout, this.f81327OooOo0o, 0, 0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00000oo.OooOOOo$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f81328OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ArrayList arrayList) {
            super(1);
            this.f81328OooOo0o = arrayList;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            ArrayList arrayList = this.f81328OooOo0o;
            int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
            if (iOooOO0O >= 0) {
                int i = 0;
                while (true) {
                    AbstractC34655Oooo0o.OooO00o.OooO0o(layout, (AbstractC34655Oooo0o) arrayList.get(i), 0, 0);
                    if (i == iOooOO0O) {
                        break;
                    }
                    i++;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final oo000o.OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        int iMax;
        int size = list.size();
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        int i = 0;
        if (size == 0) {
            return interfaceC34643OooOoO.o00oO0O(0, 0, c34436OooOoOO, OooO00o.f81326OooOo0o);
        }
        if (size == 1) {
            AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = list.get(0).o00ooo(j);
            return interfaceC34643OooOoO.o00oO0O(abstractC34655Oooo0oO00ooo.f124845OooOo0o, abstractC34655Oooo0oO00ooo.f124844OooOo, c34436OooOoOO, new OooO0O0(abstractC34655Oooo0oO00ooo));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list.get(i2).o00ooo(j));
        }
        int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
        if (iOooOO0O >= 0) {
            int iMax2 = 0;
            iMax = 0;
            while (true) {
                AbstractC34655Oooo0o abstractC34655Oooo0o = (AbstractC34655Oooo0o) arrayList.get(i);
                iMax2 = Math.max(iMax2, abstractC34655Oooo0o.f124845OooOo0o);
                iMax = Math.max(iMax, abstractC34655Oooo0o.f124844OooOo);
                if (i == iOooOO0O) {
                    break;
                }
                i++;
            }
            i = iMax2;
        } else {
            iMax = 0;
        }
        return interfaceC34643OooOoO.o00oO0O(i, iMax, c34436OooOoOO, new OooO0OO(arrayList));
    }
}
