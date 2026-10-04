package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34053OoooO0O implements InterfaceC34016OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34061Ooooo0o f122401OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000 f122402OooOo0o;

    public C34053OoooO0O(Oooo000 oooo000) {
        this.f122402OooOo0o = oooo000;
    }

    public static C34051OoooO0 OooO00o(Oooo000 oooo000) throws IOException {
        C34061Ooooo0o c34061Ooooo0o = new C34061Ooooo0o(oooo000);
        return new C34051OoooO0(oOO00.OooO00o.OooO00o(c34061Ooooo0o), c34061Ooooo0o.f122413OooOoO0);
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return OooO00o(this.f122402OooOo0o);
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final InputStream OooO0OO() throws IOException {
        C34061Ooooo0o c34061Ooooo0o = new C34061Ooooo0o(this.f122402OooOo0o);
        this.f122401OooOo = c34061Ooooo0o;
        return c34061Ooooo0o;
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO00o(this.f122402OooOo0o);
        } catch (IOException e) {
            throw new C34034OooOoO(C21111o0ooOoO.OooO00o(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final int OooO0o0() {
        return this.f122401OooOo.f122413OooOoO0;
    }
}
