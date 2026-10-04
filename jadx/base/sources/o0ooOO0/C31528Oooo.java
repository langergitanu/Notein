package o0ooOO0;

import Oooo0oO.InterfaceC21033OooOOOO;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0ooOO0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31528Oooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31547Ooooo00 f112719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f112720OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f112721OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31528Oooo(AndroidComposeView androidComposeView, C31547Ooooo00 c31547Ooooo00, C24633OooO00o c24633OooO00o, int i) {
        super(2);
        this.f112720OooOo0o = androidComposeView;
        this.f112719OooOo = c31547Ooooo00;
        this.f112721OooOoO0 = c24633OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C31552Oooooo.OooO00o(this.f112720OooOo0o, this.f112719OooOo, this.f112721OooOoO0, interfaceC21033OooOOOO2, 72);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
