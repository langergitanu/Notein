package o00ooOO;

import android.graphics.ColorSpace;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o00ooOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25768OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ColorSpace f87941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32443OooOOO<Integer, Integer> f87942OooO0O0;

    public C25768OooO0Oo(int i, int i2, ColorSpace colorSpace) {
        this.f87941OooO00o = colorSpace;
        this.f87942OooO0O0 = (i == -1 || i2 == -1) ? null : new C32443OooOOO<>(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
