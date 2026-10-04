package oO00Oo;

import java.nio.ByteBuffer;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO00Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.WebSocketReader", m80623f = "WebSocketReader.kt", m80624l = {68, 74}, m80625m = "readLoop")
public final class C32261OooOOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f115911OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOO0 f115912OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f115913OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f115914OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f115915OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32261OooOOOo(OooOOO0 oooOOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f115913OooOoO = oooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f115914OooOoO0 = obj;
        this.f115915OooOoOO |= Integer.MIN_VALUE;
        return OooOOO0.OooO00o(this.f115913OooOoO, null, this);
    }
}
