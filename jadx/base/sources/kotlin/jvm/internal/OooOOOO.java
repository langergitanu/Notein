package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lkotlin/jvm/internal/OooOOOO;", "R", "Lkotlin/jvm/internal/OooOO0;", "Ljava/io/Serializable;", "", "arity", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class OooOOOO<R> implements OooOO0<R>, Serializable {
    private final int arity;

    public OooOOOO(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.OooOO0
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strOooOO0 = C24035Oooo00o.f80943OooO00o.OooOO0(this);
        OooOOO0.OooO0o(strOooOO0, "renderLambdaToString(...)");
        return strOooOO0;
    }
}
