package oO00OOoO;

import androidx.fragment.app.C21904OooOoo0;
import io.ktor.utils.p616io.o00oO0O;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0<TSubject, TContext> extends AbstractC32246OooO0o0<TSubject, TContext> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, TContext>, TSubject, Continuation<? super C32460OooOooO>, Object>> f115821OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TSubject f115822OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f115823OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Continuation<TSubject>[] f115824OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f115825OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f115826OooOoo0;

    public static final class OooO00o implements Continuation<C32460OooOooO>, InterfaceC32480OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0<TSubject, TContext> f115827OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f115828OooOo0o = Integer.MIN_VALUE;

        public OooO00o(OooOO0<TSubject, TContext> oooOO02) {
            this.f115827OooOo = oooOO02;
        }

        @Override // oO00ooo.InterfaceC32480OooO0Oo
        public final InterfaceC32480OooO0Oo getCallerFrame() {
            Continuation<TSubject> continuation = C32240OooO.f115798OooOo0o;
            int i = this.f115828OooOo0o;
            OooOO0<TSubject, TContext> oooOO02 = this.f115827OooOo;
            if (i == Integer.MIN_VALUE) {
                this.f115828OooOo0o = oooOO02.f115826OooOoo0;
            }
            int i2 = this.f115828OooOo0o;
            if (i2 < 0) {
                this.f115828OooOo0o = Integer.MIN_VALUE;
                continuation = null;
            } else {
                try {
                    Continuation<TSubject> continuation2 = oooOO02.f115824OooOoOO[i2];
                    if (continuation2 != null) {
                        this.f115828OooOo0o = i2 - 1;
                        continuation = continuation2;
                    }
                } catch (Throwable unused) {
                }
            }
            if (continuation instanceof InterfaceC32480OooO0Oo) {
                return (InterfaceC32480OooO0Oo) continuation;
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public final InterfaceC34415OooO0oo getContext() {
            InterfaceC34415OooO0oo context;
            OooOO0<TSubject, TContext> oooOO02 = this.f115827OooOo;
            Continuation<TSubject> continuation = oooOO02.f115824OooOoOO[oooOO02.f115826OooOoo0];
            if (continuation == null || (context = continuation.getContext()) == null) {
                throw new IllegalStateException("Not started");
            }
            return context;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            boolean z = obj instanceof C32445OooOOOO.OooO00o;
            OooOO0<TSubject, TContext> oooOO02 = this.f115827OooOo;
            if (!z) {
                oooOO02.OooO0o(false);
                return;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
            OooOOO0.OooO0Oo(thOooO00o);
            oooOO02.OooO0oO(C32446OooOOOo.OooO00o(thOooO00o));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0(TSubject initial, TContext context, List<? extends InterfaceC32510OooOOo0<? super AbstractC32246OooO0o0<TSubject, TContext>, ? super TSubject, ? super Continuation<? super C32460OooOooO>, ? extends Object>> blocks) {
        super(context);
        OooOOO0.OooO0oO(initial, "initial");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(blocks, "blocks");
        this.f115821OooOo = blocks;
        this.f115823OooOoO0 = new OooO00o(this);
        this.f115822OooOoO = initial;
        this.f115824OooOoOO = new Continuation[blocks.size()];
        this.f115826OooOoo0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO00o(Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        this.f115825OooOoo = 0;
        if (this.f115821OooOo.size() == 0) {
            return obj;
        }
        OooOOO0.OooO0oO(obj, "<set-?>");
        this.f115822OooOoO = obj;
        if (this.f115826OooOoo0 < 0) {
            return OooO0Oo(abstractC32479OooO0OO);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final TSubject OooO0O0() {
        return this.f115822OooOoO;
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO0Oo(Continuation<? super TSubject> frame) {
        Object obj;
        if (this.f115825OooOoo == this.f115821OooOo.size()) {
            obj = this.f115822OooOoO;
        } else {
            Continuation<TSubject> continuationOooO0o0 = C21904OooOoo0.OooO0o0(frame);
            int i = this.f115826OooOoo0 + 1;
            this.f115826OooOoo0 = i;
            Continuation<TSubject>[] continuationArr = this.f115824OooOoOO;
            continuationArr[i] = continuationOooO0o0;
            if (OooO0o(true)) {
                int i2 = this.f115826OooOoo0;
                if (i2 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f115826OooOoo0 = i2 - 1;
                continuationArr[i2] = null;
                obj = this.f115822OooOoO;
            } else {
                obj = EnumC32485OooO00o.f116726OooOo0o;
            }
        }
        if (obj == EnumC32485OooO00o.f116726OooOo0o) {
            OooOOO0.OooO0oO(frame, "frame");
        }
        return obj;
    }

    public final boolean OooO0o(boolean z) {
        int i;
        List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, TContext>, TSubject, Continuation<? super C32460OooOooO>, Object>> list;
        do {
            i = this.f115825OooOoo;
            list = this.f115821OooOo;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                OooO0oO(this.f115822OooOoO);
                return false;
            }
            this.f115825OooOoo = i + 1;
            try {
            } catch (Throwable th) {
                OooO0oO(C32446OooOOOo.OooO00o(th));
                return false;
            }
        } while (list.get(i).invoke(this, this.f115822OooOoO, this.f115823OooOoO0) != EnumC32485OooO00o.f116726OooOo0o);
        return false;
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO0o0(TSubject tsubject, Continuation<? super TSubject> continuation) {
        OooOOO0.OooO0oO(tsubject, "<set-?>");
        this.f115822OooOoO = tsubject;
        return OooO0Oo(continuation);
    }

    public final void OooO0oO(Object obj) {
        Throwable thOooO0O0;
        int i = this.f115826OooOoo0;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<TSubject>[] continuationArr = this.f115824OooOoOO;
        Continuation<TSubject> continuation = continuationArr[i];
        OooOOO0.OooO0Oo(continuation);
        int i2 = this.f115826OooOoo0;
        this.f115826OooOoo0 = i2 - 1;
        continuationArr[i2] = null;
        if (!(obj instanceof C32445OooOOOO.OooO00o)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        OooOOO0.OooO0Oo(thOooO00o);
        try {
            Throwable cause = thOooO00o.getCause();
            if (cause != null && !OooOOO0.OooO0O0(thOooO00o.getCause(), cause) && (thOooO0O0 = o00oO0O.OooO0O0(thOooO00o, cause)) != null) {
                thOooO0O0.setStackTrace(thOooO00o.getStackTrace());
                thOooO00o = thOooO0O0;
            }
        } catch (Throwable unused) {
        }
        continuation.resumeWith(C32446OooOOOo.OooO00o(thOooO00o));
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115823OooOoO0.getContext();
    }
}
