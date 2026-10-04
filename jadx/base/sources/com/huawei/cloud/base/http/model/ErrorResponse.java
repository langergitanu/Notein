package com.huawei.cloud.base.http.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ErrorResponse extends GenericJson {

    @Key
    private Error error;

    public static final class Error extends GenericJson {

        @Key
        private Integer code;

        @Key
        private List<Errors> errors;

        @Key
        private String message;

        public int getCode() {
            return this.code.intValue();
        }

        public List<Errors> getErrors() {
            return this.errors;
        }

        public String getMessage() {
            return this.message;
        }

        public Error setCode(int i) {
            this.code = Integer.valueOf(i);
            return this;
        }

        public Error setErrors(List<Errors> list) {
            this.errors = list;
            return this;
        }

        public Error setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public Error getError() {
        return this.error;
    }

    public ErrorResponse setError(Error error) {
        this.error = error;
        return this;
    }
}
