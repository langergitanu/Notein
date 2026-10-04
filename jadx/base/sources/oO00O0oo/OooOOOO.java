package oO00O0oo;

import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.o0Oo0oo;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import oO0O0OOo.C32654OooO0O0;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.o0000oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o0Oo0oo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115667OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32223OooOOOo<SelectableChannel> f115668OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(AbstractC32223OooOOOo abstractC32223OooOOOo, io.ktor.utils.p616io.OooO00o oooO00o) {
        super(0);
        this.f115668OooOo0o = abstractC32223OooOOOo;
        this.f115667OooOo = oooO00o;
    }

    @Override // oO0O000o.OooO00o
    public final o0Oo0oo invoke() {
        AbstractC32223OooOOOo<SelectableChannel> abstractC32223OooOOOo = this.f115668OooOo0o;
        WritableByteChannel nioChannel = (WritableByteChannel) abstractC32223OooOOOo.getChannel();
        io.ktor.utils.p616io.OooO00o oooO00o = this.f115667OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(nioChannel, "nioChannel");
        C32654OooO0O0 selector = abstractC32223OooOOOo.f115671OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
        C33635Oooo00O c33635Oooo00O = new C33635Oooo00O("cio-to-nio-writer");
        o0000oo2.getClass();
        InterfaceC34415OooO0oo coroutineContext = InterfaceC34415OooO0oo.OooO00o.OooO00o(o0000oo2, c33635Oooo00O);
        C32221OooO0oo c32221OooO0oo = new C32221OooO0oo(abstractC32223OooOOOo, oooO00o, nioChannel, abstractC32223OooOOOo.f115670OooOoo, selector, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        return C24005o00o0O.OooO00o(abstractC32223OooOOOo, coroutineContext, oooO00o, false, c32221OooO0oo);
    }
}
