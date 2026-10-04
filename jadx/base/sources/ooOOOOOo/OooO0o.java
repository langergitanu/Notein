package ooOOOOOo;

import io.ktor.utils.p616io.C23968Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO000oo.InterfaceC32130OooO0O0;
import oO0Oo0Oo.AbstractC33200OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f125917OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f125918OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(oO000o0.OooO0o client, InterfaceC32130OooO0O0 interfaceC32130OooO0O0, AbstractC33200OooO0OO abstractC33200OooO0OO, byte[] bArr) {
        super(client);
        OooOOO0.OooO0oO(client, "client");
        this.f125918OooOoo0 = bArr;
        this.f125912OooOo = new C35056OooO0oO(this, interfaceC32130OooO0O0);
        this.f125914OooOoO0 = new C35057OooO0oo(this, bArr, abstractC33200OooO0OO);
        this.f125917OooOoo = true;
    }

    @Override // ooOOOOOo.OooO0OO
    public final boolean OooO0O0() {
        return this.f125917OooOoo;
    }

    @Override // ooOOOOOo.OooO0OO
    public final Object OooO0o() {
        return C23968Oooo00o.OooO00o(this.f125918OooOoo0);
    }
}
