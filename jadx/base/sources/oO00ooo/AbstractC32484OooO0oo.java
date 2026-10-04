package oO00ooo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOO0;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m80612d2 = {"LoO00ooo/OooO0oo;", "LoO00ooo/OooO0oO;", "Lkotlin/jvm/internal/OooOO0;", "", "", "arity", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(ILkotlin/coroutines/Continuation;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractC32484OooO0oo extends AbstractC32483OooO0oO implements OooOO0<Object> {
    private final int arity;

    public AbstractC32484OooO0oo(int i, Continuation<Object> continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.OooOO0
    public int getArity() {
        return this.arity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strOooO = C24035Oooo00o.f80943OooO00o.OooO(this);
        OooOOO0.OooO0o(strOooO, "renderLambdaToString(...)");
        return strOooO;
    }

    public AbstractC32484OooO0oo(int i) {
        this(i, null);
    }
}
