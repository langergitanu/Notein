package io.ktor.utils.p616io;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase", m80623f = "ByteChannelSequential.kt", m80624l = {486}, m80625m = "readAvailable$ktor_io")
public final class C23966Oooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC23985Ooooo00 f80694OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80695OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80696OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23966Oooo(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80696OooOoO0 = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80693OooOo = obj;
        this.f80695OooOoO |= Integer.MIN_VALUE;
        return this.f80696OooOoO0.Oooo0OO(null, this);
    }
}
