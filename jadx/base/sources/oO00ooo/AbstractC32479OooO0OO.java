package oO00ooo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m80612d2 = {"LoO00ooo/OooO0OO;", "LoO00ooo/OooO00o;", "Lkotlin/coroutines/Continuation;", "", "completion", "LoOo0000O/OooO0oo;", "_context", "<init>", "(Lkotlin/coroutines/Continuation;LoOo0000O/OooO0oo;)V", "(Lkotlin/coroutines/Continuation;)V", "intercepted", "()Lkotlin/coroutines/Continuation;", "LoO00ooO/OooOooO;", "releaseIntercepted", "()V", "LoOo0000O/OooO0oo;", "Lkotlin/coroutines/Continuation;", "getContext", "()LoOo0000O/OooO0oo;", "context", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractC32479OooO0OO extends AbstractC32477OooO00o {
    private final InterfaceC34415OooO0oo _context;
    private transient Continuation<Object> intercepted;

    public AbstractC32479OooO0OO(Continuation<Object> continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(continuation);
        this._context = interfaceC34415OooO0oo;
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC34415OooO0oo getContext() {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this._context;
        OooOOO0.OooO0Oo(interfaceC34415OooO0oo);
        return interfaceC34415OooO0oo;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuationO0000ooO = this.intercepted;
        if (continuationO0000ooO == null) {
            InterfaceC34412OooO0o interfaceC34412OooO0o = (InterfaceC34412OooO0o) getContext().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
            continuationO0000ooO = interfaceC34412OooO0o != null ? interfaceC34412OooO0o.o0000ooO(this) : this;
            this.intercepted = continuationO0000ooO;
        }
        return continuationO0000ooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = getContext().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
            OooOOO0.OooO0Oo(oooO0O0);
            ((InterfaceC34412OooO0o) oooO0O0).OooOOo0(continuation);
        }
        this.intercepted = C32478OooO0O0.f116719OooOo0o;
    }

    public AbstractC32479OooO0OO(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
