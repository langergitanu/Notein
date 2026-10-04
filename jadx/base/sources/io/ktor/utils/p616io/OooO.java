package io.ktor.utils.p616io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {723, 727}, m80625m = "readAvailableSuspend")
public final class OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f80490OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80491OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80492OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f80493OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f80494OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f80495OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80496OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80496OooOoo0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80494OooOoOO = obj;
        this.f80495OooOoo |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80497OooOO0O;
        return this.f80496OooOoo0.Ooooo00(null, 0, 0, this);
    }
}
