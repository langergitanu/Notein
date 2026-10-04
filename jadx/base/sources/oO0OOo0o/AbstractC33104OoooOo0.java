package oO0OOo0o;

import com.google.common.base.MoreObjects;

/* JADX INFO: renamed from: oO0OOo0o.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33104OoooOo0<ReqT, RespT> extends OooO0o<ReqT, RespT> {
    @Override // oO0OOo0o.OooO0o
    public void cancel(String str, Throwable th) {
        delegate().cancel(str, th);
    }

    public abstract OooO0o<?, ?> delegate();

    @Override // oO0OOo0o.OooO0o
    public C33058OooO00o getAttributes() {
        return delegate().getAttributes();
    }

    @Override // oO0OOo0o.OooO0o
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // oO0OOo0o.OooO0o
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // oO0OOo0o.OooO0o
    public void request(int i) {
        delegate().request(i);
    }

    @Override // oO0OOo0o.OooO0o
    public void setMessageCompression(boolean z) {
        delegate().setMessageCompression(z);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", delegate()).toString();
    }
}
