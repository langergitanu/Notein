package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzL4 {
    private int zzZxi;
    private Object zzth;
    static zzQ8 zzZnr = new zzQ8();
    static zzM4 zzZnq = new zzM4();
    static zzOT zzZnp = new zzOT("transparent");
    static zzOT zzZno = new zzOT("none");
    static zzOT zzZnn = new zzOT("inherit");
    static zzL4 zzZnm = new zzOT("initial");
    static zzNH zzZnl = new zzNH(0.0d);
    static zzOI zzZnk = new zzOI(0.0d, 4);
    static zzMU zzZnj = new zzMU(0.0d);
    static zzOT zzZni = new zzOT("ltr");
    static zzOT zzZnh = new zzOT("rtl");
    static zzOT zzZng = new zzOT("auto");
    static zzOT zzZnf = new zzOT("avoid");
    static zzOT zzZne = new zzOT("capitalize");
    static zzOT zzZnd = new zzOT("lowercase");
    static zzOT zzZnc = new zzOT("uppercase");
    static zzOT zzZnb = new zzOT("normal");
    static zzOT zzZna = new zzOT("underline");
    static zzOT zzZn9 = new zzOT("overline");
    static zzOT zzZn8 = new zzOT("line-through");
    static zzOT zzZn7 = new zzOT("blink");
    static zzOT zzZn6 = new zzOT("small-caps");
    static zzOT zzZn5 = new zzOT("italic");
    static zzOT zzZn4 = new zzOT("oblique");
    static zzOT zzZn3 = new zzOT("bold");
    static zzOT zzZn2 = new zzOT("bolder");
    static zzOT zzZn1 = new zzOT("lighter");
    static zzOT zzZn0 = new zzOT("char");
    static zzOT zzZmZ = new zzOT("always");
    static zzOT zzZmY = new zzOT("top");
    static zzOT zzZmX = new zzOT("bottom");
    static zzOT zzZmW = new zzOT("middle");
    static zzOT zzZmV = new zzOT("start");
    static zzOT zzZmU = new zzOT("end");
    static zzOT zzZmT = new zzOT("baseline");
    static zzOT zzZmS = new zzOT("sub");
    static zzOT zzZmR = new zzOT("super");
    static zzOT zzZmQ = new zzOT("text-bottom");
    static zzOT zzZmP = new zzOT("repeat");
    static zzOT zzZmO = new zzOT("repeat-x");
    static zzOT zzZmN = new zzOT("repeat-y");
    static zzOT zzZmM = new zzOT("no-repeat");
    static zzOT zzZmL = new zzOT("scroll");
    static zzOT zzZmK = new zzOT("fixed");
    static zzOT zzZmJ = new zzOT("embed");
    static zzOT zzZmI = new zzOT("bidi-override");
    static zzOT zzZmH = new zzOT("left");
    static zzOT zzZmG = new zzOT("right");
    static zzOT zzZmF = new zzOT("center");
    static zzOT zzZmE = new zzOT("justify");
    static zzOT zzZmD = new zzOT("distribute-letter");
    static zzOT zzZmC = new zzOT("distribute-space");
    static zzOT zzZmB = new zzOT("line-edge");
    static zzOT zzZmA = new zzOT("-aw-start");
    static zzOT zzZmz = new zzOT("-aw-match-parent");
    static zzOT zzZmy = new zzOT("-aw-left");
    static zzOT zzZmx = new zzOT("-aw-right");
    static zzOT zzZmw = new zzOT("-aw-center");
    static zzOT zzZmv = new zzOT("inline");
    static zzOT zzZmu = new zzOT("inline-block");
    static zzOT zzZmt = new zzOT("block");
    static zzOT zzZms = new zzOT("list-item");
    static zzOT zzZmr = new zzOT("run-in");
    static zzOT zzZmq = new zzOT("inline-table");
    static zzOT zzZmp = new zzOT("table");
    static zzOT zzZmo = new zzOT("table-row-group");
    static zzOT zzZmn = new zzOT("table-header-group");
    static zzOT zzZmm = new zzOT("table-footer-group");
    static zzOT zzZml = new zzOT("table-row");
    static zzOT zzZmk = new zzOT("table-column-group");
    static zzOT zzZmj = new zzOT("table-column");
    static zzOT zzZmi = new zzOT("table-cell");
    static zzOT zzZmh = new zzOT("table-caption");
    static zzOT zzZmg = new zzOT("visible");
    static zzOT zzZmf = new zzOT("decimal");
    static zzOT zzZme = new zzOT("decimal-leading-zero");
    static zzOT zzZmd = new zzOT("lower-alpha");
    static zzOT zzZmc = new zzOT("upper-alpha");
    static zzOT zzZmb = new zzOT("lower-roman");
    static zzOT zzZma = new zzOT("upper-roman");
    static zzOT zzZm9 = new zzOT("lower-greek");
    static zzOT zzZm8 = new zzOT("lower-latin");
    static zzOT zzZm7 = new zzOT("upper-latin");
    static zzOT zzZm6 = new zzOT("armenian");
    static zzOT zzZm5 = new zzOT("georgian");
    static zzOT zzZm4 = new zzOT("disc");
    static zzOT zzZm3 = new zzOT("circle");
    static zzOT zzZm2 = new zzOT("square");
    static zzOT zzZm1 = new zzOT("collapse");
    static zzOT zzZm0 = new zzOT("separate");
    static zzOT zzZlZ = new zzOT("nowrap");
    static zzOT zzZlY = new zzOT("pre-wrap");
    static zzOT zzZlX = new zzOT("pre-line");
    static zzOT zzZlW = new zzOT("xx-small");
    static zzOT zzZlV = new zzOT("x-small");
    static zzOT zzZlU = new zzOT("small");
    static zzOT zzZlT = new zzOT("large");
    static zzOT zzZlS = new zzOT("x-large");
    static zzOT zzZlR = new zzOT("xx-large");
    static zzOT zzZlQ = new zzOT("xxx-large");
    static zzOT zzZlP = new zzOT("both");
    static zzOT zzZlO = new zzOT("text-top");
    static zzOT zzZlN = new zzOT("pre");
    static zzOT zzZlM = new zzOT("smaller");
    static zzOT zzZlL = new zzOT("larger");
    static zzOT zzZlK = new zzOT("lr-tb");
    static zzOT zzZlJ = new zzOT("rl-tb");
    static zzOT zzZlI = new zzOT("tb-rl");
    static zzOT zzZlH = new zzOT("bt-rl");
    static zzOT zzZlG = new zzOT("tb-lr");
    static zzOT zzZlF = new zzOT("bt-lr");
    static zzOT zzZlE = new zzOT("horizontal-tb");
    static zzOT zzZlD = new zzOT("vertical-rl");
    static zzOT zzZlC = new zzOT("vertical-lr");
    static zzOT zzZlB = new zzOT("medium");
    static zzOT zzZlA = new zzOT("thin");
    static zzOT zzZlz = new zzOT("thick");
    static zzOT zzZly = new zzOT("hidden");
    static zzOT zzZlx = new zzOT("dotted");
    static zzOT zzZlw = new zzOT("dashed");
    static zzOT zzZlv = new zzOT("solid");
    static zzOT zzZlu = new zzOT("double");
    static zzOT zzZlt = new zzOT("groove");
    static zzOT zzZls = new zzOT("ridge");
    static zzOT zzZlr = new zzOT("inset");
    static zzOT zzZlq = new zzOT("outset");
    static zzOT zzZlp = new zzOT("single");
    static zzOT zzZlo = new zzOT("hairline");
    static zzOT zzZln = new zzOT("dot");
    static zzOT zzZlm = new zzOT("dash-large-gap");
    static zzOT zzZll = new zzOT("dot-dash");
    static zzOT zzZlk = new zzOT("dot-dot-dash");
    static zzOT zzZlj = new zzOT("triple");
    static zzOT zzZli = new zzOT("thin-thick-small-gap");
    static zzOT zzZlh = new zzOT("thick-thin-small-gap");
    static zzOT zzZlg = new zzOT("thin-thick-thin-small-gap");
    static zzOT zzZlf = new zzOT("thin-thick-medium-gap");
    static zzOT zzZle = new zzOT("thick-thin-medium-gap");
    static zzOT zzZld = new zzOT("thin-thick-thin-medium-gap");
    static zzOT zzZlc = new zzOT("thin-thick-large-gap");
    static zzOT zzZlb = new zzOT("thick-thin-large-gap");
    static zzOT zzZla = new zzOT("thin-thick-thin-large-gap");
    static zzOT zzZl9 = new zzOT("wave");
    static zzOT zzZl8 = new zzOT("double-wave");
    static zzOT zzZl7 = new zzOT("dash-small-gap");
    static zzOT zzZl6 = new zzOT("dash-dot-stroker");
    static zzOT zzZl5 = new zzOT("emboss3d");
    static zzOT zzZl4 = new zzOT("engrave3d");
    static zzOT zzZl3 = new zzOT("caption");
    static zzOT zzZl2 = new zzOT("icon");
    static zzOT zzZl1 = new zzOT("menu");
    static zzOT zzZl0 = new zzOT("message-box");
    static zzOT zzZkZ = new zzOT("small-caption");
    static zzOT zzZkY = new zzOT("status-bar");
    static zzOT zzZkX = new zzOT("content-box");
    static zzOT zzZkW = new zzOT("padding-box");
    static zzOT zzZkV = new zzOT("border-box");
    static zzOT zzZkU = new zzOT("monospace");
    static zzOT zzZkT = new zzOT("inside");
    static zzOT zzZkS = new zzOT("outside");
    static zzOT zzZkR = new zzOT("absolute");
    static zzOT zzZkQ = new zzOT("open-quote");
    static zzOT zzZkP = new zzOT("close-quote");
    static zzOT zzZkO = new zzOT("no-open-quote");
    static zzOT zzZkN = new zzOT("no-close-quote");
    static zzOT zzZkM = new zzOT("ignore");
    static zzOT zzZkL = new zzOT("spaces");
    static zzOT zzZkK = new zzOT("heading1");
    static zzOT zzZkJ = new zzOT("heading2");
    static zzOT zzZkI = new zzOT("heading3");
    static zzOT zzZkH = new zzOT("heading4");
    static zzOT zzZkG = new zzOT("heading5");
    static zzOT zzZkF = new zzOT("heading6");
    static zzOT zzZkE = new zzOT("heading7");
    static zzOT zzZkD = new zzOT("heading8");
    static zzOT zzZkC = new zzOT("heading9");
    static zzOT zzZkB = new zzOT("emphasis");
    static zzOT zzZkA = new zzOT("hyperlink");
    static zzOT zzZkz = new zzOT("strong");
    static zzOT zzZky = new zzOT("currentColor");
    static zzOT zzZkx = new zzOT("butt");
    static zzOT zzZkw = new zzOT("round");
    static zzOT zzZkv = new zzOT("miter");
    static zzOT zzZku = new zzOT("bevel");
    static zzOT zzZkt = new zzOT("nonzero");
    static zzOT zzZks = new zzOT("evenodd");
    static zzOT zzZkr = new zzOT("central");
    static zzOT zzZkq = new zzOT("ideographic");
    static zzOT zzZkp = new zzOT("mathematical");
    static zzOT zzZko = new zzOT("alphabetic");
    static zzOT zzZkn = new zzOT("hanging");

    public zzL4(int i, Object obj) {
        this.zzZxi = i;
        this.zzth = obj;
    }

    public static zzL4 zzS0(String str) {
        byte b;
        if (str == null) {
            return null;
        }
        int iCharAt = 0;
        int i = 0;
        while (i < str.length() && zzZDY.isWhitespace(str.charAt(i))) {
            i++;
        }
        if (i >= str.length()) {
            return null;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt == '+') {
            i++;
            b = 1;
        } else if (cCharAt != '-') {
            b = 0;
        } else {
            i++;
            b = -1;
        }
        int i2 = i;
        while (i2 < str.length() && com.aspose.words.internal.zzZYD.isDigit(str.charAt(i2))) {
            iCharAt = (iCharAt * 10) + (str.charAt(i2) - '0');
            i2++;
            if (iCharAt > 10) {
                break;
            }
        }
        if (i2 == i) {
            return null;
        }
        if (b > 0) {
            iCharAt += 3;
        } else if (b < 0) {
            iCharAt = 3 - iCharAt;
        }
        if (iCharAt > 7) {
            iCharAt = 7;
        }
        switch (iCharAt > 0 ? iCharAt : 1) {
        }
        return null;
    }

    public static zzL4 zzS1(String str) {
        int iZzm;
        int iZzm2;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && zzZDY.isWhitespace(str.charAt(i2))) {
            i2++;
        }
        int length = str.length() - 1;
        while (length >= i2 && zzZDY.isWhitespace(str.charAt(length))) {
            length--;
        }
        int i3 = (length - i2) + 1;
        if (i3 < str.length()) {
            str = i3 > 0 ? str.substring(i2, i3 + i2) : "";
        }
        if (com.aspose.words.internal.zzZYD.zzi(str, "transparent")) {
            return null;
        }
        com.aspose.words.internal.zzPV zzpvZz4 = com.aspose.words.internal.zzPH.zz4(str);
        if (!com.aspose.words.internal.zzPV.zzZ(zzpvZz4, com.aspose.words.internal.zzPV.zzHZ)) {
            return new zzQC(zzpvZz4);
        }
        if (str.length() == 4 && com.aspose.words.internal.zzZYD.isHexDigit(str.charAt(1)) && com.aspose.words.internal.zzZYD.isHexDigit(str.charAt(2)) && com.aspose.words.internal.zzZYD.isHexDigit(str.charAt(3))) {
            return new zzQC(new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzZYD.zzm(str.charAt(1)) * 17, com.aspose.words.internal.zzZYD.zzm(str.charAt(2)) * 17, com.aspose.words.internal.zzZYD.zzm(str.charAt(3)) * 17));
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 128) {
            sb.setLength(128);
        }
        if (sb.length() > 0 && sb.charAt(0) == '#') {
            sb.delete(0, 1);
        }
        for (int i4 = 0; i4 < sb.length(); i4++) {
            if (!com.aspose.words.internal.zzZYD.isHexDigit(sb.charAt(i4))) {
                sb.setCharAt(i4, '0');
            }
        }
        while (true) {
            if (sb.length() != 0 && sb.length() % 3 == 0) {
                break;
            }
            sb.append('0');
        }
        int length2 = sb.length() / 3;
        if (length2 > 8) {
            length2 = 8;
        }
        loop4: while (length2 > 2) {
            int i5 = 0;
            while (i5 < 3) {
                i5++;
                if (sb.charAt(((sb.length() / 3) * i5) - length2) != '0') {
                    break loop4;
                }
            }
            length2--;
        }
        int i6 = 255;
        while (i < 3) {
            i++;
            int length3 = ((sb.length() / 3) * i) - length2;
            if (length2 == 1) {
                iZzm = i6 << 8;
                iZzm2 = com.aspose.words.internal.zzZYD.zzm(sb.charAt(length3));
            } else {
                iZzm = ((i6 << 4) | com.aspose.words.internal.zzZYD.zzm(sb.charAt(length3))) << 4;
                iZzm2 = com.aspose.words.internal.zzZYD.zzm(sb.charAt(length3 + 1));
            }
            i6 = iZzm | iZzm2;
        }
        return new zzQC(new com.aspose.words.internal.zzPV(i6));
    }

    public static zzL4 zzS2(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && zzZDY.isWhitespace(str.charAt(i))) {
            i++;
        }
        if (i >= str.length()) {
            return null;
        }
        if (str.charAt(i) == '+') {
            i++;
        }
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        if (i >= str.length() || !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
            return null;
        }
        double dCharAt = 0.0d;
        double dCharAt2 = 0.0d;
        while (i < str.length() && com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
            dCharAt2 = (dCharAt2 * 10.0d) + ((double) (str.charAt(i) - '0'));
            i++;
        }
        if (i >= str.length()) {
            return new zzOI(dCharAt2, 6);
        }
        if (str.charAt(i) == '.') {
            i++;
            if (i >= str.length() || !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
                return new zzOI(dCharAt2, 6);
            }
            double d = 1.0d;
            do {
                d *= 10.0d;
                dCharAt = (dCharAt * 10.0d) + ((double) (str.charAt(i) - '0'));
                i++;
                if (i >= str.length()) {
                    return new zzOI((dCharAt / d) + dCharAt2, 6);
                }
            } while (com.aspose.words.internal.zzZYD.isDigit(str.charAt(i)));
            dCharAt2 += dCharAt / d;
        }
        if (i < str.length() && str.charAt(i) == '%') {
            return new zzMU(dCharAt2);
        }
        return new zzOI(dCharAt2, 6);
    }

    public static zzL4 zzS3(String str) {
        int iZzJS = zzZDY.zzJS(str);
        if (iZzJS >= 0) {
            return new zzOI(iZzJS, 6);
        }
        return null;
    }

    public static zzL4 zzS4(String str) {
        return com.aspose.words.internal.zzS0.zzk(str) ? new zzOT(str) : new zzM2(str);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj instanceof zzL4) {
            return zzP((zzL4) obj);
        }
        return false;
    }

    public double getDoubleValue() {
        return -1.7976931348623157E308d;
    }

    public Object getValue() {
        return this.zzth;
    }

    public final int getValueType() {
        return this.zzZxi;
    }

    public int hashCode() {
        Object obj = this.zzth;
        return ((obj != null ? obj.hashCode() : 0) * 397) ^ this.zzZxi;
    }

    public abstract void zzG(StringBuilder sb);

    public final boolean zzP(zzL4 zzl4) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzl4)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzl4)) {
            return true;
        }
        if (this.zzZxi != zzl4.zzZxi) {
            return false;
        }
        return zzU(zzl4);
    }

    public boolean zzU(zzL4 zzl4) {
        return this.zzth.equals(zzl4.zzth);
    }

    public final boolean zzY(zzL4... zzl4Arr) {
        for (zzL4 zzl4 : zzl4Arr) {
            if (zzP(zzl4)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYa(boolean z) {
        int i = this.zzZxi;
        if (i != 4) {
            return (z && i == 3) || zzP(zzZnl);
        }
        return true;
    }

    public final zzOI zzZTO() {
        int i = this.zzZxi;
        if (i == 4) {
            return (zzOI) this;
        }
        if (i != 3) {
            return null;
        }
        zzNH zznh = (zzNH) this;
        return zznh.getDoubleValue() == 0.0d ? zzZnk : new zzOI(zznh.getDoubleValue(), 6);
    }
}
