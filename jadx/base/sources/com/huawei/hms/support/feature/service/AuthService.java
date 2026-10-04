package com.huawei.hms.support.feature.service;

import android.content.Intent;
import com.huawei.hms.common.HuaweiApiInterface;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public interface AuthService extends HuaweiApiInterface {
    OooO0o<Void> cancelAuthorization();

    Intent getSignInIntent();

    OooO0o<Void> signOut();
}
