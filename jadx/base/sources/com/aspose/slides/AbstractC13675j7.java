package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p182ii.C4944x6;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p307nz.C6964k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p517y2.InterfaceC12765du;
import com.aspose.slides.internal.p517y2.InterfaceC12768h4;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12775m9;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.j7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13675j7 {

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, Boolean> f45415du;

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f45416h4;

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, Boolean> f45417kk;

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, Character> f45418to;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, Boolean> f45419x1;

    /* JADX INFO: renamed from: k4 */
    private boolean f45420k4;

    /* JADX INFO: renamed from: com.aspose.slides.j7$du */
    public static class du {

        /* JADX INFO: renamed from: k4 */
        x1 f45421k4;

        /* JADX INFO: renamed from: x1 */
        int f45422x1;

        public du(x1 x1Var, int i) {
            this.f45421k4 = x1Var;
            this.f45422x1 = i;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.j7$h4 */
    public static class h4 {

        /* JADX INFO: renamed from: du */
        String f45423du;

        /* JADX INFO: renamed from: k4 */
        boolean f45424k4;

        /* JADX INFO: renamed from: kk */
        boolean f45425kk;

        /* JADX INFO: renamed from: to */
        boolean f45426to;

        /* JADX INFO: renamed from: x1 */
        boolean f45427x1;

        public h4() {
            this.f45425kk = true;
        }

        public h4(h4 h4Var) {
            this.f45424k4 = h4Var.f45424k4;
            this.f45425kk = h4Var.f45425kk;
            this.f45426to = h4Var.f45426to;
            this.f45427x1 = h4Var.f45427x1;
            this.f45423du = h4Var.f45423du;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.j7$k4 */
    public static class k4 extends kk {

        /* JADX INFO: renamed from: k4 */
        public final String f45428k4;

        public k4(int i, int i2, char[] cArr, int i3, int i4) {
            super(i, i2);
            this.f45428k4 = C14113y2.m67398k4(C14113y2.m67406k4(cArr, i3, i4 - i3), C11697x1.m55250kk());
        }

        public k4(String str) {
            super(-1, -1);
            this.f45428k4 = str;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.j7$kk */
    public static abstract class kk {

        /* JADX INFO: renamed from: du */
        public final int f45429du;

        /* JADX INFO: renamed from: to */
        public final int f45430to;

        public kk(int i, int i2) {
            this.f45430to = i;
            this.f45429du = i2;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.j7$to */
    public static class to extends kk {
        public to(int i, int i2) {
            super(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.j7$x1 */
    public static class x1 extends kk {

        /* JADX INFO: renamed from: k4 */
        public final String f45431k4;

        /* JADX INFO: renamed from: kk */
        public final boolean f45432kk;

        /* JADX INFO: renamed from: x1 */
        public final IGenericDictionary<String, String> f45433x1;

        public x1(int i, int i2, char[] cArr, int i3, int i4, IGenericDictionary<String, String> iGenericDictionary, boolean z) {
            super(i, i2);
            this.f45431k4 = C14113y2.m67398k4(C14113y2.m67406k4(cArr, i3, i4 - i3), C11697x1.m55250kk());
            this.f45433x1 = iGenericDictionary;
            this.f45432kk = z;
        }
    }

    static {
        Dictionary<String, Character> dictionary = new Dictionary<>(AbstractC14070jw.m66790x1());
        f45418to = dictionary;
        C22229OoooO00.OooO00o('\"', dictionary, "quot", '&', "amp");
        C22229OoooO00.OooO00o('\'', dictionary, "apos", '<', TranslateLanguage.LITHUANIAN);
        C22229OoooO00.OooO00o('>', dictionary, "gt", ControlChar.NON_BREAKING_SPACE_CHAR, "nbsp");
        C22229OoooO00.OooO00o((char) 161, dictionary, "iexcl", (char) 162, "cent");
        C22229OoooO00.OooO00o((char) 163, dictionary, "pound", (char) 164, "curren");
        C22229OoooO00.OooO00o((char) 165, dictionary, "yen", (char) 166, "brvbar");
        C22229OoooO00.OooO00o((char) 167, dictionary, "sect", (char) 168, "uml");
        C22229OoooO00.OooO00o((char) 169, dictionary, "copy", (char) 170, "ordf");
        C22229OoooO00.OooO00o((char) 171, dictionary, "laquo", (char) 172, "not");
        C22229OoooO00.OooO00o((char) 173, dictionary, "shy", (char) 174, "reg");
        C22229OoooO00.OooO00o((char) 175, dictionary, "macr", (char) 176, "deg");
        C22229OoooO00.OooO00o((char) 177, dictionary, "plusmn", (char) 178, "sup2");
        C22229OoooO00.OooO00o((char) 179, dictionary, "sup3", (char) 180, "acute");
        C22229OoooO00.OooO00o((char) 181, dictionary, "micro", (char) 182, "para");
        C22229OoooO00.OooO00o((char) 183, dictionary, "middot", (char) 184, "cedil");
        C22229OoooO00.OooO00o((char) 185, dictionary, "sup1", (char) 186, "ordm");
        C22229OoooO00.OooO00o((char) 187, dictionary, "raquo", (char) 188, "frac14");
        C22229OoooO00.OooO00o((char) 189, dictionary, "frac12", (char) 190, "frac34");
        C22229OoooO00.OooO00o((char) 191, dictionary, "iquest", (char) 192, "Agrave");
        C22229OoooO00.OooO00o((char) 193, dictionary, "Aacute", (char) 194, "Acirc");
        C22229OoooO00.OooO00o((char) 195, dictionary, "Atilde", (char) 196, "Auml");
        C22229OoooO00.OooO00o((char) 197, dictionary, "Aring", (char) 198, "AElig");
        C22229OoooO00.OooO00o((char) 199, dictionary, "Ccedil", (char) 200, "Egrave");
        C22229OoooO00.OooO00o((char) 201, dictionary, "Eacute", (char) 202, "Ecirc");
        C22229OoooO00.OooO00o((char) 203, dictionary, "Euml", (char) 204, "Igrave");
        C22229OoooO00.OooO00o((char) 205, dictionary, "Iacute", (char) 206, "Icirc");
        C22229OoooO00.OooO00o((char) 207, dictionary, "Iuml", (char) 208, "ETH");
        C22229OoooO00.OooO00o((char) 209, dictionary, "Ntilde", (char) 210, "Ograve");
        C22229OoooO00.OooO00o((char) 211, dictionary, "Oacute", (char) 212, "Ocirc");
        C22229OoooO00.OooO00o((char) 213, dictionary, "Otilde", (char) 214, "Ouml");
        C22229OoooO00.OooO00o((char) 215, dictionary, "times", (char) 216, "Oslash");
        C22229OoooO00.OooO00o((char) 217, dictionary, "Ugrave", (char) 218, "Uacute");
        C22229OoooO00.OooO00o((char) 219, dictionary, "Ucirc", (char) 220, "Uuml");
        C22229OoooO00.OooO00o((char) 221, dictionary, "Yacute", (char) 222, "THORN");
        C22229OoooO00.OooO00o((char) 223, dictionary, "szlig", (char) 224, "agrave");
        C22229OoooO00.OooO00o((char) 225, dictionary, "aacute", (char) 226, "acirc");
        C22229OoooO00.OooO00o((char) 227, dictionary, "atilde", (char) 228, "auml");
        C22229OoooO00.OooO00o((char) 229, dictionary, "aring", (char) 230, "aelig");
        C22229OoooO00.OooO00o((char) 231, dictionary, "ccedil", (char) 232, "egrave");
        C22229OoooO00.OooO00o((char) 233, dictionary, "eacute", (char) 234, "ecirc");
        C22229OoooO00.OooO00o((char) 235, dictionary, "euml", (char) 236, "igrave");
        C22229OoooO00.OooO00o((char) 237, dictionary, "iacute", (char) 238, "icirc");
        C22229OoooO00.OooO00o((char) 239, dictionary, "iuml", (char) 240, "eth");
        C22229OoooO00.OooO00o((char) 241, dictionary, "ntilde", (char) 242, "ograve");
        C22229OoooO00.OooO00o((char) 243, dictionary, "oacute", (char) 244, "ocirc");
        C22229OoooO00.OooO00o((char) 245, dictionary, "otilde", (char) 246, "ouml");
        C22229OoooO00.OooO00o((char) 247, dictionary, "divide", (char) 248, "oslash");
        C22229OoooO00.OooO00o((char) 249, dictionary, "ugrave", (char) 250, "uacute");
        C22229OoooO00.OooO00o((char) 251, dictionary, "ucirc", (char) 252, "uuml");
        C22229OoooO00.OooO00o((char) 253, dictionary, "yacute", (char) 254, "thorn");
        C22229OoooO00.OooO00o((char) 255, dictionary, "yuml", (char) 338, "OElig");
        C22229OoooO00.OooO00o((char) 339, dictionary, "oelig", (char) 352, "Scaron");
        C22229OoooO00.OooO00o((char) 353, dictionary, "scaron", (char) 376, "Yuml");
        C22229OoooO00.OooO00o((char) 402, dictionary, "fnof", (char) 710, "circ");
        C22229OoooO00.OooO00o((char) 732, dictionary, "tilde", (char) 913, "Alpha");
        C22229OoooO00.OooO00o((char) 914, dictionary, "Beta", (char) 915, "Gamma");
        C22229OoooO00.OooO00o((char) 916, dictionary, "Delta", (char) 917, "Epsilon");
        C22229OoooO00.OooO00o((char) 918, dictionary, "Zeta", (char) 919, "Eta");
        C22229OoooO00.OooO00o((char) 920, dictionary, "Theta", (char) 921, "Iota");
        C22229OoooO00.OooO00o((char) 922, dictionary, "Kappa", (char) 923, "Lambda");
        C22229OoooO00.OooO00o((char) 924, dictionary, "Mu", (char) 925, "Nu");
        C22229OoooO00.OooO00o((char) 926, dictionary, "Xi", (char) 927, "Omicron");
        C22229OoooO00.OooO00o((char) 928, dictionary, "Pi", (char) 929, "Rho");
        C22229OoooO00.OooO00o((char) 931, dictionary, "Sigma", (char) 932, "Tau");
        C22229OoooO00.OooO00o((char) 933, dictionary, "Upsilon", (char) 934, "Phi");
        C22229OoooO00.OooO00o((char) 935, dictionary, "Chi", (char) 936, "Psi");
        C22229OoooO00.OooO00o((char) 937, dictionary, "Omega", (char) 945, "alpha");
        C22229OoooO00.OooO00o((char) 946, dictionary, "beta", (char) 947, "gamma");
        C22229OoooO00.OooO00o((char) 948, dictionary, "delta", (char) 949, "epsilon");
        C22229OoooO00.OooO00o((char) 950, dictionary, "zeta", (char) 951, "eta");
        C22229OoooO00.OooO00o((char) 952, dictionary, "theta", (char) 953, "iota");
        C22229OoooO00.OooO00o((char) 954, dictionary, "kappa", (char) 955, "lambda");
        C22229OoooO00.OooO00o((char) 956, dictionary, "mu", (char) 957, "nu");
        C22229OoooO00.OooO00o((char) 958, dictionary, "xi", (char) 959, "omicron");
        C22229OoooO00.OooO00o((char) 960, dictionary, ContextChain.TAG_PRODUCT_AND_INFRA, (char) 961, "rho");
        C22229OoooO00.OooO00o((char) 962, dictionary, "sigmaf", (char) 963, "sigma");
        C22229OoooO00.OooO00o((char) 964, dictionary, "tau", (char) 965, "upsilon");
        C22229OoooO00.OooO00o((char) 966, dictionary, "phi", (char) 967, "chi");
        C22229OoooO00.OooO00o((char) 968, dictionary, "psi", (char) 969, "omega");
        C22229OoooO00.OooO00o((char) 977, dictionary, "thetasym", (char) 978, "upsih");
        C22229OoooO00.OooO00o((char) 982, dictionary, "piv", ControlChar.DEFAULT_TEXT_INPUT_CHAR, "ensp");
        C22229OoooO00.OooO00o((char) 8195, dictionary, "emsp", (char) 8201, "thinsp");
        C22229OoooO00.OooO00o((char) 8204, dictionary, "zwnj", (char) 8205, "zwj");
        C22229OoooO00.OooO00o((char) 8206, dictionary, "lrm", (char) 8207, "rlm");
        C22229OoooO00.OooO00o((char) 8211, dictionary, "ndash", (char) 8212, "mdash");
        C22229OoooO00.OooO00o((char) 8216, dictionary, "lsquo", (char) 8217, "rsquo");
        C22229OoooO00.OooO00o((char) 8218, dictionary, "sbquo", (char) 8220, "ldquo");
        C22229OoooO00.OooO00o((char) 8221, dictionary, "rdquo", (char) 8222, "bdquo");
        C22229OoooO00.OooO00o((char) 8224, dictionary, "dagger", (char) 8225, "Dagger");
        C22229OoooO00.OooO00o((char) 8226, dictionary, "bull", (char) 8230, "hellip");
        C22229OoooO00.OooO00o((char) 8240, dictionary, "permil", (char) 8242, "prime");
        C22229OoooO00.OooO00o((char) 8243, dictionary, "Prime", (char) 8249, "lsaquo");
        C22229OoooO00.OooO00o((char) 8250, dictionary, "rsaquo", (char) 8254, "oline");
        C22229OoooO00.OooO00o((char) 8260, dictionary, "frasl", (char) 8364, "euro");
        C22229OoooO00.OooO00o((char) 8465, dictionary, "image", (char) 8472, "weierp");
        C22229OoooO00.OooO00o((char) 8476, dictionary, "real", (char) 8482, "trade");
        C22229OoooO00.OooO00o((char) 8501, dictionary, "alefsym", (char) 8592, "larr");
        C22229OoooO00.OooO00o((char) 8593, dictionary, "uarr", (char) 8594, "rarr");
        C22229OoooO00.OooO00o((char) 8595, dictionary, "darr", (char) 8596, "harr");
        C22229OoooO00.OooO00o((char) 8629, dictionary, "crarr", (char) 8656, "lArr");
        C22229OoooO00.OooO00o((char) 8657, dictionary, "uArr", (char) 8658, "rArr");
        C22229OoooO00.OooO00o((char) 8659, dictionary, "dArr", (char) 8660, "hArr");
        C22229OoooO00.OooO00o((char) 8704, dictionary, "forall", (char) 8706, "part");
        C22229OoooO00.OooO00o((char) 8707, dictionary, "exist", (char) 8709, "empty");
        C22229OoooO00.OooO00o((char) 8711, dictionary, "nabla", (char) 8712, "isin");
        C22229OoooO00.OooO00o((char) 8713, dictionary, "notin", (char) 8715, "ni");
        C22229OoooO00.OooO00o((char) 8719, dictionary, "prod", (char) 8721, "sum");
        C22229OoooO00.OooO00o((char) 8722, dictionary, "minus", (char) 8727, "lowast");
        C22229OoooO00.OooO00o((char) 8730, dictionary, "radic", (char) 8733, "prop");
        C22229OoooO00.OooO00o((char) 8734, dictionary, "infin", (char) 8736, "ang");
        C22229OoooO00.OooO00o((char) 8743, dictionary, "and", (char) 8744, "or");
        C22229OoooO00.OooO00o((char) 8745, dictionary, "cap", (char) 8746, "cup");
        C22229OoooO00.OooO00o((char) 8747, dictionary, "int", (char) 8756, "there4");
        C22229OoooO00.OooO00o((char) 8764, dictionary, "sim", (char) 8773, "cong");
        C22229OoooO00.OooO00o((char) 8776, dictionary, "asymp", (char) 8800, "ne");
        C22229OoooO00.OooO00o((char) 8801, dictionary, "equiv", (char) 8804, "le");
        C22229OoooO00.OooO00o((char) 8805, dictionary, "ge", (char) 8834, "sub");
        C22229OoooO00.OooO00o((char) 8835, dictionary, "sup", (char) 8836, "nsub");
        C22229OoooO00.OooO00o((char) 8838, dictionary, "sube", (char) 8839, "supe");
        C22229OoooO00.OooO00o((char) 8853, dictionary, "oplus", (char) 8855, "otimes");
        C22229OoooO00.OooO00o((char) 8869, dictionary, "perp", (char) 8901, "sdot");
        C22229OoooO00.OooO00o((char) 8968, dictionary, "lceil", (char) 8969, "rceil");
        C22229OoooO00.OooO00o((char) 8970, dictionary, "lfloor", (char) 8971, "rfloor");
        C22229OoooO00.OooO00o((char) 9001, dictionary, CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, (char) 9002, "rang");
        C22229OoooO00.OooO00o((char) 9674, dictionary, "loz", (char) 9824, "spades");
        C22229OoooO00.OooO00o((char) 9827, dictionary, "clubs", (char) 9829, "hearts");
        dictionary.set_Item("diams", (char) 9830);
        Dictionary<String, Boolean> dictionary2 = new Dictionary<>(AbstractC14070jw.m66790x1());
        f45419x1 = dictionary2;
        Boolean bool = Boolean.TRUE;
        dictionary2.set_Item("meta", bool);
        dictionary2.set_Item("img", bool);
        Dictionary<String, Boolean> dictionary3 = new Dictionary<>(AbstractC14070jw.m66790x1());
        f45417kk = dictionary3;
        dictionary3.set_Item(ContextChain.TAG_INFRA, bool);
        dictionary3.set_Item("b", bool);
        dictionary3.set_Item("em", bool);
        dictionary3.set_Item("strong", bool);
        dictionary3.set_Item("strike", bool);
        dictionary3.set_Item("dfn", bool);
        dictionary3.set_Item("code", bool);
        dictionary3.set_Item("samp", bool);
        dictionary3.set_Item("kbd", bool);
        dictionary3.set_Item("var", bool);
        dictionary3.set_Item("cite", bool);
        dictionary3.set_Item("abbr", bool);
        dictionary3.set_Item("acronym", bool);
        dictionary3.set_Item("u", bool);
        dictionary3.set_Item("s", bool);
        dictionary3.set_Item("font", bool);
        dictionary3.set_Item("sub", bool);
        dictionary3.set_Item("sup", bool);
        Dictionary<String, Boolean> dictionary4 = new Dictionary<>(AbstractC14070jw.m66790x1());
        f45415du = dictionary4;
        dictionary4.set_Item("plaintext", bool);
        dictionary4.set_Item("script", bool);
        f45416h4 = new C7017h4("pre", "script", "style", "plaintext", "img", "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private List<kk> m63233k4(char[] cArr, int i, int i2, boolean[] zArr) {
        char c;
        char c2;
        boolean z;
        char c3;
        int i3;
        char c4;
        int i4;
        char c5;
        char c6;
        char[] cArr2 = cArr;
        List<kk> list = new List<>();
        char c7 = 0;
        zArr[0] = false;
        int i5 = i + i2;
        int i6 = i;
        while (i6 < i5) {
            int i7 = i6;
            while (i7 < i5 && cArr2[i7] != '<') {
                i7++;
            }
            if (i6 < i7) {
                list.addItem(new to(i6, i7));
            }
            if (i7 >= i5 || cArr2[i7] != '<') {
                c = c7;
            } else {
                int i8 = i7 + 2;
                char c8 = cArr2[i7 + 1];
                char c9 = ControlChar.SPACE_CHAR;
                if (c8 != '!') {
                    char c10 = IOUtils.DIR_SEPARATOR_UNIX;
                    if (c8 == '/') {
                        c = c7;
                        int i9 = i8;
                        while (i9 < i5) {
                            char c11 = cArr2[i9];
                            if (c11 <= ' ' || c11 == '>') {
                                break;
                            }
                            i9++;
                        }
                        if (i9 >= i5 || cArr2[i9] != '>') {
                            list.addItem(new to(i7, i9));
                        } else {
                            int i10 = i9 + 1;
                            list.addItem(new k4(i7, i10, cArr2, i8, i9));
                            i9 = i10;
                        }
                        i6 = i9;
                    } else if (c8 != '?') {
                        int i11 = i7 + 1;
                        int i12 = i11;
                        while (i12 < i5) {
                            char c12 = cArr2[i12];
                            if (c12 <= ' ' || c12 == '/' || c12 == '>') {
                                break;
                            }
                            i12++;
                        }
                        int i13 = i12;
                        while (i13 < i5 && cArr2[i13] <= ' ') {
                            i13++;
                        }
                        Dictionary dictionary = new Dictionary();
                        while (i13 < i5) {
                            char c13 = cArr2[i13];
                            if (c13 == c10 || c13 == '>') {
                                break;
                            }
                            int i14 = i13;
                            while (i14 < i5 && (c6 = cArr2[i14]) > ' ' && c6 != '=' && c6 != '>') {
                                i14++;
                            }
                            int i15 = i14;
                            while (true) {
                                c = c7;
                                if (i15 >= i5 || cArr2[i15] > ' ') {
                                    break;
                                }
                                i15++;
                                c7 = c;
                            }
                            if (i15 >= i5 || (c3 = cArr2[i15]) == '>') {
                                i13 = i15;
                                break;
                            }
                            if (c3 == '=') {
                                do {
                                    i15++;
                                    if (i15 >= i5) {
                                        break;
                                    }
                                } while (cArr2[i15] <= ' ');
                                if (i15 < i5 && ((c4 = cArr2[i15]) == '\'' || c4 == '\"')) {
                                    i15++;
                                    i3 = i15;
                                    while (i3 < i5) {
                                        char c14 = cArr2[i3];
                                        if (c14 == c4 && (c14 != c4 || (i4 = i3 + 1) >= i5 || (c5 = cArr2[i4]) == '\r' || c5 == '\n' || c5 == ' ' || c5 == '>' || c5 == '/')) {
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    i3 = i15;
                                    while (i3 < i5) {
                                        char c15 = cArr2[i3];
                                        if (c15 <= ' ' || c15 == '>') {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                dictionary.set_Item(C14113y2.m67406k4(cArr2, i13, i14 - i13), m63234k4(cArr2, i15, i3 - i15));
                                i13 = i3;
                            } else {
                                i13 = i15;
                            }
                            while (i13 < i5 && cArr2[i13] <= ' ') {
                                i13++;
                            }
                            c7 = c;
                            c10 = IOUtils.DIR_SEPARATOR_UNIX;
                        }
                        c = c7;
                        if (i13 >= i5 || cArr2[i13] != '/') {
                            z = c;
                        } else {
                            i13++;
                            z = 1;
                        }
                        if (i13 < i5) {
                            i13++;
                        }
                        x1 x1Var = new x1(i7, i13, cArr2, i11, i12, dictionary, z);
                        list.addItem(x1Var);
                        if (!zArr[c]) {
                            zArr[c] = C14113y2.m67432to(x1Var.f45431k4, "body", (short) 4);
                        }
                        if (!x1Var.f45432kk && f45415du.containsKey(x1Var.f45431k4)) {
                            i7 = i13;
                            while (true) {
                                int i16 = i7 + 1;
                                if (i16 >= i5) {
                                    break;
                                }
                                if (cArr2[i7] == '<' && cArr2[i16] == '/') {
                                    int i17 = i7 + 2;
                                    if (x1Var.f45431k4.length() + i17 < i5 && C14113y2.m67360du(C14113y2.m67406k4(cArr2, i17, x1Var.f45431k4.length()), x1Var.f45431k4, (short) 3) == 0) {
                                        int length = x1Var.f45431k4.length() + i17;
                                        while (length < i5 && cArr2[length] <= ' ') {
                                            length++;
                                        }
                                        if (cArr2[length] == '>') {
                                            if (i13 < i7) {
                                                list.addItem(new to(i13, i7));
                                            }
                                            list.addItem(new k4(x1Var.f45431k4));
                                            i6 = length + 1;
                                        }
                                    }
                                }
                                i7 = i16;
                            }
                        } else {
                            i6 = i13;
                        }
                    } else {
                        c = c7;
                        while (true) {
                            if ((c8 == '>' && c9 == '?') || (c8 == '>' && c9 == '/')) {
                                break;
                            }
                            if (i8 >= i5) {
                                throw new PptxReadException("EOF in processing directive.");
                            }
                            c9 = c8;
                            c8 = cArr2[i8];
                            i8++;
                        }
                        i6 = i8;
                    }
                } else {
                    c = c7;
                    i6 = i7 + 3;
                    char c16 = cArr[i8];
                    if (c16 == '[') {
                        int i18 = 1;
                        while (i6 < i5 && i18 > 0) {
                            char c17 = cArr[i6];
                            if (c17 == '[') {
                                i18++;
                            } else if (c17 == ']') {
                                i18--;
                            }
                            i6++;
                        }
                        if (i6 < i5 && cArr[i6] == '>') {
                            i6++;
                        }
                    } else if (c16 == '-' && (c2 = cArr[i6]) == '-') {
                        i7 += 4;
                        char c18 = ' ';
                        char c19 = c2;
                        while (i7 < i5 && (c19 != '-' || c18 != '-')) {
                            int i19 = i7 + 1;
                            char c20 = cArr[i7];
                            i7 = i19;
                            c18 = c19;
                            c19 = c20;
                        }
                        if (i7 < i5) {
                            i7++;
                        }
                    }
                }
                cArr2 = cArr;
                c7 = c;
            }
            i6 = i7;
            cArr2 = cArr;
            c7 = c;
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private IGenericDictionary<String, String> m63239x1(C12804k4 c12804k4) {
        Dictionary dictionary = new Dictionary();
        if (C7019kk.m27469x1(c12804k4, C4944x6.class)) {
            m63238k4((C4944x6) c12804k4, dictionary);
        }
        if (c12804k4.mo22620A_() != null) {
            IEnumerator it = c12804k4.mo22620A_().iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC12772kk interfaceC12772kk = (InterfaceC12772kk) ((InterfaceC12777qq) it.next());
                    dictionary.set_Item(interfaceC12772kk.mo22604c5(), interfaceC12772kk.mo22741kk());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) c12804k4, C1569kk.class);
        if (c1569kk != null) {
            dictionary.set_Item("style", c1569kk.m8445t6().m23824gf());
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo63243k4(C12804k4 c12804k4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo63245k4(String str);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo63246k4(String str, IGenericDictionary<String, String> iGenericDictionary);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo63247k4(String str, String str2);

    /* JADX INFO: renamed from: kk */
    public final void m63248kk(String str) throws Throwable {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        char[] cArr = cArrM67365dy;
        while (true) {
            boolean[] zArr = {false};
            List<kk> listM63233k4 = m63233k4(cArr, 0, cArr.length, zArr);
            if (zArr[0]) {
                m63237k4(listM63233k4, cArr);
                m63240x1(listM63233k4, cArr);
                return;
            } else {
                cArr = new char[cArrM67365dy.length + 13];
                C14113y2.m67409k4("<body>", 0, cArr, 0, 6);
                AbstractC14092to.m67208k4((Object) cArrM67365dy).copyTo(AbstractC14092to.m67208k4((Object) cArr), 6);
                C14113y2.m67409k4("</body>", 0, cArr, 6 + cArrM67365dy.length, 7);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo63249x1(String str);

    /* JADX INFO: renamed from: k4 */
    private String m63234k4(char[] cArr, int i, int i2) {
        return m63235k4(cArr, i, i2, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m63240x1(List<kk> list, char[] cArr) throws Throwable {
        Throwable th;
        char[] cArr2;
        List list2 = new List();
        h4 h4Var = new h4();
        List.Enumerator<kk> it = list.iterator();
        while (it.hasNext()) {
            try {
                kk next = it.next();
                x1 x1Var = (x1) C7019kk.m27452k4((Object) next, x1.class);
                if (x1Var != null) {
                    try {
                        if (!h4Var.f45426to) {
                            mo63246k4(x1Var.f45431k4, x1Var.f45433x1);
                        }
                        list2.addItem(h4Var);
                        h4 h4Var2 = new h4(h4Var);
                        int iM27428k4 = f45416h4.m27428k4(x1Var.f45431k4);
                        if (iM27428k4 == 0) {
                            h4Var2.f45424k4 = true;
                        } else if (iM27428k4 == 1 || iM27428k4 == 2) {
                            h4Var2.f45424k4 = true;
                            h4Var2.f45427x1 = true;
                            h4Var2.f45425kk = true;
                            h4Var2.f45423du = "style";
                        } else if (iM27428k4 == 3) {
                            h4Var2.f45424k4 = true;
                            h4Var2.f45427x1 = true;
                        } else if (iM27428k4 == 4) {
                            h4Var2.f45426to = true;
                            h4Var2.f45425kk = true;
                        } else if (iM27428k4 == 5) {
                            h4Var2.f45425kk = false;
                        }
                        String[] strArr = {null};
                        boolean zTryGetValue = x1Var.f45433x1.tryGetValue("style", strArr);
                        String str = strArr[0];
                        if (zTryGetValue) {
                            mo63247k4("style", str);
                        }
                        if (h4Var2.f45426to || h4Var2.f45424k4) {
                            this.f45420k4 = false;
                        }
                        cArr2 = cArr;
                        h4Var = h4Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            throw th;
                        }
                        it.dispose();
                        throw th;
                    }
                } else {
                    k4 k4Var = (k4) C7019kk.m27452k4((Object) next, k4.class);
                    if (k4Var != null) {
                        h4Var = (h4) list2.get_Item(list2.size() - 1);
                        if (!h4Var.f45426to) {
                            mo63249x1(k4Var.f45428k4);
                        }
                        list2.removeAt(list2.size() - 1);
                    } else {
                        to toVar = (to) C7019kk.m27452k4((Object) next, to.class);
                        if (toVar != null && !h4Var.f45426to) {
                            int i = toVar.f45430to;
                            cArr2 = cArr;
                            try {
                                String strM63235k4 = m63235k4(cArr2, i, toVar.f45429du - i, h4Var.f45424k4, h4Var.f45427x1);
                                if (strM63235k4.length() > 0) {
                                    if (h4Var.f45425kk) {
                                        mo63250x1(strM63235k4, h4Var.f45423du);
                                    } else {
                                        mo63245k4(strM63235k4);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                }
                            }
                        }
                    }
                    cArr2 = cArr;
                }
                cArr = cArr2;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m63235k4(char[] cArr, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        char c;
        int i5;
        int i6;
        C6765kp c6765kp = new C6765kp(i2);
        int i7 = i + i2;
        int i8 = i;
        while (i8 < i7) {
            int i9 = i8 + 1;
            char c2 = cArr[i8];
            if (!z2 && c2 == '&') {
                if (cArr[i9] == '#') {
                    int i10 = i8 + 2;
                    if (i10 >= i7 || !((c = cArr[i10]) == 'x' || c == 'X')) {
                        int i11 = 0;
                        while (i10 < i7) {
                            char c3 = cArr[i10];
                            if (c3 < '0' || c3 > '9') {
                                break;
                            }
                            i11 = (i11 * 10) + (c3 - '0');
                            i10++;
                        }
                        int i12 = i10;
                        i3 = i11;
                        i4 = i12;
                    } else {
                        i4 = i8 + 3;
                        i3 = 0;
                        while (i4 < i7) {
                            char c4 = cArr[i4];
                            if (c4 >= '0' && c4 <= '9') {
                                i5 = i3 * 16;
                                i6 = c4 - '0';
                            } else if (c4 >= 'A' && c4 <= 'F') {
                                i5 = i3 * 16;
                                i6 = c4 - '7';
                            } else {
                                if (c4 < 'a' || c4 > 'f') {
                                    break;
                                }
                                i5 = i3 * 16;
                                i6 = c4 - 'W';
                            }
                            i3 = i6 + i5;
                            i4++;
                        }
                    }
                    if (cArr[i4] == ';') {
                        c2 = (char) i3;
                        i9 = i4 + 1;
                    }
                } else {
                    int i13 = i9;
                    while (i13 < i7) {
                        char c5 = cArr[i13];
                        if (c5 <= ' ' || c5 == '&' || c5 == ';') {
                            break;
                        }
                        i13++;
                    }
                    if (i13 < i7 && cArr[i13] == ';') {
                        int i14 = i13 + 1;
                        Character[] chArr = {0};
                        boolean zTryGetValue = f45418to.tryGetValue(C14113y2.m67406k4(cArr, i9, (i14 - i9) - 1), chArr);
                        char cCharValue = chArr[0].charValue();
                        if (zTryGetValue) {
                            i9 = i14;
                            c2 = cCharValue;
                        }
                    }
                }
            }
            i8 = i9;
            if (c2 > ' ') {
                c6765kp.m26780k4(c2);
                this.f45420k4 = false;
            } else if (z) {
                c6765kp.m26780k4(c2);
            } else if (!this.f45420k4) {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                this.f45420k4 = true;
            }
        }
        return c6765kp.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private void m63241x1(AbstractC5535bv abstractC5535bv) {
        IGenericEnumerator<InterfaceC12777qq> it;
        if (C7019kk.m27469x1(abstractC5535bv, C12804k4.class)) {
            C12804k4 c12804k4 = (C12804k4) abstractC5535bv;
            mo63246k4(c12804k4.mo22604c5(), m63239x1(c12804k4));
            if ("math".equals(c12804k4.mo22604c5())) {
                mo63243k4(c12804k4);
            } else {
                it = abstractC5535bv.mo22671yd().iterator();
                while (it.hasNext()) {
                    try {
                        m63241x1((AbstractC5535bv) it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
            mo63249x1(c12804k4.mo22604c5());
            return;
        }
        if (C7019kk.m27469x1(abstractC5535bv, InterfaceC12784v4.class) || C7019kk.m27469x1(abstractC5535bv, InterfaceC12765du.class)) {
            mo63245k4(C6964k4.m27221k4(((InterfaceC12768h4) abstractC5535bv).mo22687k4()));
            return;
        }
        if (C7019kk.m27469x1(abstractC5535bv, InterfaceC12775m9.class)) {
            return;
        }
        it = abstractC5535bv.mo22671yd().iterator();
        while (it.hasNext()) {
            try {
                m63241x1((AbstractC5535bv) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63236k4(List<kk> list, int i, kk kkVar, List<du> list2, int i2) {
        list.insertItem(i, kkVar);
        while (i2 < list2.size()) {
            du duVar = list2.get_Item(i2);
            int i3 = duVar.f45422x1;
            if (i3 >= i) {
                duVar.f45422x1 = i3 + 1;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo63250x1(String str, String str2) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63237k4(List<kk> list, char[] cArr) {
        kk kkVar;
        int size;
        List list2 = new List();
        List list3 = new List();
        List list4 = new List();
        for (int i = 0; i < list.size(); i++) {
            if (C7019kk.m27469x1(list.get_Item(i), x1.class)) {
                x1 x1Var = (x1) list.get_Item(i);
                list3.addItem(x1Var);
                if (x1Var.f45432kk || f45419x1.containsKey(x1Var.f45431k4)) {
                    list3.addItem(new k4(x1Var.f45431k4));
                } else {
                    list2.addItem(new du(x1Var, list3.size() - 1));
                }
            } else if (C7019kk.m27469x1(list.get_Item(i), k4.class)) {
                k4 k4Var = (k4) list.get_Item(i);
                if (!f45419x1.containsKey(k4Var.f45428k4)) {
                    if (list2.size() > 0 && C14113y2.m67363du(((du) OooO0O0.OooO00o(list2, 1)).f45421k4.f45431k4, k4Var.f45428k4)) {
                        size = list2.size() - 1;
                    } else if (f45417kk.containsKey(k4Var.f45428k4)) {
                        size = list2.size() - 1;
                        while (size >= 0 && !C14113y2.m67363du(((du) list2.get_Item(size)).f45421k4.f45431k4, k4Var.f45428k4)) {
                            size--;
                        }
                        if (size >= 0) {
                            x1 x1Var2 = ((du) list2.get_Item(size)).f45421k4;
                            int i2 = size + 1;
                            while (i2 < list2.size()) {
                                int i3 = ((du) list2.get_Item(i2)).f45422x1;
                                m63236k4((List<kk>) list3, i3, k4Var, (List<du>) list2, i2);
                                i2++;
                                m63236k4((List<kk>) list3, i3 + 2, x1Var2, (List<du>) list2, i2);
                            }
                        }
                    } else {
                        int size2 = list2.size() - 1;
                        while (size2 >= 0 && !C14113y2.m67363du(((du) list2.get_Item(size2)).f45421k4.f45431k4, k4Var.f45428k4)) {
                            size2--;
                        }
                        if (size2 >= 0) {
                            x1 x1Var3 = ((du) list2.get_Item(size2)).f45421k4;
                            for (int size3 = list2.size() - 1; size3 > size2; size3--) {
                                du duVar = (du) list2.get_Item(size3);
                                if (f45417kk.containsKey(duVar.f45421k4.f45431k4)) {
                                    list4.addItem(duVar.f45421k4);
                                } else {
                                    list2.removeAt(size3);
                                }
                                list3.addItem(new k4(duVar.f45421k4.f45431k4));
                            }
                            list2.removeAt(size2);
                            list3.addItem(k4Var);
                            list3.addRange(list4);
                            list4.clear();
                        }
                    }
                    list2.removeAt(size);
                    kkVar = k4Var;
                    list3.addItem(kkVar);
                }
            } else if (C7019kk.m27469x1(list.get_Item(i), to.class)) {
                kkVar = list.get_Item(i);
                list3.addItem(kkVar);
            }
        }
        for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
            list3.addItem(new k4(((du) list2.get_Item(size4)).f45421k4.f45431k4));
        }
        int i4 = 1;
        while (i4 < list3.size()) {
            if (C7019kk.m27469x1(list3.get_Item(i4), k4.class)) {
                k4 k4Var2 = (k4) list3.get_Item(i4);
                if (f45417kk.containsKey(k4Var2.f45428k4)) {
                    int i5 = i4 - 1;
                    if (C7019kk.m27469x1(list3.get_Item(i5), x1.class) && C14113y2.m67363du(((x1) list3.get_Item(i5)).f45431k4, k4Var2.f45428k4)) {
                        list3.removeAt(i5);
                        list3.removeAt(i5);
                        i4 -= 2;
                    }
                }
            }
            i4++;
        }
        list.clear();
        list.setCapacity(list3.size());
        list.addRange(list3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m63238k4(C4944x6 c4944x6, IGenericDictionary<String, String> iGenericDictionary) {
        iGenericDictionary.set_Item("color", c4944x6.m20749qw());
        iGenericDictionary.set_Item(OptionalModuleUtils.FACE, c4944x6.m20750tq());
        iGenericDictionary.set_Item("size", c4944x6.m20747j2());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63242k4(AbstractC5535bv abstractC5535bv) {
        boolean zM67432to = C14113y2.m67432to(abstractC5535bv.mo22604c5(), "body", (short) 3);
        if (!zM67432to) {
            mo63246k4("body", new Dictionary());
        }
        m63241x1(abstractC5535bv);
        if (zM67432to) {
            return;
        }
        mo63249x1("body");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63244k4(C12804k4 c12804k4, IGenericList<InterfaceC12777qq> iGenericList) {
        boolean zM67432to = C14113y2.m67432to(c12804k4.mo22604c5(), "body", (short) 3);
        if (!zM67432to) {
            mo63246k4("body", new Dictionary());
        }
        mo63246k4(c12804k4.mo22604c5(), m63239x1(c12804k4));
        IGenericEnumerator<InterfaceC12777qq> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                m63241x1((AbstractC5535bv) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        mo63249x1(c12804k4.mo22604c5());
        if (zM67432to) {
            return;
        }
        mo63249x1("body");
    }
}
