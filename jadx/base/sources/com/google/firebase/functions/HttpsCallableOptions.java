package com.google.firebase.functions;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallableOptions;", "", "limitedUseAppCheckTokens", "", "<init>", "(Z)V", "getLimitedUseAppCheckTokens", "Builder", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class HttpsCallableOptions {
    public final boolean limitedUseAppCheckTokens;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallableOptions$Builder;", "", "<init>", "()V", "limitedUseAppCheckTokens", "", "getLimitedUseAppCheckTokens", "setLimitedUseAppCheckTokens", "limitedUse", "build", "Lcom/google/firebase/functions/HttpsCallableOptions;", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Builder {
        public boolean limitedUseAppCheckTokens;

        public final HttpsCallableOptions build() {
            return new HttpsCallableOptions(this.limitedUseAppCheckTokens, null);
        }

        public final boolean getLimitedUseAppCheckTokens() {
            return this.limitedUseAppCheckTokens;
        }

        public final Builder setLimitedUseAppCheckTokens(boolean limitedUse) {
            this.limitedUseAppCheckTokens = limitedUse;
            return this;
        }
    }

    public /* synthetic */ HttpsCallableOptions(boolean z, C24018OooO0oo c24018OooO0oo) {
        this(z);
    }

    public final boolean getLimitedUseAppCheckTokens() {
        return this.limitedUseAppCheckTokens;
    }

    private HttpsCallableOptions(boolean z) {
        this.limitedUseAppCheckTokens = z;
    }
}
