package o0OOo0oo;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.NoteBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2}, m80625m = "delete-gIAlu-s")
public final class o0OoOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27671Ooooooo f97658OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97659OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f97660OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(C27671Ooooooo c27671Ooooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97658OooOo = c27671Ooooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f97659OooOo0o = obj;
        this.f97660OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO0o = this.f97658OooOo.OooO0o(null, this);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : new C32445OooOOOO(objOooO0o);
    }
}
