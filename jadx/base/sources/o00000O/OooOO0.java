package o00000O;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {
    public static final String OooO00o(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = inputStreamReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }
}
