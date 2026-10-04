package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.words.internal.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22245OooO0oO {
    public static /* synthetic */ byte OooO00o(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 8;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String OooO0O0(int i) {
        switch (i) {
            case 1:
                return "";
            case 2:
                return "HmacMD5";
            case 3:
                return "HmacSHA1";
            case 4:
                return "HmacSHA224";
            case 5:
                return KeyUtil.HMAC_ALGORITHM;
            case 6:
                return "HmacSHA384";
            case 7:
                return "HmacSHA512";
            case 8:
                return "Intrinsic";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String OooO0OO(int i) {
        switch (i) {
            case 1:
                return "";
            case 2:
                return "MD5";
            case 3:
                return IDevicePopManager.SHA_1;
            case 4:
                return "SHA-224";
            case 5:
                return KeyUtil.HMAC_KEY_HASH_ALGORITHM;
            case 6:
                return "SHA-384";
            case 7:
                return "SHA-512";
            case 8:
                return "INTRINSIC";
            default:
                throw null;
        }
    }

    public static String OooO0Oo(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static /* synthetic */ String OooO0o0(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "MD5";
            case 3:
                return "SHA1";
            case 4:
                return "SHA224";
            case 5:
                return "SHA256";
            case 6:
                return "SHA384";
            case 7:
                return "SHA512";
            case 8:
                return "INTRINSIC";
            default:
                return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
    }
}
