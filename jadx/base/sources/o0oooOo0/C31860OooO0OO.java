package o0oooOo0;

import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import o0oooOo0.C31859OooO0O0;

/* JADX INFO: renamed from: o0oooOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31860OooO0OO {
    public final C31859OooO0O0 OooO00o(C31858OooO00o c31858OooO00o) throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c31858OooO00o.f113551OooO00o).openConnection();
        try {
            httpURLConnection.setConnectTimeout((int) 10000);
            httpURLConnection.setReadTimeout((int) 15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setInstanceFollowRedirects(c31858OooO00o.f113552OooO0O0);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            C31859OooO0O0.OooO00o oooO00o = new C31859OooO0O0.OooO00o();
            oooO00o.f113559OooO0O0 = responseCode;
            httpURLConnection.getHeaderField("Location");
            httpURLConnection.getHeaderField(HttpHeaders.SET_COOKIE);
            oooO00o.f113558OooO00o = httpURLConnection.getHeaderFields();
            if (responseCode != 200) {
                return new C31859OooO0O0(oooO00o);
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 1024);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            oooO00o.f113560OooO0OO = sb.toString();
                            C31859OooO0O0 c31859OooO0O0 = new C31859OooO0O0(oooO00o);
                            bufferedReader.close();
                            return c31859OooO0O0;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader == null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
