package o0ooo0;

import android.graphics.Path;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o0oo0o0O.InterfaceC31321OooO00o;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0o0o.C31325OooO0OO;
import o0oo0oO0.C31339OooOO0;
import o0oo0oO0.C31348OooOOO0;
import o0oo0ooo.C31412OooO00o;
import o0ooO00.C31416OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0ooo0O.AbstractC31753OooO0OO;
import o0ooo0O.C31758OooO0oo;
import o0ooo0O.C31759OooOO0;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31729OooOoO0 extends AbstractC31726OooOo0O {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C31348OooOOO0 f113346Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C31837OooO0OO f113347Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C31416OooO00o f113348Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final InterfaceC31322OooO0O0 f113349Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final boolean f113350Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C31412OooO00o f113351Oooo0o0;

    /* JADX INFO: renamed from: o0ooo0.OooOoO0$OooO00o */
    public class OooO00o implements C31339OooOO0.OooO00o {
    }

    public C31729OooOoO0(C31436OooO0Oo c31436OooO0Oo) throws Throwable {
        byte[] bArrOooO00o;
        C31668OooO c31668OooOOooO0O0;
        super(c31436OooO0Oo);
        new HashMap();
        C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
        C31348OooOOO0 c31348OooOOO0 = null;
        if (c31722OooOOo0 == null || (c31668OooOOooO0O0 = c31722OooOOo0.OooO0O0()) == null) {
            bArrOooO00o = null;
        } else {
            bArrOooO00o = c31668OooOOooO0O0.OooO00o();
            if (bArrOooO00o.length == 0) {
                Log.e("PdfBox-Android", "Invalid data for embedded Type1C font " + OooOo0o());
                bArrOooO00o = null;
            }
        }
        if (bArrOooO00o != null) {
            try {
                c31348OooOOO0 = (C31348OooOOO0) new C31339OooOO0().OooO0O0(bArrOooO00o, new OooO00o()).get(0);
            } catch (IOException e) {
                Log.e("PdfBox-Android", "Can't read the embedded Type1C font " + OooOo0o(), e);
            }
        }
        this.f113346Oooo0 = c31348OooOOO0;
        if (c31348OooOOO0 != null) {
            this.f113349Oooo0O0 = c31348OooOOO0;
            this.f113350Oooo0OO = true;
        } else {
            C31714OooOO0<InterfaceC31322OooO0O0> c31714OooOO0OooO0oO = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0oO(OooOo0o(), c31722OooOOo0);
            T t = c31714OooOO0OooO0oO.f113273OooO00o;
            this.f113349Oooo0O0 = t;
            if (c31714OooOO0OooO0oO.f113274OooO0O0) {
                Log.w("PdfBox-Android", "Using fallback font " + t.getName() + " for " + OooOo0o());
            }
            this.f113350Oooo0OO = false;
        }
        OooOo0();
        C31416OooO00o c31416OooO00oOooO00o = OooO00o().OooO00o();
        this.f113348Oooo00o = c31416OooO00oOooO00o;
        c31416OooO00oOooO00o.OooO00o();
    }

    @Override // o0ooo0.AbstractC31720OooOOOo, o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        List<Number> listOooO00o;
        C31837OooO0OO c31837OooO0OO = AbstractC31720OooOOOo.f113307OooOoo;
        if (this.f113347Oooo00O == null) {
            try {
                listOooO00o = this.f113349Oooo0O0.OooO00o();
            } catch (IOException unused) {
                this.f113347Oooo00O = c31837OooO0OO;
                listOooO00o = null;
            }
            if (listOooO00o == null || listOooO00o.size() != 6) {
                return c31837OooO0OO;
            }
            this.f113347Oooo00O = new C31837OooO0OO(listOooO00o.get(0).floatValue(), listOooO00o.get(1).floatValue(), listOooO00o.get(2).floatValue(), listOooO00o.get(3).floatValue(), listOooO00o.get(4).floatValue(), listOooO00o.get(5).floatValue());
        }
        return this.f113347Oooo00O;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        float[] fArr = {this.f113349Oooo0O0.OooOOoo(OooOo(this.f113325OooOooO.OooO0Oo(i))), 0.0f};
        this.f113348Oooo00o.OooO0O0(fArr, fArr);
        return fArr[0];
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31412OooO00o OooO0OO() throws IOException {
        C31676OooO0oo c31676OooO0ooOooO00o;
        if (this.f113351Oooo0o0 == null) {
            C31722OooOOo0 c31722OooOOo0 = this.f113310OooOoO;
            this.f113351Oooo0o0 = (c31722OooOOo0 == null || (c31676OooO0ooOooO00o = c31722OooOOo0.OooO00o()) == null || (c31676OooO0ooOooO00o.OooO0O0() == 0.0f && c31676OooO0ooOooO00o.OooO0OO() == 0.0f && c31676OooO0ooOooO00o.OooO0Oo() == 0.0f && c31676OooO0ooOooO00o.OooO0o0() == 0.0f)) ? this.f113349Oooo0O0.OooO0OO() : new C31412OooO00o(c31676OooO0ooOooO00o.OooO0O0(), c31676OooO0ooOooO00o.OooO0OO(), c31676OooO0ooOooO00o.OooO0Oo(), c31676OooO0ooOooO00o.OooO0o0());
        }
        return this.f113351Oooo0o0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113350Oooo0OO;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final byte[] OooO0o(int i) throws IOException {
        String strOooO00o = this.f113326OooOooo.OooO00o(i);
        if (!this.f113325OooOooO.f113391OooOo.containsKey(strOooO00o)) {
            throw new IllegalArgumentException(String.format("U+%04X ('%s') is not available in this font's encoding: %s", Integer.valueOf(i), strOooO00o, this.f113325OooOooO.OooO0O0()));
        }
        String strOooOo = OooOo(strOooO00o);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f113325OooOooO.f113391OooOo);
        if (strOooOo.equals(".notdef") || !this.f113349Oooo0O0.OooOOo0(strOooOo)) {
            throw new IllegalArgumentException(String.format("No glyph for U+%04X in font %s", Integer.valueOf(i), OooOo0o()));
        }
        return new byte[]{(byte) ((Integer) mapUnmodifiableMap.get(strOooO00o)).intValue()};
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final float OooOO0(String str) throws IOException {
        float fOooO0O0 = 0.0f;
        if (this.f113346Oooo0 == null) {
            Log.w("PdfBox-Android", "No embedded CFF font, returning 0");
            return 0.0f;
        }
        for (int i = 0; i < str.length(); i++) {
            fOooO0O0 += r1.OooO0o(this.f113326OooOooo.OooO00o(str.codePointAt(i))).OooO0O0();
        }
        return fOooO0O0;
    }

    @Override // o0ooo0.AbstractC31720OooOOOo
    public final int OooOOOO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        return byteArrayInputStream.read();
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final Path OooOOoo(String str) throws IOException {
        if (str.equals(".notdef") && !this.f113350Oooo0OO && !OooOOO0()) {
            return new Path();
        }
        boolean zEquals = "sfthyphen".equals(str);
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113349Oooo0O0;
        return zEquals ? interfaceC31322OooO0O0.OooOOO0("hyphen") : "nbspace".equals(str) ? !interfaceC31322OooO0O0.OooOOo0("space") ? new Path() : interfaceC31322OooO0O0.OooOOO0("space") : interfaceC31322OooO0O0.OooOOO0(str);
    }

    public final String OooOo(String str) throws IOException {
        if (this.f113350Oooo0OO) {
            return str;
        }
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113349Oooo0O0;
        if (interfaceC31322OooO0O0.OooOOo0(str)) {
            return str;
        }
        String strOooO0OO = this.f113326OooOooo.OooO0OO(str);
        if (strOooO0OO != null && strOooO0OO.length() == 1) {
            String strOooO0Oo = OooO0O0.OooO0O0.OooO0Oo(strOooO0OO.codePointAt(0));
            if (interfaceC31322OooO0O0.OooOOo0(strOooO0Oo)) {
                return strOooO0Oo;
            }
        }
        return ".notdef";
    }

    @Override // o0ooo0.AbstractC31726OooOo0O
    public final AbstractC31753OooO0OO OooOo0O() throws IOException {
        C31325OooO0OO c31325OooO0OO;
        if (!this.f113350Oooo0OO && (c31325OooO0OO = this.f113311OooOoO0) != null) {
            return new C31759OooOO0(c31325OooO0OO);
        }
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113349Oooo0O0;
        return interfaceC31322OooO0O0 instanceof InterfaceC31321OooO00o ? C31759OooOO0.OooO0o0(((InterfaceC31321OooO00o) interfaceC31322OooO0O0).OooO0O0()) : C31758OooO0oo.f113404OooOoO;
    }

    public final String OooOo0o() {
        return this.f113309OooOo0o.o000OOO(C31441OooOO0.f112259OoooO0O);
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final String getName() {
        return OooOo0o();
    }
}
