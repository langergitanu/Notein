package o0O0oo0;

import java.util.List;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34642OooOo0o;
import oo000o.InterfaceC34643OooOoO;
import oo000o.OooOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0O implements InterfaceC34642OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f89503OooO00o;

    public OooOO0O(OooOOOO oooOOOO) {
        this.f89503OooO00o = oooOOOO;
    }

    @Override // oo000o.InterfaceC34642OooOo0o
    public final OooOo OooO0o0(InterfaceC34643OooOoO interfaceC34643OooOoO, List<? extends InterfaceC34641OooOo0O> list, long j) {
        InterfaceC34641OooOo0O interfaceC34641OooOo0O;
        int iOooO0oo;
        final int iO0OoOo0 = interfaceC34643OooOoO.o0OoOo0(C26197OooO0O0.f89457OooO0OO);
        int i = 1;
        boolean z = this.f89503OooO00o != null;
        boolean z2 = C24227OooO00o.OooO0oo(j) != Integer.MAX_VALUE;
        if (z) {
            interfaceC34641OooOo0O = list.get(0);
        } else {
            i = 0;
            interfaceC34641OooOo0O = null;
        }
        int i2 = i + 1;
        InterfaceC34641OooOo0O interfaceC34641OooOo0O2 = list.get(i);
        InterfaceC34641OooOo0O interfaceC34641OooOo0O3 = list.get(i2);
        long jOooO00o = C24228OooO0O0.OooO00o(0, C24227OooO00o.OooO0oo(j), 0, C24227OooO00o.OooO0oO(j));
        final AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = interfaceC34641OooOo0O3.o00ooo(jOooO00o);
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo2 = interfaceC34641OooOo0O != null ? interfaceC34641OooOo0O.o00ooo(jOooO00o) : null;
        int i3 = (abstractC34655Oooo0oO00ooo2 != null ? abstractC34655Oooo0oO00ooo2.f124845OooOo0o : 0) + abstractC34655Oooo0oO00ooo.f124845OooOo0o + iO0OoOo0;
        if (z2) {
            iOooO0oo = C24227OooO00o.OooO0oo(j) - i3;
            if (iOooO0oo < 0) {
                iOooO0oo = 0;
            }
        } else {
            iOooO0oo = Integer.MAX_VALUE;
        }
        final AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo3 = interfaceC34641OooOo0O2.o00ooo(iOooO0oo == Integer.MAX_VALUE ? C24227OooO00o.OooO00o(0, 0, 0, 0, 14, j) : C24228OooO0O0.OooO00o(0, iOooO0oo, 0, C24227OooO00o.OooO0oO(j)));
        int iOooO0oo2 = (abstractC34655Oooo0oO00ooo2 != null ? abstractC34655Oooo0oO00ooo2.f124845OooOo0o : 0) + (abstractC34655Oooo0oO00ooo2 != null ? iO0OoOo0 : 0) + abstractC34655Oooo0oO00ooo3.f124845OooOo0o + iO0OoOo0 + abstractC34655Oooo0oO00ooo.f124845OooOo0o;
        if (z2) {
            iOooO0oo2 = C24227OooO00o.OooO0oo(j);
        } else {
            int iOooOO0 = C24227OooO00o.OooOO0(j);
            if (iOooO0oo2 < iOooOO0) {
                iOooO0oo2 = iOooOO0;
            }
        }
        final int iMax = Math.max(abstractC34655Oooo0oO00ooo3.f124844OooOo, Math.max(abstractC34655Oooo0oO00ooo.f124844OooOo, abstractC34655Oooo0oO00ooo2 != null ? abstractC34655Oooo0oO00ooo2.f124844OooOo : 0));
        if (C24227OooO00o.OooO0oO(j) != Integer.MAX_VALUE) {
            iMax = C24227OooO00o.OooO0oO(j);
        } else {
            int iOooO = C24227OooO00o.OooO(j);
            if (iMax < iOooO) {
                iMax = iOooO;
            }
        }
        final int i4 = iOooO0oo2;
        final AbstractC34655Oooo0o abstractC34655Oooo0o = abstractC34655Oooo0oO00ooo2;
        return interfaceC34643OooOoO.o00oO0O(i4, iMax, C34436OooOoOO.f123455OooOo0o, new InterfaceC32507OooOO0o() { // from class: o0O0oo0.OooOO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                AbstractC34655Oooo0o.OooO00o layout = (AbstractC34655Oooo0o.OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
                AbstractC34655Oooo0o abstractC34655Oooo0o2 = abstractC34655Oooo0o;
                int i5 = iMax;
                int i6 = iO0OoOo0;
                int i7 = 0;
                if (abstractC34655Oooo0o2 != null) {
                    AbstractC34655Oooo0o.OooO00o.OooO0o(layout, abstractC34655Oooo0o2, 0, (i5 - abstractC34655Oooo0o2.f124844OooOo) / 2);
                    i7 = abstractC34655Oooo0o2.f124845OooOo0o + i6;
                }
                AbstractC34655Oooo0o abstractC34655Oooo0o3 = abstractC34655Oooo0oO00ooo3;
                int i8 = (i5 - abstractC34655Oooo0o3.f124844OooOo) / 2;
                AbstractC34655Oooo0o abstractC34655Oooo0o4 = abstractC34655Oooo0oO00ooo;
                int i9 = abstractC34655Oooo0o4.f124845OooOo0o;
                int i10 = i4;
                int i11 = (i10 - i9) - i6;
                if (i7 > i11) {
                    i7 = i11;
                }
                AbstractC34655Oooo0o.OooO00o.OooO0o(layout, abstractC34655Oooo0o3, i7, i8);
                AbstractC34655Oooo0o.OooO00o.OooO0o(layout, abstractC34655Oooo0o4, i10 - abstractC34655Oooo0o4.f124845OooOo0o, (i5 - abstractC34655Oooo0o4.f124844OooOo) / 2);
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }
}
