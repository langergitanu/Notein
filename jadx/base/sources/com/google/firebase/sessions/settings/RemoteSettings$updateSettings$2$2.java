package com.google.firebase.sessions.settings;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p407st.OooO00o;
import com.google.firebase.sessions.FirebaseSessions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"", NotificationCompat.CATEGORY_MESSAGE, "LoO00ooO/OooOooO;", "<anonymous>", "(Ljava/lang/String;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m80623f = "RemoteSettings.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$2 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(Continuation<? super RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO00o.OooO0O0("Error failed to fetch the remote configs: ", (String) this.L$0, FirebaseSessions.TAG);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
