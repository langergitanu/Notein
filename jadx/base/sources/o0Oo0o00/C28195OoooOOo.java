package o0Oo0o00;

import java.text.FieldPosition;
import java.text.NumberFormat;

/* JADX INFO: renamed from: o0Oo0o00.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28195OoooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f99913OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f99914OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f99915OooO0OO = 0;

    public static void OooO00o(double d, NumberFormat numberFormat, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            numberFormat.format(d, stringBuffer, fieldPosition);
            return;
        }
        stringBuffer.append('(');
        stringBuffer.append(d);
        stringBuffer.append(')');
    }
}
