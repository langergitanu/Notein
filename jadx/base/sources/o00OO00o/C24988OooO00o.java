package o00OO00o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C22142OooO0oo;
import o00O0oo0.C24963OooO0OO;

/* JADX INFO: renamed from: o00OO00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24988OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public PointF f84761OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f84762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public T f84763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Interpolator f84764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Interpolator f84765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f84766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Interpolator f84767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Float f84768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PointF f84769OooO0oo;

    public C24988OooO00o(C22142OooO0oo c22142OooO0oo, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f84769OooO0oo = null;
        this.f84761OooO = null;
        this.f84762OooO00o = t;
        this.f84763OooO0O0 = t2;
        this.f84764OooO0OO = interpolator;
        this.f84765OooO0Oo = null;
        this.f84767OooO0o0 = null;
        this.f84766OooO0o = f;
        this.f84768OooO0oO = f2;
    }

    public final boolean OooO00o() {
        return this.f84764OooO0OO == null && this.f84765OooO0Oo == null && this.f84767OooO0o0 == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f84762OooO00o + ", endValue=" + this.f84763OooO0O0 + ", startFrame=" + this.f84766OooO0o + ", endFrame=" + this.f84768OooO0oO + ", interpolator=" + this.f84764OooO0OO + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24988OooO00o(C22142OooO0oo c22142OooO0oo, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f84769OooO0oo = null;
        this.f84761OooO = null;
        this.f84762OooO00o = obj;
        this.f84763OooO0O0 = obj2;
        this.f84764OooO0OO = null;
        this.f84765OooO0Oo = interpolator;
        this.f84767OooO0o0 = interpolator2;
        this.f84766OooO0o = f;
        this.f84768OooO0oO = null;
    }

    public C24988OooO00o(C22142OooO0oo c22142OooO0oo, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f84769OooO0oo = null;
        this.f84761OooO = null;
        this.f84762OooO00o = t;
        this.f84763OooO0O0 = t2;
        this.f84764OooO0OO = interpolator;
        this.f84765OooO0Oo = interpolator2;
        this.f84767OooO0o0 = interpolator3;
        this.f84766OooO0o = f;
        this.f84768OooO0oO = f2;
    }

    public C24988OooO00o(T t) {
        this.f84769OooO0oo = null;
        this.f84761OooO = null;
        this.f84762OooO00o = t;
        this.f84763OooO0O0 = t;
        this.f84764OooO0OO = null;
        this.f84765OooO0Oo = null;
        this.f84767OooO0o0 = null;
        this.f84766OooO0o = Float.MIN_VALUE;
        this.f84768OooO0oO = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24988OooO00o(C24963OooO0OO c24963OooO0OO, C24963OooO0OO c24963OooO0OO2) {
        this.f84769OooO0oo = null;
        this.f84761OooO = null;
        this.f84762OooO00o = c24963OooO0OO;
        this.f84763OooO0O0 = c24963OooO0OO2;
        this.f84764OooO0OO = null;
        this.f84765OooO0Oo = null;
        this.f84767OooO0o0 = null;
        this.f84766OooO0o = Float.MIN_VALUE;
        this.f84768OooO0oO = Float.valueOf(Float.MAX_VALUE);
    }
}
