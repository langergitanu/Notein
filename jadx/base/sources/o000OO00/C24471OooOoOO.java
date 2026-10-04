package o000OO00;

import androidx.ink.brush.StampingTextureNative;
import o000OO00.OooOo;

/* JADX INFO: renamed from: o000OO00.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24471OooOoOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82755OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82756OooOo0o;

    public /* synthetic */ C24471OooOoOO(Object obj, int i) {
        this.f82756OooOo0o = i;
        this.f82755OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82756OooOo0o) {
            case 0:
                return Integer.valueOf(StampingTextureNative.f65353OooO00o.getAnimationRows(((OooOo.OooO0OO) this.f82755OooOo).OooO00o()));
            default:
                return this.f82755OooOo;
        }
    }
}
