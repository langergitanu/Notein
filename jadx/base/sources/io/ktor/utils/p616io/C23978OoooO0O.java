package io.ktor.utils.p616io;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase", m80623f = "ByteChannelSequential.kt", m80624l = {731}, m80625m = "readUTF8Line$suspendImpl")
public final class C23978OoooO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80734OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StringBuilder f80735OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80736OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80737OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23978OoooO0O(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80737OooOoO0 = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80734OooOo = obj;
        this.f80736OooOoO |= Integer.MIN_VALUE;
        return AbstractC23985Ooooo00.Oooo0oO(this.f80737OooOoO0, 0, this);
    }
}
