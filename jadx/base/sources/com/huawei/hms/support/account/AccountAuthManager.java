package com.huawei.hms.support.account;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.C18050ap;
import com.huawei.hms.hwid.C18058f;
import com.huawei.hms.support.account.common.AccountAuthException;
import com.huawei.hms.support.account.request.AccountAuthExtendedParams;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.account.service.AccountAuthServiceImpl;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class AccountAuthManager {
    /* JADX INFO: renamed from: a */
    private static Intent m80088a(Activity activity, List<Scope> list) {
        return getService(activity, C18058f.m77669a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i, accountAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthAccount authAccount, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authAccount, accountAuthExtendedParams.getExtendedScopes());
    }

    public static AuthAccount getAuthResult() {
        return C18058f.m77674b();
    }

    public static AuthAccount getAuthResultWithScopes(List<Scope> list) throws AccountAuthException {
        if (C18050ap.m77649a(list).booleanValue()) {
            throw new AccountAuthException("ScopeList should not be empty");
        }
        AuthAccount authAccountM77674b = C18058f.m77674b();
        if (authAccountM77674b == null) {
            authAccountM77674b = new AuthAccount();
        }
        authAccountM77674b.requestExtraScopes(list);
        return authAccountM77674b;
    }

    public static AuthAccount getExtendedAuthResult(AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = accountAuthExtendedParams.getExtendedScopes();
        AuthAccount authAccountM77674b = C18058f.m77674b();
        if (authAccountM77674b == null) {
            authAccountM77674b = new AuthAccount();
        }
        return authAccountM77674b.requestExtraScopes(extendedScopes);
    }

    public static AccountAuthService getService(Context context, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(context, accountAuthParams, 60400300);
    }

    public static OooO0o<AuthAccount> parseAuthResultFromIntent(Intent intent) {
        C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        AccountAuthResult accountAuthResultM77670a = C18058f.m77670a(intent);
        if (accountAuthResultM77670a == null) {
            c25834OooO0oO.OooO00o(new ApiException(new Status(8)));
        } else if (!accountAuthResultM77670a.isSuccess() || accountAuthResultM77670a.getAccount() == null) {
            c25834OooO0oO.OooO00o(new ApiException(accountAuthResultM77670a.getStatus()));
        } else {
            c25834OooO0oO.OooO0O0(accountAuthResultM77670a.getAccount());
        }
        return c25834OooO0oO.f88150OooO00o;
    }

    public static AccountAuthService getService(Activity activity, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(activity, accountAuthParams, 60400300);
    }

    public static boolean containScopes(AuthAccount authAccount, List<Scope> list) {
        if (authAccount == null) {
            return false;
        }
        if (C18050ap.m77649a(list).booleanValue()) {
            return true;
        }
        return authAccount.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams != null) {
            addAuthScopes(fragment, i, accountAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("AccountAuthExtendedParams should not be null");
    }

    public static void addAuthScopes(Activity activity, int i, List<Scope> list) {
        if (activity == null) {
            throw new NullPointerException("Activity should not be null");
        }
        if (list != null) {
            activity.startActivityForResult(m80088a(activity, list), i);
            return;
        }
        throw new NullPointerException("ScopeList should not be null");
    }

    public static void addAuthScopes(Fragment fragment, int i, List<Scope> list) {
        if (fragment == null) {
            throw new NullPointerException("Fragment should not be null");
        }
        if (list != null) {
            fragment.startActivityForResult(m80088a(fragment.getActivity(), list), i);
            return;
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
