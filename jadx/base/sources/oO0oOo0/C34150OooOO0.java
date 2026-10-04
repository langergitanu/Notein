package oO0oOo0;

import OooOoO.C20505OooO0OO;
import java.io.IOException;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34018OooO0o0;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.o00oO0O;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oOo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34150OooOO0 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C34032OooOo0O f122711OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C34032OooOo0O f122712OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f122713OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34032OooOo0O f122714OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC34033OooOo0o f122715OooOoO0;

    static {
        new C34032OooOo0O("2.5.29.9").OooOo0O();
        f122711OooOoO = new C34032OooOo0O("2.5.29.14").OooOo0O();
        new C34032OooOo0O("2.5.29.15").OooOo0O();
        new C34032OooOo0O("2.5.29.16").OooOo0O();
        new C34032OooOo0O("2.5.29.17").OooOo0O();
        new C34032OooOo0O("2.5.29.18").OooOo0O();
        new C34032OooOo0O("2.5.29.19").OooOo0O();
        new C34032OooOo0O("2.5.29.20").OooOo0O();
        new C34032OooOo0O("2.5.29.21").OooOo0O();
        new C34032OooOo0O("2.5.29.23").OooOo0O();
        new C34032OooOo0O("2.5.29.24").OooOo0O();
        new C34032OooOo0O("2.5.29.27").OooOo0O();
        f122712OooOoOO = C20505OooO0OO.OooO0OO("2.5.29.28");
        new C34032OooOo0O("2.5.29.29").OooOo0O();
        new C34032OooOo0O("2.5.29.30").OooOo0O();
        new C34032OooOo0O("2.5.29.31").OooOo0O();
        new C34032OooOo0O("2.5.29.32").OooOo0O();
        new C34032OooOo0O("2.5.29.33").OooOo0O();
        new C34032OooOo0O("2.5.29.35").OooOo0O();
        new C34032OooOo0O("2.5.29.36").OooOo0O();
        new C34032OooOo0O("2.5.29.37").OooOo0O();
        new C34032OooOo0O("2.5.29.46").OooOo0O();
        new C34032OooOo0O("2.5.29.54").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.1").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.11").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.12").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.2").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.3").OooOo0O();
        new C34032OooOo0O("1.3.6.1.5.5.7.1.4").OooOo0O();
        new C34032OooOo0O("2.5.29.56").OooOo0O();
        new C34032OooOo0O("2.5.29.55").OooOo0O();
        new C34032OooOo0O("2.5.29.60").OooOo0O();
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122714OooOo0o);
        if (this.f122713OooOo) {
            c34020OooO0oo.OooO00o(C34018OooO0o0.f122321OooOoO);
        }
        c34020OooO0oo.OooO00o(this.f122715OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }

    public final AbstractC34036OooOoOO OooO0oo() {
        try {
            return AbstractC34036OooOoOO.OooOOO(this.f122715OooOoO0.f122362OooOo0o);
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }

    @Override // oO0oO0Oo.OooOo00
    public final boolean equals(Object obj) {
        if (!(obj instanceof C34150OooOO0)) {
            return false;
        }
        C34150OooOO0 c34150OooOO0 = (C34150OooOO0) obj;
        return c34150OooOO0.f122714OooOo0o.OooOO0o(this.f122714OooOo0o) && c34150OooOO0.f122715OooOoO0.OooOO0o(this.f122715OooOoO0) && c34150OooOO0.f122713OooOo == this.f122713OooOo;
    }

    @Override // oO0oO0Oo.OooOo00
    public final int hashCode() {
        C34032OooOo0O c34032OooOo0O = this.f122714OooOo0o;
        AbstractC34033OooOo0o abstractC34033OooOo0o = this.f122715OooOoO0;
        if (this.f122713OooOo) {
            return c34032OooOo0O.f122357OooOo0o.hashCode() ^ C34332OooO00o.OooO0o0(abstractC34033OooOo0o.f122362OooOo0o);
        }
        return ~(c34032OooOo0O.f122357OooOo0o.hashCode() ^ C34332OooO00o.OooO0o0(abstractC34033OooOo0o.f122362OooOo0o));
    }
}
