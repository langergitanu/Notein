package Oooo0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Float, Float> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20888o000Ooo f59979OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(C20888o000Ooo c20888o000Ooo) {
        super(1);
        this.f59979OooOo0o = c20888o000Ooo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Float invoke(Float f) {
        float fFloatValue = f.floatValue();
        C20888o000Ooo c20888o000Ooo = this.f59979OooOo0o;
        float fOooO00o = c20888o000Ooo.OooO00o() + fFloatValue;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = c20888o000Ooo.f60201OooO0O0;
        if (fOooO00o > ((Number) parcelableSnapshotMutableState.getValue()).floatValue()) {
            fFloatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue() - c20888o000Ooo.OooO00o();
        } else if (fOooO00o < 0.0f) {
            fFloatValue = -c20888o000Ooo.OooO00o();
        }
        c20888o000Ooo.f60200OooO00o.setValue(Float.valueOf(c20888o000Ooo.OooO00o() + fFloatValue));
        return Float.valueOf(fFloatValue);
    }
}
