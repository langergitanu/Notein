package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18323q5;
import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18323q5 implements InterfaceC18159e7 {

    /* JADX INFO: renamed from: e */
    public static final String f55946e = "OnlyConnectCall";

    /* JADX INFO: renamed from: a */
    public final C18118b8 f55947a;

    /* JADX INFO: renamed from: b */
    public final C18160e8 f55948b;

    /* JADX INFO: renamed from: c */
    public C18175f9 f55949c;

    /* JADX INFO: renamed from: d */
    public final C18287n9 f55950d;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q5$a */
    public class a implements InterfaceC18429y7 {
        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18429y7
        public C18188g8 intercept(InterfaceC18429y7.a aVar) throws IOException {
            C18323q5.this.f55949c = ((C18379u9) aVar).m79652e();
            return new C18188g8.a().m78598a(C18323q5.this.f55948b).m78595a(200).m78597a(EnumC18132c8.HTTP_1_1).m78603a("connect success").m78600a(AbstractC18202h8.m78683a(C18442z7.m80033a("text/plain; charset=UTF-8"), "connect success")).m78605a();
        }
    }

    public C18323q5(C18118b8 c18118b8, C18160e8 c18160e8) {
        this.f55947a = c18118b8;
        this.f55948b = c18160e8;
        this.f55950d = new C18287n9(c18118b8, this);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m79414b(Method method) {
        method.setAccessible(false);
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public void cancel() {
        this.f55950d.cancel();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC18159e7 m80720clone() {
        return new C18323q5(this.f55947a, this.f55948b);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public void enqueue(InterfaceC18173f7 interfaceC18173f7) {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18188g8 execute() throws IOException {
        try {
            this.f55950d.callStart();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C18418x9(this.f55947a));
            arrayList.add(new C18147d9(this.f55947a));
            arrayList.add(new a());
            try {
                C18188g8 c18188g8Mo79643a = new C18379u9(arrayList, this.f55950d, null, 0, this.f55948b, this, this.f55947a.m77944e(), this.f55947a.m77964y(), this.f55947a.m77934C()).mo79643a(this.f55948b);
                this.f55950d.noMoreExchanges(null);
                Class<?> cls = this.f55950d.getClass();
                Class cls2 = Boolean.TYPE;
                final Method declaredMethod = cls.getDeclaredMethod("exchangeMessageDone", C18175f9.class, cls2, cls2, IOException.class);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: o0oO0Ooo.OooO0o
                    @Override // java.security.PrivilegedAction
                    public final Object run() {
                        return C18323q5.m79413a(declaredMethod);
                    }
                });
                C18287n9 c18287n9 = this.f55950d;
                C18175f9 c18175f9 = this.f55949c;
                Boolean bool = Boolean.TRUE;
                declaredMethod.invoke(c18287n9, c18175f9, bool, bool, null);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: o0oO0Ooo.OooO0oO
                    @Override // java.security.PrivilegedAction
                    public final Object run() {
                        return C18323q5.m79414b(declaredMethod);
                    }
                });
                return c18188g8Mo79643a;
            } catch (IOException e) {
                throw e;
            } catch (Throwable th) {
                th = th;
                throw new IOException("connect host error", th);
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public boolean isCanceled() {
        return this.f55950d.isCanceled();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public synchronized boolean isExecuted() {
        return false;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18160e8 request() {
        return this.f55948b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7
    public C18248kc timeout() {
        return this.f55950d.timeout();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m79413a(Method method) {
        method.setAccessible(true);
        return null;
    }
}
