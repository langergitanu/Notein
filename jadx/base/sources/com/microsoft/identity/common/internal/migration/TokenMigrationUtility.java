package com.microsoft.identity.common.internal.migration;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.BaseAccount;
import com.microsoft.identity.common.java.cache.IShareSingleSignOnState;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.providers.oauth2.RefreshToken;
import com.microsoft.identity.common.logging.Logger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public class TokenMigrationUtility<T extends BaseAccount, U extends RefreshToken> {
    private static final String TAG = "TokenMigrationUtility";
    private static final ExecutorService sBackgroundExecutor = Executors.newCachedThreadPool();

    public void _import(final IMigrationAdapter<T, U> iMigrationAdapter, final Map<String, String> map, final IShareSingleSignOnState<T, U> iShareSingleSignOnState, final TokenMigrationCallback tokenMigrationCallback) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":_import");
        sBackgroundExecutor.execute(new Runnable() { // from class: com.microsoft.identity.common.internal.migration.TokenMigrationUtility.1
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                for (Map.Entry<T, U> entry : iMigrationAdapter.adapt(map)) {
                    try {
                        iShareSingleSignOnState.setSingleSignOnState(entry.getKey(), entry.getValue());
                        i++;
                    } catch (ClientException unused) {
                        Logger.warn(strOooO0OO, "Failed to save account/refresh token . Skipping ");
                    }
                }
                tokenMigrationCallback.onMigrationFinished(i);
            }
        });
    }
}
