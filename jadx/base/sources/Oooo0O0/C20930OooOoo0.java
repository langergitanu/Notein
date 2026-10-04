package Oooo0O0;

import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34642OooOo0o;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: Oooo0O0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20930OooOoo0 implements InterfaceC34642OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20930OooOoo0 f60385OooO00o = new C20930OooOoo0();

    /* JADX INFO: renamed from: Oooo0O0.OooOoo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f60386OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList arrayList) {
            super(1);
            this.f60386OooOo0o = arrayList;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            ArrayList arrayList = this.f60386OooOo0o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC34655Oooo0o.OooO00o.OooO0OO(layout, (AbstractC34655Oooo0o) arrayList.get(i), 0, 0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final oo000o.OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).o00ooo(j));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((AbstractC34655Oooo0o) arrayList.get(i2)).f124845OooOo0o));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((AbstractC34655Oooo0o) arrayList.get(i3)).f124844OooOo));
        }
        return interfaceC34643OooOoO.o00oO0O(iIntValue, numValueOf.intValue(), C34436OooOoOO.f123455OooOo0o, new OooO00o(arrayList));
    }
}
