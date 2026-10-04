package com.aspose.words;

import androidx.core.text.util.LocalePreferences;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1K {
    private static com.aspose.words.internal.zzZYJ zzYOe = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOf = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOd = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOc = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOb = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOa = new com.aspose.words.internal.zzZYJ();

    static {
        zzYOd.zzH("none", 0);
        zzYOd.zzH("single", 1);
        zzYOd.zzH("thick", 2);
        zzYOd.zzH("double", 3);
        zzYOd.zzH("dotted", 6);
        zzYOd.zzH("dashed", 7);
        zzYOd.zzH("dot-dash", 8);
        zzYOd.zzH("dot-dot-dash", 9);
        zzYOd.zzH("triple", 10);
        zzYOd.zzH("thin-thick-small-gap", 11);
        zzYOd.zzH("thick-thin-small-gap", 12);
        zzYOd.zzH("thin-thick-thin-small-gap", 13);
        zzYOd.zzH("thin-thick-medium-gap", 14);
        zzYOd.zzH("thick-thin-medium-gap", 15);
        zzYOd.zzH("thin-thick-thin-medium-gap", 16);
        zzYOd.zzH("thin-thick-large-gap", 17);
        zzYOd.zzH("thick-thin-large-gap", 18);
        zzYOd.zzH("thin-thick-thin-large-gap", 19);
        zzYOd.zzH("wave", 20);
        zzYOd.zzH("double-wave", 21);
        zzYOd.zzH("dash-small-gap", 22);
        zzYOd.zzH("dash-dot-stroked", 23);
        zzYOd.zzH("three-d-emboss", 24);
        zzYOd.zzH("three-d-engrave", 25);
        zzYOd.zzH("outset", 26);
        zzYOd.zzH("inset", 27);
        zzYOd.zzH("apples", 64);
        zzYOd.zzH("arched-scallops", 65);
        zzYOd.zzH("baby-pacifier", 66);
        zzYOd.zzH("baby-rattle", 67);
        zzYOd.zzH("balloons-3-colors", 68);
        zzYOd.zzH("balloons-hot-air", 69);
        zzYOd.zzH("basic-black-dashes", 70);
        zzYOd.zzH("basic-black-dots", 71);
        zzYOd.zzH("basic-black-squares", 72);
        zzYOd.zzH("basic-thin-lines", 73);
        zzYOd.zzH("basic-white-dashes", 74);
        zzYOd.zzH("basic-white-dots", 75);
        zzYOd.zzH("basic-white-squares", 76);
        zzYOd.zzH("basic-wide-inline", 77);
        zzYOd.zzH("basic-wide-midline", 78);
        zzYOd.zzH("basic-wide-outline", 79);
        zzYOd.zzH("bats", 80);
        zzYOd.zzH("birds", 81);
        zzYOd.zzH("birds-flight", 82);
        zzYOd.zzH("cabins", 83);
        zzYOd.zzH("cake-slice", 84);
        zzYOd.zzH("candy-corn", 85);
        zzYOd.zzH("celtic-knotwork", 86);
        zzYOd.zzH("certificate-banner", 87);
        zzYOd.zzH("chain-link", 88);
        zzYOd.zzH("champagne-bottle", 89);
        zzYOd.zzH("checked-bar-black", 90);
        zzYOd.zzH("checked-bar-color", 91);
        zzYOd.zzH("checkered", 92);
        zzYOd.zzH("christmas-tree", 93);
        zzYOd.zzH("circles-lines", 94);
        zzYOd.zzH("circles-rectangles", 95);
        zzYOd.zzH("classical-wave", 96);
        zzYOd.zzH("clocks", 97);
        zzYOd.zzH("compass", 98);
        zzYOd.zzH("confetti", 99);
        zzYOd.zzH("confetti-grays", 100);
        zzYOd.zzH("confetti-outline", 101);
        zzYOd.zzH("confetti-streamers", 102);
        zzYOd.zzH("confetti-white", 103);
        zzYOd.zzH("corner-triangles", 104);
        zzYOd.zzH("coupon-cutout-dashes", 105);
        zzYOd.zzH("coupon-cutout-dots", 106);
        zzYOd.zzH("crazy-maze", 107);
        zzYOd.zzH("creatures-butterfly", 108);
        zzYOd.zzH("creatures-fish", 109);
        zzYOd.zzH("creatures-insects", 110);
        zzYOd.zzH("creatures-lady-bug", 111);
        zzYOd.zzH("cross-stitch", 112);
        zzYOd.zzH("cup", 113);
        zzYOd.zzH("deco-arch", 114);
        zzYOd.zzH("deco-arch-color", 115);
        zzYOd.zzH("deco-blocks", 116);
        zzYOd.zzH("diamonds-gray", 117);
        zzYOd.zzH("double-d", 118);
        zzYOd.zzH("double-diamonds", 119);
        zzYOd.zzH("earth-1", 120);
        zzYOd.zzH("earth-2", 121);
        zzYOd.zzH("eclipsing-squares-1", 122);
        zzYOd.zzH("eclipsing-squares-2", 123);
        zzYOd.zzH("eggs-black", 124);
        zzYOd.zzH("fans", 125);
        zzYOd.zzH("film", 126);
        zzYOd.zzH("firecrackers", 127);
        zzYOd.zzH("flowers-block-print", 128);
        zzYOd.zzH("flowers-daisies", 129);
        zzYOd.zzH("flowers-modern-1", 130);
        zzYOd.zzH("flowers-modern-2", 131);
        zzYOd.zzH("flowers-pansy", 132);
        zzYOd.zzH("flowers-red-rose", 133);
        zzYOd.zzH("flowers-roses", 134);
        zzYOd.zzH("flowers-teacup", 135);
        zzYOd.zzH("flowers-tiny", 136);
        zzYOd.zzH("gems", 137);
        zzYOd.zzH("gingerbread-man", 138);
        zzYOd.zzH("gradient", 139);
        zzYOd.zzH("handmade-1", 140);
        zzYOd.zzH("handmade-2", 141);
        zzYOd.zzH("heart-balloon", 142);
        zzYOd.zzH("heart-gray", 143);
        zzYOd.zzH("hearts", 144);
        zzYOd.zzH("heebie-jeebies", 145);
        zzYOd.zzH("holly", 146);
        zzYOd.zzH("house-funky", 147);
        zzYOd.zzH("hypnotic", 148);
        zzYOd.zzH("ice-cream-cones", 149);
        zzYOd.zzH("light-bulb", 150);
        zzYOd.zzH("lightning-1", 151);
        zzYOd.zzH("lightning-2", 152);
        zzYOd.zzH("map-pins", 153);
        zzYOd.zzH("maple-leaf", 154);
        zzYOd.zzH("maple-muffins", 155);
        zzYOd.zzH("marquee", 156);
        zzYOd.zzH("marquee-toothed", 157);
        zzYOd.zzH("moons", 158);
        zzYOd.zzH("mosaic", 159);
        zzYOd.zzH("music-notes", 160);
        zzYOd.zzH("northwest", 161);
        zzYOd.zzH("ovals", 162);
        zzYOd.zzH("packages", 163);
        zzYOd.zzH("palms-black", 164);
        zzYOd.zzH("palms-color", 165);
        zzYOd.zzH("paper-clips", 166);
        zzYOd.zzH("papyrus", 167);
        zzYOd.zzH("party-favor", 168);
        zzYOd.zzH("party-glass", 169);
        zzYOd.zzH("pencils", 170);
        zzYOd.zzH("people", 171);
        zzYOd.zzH("people-waving", 172);
        zzYOd.zzH("people-hats", 173);
        zzYOd.zzH("poinsettias", 174);
        zzYOd.zzH("postage-stamp", 175);
        zzYOd.zzH("pumpkin-1", 176);
        zzYOd.zzH("push-pin-note-1", 178);
        zzYOd.zzH("push-pin-note-2", 177);
        zzYOd.zzH("pyramids", 179);
        zzYOd.zzH("pyramids-above", 180);
        zzYOd.zzH("quadrants", 181);
        zzYOd.zzH("rings", 182);
        zzYOd.zzH("safari", 183);
        zzYOd.zzH("sawtooth", 184);
        zzYOd.zzH("sawtooth-gray", 185);
        zzYOd.zzH("scared-cat", 186);
        zzYOd.zzH("seattle", 187);
        zzYOd.zzH("shadowed-squares", 188);
        zzYOd.zzH("sharks-teeth", 189);
        zzYOd.zzH("shorebird-tracks", 190);
        zzYOd.zzH("skyrocket", 191);
        zzYOd.zzH("snowflake-fancy", 192);
        zzYOd.zzH("snowflakes", 193);
        zzYOd.zzH("sombrero", 194);
        zzYOd.zzH("southwest", 195);
        zzYOd.zzH("stars", 196);
        zzYOd.zzH("stars-top", 197);
        zzYOd.zzH("stars-3d", 198);
        zzYOd.zzH("stars-black", 199);
        zzYOd.zzH("stars-shadowed", 200);
        zzYOd.zzH(LocalePreferences.FirstDayOfWeek.SUNDAY, 201);
        zzYOd.zzH("swirligig", 202);
        zzYOd.zzH("torn-paper", 203);
        zzYOd.zzH("torn-paper-black", 204);
        zzYOd.zzH("trees", 205);
        zzYOd.zzH("triangle-party", 206);
        zzYOd.zzH("triangles", 207);
        zzYOd.zzH("tribal-1", 208);
        zzYOd.zzH("tribal-2", 209);
        zzYOd.zzH("tribal-3", 210);
        zzYOd.zzH("tribal-4", 211);
        zzYOd.zzH("tribal-5", 212);
        zzYOd.zzH("tribal-6", 213);
        zzYOd.zzH("twisted-lines-1", 214);
        zzYOd.zzH("twisted-lines-2", 215);
        zzYOd.zzH("vine", 216);
        zzYOd.zzH("waveline", 217);
        zzYOd.zzH("weaving-angles", 218);
        zzYOd.zzH("weaving-braid", 219);
        zzYOd.zzH("weaving-ribbon", 220);
        zzYOd.zzH("weaving-strips", 221);
        zzYOd.zzH("white-flowers", 222);
        zzYOd.zzH("woodwork", 223);
        zzYOd.zzH("x-illusions", 224);
        zzYOd.zzH("zany-triangles", 225);
        zzYOd.zzH("zig-zag", 226);
        zzYOd.zzH("zig-zag-stitch", 227);
        zzYOf.zzH("decimal", 0);
        zzYOf.zzH("upper-roman", 1);
        zzYOf.zzH("lower-roman", 2);
        zzYOf.zzH("upper-letter", 3);
        zzYOf.zzH("lower-letter", 4);
        zzYOf.zzH("ordinal", 5);
        zzYOf.zzH("cardinal-text", 6);
        zzYOf.zzH("ordinal-text", 7);
        zzYOf.zzH("hex", 8);
        zzYOf.zzH("chicago", 9);
        zzYOf.zzH("ideograph-digital", 10);
        zzYOf.zzH("japanese-counting", 11);
        zzYOf.zzH("aiueo", 12);
        zzYOf.zzH("iroha", 13);
        zzYOf.zzH("decimal-full-width", 14);
        zzYOf.zzH("decimal-half-width", 15);
        zzYOf.zzH("japanese-legal", 16);
        zzYOf.zzH("japanese-digital-ten-thousand", 17);
        zzYOf.zzH("decimal-enclosed-circle", 18);
        zzYOf.zzH("decimal-full-width2", 19);
        zzYOf.zzH("aiueo-full-width", 20);
        zzYOf.zzH("iroha-full-width", 21);
        zzYOf.zzH("decimal-zero", 22);
        zzYOf.zzH("bullet", 23);
        zzYOf.zzH("ganada", 24);
        zzYOf.zzH("chosung", 25);
        zzYOf.zzH("decimal-enclosed-fullstop", 26);
        zzYOf.zzH("decimal-enclosed-paren", 27);
        zzYOf.zzH("decimal-enclosed-circle-chinese", 28);
        zzYOf.zzH("ideograph-enclosed-circle", 29);
        zzYOf.zzH("ideograph-traditional", 30);
        zzYOf.zzH("ideograph-zodiac", 31);
        zzYOf.zzH("ideograph-zodiac-traditional", 32);
        zzYOf.zzH("taiwanese-counting", 33);
        zzYOf.zzH("ideograph-legal-traditional", 34);
        zzYOf.zzH("taiwanese-counting-thousand", 35);
        zzYOf.zzH("taiwanese-digital", 36);
        zzYOf.zzH("chinese-counting", 37);
        zzYOf.zzH("chinese-legal-simplified", 38);
        zzYOf.zzH("chinese-counting-thousand", 39);
        zzYOf.zzH("chinese-not-impl", 40);
        zzYOf.zzH("korean-digital", 41);
        zzYOf.zzH("korean-counting", 42);
        zzYOf.zzH("korean-legal", 43);
        zzYOf.zzH("korean-digital2", 44);
        zzYOf.zzH("vietnamese-counting", 56);
        zzYOf.zzH("russian-lower", 58);
        zzYOf.zzH("russian-upper", 59);
        zzYOf.zzH("none", 255);
        zzYOf.zzH("number-in-dash", 57);
        zzYOf.zzH("hebrew-1", 45);
        zzYOf.zzH("hebrew-2", 47);
        zzYOf.zzH("arabic-alpha", 46);
        zzYOf.zzH("arabic-abjad", 48);
        zzYOf.zzH("hindi-vowels", 49);
        zzYOf.zzH("hindi-consonants", 50);
        zzYOf.zzH("hindi-numbers", 51);
        zzYOf.zzH("hindi-counting", 52);
        zzYOf.zzH("thai-letters", 53);
        zzYOf.zzH("thai-numbers", 54);
        zzYOf.zzH("thai-counting", 55);
        zzYOc.zzH("paragraph", 1);
        zzYOc.zzH(FirebaseAnalytics.Param.CHARACTER, 2);
        zzYOc.zzH("table", 3);
        zzYOc.zzH("list", 4);
        zzYOe.zzH("Auto", 0);
        zzYOe.zzH("Decorative", 5);
        zzYOe.zzH("Modern", 3);
        zzYOe.zzH("Roman", 1);
        zzYOe.zzH("Script", 4);
        zzYOe.zzH("Swiss", 2);
        zzYOb.zzH("normal", -1);
        zzYOb.zzH("separator", 0);
        zzYOb.zzH("continuation-separator", 1);
        zzYOb.zzH("continuation-notice", 2);
        zzYOa.zzH("normal", -1);
        zzYOa.zzH("separator", 3);
        zzYOa.zzH("continuation-separator", 4);
        zzYOa.zzH("continuation-notice", 5);
    }

    public static String zzYZ(int i, boolean z) {
        return (z ? zzYOa : zzYOb).zzO(i, "");
    }

    public static int zzZX(String str, boolean z) {
        return (z ? zzYOa : zzYOb).zzG(str, -1);
    }

    public static String zzhW(int i) {
        return zzYOc.zzO(i, "paragraph");
    }

    public static String zzhX(int i) {
        return i != 5 ? zzYOd.zzO(i, "none") : "single";
    }

    public static String zzhY(int i) {
        return zzYOf.zzO(i, "");
    }

    public static String zzhZ(int i) {
        return zzYOe.zzO(i, "");
    }

    public static int zzyI(String str) {
        return zzYOc.zzG(str, 1);
    }

    public static int zzyJ(String str) {
        return zzYOd.zzG(str, 0);
    }

    public static int zzyK(String str) {
        return zzYOf.zzG(str, 0);
    }

    public static int zzyL(String str) {
        return zzYOe.zzG(str, 0);
    }
}
