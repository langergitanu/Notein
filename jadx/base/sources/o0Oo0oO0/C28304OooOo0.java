package o0Oo0oO0;

import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.orion.notein.p607ui.feedback.FeedbackWorker;
import java.util.Iterator;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0oO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackWorker", m80623f = "FeedbackWorker.kt", m80624l = {73, 75}, m80625m = "uploadImages")
public final class C28304OooOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f100402OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f100403OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public UploadTask f100404OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StorageReference f100405OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f100406OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f100407OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FeedbackWorker f100408OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28304OooOo0(FeedbackWorker feedbackWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100408OooOoo0 = feedbackWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100406OooOoOO = obj;
        this.f100407OooOoo |= Integer.MIN_VALUE;
        return this.f100408OooOoo0.OooOO0(null, this);
    }
}
