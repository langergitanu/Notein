package o0ooO00o;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0ooO00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31428OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static AssetManager f112202OooO00o;

    public static InputStream OooO00o(String str) throws IOException {
        if (f112202OooO00o == null) {
            Log.e("PdfBox-Android", "PDFBoxResourceLoader is not initialized, call PDFBoxResourceLoader.init() before use");
        }
        return f112202OooO00o.open(str);
    }
}
