package o0ooO0o0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31471OooO0oo extends AbstractC31473OooOO0O {
    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        C31441OooOO0 c31441OooOO0 = (C31441OooOO0) c31448OooOOo.o0000O0O(C31441OooOO0.f112359o000oo0O);
        if (c31441OooOO0 == null || c31441OooOO0.equals(C31441OooOO0.f112310o000O)) {
            new C31475OooOOO().OooO00o(inputStream, outputStream, c31448OooOOo, i);
            return new C31472OooOO0(c31448OooOOo);
        }
        throw new IOException("Unsupported crypt filter " + c31441OooOO0.f112461OooOo);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        C31441OooOO0 c31441OooOO0 = (C31441OooOO0) c31453OooOo0O.o0000O0O(C31441OooOO0.f112359o000oo0O);
        if (c31441OooOO0 == null || c31441OooOO0.equals(C31441OooOO0.f112310o000O)) {
            new C31475OooOOO().OooO0OO(c31460OooO0o0, outputStream, c31453OooOo0O);
        } else {
            throw new IOException("Unsupported crypt filter " + c31441OooOO0.f112461OooOo);
        }
    }
}
