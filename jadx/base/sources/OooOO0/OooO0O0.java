package OooOO0;

import android.content.Context;
import android.graphics.PointF;
import com.aspose.slides.internal.p475wh.C12003du;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import o0O0oOo.AbstractC26133OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements LibraryVersionComponent.VersionExtractor, ObjectConstructor {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return (f * f2) + f3 + f4;
    }

    public static PointF OooO0O0(float f, float f2, float f3, PointF pointF) {
        return AbstractC26133OooOO0o.OooO00o.OooO0o(new PointF(f, f2), f3, pointF);
    }

    public static C12003du OooO0OO(C12003du c12003du, C12003du c12003du2, int i) {
        c12003du.CloneTo(c12003du2);
        return C12003du.m56400k4(i, c12003du2.Clone());
    }

    public static void OooO0Oo(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$17();
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
    }
}
