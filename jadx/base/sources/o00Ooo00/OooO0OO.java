package o00Ooo00;

import androidx.core.content.C21638OooO0Oo;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f85288OooO00o = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void OooO00o(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(C21638OooO0Oo.OooO00o(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                OooO00o(file2);
            }
            if (!file2.delete()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file2, "failed to delete file: "));
            }
        }
    }
}
