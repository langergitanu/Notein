package o00O0oo0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o00O0oo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24971OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f84688OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f84689OooO0O0;

    public C24971OooOO0o(PointF pointF, boolean z, List<o00000O0.OooO0O0> list) {
        this.f84689OooO0O0 = z;
        this.f84688OooO00o = new ArrayList(list);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f84688OooO00o.size() + "closed=" + this.f84689OooO0O0 + '}';
    }
}
