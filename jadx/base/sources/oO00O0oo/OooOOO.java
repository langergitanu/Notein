package oO00O0oo;

import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.o0O0O00;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import oO0O0OOo.C32654OooO0O0;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.o0000oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o0O0O00> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115664OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32223OooOOOo<SelectableChannel> f115665OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(AbstractC32223OooOOOo abstractC32223OooOOOo, io.ktor.utils.p616io.OooO00o oooO00o) {
        super(0);
        this.f115665OooOo0o = abstractC32223OooOOOo;
        this.f115664OooOo = oooO00o;
    }

    @Override // oO0O000o.OooO00o
    public final o0O0O00 invoke() {
        AbstractC32223OooOOOo<SelectableChannel> abstractC32223OooOOOo = this.f115665OooOo0o;
        abstractC32223OooOOOo.getClass();
        io.ktor.utils.p616io.OooO00o oooO00o = this.f115664OooOo;
        ReadableByteChannel nioChannel = (ReadableByteChannel) abstractC32223OooOOOo.getChannel();
        kotlin.jvm.internal.OooOOO0.OooO0oO(nioChannel, "nioChannel");
        C32654OooO0O0 selector = abstractC32223OooOOOo.f115671OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
        C33635Oooo00O c33635Oooo00O = new C33635Oooo00O("cio-from-nio-reader");
        o0000oo2.getClass();
        return C24005o00o0O.OooO0O0(abstractC32223OooOOOo, InterfaceC34415OooO0oo.OooO00o.OooO00o(o0000oo2, c33635Oooo00O), oooO00o, new C32219OooO0o0(abstractC32223OooOOOo, abstractC32223OooOOOo.f115670OooOoo, oooO00o, nioChannel, selector, null));
    }
}
