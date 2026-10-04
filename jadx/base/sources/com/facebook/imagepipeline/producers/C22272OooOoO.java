package com.facebook.imagepipeline.producers;

import OooOOO0.AbstractC20449OooO0Oo;
import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.C22289OoooO0;
import com.huawei.hms.network.embedded.C18115b5;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o00o0Ooo.C25431OooO0oo;
import o00o0oOo.C25461OooO0Oo;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22272OooOoO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ExecutorService f67359OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f67360OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final RealtimeSinceBootClock f67361OooOoO0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOoO$OooO00o */
    public static class OooO00o extends C22271OooOo0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f67362OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f67363OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f67364OooO0o0;

        public OooO00o() {
            throw null;
        }
    }

    public C22272OooOoO(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.f67359OooOo = Executors.newFixedThreadPool(3);
        this.f67361OooOoO0 = realtimeSinceBootClock;
        this.f67360OooOo0o = i;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final OooO00o OooOO0O(OooO oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        return new OooO00o(oooO, interfaceC22288OoooO);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOOO(C22271OooOo0o c22271OooOo0o, C22289OoooO0.OooO00o oooO00o) {
        OooO00o oooO00o2 = (OooO00o) c22271OooOo0o;
        oooO00o2.f67362OooO0Oo = this.f67361OooOoO0.now();
        oooO00o2.f67357OooO0O0.OooO0OO(new C22273OooOoO0(this.f67359OooOo.submit(new OooOo(this, oooO00o2, oooO00o)), oooO00o));
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final HashMap OooOOOo(C22271OooOo0o c22271OooOo0o, int i) {
        OooO00o oooO00o = (OooO00o) c22271OooOo0o;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(oooO00o.f67364OooO0o0 - oooO00o.f67362OooO0Oo));
        map.put("fetch_time", Long.toString(oooO00o.f67363OooO0o - oooO00o.f67364OooO0o0));
        map.put(C18115b5.TOTAL_TIME, Long.toString(oooO00o.f67363OooO0o - oooO00o.f67362OooO0Oo));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    public final HttpURLConnection Oooo(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = C25461OooO0Oo.f86761OooO00o;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f67360OooOo0o);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !C25431OooO0oo.OooO00o(uri3.getScheme(), scheme)) {
            return Oooo(uri3, i - 1);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void Oooo0OO(C22271OooOo0o c22271OooOo0o) {
        ((OooO00o) c22271OooOo0o).f67363OooO0o = this.f67361OooOoO0.now();
    }
}
