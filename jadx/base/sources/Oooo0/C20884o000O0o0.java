package Oooo0;

import OooO0Oo.C20398OooO0O0;
import o00000.InterfaceC24054OooOo0;

/* JADX INFO: renamed from: Oooo0.o000O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20884o000O0o0 implements InterfaceC24054OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC24054OooOo0 f60148OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f60149OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f60150OooO0OO;

    public C20884o000O0o0(InterfaceC24054OooOo0 interfaceC24054OooOo0, int i, int i2) {
        this.f60148OooO00o = interfaceC24054OooOo0;
        this.f60149OooO0O0 = i;
        this.f60150OooO0OO = i2;
    }

    @Override // o00000.InterfaceC24054OooOo0
    public final int OooO00o(int i) {
        int iOooO00o = this.f60148OooO00o.OooO00o(i);
        int i2 = this.f60149OooO0O0;
        if (iOooO00o < 0 || iOooO00o > i2) {
            throw new IllegalStateException(C20398OooO0O0.OooO00o(']', C20398OooO0O0.OooO0O0("OffsetMapping.transformedToOriginal returned invalid mapping: ", i, " -> ", " is not in range of original text [0, ", iOooO00o), i2).toString());
        }
        return iOooO00o;
    }

    @Override // o00000.InterfaceC24054OooOo0
    public final int OooO0O0(int i) {
        int iOooO0O0 = this.f60148OooO00o.OooO0O0(i);
        int i2 = this.f60150OooO0OO;
        if (iOooO0O0 < 0 || iOooO0O0 > i2) {
            throw new IllegalStateException(C20398OooO0O0.OooO00o(']', C20398OooO0O0.OooO0O0("OffsetMapping.originalToTransformed returned invalid mapping: ", i, " -> ", " is not in range of transformed text [0, ", iOooO0O0), i2).toString());
        }
        return iOooO0O0;
    }
}
