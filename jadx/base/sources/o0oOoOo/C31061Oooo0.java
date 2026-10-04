package o0oOoOo;

import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0oOoOo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31061Oooo0 implements InterfaceC32508OooOOOo {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C31076OoooOOO f = (C31076OoooOOO) obj;
        C31076OoooOOO s = (C31076OoooOOO) obj2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        kotlin.jvm.internal.OooOOO0.OooO0oO(s, "s");
        boolean z = false;
        int iOooOO0 = 1;
        Integer num = f.f110904OooO0oO;
        boolean z2 = (num != null && num.intValue() == 0) || (num != null && num.intValue() == 1);
        Integer num2 = s.f110904OooO0oO;
        if ((num2 != null && num2.intValue() == 0) || (num2 != null && num2.intValue() == 1)) {
            z = true;
        }
        String str = f.f110902OooO0o;
        String str2 = s.f110902OooO0o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, str2)) {
            Integer num3 = s.f110903OooO0o0;
            Integer num4 = f.f110903OooO0o0;
            if (num4 != null && num3 != null) {
                iOooOO0 = kotlin.jvm.internal.OooOOO0.OooO(num4.intValue(), num3.intValue());
            } else if (num4 == null) {
                if (num3 == null) {
                    if (!z2 || z) {
                        iOooOO0 = (!z || z2) ? kotlin.jvm.internal.OooOOO0.OooOO0(s.f110898OooO00o, f.f110898OooO00o) : -1;
                    }
                }
            }
        } else {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            iOooOO0 = str.compareTo(str2);
        }
        return Integer.valueOf(iOooOO0);
    }
}
