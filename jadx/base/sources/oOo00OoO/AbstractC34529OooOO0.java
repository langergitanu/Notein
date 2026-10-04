package oOo00OoO;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: renamed from: oOo00OoO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"LoOo00OoO/OooOO0;", "LoOo00OoO/OooOoo0;", "delegate", "<init>", "(LoOo00OoO/OooOoo0;)V", "LoOo00OoO/OooO0Oo;", "sink", "", "byteCount", "read", "(LoOo00OoO/OooO0Oo;J)J", "LoOo00OoO/OooOoo;", "timeout", "()LoOo00OoO/OooOoo;", "LoO00ooO/OooOooO;", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()LoOo00OoO/OooOoo0;", "LoOo00OoO/OooOoo0;", "okio"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class AbstractC34529OooOO0 implements InterfaceC34548OooOoo0 {
    private final InterfaceC34548OooOoo0 delegate;

    public AbstractC34529OooOO0(InterfaceC34548OooOoo0 delegate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final InterfaceC34548OooOoo0 getDelegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC34548OooOoo0 delegate() {
        return this.delegate;
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public long read(C34524OooO0Oo sink, long byteCount) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        return this.delegate.read(sink, byteCount);
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public C34547OooOoo timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
