package com.huawei.hms.support.hwid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.C18050ap;
import com.huawei.hms.hwid.C18077x;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import java.util.List;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class HuaweiIdAuthManager {
    /* JADX INFO: renamed from: a */
    private static Intent m80120a(Activity activity, List<Scope> list) {
        return getService(activity, C18077x.m77711a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authHuaweiId, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static AuthHuaweiId getAuthResult() {
        return C18077x.m77715b();
    }

    public static AuthHuaweiId getAuthResultWithScopes(List<Scope> list) throws HuaweiIdAuthException {
        if (C18050ap.m77649a(list).booleanValue()) {
            throw new HuaweiIdAuthException("ScopeList should not be empty");
        }
        AuthHuaweiId authHuaweiIdM77715b = C18077x.m77715b();
        if (authHuaweiIdM77715b == null) {
            authHuaweiIdM77715b = new AuthHuaweiId();
        }
        authHuaweiIdM77715b.requestExtraScopes(list);
        return authHuaweiIdM77715b;
    }

    public static AuthHuaweiId getExtendedAuthResult(HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = huaweiIdAuthExtendedParams.getExtendedScopes();
        AuthHuaweiId authHuaweiIdM77715b = C18077x.m77715b();
        if (authHuaweiIdM77715b == null) {
            authHuaweiIdM77715b = new AuthHuaweiId();
        }
        return authHuaweiIdM77715b.requestExtraScopes(extendedScopes);
    }

    public static HuaweiIdAuthService getService(Context context, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParams, 60400300);
    }

    public static OooO0o<AuthHuaweiId> parseAuthResultFromIntent(Intent intent) {
        C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
        HuaweiIdAuthResult huaweiIdAuthResultM77712a = C18077x.m77712a(intent);
        if (huaweiIdAuthResultM77712a == null) {
            c25834OooO0oO.OooO00o(new ApiException(new Status(8)));
        } else if (!huaweiIdAuthResultM77712a.isSuccess() || huaweiIdAuthResultM77712a.getHuaweiId() == null) {
            c25834OooO0oO.OooO00o(new ApiException(huaweiIdAuthResultM77712a.getStatus()));
        } else {
            c25834OooO0oO.OooO0O0(huaweiIdAuthResultM77712a.getHuaweiId());
        }
        return c25834OooO0oO.f88150OooO00o;
    }

    public static HuaweiIdAuthService getService(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(activity, huaweiIdAuthParams, 60400300);
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, List<Scope> list) {
        if (authHuaweiId == null) {
            return false;
        }
        if (C18050ap.m77649a(list).booleanValue()) {
            return true;
        }
        return authHuaweiId.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams != null) {
            addAuthScopes(fragment, i, huaweiIdAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
    }

    public static void addAuthScopes(Activity activity, int i, List<Scope> list) {
        if (activity == null) {
            throw new NullPointerException("Activity should not be null");
        }
        if (list != null) {
            activity.startActivityForResult(m80120a(activity, list), i);
            return;
        }
        throw new NullPointerException("ScopeList should not be null");
    }

    public static void addAuthScopes(Fragment fragment, int i, List<Scope> list) {
        if (fragment == null) {
            throw new NullPointerException("Fragment should not be null");
        }
        if (list != null) {
            fragment.startActivityForResult(m80120a(fragment.getActivity(), list), i);
            return;
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
