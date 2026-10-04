package o0oOoo00;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import o0oOoOo.C31055OooOoOO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o0oOoo00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31135OooOo0 implements InterfaceC32508OooOOOo {
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        C31055OooOoOO c31055OooOoOO = (C31055OooOoOO) obj;
        C31055OooOoOO c31055OooOoOO2 = (C31055OooOoOO) obj2;
        String strOoooOoo = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, c31055OooOoOO.f110869OooO0O0, "");
        String strOoooOoo2 = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, c31055OooOoOO2.f110869OooO0O0, "");
        if (strOoooOoo.equals(strOoooOoo2)) {
            long j = c31055OooOoOO2.f110873OooO0o0;
            long j2 = c31055OooOoOO.f110873OooO0o0;
            if (j <= j2) {
                if (j >= j2) {
                    i = 0;
                }
            }
        } else {
            i = strOoooOoo.compareTo(strOoooOoo2) > 0 ? 1 : -1;
        }
        return Integer.valueOf(i);
    }
}
