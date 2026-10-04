package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00O0O0o.C24835OooO0o0;
import o00O0O0o.C24836OooO0oO;
import o00O0O0o.OooOO0;
import o00O0o00.AbstractC24926OooO00o;
import o00O0o00.C24932OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C24932OooO0OO<ListenableWorker.OooO00o> f66660OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33671o00oO0o f66661OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33874OooO0OO f66662OooOooO;

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f66660OooOoo.f84573OooOo0o instanceof AbstractC24926OooO00o.OooO0O0) {
                CoroutineWorker.this.f66661OooOoo0.cancel((CancellationException) null);
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m80623f = "CoroutineWorker.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f66664OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooOO0 f66665OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f66666OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooOO0<C24836OooO0oO> f66667OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0<C24836OooO0oO> oooOO02, CoroutineWorker coroutineWorker, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f66667OooOoO0 = oooOO02;
            this.f66666OooOoO = coroutineWorker;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f66667OooOoO0, this.f66666OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f66664OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f66665OooOo0o = this.f66667OooOoO0;
                this.f66664OooOo = 1;
                this.f66666OooOoO.getClass();
                throw new IllegalStateException("Not implemented");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OooOO0 oooOO02 = this.f66665OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oooOO02.f84254OooOo0o.OooO((R) obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        OooOOO0.OooO0oO(appContext, "appContext");
        OooOOO0.OooO0oO(params, "params");
        this.f66661OooOoo0 = oO00o00.OooO0OO.OooO00o();
        C24932OooO0OO<ListenableWorker.OooO00o> c24932OooO0OO = new C24932OooO0OO<>();
        this.f66660OooOoo = c24932OooO0OO;
        c24932OooO0OO.addListener(new OooO00o(), this.f66668OooOo.f66694OooO0Oo.f87293OooO00o);
        this.f66662OooOooO = C33649OoooOOo.f121328OooO00o;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<C24836OooO0oO> OooO00o() {
        C33671o00oO0o c33671o00oO0oOooO00o = oO00o00.OooO0OO.OooO00o();
        C33874OooO0OO c33874OooO0OO = this.f66662OooOooO;
        c33874OooO0OO.getClass();
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO00o.OooO00o(c33874OooO0OO, c33671o00oO0oOooO00o));
        OooOO0 oooOO02 = new OooOO0(c33671o00oO0oOooO00o);
        C33609OooO0oo.OooO0OO(c33822OooO0OOOooO00o, null, null, new OooO0O0(oooOO02, this, null), 3);
        return oooOO02;
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0OO() {
        this.f66660OooOoo.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final C24932OooO0OO OooO0o0() {
        C33671o00oO0o c33671o00oO0o = this.f66661OooOoo0;
        C33874OooO0OO c33874OooO0OO = this.f66662OooOooO;
        c33874OooO0OO.getClass();
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33874OooO0OO, c33671o00oO0o)), null, null, new C24835OooO0o0(this, null), 3);
        return this.f66660OooOoo;
    }

    public abstract Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO);
}
