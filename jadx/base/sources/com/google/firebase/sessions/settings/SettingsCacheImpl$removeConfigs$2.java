package com.google.firebase.sessions.settings;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m80612d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", TranslateLanguage.ITALIAN}, m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", m80623f = "SettingsCache.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class SettingsCacheImpl$removeConfigs$2 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<SessionConfigs, Continuation<? super SessionConfigs>, Object> {
    int label;

    public SettingsCacheImpl$removeConfigs$2(Continuation<? super SettingsCacheImpl$removeConfigs$2> continuation) {
        super(2, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new SettingsCacheImpl$removeConfigs$2(continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
        return ((SettingsCacheImpl$removeConfigs$2) create(sessionConfigs, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return SessionConfigsSerializer.INSTANCE.getDefaultValue();
    }
}
