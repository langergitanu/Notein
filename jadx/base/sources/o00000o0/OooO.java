package o00000o0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO f81254OooO0O0 = new OooO(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO f81255OooO0OO = new OooO(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO f81256OooO0Oo = new OooO(2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81257OooO00o;

    public OooO(int i) {
        this.f81257OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO) {
            return this.f81257OooO00o == ((OooO) obj).f81257OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81257OooO00o;
    }

    public final String toString() {
        int i = this.f81257OooO00o;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("TextDecoration[");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
