package o00ooOo;

import android.util.Log;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;

/* JADX INFO: renamed from: o00ooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25779OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String[] f87950OooO00o = new String[5];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f87951OooO0O0 = 0;

    public final synchronized boolean OooO00o(String str) {
        for (String str2 : this.f87950OooO00o) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        OooO0O0(sb);
        Log.w("SoLoader", sb.toString());
        String[] strArr = this.f87950OooO00o;
        int i = this.f87951OooO0O0;
        strArr[i % strArr.length] = str;
        this.f87951OooO0O0 = i + 1;
        return true;
    }

    public final synchronized void OooO0O0(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f87951OooO0O0);
            sb.append(" base apk paths.");
            if (this.f87951OooO0O0 > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = this.f87950OooO00o;
                if (i < strArr.length) {
                    int i2 = (this.f87951OooO0O0 - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
