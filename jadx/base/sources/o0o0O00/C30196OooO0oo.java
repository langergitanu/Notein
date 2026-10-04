package o0o0O00;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0O00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener", m80623f = "DefaultFABActionListener.kt", m80624l = {93}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30196OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30191OooO0oO f107535OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107536OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107537OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30196OooO0oo(C30191OooO0oO c30191OooO0oO, Continuation<? super C30196OooO0oo> continuation) {
        super(continuation);
        this.f107535OooOo = c30191OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f107536OooOo0o = obj;
        this.f107537OooOoO0 |= Integer.MIN_VALUE;
        return C30191OooO0oO.OooOOO0(this.f107535OooOo, 0, this);
    }
}
