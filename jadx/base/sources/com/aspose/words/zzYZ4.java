package com.aspose.words;

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

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ4 implements zzYZ1 {
    private String zzXZ5;
    private String zzXZx;

    public zzYZ4(String str, String str2) {
        this.zzXZ5 = str;
        this.zzXZx = str2;
    }

    private static String encode(String str) {
        return str.replaceAll("\\+", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR).replaceAll("\\/", C18115b5.CONNECTOR);
    }

    private String zzIb(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(this.zzXZx.getBytes("UTF-8"), "HmacSHA1"));
            String str2 = new String(com.aspose.words.internal.zzYGH.encode(mac.doFinal(str.toLowerCase().getBytes("UTF-8"))), "UTF-8");
            if (str2.endsWith("=")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            return encode(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private void zzW(String str, Map<String, String> map) {
        String strZzIb = zzIb(str);
        map.put("clientkey", this.zzXZ5);
        map.put(FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY, strZzIb);
    }

    @Override // com.aspose.words.zzYZ1
    public final String zzY2(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(this.zzXZx.getBytes("UTF-8"), "HmacSHA1"));
            String str = new String(com.aspose.words.internal.zzYGH.encode(mac.doFinal(bArr)), "UTF-8");
            if (str.endsWith("=")) {
                str = str.substring(0, str.length() - 1);
            }
            return encode(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    @Override // com.aspose.words.zzYZ1
    public final void zzZ(StringBuilder sb, Map<String, String> map) {
        String string = sb.toString();
        if (!string.startsWith("http")) {
            zzW(string, map);
            return;
        }
        try {
            sb.append(new URL(string).getQuery() == null ? MsalUtils.QUERY_STRING_SYMBOL : "&");
            sb.append("clientkey=");
            sb.append(this.zzXZ5);
            String strZzIb = zzIb(sb.toString());
            sb.append("&signature=");
            sb.append(strZzIb);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
