package oO00Oo;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO00Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.WebSocketReader$readerJob$1", m80623f = "WebSocketReader.kt", m80624l = {40}, m80625m = "invokeSuspend")
public final class C32263OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f115922OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ByteBuffer f115923OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f115924OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO00Oo0o.OooO0o<ByteBuffer> f115925OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32263OooOOo0(oO00Oo0o.OooO0o<ByteBuffer> oooO0o, OooOOO0 oooOOO0, Continuation<? super C32263OooOOo0> continuation) {
        super(2, continuation);
        this.f115925OooOoO0 = oooO0o;
        this.f115924OooOoO = oooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32263OooOOo0(this.f115925OooOoO0, this.f115924OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C32263OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        ByteBuffer byteBuffer;
        C32256OooO0o e;
        C32255OooO0Oo e2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115922OooOo;
        oO00Oo0o.OooO0o<ByteBuffer> oooO0o = this.f115925OooOoO0;
        OooOOO0 oooOOO0 = this.f115924OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ByteBuffer byteBufferO0000OoO = oooO0o.o0000OoO();
                try {
                    this.f115923OooOo0o = byteBufferO0000OoO;
                    this.f115922OooOo = 1;
                    if (OooOOO0.OooO00o(oooOOO0, byteBufferO0000OoO, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    byteBuffer = byteBufferO0000OoO;
                    oooO0o.o00o0O(byteBuffer);
                } catch (ClosedChannelException unused) {
                    byteBuffer = byteBufferO0000OoO;
                    oooO0o.o00o0O(byteBuffer);
                } catch (CancellationException unused2) {
                    byteBuffer = byteBufferO0000OoO;
                    oooO0o.o00o0O(byteBuffer);
                } catch (C32255OooO0Oo e3) {
                    byteBuffer = byteBufferO0000OoO;
                    e2 = e3;
                    oooOOO0.f115900OooOoo.OooOOOo(false, e2);
                    oooO0o.o00o0O(byteBuffer);
                } catch (C32256OooO0o e4) {
                    byteBuffer = byteBufferO0000OoO;
                    e = e4;
                    oooOOO0.f115900OooOoo.OooOOOo(false, e);
                    oooO0o.o00o0O(byteBuffer);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = this.f115923OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    oooO0o.o00o0O(byteBuffer);
                } catch (ClosedChannelException unused3) {
                    oooO0o.o00o0O(byteBuffer);
                } catch (CancellationException unused4) {
                    oooO0o.o00o0O(byteBuffer);
                } catch (C32255OooO0Oo e5) {
                    e2 = e5;
                    oooOOO0.f115900OooOoo.OooOOOo(false, e2);
                    oooO0o.o00o0O(byteBuffer);
                } catch (C32256OooO0o e6) {
                    e = e6;
                    oooOOO0.f115900OooOoo.OooOOOo(false, e);
                    oooO0o.o00o0O(byteBuffer);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            oooOOO0.f115900OooOoo.OooO0Oo(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th4) {
            oooO0o.o00o0O(enumC32485OooO00o);
            oooOOO0.f115900OooOoo.OooO0Oo(null);
            throw th4;
        }
    }
}
