package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC20542OooOoo0 extends InterfaceC20526OooOO0o<Float> {
    @Override // OooOoOO.InterfaceC20526OooOO0o
    default o00O0O OooO00o(InterfaceC20574Ooooooo converter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
        return new oo000o(this);
    }

    float OooO0O0(long j, float f, float f2, float f3);

    long OooO0OO(float f, float f2, float f3);

    default float OooO0Oo(float f, float f2, float f3) {
        return OooO0O0(OooO0OO(f, f2, f3), f, f2, f3);
    }

    float OooO0o0(long j, float f, float f2, float f3);
}
