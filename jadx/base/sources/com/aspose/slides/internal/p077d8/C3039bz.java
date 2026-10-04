package com.aspose.slides.internal.p077d8;

import android.content.pm.Signature;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.bz */
/* JADX INFO: loaded from: classes3.dex */
class C3039bz implements InterfaceC3078qm {

    /* JADX INFO: renamed from: k4 */
    private String f8930k4;

    /* JADX INFO: renamed from: x1 */
    private String f8931x1;

    public C3039bz(String str, String str2) {
        this.f8930k4 = str;
        this.f8931x1 = str2;
    }

    /* JADX INFO: renamed from: k4 */
    private String m12804k4(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA512");
            mac.init(new SecretKeySpec(this.f8931x1.getBytes("UTF-8"), "HmacSHA512"));
            return m12806x1(new String(C3056h4.m12943k4(mac.doFinal(str.toLowerCase().getBytes("UTF-8"))), "UTF-8"));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static String m12806x1(String str) {
        String strReplaceAll = str.replaceAll("\\+", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR).replaceAll("\\/", C18115b5.CONNECTOR);
        while (strReplaceAll.endsWith("=")) {
            strReplaceAll = Signature.toCharsString();
        }
        return strReplaceAll;
    }

    @Override // com.aspose.slides.internal.p077d8.InterfaceC3078qm
    /* JADX INFO: renamed from: k4 */
    public String mo12807k4(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA512");
            mac.init(new SecretKeySpec(this.f8931x1.getBytes("UTF-8"), "HmacSHA512"));
            return m12806x1(new String(C3056h4.m12943k4(mac.doFinal(bArr)), "UTF-8"));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12805k4(String str, Map<String, String> map) {
        String strM12804k4 = m12804k4(str);
        map.put("clientkey", this.f8930k4);
        map.put(FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY, strM12804k4);
    }

    @Override // com.aspose.slides.internal.p077d8.InterfaceC3078qm
    /* JADX INFO: renamed from: k4 */
    public void mo12808k4(StringBuilder sb, Map<String, String> map) {
        String string = sb.toString();
        if (!string.startsWith("http")) {
            m12805k4(string, map);
            return;
        }
        try {
            sb.append(new URL(string).getQuery() == null ? MsalUtils.QUERY_STRING_SYMBOL : "&");
            sb.append("clientkey=");
            sb.append(this.f8930k4);
            String strM12804k4 = m12804k4(sb.toString());
            sb.append("&signature=");
            sb.append(strM12804k4);
        } catch (MalformedURLException e) {
            C3085sv.m13082k4(e);
        }
    }
}
