package o00o0o0O;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o00o0o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25440OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f86722OooO00o = C34444Oooo0O0.OooO0oo(new C32443OooOOO("mkv", "video/x-matroska"), new C32443OooOOO("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public static final String OooO00o(String path) {
        String strSubstring;
        OooOOO0.OooO0oO(path, "path");
        int iOooo0oO = C33599OooOo0O.Oooo0oO(path, FilenameUtils.EXTENSION_SEPARATOR, 0, 6);
        if (iOooo0oO < 0 || iOooo0oO == path.length() - 1) {
            strSubstring = null;
        } else {
            strSubstring = path.substring(iOooo0oO + 1);
            OooOOO0.OooO0o(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return null;
        }
        Locale US = Locale.US;
        OooOOO0.OooO0o(US, "US");
        String lowerCase = strSubstring.toLowerCase(US);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String mimeTypeFromExtension = C25441OooO0O0.f86725OooO0OO.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = C25441OooO0O0.f86723OooO00o.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) f86722OooO00o.get(lowerCase) : mimeTypeFromExtension;
    }
}
