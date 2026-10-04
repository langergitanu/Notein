package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.ByteChannelSequentialBase", m80623f = "ByteChannelSequential.kt", m80624l = {218}, m80625m = "writeFully-JT6ljtQ$suspendImpl")
public final class C23982OoooOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f80750OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC23985Ooooo00 f80751OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80752OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f80753OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f80754OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f80755OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80756OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23982OoooOo0(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80756OooOoo0 = abstractC23985Ooooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80754OooOoOO = obj;
        this.f80755OooOoo |= Integer.MIN_VALUE;
        return AbstractC23985Ooooo00.OoooO0(this.f80756OooOoo0, null, 0, 0, this);
    }
}
