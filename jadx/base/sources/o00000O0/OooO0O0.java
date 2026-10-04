package o00000O0;

import android.graphics.PointF;
import android.os.LocaleList;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o00000O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f81238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Parcelable f81239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object f81240OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f81241OooO0Oo;

    public OooO0O0(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f81238OooO00o = 1;
        this.f81239OooO0O0 = pointF;
        this.f81240OooO0OO = pointF2;
        this.f81241OooO0Oo = pointF3;
    }

    public C24108OooO0Oo OooO00o() {
        LocaleList localeList = LocaleList.getDefault();
        OooOOO0.OooO0o(localeList, "getDefault()");
        synchronized (((OooOO0) this.f81241OooO0Oo)) {
            try {
                C24108OooO0Oo c24108OooO0Oo = (C24108OooO0Oo) this.f81240OooO0OO;
                if (c24108OooO0Oo != null && localeList == ((LocaleList) this.f81239OooO0O0)) {
                    return c24108OooO0Oo;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Locale locale = localeList.get(i);
                    OooOOO0.OooO0o(locale, "platformLocaleList[position]");
                    arrayList.add(new OooO0OO(new OooO00o(locale)));
                }
                C24108OooO0Oo c24108OooO0Oo2 = new C24108OooO0Oo(arrayList);
                this.f81239OooO0O0 = localeList;
                this.f81240OooO0OO = c24108OooO0Oo2;
                return c24108OooO0Oo2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f81238OooO00o) {
            case 1:
                PointF pointF = (PointF) this.f81241OooO0Oo;
                Float fValueOf = Float.valueOf(pointF.x);
                Float fValueOf2 = Float.valueOf(pointF.y);
                PointF pointF2 = (PointF) this.f81239OooO0O0;
                Float fValueOf3 = Float.valueOf(pointF2.x);
                Float fValueOf4 = Float.valueOf(pointF2.y);
                PointF pointF3 = (PointF) this.f81240OooO0OO;
                return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
            default:
                return super.toString();
        }
    }

    public OooO0O0() {
        this.f81238OooO00o = 0;
        this.f81241OooO0Oo = new OooOO0();
    }
}
