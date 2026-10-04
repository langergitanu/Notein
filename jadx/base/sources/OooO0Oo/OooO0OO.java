package OooO0Oo;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f58180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f58181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f58182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f58183OooO0Oo;

    public OooO0OO(BackEvent backEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
        float fOooO0OO = C20397OooO00o.OooO0OO(backEvent);
        float fOooO0Oo = C20397OooO00o.OooO0Oo(backEvent);
        float fOooO00o = C20397OooO00o.OooO00o(backEvent);
        int iOooO0O0 = C20397OooO00o.OooO0O0(backEvent);
        this.f58180OooO00o = fOooO0OO;
        this.f58181OooO0O0 = fOooO0Oo;
        this.f58182OooO0OO = fOooO00o;
        this.f58183OooO0Oo = iOooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f58180OooO00o);
        sb.append(", touchY=");
        sb.append(this.f58181OooO0O0);
        sb.append(", progress=");
        sb.append(this.f58182OooO0OO);
        sb.append(", swipeEdge=");
        return C20398OooO0O0.OooO00o('}', sb, this.f58183OooO0Oo);
    }
}
