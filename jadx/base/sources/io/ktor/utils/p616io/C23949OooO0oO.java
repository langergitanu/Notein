package io.ktor.utils.p616io;

import kotlin.jvm.internal.C24033OooOooo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {2368}, m80625m = "peekTo-lBXzO7A$suspendImpl")
public final class C23949OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80551OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24033OooOooo f80552OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80553OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80554OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23949OooO0oO(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80554OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80551OooOo = obj;
        this.f80553OooOoO |= Integer.MIN_VALUE;
        return OooO00o.OoooO(this.f80554OooOoO0, null, 0L, 0L, 0L, this);
    }
}
