package o0oooO0O;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0oooO00.C31803OooOO0o;

/* JADX INFO: renamed from: o0oooO0O.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31821OooOOO extends AbstractC31823OooOOOO {
    @Override // o0oooO0O.AbstractC31823OooOOOO
    public final void OooO0OO() throws IOException {
        C31803OooOO0o c31803OooOO0o = (C31803OooOO0o) ((ArrayList) OooO0Oo()).get(0);
        if (c31803OooOO0o == null || c31803OooOO0o.OooO0OO() == null) {
            return;
        }
        if (c31803OooOO0o.OooO0OO().OooO00o() == 0.0f && c31803OooOO0o.OooO0OO().OooO0o() == 0.0f) {
            return;
        }
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112293o0000OO0;
        C31436OooO0Oo c31436OooO0Oo = c31803OooOO0o.f113422OooOo0o;
        if (c31436OooO0Oo.o0000o0(c31441OooOO0, 32) || c31436OooO0Oo.o0000o0(c31441OooOO0, 2)) {
            return;
        }
        Log.w("PdfBox-Android", "Appearance generation for signature fields not implemented here. You need to generate/update that manually, see the CreateVisibleSignature*.java files in the examples subproject of the source code download");
    }
}
