package o0OOOoO0;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.OooOOO;
import oOo00OoO.C34524OooO0Oo;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: renamed from: o0OOOoO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27191OooO implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final DateTimeFormatter f94959OooO00o;

    /* JADX INFO: renamed from: o0OOOoO0.OooO$OooO00o */
    public static final class OooO00o {
    }

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss O", Locale.US).withZone(ZoneOffset.UTC);
        OooOOO0.OooO0o(dateTimeFormatterWithZone, "withZone(...)");
        f94959OooO00o = dateTimeFormatterWithZone;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws NoSuchAlgorithmException, IOException {
        String strOooo00o;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        String str = ZonedDateTime.now(ZoneOffset.UTC).format(f94959OooO00o);
        Request request = realInterceptorChain.f124446OooO0o0;
        String str2 = request.f124239OooO0O0;
        Locale US = Locale.US;
        OooOOO0.OooO0o(US, "US");
        String upperCase = str2.toUpperCase(US);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        if (upperCase.equals("GET") || upperCase.equals("DELETE")) {
            String strOooO0O0 = request.f124238OooO00o.OooO0O0();
            Charset UTF_8 = StandardCharsets.UTF_8;
            OooOOO0.OooO0o(UTF_8, "UTF_8");
            byte[] bytes = strOooO0O0.getBytes(UTF_8);
            OooOOO0.OooO0o(bytes, "getBytes(...)");
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
            OooOOO0.OooO0o(bArrDigest, "digest(...)");
            strOooo00o = OooOOO.Oooo00o(bArrDigest, "", new C27199OooO0oo(0), 30);
        } else {
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            RequestBody requestBody = request.f124241OooO0Oo;
            if (requestBody != null) {
                requestBody.writeTo(c34524OooO0Oo);
            }
            byte[] bArrDigest2 = MessageDigest.getInstance("MD5").digest(c34524OooO0Oo.o0000oo(c34524OooO0Oo.f123723OooOo));
            OooOOO0.OooO0o(bArrDigest2, "digest(...)");
            strOooo00o = OooOOO.Oooo00o(bArrDigest2, "", new C27199OooO0oo(0), 30);
        }
        String strOooO00o = C22237OooO0o0.OooO00o("vSdHoTTQjFBgCtzXrstyXFFgGIltUjMC", strOooo00o, "application/json", str);
        MessageDigest messageDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1);
        byte[] bytes2 = strOooO00o.getBytes(C33580OooO00o.f121231OooO0O0);
        OooOOO0.OooO0o(bytes2, "getBytes(...)");
        byte[] bArrDigest3 = messageDigest.digest(bytes2);
        OooOOO0.OooO0o(bArrDigest3, "digest(...)");
        String strOooO00o2 = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("WPS-2:AK20250613SIFAAS:", OooOOO.Oooo00o(bArrDigest3, "", new C27199OooO0oo(0), 30));
        Request.Builder builderOooO00o = request.OooO00o();
        OooOOO0.OooO0Oo(str);
        builderOooO00o.OooO0OO("Date", str);
        builderOooO00o.OooO0OO("Content-Md5", strOooo00o);
        builderOooO00o.OooO0OO("Authorization", strOooO00o2);
        builderOooO00o.OooO0OO("Content-Type", "application/json");
        return realInterceptorChain.OooO00o(builderOooO00o.OooO0O0());
    }
}
