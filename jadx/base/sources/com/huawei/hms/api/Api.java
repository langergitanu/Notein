package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Api<O extends ApiOptions> {

    /* JADX INFO: renamed from: a */
    private final String f52396a;

    /* JADX INFO: renamed from: b */
    private final Options<O> f52397b;
    public List<ConnectionPostProcessor> mConnetctPostList;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class Options<O> {
        public List<PermissionInfo> getPermissionInfoList(O o2) {
            return Collections.EMPTY_LIST;
        }

        public List<Scope> getScopeList(O o2) {
            return Collections.EMPTY_LIST;
        }
    }

    public Api(String str) {
        this.f52396a = str;
        this.f52397b = null;
    }

    public String getApiName() {
        return this.f52396a;
    }

    public Options<O> getOptions() {
        return this.f52397b;
    }

    public List<ConnectionPostProcessor> getmConnetctPostList() {
        return this.mConnetctPostList;
    }

    public void setmConnetctPostList(List<ConnectionPostProcessor> list) {
        this.mConnetctPostList = list;
    }

    public Api(String str, Options<O> options) {
        this.f52396a = str;
        this.f52397b = options;
    }
}
