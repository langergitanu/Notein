package o0Oo0oO0;

import com.orion.notein.p607ui.feedback.FeedbackWorker;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0oO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackWorker", m80623f = "FeedbackWorker.kt", m80624l = {59}, m80625m = "doWork")
public final class C28303OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FeedbackWorker f100399OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100400OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f100401OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28303OooOOoo(FeedbackWorker feedbackWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100399OooOo = feedbackWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100400OooOo0o = obj;
        this.f100401OooOoO0 |= Integer.MIN_VALUE;
        return this.f100399OooOo.OooO0oo(this);
    }
}
