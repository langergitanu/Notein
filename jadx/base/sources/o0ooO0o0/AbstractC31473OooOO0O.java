package o0ooO0o0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31473OooOO0O {
    public static C31436OooO0Oo OooO0Oo(C31448OooOOo c31448OooOOo, int i) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O = c31448OooOOo.o0000O(C31441OooOO0.f112293o0000OO0, C31441OooOO0.f112295o0000OOo);
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O2 = c31448OooOOo.o0000O(C31441OooOO0.f112288o00000oo, C31441OooOO0.f112440o0O0O00);
        if ((abstractC31434OooO0O0O0000O instanceof C31441OooOO0) && (abstractC31434OooO0O0O0000O2 instanceof C31436OooO0Oo)) {
            return (C31436OooO0Oo) abstractC31434OooO0O0O0000O2;
        }
        boolean z = abstractC31434OooO0O0O0000O instanceof C31433OooO00o;
        if (z && (abstractC31434OooO0O0O0000O2 instanceof C31433OooO00o)) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O2;
            if (i < c31433OooO00o.f112214OooOo.size() && (c31433OooO00o.Oooo0OO(i) instanceof C31436OooO0Oo)) {
                return (C31436OooO0Oo) c31433OooO00o.Oooo0OO(i);
            }
        } else if (abstractC31434OooO0O0O0000O2 != null && !z && !(abstractC31434OooO0O0O0000O2 instanceof C31433OooO00o)) {
            Log.e("PdfBox-Android", "Expected DecodeParams to be an Array or Dictionary but found ".concat(abstractC31434OooO0O0O0000O2.getClass().getName()));
        }
        return new C31436OooO0Oo();
    }

    public abstract C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException;

    public C31472OooOO0 OooO0O0(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        return OooO00o(inputStream, outputStream, c31448OooOOo, i);
    }

    public abstract void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException;
}
