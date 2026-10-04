package o0OoO0oo;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import o0Ooo00o.AbstractC29372OooO00o;
import o0Ooo00o.C29373OooO0O0;
import o0oOoOo.C31055OooOoOO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o0OoO0oo.o00OoOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28889o00OoOOo implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102358OooOo0o;

    public /* synthetic */ C28889o00OoOOo(int i) {
        this.f102358OooOo0o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        switch (this.f102358OooOo0o) {
            case 0:
                AbstractC29372OooO00o abstractC29372OooO00o = (AbstractC29372OooO00o) obj;
                AbstractC29372OooO00o abstractC29372OooO00o2 = (AbstractC29372OooO00o) obj2;
                if ((abstractC29372OooO00o instanceof C29373OooO0O0) && (abstractC29372OooO00o2 instanceof C29373OooO0O0)) {
                    C29373OooO0O0 c29373OooO0O0 = (C29373OooO0O0) abstractC29372OooO00o;
                    if (c29373OooO0O0.f104152OooO0Oo.getFromPixelEraser()) {
                        C29373OooO0O0 c29373OooO0O02 = (C29373OooO0O0) abstractC29372OooO00o2;
                        if (c29373OooO0O02.f104152OooO0Oo.getFromPixelEraser() && c29373OooO0O0.f104150OooO0O0 == c29373OooO0O02.f104150OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(c29373OooO0O0.f104151OooO0OO, c29373OooO0O02.f104151OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(c29373OooO0O0.f104149OooO00o, c29373OooO0O02.f104149OooO00o)) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
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
}
