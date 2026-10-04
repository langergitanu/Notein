package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO0o0O.C33549OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "LoO00ooO/OooOooO;", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "LoO0o0O/OooO00o;", "getSessionRestartTimeout-FghU774", "()LoO0o0O/OooO00o;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface SettingsProvider {

    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class DefaultImpls {
        public static boolean isSettingsStale(SettingsProvider settingsProvider) {
            return false;
        }

        public static Object updateSettings(SettingsProvider settingsProvider, Continuation<? super C32460OooOooO> continuation) {
            return C32460OooOooO.f116667OooO00o;
        }
    }

    Double getSamplingRate();

    Boolean getSessionEnabled();

    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    C33549OooO00o mo80698getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    Object updateSettings(Continuation<? super C32460OooOooO> continuation);
}
