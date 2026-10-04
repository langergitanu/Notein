package io.ktor.utils.p616io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Oooo000;
import oO00Oo0.OooO0OO;
import oO00Oo0O.C32271OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {2087}, m80625m = "readRemainingSuspend")
public final class C23952OooOOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO f80593OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO0OO f80595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Oooo000 f80596OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C32271OooO00o f80597OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80598OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f80599OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f80600OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23952OooOOOo(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80598OooOoo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80599OooOoo0 = obj;
        this.f80600OooOooO |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80497OooOO0O;
        return this.f80598OooOoo.OooooOo(0L, this);
    }
}
