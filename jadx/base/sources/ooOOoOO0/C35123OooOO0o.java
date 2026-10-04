package ooOOoOO0;

/* JADX INFO: renamed from: ooOOoOO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35123OooOO0o extends OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f126121OooO0OO;

    public C35123OooOO0o(C35131OooOoO c35131OooOoO, boolean z) {
        super(c35131OooOoO);
        this.f126121OooO0OO = z;
    }

    @Override // ooOOoOO0.OooOO0O
    public final void OooO0oo(String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        if (this.f126121OooO0OO) {
            super.OooO0oo(value);
        } else {
            OooO0o(value);
        }
    }
}
