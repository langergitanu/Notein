package o0O0O00;

import android.text.Layout;

/* JADX INFO: renamed from: o0O0O00.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25863OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Layout.Alignment f88250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Layout.Alignment f88251OooO0O0;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f88250OooO00o = alignment;
        f88251OooO0O0 = alignment2;
    }
}
