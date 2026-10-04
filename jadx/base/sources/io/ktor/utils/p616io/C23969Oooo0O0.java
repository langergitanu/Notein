package io.ktor.utils.p616io;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase", m80623f = "ByteChannelSequential.kt", m80624l = {88}, m80625m = "awaitAtLeastNBytesAvailableForRead$ktor_io")
public final class C23969Oooo0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80698OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC23985Ooooo00 f80699OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80700OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f80701OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f80702OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23969Oooo0O0(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80700OooOoO = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80701OooOoO0 = obj;
        this.f80702OooOoOO |= Integer.MIN_VALUE;
        return this.f80700OooOoO.OooOooo(0, this);
    }
}
