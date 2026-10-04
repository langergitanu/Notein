package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.e6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2062e6 extends C2236ov {

    /* JADX INFO: renamed from: c5 */
    private long f7117c5;

    /* JADX INFO: renamed from: ck */
    private Dictionary<Integer, String> f7118ck;

    /* JADX INFO: renamed from: du */
    private long f7119du;

    /* JADX INFO: renamed from: dy */
    private long f7120dy;

    /* JADX INFO: renamed from: fa */
    private String[] f7121fa;

    /* JADX INFO: renamed from: h4 */
    private long f7122h4;

    /* JADX INFO: renamed from: jd */
    private Dictionary<String, Integer> f7123jd;

    /* JADX INFO: renamed from: k4 */
    private float f7124k4;

    /* JADX INFO: renamed from: kk */
    private short f7125kk;

    /* JADX INFO: renamed from: m9 */
    private long f7126m9;

    /* JADX INFO: renamed from: to */
    private short f7127to;

    /* JADX INFO: renamed from: x1 */
    private float f7128x1;

    public C2062e6(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7121fa = new String[]{".notdef", ".null", "nonmarkingreturn", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", C18385v2.f56336h, "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", "d", "e", "f", "g", C18773h.f57233c, ContextChain.TAG_INFRA, "j", "k", "l", "m", BackupFile.PREFIX_NOTE_DIR, "o", ContextChain.TAG_PRODUCT, "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "Adieresis", "Aring", "Ccedilla", "Eacute", "Ntilde", "Odieresis", "Udieresis", "aacute", "agrave", "acircumflex", "adieresis", "atilde", "aring", "ccedilla", "eacute", "egrave", "ecircumflex", "edieresis", "iacute", "igrave", "icircumflex", "idieresis", "ntilde", "oacute", "ograve", "ocircumflex", "odieresis", "otilde", "uacute", "ugrave", "ucircumflex", "udieresis", "dagger", "degree", "cent", "sterling", "section", "bullet", "paragraph", "germandbls", "registered", "copyright", "trademark", "acute", "dieresis", "notequal", "AE", "Oslash", "infinity", "plusminus", "lessequal", "greaterequal", "yen", "mu", "partialdiff", "summation", "product", ContextChain.TAG_PRODUCT_AND_INFRA, "integral", "ordfeminine", "ordmasculine", "Omega", "ae", "oslash", "questiondown", "exclamdown", "logicalnot", "radical", "florin", "approxequal", "Delta", "guillemotleft", "guillemotright", "ellipsis", "nonbreakingspace", "Agrave", "Atilde", "Otilde", "OE", "oe", "endash", "emdash", "quotedblleft", "quotedblright", "quoteleft", "quoteright", "divide", "lozenge", "ydieresis", "Ydieresis", "fraction", FirebaseAnalytics.Param.CURRENCY, "guilsinglleft", "guilsinglright", TranslateLanguage.FINNISH, "fl", "daggerdbl", "periodcentered", "quotesinglbase", "quotedblbase", "perthousand", "Acircumflex", "Ecircumflex", "Aacute", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Oacute", "Ocircumflex", "apple", "Ograve", "Uacute", "Ucircumflex", "Ugrave", "dotlessi", "circumflex", "tilde", "macron", "breve", "dotaccent", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "Lslash", "lslash", "Scaron", "scaron", "Zcaron", "zcaron", "brokenbar", "Eth", "eth", "Yacute", "yacute", "Thorn", "thorn", "minus", "multiply", "onesuperior", "twosuperior", "threesuperior", "onehalf", "onequarter", "threequarters", "franc", "Gbreve", "gbreve", "Idotaccent", "Scedilla", "scedilla", "Cacute", "cacute", "Ccaron", "ccaron", "dcroat"};
        this.f7124k4 = 3.0f;
        this.f7119du = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10446k4(String str) {
        m11218dq();
        if (this.f7123jd.containsKey(str)) {
            return this.f7123jd.get_Item(str).intValue();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f7124k4 = c2212n9.m11163to();
        this.f7128x1 = c2212n9.m11163to();
        this.f7125kk = c2212n9.m11147c5();
        this.f7127to = c2212n9.m11147c5();
        this.f7119du = c2212n9.m11164up();
        this.f7122h4 = c2212n9.m11164up();
        this.f7126m9 = c2212n9.m11164up();
        this.f7120dy = c2212n9.m11164up();
        this.f7117c5 = c2212n9.m11164up();
        float f = this.f7124k4;
        if (f == 1.0d) {
            return;
        }
        int i = 0;
        if (f != 2.0d) {
            if (f == 2.5d || f == 3.0f || f != 4.0f) {
                return;
            }
            while (i < (m11221lr().m10547du().m11521k4() & 65535)) {
                this.f7118ck.set_Item(Integer.valueOf(i), C14113y2.m67402k4("a{0}", Integer.valueOf(c2212n9.m11151fa())));
                this.f7123jd.set_Item(this.f7118ck.get_Item(Integer.valueOf(i)), Integer.valueOf(i));
                i++;
            }
            return;
        }
        int iM11151fa = c2212n9.m11151fa() & 65535;
        if (iM11151fa != (m11221lr().m10547du().m11521k4() & 65535)) {
            C2244ph.m11243k4("number of glyphs in post and maxp tables is not equal");
        }
        int[] iArr = new int[iM11151fa];
        int i2 = 0;
        for (int i3 = 0; i3 < iM11151fa; i3++) {
            int iM11151fa2 = c2212n9.m11151fa();
            if ((iM11151fa2 & 65535) >= 32768) {
                C2244ph.m11243k4(C14113y2.m67402k4("glyph index={0} has invalid post glyph name index = {1}", Integer.valueOf(i3), Integer.valueOf(iM11151fa2)));
                iM11151fa2 = 0;
            }
            iArr[i3] = iM11151fa2;
            if ((iM11151fa2 & 65535) > (i2 & 65535)) {
                i2 = iM11151fa2;
            }
        }
        int i4 = i2 & 65535;
        int i5 = i4 > 257 ? i4 - 257 : 0;
        String[] strArr = new String[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            strArr[i6] = c2212n9.m11156k4(c2212n9.m11161kk() & 255, "us-ascii");
        }
        while (i < iM11151fa) {
            int i7 = iArr[i] & 65535;
            if (i7 < i5 + 257) {
                this.f7118ck.set_Item(Integer.valueOf(i), i7 <= 257 ? this.f7121fa[i7] : strArr[i7 - 258]);
                this.f7123jd.set_Item(this.f7118ck.get_Item(Integer.valueOf(i)), Integer.valueOf(i));
            }
            i++;
        }
    }

    public C2062e6(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7121fa = new String[]{".notdef", ".null", "nonmarkingreturn", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", C18385v2.f56336h, "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", "d", "e", "f", "g", C18773h.f57233c, ContextChain.TAG_INFRA, "j", "k", "l", "m", BackupFile.PREFIX_NOTE_DIR, "o", ContextChain.TAG_PRODUCT, "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "Adieresis", "Aring", "Ccedilla", "Eacute", "Ntilde", "Odieresis", "Udieresis", "aacute", "agrave", "acircumflex", "adieresis", "atilde", "aring", "ccedilla", "eacute", "egrave", "ecircumflex", "edieresis", "iacute", "igrave", "icircumflex", "idieresis", "ntilde", "oacute", "ograve", "ocircumflex", "odieresis", "otilde", "uacute", "ugrave", "ucircumflex", "udieresis", "dagger", "degree", "cent", "sterling", "section", "bullet", "paragraph", "germandbls", "registered", "copyright", "trademark", "acute", "dieresis", "notequal", "AE", "Oslash", "infinity", "plusminus", "lessequal", "greaterequal", "yen", "mu", "partialdiff", "summation", "product", ContextChain.TAG_PRODUCT_AND_INFRA, "integral", "ordfeminine", "ordmasculine", "Omega", "ae", "oslash", "questiondown", "exclamdown", "logicalnot", "radical", "florin", "approxequal", "Delta", "guillemotleft", "guillemotright", "ellipsis", "nonbreakingspace", "Agrave", "Atilde", "Otilde", "OE", "oe", "endash", "emdash", "quotedblleft", "quotedblright", "quoteleft", "quoteright", "divide", "lozenge", "ydieresis", "Ydieresis", "fraction", FirebaseAnalytics.Param.CURRENCY, "guilsinglleft", "guilsinglright", TranslateLanguage.FINNISH, "fl", "daggerdbl", "periodcentered", "quotesinglbase", "quotedblbase", "perthousand", "Acircumflex", "Ecircumflex", "Aacute", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Oacute", "Ocircumflex", "apple", "Ograve", "Uacute", "Ucircumflex", "Ugrave", "dotlessi", "circumflex", "tilde", "macron", "breve", "dotaccent", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "Lslash", "lslash", "Scaron", "scaron", "Zcaron", "zcaron", "brokenbar", "Eth", "eth", "Yacute", "yacute", "Thorn", "thorn", "minus", "multiply", "onesuperior", "twosuperior", "threesuperior", "onehalf", "onequarter", "threequarters", "franc", "Gbreve", "gbreve", "Idotaccent", "Scedilla", "scedilla", "Cacute", "cacute", "Ccaron", "ccaron", "dcroat"};
        this.f7123jd = new Dictionary<>();
        this.f7118ck = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m10447k4(int i) {
        m11218dq();
        if (!this.f7118ck.containsKey(Integer.valueOf(i))) {
            float f = this.f7124k4;
            if (f == 1.0f || f == 3.0f) {
                String[] strArr = this.f7121fa;
                if (i < strArr.length) {
                    return strArr[i];
                }
            }
        }
        return this.f7118ck.containsKey(Integer.valueOf(i)) ? this.f7118ck.get_Item(Integer.valueOf(i)) : ".notdef";
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                c2362x4.m11646k4(this.f7124k4);
                c2362x4.m11646k4(this.f7128x1);
                c2362x4.m11651k4(this.f7125kk);
                c2362x4.m11651k4(this.f7127to);
                c2362x4.m11660kk(this.f7119du);
                c2362x4.m11660kk(this.f7122h4);
                c2362x4.m11660kk(this.f7126m9);
                c2362x4.m11660kk(this.f7120dy);
                c2362x4.m11660kk(this.f7117c5);
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
