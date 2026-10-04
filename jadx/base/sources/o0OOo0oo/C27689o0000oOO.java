package o0OOo0oo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.TemplateBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {546}, m80625m = "packMetaOnly-gIAlu-s")
public final class C27689o0000oOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97550OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f97551OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97552OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27685o0000o0O f97553OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27689o0000oOO(C27685o0000o0O c27685o0000o0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97553OooOoO0 = c27685o0000o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97550OooOo = obj;
        this.f97552OooOoO |= Integer.MIN_VALUE;
        Object objOooO00o = this.f97553OooOoO0.OooO00o(null, this);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : new C32445OooOOOO(objOooO00o);
    }
}
