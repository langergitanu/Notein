package com.aspose.slides.internal.p384rq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.rq.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10051x1 implements IGenericEnumerable<C10047k4> {

    /* JADX INFO: renamed from: k4 */
    public static final C10051x1 f36230k4 = new C10051x1();

    /* JADX INFO: renamed from: kk */
    private Dictionary<Character, k4> f36231kk;

    /* JADX INFO: renamed from: x1 */
    private final IGenericList<C10047k4> f36232x1 = m49670x1();

    /* JADX INFO: renamed from: com.aspose.slides.internal.rq.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private boolean f36233du;

        /* JADX INFO: renamed from: h4 */
        private C10047k4 f36234h4;

        /* JADX INFO: renamed from: k4 */
        private char f36235k4;

        /* JADX INFO: renamed from: kk */
        private IGenericList<C10047k4> f36236kk = new List();

        /* JADX INFO: renamed from: m9 */
        private boolean f36237m9;

        /* JADX INFO: renamed from: to */
        private Dictionary<Character, k4> f36238to;

        /* JADX INFO: renamed from: x1 */
        private int f36239x1;

        public k4(char c, int i) {
            this.f36235k4 = c;
            this.f36239x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public static Dictionary<Character, k4> m49673k4(IGenericList<C10047k4> iGenericList, int i, boolean[] zArr, C10047k4[] c10047k4Arr) {
            k4 k4Var;
            Dictionary<Character, k4> dictionary = new Dictionary<>();
            IGenericEnumerator<C10047k4> it = iGenericList.iterator();
            while (it.hasNext()) {
                try {
                    C10047k4 next = it.next();
                    if (i >= next.m49660k4().length()) {
                        zArr[0] = true;
                        c10047k4Arr[0] = next;
                        return dictionary;
                    }
                    char cCharAt = next.m49660k4().charAt(i);
                    if (dictionary.containsKey(Character.valueOf(cCharAt))) {
                        k4Var = dictionary.get_Item(Character.valueOf(cCharAt));
                    } else {
                        k4Var = new k4(cCharAt, i);
                        dictionary.addItem(Character.valueOf(cCharAt), k4Var);
                    }
                    k4Var.m49675k4(next);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            zArr[0] = false;
            c10047k4Arr[0] = null;
            return dictionary;
        }

        /* JADX INFO: renamed from: x1 */
        private void m49674x1() {
            if (this.f36237m9) {
                return;
            }
            boolean[] zArr = {this.f36233du};
            C10047k4[] c10047k4Arr = {this.f36234h4};
            this.f36238to = m49673k4(this.f36236kk, this.f36239x1 + 1, zArr, c10047k4Arr);
            this.f36233du = zArr[0];
            this.f36234h4 = c10047k4Arr[0];
            this.f36237m9 = true;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m49675k4(C10047k4 c10047k4) {
            this.f36236kk.addItem(c10047k4);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m49676k4() {
            if (!this.f36237m9) {
                m49674x1();
            }
            return this.f36233du;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m49677k4(x1 x1Var, C10047k4[] c10047k4Arr) {
            if (!this.f36237m9) {
                m49674x1();
            }
            if (this.f36233du) {
                c10047k4Arr[0] = this.f36234h4;
                return true;
            }
            c10047k4Arr[0] = null;
            if (!this.f36238to.containsKey(x1Var.next())) {
                return false;
            }
            k4 k4Var = this.f36238to.get_Item(x1Var.next());
            if (k4Var.m49676k4()) {
                c10047k4Arr[0] = k4Var.f36234h4;
                return true;
            }
            if (x1Var.hasNext()) {
                return k4Var.m49677k4(x1Var, c10047k4Arr);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rq.x1$x1 */
    public static class x1 implements IGenericEnumerator<Character> {

        /* JADX INFO: renamed from: k4 */
        private String f36240k4;

        /* JADX INFO: renamed from: kk */
        private int f36241kk;

        /* JADX INFO: renamed from: x1 */
        private int f36242x1;

        public x1(String str, int i) {
            this.f36240k4 = str;
            this.f36241kk = i;
            this.f36242x1 = i;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f36242x1 + 1 >= this.f36240k4.length()) {
                return false;
            }
            this.f36242x1++;
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final Character next() {
            return Character.valueOf(this.f36240k4.charAt(this.f36242x1));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f36242x1 = this.f36241kk;
        }
    }

    private C10051x1() {
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericList<C10047k4> m49670x1() {
        List list = new List();
        list.addItem(new C10047k4("nbsp", "&#160;"));
        list.addItem(new C10047k4("iexcl", "&#161;"));
        list.addItem(new C10047k4("cent", "&#162;"));
        list.addItem(new C10047k4("pound", "&#163;"));
        list.addItem(new C10047k4("curren", "&#164;"));
        list.addItem(new C10047k4("yen", "&#165;"));
        list.addItem(new C10047k4("brvbar", "&#166;"));
        list.addItem(new C10047k4("sect", "&#167;"));
        list.addItem(new C10047k4("uml", "&#168;"));
        list.addItem(new C10047k4("copy", "&#169;"));
        list.addItem(new C10047k4("ordf", "&#170;"));
        list.addItem(new C10047k4("laquo", "&#171;"));
        list.addItem(new C10047k4("not", "&#172;"));
        list.addItem(new C10047k4("shy", "&#173;"));
        list.addItem(new C10047k4("reg", "&#174;"));
        list.addItem(new C10047k4("macr", "&#175;"));
        list.addItem(new C10047k4("deg", "&#176;"));
        list.addItem(new C10047k4("plusmn", "&#177;"));
        list.addItem(new C10047k4("sup2", "&#178;"));
        list.addItem(new C10047k4("sup3", "&#179;"));
        list.addItem(new C10047k4("acute", "&#180;"));
        list.addItem(new C10047k4("micro", "&#181;"));
        list.addItem(new C10047k4("para", "&#182;"));
        list.addItem(new C10047k4("middot", "&#183;"));
        list.addItem(new C10047k4("cedil", "&#184;"));
        list.addItem(new C10047k4("sup1", "&#185;"));
        list.addItem(new C10047k4("ordm", "&#186;"));
        list.addItem(new C10047k4("raquo", "&#187;"));
        list.addItem(new C10047k4("frac14", "&#188;"));
        list.addItem(new C10047k4("frac12", "&#189;"));
        list.addItem(new C10047k4("frac34", "&#190;"));
        list.addItem(new C10047k4("iquest", "&#191;"));
        list.addItem(new C10047k4("Agrave", "&#192;"));
        list.addItem(new C10047k4("Aacute", "&#193;"));
        list.addItem(new C10047k4("Acirc", "&#194;"));
        list.addItem(new C10047k4("Atilde", "&#195;"));
        list.addItem(new C10047k4("Auml", "&#196;"));
        list.addItem(new C10047k4("Aring", "&#197;"));
        list.addItem(new C10047k4("AElig", "&#198;"));
        list.addItem(new C10047k4("Ccedil", "&#199;"));
        list.addItem(new C10047k4("Egrave", "&#200;"));
        list.addItem(new C10047k4("Eacute", "&#201;"));
        list.addItem(new C10047k4("Ecirc", "&#202;"));
        list.addItem(new C10047k4("Euml", "&#203;"));
        list.addItem(new C10047k4("Igrave", "&#204;"));
        list.addItem(new C10047k4("Iacute", "&#205;"));
        list.addItem(new C10047k4("Icirc", "&#206;"));
        list.addItem(new C10047k4("Iuml", "&#207;"));
        list.addItem(new C10047k4("ETH", "&#208;"));
        list.addItem(new C10047k4("Ntilde", "&#209;"));
        list.addItem(new C10047k4("Ograve", "&#210;"));
        list.addItem(new C10047k4("Oacute", "&#211;"));
        list.addItem(new C10047k4("Ocirc", "&#212;"));
        list.addItem(new C10047k4("Otilde", "&#213;"));
        list.addItem(new C10047k4("Ouml", "&#214;"));
        list.addItem(new C10047k4("times", "&#215;"));
        list.addItem(new C10047k4("Oslash", "&#216;"));
        list.addItem(new C10047k4("Ugrave", "&#217;"));
        list.addItem(new C10047k4("Uacute", "&#218;"));
        list.addItem(new C10047k4("Ucirc", "&#219;"));
        list.addItem(new C10047k4("Uuml", "&#220;"));
        list.addItem(new C10047k4("Yacute", "&#221;"));
        list.addItem(new C10047k4("THORN", "&#222;"));
        list.addItem(new C10047k4("szlig", "&#223;"));
        list.addItem(new C10047k4("agrave", "&#224;"));
        list.addItem(new C10047k4("aacute", "&#225;"));
        list.addItem(new C10047k4("acirc", "&#226;"));
        list.addItem(new C10047k4("atilde", "&#227;"));
        list.addItem(new C10047k4("auml", "&#228;"));
        list.addItem(new C10047k4("aring", "&#229;"));
        list.addItem(new C10047k4("aelig", "&#230;"));
        list.addItem(new C10047k4("ccedil", "&#231;"));
        list.addItem(new C10047k4("egrave", "&#232;"));
        list.addItem(new C10047k4("eacute", "&#233;"));
        list.addItem(new C10047k4("ecirc", "&#234;"));
        list.addItem(new C10047k4("euml", "&#235;"));
        list.addItem(new C10047k4("igrave", "&#236;"));
        list.addItem(new C10047k4("iacute", "&#237;"));
        list.addItem(new C10047k4("icirc", "&#238;"));
        list.addItem(new C10047k4("iuml", "&#239;"));
        list.addItem(new C10047k4("eth", "&#240;"));
        list.addItem(new C10047k4("ntilde", "&#241;"));
        list.addItem(new C10047k4("ograve", "&#242;"));
        list.addItem(new C10047k4("oacute", "&#243;"));
        list.addItem(new C10047k4("ocirc", "&#244;"));
        list.addItem(new C10047k4("otilde", "&#245;"));
        list.addItem(new C10047k4("ouml", "&#246;"));
        list.addItem(new C10047k4("divide", "&#247;"));
        list.addItem(new C10047k4("oslash", "&#248;"));
        list.addItem(new C10047k4("ugrave", "&#249;"));
        list.addItem(new C10047k4("uacute", "&#250;"));
        list.addItem(new C10047k4("ucirc", "&#251;"));
        list.addItem(new C10047k4("uuml", "&#252;"));
        list.addItem(new C10047k4("yacute", "&#253;"));
        list.addItem(new C10047k4("thorn", "&#254;"));
        list.addItem(new C10047k4("yuml", "&#255;"));
        list.addItem(new C10047k4("fnof", "&#402;"));
        list.addItem(new C10047k4("Alpha", "&#913;"));
        list.addItem(new C10047k4("Beta", "&#914;"));
        list.addItem(new C10047k4("Gamma", "&#915;"));
        list.addItem(new C10047k4("Delta", "&#916;"));
        list.addItem(new C10047k4("Epsilon", "&#917;"));
        list.addItem(new C10047k4("Zeta", "&#918;"));
        list.addItem(new C10047k4("Eta", "&#919;"));
        list.addItem(new C10047k4("Theta", "&#920;"));
        list.addItem(new C10047k4("Iota", "&#921;"));
        list.addItem(new C10047k4("Kappa", "&#922;"));
        list.addItem(new C10047k4("Lambda", "&#923;"));
        list.addItem(new C10047k4("Mu", "&#924;"));
        list.addItem(new C10047k4("Nu", "&#925;"));
        list.addItem(new C10047k4("Xi", "&#926;"));
        list.addItem(new C10047k4("Omicron", "&#927;"));
        list.addItem(new C10047k4("Pi", "&#928;"));
        list.addItem(new C10047k4("Rho", "&#929;"));
        list.addItem(new C10047k4("Sigma", "&#931;"));
        list.addItem(new C10047k4("Tau", "&#932;"));
        list.addItem(new C10047k4("Upsilon", "&#933;"));
        list.addItem(new C10047k4("Phi", "&#934;"));
        list.addItem(new C10047k4("Chi", "&#935;"));
        list.addItem(new C10047k4("Psi", "&#936;"));
        list.addItem(new C10047k4("Omega", "&#937;"));
        list.addItem(new C10047k4("alpha", "&#945;"));
        list.addItem(new C10047k4("beta", "&#946;"));
        list.addItem(new C10047k4("gamma", "&#947;"));
        list.addItem(new C10047k4("delta", "&#948;"));
        list.addItem(new C10047k4("epsilon", "&#949;"));
        list.addItem(new C10047k4("zeta", "&#950;"));
        list.addItem(new C10047k4("eta", "&#951;"));
        list.addItem(new C10047k4("theta", "&#952;"));
        list.addItem(new C10047k4("iota", "&#953;"));
        list.addItem(new C10047k4("kappa", "&#954;"));
        list.addItem(new C10047k4("lambda", "&#955;"));
        list.addItem(new C10047k4("mu", "&#956;"));
        list.addItem(new C10047k4("nu", "&#957;"));
        list.addItem(new C10047k4("xi", "&#958;"));
        list.addItem(new C10047k4("omicron", "&#959;"));
        list.addItem(new C10047k4(ContextChain.TAG_PRODUCT_AND_INFRA, "&#960;"));
        list.addItem(new C10047k4("rho", "&#961;"));
        list.addItem(new C10047k4("sigmaf", "&#962;"));
        list.addItem(new C10047k4("sigma", "&#963;"));
        list.addItem(new C10047k4("tau", "&#964;"));
        list.addItem(new C10047k4("upsilon", "&#965;"));
        list.addItem(new C10047k4("phi", "&#966;"));
        list.addItem(new C10047k4("chi", "&#967;"));
        list.addItem(new C10047k4("psi", "&#968;"));
        list.addItem(new C10047k4("omega", "&#969;"));
        list.addItem(new C10047k4("thetasym", "&#977;"));
        list.addItem(new C10047k4("upsih", "&#978;"));
        list.addItem(new C10047k4("piv", "&#982;"));
        list.addItem(new C10047k4("bull", "&#8226;"));
        list.addItem(new C10047k4("hellip", "&#8230;"));
        list.addItem(new C10047k4("prime", "&#8242;"));
        list.addItem(new C10047k4("Prime", "&#8243;"));
        list.addItem(new C10047k4("oline", "&#8254;"));
        list.addItem(new C10047k4("frasl", "&#8260;"));
        list.addItem(new C10047k4("weierp", "&#8472;"));
        list.addItem(new C10047k4("image", "&#8465;"));
        list.addItem(new C10047k4("real", "&#8476;"));
        list.addItem(new C10047k4("trade", "&#8482;"));
        list.addItem(new C10047k4("alefsym", "&#8501;"));
        list.addItem(new C10047k4("larr", "&#8592;"));
        list.addItem(new C10047k4("uarr", "&#8593;"));
        list.addItem(new C10047k4("rarr", "&#8594;"));
        list.addItem(new C10047k4("darr", "&#8595;"));
        list.addItem(new C10047k4("harr", "&#8596;"));
        list.addItem(new C10047k4("crarr", "&#8629;"));
        list.addItem(new C10047k4("lArr", "&#8656;"));
        list.addItem(new C10047k4("uArr", "&#8657;"));
        list.addItem(new C10047k4("rArr", "&#8658;"));
        list.addItem(new C10047k4("dArr", "&#8659;"));
        list.addItem(new C10047k4("hArr", "&#8660;"));
        list.addItem(new C10047k4("forall", "&#8704;"));
        list.addItem(new C10047k4("part", "&#8706;"));
        list.addItem(new C10047k4("exist", "&#8707;"));
        list.addItem(new C10047k4("empty", "&#8709;"));
        list.addItem(new C10047k4("nabla", "&#8711;"));
        list.addItem(new C10047k4("isin", "&#8712;"));
        list.addItem(new C10047k4("notin", "&#8713;"));
        list.addItem(new C10047k4("ni", "&#8715;"));
        list.addItem(new C10047k4("prod", "&#8719;"));
        list.addItem(new C10047k4("sum", "&#8721;"));
        list.addItem(new C10047k4("minus", "&#8722;"));
        list.addItem(new C10047k4("lowast", "&#8727;"));
        list.addItem(new C10047k4("radic", "&#8730;"));
        list.addItem(new C10047k4("prop", "&#8733;"));
        list.addItem(new C10047k4("infin", "&#8734;"));
        list.addItem(new C10047k4("ang", "&#8736;"));
        list.addItem(new C10047k4("and", "&#8743;"));
        list.addItem(new C10047k4("or", "&#8744;"));
        list.addItem(new C10047k4("cap", "&#8745;"));
        list.addItem(new C10047k4("cup", "&#8746;"));
        list.addItem(new C10047k4("int", "&#8747;"));
        list.addItem(new C10047k4("there4", "&#8756;"));
        list.addItem(new C10047k4("sim", "&#8764;"));
        list.addItem(new C10047k4("cong", "&#8773;"));
        list.addItem(new C10047k4("asymp", "&#8776;"));
        list.addItem(new C10047k4("ne", "&#8800;"));
        list.addItem(new C10047k4("equiv", "&#8801;"));
        list.addItem(new C10047k4("le", "&#8804;"));
        list.addItem(new C10047k4("ge", "&#8805;"));
        list.addItem(new C10047k4("sub", "&#8834;"));
        list.addItem(new C10047k4("sup", "&#8835;"));
        list.addItem(new C10047k4("nsub", "&#8836;"));
        list.addItem(new C10047k4("sube", "&#8838;"));
        list.addItem(new C10047k4("supe", "&#8839;"));
        list.addItem(new C10047k4("oplus", "&#8853;"));
        list.addItem(new C10047k4("otimes", "&#8855;"));
        list.addItem(new C10047k4("perp", "&#8869;"));
        list.addItem(new C10047k4("sdot", "&#8901;"));
        list.addItem(new C10047k4("lceil", "&#8968;"));
        list.addItem(new C10047k4("rceil", "&#8969;"));
        list.addItem(new C10047k4("lfloor", "&#8970;"));
        list.addItem(new C10047k4("rfloor", "&#8971;"));
        list.addItem(new C10047k4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "&#9001;"));
        list.addItem(new C10047k4("rang", "&#9002;"));
        list.addItem(new C10047k4("loz", "&#9674;"));
        list.addItem(new C10047k4("spades", "&#9824;"));
        list.addItem(new C10047k4("clubs", "&#9827;"));
        list.addItem(new C10047k4("hearts", "&#9829;"));
        list.addItem(new C10047k4("diams", "&#9830;"));
        list.addItem(new C10047k4("quot", "&#34;"));
        list.addItem(new C10047k4("amp", "&#38;"));
        list.addItem(new C10047k4(TranslateLanguage.LITHUANIAN, "&#60;"));
        list.addItem(new C10047k4("gt", "&#62;"));
        list.addItem(new C10047k4("OElig", "&#338;"));
        list.addItem(new C10047k4("oelig", "&#339;"));
        list.addItem(new C10047k4("Scaron", "&#352;"));
        list.addItem(new C10047k4("scaron", "&#353;"));
        list.addItem(new C10047k4("Yuml", "&#376;"));
        list.addItem(new C10047k4("circ", "&#710;"));
        list.addItem(new C10047k4("tilde", "&#732;"));
        list.addItem(new C10047k4("ensp", "&#8194;"));
        list.addItem(new C10047k4("emsp", "&#8195;"));
        list.addItem(new C10047k4("thinsp", "&#8201;"));
        list.addItem(new C10047k4("zwnj", "&#8204;"));
        list.addItem(new C10047k4("zwj", "&#8205;"));
        list.addItem(new C10047k4("lrm", "&#8206;"));
        list.addItem(new C10047k4("rlm", "&#8207;"));
        list.addItem(new C10047k4("ndash", "&#8211;"));
        list.addItem(new C10047k4("mdash", "&#8212;"));
        list.addItem(new C10047k4("lsquo", "&#8216;"));
        list.addItem(new C10047k4("rsquo", "&#8217;"));
        list.addItem(new C10047k4("sbquo", "&#8218;"));
        list.addItem(new C10047k4("ldquo", "&#8220;"));
        list.addItem(new C10047k4("rdquo", "&#8221;"));
        list.addItem(new C10047k4("bdquo", "&#8222;"));
        list.addItem(new C10047k4("dagger", "&#8224;"));
        list.addItem(new C10047k4("Dagger", "&#8225;"));
        list.addItem(new C10047k4("permil", "&#8240;"));
        list.addItem(new C10047k4("lsaquo", "&#8249;"));
        list.addItem(new C10047k4("rsaquo", "&#8250;"));
        list.addItem(new C10047k4("euro", "&#8364;"));
        return list;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C10047k4> iterator() {
        return this.f36232x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m49671k4() {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<C10047k4> it = iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(it.next().m49661x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49672k4(String str, int i, C10047k4[] c10047k4Arr) {
        if (this.f36231kk == null) {
            this.f36231kk = k4.m49673k4(this.f36232x1, 0, new boolean[]{false}, c10047k4Arr);
        }
        c10047k4Arr[0] = null;
        x1 x1Var = new x1(str, i);
        if (!x1Var.hasNext()) {
            return false;
        }
        if (!this.f36231kk.containsKey(x1Var.next())) {
            return x1Var.next().charValue() == '#';
        }
        k4 k4Var = this.f36231kk.get_Item(x1Var.next());
        if (x1Var.hasNext()) {
            return k4Var.m49677k4(x1Var, c10047k4Arr);
        }
        return false;
    }
}
