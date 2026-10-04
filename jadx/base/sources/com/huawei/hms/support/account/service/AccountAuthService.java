package com.huawei.hms.support.account.service;

import android.content.Intent;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.feature.service.AuthService;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public interface AccountAuthService extends AuthService {
    OooO0o<AssistTokenResult> getAssistToken(GetAssistTokenRequest getAssistTokenRequest);

    OooO0o<AccountIcon> getChannel();

    Intent getIndependentSignInIntent(String str);

    OooO0o<Void> logout();

    OooO0o<AuthAccount> silentSignIn();

    OooO0o<Void> startAssistLogin(String str);
}
