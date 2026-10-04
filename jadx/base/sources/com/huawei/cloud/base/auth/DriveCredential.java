package com.huawei.cloud.base.auth;

import com.huawei.cloud.base.http.HttpExecuteInterceptor;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpUnsuccessfulResponseHandler;
import com.huawei.cloud.base.util.Clock;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Objects;
import com.huawei.cloud.base.util.Preconditions;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public class DriveCredential implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler {
    private static final Logger LOGGER = Logger.getLogger("DriveCredential");
    private String accessToken;
    private final Clock clock;
    private Long expirationTimeMilliseconds;
    private final Lock lock;
    private final AccessMethod method;
    private String unionID;

    public interface AccessMethod {
        String refreshToken() throws IOException;
    }

    public static class Builder {
        final AccessMethod method;
        private String unionID;

        public Builder(String str, AccessMethod accessMethod) {
            this.unionID = (String) Preconditions.checkNotNull(str);
            this.method = (AccessMethod) Preconditions.checkNotNull(accessMethod);
        }

        public DriveCredential build() {
            return new DriveCredential(this);
        }
    }

    private String getAccessTokenFromRequest(HttpRequest httpRequest) {
        List<String> authorizationAsList = httpRequest.getHeaders().getAuthorizationAsList();
        if (authorizationAsList == null) {
            return null;
        }
        for (String str : authorizationAsList) {
            if (str.startsWith("Bearer ")) {
                return str.substring(7);
            }
        }
        return null;
    }

    private Long getExpiresInSeconds() {
        this.lock.lock();
        try {
            Long l = this.expirationTimeMilliseconds;
            if (l != null) {
                return Long.valueOf((l.longValue() - this.clock.currentTimeMillis()) / 1000);
            }
            this.lock.unlock();
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    private DriveCredential setExpirationTimeMilliseconds(Long l) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final String getAccessToken() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpirationTimeMilliseconds() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    public String getUnionID() {
        return this.unionID;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // com.huawei.cloud.base.http.HttpUnsuccessfulResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        List<String> authorizationAsList = httpRequest.getHeaders().getAuthorizationAsList();
        if (authorizationAsList != null) {
            Iterator<String> it = authorizationAsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().startsWith("Bearer ")) {
                    if (httpResponse.getStatusCode() == 401) {
                        try {
                            this.lock.lock();
                            try {
                                if (Objects.equal(this.accessToken, getAccessTokenFromRequest(httpRequest))) {
                                    z2 = refreshToken();
                                }
                                return z2;
                            } finally {
                                this.lock.unlock();
                            }
                        } catch (IOException e) {
                            LOGGER.m75690e("unable to refresh token: " + e.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.huawei.cloud.base.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
        httpRequest.setInitializer(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:3:0x0007, B:6:0x0011, B:15:0x002b, B:11:0x001e), top: B:19:0x0007 }] */
    @Override // com.huawei.cloud.base.http.HttpExecuteInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void intercept(HttpRequest httpRequest) throws IOException {
        this.lock.lock();
        try {
            Long expiresInSeconds = getExpiresInSeconds();
            if (this.accessToken == null || (expiresInSeconds != null && expiresInSeconds.longValue() <= 60)) {
                refreshToken();
                if (this.accessToken != null) {
                    httpRequest.getHeaders().set("unionID", (Object) this.unionID);
                    httpRequest.getHeaders().setAuthorization("Bearer " + this.accessToken);
                }
            }
            this.lock.unlock();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean refreshToken() throws IOException {
        boolean z;
        this.lock.lock();
        try {
            String strRefreshToken = this.method.refreshToken();
            if (strRefreshToken == null || strRefreshToken.isEmpty()) {
                z = false;
            } else {
                this.accessToken = strRefreshToken;
                z = true;
            }
            return z;
        } finally {
            this.lock.unlock();
        }
    }

    public DriveCredential setAccessToken(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public DriveCredential setExpiresInSeconds(Long l) {
        Long lValueOf;
        if (l == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf((l.longValue() * 1000) + this.clock.currentTimeMillis());
        }
        return setExpirationTimeMilliseconds(lValueOf);
    }

    public DriveCredential(String str, AccessMethod accessMethod) {
        this(new Builder(str, accessMethod));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DriveCredential m80712clone() {
        return new DriveCredential(this.unionID, this.method).setAccessToken(this.accessToken).setExpirationTimeMilliseconds(this.expirationTimeMilliseconds);
    }

    private DriveCredential(Builder builder) {
        this.lock = new ReentrantLock();
        this.clock = Clock.SYSTEM;
        this.method = builder.method;
        this.unionID = builder.unionID;
    }
}
