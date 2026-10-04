package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34060Ooooo00 implements InterfaceC34019OooO0oO, InterfaceC34073o00000oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122407OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122408OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Oooo000 f122409OooOoO0;

    public C34060Ooooo00(int i, int i2, Oooo000 oooo000) {
        this.f122408OooOo0o = i;
        this.f122407OooOo = i2;
        this.f122409OooOoO0 = oooo000;
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public AbstractC34036OooOoOO OooO0O0() throws IOException {
        return this.f122409OooOoO0.OooO0O0(this.f122408OooOo0o, this.f122407OooOo);
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO0O0();
        } catch (IOException e) {
            throw new C34034OooOoO(e.getMessage());
        }
    }
}
