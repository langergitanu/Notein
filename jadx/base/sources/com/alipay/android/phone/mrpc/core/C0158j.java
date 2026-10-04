package com.alipay.android.phone.mrpc.core;

import com.hihonor.honorid.core.data.DeviceInfo;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0158j extends AbstractC0139a {

    /* JADX INFO: renamed from: g */
    public InterfaceC0155g f64g;

    public C0158j(InterfaceC0155g interfaceC0155g, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.f64g = interfaceC0155g;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0170v
    /* JADX INFO: renamed from: a */
    public final Object mo70a() {
        C0163o c0163o = new C0163o(this.f64g.mo64a());
        c0163o.m87a(this.f33b);
        c0163o.m83a(this.f36e);
        c0163o.m86a(this.f37f);
        c0163o.m84a("id", String.valueOf(this.f35d));
        c0163o.m84a("operationType", this.f34c);
        c0163o.m84a("gzip", String.valueOf(this.f64g.mo67d()));
        c0163o.m85a(new BasicHeader(DeviceInfo.TAG_UUID, UUID.randomUUID().toString()));
        List<Header> listM48b = this.f64g.mo66c().m48b();
        if (listM48b != null && !listM48b.isEmpty()) {
            Iterator<Header> it = listM48b.iterator();
            while (it.hasNext()) {
                c0163o.m85a(it.next());
            }
        }
        Thread.currentThread().getId();
        c0163o.toString();
        try {
            C0169u c0169u = this.f64g.mo65b().mo50a(c0163o).get();
            if (c0169u != null) {
                return c0169u.m118b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (CancellationException e2) {
            throw new RpcException(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e3);
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
