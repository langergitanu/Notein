package oO0O0OOo;

import java.nio.channels.Selector;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0O0OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.selector.ActorSelectorManager", m80623f = "ActorSelectorManager.kt", m80624l = {205}, m80625m = "select")
public final class C32658OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Selector f117356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32654OooO0O0 f117357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C32654OooO0O0 f117358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f117359OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f117360OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32658OooO0o0(C32654OooO0O0 c32654OooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f117358OooOoO = c32654OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f117359OooOoO0 = obj;
        this.f117360OooOoOO |= Integer.MIN_VALUE;
        return this.f117358OooOoO.o00Oo0(null, this);
    }
}
