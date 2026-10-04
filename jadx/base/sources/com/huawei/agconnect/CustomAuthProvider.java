package com.huawei.agconnect;

import com.huawei.agconnect.core.service.auth.Token;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes8.dex */
public interface CustomAuthProvider {
    OooO0o<Token> getTokens(boolean z);

    String getUid();
}
