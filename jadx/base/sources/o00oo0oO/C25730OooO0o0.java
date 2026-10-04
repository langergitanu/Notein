package o00oo0oO;

import OooOoo0.OooOo00;
import java.io.IOException;
import java.io.InputStream;
import o00O0oo0.C24969OooOO0;
import o00o0Ooo.C25425OooO0O0;
import o00o0o0o.C25447OooO0o;
import o00o0o0o.InterfaceC25443OooO00o;
import o00o0oOo.C25459OooO0O0;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: o00oo0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25730OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f87816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f87817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f87818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f87819OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f87820OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f87821OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC25443OooO00o f87822OooO0oo;

    public C25730OooO0o0(InterfaceC25443OooO00o interfaceC25443OooO00o) {
        interfaceC25443OooO00o.getClass();
        this.f87822OooO0oo = interfaceC25443OooO00o;
        this.f87817OooO0OO = 0;
        this.f87816OooO0O0 = 0;
        this.f87818OooO0Oo = 0;
        this.f87819OooO0o = 0;
        this.f87820OooO0o0 = 0;
        this.f87815OooO00o = 0;
    }

    public final boolean OooO00o(C25447OooO0o c25447OooO0o) {
        int i;
        int i2 = this.f87820OooO0o0;
        while (this.f87815OooO00o != 6 && (i = c25447OooO0o.read()) != -1) {
            try {
                int i3 = this.f87817OooO0OO;
                this.f87817OooO0OO = i3 + 1;
                if (this.f87821OooO0oO) {
                    this.f87815OooO00o = 6;
                    this.f87821OooO0oO = false;
                    return false;
                }
                int i4 = this.f87815OooO00o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f87815OooO00o = 5;
                                } else if (i4 != 5) {
                                    OooOo00.OooO0o(false);
                                } else {
                                    int i5 = ((this.f87816OooO0O0 << 8) + i) - 2;
                                    C25459OooO0O0.OooO00o(c25447OooO0o, i5);
                                    this.f87817OooO0OO += i5;
                                    this.f87815OooO00o = 2;
                                }
                            } else if (i == 255) {
                                this.f87815OooO00o = 3;
                            } else if (i == 0) {
                                this.f87815OooO00o = 2;
                            } else if (i == 217) {
                                this.f87821OooO0oO = true;
                                int i6 = i3 - 1;
                                int i7 = this.f87818OooO0Oo;
                                if (i7 > 0) {
                                    this.f87819OooO0o = i6;
                                }
                                this.f87818OooO0Oo = i7 + 1;
                                this.f87820OooO0o0 = i7;
                                this.f87815OooO00o = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.f87818OooO0Oo;
                                    if (i9 > 0) {
                                        this.f87819OooO0o = i8;
                                    }
                                    this.f87818OooO0Oo = i9 + 1;
                                    this.f87820OooO0o0 = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.f87815OooO00o = 2;
                                } else {
                                    this.f87815OooO00o = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.f87815OooO00o = 3;
                        }
                    } else if (i == 216) {
                        this.f87815OooO00o = 2;
                    } else {
                        this.f87815OooO00o = 6;
                    }
                } else if (i == 255) {
                    this.f87815OooO00o = 1;
                } else {
                    this.f87815OooO00o = 6;
                }
                this.f87816OooO0O0 = i;
            } catch (IOException e) {
                C24969OooOO0.OooO0o(e);
                throw null;
            }
        }
        return (this.f87815OooO00o == 6 || this.f87820OooO0o0 == i2) ? false : true;
    }

    public final boolean OooO0O0(C25638OooO0oO c25638OooO0oO) {
        if (this.f87815OooO00o == 6 || c25638OooO0oO.OooOooo() <= this.f87817OooO0OO) {
            return false;
        }
        InputStream inputStreamOooOOoo = c25638OooO0oO.OooOOoo();
        inputStreamOooOOoo.getClass();
        InterfaceC25443OooO00o interfaceC25443OooO00o = this.f87822OooO0oo;
        C25447OooO0o c25447OooO0o = new C25447OooO0o(inputStreamOooOOoo, interfaceC25443OooO00o.get(16384), interfaceC25443OooO00o);
        try {
            try {
                C25459OooO0O0.OooO00o(c25447OooO0o, this.f87817OooO0OO);
                return OooO00o(c25447OooO0o);
            } catch (IOException e) {
                C24969OooOO0.OooO0o(e);
                throw null;
            }
        } finally {
            C25425OooO0O0.OooO0O0(c25447OooO0o);
        }
    }
}
