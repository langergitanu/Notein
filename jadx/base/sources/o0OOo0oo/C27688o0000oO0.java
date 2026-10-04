package o0OOo0oo;

import androidx.core.app.FrameMetricsAggregator;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.TemplateBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {FrameMetricsAggregator.EVERY_DURATION, 521}, m80625m = "pack-0E7RQCE")
public final class C27688o0000oO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f97545OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f97546OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27685o0000o0O f97547OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97548OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97549OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27688o0000oO0(C27685o0000o0O c27685o0000o0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97547OooOoO = c27685o0000o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97548OooOoO0 = obj;
        this.f97549OooOoOO |= Integer.MIN_VALUE;
        Object objOooO0o0 = this.f97547OooOoO.OooO0o0(null, false, this);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : new C32445OooOOOO(objOooO0o0);
    }
}
