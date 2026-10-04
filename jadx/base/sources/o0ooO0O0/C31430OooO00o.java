package o0ooO0O0;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.aspose.slides.C22205OooOOo;
import com.facebook.soloader.OooO0OO;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.miui.penengine.p596e.C18773h;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0ooO0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C31430OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleDateFormat f112203OooO00o = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static final String OooO00o(long j) {
        if (j <= 0) {
            return "unknown";
        }
        long j2 = 1000;
        long j3 = j / j2;
        long j4 = 3600;
        long j5 = j3 / j4;
        long j6 = 60;
        long j7 = (j3 % j4) / j6;
        long j8 = j3 % j6;
        long j9 = j % j2;
        if (j5 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(j5);
            sb.append(C18773h.f57233c);
            sb.append(j7);
            C22205OooOOo.OooO0OO(j8, "m", "s", sb);
            return android.support.v4.media.session.OooO00o.OooO00o(j9, TranslateLanguage.MALAY, sb);
        }
        if (j7 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j7);
            sb2.append("m");
            sb2.append(j8);
            return OooO0OO.OooO00o(j9, "s", TranslateLanguage.MALAY, sb2);
        }
        if (j8 <= 0) {
            return j9 + TranslateLanguage.MALAY;
        }
        return j8 + "s" + j9 + TranslateLanguage.MALAY;
    }

    public static final String OooO0O0(long j) {
        String strOooO0O0 = androidx.concurrent.futures.OooO00o.OooO0O0(j, "unknown_");
        if (j <= 0) {
            return strOooO0O0;
        }
        try {
            String str = f112203OooO00o.format(new Date(j));
            OooOOO0.OooO0Oo(str);
            return str;
        } catch (Exception e) {
            Log.e("TimeFormat", "format date exception: " + e);
            return strOooO0O0;
        }
    }

    public static final String OooO0OO(long j) {
        return j < 1024 ? String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j)}, 1)).concat("B") : j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j / 1024.0f)}, 1)).concat("KB") : j < 1073741824 ? String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((j / 1024.0f) / 1024.0f)}, 1)).concat("MB") : String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((j / 1024.0f) / 1024.0f) / 1024.0f)}, 1)).concat("GB");
    }
}
