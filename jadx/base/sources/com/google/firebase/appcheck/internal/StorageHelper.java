package com.google.firebase.appcheck.internal;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.Logger;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes8.dex */
public class StorageHelper {
    static final String PREFS_TEMPLATE = "com.google.firebase.appcheck.store.%s";
    static final String TOKEN_KEY = "com.google.firebase.appcheck.APP_CHECK_TOKEN";
    static final String TOKEN_TYPE_KEY = "com.google.firebase.appcheck.TOKEN_TYPE";
    private static final Logger logger = new Logger("StorageHelper");
    private Lazy<SharedPreferences> sharedPreferences;

    /* JADX INFO: renamed from: com.google.firebase.appcheck.internal.StorageHelper$1 */
    public static /* synthetic */ class C169601 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$appcheck$internal$StorageHelper$TokenType */
        static final /* synthetic */ int[] f51757x536d9f9;

        static {
            int[] iArr = new int[TokenType.values().length];
            f51757x536d9f9 = iArr;
            try {
                iArr[TokenType.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51757x536d9f9[TokenType.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum TokenType {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public StorageHelper(final Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        final String str2 = "com.google.firebase.appcheck.store." + str;
        this.sharedPreferences = new Lazy<>(new Provider() { // from class: com.google.firebase.appcheck.internal.OooO0oo
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return StorageHelper.lambda$new$0(context, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public void clearSharedPrefs() {
        this.sharedPreferences.get().edit().remove(TOKEN_KEY).remove(TOKEN_TYPE_KEY).apply();
    }

    public AppCheckToken retrieveAppCheckToken() {
        String string = this.sharedPreferences.get().getString(TOKEN_TYPE_KEY, null);
        String string2 = this.sharedPreferences.get().getString(TOKEN_KEY, null);
        if (string != null && string2 != null) {
            try {
                int i = C169601.f51757x536d9f9[TokenType.valueOf(string).ordinal()];
                if (i == 1) {
                    return DefaultAppCheckToken.deserializeTokenFromJsonString(string2);
                }
                if (i == 2) {
                    return DefaultAppCheckToken.constructFromRawToken(string2);
                }
                logger.m75263e("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e) {
                Logger logger2 = logger;
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                sbOooO0o0.append(e.getMessage());
                logger2.m75263e(sbOooO0o0.toString());
                clearSharedPrefs();
            }
        }
        return null;
    }

    public void saveAppCheckToken(AppCheckToken appCheckToken) {
        if (appCheckToken instanceof DefaultAppCheckToken) {
            this.sharedPreferences.get().edit().putString(TOKEN_KEY, ((DefaultAppCheckToken) appCheckToken).serializeTokenToString()).putString(TOKEN_TYPE_KEY, TokenType.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            this.sharedPreferences.get().edit().putString(TOKEN_KEY, appCheckToken.getToken()).putString(TOKEN_TYPE_KEY, TokenType.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }
}
