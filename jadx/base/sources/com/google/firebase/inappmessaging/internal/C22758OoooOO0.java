package com.google.firebase.inappmessaging.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.inappmessaging.internal.RateLimitProto;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.ui.settings.debug.DebugFragment.OooO0O0;
import o0000oOO.AbstractC24338OooO0o0;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0OOOOo.OooO0OO;
import oO0OooOO.InterfaceC33490OooO0o;
import oO0OooOO.InterfaceC33492OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22758OoooOO0 implements InterfaceC32330OooO0O0, InterfaceC33492OooO0oO, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68551OooOo0o;

    public /* synthetic */ C22758OoooOO0(Object obj) {
        this.f68551OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (result.f62240OooOo0o != -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DebugFragment");
            c20358OooO00o.OooO0o0("User cancelled file browsing", new Object[0]);
            return;
        }
        Intent intent = result.f62239OooOo;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DebugFragment");
            c20358OooO00o2.OooO0OO("File uri not found", new Object[0]);
        } else {
            DebugFragment debugFragment = (DebugFragment) this.f68551OooOo0o;
            InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new OooO0O0(data, null), 3);
        }
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        ((RateLimiterClient) this.f68551OooOo0o).lambda$increment$2((RateLimitProto.RateLimit) obj);
    }

    @Override // oO0OooOO.InterfaceC33492OooO0oO
    public void subscribe(InterfaceC33490OooO0o interfaceC33490OooO0o) throws Exception {
        ((ProgrammaticContextualTriggerFlowableModule) this.f68551OooOo0o).lambda$providesProgramaticContextualTriggerStream$1((OooO0OO.OooO00o) interfaceC33490OooO0o);
    }
}
