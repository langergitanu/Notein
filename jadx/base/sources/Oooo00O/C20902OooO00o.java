package Oooo00O;

import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo00O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20902OooO00o extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f60290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Boolean, C32460OooOooO> f60291OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20902OooO00o(InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o, boolean z) {
        super(0);
        this.f60291OooOo0o = interfaceC32507OooOO0o;
        this.f60290OooOo = z;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        this.f60291OooOo0o.invoke(Boolean.valueOf(!this.f60290OooOo));
        return C32460OooOooO.f116667OooO00o;
    }
}
