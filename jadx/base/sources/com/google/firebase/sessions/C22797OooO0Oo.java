package com.google.firebase.sessions;

import android.view.View;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.pay.google.CancelSubscriptionAlertDialog;
import com.orion.penkit.models.DualLinkSourceInfo;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24249OooO0OO;
import o0Oo0oO0.OooOOO;
import o0Oo0oO0.OooOOOO;
import o0oOoOo.C31029OooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: com.google.firebase.sessions.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22797OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68689OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68690OooOo0o;

    public /* synthetic */ C22797OooO0Oo(Object obj, int i) {
        this.f68690OooOo0o = i;
        this.f68689OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Object obj2 = this.f68689OooOo;
        switch (this.f68690OooOo0o) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$2((SessionDataSerializer) obj2, (C24249OooO0OO) obj);
            case 1:
                DualLinkSourceInfo it = (DualLinkSourceInfo) obj;
                OooOOO0.OooO0oO(it, "it");
                return Boolean.valueOf(OooOOO0.OooO0O0(it.getId(), (String) obj2));
            case 2:
                C31029OooO vo = (C31029OooO) obj;
                OooOOO0.OooO0oO(vo, "vo");
                OooOOO OooOoO2 = ((FeedbackFragment) obj2).OooOoO();
                String str = vo.f110771OooO00o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(OooOoO2);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOOOO(OooOoO2, str, null), 2);
                return C32460OooOooO.f116667OooO00o;
            default:
                CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog = (CancelSubscriptionAlertDialog) obj2;
                CircularProgressIndicator circularProgressIndicator = cancelSubscriptionAlertDialog.f78772Oooo000;
                if (circularProgressIndicator == null) {
                    OooOOO0.OooOOOO("cpiCancelSubscription");
                    throw null;
                }
                circularProgressIndicator.setVisibility(8);
                View view = cancelSubscriptionAlertDialog.f78770OooOooO;
                if (view != null) {
                    view.setVisibility(0);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
        }
    }
}
