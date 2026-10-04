package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {934, 934, 934, 2420, 2475, 934, 934, 2502}, m80625m = "writeShort$suspendImpl")
public final class C23962OooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80668OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public short f80669OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ByteBuffer f80670OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO00o f80671OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f80672OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80673OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f80674OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f80675OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23962OooOoo(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80673OooOoo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80674OooOoo0 = obj;
        this.f80675OooOooO |= Integer.MIN_VALUE;
        return OooO00o.o00000OO(this.f80673OooOoo, (short) 0, this);
    }
}
