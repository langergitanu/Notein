package oO00Oo;

import java.nio.ByteBuffer;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OOo.InterfaceC33701OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.WebSocketWriter", m80623f = "WebSocketWriter.kt", m80624l = {46, 48}, m80625m = "writeLoop")
public final class OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f115937OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32262OooOOo f115938OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f115939OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33701OooOO0o f115940OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C32262OooOOo f115941OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f115942OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(C32262OooOOo c32262OooOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f115941OooOoOO = c32262OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f115939OooOoO = obj;
        this.f115942OooOoo0 |= Integer.MIN_VALUE;
        return C32262OooOOo.OooO00o(this.f115941OooOoOO, null, this);
    }
}
