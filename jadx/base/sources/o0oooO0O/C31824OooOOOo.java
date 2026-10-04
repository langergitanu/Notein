package o0oooO0O;

import android.util.Log;
import java.io.IOException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31440OooO0oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0o.C31455OooO00o;

/* JADX INFO: renamed from: o0oooO0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31824OooOOOo extends AbstractC31826OooOOo0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // o0oooO0O.AbstractC31823OooOOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO() throws IOException {
        String strOooOooo;
        C31810OooO00o c31810OooO00o = new C31810OooO00o(this);
        AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0O0 = OooO0O0(C31441OooOO0.f112420o00OOOO0);
        if (abstractC31434OooO0O0OooO0O0 != null) {
            if (abstractC31434OooO0O0OooO0O0 instanceof C31450OooOOoo) {
                strOooOooo = ((C31450OooOOoo) abstractC31434OooO0O0OooO0O0).OooOooo();
            } else if (abstractC31434OooO0O0OooO0O0 instanceof C31448OooOOo) {
                C31440OooO0oo c31440OooO0ooO000o00O = null;
                try {
                    try {
                        c31440OooO0ooO000o00O = ((C31448OooOOo) abstractC31434OooO0O0OooO0O0).o000o00O();
                        byte[] bArrOooO0Oo = C31455OooO00o.OooO0Oo(c31440OooO0ooO000o00O);
                        C31455OooO00o.OooO0O0(c31440OooO0ooO000o00O);
                        strOooOooo = new C31450OooOOoo(bArrOooO0Oo).OooOooo();
                    } catch (IOException e) {
                        Log.d("PdfBox-Android", "An exception occurred trying to get the content - returning empty string instead", e);
                        C31455OooO00o.OooO0O0(c31440OooO0ooO000o00O);
                        strOooOooo = "";
                        c31810OooO00o.OooO0Oo(strOooOooo);
                    }
                } catch (Throwable th) {
                    C31455OooO00o.OooO0O0(c31440OooO0ooO000o00O);
                    throw th;
                }
            } else {
                strOooOooo = "";
            }
        }
        c31810OooO00o.OooO0Oo(strOooOooo);
    }
}
