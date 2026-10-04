package o00O0oO;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C22142OooO0oo;
import o00OO00O.C24986OooO0oo;
import o00OO00o.C24988OooO00o;

/* JADX INFO: renamed from: o00O0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24942OooO00o extends C24988OooO00o<PointF> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C24988OooO00o<PointF> f84630OooOO0;

    public C24942OooO00o(C22142OooO0oo c22142OooO0oo, C24988OooO00o<PointF> c24988OooO00o) {
        super(c22142OooO0oo, c24988OooO00o.f84762OooO00o, c24988OooO00o.f84763OooO0O0, c24988OooO00o.f84764OooO0OO, c24988OooO00o.f84765OooO0Oo, c24988OooO00o.f84767OooO0o0, c24988OooO00o.f84766OooO0o, c24988OooO00o.f84768OooO0oO);
        this.f84630OooOO0 = c24988OooO00o;
        OooO0O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0() {
        T t;
        T t2 = this.f84763OooO0O0;
        T t3 = this.f84762OooO00o;
        boolean z = (t2 == 0 || t3 == 0 || !((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        if (t3 == 0 || (t = this.f84763OooO0O0) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t3;
        PointF pointF2 = (PointF) t;
        C24988OooO00o<PointF> c24988OooO00o = this.f84630OooOO0;
        PointF pointF3 = c24988OooO00o.f84769OooO0oo;
        PointF pointF4 = c24988OooO00o.f84761OooO;
        int i = C24986OooO0oo.f84760OooO00o;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return;
        }
        float f = pointF3.x + pointF.x;
        float f2 = pointF.y + pointF3.y;
        float f3 = pointF2.x;
        float f4 = f3 + pointF4.x;
        float f5 = pointF2.y;
        path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
    }
}
