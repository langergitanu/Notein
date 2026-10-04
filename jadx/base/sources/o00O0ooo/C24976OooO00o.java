package o00O0ooo;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import o00OO00O.C24983OooO0Oo;

/* JADX INFO: renamed from: o00O0ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24976OooO00o implements Closeable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HttpURLConnection f84705OooOo0o;

    public C24976OooO00o(HttpURLConnection httpURLConnection) {
        this.f84705OooOo0o = httpURLConnection;
    }

    public final String OooO00o() {
        HttpURLConnection httpURLConnection = this.f84705OooOo0o;
        boolean z = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z = true;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            C24983OooO0Oo.OooO0OO("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f84705OooOo0o.disconnect();
    }
}
