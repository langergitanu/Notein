package oOo00OoO;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: renamed from: oOo00OoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, m80612d2 = {"LoOo00OoO/OooO;", "LoOo00OoO/OooOoO;", "delegate", "<init>", "(LoOo00OoO/OooOoO;)V", "LoOo00OoO/OooO0Oo;", "source", "", "byteCount", "LoO00ooO/OooOooO;", "write", "(LoOo00OoO/OooO0Oo;J)V", "flush", "()V", "LoOo00OoO/OooOoo;", "timeout", "()LoOo00OoO/OooOoo;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()LoOo00OoO/OooOoO;", "LoOo00OoO/OooOoO;", "okio"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class AbstractC34520OooO implements InterfaceC34544OooOoO {
    private final InterfaceC34544OooOoO delegate;

    public AbstractC34520OooO(InterfaceC34544OooOoO delegate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final InterfaceC34544OooOoO getDelegate() {
        return this.delegate;
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC34544OooOoO delegate() {
        return this.delegate;
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public C34547OooOoo timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public void write(C34524OooO0Oo source, long byteCount) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        this.delegate.write(source, byteCount);
    }
}
