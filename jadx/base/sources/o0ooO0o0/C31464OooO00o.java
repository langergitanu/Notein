package o0ooO0o0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31464OooO00o extends AbstractC31473OooOO0O {
    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws Throwable {
        C31465OooO0O0 c31465OooO0O0 = null;
        try {
            C31465OooO0O0 c31465OooO0O02 = new C31465OooO0O0(inputStream);
            try {
                C31455OooO00o.OooO0OO(c31465OooO0O02, outputStream);
                outputStream.flush();
                C31455OooO00o.OooO0O0(c31465OooO0O02);
                return new C31472OooOO0(c31448OooOOo);
            } catch (Throwable th) {
                th = th;
                c31465OooO0O0 = c31465OooO0O02;
                C31455OooO00o.OooO0O0(c31465OooO0O0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        C31466OooO0OO c31466OooO0OO = new C31466OooO0OO(outputStream);
        c31466OooO0OO.f112538OooOo0o = 72;
        c31466OooO0OO.f112541OooOoOO = 72;
        c31466OooO0OO.f112537OooOo = 0;
        c31466OooO0OO.f112540OooOoO0 = new byte[4];
        c31466OooO0OO.f112539OooOoO = new byte[5];
        c31466OooO0OO.f112543OooOoo0 = true;
        c31466OooO0OO.f112542OooOoo = '~';
        C31455OooO00o.OooO0OO(c31460OooO0o0, c31466OooO0OO);
        c31466OooO0OO.close();
        outputStream.flush();
    }
}
