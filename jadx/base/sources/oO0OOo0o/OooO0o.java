package oO0OOo0o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0o<ReqT, RespT> {

    public static abstract class OooO00o<T> {
        public void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
        }

        public void onHeaders(C33094OoooO c33094OoooO) {
        }

        public void onMessage(T t) {
        }

        public void onReady() {
        }
    }

    public abstract void cancel(String str, Throwable th);

    public C33058OooO00o getAttributes() {
        return C33058OooO00o.f119518OooO0O0;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i);

    public abstract void sendMessage(ReqT reqt);

    public void setMessageCompression(boolean z) {
    }

    public abstract void start(OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO);
}
