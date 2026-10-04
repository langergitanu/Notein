package ooOOoOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f126123OooO0OO;

    public OooOOO0(C35131OooOoO c35131OooOoO, boolean z) {
        super(c35131OooOoO);
        this.f126123OooO0OO = z;
    }

    @Override // ooOOoOO0.OooOO0O
    public final void OooO0O0(byte b) {
        if (this.f126123OooO0OO) {
            OooO0oo(String.valueOf(b & 255));
        } else {
            OooO0o(String.valueOf(b & 255));
        }
    }

    @Override // ooOOoOO0.OooOO0O
    public final void OooO0Oo(int i) {
        boolean z = this.f126123OooO0OO;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            OooO0oo(unsignedString);
        } else {
            OooO0o(unsignedString);
        }
    }

    @Override // ooOOoOO0.OooOO0O
    public final void OooO0o0(long j) {
        boolean z = this.f126123OooO0OO;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            OooO0oo(unsignedString);
        } else {
            OooO0o(unsignedString);
        }
    }

    @Override // ooOOoOO0.OooOO0O
    public final void OooO0oO(short s) {
        if (this.f126123OooO0OO) {
            OooO0oo(String.valueOf(s & 65535));
        } else {
            OooO0o(String.valueOf(s & 65535));
        }
    }
}
