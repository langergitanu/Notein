package oO00Oo;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO00Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.WebSocketWriter", m80623f = "WebSocketWriter.kt", m80624l = {121}, m80625m = "drainQueueAndSerialize")
public final class C32264OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f115926OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32262OooOOo f115927OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f115928OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24034Oooo00O f115929OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f115930OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f115931OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C32262OooOOo f115932OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32264OooOOoo(C32262OooOOo c32262OooOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f115932OooOoo0 = c32262OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f115930OooOoOO = obj;
        this.f115931OooOoo |= Integer.MIN_VALUE;
        return this.f115932OooOoo0.OooO0O0(null, null, this);
    }
}
