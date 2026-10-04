package io.ktor.utils.p616io;

import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteBufferChannel", m80623f = "ByteBufferChannel.kt", m80624l = {1784, 1786, 1791, 1796, 1798, 1802}, m80625m = "lookAheadSuspend$suspendImpl")
public final class OooO0o<R> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f80537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f80538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO00o f80539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24034Oooo00O f80540OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24034Oooo00O f80541OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80542OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f80543OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f80544OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80542OooOoo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80543OooOoo0 = obj;
        this.f80544OooOooO |= Integer.MIN_VALUE;
        return OooO00o.OoooO0O(this.f80542OooOoo, null, this);
    }
}
