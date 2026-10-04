package com.huawei.hms.network.embedded;

import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.SubmitAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18311p6 extends SubmitAdapter.Factory {

    /* JADX INFO: renamed from: a */
    public static final SubmitAdapter.Factory f55880a = new C18311p6();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.p6$a */
    public class a extends SubmitAdapter<Object, Submit<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f55881a;

        public a(Type type) {
            this.f55881a = type;
        }

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        /* JADX INFO: renamed from: adapt, reason: merged with bridge method [inline-methods] */
        public Submit<?> adapt2(Submit<Object> submit) {
            return submit;
        }

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        public Type responseType() {
            return this.f55881a;
        }
    }

    @Override // com.huawei.hms.network.restclient.SubmitAdapter.Factory
    public SubmitAdapter<?, ?> get(Type type, Annotation[] annotationArr, RestClient restClient) {
        return new a(TypeUtils.getSubmitResponseType(type));
    }
}
