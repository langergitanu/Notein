package OooO0o;

import android.graphics.RectF;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import java.util.LinkedHashMap;
import o000OOO.C24498OooO0o0;

/* JADX INFO: renamed from: OooO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20424OooO0Oo implements Continuation, o000OOO.OooO {
    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return f4 - ((f * f2) / f3);
    }

    public static int OooO0OO(RectF rectF, int i, int i2) {
        return (rectF.hashCode() + i) * i2;
    }

    public static Object OooO0Oo(int i, LinkedHashMap linkedHashMap) {
        return linkedHashMap.get(new Integer(i));
    }

    public static StringBuilder OooO0o0(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        return C24498OooO0o0.OooO0O0(C24498OooO0o0.f82831OooO0OO, d);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FirebaseAppCheckTokenProvider.lambda$getToken$2(task);
    }
}
