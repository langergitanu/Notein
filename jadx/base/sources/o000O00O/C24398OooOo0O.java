package o000O00O;

import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O00O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24398OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24394OooOOo<Object> f82373OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24391OooO0oo f82374OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24398OooOo0O(C24391OooO0oo c24391OooO0oo, C24394OooOOo c24394OooOOo) {
        super(0);
        this.f82374OooOo0o = c24391OooO0oo;
        this.f82373OooOo = c24394OooOOo;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        this.f82374OooOo0o.invoke();
        this.f82373OooOo.f82365OooO0oo.close();
        return C32460OooOooO.f116667OooO00o;
    }
}
