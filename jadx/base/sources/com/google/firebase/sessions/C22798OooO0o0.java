package com.google.firebase.sessions;

import OooOo.C20481OooOOoo;
import android.content.Context;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.StampingTextureNative;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.OooOo;
import o0o00o.OooOOOO;

/* JADX INFO: renamed from: com.google.firebase.sessions.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22798OooO0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68691OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68692OooOo0o;

    public /* synthetic */ C22798OooO0o0(Object obj, int i) {
        this.f68692OooOo0o = i;
        this.f68691OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f68691OooOo;
        switch (this.f68692OooOo0o) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3((Context) obj);
            case 1:
                C20481OooOOoo<OooOo.AbstractC24463OooO0Oo.OooO00o> c20481OooOOoo = OooOo.AbstractC24463OooO0Oo.OooO00o.f82706OooO0O0;
                int animationRepeatModeInt = StampingTextureNative.f65353OooO00o.getAnimationRepeatModeInt(((OooOo.OooO0OO) obj).OooO00o());
                OooOo.AbstractC24463OooO0Oo.OooO00o oooO00oOooO0O0 = OooOo.AbstractC24463OooO0Oo.OooO00o.f82706OooO0O0.OooO0O0(animationRepeatModeInt);
                if (oooO00oOooO0O0 != null) {
                    return oooO00oOooO0O0;
                }
                throw new IllegalStateException(C21532OooOOo.OooO0OO(animationRepeatModeInt, "Invalid AnimationRepeatMode value: ").toString());
            default:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new OooOOOO(oooO0O0Oooo0oO, interfaceC21987OooOoo, new PenBarChildFragment.C23484OooOoO(2, penBarChildFragment, PenBarChildFragment.class, "sendMessageToFocusedEditor", "sendMessageToFocusedEditor(ILjava/lang/Object;)V", 0), new PenBarChildFragment.C23486OooOoOO(2, penBarChildFragment, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
        }
    }
}
