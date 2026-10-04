package com.microsoft.identity.common.java.adal.cache;

import OooOO0.OooO0OO;
import OoooooO.C21445Oooo;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.util.StringUtil;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class CacheKey implements Serializable {
    static final String FRT_ENTRY_PREFIX = "foci-";
    private static final long serialVersionUID = 8067972995583126404L;
    private String mAuthority;
    private String mClientId;
    private String mFamilyClientId;
    private boolean mIsMultipleResourceRefreshToken;
    private String mResource;
    private String mUserId;

    public static String createCacheKey(String str, String str2, String str3, boolean z, String str4, String str5) {
        if (str == null) {
            throw new IllegalArgumentException("authority");
        }
        if (str3 == null && str5 == null) {
            throw new IllegalArgumentException("both clientId and familyClientId are null");
        }
        CacheKey cacheKey = new CacheKey();
        if (!z) {
            if (str2 == null) {
                throw new IllegalArgumentException("resource");
            }
            cacheKey.mResource = str2;
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        cacheKey.mAuthority = lowerCase;
        if (lowerCase.endsWith("/")) {
            cacheKey.mAuthority = (String) cacheKey.mAuthority.subSequence(0, r3.length() - 1);
        }
        if (str3 != null) {
            cacheKey.mClientId = str3.toLowerCase(locale);
        }
        if (str5 != null) {
            cacheKey.mFamilyClientId = FRT_ENTRY_PREFIX.concat(str5).toLowerCase(locale);
        }
        cacheKey.mIsMultipleResourceRefreshToken = z;
        if (!StringUtil.isNullOrEmpty(str4)) {
            cacheKey.mUserId = str4.toLowerCase(locale);
        }
        return cacheKey.toString();
    }

    public static String createCacheKeyForFRT(String str, String str2, String str3) {
        return createCacheKey(str, null, null, true, str3, str2);
    }

    public static String createCacheKeyForMRRT(String str, String str2, String str3) {
        return createCacheKey(str, null, str2, true, str3, null);
    }

    public static String createCacheKeyForRTEntry(String str, String str2, String str3, String str4) {
        return createCacheKey(str, str2, str3, false, str4, null);
    }

    public String getAuthority() {
        return this.mAuthority;
    }

    public String getClientId() {
        return this.mClientId;
    }

    public boolean getIsMultipleResourceRefreshToken() {
        return this.mIsMultipleResourceRefreshToken;
    }

    public String getResource() {
        return this.mResource;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String toString() {
        boolean zIsNullOrEmpty = StringUtil.isNullOrEmpty(this.mFamilyClientId);
        String str = BackupFile.PREFIX_NOTE_DIR;
        if (zIsNullOrEmpty) {
            Locale locale = Locale.US;
            String str2 = this.mAuthority;
            String str3 = this.mResource;
            String str4 = this.mClientId;
            if (this.mIsMultipleResourceRefreshToken) {
                str = "y";
            }
            String str5 = this.mUserId;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("$");
            sb.append(str3);
            sb.append("$");
            sb.append(str4);
            return C21445Oooo.OooO0O0(sb, "$", str, "$", str5);
        }
        Locale locale2 = Locale.US;
        String str6 = this.mAuthority;
        String str7 = this.mResource;
        String str8 = this.mClientId;
        if (this.mIsMultipleResourceRefreshToken) {
            str = "y";
        }
        String str9 = this.mUserId;
        String str10 = this.mFamilyClientId;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str6);
        sb2.append("$");
        sb2.append(str7);
        sb2.append("$");
        sb2.append(str8);
        OooO0OO.OooO0o0(sb2, "$", str, "$", str9);
        return OooO00o.OooO0OO(sb2, "$", str10);
    }
}
