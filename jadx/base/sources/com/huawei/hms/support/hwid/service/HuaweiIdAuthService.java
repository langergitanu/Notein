package com.huawei.hms.support.hwid.service;

import android.content.Intent;
import com.huawei.hms.support.feature.service.AuthService;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public interface HuaweiIdAuthService extends AuthService {
    Intent getSignInIntent(String str);

    OooO0o<AuthHuaweiId> silentSignIn();

    OooO0o<AuthHuaweiId> silentSignIn(String str);
}
