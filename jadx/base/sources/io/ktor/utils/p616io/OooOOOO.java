package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00Oo0.OooO0OO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {794}, m80625m = "readPacketSuspend")
public final class OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO f80586OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80587OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80588OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ByteBuffer f80589OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f80590OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f80591OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80592OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80592OooOoo0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80590OooOoOO = obj;
        this.f80591OooOoo |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80497OooOO0O;
        return this.f80592OooOoo0.OooooOO(0, null, null, this);
    }
}
