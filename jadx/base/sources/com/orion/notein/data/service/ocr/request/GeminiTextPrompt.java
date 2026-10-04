package com.orion.notein.data.service.ocr.request;

import OooOoo.C20593OooO0Oo;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/data/service/ocr/request/GeminiTextPrompt;", "", FirebaseAnalytics.Param.CONTENT, "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GeminiTextPrompt {
    private final String content;

    public GeminiTextPrompt(String content) {
        OooOOO0.OooO0oO(content, "content");
        this.content = content;
    }

    public static /* synthetic */ GeminiTextPrompt copy$default(GeminiTextPrompt geminiTextPrompt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geminiTextPrompt.content;
        }
        return geminiTextPrompt.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final GeminiTextPrompt copy(String content) {
        OooOOO0.OooO0oO(content, "content");
        return new GeminiTextPrompt(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GeminiTextPrompt) && OooOOO0.OooO0O0(this.content, ((GeminiTextPrompt) other).content);
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return C20593OooO0Oo.OooO0O0("GeminiTextPrompt(content=", this.content, ")");
    }
}
