package o0OO00Oo;

import android.net.Uri;
import com.alibaba.sdk.android.oss.OSS;
import kotlin.jvm.internal.OooOOO0;
import o0OO0oO.C26936OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OSS f90942OooO00o;

    public OooO0O0(OSS oss) {
        this.f90942OooO00o = oss;
    }

    @Override // o0OO00Oo.OooO0OO
    public final String OooO00o(String objectKey) {
        OooOOO0.OooO0oO(objectKey, "objectKey");
        String strPresignPublicObjectURL = this.f90942OooO00o.presignPublicObjectURL("notein-xls-upload", objectKey);
        OooOOO0.OooO0o(strPresignPublicObjectURL, "presignPublicObjectURL(...)");
        return strPresignPublicObjectURL;
    }

    @Override // o0OO00Oo.OooO0OO
    public final Object OooO0O0(Uri uri, String str, C26936OooOOo c26936OooOOo) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26469OooO00o(str, uri, this, null), c26936OooOOo);
    }
}
