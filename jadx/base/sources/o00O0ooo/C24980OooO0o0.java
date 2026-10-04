package o00O0ooo;

import android.content.Context;
import com.airbnb.lottie.C22142OooO0oo;
import com.airbnb.lottie.C22146OooOOo0;
import com.airbnb.lottie.C22150OooOo0o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import o00OO00O.C24983OooO0Oo;

/* JADX INFO: renamed from: o00O0ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24980OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24979OooO0Oo f84711OooO00o;

    public C24980OooO0o0(C24979OooO0Oo c24979OooO0Oo, C24977OooO0O0 c24977OooO0O0) {
        this.f84711OooO00o = c24979OooO0Oo;
    }

    public final C22150OooOo0o<C22142OooO0oo> OooO00o(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C22150OooOo0o<C22142OooO0oo> c22150OooOo0oOooO0o;
        EnumC24978OooO0OO enumC24978OooO0OO;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C24979OooO0Oo c24979OooO0Oo = this.f84711OooO00o;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C24983OooO0Oo.OooO00o();
            EnumC24978OooO0OO enumC24978OooO0OO2 = EnumC24978OooO0OO.ZIP;
            c22150OooOo0oOooO0o = str3 != null ? C22146OooOOo0.OooO0o(context, new ZipInputStream(new FileInputStream(c24979OooO0Oo.OooO0OO(str, inputStream, enumC24978OooO0OO2))), str) : C22146OooOOo0.OooO0o(context, new ZipInputStream(inputStream), null);
            enumC24978OooO0OO = enumC24978OooO0OO2;
        } else {
            C24983OooO0Oo.OooO00o();
            enumC24978OooO0OO = EnumC24978OooO0OO.JSON;
            c22150OooOo0oOooO0o = str3 != null ? C22146OooOOo0.OooO0OO(new FileInputStream(c24979OooO0Oo.OooO0OO(str, inputStream, enumC24978OooO0OO).getAbsolutePath()), str) : C22146OooOOo0.OooO0OO(inputStream, null);
        }
        if (str3 != null && c22150OooOo0oOooO0o.f66812OooO00o != null) {
            File file = new File(c24979OooO0Oo.OooO0O0(), C24979OooO0Oo.OooO00o(str, enumC24978OooO0OO, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            C24983OooO0Oo.OooO00o();
            if (!zRenameTo) {
                C24983OooO0Oo.OooO0O0("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c22150OooOo0oOooO0o;
    }
}
