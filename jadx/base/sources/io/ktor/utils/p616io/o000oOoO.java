package io.ktor.utils.p616io;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase", m80623f = "ByteChannelSequential.kt", m80624l = {150}, m80625m = "writeByte$suspendImpl")
public final class o000oOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80868OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC23985Ooooo00 f80869OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80870OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80871OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80871OooOoO0 = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80868OooOo = obj;
        this.f80870OooOoO |= Integer.MIN_VALUE;
        AbstractC23985Ooooo00.Oooo0oo(this.f80871OooOoO0, (byte) 0, this);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}
