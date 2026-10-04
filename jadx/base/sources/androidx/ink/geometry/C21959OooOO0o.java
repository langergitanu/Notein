package androidx.ink.geometry;

import androidx.ink.brush.behavior.EasingFunctionNative;

/* JADX INFO: renamed from: androidx.ink.geometry.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21959OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f65416OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65417OooOo0o;

    public /* synthetic */ C21959OooOO0o(long j, int i) {
        this.f65417OooOo0o = i;
        this.f65416OooOo = j;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65417OooOo0o) {
            case 0:
                return Long.valueOf(MeshNative.f65388OooO00o.newCopy(this.f65416OooOo));
            default:
                return Long.valueOf(EasingFunctionNative.f65360OooO00o.createCopyOf(this.f65416OooOo));
        }
    }
}
