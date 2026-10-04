package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {930, 930, 930, 2420, 2475, 930, 930, 2502}, m80625m = "writeByte$suspendImpl")
public final class OooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80614OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte f80615OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ByteBuffer f80616OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO00o f80617OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f80618OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80619OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f80620OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f80621OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80619OooOoo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80620OooOoo0 = obj;
        this.f80621OooOooO |= Integer.MIN_VALUE;
        return OooO00o.o000000O(this.f80619OooOoo, (byte) 0, this);
    }
}
