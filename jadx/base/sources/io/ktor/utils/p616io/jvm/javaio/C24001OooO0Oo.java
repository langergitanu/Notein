package io.ktor.utils.p616io.jvm.javaio;

import com.aspose.words.StyleIdentifier;
import io.ktor.utils.p616io.jvm.javaio.C24002OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", m80623f = "Blocking.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, 38}, m80625m = "loop")
public final class C24001OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80856OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24002OooO0o0.OooO00o f80857OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80858OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24002OooO0o0.OooO00o f80859OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24001OooO0Oo(C24002OooO0o0.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f80859OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f80856OooOo = obj;
        this.f80858OooOoO |= Integer.MIN_VALUE;
        return this.f80859OooOoO0.OooO00o(this);
    }
}
