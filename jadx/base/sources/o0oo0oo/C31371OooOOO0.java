package o0oo0oo;

import Oooo0oO.C21036OooOOo0;
import java.util.Locale;

/* JADX INFO: renamed from: o0oo0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31371OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f112013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f112014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f112015OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f112016OooO0Oo;

    public C31371OooOOO0(int i, int i2, boolean z, boolean z2) {
        this.f112013OooO00o = i;
        this.f112014OooO0O0 = i2;
        this.f112015OooO0OO = z;
        this.f112016OooO0Oo = z2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f112015OooO0OO ? "onCurve" : "";
        String str2 = this.f112016OooO0Oo ? "endOfContour" : "";
        StringBuilder sb = new StringBuilder("Point(");
        sb.append(this.f112013OooO00o);
        sb.append(",");
        C21036OooOOo0.OooO0Oo(this.f112014OooO0O0, ",", str, ",", sb);
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
