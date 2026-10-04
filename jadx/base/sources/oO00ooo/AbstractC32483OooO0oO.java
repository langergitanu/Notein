package oO00ooo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m80612d2 = {"LoO00ooo/OooO0oO;", "LoO00ooo/OooO00o;", "Lkotlin/coroutines/Continuation;", "", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "LoOo0000O/OooO0oo;", "getContext", "()LoOo0000O/OooO0oo;", "context", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractC32483OooO0oO extends AbstractC32477OooO00o {
    public AbstractC32483OooO0oO(Continuation<Object> continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != oOo0000O.OooO.f123416OooOo0o) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC34415OooO0oo getContext() {
        return oOo0000O.OooO.f123416OooOo0o;
    }
}
