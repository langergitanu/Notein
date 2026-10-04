package com.google.firebase.sessions;

import android.content.Context;
import androidx.ink.brush.StampingTextureNative;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import o000OO00.OooOo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68687OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68688OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f68688OooOo0o = i;
        this.f68687OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f68688OooOo0o) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$1((Context) this.f68687OooOo);
            default:
                return Integer.valueOf(StampingTextureNative.f65353OooO00o.getAnimationColumns(((OooOo.OooO0OO) this.f68687OooOo).OooO00o()));
        }
    }
}
