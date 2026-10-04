package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22029OooO0o0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f65823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f65824OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f65825OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f65826OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f65827OooO0o0 = null;

    public C22029OooO0o0(OooOo oooOo) {
        this.f65823OooO00o = oooOo;
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO00o(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.f65824OooO0O0 == 3 && i <= (i4 = this.f65826OooO0Oo + (i3 = this.f65825OooO0OO)) && (i5 = i + i2) >= i3 && this.f65827OooO0o0 == obj) {
            this.f65825OooO0OO = Math.min(i, i3);
            this.f65826OooO0Oo = Math.max(i4, i5) - this.f65825OooO0OO;
            return;
        }
        OooO0o0();
        this.f65825OooO0OO = i;
        this.f65826OooO0Oo = i2;
        this.f65827OooO0o0 = obj;
        this.f65824OooO0O0 = 3;
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0O0(int i, int i2) {
        int i3;
        if (this.f65824OooO0O0 == 1 && i >= (i3 = this.f65825OooO0OO)) {
            int i4 = this.f65826OooO0Oo;
            if (i <= i3 + i4) {
                this.f65826OooO0Oo = i4 + i2;
                this.f65825OooO0OO = Math.min(i, i3);
                return;
            }
        }
        OooO0o0();
        this.f65825OooO0OO = i;
        this.f65826OooO0Oo = i2;
        this.f65824OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0OO(int i, int i2) {
        int i3;
        if (this.f65824OooO0O0 == 2 && (i3 = this.f65825OooO0OO) >= i && i3 <= i + i2) {
            this.f65826OooO0Oo += i2;
            this.f65825OooO0OO = i;
        } else {
            OooO0o0();
            this.f65825OooO0OO = i;
            this.f65826OooO0Oo = i2;
            this.f65824OooO0O0 = 2;
        }
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0Oo(int i, int i2) {
        OooO0o0();
        this.f65823OooO00o.OooO0Oo(i, i2);
    }

    public final void OooO0o0() {
        int i = this.f65824OooO0O0;
        if (i == 0) {
            return;
        }
        OooOo oooOo = this.f65823OooO00o;
        if (i == 1) {
            oooOo.OooO0O0(this.f65825OooO0OO, this.f65826OooO0Oo);
        } else if (i == 2) {
            oooOo.OooO0OO(this.f65825OooO0OO, this.f65826OooO0Oo);
        } else if (i == 3) {
            oooOo.OooO00o(this.f65825OooO0OO, this.f65826OooO0Oo, this.f65827OooO0o0);
        }
        this.f65827OooO0o0 = null;
        this.f65824OooO0O0 = 0;
    }
}
