package o000ooOO;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Collection;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o000ooOO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24744OooOOo {
    public static final boolean OooO00o(String current, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < current.length()) {
                    char cCharAt = current.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != current.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                    return kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final String OooO0O0(Collection<?> collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return C33591OooOOO.OooO0oO(OooOo.o000oOoO(collection, ",\n", IOUtils.LINE_SEPARATOR_UNIX, IOUtils.LINE_SEPARATOR_UNIX, null, 56)) + "},";
    }
}
