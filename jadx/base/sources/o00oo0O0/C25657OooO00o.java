package o00oo0O0;

import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import o00o0OOO.InterfaceC25397OooO00o;
import o00oo0O.C25651OooO00o;
import o00oo0O.C25654OooO0Oo;

/* JADX INFO: renamed from: o00oo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25657OooO00o implements InterfaceC25397OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f87577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25654OooO0Oo f87578OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25651OooO00o f87579OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25397OooO00o f87580OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object f87581OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f87582OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f87583OooO0oO;

    public C25657OooO00o(String sourceString, C25654OooO0Oo rotationOptions, C25651OooO00o imageDecodeOptions, InterfaceC25397OooO00o interfaceC25397OooO00o, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceString, "sourceString");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rotationOptions, "rotationOptions");
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageDecodeOptions, "imageDecodeOptions");
        this.f87577OooO00o = sourceString;
        this.f87578OooO0O0 = rotationOptions;
        this.f87579OooO0OO = imageDecodeOptions;
        this.f87580OooO0Oo = interfaceC25397OooO00o;
        this.f87582OooO0o0 = str;
        this.f87583OooO0oO = ((((imageDecodeOptions.hashCode() + ((rotationOptions.hashCode() + (sourceString.hashCode() * 961)) * 31)) * 31) + (interfaceC25397OooO00o != null ? interfaceC25397OooO00o.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final String OooO00o() {
        return this.f87577OooO00o;
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final boolean OooO0O0() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C25657OooO00o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C25657OooO00o c25657OooO00o = (C25657OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f87577OooO00o, c25657OooO00o.f87577OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f87578OooO0O0, c25657OooO00o.f87578OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f87579OooO0OO, c25657OooO00o.f87579OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f87580OooO0Oo, c25657OooO00o.f87580OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f87582OooO0o0, c25657OooO00o.f87582OooO0o0);
    }

    public final int hashCode() {
        return this.f87583OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapMemoryCacheKey(sourceString=");
        sb.append(this.f87577OooO00o);
        sb.append(", resizeOptions=null, rotationOptions=");
        sb.append(this.f87578OooO0O0);
        sb.append(", imageDecodeOptions=");
        sb.append(this.f87579OooO0OO);
        sb.append(", postprocessorCacheKey=");
        sb.append(this.f87580OooO0Oo);
        sb.append(", postprocessorName=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f87582OooO0o0, ")");
    }
}
