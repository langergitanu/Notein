package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lorg/json/JSONObject;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m80623f = "RemoteSettings.kt", m80624l = {126}, m80625m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<JSONObject, Continuation<? super C32460OooOooO>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        Boolean bool;
        Double d;
        Integer num;
        SettingsCache settingsCache;
        SessionConfigs sessionConfigs;
        Integer num2;
        Double d2;
        Object obj2;
        Boolean bool2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Log.d(FirebaseSessions.TAG, "Fetched settings: " + jSONObject);
            Integer num3 = 0;
            Integer num4 = null;
            Boolean bool3 = null;
            if (jSONObject.has("app_quality")) {
                Object obj3 = jSONObject.get("app_quality");
                OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj3;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                } catch (JSONException e) {
                    e = e;
                    num2 = null;
                    d2 = null;
                }
                try {
                    d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                    try {
                        num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                    } catch (JSONException e2) {
                        e = e2;
                        num2 = null;
                        bool3 = bool2;
                        obj2 = null;
                    }
                    try {
                        num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        num = num2;
                        d = d2;
                        bool = bool2;
                        num3 = num4;
                    } catch (JSONException e3) {
                        e = e3;
                        Integer num5 = num4;
                        bool3 = bool2;
                        obj2 = num5;
                        C25261OooO0o0.OooO0OO(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                        num = num2;
                        d = d2;
                        bool = bool3;
                        num3 = obj2;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    num2 = null;
                    d2 = null;
                    bool3 = bool2;
                    obj2 = d2;
                    C25261OooO0o0.OooO0OO(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                    num = num2;
                    d = d2;
                    bool = bool3;
                    num3 = obj2;
                    settingsCache = this.this$0.settingsCache;
                    sessionConfigs = new SessionConfigs(bool, d, num, new Integer(num3 == 0 ? num3.intValue() : RemoteSettings.Companion.getDefaultCacheDuration()), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
                    this.label = 1;
                    if (settingsCache.updateConfigs(sessionConfigs, this) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            } else {
                bool = null;
                d = null;
                num = null;
            }
            settingsCache = this.this$0.settingsCache;
            sessionConfigs = new SessionConfigs(bool, d, num, new Integer(num3 == 0 ? num3.intValue() : RemoteSettings.Companion.getDefaultCacheDuration()), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
            this.label = 1;
            if (settingsCache.updateConfigs(sessionConfigs, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(JSONObject jSONObject, Continuation<? super C32460OooOooO> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
