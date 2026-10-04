package OooOO0;

import android.content.Context;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements LibraryVersionComponent.VersionExtractor {
    public static float OooO00o(float f, float f2, float f3) {
        float f4 = f - f2;
        return (f4 * f4) + f3;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int OooO0OO(float f, float f2, int i) {
        return C7019kk.m27462to(Float.valueOf(f * f2), i);
    }

    public static String OooO0Oo(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static void OooO0o0(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
    }
}
