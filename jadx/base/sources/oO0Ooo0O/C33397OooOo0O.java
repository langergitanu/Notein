package oO0Ooo0O;

import oO000oo.C32132OooO0Oo;
import oO000oo.InterfaceC32130OooO0O0;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32211OoooO0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.InterfaceC34503OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33397OooOo0O implements InterfaceC32130OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32211OoooO0 f120743OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32192OooOo0 f120744OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO00O0o0.OooOOO0 f120745OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oOo00Oo0.OooOOO0 f120746OooOoO0;

    public C33397OooOo0O(C32132OooO0Oo c32132OooO0Oo) {
        this.f120744OooOo0o = c32132OooO0Oo.f115204OooO0O0;
        this.f120743OooOo = c32132OooO0Oo.f115203OooO00o.OooO0O0();
        this.f120746OooOoO0 = c32132OooO0Oo.f115207OooO0o;
        this.f120745OooOoO = new oO00O0o0.OooOOO0(c32132OooO0Oo.f115205OooO0OO.f123698OooO00o);
    }

    @Override // oO000oo.InterfaceC32130OooO0O0, oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // oO000oo.InterfaceC32130OooO0O0
    public final InterfaceC34503OooO0O0 getAttributes() {
        return this.f120746OooOoO0;
    }

    @Override // oO00O0o0.InterfaceC32189OooOOo
    public final oO00O0o0.OooOO0O getHeaders() {
        return this.f120745OooOoO;
    }

    @Override // oO000oo.InterfaceC32130OooO0O0
    public final C32192OooOo0 getMethod() {
        return this.f120744OooOo0o;
    }

    @Override // oO000oo.InterfaceC32130OooO0O0
    public final C32211OoooO0 getUrl() {
        return this.f120743OooOo;
    }
}
