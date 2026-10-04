package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.b */
/* JADX INFO: loaded from: classes7.dex */
final class C16308b extends AbstractC16325bq {

    /* JADX INFO: renamed from: a */
    private String f51455a;

    /* JADX INFO: renamed from: b */
    private AbstractC16355y f51456b;

    @Override // com.google.android.play.core.integrity.AbstractC16325bq
    /* JADX INFO: renamed from: a */
    public final AbstractC16325bq mo74955a(AbstractC16355y abstractC16355y) {
        this.f51456b = abstractC16355y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16325bq
    /* JADX INFO: renamed from: b */
    public final AbstractC16325bq mo74956b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f51455a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16325bq
    /* JADX INFO: renamed from: c */
    public final C16326br mo74957c() {
        AbstractC16355y abstractC16355y;
        String str = this.f51455a;
        if (str != null && (abstractC16355y = this.f51456b) != null) {
            return new C16326br(str, abstractC16355y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51455a == null) {
            sb.append(" token");
        }
        if (this.f51456b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
