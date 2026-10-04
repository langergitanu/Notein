package com.microsoft.identity.common.internal.p590ui.browser;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.microsoft.identity.common.internal.broker.PackageHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Browser {
    private static final String DIGEST_SHA_512 = "SHA-512";
    private static final int PRIME_HASH_FACTOR = 92821;
    private final Boolean mIsCustomTabsServiceSupported;
    private final String mPackageName;
    private final Set<String> mSignatureHashes;
    private final String mVersion;

    public Browser(PackageInfo packageInfo) {
        this(packageInfo.packageName, generateSignatureHashes(PackageHelper.getSignatures(packageInfo)), packageInfo.versionName, false);
    }

    public static Set<String> generateSignatureHashes(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance(DIGEST_SHA_512).digest(signature.toByteArray()), 10));
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Browser)) {
            Browser browser = (Browser) obj;
            if (this.mPackageName.equals(browser.getPackageName()) && this.mVersion.equals(browser.getVersion()) && this.mSignatureHashes.equals(browser.getSignatureHashes())) {
                return true;
            }
        }
        return false;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public Set<String> getSignatureHashes() {
        return this.mSignatureHashes;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        int iOooO0O0 = (this.mIsCustomTabsServiceSupported.booleanValue() ? 1 : 0) + OooO00o.OooO0O0(this.mPackageName.hashCode() * PRIME_HASH_FACTOR, PRIME_HASH_FACTOR, this.mVersion);
        Iterator<String> it = this.mSignatureHashes.iterator();
        while (it.hasNext()) {
            iOooO0O0 = (iOooO0O0 * PRIME_HASH_FACTOR) + it.next().hashCode();
        }
        return iOooO0O0;
    }

    public boolean isCustomTabsServiceSupported() {
        return this.mIsCustomTabsServiceSupported.booleanValue();
    }

    public Browser(PackageInfo packageInfo, Boolean bool) {
        this(packageInfo.packageName, generateSignatureHashes(PackageHelper.getSignatures(packageInfo)), packageInfo.versionName, bool.booleanValue());
    }

    public Browser(String str, Set<String> set, String str2, boolean z) {
        this.mPackageName = str;
        this.mSignatureHashes = set;
        this.mVersion = str2;
        this.mIsCustomTabsServiceSupported = Boolean.valueOf(z);
    }
}
