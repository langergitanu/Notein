package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m80623f = "SettingsCache.kt", m80624l = {107}, m80625m = "removeConfigs$com_google_firebase_firebase_sessions")
public final class SettingsCacheImpl$removeConfigs$1 extends AbstractC32479OooO0OO {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$removeConfigs$1(SettingsCacheImpl settingsCacheImpl, Continuation<? super SettingsCacheImpl$removeConfigs$1> continuation) {
        super(continuation);
        this.this$0 = settingsCacheImpl;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
