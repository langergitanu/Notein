package com.microsoft.identity.common.migration;

import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.util.TaskCompletedCallback;

/* JADX INFO: loaded from: classes9.dex */
public interface IMultiTypeNameValueStorageReencrypter {

    public interface IStringDecrypter {
        String decrypt(String str) throws Exception;
    }

    public interface IStringEncrypter {
        String encrypt(String str) throws Exception;
    }

    public static class ReencryptionParams {
        private final boolean mAbortOnError;
        private final boolean mEraseAllOnError;
        private final boolean mEraseEntryOnError;

        public ReencryptionParams(boolean z, boolean z2, boolean z3) {
            this.mAbortOnError = z;
            this.mEraseEntryOnError = z2;
            this.mEraseAllOnError = z3;
        }

        public boolean abortOnError() {
            return this.mAbortOnError;
        }

        public boolean eraseAllOnError() {
            return this.mEraseAllOnError;
        }

        public boolean eraseEntryOnError() {
            return this.mEraseEntryOnError;
        }
    }

    IMigrationOperationResult reencrypt(INameValueStorage<String> iNameValueStorage, IStringEncrypter iStringEncrypter, IStringDecrypter iStringDecrypter, ReencryptionParams reencryptionParams);

    void reencryptAsync(INameValueStorage<String> iNameValueStorage, IStringEncrypter iStringEncrypter, IStringDecrypter iStringDecrypter, ReencryptionParams reencryptionParams, TaskCompletedCallback<IMigrationOperationResult> taskCompletedCallback);
}
