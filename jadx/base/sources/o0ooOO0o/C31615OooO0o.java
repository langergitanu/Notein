package o0ooOO0o;

import android.util.Log;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import o00o0Ooo.C25432OooOO0;
import o0ooO0O.InterfaceC31429OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooOoo.C31669OooO00o;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0oooO00.C31792OooO;
import o0oooO00.C31794OooO0O0;
import o0oooO00.C31795OooO0OO;
import o0oooO00.C31796OooO0Oo;
import o0oooO00.C31797OooO0o;
import o0oooO00.C31798OooO0o0;
import o0oooO00.C31799OooO0oO;
import o0oooO00.C31800OooO0oo;
import o0oooO00.C31801OooOO0;
import o0oooO00.C31802OooOO0O;
import o0oooO00.C31803OooOO0o;

/* JADX INFO: renamed from: o0ooOO0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31615OooO0o implements InterfaceC31671OooO0OO, InterfaceC31429OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C31610OooO f113021OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113022OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C31676OooO0oo f113023OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C25432OooOO0 f113024OooOoO0;

    public C31615OooO0o() {
        C31676OooO0oo c31676OooO0oo = C31676OooO0oo.f113214OooOo;
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        this.f113022OooOo0o = c31436OooO0Oo;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112373o00O00O);
        c31436OooO0Oo.o000OoOo(C31441OooOO0.f112351o000o0o0, c31676OooO0oo);
    }

    @Override // o0ooO0O.InterfaceC31429OooO00o
    public final InputStream OooO00o() throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113022OooOo0o.o0000O0O(C31441OooOO0.f112439o00ooo);
        if (abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo) {
            return ((C31448OooOOo) abstractC31434OooO0O0O0000O0O).o000o00O();
        }
        if (abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            if (c31433OooO00o.f112214OooOo.size() > 0) {
                byte[] bArr = {10};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                    if (abstractC31434OooO0O0Oooo0OO instanceof C31448OooOOo) {
                        arrayList.add(((C31448OooOOo) abstractC31434OooO0O0Oooo0OO).o000o00O());
                        arrayList.add(new ByteArrayInputStream(bArr));
                    }
                }
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    public final C31669OooO00o OooO0O0() throws IOException {
        InterfaceC31671OooO0OO c31800OooO0oo;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112249Oooo00o;
        C31436OooO0Oo c31436OooO0Oo = this.f113022OooOo0o;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o)) {
            return new C31669OooO00o(c31436OooO0Oo, c31441OooOO0);
        }
        C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
            if (abstractC31434OooO0O0Oooo0OO != null) {
                if (!(abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo)) {
                    throw new IOException("Error: Unknown annotation type " + abstractC31434OooO0O0Oooo0OO);
                }
                C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO;
                String strO000OOO = c31436OooO0Oo2.o000OOO(C31441OooOO0.f112404o00OO0);
                if ("FileAttachment".equals(strO000OOO)) {
                    c31800OooO0oo = new C31794OooO0O0(c31436OooO0Oo2);
                } else if ("Line".equals(strO000OOO)) {
                    c31800OooO0oo = new C31795OooO0OO(c31436OooO0Oo2);
                } else if (HttpHeaders.LINK.equals(strO000OOO)) {
                    c31800OooO0oo = new C31796OooO0Oo(c31436OooO0Oo2);
                } else if ("Popup".equals(strO000OOO)) {
                    c31800OooO0oo = new C31797OooO0o(c31436OooO0Oo2);
                } else if ("Stamp".equals(strO000OOO)) {
                    c31800OooO0oo = new C31799OooO0oO(c31436OooO0Oo2);
                } else if ("Square".equals(strO000OOO) || "Circle".equals(strO000OOO)) {
                    c31800OooO0oo = new C31800OooO0oo(c31436OooO0Oo2);
                } else if ("Text".equals(strO000OOO)) {
                    c31800OooO0oo = new C31792OooO(c31436OooO0Oo2);
                } else if ("Highlight".equals(strO000OOO) || "Underline".equals(strO000OOO) || "Squiggly".equals(strO000OOO) || "StrikeOut".equals(strO000OOO)) {
                    c31800OooO0oo = new C31801OooOO0(c31436OooO0Oo2);
                } else if ("Widget".equals(strO000OOO)) {
                    c31800OooO0oo = new C31803OooOO0o(c31436OooO0Oo2);
                } else if ("FreeText".equals(strO000OOO) || "Polygon".equals(strO000OOO) || "PolyLine".equals(strO000OOO) || "Caret".equals(strO000OOO) || "Ink".equals(strO000OOO) || "Sound".equals(strO000OOO)) {
                    c31800OooO0oo = new C31798OooO0o0(c31436OooO0Oo2);
                } else {
                    InterfaceC31671OooO0OO c31802OooOO0O = new C31802OooOO0O(c31436OooO0Oo2);
                    Log.d("PdfBox-Android", "Unknown or unsupported annotation subtype " + strO000OOO);
                    c31800OooO0oo = c31802OooOO0O;
                }
                arrayList.add(c31800OooO0oo);
            }
        }
        return new C31669OooO00o(arrayList, c31433OooO00o);
    }

    public final C31676OooO0oo OooO0OO() {
        if (this.f113023OooOoO == null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0OO = C31618OooO0oo.OooO0OO(this.f113022OooOo0o, C31441OooOO0.f112351o000o0o0);
            if (abstractC31434OooO0O0OooO0OO instanceof C31433OooO00o) {
                this.f113023OooOoO = new C31676OooO0oo((C31433OooO00o) abstractC31434OooO0O0OooO0OO);
            }
        }
        if (this.f113023OooOoO == null) {
            Log.d("PdfBox-Android", "Can't find MediaBox, will use U.S. Letter");
            this.f113023OooOoO = C31676OooO0oo.f113214OooOo;
        }
        return this.f113023OooOoO;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113022OooOo0o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C31615OooO0o) && ((C31615OooO0o) obj).f113022OooOo0o == this.f113022OooOo0o;
    }

    public final int hashCode() {
        return this.f113022OooOo0o.hashCode();
    }

    public C31615OooO0o(C31436OooO0Oo c31436OooO0Oo) {
        this.f113022OooOo0o = c31436OooO0Oo;
    }

    public C31615OooO0o(C31436OooO0Oo c31436OooO0Oo, C25432OooOO0 c25432OooOO0) {
        this.f113022OooOo0o = c31436OooO0Oo;
        this.f113024OooOoO0 = c25432OooOO0;
    }
}
