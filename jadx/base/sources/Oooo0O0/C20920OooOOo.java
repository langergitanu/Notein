package Oooo0O0;

import Oooo0.o000000O;
import java.util.List;
import o00o00Oo.C25256OooO00o;
import oOo000Oo.AbstractC34424OooO0oO;

/* JADX INFO: renamed from: Oooo0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20920OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f60355OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f60356OooO0O0 = 0;

    public static final boolean OooO00o(Object[] objArr, int i, int i2, List list) {
        if (i2 == list.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(objArr[i + i3], list.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String OooO0O0(Object[] objArr, int i, int i2, AbstractC34424OooO0oO abstractC34424OooO0oO) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC34424OooO0oO) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    public static final long OooO0OO(String text, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        return i2 == 0 ? C25256OooO00o.OooO0OO(i, i) : i == 0 ? z ? C25256OooO00o.OooO0OO(o000000O.OooO00o(0, text), 0) : C25256OooO00o.OooO0OO(0, o000000O.OooO00o(0, text)) : i == i2 ? z ? C25256OooO00o.OooO0OO(o000000O.OooO0O0(i2, text), i2) : C25256OooO00o.OooO0OO(i2, o000000O.OooO0O0(i2, text)) : z ? !z2 ? C25256OooO00o.OooO0OO(o000000O.OooO0O0(i, text), i) : C25256OooO00o.OooO0OO(o000000O.OooO00o(i, text), i) : !z2 ? C25256OooO00o.OooO0OO(i, o000000O.OooO00o(i, text)) : C25256OooO00o.OooO0OO(i, o000000O.OooO0O0(i, text));
    }

    public static final void OooO0Oo(Object[] objArr, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
