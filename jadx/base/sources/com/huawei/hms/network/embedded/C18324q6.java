package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.SubmitAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18324q6 extends SubmitAdapter.Factory {

    /* JADX INFO: renamed from: a */
    public Executor f55952a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6$a */
    public class a extends SubmitAdapter<Object, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f55953a;

        public a(Type type) {
            this.f55953a = type;
        }

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        /* JADX INFO: renamed from: adapt */
        public Object adapt2(Submit<Object> submit) {
            C18324q6 c18324q6 = C18324q6.this;
            return c18324q6.new b(submit, c18324q6.f55952a);
        }

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        public Type responseType() {
            return this.f55953a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6$b */
    public class b<T> extends Submit<T> {

        /* JADX INFO: renamed from: d */
        public static final String f55955d = "ExecutorSubmit";

        /* JADX INFO: renamed from: a */
        public Submit<T> f55956a;

        /* JADX INFO: renamed from: b */
        public Executor f55957b;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6$b$a */
        public class a extends Callback<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callback f55959a;

            /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6$b$a$a, reason: collision with other inner class name */
            public class RunnableC19118a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Submit f55961a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Response f55962b;

                public RunnableC19118a(Submit submit, Response response) {
                    this.f55961a = submit;
                    this.f55962b = response;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.isCanceled()) {
                        a.this.f55959a.onFailure(this.f55961a, C18127c3.m78085a("Canceled"));
                        return;
                    }
                    try {
                        a.this.f55959a.onResponse(this.f55961a, this.f55962b);
                    } catch (IOException unused) {
                        Logger.m76967w(b.f55955d, "ExecutorSubmit callback onResponse catch IOException");
                    }
                }
            }

            /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q6$b$a$b, reason: collision with other inner class name */
            public class RunnableC19119b implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Submit f55964a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Throwable f55965b;

                public RunnableC19119b(Submit submit, Throwable th) {
                    this.f55964a = submit;
                    this.f55965b = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f55959a.onFailure(this.f55964a, this.f55965b);
                }
            }

            public a(Callback callback) {
                this.f55959a = callback;
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onFailure(Submit<T> submit, Throwable th) {
                b.this.f55957b.execute(new RunnableC19119b(submit, th));
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onResponse(Submit<T> submit, Response<T> response) {
                b.this.f55957b.execute(new RunnableC19118a(submit, response));
            }
        }

        public b(Submit<T> submit, Executor executor) {
            this.f55956a = submit;
            this.f55957b = executor;
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void cancel() {
            this.f55956a.cancel();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        /* JADX INFO: renamed from: clone */
        public Submit mo80715clone() {
            return C18324q6.this.new b(this.f55956a, this.f55957b);
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void enqueue(Callback<T> callback) {
            this.f55956a.enqueue(new a(callback));
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Response<T> execute() throws IOException {
            return this.f55956a.execute();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public RequestFinishedInfo getRequestFinishedInfo() {
            return this.f55956a.getRequestFinishedInfo();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isCanceled() {
            return this.f55956a.isCanceled();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isExecuted() {
            return this.f55956a.isExecuted();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Request request() throws IOException {
            return this.f55956a.request();
        }
    }

    public C18324q6(Executor executor) {
        this.f55952a = executor;
    }

    @Override // com.huawei.hms.network.restclient.SubmitAdapter.Factory
    public SubmitAdapter<?, ?> get(Type type, Annotation[] annotationArr, RestClient restClient) {
        return new a(TypeUtils.getSubmitResponseType(type));
    }
}
