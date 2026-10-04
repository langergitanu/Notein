package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bà\u0080\u0001\u0018\u00002\u00020\u0001Jl\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "LoO00ooO/OooOooO;", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;LoO0O000o/OooOOOo;LoO0O000o/OooOOOo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface CrashlyticsSettingsFetcher {
    Object doConfigFetch(Map<String, String> map, InterfaceC32508OooOOOo<? super JSONObject, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo2, Continuation<? super C32460OooOooO> continuation);
}
