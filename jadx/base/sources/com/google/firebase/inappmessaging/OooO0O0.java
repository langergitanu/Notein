package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements InterfaceC32330OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseInAppMessaging f68465OooOo0o;

    public /* synthetic */ OooO0O0(FirebaseInAppMessaging firebaseInAppMessaging) {
        this.f68465OooOo0o = firebaseInAppMessaging;
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public final void accept(Object obj) {
        this.f68465OooOo0o.triggerInAppMessage((TriggeredInAppMessage) obj);
    }
}
