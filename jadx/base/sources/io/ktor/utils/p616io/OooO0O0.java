package io.ktor.utils.p616io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {1865}, m80625m = "awaitAtLeastSuspend")
public final class OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80512OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80513OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80514OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80515OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80515OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80512OooOo = obj;
        this.f80514OooOoO |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80497OooOO0O;
        return this.f80515OooOoO0.Oooo00o(0, this);
    }
}
