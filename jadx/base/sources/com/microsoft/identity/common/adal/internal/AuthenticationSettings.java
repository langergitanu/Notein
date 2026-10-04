package com.microsoft.identity.common.adal.internal;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.adal.internal.util.StringExtensions;
import com.microsoft.identity.common.logging.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public enum AuthenticationSettings {
    INSTANCE;

    private static final int DEFAULT_EXPIRATION_BUFFER = 300;
    private static final int DEFAULT_READ_CONNECT_TIMEOUT = 30000;
    private static final int SECRET_RAW_KEY_LENGTH = 32;
    private static final String TAG = "AuthenticationSettings";
    private String mActivityPackageName;
    private String mSharedPrefPackageName;
    private final Map<String, byte[]> mBrokerSecretKeys = new HashMap(2);
    private AtomicReference<byte[]> mSecretKeyData = new AtomicReference<>();
    private String mBrokerPackageName = AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME;
    private String mBrokerSignature = AuthenticationConstants.Broker.COMPANY_PORTAL_APP_RELEASE_SIGNATURE_SHA512;
    private boolean mEnableHardwareAcceleration = true;
    private boolean mUseBroker = false;
    private int mExpirationBuffer = 300;
    private int mConnectTimeOut = 30000;
    private int mReadTimeOut = 30000;
    private boolean mIgnoreKeyLoaderNotFoundError = false;

    AuthenticationSettings() {
    }

    public void clearBrokerSecretKeys() {
        this.mBrokerSecretKeys.clear();
    }

    public void clearLegacySecretKeyConfiguration() {
        Logger.info(TAG + ":clearLegacySecretKeyConfiguration", "Clearing legacy secret key configuration.");
        this.mBrokerSecretKeys.clear();
        this.mSecretKeyData.set(null);
    }

    public void clearSecretKeysForTestCases() {
        clearLegacySecretKeyConfiguration();
    }

    public String getActivityPackageName() {
        return this.mActivityPackageName;
    }

    public String getBrokerPackageName() {
        return this.mBrokerPackageName;
    }

    public Map<String, byte[]> getBrokerSecretKeys() {
        return Collections.unmodifiableMap(this.mBrokerSecretKeys);
    }

    public String getBrokerSignature() {
        return this.mBrokerSignature;
    }

    public int getConnectTimeOut() {
        return this.mConnectTimeOut;
    }

    public boolean getDisableWebViewHardwareAcceleration() {
        return this.mEnableHardwareAcceleration;
    }

    public int getExpirationBuffer() {
        return this.mExpirationBuffer;
    }

    public int getReadTimeOut() {
        return this.mReadTimeOut;
    }

    public byte[] getSecretKeyData() {
        return this.mSecretKeyData.get();
    }

    public String getSharedPrefPackageName() {
        return this.mSharedPrefPackageName;
    }

    @Deprecated
    public boolean getSkipBroker() {
        return !this.mUseBroker;
    }

    public boolean getUseBroker() {
        return this.mUseBroker;
    }

    public void setActivityPackageName(String str) {
        if (StringExtensions.isNullOrBlank(str)) {
            throw new IllegalArgumentException("activityPackageName cannot be empty or null");
        }
        this.mActivityPackageName = str;
    }

    public void setBrokerPackageName(String str) {
        if (StringExtensions.isNullOrBlank(str)) {
            throw new IllegalArgumentException("packageName cannot be empty or null");
        }
        this.mBrokerPackageName = str;
    }

    public void setBrokerSecretKeys(Map<String, byte[]> map) {
        if (map == null) {
            throw new IllegalArgumentException("The passed in secret key map is null.");
        }
        if (map.size() != 2) {
            throw new IllegalArgumentException("Expect two keys are passed in.");
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (entry.getValue() == null || entry.getValue().length != 32) {
                throw new IllegalArgumentException("Passed in raw key is null or length is not as expected. ");
            }
            this.mBrokerSecretKeys.put(entry.getKey(), entry.getValue());
        }
    }

    public void setBrokerSignature(String str) {
        if (StringExtensions.isNullOrBlank(str)) {
            throw new IllegalArgumentException("brokerSignature cannot be empty or null");
        }
        this.mBrokerSignature = str;
    }

    public void setConnectTimeOut(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid timeOutMillis");
        }
        this.mConnectTimeOut = i;
    }

    public void setDisableWebViewHardwareAcceleration(boolean z) {
        this.mEnableHardwareAcceleration = z;
    }

    public void setExpirationBuffer(int i) {
        this.mExpirationBuffer = i;
    }

    public void setIgnoreKeyLoaderNotFoundError(boolean z) {
        this.mIgnoreKeyLoaderNotFoundError = z;
    }

    public void setReadTimeOut(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid timeOutMillis");
        }
        this.mReadTimeOut = i;
    }

    public void setSecretKey(byte[] bArr) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":setSecretKey");
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("rawKey");
        }
        Logger.warn(strOooO0OO, "You're using setSecretKey in a version of android that supports keyStore functionality.  Consider not doing this, as it only exists for devices with an SDK lower than 18");
        this.mSecretKeyData.set(bArr);
    }

    public void setSharedPrefPackageName(String str) {
        this.mSharedPrefPackageName = str;
    }

    @Deprecated
    public void setSkipBroker(boolean z) {
        this.mUseBroker = !z;
    }

    public void setUseBroker(boolean z) {
        this.mUseBroker = z;
    }

    public boolean shouldIgnoreKeyLoaderNotFoundError() {
        return this.mIgnoreKeyLoaderNotFoundError;
    }
}
