package Oooo0;

import Oooo0O0.C20935Oooo00o;
import o00000.InterfaceC24054OooOo0;
import o00o00Oo.C25256OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20833Oooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32510OooOOo0<Integer, Integer, Boolean, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f59880OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59881OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f59882OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59883OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59884OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20833Oooo(o000O0 o000o0, C20935Oooo00o c20935Oooo00o, InterfaceC24054OooOo0 interfaceC24054OooOo0, o00000.Oooo0 oooo0, boolean z) {
        super(3);
        this.f59881OooOo0o = interfaceC24054OooOo0;
        this.f59880OooOo = z;
        this.f59883OooOoO0 = oooo0;
        this.f59882OooOoO = c20935Oooo00o;
        this.f59884OooOoOO = o000o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC24054OooOo0 interfaceC24054OooOo0 = this.f59881OooOo0o;
        if (!zBooleanValue) {
            iIntValue = interfaceC24054OooOo0.OooO00o(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = interfaceC24054OooOo0.OooO00o(iIntValue2);
        }
        boolean z = false;
        if (this.f59880OooOo) {
            o00000.Oooo0 oooo0 = this.f59883OooOoO0;
            int i = C34696OooOOoo.f124979OooO0OO;
            long j = oooo0.f81084OooO0O0;
            if (iIntValue != ((int) (j >> 32)) || iIntValue2 != ((int) (j & 4294967295L))) {
                int i2 = iIntValue > iIntValue2 ? iIntValue2 : iIntValue;
                C20935Oooo00o c20935Oooo00o = this.f59882OooOoO;
                EnumC20854OooooO0 enumC20854OooooO0 = EnumC20854OooooO0.f59964OooOo0o;
                if (i2 < 0) {
                    o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
                    if (o000o0 != null) {
                        o000o0.f60110OooOO0O = false;
                    }
                    c20935Oooo00o.OooOO0O(enumC20854OooooO0);
                } else {
                    int i3 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                    C34680OooO0O0 c34680OooO0O0 = oooo0.f81083OooO00o;
                    if (i3 <= c34680OooO0O0.f124887OooOo0o.length()) {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            o000O0 o000o02 = c20935Oooo00o.f60406OooO0Oo;
                            if (o000o02 != null) {
                                o000o02.f60110OooOO0O = false;
                            }
                            c20935Oooo00o.OooOO0O(enumC20854OooooO0);
                        } else {
                            c20935Oooo00o.OooO0o();
                        }
                        this.f59884OooOoOO.f60116OooOOo.invoke(new o00000.Oooo0(c34680OooO0O0, C25256OooO00o.OooO0OO(iIntValue, iIntValue2), (C34696OooOOoo) null));
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
