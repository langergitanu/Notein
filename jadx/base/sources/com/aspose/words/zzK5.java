package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzK5 {
    private zzY7Y zzZjs;
    private com.aspose.words.internal.zzZYT<zzZII> zzZjt;
    private zzY3Z zzZju;
    private int zzZjv;
    private boolean zzZr1;
    private int zzZr3;

    public zzK5(int i, int i2, boolean z) {
        this.zzZr3 = i;
        this.zzZjv = i2;
        this.zzZr1 = z;
    }

    private zzZUY zzO(zzZBM zzzbm) {
        zzZUY zzzuy = (zzZUY) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzZjt, zzzbm.zzZTQ());
        return zzzuy != null ? zzzuy : this.zzZju;
    }

    private void zzZTo() {
        if (this.zzZjt != null) {
            return;
        }
        com.aspose.words.internal.zzZYT<zzZII> zzzyt = new com.aspose.words.internal.zzZYT<>(false);
        this.zzZjt = zzzyt;
        zzzyt.zzB("a", new zzZKF());
        this.zzZjt.zzB("abbr", new zzZKE());
        this.zzZjt.zzB("address", new zzZKC());
        this.zzZjt.zzB("article", new zzZKB());
        this.zzZjt.zzB("aside", new zzZKA());
        this.zzZjt.zzB("applet", new zzZID());
        this.zzZjt.zzB("b", new zzZK6());
        this.zzZjt.zzB("big", new zzZK2());
        this.zzZjt.zzB("bdo", new zzZK4());
        this.zzZjt.zzB("blockquote", new zzZJW(this.zzZr1));
        this.zzZjt.zzB("body", new zzZJV());
        this.zzZjt.zzB("br", new zzZK5());
        this.zzZjt.zzB("caption", new zzZJR());
        this.zzZjt.zzB("center", new zzZJO());
        this.zzZjt.zzB("cite", new zzZJK());
        this.zzZjt.zzB("code", new zzZJJ());
        this.zzZjt.zzB("col", new zzZJH());
        this.zzZjt.zzB("colgroup", new zzZJF());
        this.zzZjt.zzB("del", new zzZIY());
        this.zzZjt.zzB("dfn", new zzZIW());
        this.zzZjt.zzB("dir", new zzZIV());
        this.zzZjt.zzB("div", new zzZIU());
        this.zzZjt.zzB("dd", new zzZJ0());
        this.zzZjt.zzB("dl", new zzZIT());
        this.zzZjt.zzB("dt", new zzZIK());
        this.zzZjt.zzB("em", new zzZIE());
        this.zzZjt.zzB("embed", new zzZID());
        this.zzZjt.zzB("figcaption", new zzZI2());
        this.zzZjt.zzB("figure", new zzZI1());
        this.zzZjt.zzB("font", new zzZHV());
        this.zzZjt.zzB("footer", new zzZHO());
        this.zzZjt.zzB("form", new zzZHL(this.zzZr3));
        this.zzZjt.zzB("h1", new zzZHG());
        this.zzZjt.zzB("h2", new zzZHF());
        this.zzZjt.zzB("h3", new zzZHE());
        this.zzZjt.zzB("h4", new zzZHD());
        this.zzZjt.zzB("h5", new zzZHC());
        this.zzZjt.zzB("h6", new zzZHB());
        this.zzZjt.zzB("header", new zzZH9());
        this.zzZjt.zzB("hgroup", new zzZH8());
        this.zzZjt.zzB(TranslateLanguage.CROATIAN, new zzZHA());
        this.zzZjt.zzB("html", new zzZH7());
        this.zzZjt.zzB(ContextChain.TAG_INFRA, new zzZH3());
        this.zzZjt.zzB("iframe", new zzZH1());
        this.zzZjt.zzB("img", new zzZGX(this.zzZr3));
        this.zzZjt.zzB("input", new zzZGW(this.zzZr3));
        this.zzZjt.zzB("ins", new zzZGV());
        this.zzZjt.zzB("kbd", new zzZGU());
        this.zzZjt.zzB("legend", new zzZGS());
        this.zzZjt.zzB("li", new zzZGT());
        this.zzZjt.zzB("listing", new zzZGG());
        this.zzZjt.zzB("mark", new zzZGE());
        this.zzZjt.zzB("marquee", new zzZGD());
        this.zzZjt.zzB("menu", new zzZGC());
        this.zzZjt.zzB("nav", new zzZG7());
        this.zzZjt.zzB("object", new zzZGX(this.zzZr3));
        this.zzZjt.zzB("ol", new zzZFZ());
        this.zzZjt.zzB(ContextChain.TAG_PRODUCT, new zzZFU());
        this.zzZjt.zzB("plaintext", new zzZFN());
        this.zzZjt.zzB("pre", new zzZFM());
        this.zzZjt.zzB("s", new zzZF9());
        this.zzZjt.zzB("samp", new zzZF8());
        this.zzZjt.zzB("section", new zzZF7());
        this.zzZjt.zzB("select", new zzZF6());
        this.zzZjt.zzB("small", new zzZF2());
        this.zzZjt.zzB("strike", new zzZEX());
        this.zzZjt.zzB("strong", new zzZEW());
        this.zzZjt.zzB("sub", new zzZER());
        this.zzZjt.zzB("summary", new zzZEQ());
        this.zzZjt.zzB("sup", new zzZEP());
        this.zzZjt.zzB("table", new zzZEJ(this.zzZr3));
        this.zzZjt.zzB("tbody", new zzZEG());
        this.zzZjt.zzB("td", new zzZJP(this.zzZr3));
        this.zzZjt.zzB("textarea", new zzZEA());
        this.zzZjt.zzB("tfoot", new zzZEG());
        this.zzZjt.zzB(TranslateLanguage.THAI, new zzZJP(this.zzZr3));
        this.zzZjt.zzB("thead", new zzZEG());
        this.zzZjt.zzB(TranslateLanguage.TURKISH, new zzZEO());
        this.zzZjt.zzB("tt", new zzZE2());
        this.zzZjt.zzB("u", new zzZE1());
        this.zzZjt.zzB("ul", new zzZE0());
        this.zzZjt.zzB("var", new zzZDX());
        this.zzZjt.zzB("video", new zzZDW());
        this.zzZjt.zzB("xmp", new zzZDG());
        this.zzZju = new zzY3Z();
        this.zzZjs = new zzY7Y();
    }

    public final zzPS zzP(zzZBM zzzbm) {
        zzZTo();
        zzPR zzpr = new zzPR();
        if ("http://www.w3.org/2000/svg".equals(zzzbm.zzZ2G())) {
            this.zzZjs.zzZ(zzzbm, zzpr, this.zzZjv);
        } else {
            zzO(zzzbm).zzZ(zzzbm, zzpr, this.zzZjv);
        }
        return zzpr.zzZWe();
    }
}
