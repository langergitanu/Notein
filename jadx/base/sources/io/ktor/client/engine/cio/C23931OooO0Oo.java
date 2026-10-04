package io.ktor.client.engine.cio;

import OoooOO0.C21175OooO0Oo;
import oO00O0o0.Oooo0;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23931OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C23938OooOOo0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f80372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80373OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80374OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f80375OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f80376OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23931OooO0Oo(Oooo0 oooo0, String str, int i, OooO00o oooO00o, String str2) {
        super(0);
        this.f80373OooOo0o = oooo0;
        this.f80372OooOo = str;
        this.f80375OooOoO0 = i;
        this.f80374OooOoO = oooO00o;
        this.f80376OooOoOO = str2;
    }

    @Override // oO0O000o.OooO00o
    public final C23938OooOOo0 invoke() {
        boolean zOooO00o = C21175OooO0Oo.OooO00o(this.f80373OooOo0o);
        OooO00o oooO00o = this.f80374OooOoO;
        OooO0OO oooO0OO = new OooO0OO(oooO00o, this.f80376OooOoOO);
        return new C23938OooOOo0(this.f80372OooOo, this.f80375OooOoO0, zOooO00o, oooO00o.f80352OooOoO, oooO00o.f80356OooOooO, oooO00o.f80358Oooo000, oooO0OO);
    }
}
