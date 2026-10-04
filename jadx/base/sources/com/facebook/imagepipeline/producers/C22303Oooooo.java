package com.facebook.imagepipeline.producers;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22303Oooooo implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC22305OoooooO<C25638OooO0oO>[] f67465OooO00o;

    public C22303Oooooo(InterfaceC22305OoooooO<C25638OooO0oO>... interfaceC22305OoooooOArr) {
        InterfaceC22305OoooooO<C25638OooO0oO>[] interfaceC22305OoooooOArr2 = interfaceC22305OoooooOArr;
        this.f67465OooO00o = interfaceC22305OoooooOArr2;
        int length = interfaceC22305OoooooOArr2.length;
        if (length <= 0) {
            if (length < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(length, "negative size: "));
            }
            throw new IndexOutOfBoundsException(OooOoo0.OooOo00.OooO0oO("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, 0, Integer.valueOf(length)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        interfaceC22288OoooO.OooOOoo().getClass();
        oooO.OooO00o(1, null);
    }
}
