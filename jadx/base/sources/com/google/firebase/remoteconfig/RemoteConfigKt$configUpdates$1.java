package com.google.firebase.remoteconfig;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OOo/OooOo0O;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", m80623f = "RemoteConfig.kt", m80624l = {76}, m80625m = "invokeSuspend")
public final class RemoteConfigKt$configUpdates$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super ConfigUpdate>, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super RemoteConfigKt$configUpdates$1> continuation) {
        super(2, continuation);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO invokeSuspend$lambda$0(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
        configUpdateListenerRegistration.remove();
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, continuation);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, interfaceC33712OooOo0O));
            kotlin.jvm.internal.OooOOO0.OooO0o(configUpdateListenerRegistrationAddOnConfigUpdateListener, "addOnConfigUpdateListener(...)");
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: com.google.firebase.remoteconfig.OooOOOO
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return RemoteConfigKt$configUpdates$1.invokeSuspend$lambda$0(configUpdateListenerRegistrationAddOnConfigUpdateListener);
                }
            };
            this.label = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o, this) == enumC32485OooO00o) {
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
    public final Object invoke(InterfaceC33712OooOo0O<? super ConfigUpdate> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
