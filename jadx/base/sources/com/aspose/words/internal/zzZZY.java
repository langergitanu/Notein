package com.aspose.words.internal;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18385v2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZY {
    private static String[] zzdw = {".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quoteright", "parenleft", "parenright", "asterisk", "plus", "comma", "minus", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", C18385v2.f56336h, "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "quoteleft", "a", "b", "c", "d", "e", "f", "g", C18773h.f57233c, ContextChain.TAG_INFRA, "j", "k", "l", "m", BackupFile.PREFIX_NOTE_DIR, "o", ContextChain.TAG_PRODUCT, "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", ".notdef", "dotlessi", "grave", "acute", "circumflex", "tilde", "macron", "breve", "dotaccent", "dieresis", ".notdef", "ring", "cedilla", ".notdef", "hungarumlaut", "ogonek", "caron", "space", "exclamdown", "cent", "sterling", FirebaseAnalytics.Param.CURRENCY, "yen", "brokenbar", "section", "dieresis", "copyright", "ordfeminine", "guillemotleft", "logicalnot", "hyphen", "registered", "macron", "degree", "plusminus", "twosuperior", "threesuperior", "acute", "mu", "paragraph", "periodcentered", "cedilla", "onesuperior", "ordmasculine", "guillemotright", "onequarter", "onehalf", "threequarters", "questiondown", "Agrave", "Aacute", "Acircumflex", "Atilde", "Adieresis", "Aring", "AE", "Ccedilla", "Egrave", "Eacute", "Ecircumflex", "Edieresis", "Igrave", "Iacute", "Icircumflex", "Idieresis", "Eth", "Ntilde", "Ograve", "Oacute", "Ocircumflex", "Otilde", "Odieresis", "multiply", "Oslash", "Ugrave", "Uacute", "Ucircumflex", "Udieresis", "Yacute", "Thorn", "germandbls", "agrave", "aacute", "acircumflex", "atilde", "adieresis", "aring", "ae", "ccedilla", "egrave", "eacute", "ecircumflex", "edieresis", "igrave", "iacute", "icircumflex", "idieresis", "eth", "ntilde", "ograve", "oacute", "ocircumflex", "otilde", "odieresis", "divide", "oslash", "ugrave", "uacute", "ucircumflex", "udieresis", "yacute", "thorn", "ydieresis"};

    public static zz08[] zzQ(zzZYV<Integer> zzzyv) {
        zz08[] zz08VarArr = new zz08[zzzyv.getCount()];
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zz08VarArr[i] = new zz08(zzzyv.zzT3(i), zzzyv.zzVY(i).intValue());
        }
        Arrays.sort(zz08VarArr);
        return zz08VarArr;
    }

    private static boolean zzTa(int i) {
        return i < zzdw.length;
    }

    public static String zzTb(int i) {
        return (i == 0 || i == 65535) ? ".notdef" : zzTa(i) ? zzdw[i] : zzZKN.format("uni{0:X4}", Integer.valueOf(i));
    }
}
